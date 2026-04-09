package v0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f23751a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f23752b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f23753c;

    public j(int i10, long[] jArr, Object[] objArr) {
        this.f23751a = i10;
        this.f23752b = jArr;
        this.f23753c = objArr;
    }

    public final int a(long j) {
        int i10 = this.f23751a - 1;
        if (i10 != -1) {
            long[] jArr = this.f23752b;
            int i11 = 0;
            if (i10 != 0) {
                while (i11 <= i10) {
                    int i12 = (i11 + i10) >>> 1;
                    long j7 = jArr[i12] - j;
                    if (j7 < 0) {
                        i11 = i12 + 1;
                    } else {
                        if (j7 <= 0) {
                            return i12;
                        }
                        i10 = i12 - 1;
                    }
                }
                return -(i11 + 1);
            }
            long j10 = jArr[0];
            if (j10 == j) {
                return 0;
            }
            if (j10 > j) {
                return -2;
            }
        }
        return -1;
    }

    public final j b(Object obj, long j) {
        long[] jArr;
        int i10;
        Object[] objArr = this.f23753c;
        int i11 = 0;
        int i12 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i12++;
            }
        }
        int i13 = i12 + 1;
        long[] jArr2 = new long[i13];
        Object[] objArr2 = new Object[i13];
        if (i13 > 1) {
            int i14 = 0;
            while (true) {
                jArr = this.f23752b;
                i10 = this.f23751a;
                if (i11 >= i13 || i14 >= i10) {
                    break;
                }
                long j7 = jArr[i14];
                Object obj3 = objArr[i14];
                if (j7 > j) {
                    jArr2[i11] = j;
                    objArr2[i11] = obj;
                    i11++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i11] = j7;
                    objArr2[i11] = obj3;
                    i11++;
                }
                i14++;
            }
            if (i14 == i10) {
                jArr2[i12] = j;
                objArr2[i12] = obj;
            } else {
                while (i11 < i13) {
                    long j10 = jArr[i14];
                    Object obj4 = objArr[i14];
                    if (obj4 != null) {
                        jArr2[i11] = j10;
                        objArr2[i11] = obj4;
                        i11++;
                    }
                    i14++;
                }
            }
        } else {
            jArr2[0] = j;
            objArr2[0] = obj;
        }
        return new j(i13, jArr2, objArr2);
    }
}
