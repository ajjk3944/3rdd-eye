package c1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f2578a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f2579b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f2580c;

    public p(int i4, long[] jArr, Object[] objArr) {
        this.f2578a = i4;
        this.f2579b = jArr;
        this.f2580c = objArr;
    }

    public final int a(long j) {
        int i4 = this.f2578a - 1;
        if (i4 != -1) {
            long[] jArr = this.f2579b;
            int i10 = 0;
            if (i4 != 0) {
                while (i10 <= i4) {
                    int i11 = (i10 + i4) >>> 1;
                    long j8 = jArr[i11] - j;
                    if (j8 < 0) {
                        i10 = i11 + 1;
                    } else {
                        if (j8 <= 0) {
                            return i11;
                        }
                        i4 = i11 - 1;
                    }
                }
                return -(i10 + 1);
            }
            long j9 = jArr[0];
            if (j9 == j) {
                return 0;
            }
            if (j9 > j) {
                return -2;
            }
        }
        return -1;
    }

    public final p b(Object obj, long j) {
        long[] jArr;
        int i4;
        Object[] objArr = this.f2580c;
        int i10 = 0;
        int i11 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i11++;
            }
        }
        int i12 = i11 + 1;
        long[] jArr2 = new long[i12];
        Object[] objArr2 = new Object[i12];
        if (i12 > 1) {
            int i13 = 0;
            while (true) {
                jArr = this.f2579b;
                i4 = this.f2578a;
                if (i10 >= i12 || i13 >= i4) {
                    break;
                }
                long j8 = jArr[i13];
                Object obj3 = objArr[i13];
                if (j8 > j) {
                    jArr2[i10] = j;
                    objArr2[i10] = obj;
                    i10++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i10] = j8;
                    objArr2[i10] = obj3;
                    i10++;
                }
                i13++;
            }
            if (i13 == i4) {
                jArr2[i11] = j;
                objArr2[i11] = obj;
            } else {
                while (i10 < i12) {
                    long j9 = jArr[i13];
                    Object obj4 = objArr[i13];
                    if (obj4 != null) {
                        jArr2[i10] = j9;
                        objArr2[i10] = obj4;
                        i10++;
                    }
                    i13++;
                }
            }
        } else {
            jArr2[0] = j;
            objArr2[0] = obj;
        }
        return new p(i12, jArr2, objArr2);
    }
}
