package j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p extends i1.m implements i2.u, i2.i {

    /* renamed from: r, reason: collision with root package name */
    public static final n f26938r = new n();

    /* renamed from: o, reason: collision with root package name */
    public i0.e f26939o;

    /* renamed from: p, reason: collision with root package name */
    public jf.c f26940p;

    /* renamed from: q, reason: collision with root package name */
    public d0.a1 f26941q;

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
        g2.s0 s0VarV = i0Var.v(j);
        return l0Var.O(s0VarV.f24408a, s0VarV.f24409b, zj.t.f38318a, new g0.s(s0VarV, 3));
    }

    @Override // i2.u
    public final /* synthetic */ int h(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.f(this, m0Var, i0Var, i4);
    }

    public final boolean p0(k kVar, int i4) {
        if (i4 == 5 || i4 == 6) {
            if (this.f26941q == d0.a1.f21663b) {
                return false;
            }
        } else if (i4 == 3 || i4 == 4) {
            if (this.f26941q == d0.a1.f21662a) {
                return false;
            }
        } else if (i4 != 1 && i4 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (q0(i4)) {
            if (kVar.f26921b >= this.f26939o.f25414a.g().f25475n - 1) {
                return false;
            }
        } else if (kVar.f26920a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean q0(int i4) {
        if (i4 == 1) {
            return false;
        }
        if (i4 == 2) {
            return true;
        }
        if (i4 == 5) {
            return false;
        }
        if (i4 == 6) {
            return true;
        }
        if (i4 == 3) {
            int iOrdinal = i2.k.s(this).A.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            throw new ac.m();
        }
        if (i4 != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int iOrdinal2 = i2.k.s(this).A.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        throw new ac.m();
    }

    @Override // i2.u
    public final /* synthetic */ int t(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.b(this, m0Var, i0Var, i4);
    }
}
