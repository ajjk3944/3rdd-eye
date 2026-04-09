package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pn1 implements cg1 {
    public final cm a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public pn1(cm cmVar, int i, long j, long j2) {
        this.a = cmVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / cmVar.h;
        this.d = j3;
        this.e = g(j3);
    }

    @Override // defpackage.cg1
    public final long a() {
        return this.e;
    }

    @Override // defpackage.cg1
    public final bg1 b(long j) {
        long j2 = this.b;
        cm cmVar = this.a;
        long j3 = (cmVar.g * j) / (j2 * 1000000);
        String str = v23.a;
        long j4 = this.d - 1;
        long jMax = Math.max(0L, Math.min(j3, j4));
        long j5 = cmVar.h;
        long jG = g(jMax);
        long j6 = this.c;
        dg1 dg1Var = new dg1(jG, (jMax * j5) + j6);
        if (jG >= j || jMax == j4) {
            return new bg1(dg1Var, dg1Var);
        }
        long j7 = jMax + 1;
        return new bg1(dg1Var, new dg1(g(j7), (j5 * j7) + j6));
    }

    @Override // defpackage.cg1
    public final boolean d() {
        return true;
    }

    public final long g(long j) {
        return v23.t(j * this.b, 1000000L, this.a.g, RoundingMode.DOWN);
    }
}
