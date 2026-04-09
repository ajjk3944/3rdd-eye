package I;

import l0.AbstractC6532h;
import l0.C6531g;
import l0.C6533i;

/* loaded from: classes.dex */
public abstract class m1 {
    public static final long a(long j10, C6533i c6533i) {
        return AbstractC6532h.a(C6531g.m(j10) < c6533i.k() ? c6533i.k() : C6531g.m(j10) > c6533i.l() ? c6533i.l() : C6531g.m(j10), C6531g.n(j10) < c6533i.n() ? c6533i.n() : C6531g.n(j10) > c6533i.e() ? c6533i.e() : C6531g.n(j10));
    }

    public static final long b(l1 l1Var, long j10) {
        C6531g c6531gD;
        C0.r rVarJ = l1Var.j();
        if (rVarJ == null) {
            return j10;
        }
        C0.r rVarE = l1Var.e();
        if (rVarE != null) {
            c6531gD = C6531g.d((rVarJ.M() && rVarE.M()) ? rVarJ.b0(rVarE, j10) : j10);
        } else {
            c6531gD = null;
        }
        return c6531gD != null ? c6531gD.v() : j10;
    }

    public static final long c(l1 l1Var, long j10) {
        C0.r rVarJ = l1Var.j();
        if (rVarJ == null) {
            return j10;
        }
        C6531g c6531gD = null;
        if (!rVarJ.M()) {
            rVarJ = null;
        }
        if (rVarJ == null) {
            return j10;
        }
        C0.r rVarD = l1Var.d();
        if (rVarD != null) {
            if (!rVarD.M()) {
                rVarD = null;
            }
            if (rVarD != null) {
                c6531gD = C6531g.d(rVarD.b0(rVarJ, j10));
            }
        }
        return c6531gD != null ? c6531gD.v() : j10;
    }

    public static final long d(l1 l1Var, long j10) {
        C0.r rVarE = l1Var.e();
        return (rVarE == null || !rVarE.M()) ? j10 : rVarE.W(j10);
    }
}
