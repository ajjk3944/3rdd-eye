package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class K5 {

    /* renamed from: f, reason: collision with root package name */
    private static final K5 f35055f = new K5(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f35056a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f35057b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f35058c;

    /* renamed from: d, reason: collision with root package name */
    private int f35059d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f35060e;

    private K5() {
        this(0, new int[8], new Object[8], true);
    }

    static K5 c(K5 k52, K5 k53) {
        int i10 = k52.f35056a + k53.f35056a;
        int[] iArrCopyOf = Arrays.copyOf(k52.f35057b, i10);
        System.arraycopy(k53.f35057b, 0, iArrCopyOf, k52.f35056a, k53.f35056a);
        Object[] objArrCopyOf = Arrays.copyOf(k52.f35058c, i10);
        System.arraycopy(k53.f35058c, 0, objArrCopyOf, k52.f35056a, k53.f35056a);
        return new K5(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void d(int i10) {
        int[] iArr = this.f35057b;
        if (i10 > iArr.length) {
            int i11 = this.f35056a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f35057b = Arrays.copyOf(iArr, i10);
            this.f35058c = Arrays.copyOf(this.f35058c, i10);
        }
    }

    private static void f(int i10, Object obj, InterfaceC4331d6 interfaceC4331d6) {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            interfaceC4331d6.c(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 1) {
            interfaceC4331d6.q(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 2) {
            interfaceC4331d6.D(i11, (V3) obj);
            return;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new RuntimeException(zzkq.a());
            }
            interfaceC4331d6.e(i11, ((Integer) obj).intValue());
        } else if (interfaceC4331d6.zza() == 1) {
            interfaceC4331d6.r(i11);
            ((K5) obj).j(interfaceC4331d6);
            interfaceC4331d6.zza(i11);
        } else {
            interfaceC4331d6.zza(i11);
            ((K5) obj).j(interfaceC4331d6);
            interfaceC4331d6.r(i11);
        }
    }

    public static K5 k() {
        return f35055f;
    }

    static K5 l() {
        return new K5();
    }

    private final void n() {
        if (!this.f35060e) {
            throw new UnsupportedOperationException();
        }
    }

    public final int a() {
        int iM0;
        int i10 = this.f35059d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f35056a; i12++) {
            int i13 = this.f35057b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                iM0 = zzjr.m0(i14, ((Long) this.f35058c[i12]).longValue());
            } else if (i15 == 1) {
                iM0 = zzjr.P(i14, ((Long) this.f35058c[i12]).longValue());
            } else if (i15 == 2) {
                iM0 = zzjr.Q(i14, (V3) this.f35058c[i12]);
            } else if (i15 == 3) {
                iM0 = (zzjr.s0(i14) << 1) + ((K5) this.f35058c[i12]).a();
            } else {
                if (i15 != 5) {
                    throw new IllegalStateException(zzkq.a());
                }
                iM0 = zzjr.h0(i14, ((Integer) this.f35058c[i12]).intValue());
            }
            i11 += iM0;
        }
        this.f35059d = i11;
        return i11;
    }

    final K5 b(K5 k52) {
        if (k52.equals(f35055f)) {
            return this;
        }
        n();
        int i10 = this.f35056a + k52.f35056a;
        d(i10);
        System.arraycopy(k52.f35057b, 0, this.f35057b, this.f35056a, k52.f35056a);
        System.arraycopy(k52.f35058c, 0, this.f35058c, this.f35056a, k52.f35056a);
        this.f35056a = i10;
        return this;
    }

    final void e(int i10, Object obj) {
        n();
        d(this.f35056a + 1);
        int[] iArr = this.f35057b;
        int i11 = this.f35056a;
        iArr[i11] = i10;
        this.f35058c[i11] = obj;
        this.f35056a = i11 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof K5)) {
            return false;
        }
        K5 k52 = (K5) obj;
        int i10 = this.f35056a;
        if (i10 == k52.f35056a) {
            int[] iArr = this.f35057b;
            int[] iArr2 = k52.f35057b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f35058c;
                    Object[] objArr2 = k52.f35058c;
                    int i12 = this.f35056a;
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

    final void g(InterfaceC4331d6 interfaceC4331d6) {
        if (interfaceC4331d6.zza() == 2) {
            for (int i10 = this.f35056a - 1; i10 >= 0; i10--) {
                interfaceC4331d6.j(this.f35057b[i10] >>> 3, this.f35058c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f35056a; i11++) {
            interfaceC4331d6.j(this.f35057b[i11] >>> 3, this.f35058c[i11]);
        }
    }

    final void h(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f35056a; i11++) {
            AbstractC4375i5.d(sb2, i10, String.valueOf(this.f35057b[i11] >>> 3), this.f35058c[i11]);
        }
    }

    public final int hashCode() {
        int i10 = this.f35056a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f35057b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f35058c;
        int i15 = this.f35056a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int i() {
        int i10 = this.f35059d;
        if (i10 != -1) {
            return i10;
        }
        int iZ = 0;
        for (int i11 = 0; i11 < this.f35056a; i11++) {
            iZ += zzjr.Z(this.f35057b[i11] >>> 3, (V3) this.f35058c[i11]);
        }
        this.f35059d = iZ;
        return iZ;
    }

    public final void j(InterfaceC4331d6 interfaceC4331d6) {
        if (this.f35056a == 0) {
            return;
        }
        if (interfaceC4331d6.zza() == 1) {
            for (int i10 = 0; i10 < this.f35056a; i10++) {
                f(this.f35057b[i10], this.f35058c[i10], interfaceC4331d6);
            }
            return;
        }
        for (int i11 = this.f35056a - 1; i11 >= 0; i11--) {
            f(this.f35057b[i11], this.f35058c[i11], interfaceC4331d6);
        }
    }

    public final void m() {
        if (this.f35060e) {
            this.f35060e = false;
        }
    }

    private K5(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f35059d = -1;
        this.f35056a = i10;
        this.f35057b = iArr;
        this.f35058c = objArr;
        this.f35060e = z10;
    }
}
