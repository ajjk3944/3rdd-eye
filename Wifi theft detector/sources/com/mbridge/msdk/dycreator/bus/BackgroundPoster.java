package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* loaded from: classes3.dex */
final class BackgroundPoster implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f14476a = new PendingPostQueue();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f14477b;

    /* renamed from: c, reason: collision with root package name */
    private final EventBus f14478c;

    public BackgroundPoster(EventBus eventBus) {
        this.f14478c = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f14476a.a(pendingPostA);
                if (!this.f14477b) {
                    this.f14477b = true;
                    EventBus.f14479n.execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    PendingPost pendingPostA = this.f14476a.a(1000);
                    if (pendingPostA == null) {
                        synchronized (this) {
                            pendingPostA = this.f14476a.a();
                            if (pendingPostA == null) {
                                this.f14477b = false;
                                this.f14477b = false;
                                return;
                            }
                        }
                    }
                    this.f14478c.a(pendingPostA);
                } catch (InterruptedException e10) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e10);
                    this.f14477b = false;
                    return;
                }
            } catch (Throwable th) {
                this.f14477b = false;
                throw th;
            }
        }
    }
}
