package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ri1 implements ui1 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public ri1(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? v23.r(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair g(long j, long[] jArr, long[] jArr2) {
        int iP = v23.p(jArr, j, true);
        long j2 = jArr[iP];
        long j3 = jArr2[iP];
        int i = iP + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.cg1
    public final long a() {
        return this.c;
    }

    @Override // defpackage.cg1
    public final bg1 b(long j) {
        String str = v23.a;
        Pair pairG = g(v23.q(Math.max(0L, Math.min(j, this.c))), this.b, this.a);
        dg1 dg1Var = new dg1(v23.r(((Long) pairG.first).longValue()), ((Long) pairG.second).longValue());
        return new bg1(dg1Var, dg1Var);
    }

    @Override // defpackage.ui1
    public final long c() {
        return -1L;
    }

    @Override // defpackage.cg1
    public final boolean d() {
        return true;
    }

    @Override // defpackage.ui1
    public final int e() {
        return -2147483647;
    }

    @Override // defpackage.ui1
    public final long f(long j) {
        return v23.r(((Long) g(j, this.a, this.b).second).longValue());
    }
}
