package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wi0 extends vu implements u60 {

    /* renamed from: a, reason: collision with root package name */
    public xj0 f18028a;

    /* renamed from: b, reason: collision with root package name */
    public m8.s f18029b;

    /* renamed from: c, reason: collision with root package name */
    public aw f18030c;

    @Override // com.google.android.gms.internal.ads.wu
    public final synchronized void E(vb.a aVar) {
        xj0 xj0Var = this.f18028a;
        if (xj0Var != null) {
            xj0Var.f18400a.z1();
        }
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final synchronized void L2(vb.a aVar, int i4) {
        m8.s sVar = this.f18029b;
        if (sVar != null) {
            sVar.e(i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final synchronized void T0(vb.a aVar) {
        xj0 xj0Var = this.f18028a;
        if (xj0Var != null) {
            xj0Var.f18403d.E(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final synchronized void V1(vb.a aVar) {
        xj0 xj0Var = this.f18028a;
        if (xj0Var != null) {
            xj0Var.f18403d.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final synchronized void Z(vb.a aVar) {
        aw awVar = this.f18030c;
        if (awVar != null) {
            ci0 ci0Var = (ci0) awVar.f9453d;
            ((sj0) awVar.f9454e).f16025c.execute(new d1((dq0) awVar.f9451b, (wp0) awVar.f9452c, ci0Var, 8));
        }
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final synchronized void b0(vb.a aVar, int i4) {
        aw awVar = this.f18030c;
        if (awVar != null) {
            za.i.h("Fail to initialize adapter ".concat(String.valueOf(((ci0) awVar.f9453d).f10134a)));
        }
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final synchronized void o(vb.a aVar) {
        m8.s sVar = this.f18029b;
        if (sVar != null) {
            sVar.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final synchronized void o2(vb.a aVar, xu xuVar) {
        xj0 xj0Var = this.f18028a;
        if (xj0Var != null) {
            xj0Var.f18403d.E(xuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final synchronized void q0(vb.a aVar) {
        xj0 xj0Var = this.f18028a;
        if (xj0Var != null) {
            xj0Var.f18402c.p1(k60.g);
        }
    }

    @Override // com.google.android.gms.internal.ads.u60
    public final synchronized void r2(m8.s sVar) {
        this.f18029b = sVar;
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final synchronized void t3(vb.a aVar) {
        xj0 xj0Var = this.f18028a;
        if (xj0Var != null) {
            xj0Var.f18401b.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final synchronized void v(vb.a aVar) {
        xj0 xj0Var = this.f18028a;
        if (xj0Var != null) {
            xj0Var.f18402c.v1();
        }
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final synchronized void y2(vb.a aVar) {
        xj0 xj0Var = this.f18028a;
        if (xj0Var != null) {
            xj0Var.y2(aVar);
        }
    }
}
