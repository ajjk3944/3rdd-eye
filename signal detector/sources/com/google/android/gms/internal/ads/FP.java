package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class FP {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f8117g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f8118h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f8119a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f8120b;

    /* renamed from: c, reason: collision with root package name */
    public DP f8121c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f8122d;

    /* renamed from: e, reason: collision with root package name */
    public final C0494Em f8123e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8124f;

    public FP(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C0494Em c0494Em = new C0494Em();
        this.f8119a = mediaCodec;
        this.f8120b = handlerThread;
        this.f8123e = c0494Em;
        this.f8122d = new AtomicReference();
    }

    public static EP c() {
        ArrayDeque arrayDeque = f8117g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new EP();
                }
                return (EP) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        if (this.f8124f) {
            try {
                DP dp = this.f8121c;
                if (dp == null) {
                    throw null;
                }
                dp.removeCallbacksAndMessages(null);
                C0494Em c0494Em = this.f8123e;
                synchronized (c0494Em) {
                    c0494Em.f8001a = false;
                }
                DP dp2 = this.f8121c;
                if (dp2 == null) {
                    throw null;
                }
                dp2.obtainMessage(3).sendToTarget();
                c0494Em.c();
            } catch (InterruptedException e6) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e6);
            }
        }
    }

    public final void b() {
        RuntimeException runtimeException = (RuntimeException) this.f8122d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
