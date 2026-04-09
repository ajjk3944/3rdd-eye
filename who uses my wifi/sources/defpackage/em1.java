package defpackage;

import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class em1 implements gm1 {
    public final kz2 a;
    public final String c;
    public final int d;
    public String f;
    public jg1 g;
    public int i;
    public int j;
    public long k;
    public ph4 l;
    public int m;
    public int n;
    public int h = 0;
    public long q = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int o = -1;
    public int p = -1;
    public final String e = "video/mp2t";

    public em1(String str, int i, int i2) {
        this.a = new kz2(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.gm1
    public final void a() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // defpackage.gm1
    public final void b(kz2 kz2Var) throws lq1 {
        long jT;
        int i;
        int i2;
        int i3;
        int iR;
        int iR2;
        long jT2;
        int i4;
        int i5;
        byte b;
        int i6;
        byte b2;
        this.g.getClass();
        while (kz2Var.B() > 0) {
            int i7 = this.h;
            kz2 kz2Var2 = this.a;
            if (i7 == 0) {
                while (true) {
                    if (kz2Var.B() > 0) {
                        int i8 = this.j << 8;
                        this.j = i8;
                        int iK = i8 | kz2Var.K();
                        this.j = iK;
                        int iW = qb1.w(iK);
                        this.n = iW;
                        if (iW != 0) {
                            byte[] bArr = kz2Var2.a;
                            int i9 = this.j;
                            bArr[0] = (byte) ((i9 >> 24) & 255);
                            bArr[1] = (byte) ((i9 >> 16) & 255);
                            bArr[2] = (byte) ((i9 >> 8) & 255);
                            bArr[3] = (byte) (i9 & 255);
                            this.i = 4;
                            this.j = 0;
                            if (iW == 3 || iW == 4) {
                                this.h = 4;
                            } else if (iW == 1) {
                                this.h = 1;
                            } else {
                                this.h = 2;
                            }
                        }
                    }
                }
            } else if (i7 != 1) {
                if (i7 != 2) {
                    int iR3 = -2147483647;
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                int iMin = Math.min(kz2Var.B(), this.m - this.i);
                                this.g.a(kz2Var, iMin, 0);
                                int i10 = this.i + iMin;
                                this.i = i10;
                                if (i10 == this.m) {
                                    zt0.b0(this.q != -9223372036854775807L);
                                    this.g.c(this.q, this.n == 4 ? 0 : 1, this.m, 0, null);
                                    this.q += this.k;
                                    this.h = 0;
                                }
                            } else if (f(kz2Var, kz2Var2.a, this.p)) {
                                byte[] bArr2 = kz2Var2.a;
                                lg1 lg1VarQ = qb1.Q(bArr2);
                                int iR4 = lg1VarQ.r(32);
                                int iO = qb1.O(lg1VarQ, qb1.m);
                                int i11 = iO + 1;
                                char c = iR4 == 1078008818 ? (char) 1 : (char) 0;
                                if (c == 0) {
                                    jT = -9223372036854775807L;
                                } else {
                                    if (!lg1VarQ.q()) {
                                        throw lq1.b("Only supports full channel mask-based audio presentation");
                                    }
                                    int i12 = iO - 1;
                                    int i13 = bArr2[i12] << 8;
                                    int i14 = bArr2[iO] & 255;
                                    String str = v23.a;
                                    char c2 = 65535;
                                    for (int i15 = 0; i15 < i12; i15++) {
                                        int unsignedInt = Byte.toUnsignedInt(bArr2[i15]);
                                        int[] iArr = v23.h;
                                        char c3 = (char) (iArr[((c2 >> '\f') ^ (unsignedInt >> 4)) & 255] ^ ((char) (c2 << 4)));
                                        c2 = (char) (((char) (c3 << 4)) ^ iArr[((c3 >> '\f') ^ (unsignedInt & 15)) & 255]);
                                    }
                                    if ((((char) i13) | i14) != c2) {
                                        throw lq1.a(null, "CRC check failed");
                                    }
                                    int iR5 = lg1VarQ.r(2);
                                    if (iR5 == 0) {
                                        i = 512;
                                    } else if (iR5 == 1) {
                                        i = 480;
                                    } else {
                                        if (iR5 != 2) {
                                            StringBuilder sb = new StringBuilder(String.valueOf(iR5).length() + 51);
                                            sb.append("Unsupported base duration index in DTS UHD header: ");
                                            sb.append(iR5);
                                            throw lq1.a(null, sb.toString());
                                        }
                                        i = 384;
                                    }
                                    int iR6 = lg1VarQ.r(3) + 1;
                                    int iR7 = lg1VarQ.r(2);
                                    if (iR7 == 0) {
                                        i2 = 32000;
                                    } else if (iR7 == 1) {
                                        i2 = 44100;
                                    } else {
                                        if (iR7 != 2) {
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(iR7).length() + 48);
                                            sb2.append("Unsupported clock rate index in DTS UHD header: ");
                                            sb2.append(iR7);
                                            throw lq1.a(null, sb2.toString());
                                        }
                                        i2 = 48000;
                                    }
                                    if (lg1VarQ.q()) {
                                        lg1VarQ.o(36);
                                    }
                                    iR3 = i2 * (1 << lg1VarQ.r(2));
                                    jT = v23.t(i * iR6, 1000000L, i2, RoundingMode.DOWN);
                                }
                                int i16 = iR3;
                                int iO2 = 0;
                                for (char c4 = 0; c4 < c; c4 = 1) {
                                    iO2 += qb1.O(lg1VarQ, qb1.n);
                                }
                                for (int i17 = 0; i17 <= 0; i17++) {
                                    AtomicInteger atomicInteger = this.b;
                                    if (c != 0) {
                                        atomicInteger.set(qb1.O(lg1VarQ, qb1.o));
                                    }
                                    iO2 += atomicInteger.get() != 0 ? qb1.O(lg1VarQ, qb1.p) : 0;
                                }
                                int i18 = i11 + iO2;
                                long j = jT;
                                qe1 qe1Var = new qe1("audio/vnd.dts.uhd;profile=p2", 2, i16, i18, j);
                                if (this.n == 3) {
                                    g(qe1Var);
                                }
                                this.m = i18;
                                if (j == -9223372036854775807L) {
                                    j = 0;
                                }
                                this.k = j;
                                kz2Var2.E(0);
                                this.g.a(kz2Var2, this.p, 0);
                                this.h = 6;
                            } else {
                                continue;
                            }
                        } else if (f(kz2Var, kz2Var2.a, 6)) {
                            lg1 lg1VarQ2 = qb1.Q(kz2Var2.a);
                            lg1VarQ2.o(32);
                            int iO3 = qb1.O(lg1VarQ2, qb1.q) + 1;
                            this.p = iO3;
                            int i19 = this.i;
                            if (i19 > iO3) {
                                int i20 = i19 - iO3;
                                this.i = i19 - i20;
                                kz2Var.E(kz2Var.b - i20);
                            }
                            this.h = 5;
                        }
                    } else if (f(kz2Var, kz2Var2.a, this.o)) {
                        lg1 lg1VarQ3 = qb1.Q(kz2Var2.a);
                        lg1VarQ3.o(40);
                        int iR8 = lg1VarQ3.r(2);
                        boolean zQ = lg1VarQ3.q();
                        int i21 = true != zQ ? 16 : 20;
                        lg1VarQ3.o(true != zQ ? 8 : 12);
                        int iR9 = lg1VarQ3.r(i21) + 1;
                        boolean zQ2 = lg1VarQ3.q();
                        if (zQ2) {
                            iR = lg1VarQ3.r(2);
                            int iR10 = lg1VarQ3.r(3) + 1;
                            if (lg1VarQ3.q()) {
                                lg1VarQ3.o(36);
                            }
                            int iR11 = lg1VarQ3.r(3) + 1;
                            int iR12 = lg1VarQ3.r(3) + 1;
                            if (iR11 != 1 || iR12 != 1) {
                                throw lq1.b("Multiple audio presentations or assets not supported");
                            }
                            int i22 = iR8 + 1;
                            int iR13 = lg1VarQ3.r(i22);
                            for (int i23 = 0; i23 < i22; i23++) {
                                if (((iR13 >> i23) & 1) == 1) {
                                    lg1VarQ3.o(8);
                                }
                            }
                            i3 = iR10 * 512;
                            if (lg1VarQ3.q()) {
                                lg1VarQ3.o(2);
                                int iR14 = (lg1VarQ3.r(2) + 1) << 2;
                                int iR15 = lg1VarQ3.r(2) + 1;
                                for (int i24 = 0; i24 < iR15; i24++) {
                                    lg1VarQ3.o(iR14);
                                }
                            }
                        } else {
                            i3 = 0;
                            iR = -1;
                        }
                        lg1VarQ3.o(i21);
                        lg1VarQ3.o(12);
                        if (zQ2) {
                            if (lg1VarQ3.q()) {
                                lg1VarQ3.o(4);
                            }
                            if (lg1VarQ3.q()) {
                                lg1VarQ3.o(24);
                            }
                            if (lg1VarQ3.q()) {
                                lg1VarQ3.x(lg1VarQ3.r(10) + 1);
                            }
                            lg1VarQ3.o(5);
                            iR3 = qb1.l[lg1VarQ3.r(4)];
                            iR2 = lg1VarQ3.r(8) + 1;
                        } else {
                            iR2 = -1;
                        }
                        int i25 = iR3;
                        if (zQ2) {
                            if (iR == 0) {
                                i4 = 32000;
                            } else if (iR == 1) {
                                i4 = 44100;
                            } else {
                                if (iR != 2) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(iR).length() + 51);
                                    sb3.append("Unsupported reference clock code in DTS HD header: ");
                                    sb3.append(iR);
                                    throw lq1.a(null, sb3.toString());
                                }
                                i4 = 48000;
                            }
                            jT2 = v23.t(i3, 1000000L, i4, RoundingMode.DOWN);
                        } else {
                            jT2 = -9223372036854775807L;
                        }
                        g(new qe1("audio/vnd.dts.hd;profile=lbr", iR2, i25, iR9, jT2));
                        this.m = iR9;
                        this.k = jT2 == -9223372036854775807L ? 0L : jT2;
                        kz2Var2.E(0);
                        this.g.a(kz2Var2, this.o, 0);
                        this.h = 6;
                    } else {
                        continue;
                    }
                } else if (f(kz2Var, kz2Var2.a, 7)) {
                    lg1 lg1VarQ4 = qb1.Q(kz2Var2.a);
                    lg1VarQ4.o(42);
                    this.o = lg1VarQ4.r(true == lg1VarQ4.q() ? 12 : 8) + 1;
                    this.h = 3;
                }
            } else if (f(kz2Var, kz2Var2.a, 18)) {
                byte[] bArr3 = kz2Var2.a;
                if (this.l == null) {
                    String str2 = this.f;
                    lg1 lg1VarQ5 = qb1.Q(bArr3);
                    lg1VarQ5.o(60);
                    int i26 = qb1.i[lg1VarQ5.r(6)];
                    int i27 = qb1.j[lg1VarQ5.r(4)];
                    int iR16 = lg1VarQ5.r(5);
                    int i28 = iR16 >= 29 ? -1 : (qb1.k[iR16] * 1000) / 2;
                    lg1VarQ5.o(10);
                    int i29 = i26 + (lg1VarQ5.r(2) > 0 ? 1 : 0);
                    gg4 gg4Var = new gg4();
                    gg4Var.a = str2;
                    gg4Var.d("video/mp2t");
                    gg4Var.e("audio/vnd.dts");
                    gg4Var.g = i28;
                    gg4Var.D = i29;
                    gg4Var.E = i27;
                    gg4Var.p = null;
                    gg4Var.d = this.c;
                    gg4Var.f = this.d;
                    ph4 ph4Var = new ph4(gg4Var);
                    this.l = ph4Var;
                    this.g.d(ph4Var);
                }
                this.m = qb1.D(bArr3);
                byte b3 = bArr3[0];
                if (b3 != -2) {
                    if (b3 == -1) {
                        i5 = (bArr3[4] & 7) << 4;
                        b2 = bArr3[7];
                    } else if (b3 != 31) {
                        i5 = (bArr3[4] & 1) << 6;
                        b = bArr3[5];
                    } else {
                        i5 = (bArr3[5] & 7) << 4;
                        b2 = bArr3[6];
                    }
                    i6 = b2 & 60;
                    this.k = zt0.y(v23.s(this.l.F, (((i6 >> 2) | i5) + 1) * 32));
                    kz2Var2.E(0);
                    this.g.a(kz2Var2, 18, 0);
                    this.h = 6;
                } else {
                    i5 = (bArr3[5] & 1) << 6;
                    b = bArr3[4];
                }
                i6 = b & 252;
                this.k = zt0.y(v23.s(this.l.F, (((i6 >> 2) | i5) + 1) * 32));
                kz2Var2.E(0);
                this.g.a(kz2Var2, 18, 0);
                this.h = 6;
            }
        }
    }

    @Override // defpackage.gm1
    public final void d(int i, long j) {
        this.q = j;
    }

    @Override // defpackage.gm1
    public final void e(nf1 nf1Var, in1 in1Var) {
        in1Var.a();
        in1Var.b();
        this.f = in1Var.e;
        in1Var.b();
        this.g = nf1Var.z(in1Var.d, 1);
    }

    public final boolean f(kz2 kz2Var, byte[] bArr, int i) {
        int iMin = Math.min(kz2Var.B(), i - this.i);
        kz2Var.H(bArr, this.i, iMin);
        int i2 = this.i + iMin;
        this.i = i2;
        return i2 == i;
    }

    public final void g(qe1 qe1Var) {
        int i;
        int i2 = qe1Var.b;
        String str = qe1Var.a;
        if (i2 == -2147483647 || (i = qe1Var.c) == -1) {
            return;
        }
        ph4 ph4Var = this.l;
        if (ph4Var != null && i == ph4Var.E && i2 == ph4Var.F && str.equals(ph4Var.m)) {
            return;
        }
        ph4 ph4Var2 = this.l;
        gg4 gg4Var = ph4Var2 == null ? new gg4() : new gg4(ph4Var2);
        gg4Var.a = this.f;
        gg4Var.d(this.e);
        gg4Var.e(str);
        gg4Var.D = i;
        gg4Var.E = i2;
        gg4Var.d = this.c;
        gg4Var.f = this.d;
        ph4 ph4Var3 = new ph4(gg4Var);
        this.l = ph4Var3;
        this.g.d(ph4Var3);
    }

    @Override // defpackage.gm1
    public final void c(boolean z) {
    }
}
