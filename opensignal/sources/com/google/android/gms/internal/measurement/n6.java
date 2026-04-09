package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n6 {

    /* renamed from: f, reason: collision with root package name */
    public static final n6 f5136f = new n6(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f5137a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5138b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f5139c;

    /* renamed from: d, reason: collision with root package name */
    public int f5140d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5141e;

    public n6(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f5137a = i10;
        this.f5138b = iArr;
        this.f5139c = objArr;
        this.f5141e = z10;
    }

    public static n6 a() {
        return new n6(0, new int[8], new Object[8], true);
    }

    public final void b(w5 w5Var) {
        if (this.f5137a != 0) {
            for (int i10 = 0; i10 < this.f5137a; i10++) {
                int i11 = this.f5138b[i10];
                Object obj = this.f5139c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    ((z4) w5Var.f5247a).q0(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    ((z4) w5Var.f5247a).r0(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    z4 z4Var = (z4) w5Var.f5247a;
                    z4Var.v0((i13 << 3) | 2);
                    z4Var.s0((y4) obj);
                } else if (i12 == 3) {
                    ((z4) w5Var.f5247a).m0(i13, 3);
                    ((n6) obj).b(w5Var);
                    ((z4) w5Var.f5247a).m0(i13, 4);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new p5());
                    }
                    ((z4) w5Var.f5247a).p0(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iB0;
        int iK0;
        int iB02;
        int i10 = this.f5140d;
        if (i10 != -1) {
            return i10;
        }
        int iC = 0;
        for (int i11 = 0; i11 < this.f5137a; i11++) {
            int i12 = this.f5138b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f5139c[i11]).getClass();
                    iB02 = z4.B0(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    y4 y4Var = (y4) this.f5139c[i11];
                    int iB03 = z4.B0(i15);
                    int iC2 = y4Var.c();
                    iC = c7.a.c(iC2, iC2, iB03, iC);
                } else if (i14 == 3) {
                    int iB04 = z4.B0(i13 << 3);
                    iB0 = iB04 + iB04;
                    iK0 = ((n6) this.f5139c[i11]).c();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new p5());
                    }
                    ((Integer) this.f5139c[i11]).getClass();
                    iB02 = z4.B0(i13 << 3) + 4;
                }
                iC = iB02 + iC;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.f5139c[i11]).longValue();
                iB0 = z4.B0(i16);
                iK0 = z4.k0(jLongValue);
            }
            iC = iK0 + iB0 + iC;
        }
        this.f5140d = iC;
        return iC;
    }

    public final void d(int i10, Object obj) {
        if (!this.f5141e) {
            throw new UnsupportedOperationException();
        }
        e(this.f5137a + 1);
        int[] iArr = this.f5138b;
        int i11 = this.f5137a;
        iArr[i11] = i10;
        this.f5139c[i11] = obj;
        this.f5137a = i11 + 1;
    }

    public final void e(int i10) {
        int[] iArr = this.f5138b;
        if (i10 > iArr.length) {
            int i11 = this.f5137a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f5138b = Arrays.copyOf(iArr, i10);
            this.f5139c = Arrays.copyOf(this.f5139c, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj;
        int i10 = this.f5137a;
        if (i10 == n6Var.f5137a) {
            int[] iArr = this.f5138b;
            int[] iArr2 = n6Var.f5138b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f5139c;
                    Object[] objArr2 = n6Var.f5139c;
                    int i12 = this.f5137a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f5137a;
        int i11 = i10 + 527;
        int[] iArr = this.f5138b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f5139c;
        int i15 = this.f5137a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
