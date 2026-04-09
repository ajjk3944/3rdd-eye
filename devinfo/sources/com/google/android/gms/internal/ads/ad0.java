package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ad0 {

    /* renamed from: a, reason: collision with root package name */
    public final yf0 f9304a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f9305b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f9306c = new AtomicBoolean(false);

    public ad0(yf0 yf0Var) {
        this.f9304a = yf0Var;
    }

    public final void a(com.google.android.gms.internal.measurement.i4 i4Var) {
        this.f9306c.set(true);
        synchronized (i4Var.f19782c) {
            try {
                if (((dh) i4Var.f19783d) == null) {
                    i4Var.f19783d = new dh();
                }
                ((dh) i4Var.f19783d).c(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        yf0 yf0Var = this.f9304a;
        yf0Var.getClass();
        xk.x.v((cl.d) yf0Var.f18729c, null, null, new zw0(yf0Var, null, 3), 3);
    }

    public final void b() {
        if (this.f9305b.get()) {
            yf0 yf0Var = this.f9304a;
            yf0Var.getClass();
            xk.x.v((cl.d) yf0Var.f18729c, null, null, new zw0(yf0Var, null, 5), 3);
        }
    }

    public final void c() {
        if (this.f9305b.get()) {
            yf0 yf0Var = this.f9304a;
            yf0Var.getClass();
            xk.x.v((cl.d) yf0Var.f18729c, null, null, new zw0(yf0Var, null, 0), 3);
        }
    }

    public final void d() {
        if (this.f9305b.getAndSet(false)) {
            yf0 yf0Var = this.f9304a;
            yf0Var.getClass();
            xk.x.v((cl.d) yf0Var.f18729c, null, null, new zw0(yf0Var, null, 4), 3);
        }
    }
}
