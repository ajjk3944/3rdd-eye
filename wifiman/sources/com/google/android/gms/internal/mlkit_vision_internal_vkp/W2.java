package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class W2 {

    /* renamed from: f, reason: collision with root package name */
    private static final W2 f35652f = new W2(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f35653a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f35654b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f35655c;

    /* renamed from: d, reason: collision with root package name */
    private int f35656d = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f35657e;

    private W2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f35653a = i10;
        this.f35654b = iArr;
        this.f35655c = objArr;
        this.f35657e = z10;
    }

    public static W2 c() {
        return f35652f;
    }

    static W2 e(W2 w22, W2 w23) {
        int i10 = w22.f35653a + w23.f35653a;
        int[] iArrCopyOf = Arrays.copyOf(w22.f35654b, i10);
        System.arraycopy(w23.f35654b, 0, iArrCopyOf, w22.f35653a, w23.f35653a);
        Object[] objArrCopyOf = Arrays.copyOf(w22.f35655c, i10);
        System.arraycopy(w23.f35655c, 0, objArrCopyOf, w22.f35653a, w23.f35653a);
        return new W2(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static W2 f() {
        return new W2(0, new int[8], new Object[8], true);
    }

    private final void m(int i10) {
        int[] iArr = this.f35654b;
        if (i10 > iArr.length) {
            int i11 = this.f35653a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f35654b = Arrays.copyOf(iArr, i10);
            this.f35655c = Arrays.copyOf(this.f35655c, i10);
        }
    }

    public final int a() {
        int iF;
        int iG;
        int iF2;
        int i10 = this.f35656d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f35653a; i12++) {
            int i13 = this.f35654b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f35655c[i12]).longValue();
                    iF2 = I1.f(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    B1 b12 = (B1) this.f35655c[i12];
                    int iF3 = I1.f(i16);
                    int iM = b12.m();
                    iF2 = iF3 + I1.f(iM) + iM;
                } else if (i15 == 3) {
                    int iF4 = I1.f(i14 << 3);
                    iF = iF4 + iF4;
                    iG = ((W2) this.f35655c[i12]).a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new zzbev("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f35655c[i12]).intValue();
                    iF2 = I1.f(i14 << 3) + 4;
                }
                i11 += iF2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f35655c[i12]).longValue();
                iF = I1.f(i17);
                iG = I1.g(jLongValue);
            }
            iF2 = iF + iG;
            i11 += iF2;
        }
        this.f35656d = i11;
        return i11;
    }

    public final int b() {
        int i10 = this.f35656d;
        if (i10 != -1) {
            return i10;
        }
        int iF = 0;
        for (int i11 = 0; i11 < this.f35653a; i11++) {
            int i12 = this.f35654b[i11] >>> 3;
            B1 b12 = (B1) this.f35655c[i11];
            int iF2 = I1.f(8);
            int iF3 = I1.f(16) + I1.f(i12);
            int iF4 = I1.f(24);
            int iM = b12.m();
            iF += iF2 + iF2 + iF3 + iF4 + I1.f(iM) + iM;
        }
        this.f35656d = iF;
        return iF;
    }

    final W2 d(W2 w22) {
        if (w22.equals(f35652f)) {
            return this;
        }
        g();
        int i10 = this.f35653a + w22.f35653a;
        m(i10);
        System.arraycopy(w22.f35654b, 0, this.f35654b, this.f35653a, w22.f35653a);
        System.arraycopy(w22.f35655c, 0, this.f35655c, this.f35653a, w22.f35653a);
        this.f35653a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof W2)) {
            return false;
        }
        W2 w22 = (W2) obj;
        int i10 = this.f35653a;
        if (i10 == w22.f35653a) {
            int[] iArr = this.f35654b;
            int[] iArr2 = w22.f35654b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f35655c;
                    Object[] objArr2 = w22.f35655c;
                    int i12 = this.f35653a;
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

    final void g() {
        if (!this.f35657e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f35657e) {
            this.f35657e = false;
        }
    }

    public final int hashCode() {
        int i10 = this.f35653a;
        int i11 = i10 + 527;
        int[] iArr = this.f35654b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f35655c;
        int i15 = this.f35653a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    final void i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f35653a; i11++) {
            B2.b(sb2, i10, String.valueOf(this.f35654b[i11] >>> 3), this.f35655c[i11]);
        }
    }

    final void j(int i10, Object obj) {
        g();
        m(this.f35653a + 1);
        int[] iArr = this.f35654b;
        int i11 = this.f35653a;
        iArr[i11] = i10;
        this.f35655c[i11] = obj;
        this.f35653a = i11 + 1;
    }

    final void k(InterfaceC4627k3 interfaceC4627k3) {
        for (int i10 = 0; i10 < this.f35653a; i10++) {
            interfaceC4627k3.j(this.f35654b[i10] >>> 3, this.f35655c[i10]);
        }
    }

    public final void l(InterfaceC4627k3 interfaceC4627k3) {
        if (this.f35653a != 0) {
            for (int i10 = 0; i10 < this.f35653a; i10++) {
                int i11 = this.f35654b[i10];
                Object obj = this.f35655c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    interfaceC4627k3.zzt(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    interfaceC4627k3.zzm(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    interfaceC4627k3.e(i13, (B1) obj);
                } else if (i12 == 3) {
                    interfaceC4627k3.k(i13);
                    ((W2) obj).l(interfaceC4627k3);
                    interfaceC4627k3.zzh(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzbev("Protocol message tag had invalid wire type."));
                    }
                    interfaceC4627k3.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }
}
