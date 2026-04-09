package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m6 {

    /* renamed from: f, reason: collision with root package name */
    public static final m6 f19825f = new m6(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f19826a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f19827b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f19828c;

    /* renamed from: d, reason: collision with root package name */
    public int f19829d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19830e;

    public m6(int i4, int[] iArr, Object[] objArr, boolean z3) {
        this.f19826a = i4;
        this.f19827b = iArr;
        this.f19828c = objArr;
        this.f19830e = z3;
    }

    public static m6 a() {
        return new m6(0, new int[8], new Object[8], true);
    }

    public final void b(v5 v5Var) {
        if (this.f19826a != 0) {
            for (int i4 = 0; i4 < this.f19826a; i4++) {
                int i10 = this.f19827b[i4];
                Object obj = this.f19828c[i4];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    ((y4) v5Var.f19970a).W(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    ((y4) v5Var.f19970a).X(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    y4 y4Var = (y4) v5Var.f19970a;
                    y4Var.b0((i12 << 3) | 2);
                    y4Var.Y((x4) obj);
                } else if (i11 == 3) {
                    ((y4) v5Var.f19970a).S(i12, 3);
                    ((m6) obj).b(v5Var);
                    ((y4) v5Var.f19970a).S(i12, 4);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new o5());
                    }
                    ((y4) v5Var.f19970a).V(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iH0;
        int iQ;
        int iH02;
        int i4 = this.f19829d;
        if (i4 != -1) {
            return i4;
        }
        int iW = 0;
        for (int i10 = 0; i10 < this.f19826a; i10++) {
            int i11 = this.f19827b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.f19828c[i10]).getClass();
                    iH02 = y4.h0(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    x4 x4Var = (x4) this.f19828c[i10];
                    int iH03 = y4.h0(i14);
                    int iD = x4Var.d();
                    iW = com.google.android.gms.internal.ads.d7.w(iD, iD, iH03, iW);
                } else if (i13 == 3) {
                    int iH04 = y4.h0(i12 << 3);
                    iH0 = iH04 + iH04;
                    iQ = ((m6) this.f19828c[i10]).c();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(new o5());
                    }
                    ((Integer) this.f19828c[i10]).getClass();
                    iH02 = y4.h0(i12 << 3) + 4;
                }
                iW = iH02 + iW;
            } else {
                int i15 = i12 << 3;
                long jLongValue = ((Long) this.f19828c[i10]).longValue();
                iH0 = y4.h0(i15);
                iQ = y4.Q(jLongValue);
            }
            iW = iQ + iH0 + iW;
        }
        this.f19829d = iW;
        return iW;
    }

    public final void d(int i4, Object obj) {
        if (!this.f19830e) {
            throw new UnsupportedOperationException();
        }
        e(this.f19826a + 1);
        int[] iArr = this.f19827b;
        int i10 = this.f19826a;
        iArr[i10] = i4;
        this.f19828c[i10] = obj;
        this.f19826a = i10 + 1;
    }

    public final void e(int i4) {
        int[] iArr = this.f19827b;
        if (i4 > iArr.length) {
            int i10 = this.f19826a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i4) {
                i4 = i11;
            }
            if (i4 < 8) {
                i4 = 8;
            }
            this.f19827b = Arrays.copyOf(iArr, i4);
            this.f19828c = Arrays.copyOf(this.f19828c, i4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj;
        int i4 = this.f19826a;
        if (i4 == m6Var.f19826a) {
            int[] iArr = this.f19827b;
            int[] iArr2 = m6Var.f19827b;
            int i10 = 0;
            while (true) {
                if (i10 >= i4) {
                    Object[] objArr = this.f19828c;
                    Object[] objArr2 = m6Var.f19828c;
                    int i11 = this.f19826a;
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
        int i4 = this.f19826a;
        int i10 = i4 + 527;
        int[] iArr = this.f19827b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i4; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = ((i10 * 31) + i11) * 31;
        Object[] objArr = this.f19828c;
        int i14 = this.f19826a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }
}
