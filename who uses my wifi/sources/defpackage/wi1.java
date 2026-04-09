package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wi1 implements ui1 {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public wi1(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.cg1
    public final long a() {
        return this.c;
    }

    @Override // defpackage.cg1
    public final bg1 b(long j) {
        double d;
        double d2;
        boolean zD = d();
        int i = this.b;
        long j2 = this.a;
        if (!zD) {
            dg1 dg1Var = new dg1(0L, j2 + i);
            return new bg1(dg1Var, dg1Var);
        }
        String str = v23.a;
        long j3 = this.c;
        long jMax = Math.max(0L, Math.min(j, j3));
        double d3 = (jMax * 100.0d) / j3;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i2)) + d5;
        }
        long j4 = this.e;
        dg1 dg1Var2 = new dg1(jMax, j2 + Math.max(i, Math.min(Math.round((d4 / d) * j4), j4 - 1)));
        return new bg1(dg1Var2, dg1Var2);
    }

    @Override // defpackage.ui1
    public final long c() {
        return this.f;
    }

    @Override // defpackage.cg1
    public final boolean d() {
        return this.g != null;
    }

    @Override // defpackage.ui1
    public final int e() {
        return this.d;
    }

    @Override // defpackage.ui1
    public final long f(long j) {
        if (!d()) {
            return 0L;
        }
        long j2 = j - this.a;
        if (j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.e;
        int iP = v23.p(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (iP * j3) / 100;
        long j5 = jArr[iP];
        int i = iP + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (iP == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }
}
