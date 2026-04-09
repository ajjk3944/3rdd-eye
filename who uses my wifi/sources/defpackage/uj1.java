package defpackage;

import java.math.BigInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uj1 implements cg1 {
    public final /* synthetic */ vj1 a;

    @Override // defpackage.cg1
    public final long a() {
        vj1 vj1Var = this.a;
        ck1 ck1Var = vj1Var.i;
        return (vj1Var.k * 1000000) / ck1Var.i;
    }

    @Override // defpackage.cg1
    public final bg1 b(long j) {
        vj1 vj1Var = this.a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((vj1Var.i.i * j) / 1000000);
        long j2 = vj1Var.h;
        long j3 = vj1Var.g;
        long jLongValue = bigIntegerValueOf.multiply(BigInteger.valueOf(j2 - j3)).divide(BigInteger.valueOf(vj1Var.k)).longValue() + j3;
        String str = v23.a;
        dg1 dg1Var = new dg1(j, Math.max(j3, Math.min(jLongValue - 30000, j2 - 1)));
        return new bg1(dg1Var, dg1Var);
    }

    @Override // defpackage.cg1
    public final boolean d() {
        return true;
    }
}
