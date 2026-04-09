package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dp1 {

    /* renamed from: f, reason: collision with root package name */
    public static final dp1 f10535f = new dp1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f10536a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f10537b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f10538c;

    /* renamed from: d, reason: collision with root package name */
    public int f10539d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10540e;

    public dp1(int i4, int[] iArr, Object[] objArr, boolean z3) {
        this.f10536a = i4;
        this.f10537b = iArr;
        this.f10538c = objArr;
        this.f10540e = z3;
    }

    public static dp1 a() {
        return new dp1(0, new int[8], new Object[8], true);
    }

    public final void b(rg0 rg0Var) {
        hn1 hn1Var = (hn1) rg0Var.f15651b;
        if (this.f10536a != 0) {
            for (int i4 = 0; i4 < this.f10536a; i4++) {
                int i10 = this.f10537b[i4];
                Object obj = this.f10538c[i4];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    hn1Var.Q(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    hn1Var.S(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    hn1Var.V(i12, (bn1) obj);
                } else if (i11 == 3) {
                    hn1Var.M(i12, 3);
                    ((dp1) obj).b(rg0Var);
                    hn1Var.M(i12, 4);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new zn1());
                    }
                    hn1Var.P(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iJ;
        int iK;
        int iJ2;
        int i4 = this.f10539d;
        if (i4 != -1) {
            return i4;
        }
        int iS = 0;
        for (int i10 = 0; i10 < this.f10536a; i10++) {
            int i11 = this.f10537b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.f10538c[i10]).getClass();
                    iJ2 = hn1.J(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    bn1 bn1Var = (bn1) this.f10538c[i10];
                    int iJ3 = hn1.J(i14);
                    int i15 = bn1Var.i();
                    iS = d7.s(i15, i15, iJ3, iS);
                } else if (i13 == 3) {
                    int iJ4 = hn1.J(i12 << 3);
                    iJ = iJ4 + iJ4;
                    iK = ((dp1) this.f10538c[i10]).c();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(new zn1());
                    }
                    ((Integer) this.f10538c[i10]).getClass();
                    iJ2 = hn1.J(i12 << 3) + 4;
                }
                iS = iJ2 + iS;
            } else {
                int i16 = i12 << 3;
                long jLongValue = ((Long) this.f10538c[i10]).longValue();
                iJ = hn1.J(i16);
                iK = hn1.K(jLongValue);
            }
            iS = iK + iJ + iS;
        }
        this.f10539d = iS;
        return iS;
    }

    public final void d(int i4, Object obj) {
        if (!this.f10540e) {
            throw new UnsupportedOperationException();
        }
        e(this.f10536a + 1);
        int[] iArr = this.f10537b;
        int i10 = this.f10536a;
        iArr[i10] = i4;
        this.f10538c[i10] = obj;
        this.f10536a = i10 + 1;
    }

    public final void e(int i4) {
        int[] iArr = this.f10537b;
        if (i4 > iArr.length) {
            int i10 = this.f10536a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i4) {
                i4 = i11;
            }
            if (i4 < 8) {
                i4 = 8;
            }
            this.f10537b = Arrays.copyOf(iArr, i4);
            this.f10538c = Arrays.copyOf(this.f10538c, i4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dp1)) {
            return false;
        }
        dp1 dp1Var = (dp1) obj;
        int i4 = this.f10536a;
        if (i4 == dp1Var.f10536a) {
            int[] iArr = this.f10537b;
            int[] iArr2 = dp1Var.f10537b;
            int i10 = 0;
            while (true) {
                if (i10 >= i4) {
                    Object[] objArr = this.f10538c;
                    Object[] objArr2 = dp1Var.f10538c;
                    int i11 = this.f10536a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f10536a;
        int i10 = i4 + 527;
        int[] iArr = this.f10537b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i4; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = ((i10 * 31) + i11) * 31;
        Object[] objArr = this.f10538c;
        int i14 = this.f10536a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }
}
