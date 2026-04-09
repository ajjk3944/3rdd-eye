package a5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f88b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f89c;

    /* renamed from: d, reason: collision with root package name */
    public int f90d;

    /* renamed from: e, reason: collision with root package name */
    public int f91e;

    public a0(int i10) {
        this.f87a = i10;
        switch (i10) {
            case 1:
                this.f88b = new long[10];
                this.f89c = new Object[10];
                break;
        }
    }

    public final synchronized void a(Object obj, long j) {
        int i10 = this.f87a;
        synchronized (this) {
            switch (i10) {
                case 0:
                    if (this.f91e > 0) {
                        if (j <= this.f88b[((this.f90d + r0) - 1) % this.f89c.length]) {
                            synchronized (this) {
                                this.f90d = 0;
                                this.f91e = 0;
                                Arrays.fill(this.f89c, (Object) null);
                            }
                        }
                    }
                    c();
                    int i11 = this.f90d;
                    int i12 = this.f91e;
                    Object[] objArr = this.f89c;
                    int length = (i11 + i12) % objArr.length;
                    this.f88b[length] = j;
                    objArr[length] = obj;
                    this.f91e = i12 + 1;
                    return;
                default:
                    if (this.f91e > 0) {
                        if (j <= this.f88b[((this.f90d + r0) - 1) % this.f89c.length]) {
                            b();
                        }
                    }
                    c();
                    int i13 = this.f90d;
                    int i14 = this.f91e;
                    Object[] objArr2 = this.f89c;
                    int length2 = (i13 + i14) % objArr2.length;
                    this.f88b[length2] = j;
                    objArr2[length2] = obj;
                    this.f91e = i14 + 1;
                    return;
            }
        }
    }

    public synchronized void b() {
        this.f90d = 0;
        this.f91e = 0;
        Arrays.fill(this.f89c, (Object) null);
    }

    public final void c() {
        switch (this.f87a) {
            case 0:
                int length = this.f89c.length;
                if (this.f91e >= length) {
                    int i10 = length * 2;
                    long[] jArr = new long[i10];
                    Object[] objArr = new Object[i10];
                    int i11 = this.f90d;
                    int i12 = length - i11;
                    System.arraycopy(this.f88b, i11, jArr, 0, i12);
                    System.arraycopy(this.f89c, this.f90d, objArr, 0, i12);
                    int i13 = this.f90d;
                    if (i13 > 0) {
                        System.arraycopy(this.f88b, 0, jArr, i12, i13);
                        System.arraycopy(this.f89c, 0, objArr, i12, this.f90d);
                    }
                    this.f88b = jArr;
                    this.f89c = objArr;
                    this.f90d = 0;
                    break;
                }
                break;
            default:
                int length2 = this.f89c.length;
                if (this.f91e >= length2) {
                    int i14 = length2 * 2;
                    long[] jArr2 = new long[i14];
                    Object[] objArr2 = new Object[i14];
                    int i15 = this.f90d;
                    int i16 = length2 - i15;
                    System.arraycopy(this.f88b, i15, jArr2, 0, i16);
                    System.arraycopy(this.f89c, this.f90d, objArr2, 0, i16);
                    int i17 = this.f90d;
                    if (i17 > 0) {
                        System.arraycopy(this.f88b, 0, jArr2, i16, i17);
                        System.arraycopy(this.f89c, 0, objArr2, i16, this.f90d);
                    }
                    this.f88b = jArr2;
                    this.f89c = objArr2;
                    this.f90d = 0;
                    break;
                }
                break;
        }
    }

    public Object d(long j, boolean z10) {
        Object objE = null;
        long j7 = Long.MAX_VALUE;
        while (this.f91e > 0) {
            long j10 = j - this.f88b[this.f90d];
            if (j10 < 0 && (z10 || (-j10) >= j7)) {
                break;
            }
            objE = e();
            j7 = j10;
        }
        return objE;
    }

    public final Object e() {
        switch (this.f87a) {
            case 0:
                a.i(this.f91e > 0);
                Object[] objArr = this.f89c;
                int i10 = this.f90d;
                Object obj = objArr[i10];
                objArr[i10] = null;
                this.f90d = (i10 + 1) % objArr.length;
                this.f91e--;
                return obj;
            default:
                qb.b.j(this.f91e > 0);
                Object[] objArr2 = this.f89c;
                int i11 = this.f90d;
                Object obj2 = objArr2[i11];
                objArr2[i11] = null;
                this.f90d = (i11 + 1) % objArr2.length;
                this.f91e--;
                return obj2;
        }
    }
}
