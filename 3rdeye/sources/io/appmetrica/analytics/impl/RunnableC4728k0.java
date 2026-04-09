package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4728k0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4780m0 f41125a;

    public RunnableC4728k0(C4780m0 c4780m0) {
        this.f41125a = c4780m0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4780m0 c4780m0 = this.f41125a;
        synchronized (c4780m0) {
            if (c4780m0.f41223a != null && c4780m0.a()) {
                try {
                    c4780m0.f41226d = null;
                    c4780m0.f41223a.unbindService(c4780m0.i);
                } catch (Throwable unused) {
                }
            }
            c4780m0.f41226d = null;
        }
    }
}
