package com.mbridge.msdk.dycreator.bus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes3.dex */
final class HandlerPoster extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f14499a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14500b;

    /* renamed from: c, reason: collision with root package name */
    private final EventBus f14501c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14502d;

    public HandlerPoster(EventBus eventBus, Looper looper, int i10) {
        super(looper);
        this.f14501c = eventBus;
        this.f14500b = i10;
        this.f14499a = new PendingPostQueue();
    }

    public void a(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f14499a.a(pendingPostA);
                if (!this.f14502d) {
                    this.f14502d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost pendingPostA = this.f14499a.a();
                if (pendingPostA == null) {
                    synchronized (this) {
                        pendingPostA = this.f14499a.a();
                        if (pendingPostA == null) {
                            this.f14502d = false;
                            return;
                        }
                    }
                }
                this.f14501c.a(pendingPostA);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f14500b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f14502d = true;
        } catch (Throwable th) {
            this.f14502d = false;
            throw th;
        }
    }
}
