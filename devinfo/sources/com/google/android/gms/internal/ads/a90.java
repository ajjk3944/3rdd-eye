package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a90 implements xa.l, va.a {

    /* renamed from: a, reason: collision with root package name */
    public final ad0 f9283a;

    /* renamed from: b, reason: collision with root package name */
    public final yp0 f9284b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f9285c = new AtomicBoolean(false);

    public a90(ad0 ad0Var, yp0 yp0Var) {
        this.f9283a = ad0Var;
        this.f9284b = yp0Var;
    }

    @Override // xa.l
    public final void D2() {
        a();
    }

    public final void a() {
        if (this.f9285c.getAndSet(true)) {
            return;
        }
        ad0 ad0Var = this.f9283a;
        if (ad0Var.f9305b.getAndSet(false)) {
            yf0 yf0Var = ad0Var.f9304a;
            yf0Var.getClass();
            xk.x.v((cl.d) yf0Var.f18729c, null, null, new zw0(yf0Var, null, 2), 3);
        }
    }

    @Override // xa.l
    public final void e0(int i4) {
        a();
    }

    @Override // va.a
    public final void onAdClicked() {
        ad0 ad0Var = this.f9283a;
        if (ad0Var.f9305b.get()) {
            yf0 yf0Var = ad0Var.f9304a;
            yf0Var.getClass();
            xk.x.v((cl.d) yf0Var.f18729c, null, null, new zw0(yf0Var, null, 1), 3);
        }
    }

    @Override // xa.l
    public final void z1() {
        String str = this.f9284b.f18820b;
        boolean zK = yr1.k(str);
        ad0 ad0Var = this.f9283a;
        if (zK) {
            ad0Var.getClass();
            return;
        }
        if (!ad0Var.f9306c.get() || ad0Var.f9305b.getAndSet(true)) {
            return;
        }
        yf0 yf0Var = ad0Var.f9304a;
        yf0Var.getClass();
        nk.k.e(str, "gwsQueryId");
        xk.x.v((cl.d) yf0Var.f18729c, null, null, new al.p(yf0Var, str, null, 11), 3);
    }

    @Override // xa.l
    public final void T() {
    }

    @Override // xa.l
    public final void U0() {
    }

    @Override // xa.l
    public final void a2() {
    }

    @Override // xa.l
    public final void g1() {
    }

    @Override // xa.l
    public final void h3() {
    }

    @Override // xa.l
    public final void k2() {
    }

    @Override // xa.l
    public final void r0() {
    }

    @Override // xa.l
    public final void u1() {
    }
}
