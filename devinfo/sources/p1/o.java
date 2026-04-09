package p1;

import g2.s0;
import i2.d1;
import i2.u1;
import me.t1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o extends i1.m implements i2.u, u1 {

    /* renamed from: o, reason: collision with root package name */
    public mk.c f31009o;

    @Override // i2.u
    public final /* synthetic */ int L(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.d(this, m0Var, i0Var, i4);
    }

    @Override // i2.u
    public final /* synthetic */ int S(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.h(this, m0Var, i0Var, i4);
    }

    @Override // i2.u1
    public final /* synthetic */ boolean Y() {
        return false;
    }

    @Override // i2.u
    public final g2.k0 a0(g2.l0 l0Var, g2.i0 i0Var, long j) {
        s0 s0VarV = i0Var.v(j);
        return l0Var.O(s0VarV.f24408a, s0VarV.f24409b, zj.t.f38318a, new c2.w(11, s0VarV, this));
    }

    @Override // i2.u1
    public final boolean b() {
        return false;
    }

    @Override // i1.m
    public final boolean c0() {
        return false;
    }

    @Override // i2.u
    public final /* synthetic */ int h(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.f(this, m0Var, i0Var, i4);
    }

    @Override // i2.u1
    public final void l(p2.x xVar) {
        boolean z3;
        j0 j0Var;
        d1 d1VarQ = i2.k.q(this, 2);
        if (d1VarQ.F) {
            j0 j0Var2 = d1VarQ.D;
            z3 = d1VarQ.E;
            j0Var = j0Var2;
        } else {
            h0 h0Var = z.f31031a;
            if (h0Var == null) {
                z.f31031a = new h0();
            } else {
                h0Var.b();
            }
            h0 h0Var2 = z.f31031a;
            nk.k.b(h0Var2);
            h0Var2.f30976o = d1VarQ.f25610o.f25650z;
            h0Var2.f30975n = t1.F(d1VarQ.f24410c);
            g1.g gVarF = g1.r.f();
            mk.c cVarE = gVarF != null ? gVarF.e() : null;
            g1.g gVarK = g1.r.k(gVarF);
            try {
                this.f31009o.invoke(h0Var2);
                g1.r.o(gVarF, gVarK, cVarE);
                j0Var = h0Var2.f30973l;
                z3 = h0Var2.f30974m;
            } catch (Throwable th2) {
                g1.r.o(gVarF, gVarK, cVarE);
                throw th2;
            }
        }
        if (z3) {
            p2.v.b(xVar, j0Var);
        }
    }

    @Override // i2.u
    public final /* synthetic */ int t(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.b(this, m0Var, i0Var, i4);
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f31009o + ')';
    }

    @Override // i2.u1
    public final /* synthetic */ boolean v() {
        return false;
    }
}
