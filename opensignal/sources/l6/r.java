package l6;

import a5.d0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final o f14885a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14886b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f14887c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f14888d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14889e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f14890f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f14891g;

    /* renamed from: h, reason: collision with root package name */
    public final long f14892h;

    public r(o oVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j) {
        a5.a.e(iArr.length == jArr2.length);
        a5.a.e(jArr.length == jArr2.length);
        a5.a.e(iArr2.length == jArr2.length);
        this.f14885a = oVar;
        this.f14887c = jArr;
        this.f14888d = iArr;
        this.f14889e = i10;
        this.f14890f = jArr2;
        this.f14891g = iArr2;
        this.f14892h = j;
        this.f14886b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f14890f;
        for (int iB = d0.b(jArr, j, true); iB < jArr.length; iB++) {
            if ((this.f14891g[iB] & 1) != 0) {
                return iB;
            }
        }
        return -1;
    }
}
