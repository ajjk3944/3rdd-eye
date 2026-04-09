package u5;

import a5.d0;

/* loaded from: classes.dex */
public final class r implements x {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f23319a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f23320b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23321c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23322d;

    public r(long j, long[] jArr, long[] jArr2) {
        a5.a.e(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f23322d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f23319a = jArr;
            this.f23320b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f23319a = jArr3;
            long[] jArr4 = new long[i10];
            this.f23320b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f23321c = j;
    }

    @Override // u5.x
    public final boolean b() {
        return this.f23322d;
    }

    @Override // u5.x
    public final w d(long j) {
        if (!this.f23322d) {
            y yVar = y.f23356c;
            return new w(yVar, yVar);
        }
        long[] jArr = this.f23320b;
        int iE = d0.e(jArr, j, true);
        long j7 = jArr[iE];
        long[] jArr2 = this.f23319a;
        y yVar2 = new y(j7, jArr2[iE]);
        if (j7 == j || iE == jArr.length - 1) {
            return new w(yVar2, yVar2);
        }
        int i10 = iE + 1;
        return new w(yVar2, new y(jArr[i10], jArr2[i10]));
    }

    @Override // u5.x
    public final long e() {
        return this.f23321c;
    }
}
