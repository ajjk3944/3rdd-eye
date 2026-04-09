package v1;

import x1.f1;
import x1.n0;

/* loaded from: classes.dex */
public final class p implements m {

    /* renamed from: b, reason: collision with root package name */
    public final n0 f23804b;

    public p(n0 n0Var) {
        this.f23804b = n0Var;
    }

    @Override // v1.m
    public final f1.c B(m mVar, boolean z10) {
        return this.f23804b.f24889o.B(mVar, z10);
    }

    @Override // v1.m
    public final long a(long j) {
        return this.f23804b.f24889o.a(f1.b.e(j, c()));
    }

    @Override // v1.m
    public final long b(m mVar, long j) {
        return d(mVar, j);
    }

    public final long c() {
        n0 n0Var = this.f23804b;
        n0 n0VarX = dr.a.x(n0Var);
        return f1.b.d(d(n0VarX.f24892r, 0L), n0Var.f24889o.E0(n0VarX.f24889o, 0L));
    }

    public final long d(m mVar, long j) {
        boolean z10 = mVar instanceof p;
        n0 n0Var = this.f23804b;
        if (!z10) {
            n0 n0VarX = dr.a.x(n0Var);
            f1 f1Var = n0VarX.f24889o;
            long jD = d(n0VarX.f24892r, j);
            long j7 = n0VarX.f24890p;
            long jD2 = f1.b.d(jD, (4294967295L & Float.floatToRawIntBits((int) (j7 & 4294967295L))) | (Float.floatToRawIntBits((int) (j7 >> 32)) << 32));
            if (!f1Var.v0().f26506o) {
                u1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            f1Var.G0();
            f1 f1Var2 = f1Var.f24823q;
            if (f1Var2 != null) {
                f1Var = f1Var2;
            }
            return f1.b.e(jD2, f1Var.E0(mVar, 0L));
        }
        n0 n0Var2 = ((p) mVar).f23804b;
        f1 f1Var3 = n0Var2.f24889o;
        f1Var3.G0();
        n0 n0VarT0 = n0Var.f24889o.r0(f1Var3).t0();
        if (n0VarT0 != null) {
            long jW = i3.g.w(i3.g.A(n0Var2.n0(n0VarT0, false), ic.a.I(j)), n0Var.n0(n0VarT0, false));
            return (Float.floatToRawIntBits((int) (jW >> 32)) << 32) | (Float.floatToRawIntBits((int) (jW & 4294967295L)) & 4294967295L);
        }
        n0 n0VarX2 = dr.a.x(n0Var2);
        long jA = i3.g.A(i3.g.A(n0Var2.n0(n0VarX2, false), n0VarX2.f24890p), ic.a.I(j));
        n0 n0VarX3 = dr.a.x(n0Var);
        long jW2 = i3.g.w(jA, i3.g.A(n0Var.n0(n0VarX3, false), n0VarX3.f24890p));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jW2 >> 32));
        long jFloatToRawIntBits2 = Float.floatToRawIntBits((int) (jW2 & 4294967295L)) & 4294967295L;
        f1 f1Var4 = n0VarX3.f24889o.f24823q;
        br.l.b(f1Var4);
        f1 f1Var5 = n0VarX2.f24889o.f24823q;
        br.l.b(f1Var5);
        return f1Var4.E0(f1Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // v1.m
    public final boolean f() {
        return this.f23804b.f24889o.v0().f26506o;
    }

    @Override // v1.m
    public final long h() {
        n0 n0Var = this.f23804b;
        return (n0Var.f23809b << 32) | (n0Var.f23810c & 4294967295L);
    }

    @Override // v1.m
    public final long q(long j) {
        return this.f23804b.f24889o.q(f1.b.e(0L, c()));
    }

    @Override // v1.m
    public final m u() {
        n0 n0VarT0;
        if (!f()) {
            u1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        f1 f1Var = ((f1) this.f23804b.f24889o.f24821o.D.f823e).f24823q;
        if (f1Var == null || (n0VarT0 = f1Var.t0()) == null) {
            return null;
        }
        return n0VarT0.f24892r;
    }
}
