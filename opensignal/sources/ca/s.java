package ca;

/* loaded from: classes.dex */
public final class s implements u {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f3504a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f3505b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3506c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3507d;

    public s(long j, long[] jArr, long[] jArr2) {
        qb.b.g(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f3507d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f3504a = jArr;
            this.f3505b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f3504a = jArr3;
            long[] jArr4 = new long[i10];
            this.f3505b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f3506c = j;
    }

    @Override // ca.u
    public final boolean b() {
        return this.f3507d;
    }

    @Override // ca.u
    public final t d(long j) {
        if (!this.f3507d) {
            v vVar = v.f3510c;
            return new t(vVar, vVar);
        }
        long[] jArr = this.f3505b;
        int iE = qb.v.e(jArr, j, true);
        long j7 = jArr[iE];
        long[] jArr2 = this.f3504a;
        v vVar2 = new v(j7, jArr2[iE]);
        if (j7 == j || iE == jArr.length - 1) {
            return new t(vVar2, vVar2);
        }
        int i10 = iE + 1;
        return new t(vVar2, new v(jArr[i10], jArr2[i10]));
    }

    @Override // ca.u
    public final long e() {
        return this.f3506c;
    }
}
