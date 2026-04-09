package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1294i1 implements InterfaceC1992v0 {

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC2100x0 f14645d;

    /* renamed from: e, reason: collision with root package name */
    public T0 f14646e;

    /* renamed from: g, reason: collision with root package name */
    public U3 f14648g;

    /* renamed from: h, reason: collision with root package name */
    public C0 f14649h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f14650j;

    /* renamed from: k, reason: collision with root package name */
    public C1240h1 f14651k;

    /* renamed from: l, reason: collision with root package name */
    public int f14652l;

    /* renamed from: m, reason: collision with root package name */
    public long f14653m;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f14642a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final C2036vr f14643b = new C2036vr(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    public final A0 f14644c = new A0();

    /* renamed from: f, reason: collision with root package name */
    public int f14647f = 0;

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final boolean b(InterfaceC2046w0 interfaceC2046w0) {
        U3 u3A = new H0(0).a(interfaceC2046w0, C1994v2.f17204C, 0);
        if (u3A != null) {
            int length = u3A.f11598a.length;
        }
        C2036vr c2036vr = new C2036vr(4);
        ((C1776r0) interfaceC2046w0).y(c2036vr.f17354a, 0, 4, false);
        return c2036vr.P() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final List c() {
        JB jb = LB.f9635b;
        return C1197gC.f14227e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void e(InterfaceC2100x0 interfaceC2100x0) {
        this.f14645d = interfaceC2100x0;
        this.f14646e = interfaceC2100x0.x(0, 1);
        interfaceC2100x0.u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void f(long j6, long j7) {
        if (j6 == 0) {
            this.f14647f = 0;
        } else {
            C1240h1 c1240h1 = this.f14651k;
            if (c1240h1 != null) {
                c1240h1.a(j7);
            }
        }
        this.f14653m = j7 != 0 ? -1L : 0L;
        this.f14652l = 0;
        this.f14643b.y(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final int g(InterfaceC2046w0 interfaceC2046w0, A0 a02) throws P4, EOFException, InterruptedIOException {
        C0 c02;
        int i;
        L0 b0;
        L6 l6;
        long j6;
        long j7;
        long j8;
        boolean zI;
        long jO;
        long j9;
        int i3 = this.f14647f;
        U3 u32 = null;
        if (i3 == 0) {
            ((C1776r0) interfaceC2046w0).f16447f = 0;
            C1776r0 c1776r0 = (C1776r0) interfaceC2046w0;
            long jN = c1776r0.n();
            U3 u3A = new H0(0).a(interfaceC2046w0, null, 0);
            if (u3A != null && u3A.f11598a.length != 0) {
                u32 = u3A;
            }
            c1776r0.b((int) (c1776r0.n() - jN), false);
            this.f14648g = u32;
            this.f14647f = 1;
            return 0;
        }
        byte[] bArr = this.f14642a;
        if (i3 == 1) {
            ((C1776r0) interfaceC2046w0).y(bArr, 0, 42, false);
            ((C1776r0) interfaceC2046w0).f16447f = 0;
            this.f14647f = 2;
            return 0;
        }
        int i6 = 3;
        int i7 = 4;
        if (i3 == 2) {
            C2036vr c2036vr = new C2036vr(4);
            ((C1776r0) interfaceC2046w0).w(c2036vr.f17354a, 0, 4, false);
            if (c2036vr.P() != 1716281667) {
                throw P4.a(null, "Failed to read FLAC stream marker.");
            }
            this.f14647f = 3;
            return 0;
        }
        if (i3 != 3) {
            long j10 = 0;
            if (i3 == 4) {
                ((C1776r0) interfaceC2046w0).f16447f = 0;
                C2036vr c2036vr2 = new C2036vr(2);
                C1776r0 c1776r02 = (C1776r0) interfaceC2046w0;
                c1776r02.y(c2036vr2.f17354a, 0, 2, false);
                int iL = c2036vr2.L();
                if ((iL >> 2) != 16382) {
                    c1776r02.f16447f = 0;
                    throw P4.a(null, "First frame does not start with sync code.");
                }
                c1776r02.f16447f = 0;
                this.f14650j = iL;
                InterfaceC2100x0 interfaceC2100x0 = this.f14645d;
                String str = Vt.f12096a;
                long j11 = c1776r02.f16445d;
                long j12 = c1776r02.f16444c;
                C0 c03 = this.f14649h;
                c03.getClass();
                C0697Ql c0697Ql = c03.f7488k;
                if (c0697Ql != null && ((long[]) c0697Ql.f10691b).length > 0) {
                    b0 = new B0(c03, j11, 0);
                    i = 0;
                } else if (j12 == -1 || c03.f7487j <= 0) {
                    i = 0;
                    b0 = new B0(c03.a(), 0L);
                } else {
                    int i8 = this.f14650j;
                    int i9 = c03.f7481c;
                    L6 l62 = new L6(2, c03);
                    J4 j42 = new J4(c03, i8);
                    long jA = c03.a();
                    long j13 = c03.f7487j;
                    int i10 = c03.f7482d;
                    if (i10 > 0) {
                        l6 = l62;
                        i = 0;
                        j7 = ((i10 + i9) / 2) + 1;
                        j6 = j11;
                    } else {
                        i = 0;
                        l6 = l62;
                        int i11 = c03.f7479a;
                        long j14 = 4096;
                        if (i11 == c03.f7480b && i11 > 0) {
                            j14 = i11;
                        }
                        j6 = j11;
                        j7 = (((j14 * c03.f7485g) * c03.f7486h) / 8) + 64;
                    }
                    C1240h1 c1240h1 = new C1240h1(l6, j42, jA, j13, j6, j12, j7, Math.max(6, i9));
                    this.f14651k = c1240h1;
                    b0 = c1240h1.f14410a;
                }
                interfaceC2100x0.A(b0);
                this.f14647f = 5;
                return i;
            }
            this.f14646e.getClass();
            C0 c04 = this.f14649h;
            c04.getClass();
            C1240h1 c1240h12 = this.f14651k;
            if (c1240h12 != null && c1240h12.f14412c != null) {
                return c1240h12.b(interfaceC2046w0, a02);
            }
            if (this.f14653m == -1) {
                ((C1776r0) interfaceC2046w0).f16447f = 0;
                C1776r0 c1776r03 = (C1776r0) interfaceC2046w0;
                c1776r03.e(1, false);
                byte[] bArr2 = new byte[1];
                c1776r03.y(bArr2, 0, 1, false);
                int i12 = bArr2[0] & 1;
                boolean z6 = 1 == i12;
                c1776r03.e(2, false);
                i = 1 != i12 ? 6 : 7;
                C2036vr c2036vr3 = new C2036vr(i);
                byte[] bArr3 = c2036vr3.f17354a;
                int i13 = 0;
                while (i13 < i) {
                    int iZ = c1776r03.z(i13, i - i13, bArr3);
                    if (iZ == -1) {
                        break;
                    }
                    i13 += iZ;
                }
                c2036vr3.C(i13);
                c1776r03.f16447f = 0;
                try {
                    jO = c2036vr3.o();
                    if (!z6) {
                        jO *= c04.f7480b;
                    }
                    j9 = c04.f7487j;
                } catch (NumberFormatException unused) {
                }
                if (j9 == 0 || jO <= j9) {
                    j10 = jO;
                } else {
                    z = false;
                }
                if (!z) {
                    throw P4.a(null, null);
                }
                this.f14653m = j10;
            } else {
                C2036vr c2036vr4 = this.f14643b;
                int i14 = c2036vr4.f17356c;
                if (i14 < 32768) {
                    int iD = ((C1776r0) interfaceC2046w0).d(i14, 32768 - i14, c2036vr4.f17354a);
                    z = iD == -1;
                    if (!z) {
                        c2036vr4.C(i14 + iD);
                    } else if (c2036vr4.B() == 0) {
                        long j15 = this.f14653m * 1000000;
                        C0 c05 = this.f14649h;
                        String str2 = Vt.f12096a;
                        this.f14646e.c(j15 / c05.f7483e, 1, this.f14652l, 0, null);
                        return -1;
                    }
                } else {
                    z = false;
                }
                int i15 = c2036vr4.f17355b;
                int i16 = this.f14652l;
                int i17 = this.i;
                if (i16 < i17) {
                    c2036vr4.G(Math.min(i17 - i16, c2036vr4.B()));
                }
                this.f14649h.getClass();
                int i18 = c2036vr4.f17355b;
                while (true) {
                    int i19 = c2036vr4.f17356c - 16;
                    A0 a03 = this.f14644c;
                    if (i18 <= i19) {
                        c2036vr4.E(i18);
                        if (AbstractC0709Rg.i(c2036vr4, this.f14649h, this.f14650j, a03)) {
                            c2036vr4.E(i18);
                            j8 = a03.f6910a;
                            break;
                        }
                        i18++;
                    } else {
                        if (z) {
                            while (true) {
                                int i20 = c2036vr4.f17356c;
                                if (i18 > i20 - this.i) {
                                    c2036vr4.E(i20);
                                    break;
                                }
                                c2036vr4.E(i18);
                                try {
                                    zI = AbstractC0709Rg.i(c2036vr4, this.f14649h, this.f14650j, a03);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zI = false;
                                }
                                if (c2036vr4.f17355b <= c2036vr4.f17356c && zI) {
                                    c2036vr4.E(i18);
                                    j8 = a03.f6910a;
                                    break;
                                }
                                i18++;
                            }
                        } else {
                            c2036vr4.E(i18);
                        }
                        j8 = -1;
                    }
                }
                int i21 = c2036vr4.f17355b - i15;
                c2036vr4.E(i15);
                this.f14646e.a(i21, c2036vr4);
                int i22 = this.f14652l + i21;
                this.f14652l = i22;
                if (j8 != -1) {
                    long j16 = this.f14653m * 1000000;
                    C0 c06 = this.f14649h;
                    String str3 = Vt.f12096a;
                    this.f14646e.c(j16 / c06.f7483e, 1, i22, 0, null);
                    this.f14652l = 0;
                    this.f14653m = j8;
                }
                int length = c2036vr4.f17354a.length - c2036vr4.f17356c;
                if (c2036vr4.B() < 16 && length < 16) {
                    int iB = c2036vr4.B();
                    byte[] bArr4 = c2036vr4.f17354a;
                    System.arraycopy(bArr4, c2036vr4.f17355b, bArr4, 0, iB);
                    c2036vr4.E(0);
                    c2036vr4.C(iB);
                }
            }
            return 0;
        }
        ?? r22 = 0;
        C0 c07 = this.f14649h;
        while (true) {
            ((C1776r0) interfaceC2046w0).f16447f = r22;
            byte[] bArr5 = new byte[i7];
            C1443kr c1443kr = new C1443kr(bArr5, i7);
            C1776r0 c1776r04 = (C1776r0) interfaceC2046w0;
            c1776r04.y(bArr5, r22, i7, r22);
            boolean zG = c1443kr.g();
            int iH = c1443kr.h(i);
            int iH2 = c1443kr.h(24) + i7;
            if (iH == 0) {
                byte[] bArr6 = new byte[38];
                c1776r04.w(bArr6, r22, 38, r22);
                c07 = new C0(bArr6, i7);
            } else {
                if (c07 == null) {
                    throw new IllegalArgumentException();
                }
                U3 u33 = c07.f7489l;
                if (iH == i6) {
                    C2036vr c2036vr5 = new C2036vr(iH2);
                    c1776r04.w(c2036vr5.f17354a, r22, iH2, r22);
                    c02 = new C0(c07.f7479a, c07.f7480b, c07.f7481c, c07.f7482d, c07.f7483e, c07.f7485g, c07.f7486h, c07.f7487j, AbstractC1114el.q(c2036vr5), c07.f7489l);
                } else {
                    int i23 = i7;
                    if (iH == i23) {
                        C2036vr c2036vr6 = new C2036vr(iH2);
                        c1776r04.w(c2036vr6.f17354a, 0, iH2, false);
                        c2036vr6.G(i23);
                        U3 u3U = AbstractC2022vd.u(Arrays.asList((String[]) AbstractC2022vd.n(c2036vr6, false, false).f11090b));
                        if (u33 != null) {
                            u3U = u33.b(u3U);
                        }
                        c02 = new C0(c07.f7479a, c07.f7480b, c07.f7481c, c07.f7482d, c07.f7483e, c07.f7485g, c07.f7486h, c07.f7487j, c07.f7488k, u3U);
                    } else if (iH == 6) {
                        C2036vr c2036vr7 = new C2036vr(iH2);
                        c1776r04.w(c2036vr7.f17354a, 0, iH2, false);
                        c2036vr7.G(4);
                        U3 u34 = new U3(LB.i(C2047w1.b(c2036vr7)));
                        if (u33 != null) {
                            u34 = u33.b(u34);
                        }
                        c02 = new C0(c07.f7479a, c07.f7480b, c07.f7481c, c07.f7482d, c07.f7483e, c07.f7485g, c07.f7486h, c07.f7487j, c07.f7488k, u34);
                    } else {
                        c1776r04.b(iH2, false);
                    }
                }
                c07 = c02;
            }
            String str4 = Vt.f12096a;
            this.f14649h = c07;
            if (zG) {
                this.i = Math.max(c07.f7481c, 6);
                TP tpB = this.f14649h.b(bArr, this.f14648g);
                T0 t02 = this.f14646e;
                C1855sP c1855sP = new C1855sP(tpB);
                c1855sP.d("audio/flac");
                t02.e(new TP(c1855sP));
                T0 t03 = this.f14646e;
                this.f14649h.a();
                t03.getClass();
                this.f14647f = 4;
                return 0;
            }
            r22 = 0;
            i6 = 3;
            i7 = 4;
            i = 7;
        }
    }
}
