package r0;

import d0.c2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v0 extends i1.m implements i2.u {

    /* renamed from: o, reason: collision with root package name */
    public e0.i f32675o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f32676p;

    /* renamed from: q, reason: collision with root package name */
    public a0.z f32677q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f32678r;

    /* renamed from: s, reason: collision with root package name */
    public a0.e f32679s;

    /* renamed from: t, reason: collision with root package name */
    public a0.e f32680t;

    /* renamed from: u, reason: collision with root package name */
    public float f32681u;

    /* renamed from: v, reason: collision with root package name */
    public float f32682v;

    @Override // i2.u
    public final /* synthetic */ int L(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.d(this, m0Var, i0Var, i4);
    }

    @Override // i2.u
    public final /* synthetic */ int S(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.h(this, m0Var, i0Var, i4);
    }

    @Override // i2.u
    public final g2.k0 a0(g2.l0 l0Var, g2.i0 i0Var, long j) {
        float fI = l0Var.I(this.f32678r ? t0.m.f34017n : ((i0Var.d(d3.a.h(j)) != 0 && i0Var.t(d3.a.g(j)) != 0) || this.f32676p) ? q0.f32633a : q0.f32634b);
        a0.e eVar = this.f32680t;
        int iFloatValue = (int) (eVar != null ? ((Number) eVar.d()).floatValue() : fI);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            d3.h.a("width and height must be >= 0");
        }
        g2.s0 s0VarV = i0Var.v(d3.b.g(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fI2 = l0Var.I((q0.f32636d - l0Var.D(fI)) / 2.0f);
        float fI3 = l0Var.I((q0.f32635c - q0.f32633a) - q0.f32637e);
        boolean z3 = this.f32678r;
        if (z3 && this.f32676p) {
            fI2 = fI3 - l0Var.I(t0.m.f34024u);
        } else if (z3 && !this.f32676p) {
            fI2 = l0Var.I(t0.m.f34024u);
        } else if (this.f32676p) {
            fI2 = fI3;
        }
        a0.e eVar2 = this.f32680t;
        ck.c cVar = null;
        Float f10 = eVar2 != null ? (Float) eVar2.f31e.getValue() : null;
        if (f10 == null || f10.floatValue() != fI) {
            xk.x.v(b0(), null, null, new u0(this, fI, cVar, 0), 3);
        }
        a0.e eVar3 = this.f32679s;
        Float f11 = eVar3 != null ? (Float) eVar3.f31e.getValue() : null;
        if (f11 == null || f11.floatValue() != fI2) {
            xk.x.v(b0(), null, null, new u0(this, fI2, cVar, 1), 3);
        }
        if (Float.isNaN(this.f32682v) && Float.isNaN(this.f32681u)) {
            this.f32682v = fI;
            this.f32681u = fI2;
        }
        return l0Var.O(iFloatValue, iFloatValue, zj.t.f38318a, new c2(s0VarV, this, fI2));
    }

    @Override // i1.m
    public final boolean c0() {
        return false;
    }

    @Override // i1.m
    public final void f0() {
        xk.x.v(b0(), null, null, new al.k(this, null, 13), 3);
    }

    @Override // i2.u
    public final /* synthetic */ int h(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.f(this, m0Var, i0Var, i4);
    }

    @Override // i2.u
    public final /* synthetic */ int t(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.b(this, m0Var, i0Var, i4);
    }
}
