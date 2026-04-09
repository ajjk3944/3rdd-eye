package k6;

import a5.d0;
import u5.w;
import u5.y;

/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f14158a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f14159b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14160c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14161d;

    public g(long[] jArr, long[] jArr2, long j, long j7) {
        this.f14158a = jArr;
        this.f14159b = jArr2;
        this.f14160c = j;
        this.f14161d = j7;
    }

    @Override // k6.f
    public final long a() {
        return this.f14161d;
    }

    @Override // u5.x
    public final boolean b() {
        return true;
    }

    @Override // u5.x
    public final w d(long j) {
        long[] jArr = this.f14158a;
        int iE = d0.e(jArr, j, true);
        long j7 = jArr[iE];
        long[] jArr2 = this.f14159b;
        y yVar = new y(j7, jArr2[iE]);
        if (j7 >= j || iE == jArr.length - 1) {
            return new w(yVar, yVar);
        }
        int i10 = iE + 1;
        return new w(yVar, new y(jArr[i10], jArr2[i10]));
    }

    @Override // u5.x
    public final long e() {
        return this.f14160c;
    }

    @Override // k6.f
    public final long getTimeUs(long j) {
        return this.f14158a[d0.e(this.f14159b, j, true)];
    }
}
