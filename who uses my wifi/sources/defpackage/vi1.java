package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vi1 implements ui1 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public vi1(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // defpackage.cg1
    public final long a() {
        return this.c;
    }

    @Override // defpackage.cg1
    public final bg1 b(long j) {
        long[] jArr = this.a;
        int iP = v23.p(jArr, j, true);
        long j2 = jArr[iP];
        long[] jArr2 = this.b;
        dg1 dg1Var = new dg1(j2, jArr2[iP]);
        if (j2 >= j || iP == jArr.length - 1) {
            return new bg1(dg1Var, dg1Var);
        }
        int i = iP + 1;
        return new bg1(dg1Var, new dg1(jArr[i], jArr2[i]));
    }

    @Override // defpackage.ui1
    public final long c() {
        return this.d;
    }

    @Override // defpackage.cg1
    public final boolean d() {
        return true;
    }

    @Override // defpackage.ui1
    public final int e() {
        return this.e;
    }

    @Override // defpackage.ui1
    public final long f(long j) {
        return this.a[v23.p(this.b, j, true)];
    }
}
