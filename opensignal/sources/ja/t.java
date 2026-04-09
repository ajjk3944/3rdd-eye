package ja;

import qb.v;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final q f13548a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13549b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f13550c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f13551d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13552e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f13553f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f13554g;

    /* renamed from: h, reason: collision with root package name */
    public final long f13555h;

    public t(q qVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j) {
        qb.b.g(iArr.length == jArr2.length);
        qb.b.g(jArr.length == jArr2.length);
        qb.b.g(iArr2.length == jArr2.length);
        this.f13548a = qVar;
        this.f13550c = jArr;
        this.f13551d = iArr;
        this.f13552e = i10;
        this.f13553f = jArr2;
        this.f13554g = iArr2;
        this.f13555h = j;
        this.f13549b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f13553f;
        for (int iB = v.b(jArr, j, true); iB < jArr.length; iB++) {
            if ((this.f13554g[iB] & 1) != 0) {
                return iB;
            }
        }
        return -1;
    }
}
