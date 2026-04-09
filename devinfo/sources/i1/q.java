package i1;

import c2.w;
import g2.i0;
import g2.k0;
import g2.l0;
import g2.s0;
import i2.m0;
import i2.u;
import zj.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q extends m implements u {

    /* renamed from: o, reason: collision with root package name */
    public float f25566o;

    @Override // i2.u
    public final /* synthetic */ int L(m0 m0Var, i0 i0Var, int i4) {
        return d.h.d(this, m0Var, i0Var, i4);
    }

    @Override // i2.u
    public final /* synthetic */ int S(m0 m0Var, i0 i0Var, int i4) {
        return d.h.h(this, m0Var, i0Var, i4);
    }

    @Override // i2.u
    public final k0 a0(l0 l0Var, i0 i0Var, long j) {
        s0 s0VarV = i0Var.v(j);
        return l0Var.O(s0VarV.f24408a, s0VarV.f24409b, t.f38318a, new w(2, s0VarV, this));
    }

    @Override // i2.u
    public final /* synthetic */ int h(m0 m0Var, i0 i0Var, int i4) {
        return d.h.f(this, m0Var, i0Var, i4);
    }

    @Override // i2.u
    public final /* synthetic */ int t(m0 m0Var, i0 i0Var, int i4) {
        return d.h.b(this, m0Var, i0Var, i4);
    }

    public final String toString() {
        return r5.c.k(new StringBuilder("ZIndexModifier(zIndex="), this.f25566o, ')');
    }
}
