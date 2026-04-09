package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ah1 implements lf1 {
    public nf1 d;
    public jg1 e;
    public wn1 g;
    public rf1 h;
    public int i;
    public int j;
    public zg1 k;
    public int l;
    public long m;
    public final byte[] a = new byte[42];
    public final kz2 b = new kz2(0, new byte[32768]);
    public final pf1 c = new pf1();
    public int f = 0;

    static {
        int i = g82.q;
    }

    @Override // defpackage.lf1
    public final boolean b(mf1 mf1Var) {
        wn1 wn1VarK = new f20(11).k(mf1Var, us0.i, 0);
        if (wn1VarK != null) {
            int length = wn1VarK.a.length;
        }
        kz2 kz2Var = new kz2(4);
        ((df1) mf1Var).B(kz2Var.a, 0, 4, false);
        return kz2Var.P() == 1716281667;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    @Override // defpackage.lf1
    public final int c(mf1 mf1Var, pf1 pf1Var) throws EOFException, InterruptedIOException, lq1 {
        rf1 rf1Var;
        int i;
        cg1 qf1Var;
        long j;
        yg1 yg1Var;
        long j2;
        long j3;
        boolean zK;
        long jO;
        long j4;
        int i2 = this.f;
        wn1 wn1Var = null;
        if (i2 == 0) {
            ((df1) mf1Var).k = 0;
            df1 df1Var = (df1) mf1Var;
            long jN = df1Var.n();
            wn1 wn1VarK = new f20(11).k(mf1Var, null, 0);
            if (wn1VarK != null && wn1VarK.a.length != 0) {
                wn1Var = wn1VarK;
            }
            df1Var.c((int) (df1Var.n() - jN), false);
            this.g = wn1Var;
            this.f = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i2 == 1) {
            ((df1) mf1Var).B(bArr, 0, 42, false);
            ((df1) mf1Var).k = 0;
            this.f = 2;
            return 0;
        }
        int i3 = 3;
        int i4 = 4;
        if (i2 == 2) {
            kz2 kz2Var = new kz2(4);
            ((df1) mf1Var).w(kz2Var.a, 0, 4, false);
            if (kz2Var.P() != 1716281667) {
                throw lq1.a(null, "Failed to read FLAC stream marker.");
            }
            this.f = 3;
            return 0;
        }
        if (i2 != 3) {
            long j5 = 0;
            if (i2 == 4) {
                ((df1) mf1Var).k = 0;
                kz2 kz2Var2 = new kz2(2);
                df1 df1Var2 = (df1) mf1Var;
                df1Var2.B(kz2Var2.a, 0, 2, false);
                int iL = kz2Var2.L();
                if ((iL >> 2) != 16382) {
                    df1Var2.k = 0;
                    throw lq1.a(null, "First frame does not start with sync code.");
                }
                df1Var2.k = 0;
                this.j = iL;
                nf1 nf1Var = this.d;
                String str = v23.a;
                long j6 = df1Var2.i;
                long j7 = df1Var2.h;
                rf1 rf1Var2 = this.h;
                rf1Var2.getClass();
                vq2 vq2Var = rf1Var2.k;
                if (vq2Var != null && ((long[]) vq2Var.g).length > 0) {
                    qf1Var = new qf1(rf1Var2, j6, 0);
                    i = 0;
                } else if (j7 == -1 || rf1Var2.j <= 0) {
                    i = 0;
                    qf1Var = new qf1(rf1Var2.a(), 0L);
                } else {
                    int i5 = this.j;
                    int i6 = rf1Var2.c;
                    vg0 vg0Var = new vg0(9, rf1Var2);
                    yg1 yg1Var2 = new yg1(rf1Var2, i5);
                    long jA = rf1Var2.a();
                    long j8 = rf1Var2.j;
                    int i7 = rf1Var2.d;
                    if (i7 > 0) {
                        i = 0;
                        j = j7;
                        j2 = ((i7 + i6) / 2) + 1;
                        yg1Var = yg1Var2;
                    } else {
                        i = 0;
                        j = j7;
                        int i8 = rf1Var2.a;
                        long j9 = 4096;
                        if (i8 == rf1Var2.b && i8 > 0) {
                            j9 = i8;
                        }
                        yg1Var = yg1Var2;
                        j2 = (((j9 * rf1Var2.g) * rf1Var2.h) / 8) + 64;
                    }
                    zg1 zg1Var = new zg1(vg0Var, yg1Var, jA, j8, j6, j, j2, Math.max(6, i6));
                    this.k = zg1Var;
                    qf1Var = zg1Var.a;
                }
                nf1Var.v(qf1Var);
                this.f = 5;
                return i;
            }
            this.e.getClass();
            rf1 rf1Var3 = this.h;
            rf1Var3.getClass();
            zg1 zg1Var2 = this.k;
            if (zg1Var2 != null && zg1Var2.c != null) {
                return zg1Var2.b(mf1Var, pf1Var);
            }
            if (this.m == -1) {
                ((df1) mf1Var).k = 0;
                df1 df1Var3 = (df1) mf1Var;
                df1Var3.e(1, false);
                byte[] bArr2 = new byte[1];
                df1Var3.B(bArr2, 0, 1, false);
                int i9 = bArr2[0] & 1;
                boolean z = 1 == i9;
                df1Var3.e(2, false);
                i = 1 != i9 ? 6 : 7;
                kz2 kz2Var3 = new kz2(i);
                byte[] bArr3 = kz2Var3.a;
                int i10 = 0;
                while (i10 < i) {
                    int iY = df1Var3.y(bArr3, i10, i - i10);
                    if (iY == -1) {
                        break;
                    }
                    i10 += iY;
                }
                kz2Var3.C(i10);
                df1Var3.k = 0;
                try {
                    jO = kz2Var3.o();
                    if (!z) {
                        jO *= rf1Var3.b;
                    }
                    j4 = rf1Var3.j;
                } catch (NumberFormatException unused) {
                }
                if (j4 == 0 || jO <= j4) {
                    j5 = jO;
                } else {
                    z = false;
                }
                if (!z) {
                    throw lq1.a(null, null);
                }
                this.m = j5;
            } else {
                kz2 kz2Var4 = this.b;
                int i11 = kz2Var4.c;
                if (i11 < 32768) {
                    int iD = ((df1) mf1Var).d(kz2Var4.a, i11, 32768 - i11);
                    z = iD == -1;
                    if (!z) {
                        kz2Var4.C(i11 + iD);
                    } else if (kz2Var4.B() == 0) {
                        long j10 = this.m * 1000000;
                        rf1 rf1Var4 = this.h;
                        String str2 = v23.a;
                        this.e.c(j10 / rf1Var4.e, 1, this.l, 0, null);
                        return -1;
                    }
                } else {
                    z = false;
                }
                int i12 = kz2Var4.b;
                int i13 = this.l;
                int i14 = this.i;
                if (i13 < i14) {
                    kz2Var4.G(Math.min(i14 - i13, kz2Var4.B()));
                }
                this.h.getClass();
                int i15 = kz2Var4.b;
                while (true) {
                    int i16 = kz2Var4.c - 16;
                    pf1 pf1Var2 = this.c;
                    if (i15 <= i16) {
                        kz2Var4.E(i15);
                        if (i41.K(kz2Var4, this.h, this.j, pf1Var2)) {
                            kz2Var4.E(i15);
                            j3 = pf1Var2.a;
                            break;
                        }
                        i15++;
                    } else {
                        if (z) {
                            while (true) {
                                int i17 = kz2Var4.c;
                                if (i15 > i17 - this.i) {
                                    kz2Var4.E(i17);
                                    break;
                                }
                                kz2Var4.E(i15);
                                try {
                                    zK = i41.K(kz2Var4, this.h, this.j, pf1Var2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zK = false;
                                }
                                if (kz2Var4.b <= kz2Var4.c && zK) {
                                    kz2Var4.E(i15);
                                    j3 = pf1Var2.a;
                                    break;
                                }
                                i15++;
                            }
                        } else {
                            kz2Var4.E(i15);
                        }
                        j3 = -1;
                    }
                }
                int i18 = kz2Var4.b - i12;
                kz2Var4.E(i12);
                this.e.a(kz2Var4, i18, 0);
                int i19 = this.l + i18;
                this.l = i19;
                if (j3 != -1) {
                    long j11 = this.m * 1000000;
                    rf1 rf1Var5 = this.h;
                    String str3 = v23.a;
                    this.e.c(j11 / rf1Var5.e, 1, i19, 0, null);
                    this.l = 0;
                    this.m = j3;
                }
                int length = kz2Var4.a.length - kz2Var4.c;
                if (kz2Var4.B() < 16 && length < 16) {
                    int iB = kz2Var4.B();
                    byte[] bArr4 = kz2Var4.a;
                    System.arraycopy(bArr4, kz2Var4.b, bArr4, 0, iB);
                    kz2Var4.E(0);
                    kz2Var4.C(iB);
                }
            }
            return 0;
        }
        ?? r15 = 0;
        rf1 rf1Var6 = this.h;
        while (true) {
            ((df1) mf1Var).k = r15;
            byte[] bArr5 = new byte[i4];
            lg1 lg1Var = new lg1(i4, bArr5);
            df1 df1Var4 = (df1) mf1Var;
            df1Var4.B(bArr5, r15, i4, r15);
            boolean zQ = lg1Var.q();
            int iR = lg1Var.r(i);
            int iR2 = lg1Var.r(24) + i4;
            if (iR == 0) {
                byte[] bArr6 = new byte[38];
                df1Var4.w(bArr6, r15, 38, r15);
                rf1Var6 = new rf1(i4, bArr6);
            } else {
                if (rf1Var6 == null) {
                    throw new IllegalArgumentException();
                }
                wn1 wn1Var2 = rf1Var6.l;
                if (iR == i3) {
                    kz2 kz2Var5 = new kz2(iR2);
                    df1Var4.w(kz2Var5.a, r15, iR2, r15);
                    rf1Var = new rf1(rf1Var6.a, rf1Var6.b, rf1Var6.c, rf1Var6.d, rf1Var6.e, rf1Var6.g, rf1Var6.h, rf1Var6.j, ob1.B(kz2Var5), rf1Var6.l);
                } else {
                    int i20 = i4;
                    if (iR == i20) {
                        kz2 kz2Var6 = new kz2(iR2);
                        df1Var4.w(kz2Var6.a, 0, iR2, false);
                        kz2Var6.G(i20);
                        wn1 wn1VarA = pu1.A(Arrays.asList((String[]) pu1.v(kz2Var6, false, false).g));
                        if (wn1Var2 != null) {
                            wn1VarA = wn1Var2.b(wn1VarA);
                        }
                        rf1Var = new rf1(rf1Var6.a, rf1Var6.b, rf1Var6.c, rf1Var6.d, rf1Var6.e, rf1Var6.g, rf1Var6.h, rf1Var6.j, rf1Var6.k, wn1VarA);
                    } else if (iR == 6) {
                        kz2 kz2Var7 = new kz2(iR2);
                        df1Var4.w(kz2Var7.a, 0, iR2, false);
                        kz2Var7.G(4);
                        wn1 wn1Var3 = new wn1(xm3.i(nh1.b(kz2Var7)));
                        if (wn1Var2 != null) {
                            wn1Var3 = wn1Var2.b(wn1Var3);
                        }
                        rf1Var = new rf1(rf1Var6.a, rf1Var6.b, rf1Var6.c, rf1Var6.d, rf1Var6.e, rf1Var6.g, rf1Var6.h, rf1Var6.j, rf1Var6.k, wn1Var3);
                    } else {
                        df1Var4.c(iR2, false);
                    }
                }
                rf1Var6 = rf1Var;
            }
            String str4 = v23.a;
            this.h = rf1Var6;
            if (zQ) {
                this.i = Math.max(rf1Var6.c, 6);
                ph4 ph4VarB = this.h.b(bArr, this.g);
                jg1 jg1Var = this.e;
                gg4 gg4Var = new gg4(ph4VarB);
                gg4Var.d("audio/flac");
                jg1Var.d(new ph4(gg4Var));
                this.h.a();
                this.f = 4;
                return 0;
            }
            r15 = 0;
            i3 = 3;
            i4 = 4;
            i = 7;
        }
    }

    @Override // defpackage.lf1
    public final void e(long j, long j2) {
        if (j == 0) {
            this.f = 0;
        } else {
            zg1 zg1Var = this.k;
            if (zg1Var != null) {
                zg1Var.a(j2);
            }
        }
        this.m = j2 != 0 ? -1L : 0L;
        this.l = 0;
        this.b.y(0);
    }

    @Override // defpackage.lf1
    public final void f(nf1 nf1Var) {
        this.d = nf1Var;
        this.e = nf1Var.z(0, 1);
        nf1Var.s();
    }
}
