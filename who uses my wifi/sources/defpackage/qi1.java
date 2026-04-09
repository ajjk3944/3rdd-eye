package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qi1 implements ui1, cg1 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;
    public final long j;

    public qi1(int i, int i2, long j, long j2) {
        long jMax;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1L;
            jMax = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            jMax = (Math.max(0L, j3) * 8000000) / i;
        }
        this.f = jMax;
        this.g = j2;
        this.h = i;
        this.i = i2;
        this.j = j == -1 ? -1L : j;
    }

    @Override // defpackage.cg1
    public final long a() {
        return this.f;
    }

    @Override // defpackage.cg1
    public final bg1 b(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1) {
            dg1 dg1Var = new dg1(0L, j3);
            return new bg1(dg1Var, dg1Var);
        }
        int i = this.e;
        long j4 = this.c;
        long jMin = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / i;
        dg1 dg1Var2 = new dg1(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.a) {
                return new bg1(dg1Var2, new dg1((Math.max(0L, j5 - j3) * 8000000) / i, j5));
            }
        }
        return new bg1(dg1Var2, dg1Var2);
    }

    @Override // defpackage.ui1
    public final long c() {
        return this.j;
    }

    @Override // defpackage.cg1
    public final boolean d() {
        return this.d != -1;
    }

    @Override // defpackage.ui1
    public final int e() {
        return this.h;
    }

    @Override // defpackage.ui1
    public final long f(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / this.e;
    }
}
