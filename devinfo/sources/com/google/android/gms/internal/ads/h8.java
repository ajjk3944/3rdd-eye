package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h8 implements j8 {

    /* renamed from: a, reason: collision with root package name */
    public final sk0 f11731a;

    /* renamed from: c, reason: collision with root package name */
    public final String f11733c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11734d;

    /* renamed from: f, reason: collision with root package name */
    public String f11736f;
    public u2 g;

    /* renamed from: i, reason: collision with root package name */
    public int f11738i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long f11739k;

    /* renamed from: l, reason: collision with root package name */
    public mx1 f11740l;

    /* renamed from: m, reason: collision with root package name */
    public int f11741m;

    /* renamed from: n, reason: collision with root package name */
    public int f11742n;

    /* renamed from: h, reason: collision with root package name */
    public int f11737h = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f11745q = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f11732b = new AtomicInteger();

    /* renamed from: o, reason: collision with root package name */
    public int f11743o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f11744p = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String f11735e = "video/mp2t";

    public h8(String str, int i4, int i10) {
        this.f11731a = new sk0(new byte[i10]);
        this.f11733c = str;
        this.f11734d = i4;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void b() {
        this.f11737h = 0;
        this.f11738i = 0;
        this.j = 0;
        this.f11745q = -9223372036854775807L;
        this.f11732b.set(0);
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void c(int i4, long j) {
        this.f11745q = j;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void d(sk0 sk0Var) throws ua {
        long jU;
        int i4;
        int i10;
        int i11;
        int i12;
        int iH;
        int iH2;
        long jU2;
        int i13;
        int i14;
        byte b10;
        int i15;
        byte b11;
        this.g.getClass();
        while (sk0Var.B() > 0) {
            int i16 = this.f11737h;
            sk0 sk0Var2 = this.f11731a;
            if (i16 == 0) {
                while (true) {
                    if (sk0Var.B() > 0) {
                        int i17 = this.j << 8;
                        this.j = i17;
                        int iK = i17 | sk0Var.K();
                        this.j = iK;
                        int iA = nn1.a(iK);
                        this.f11742n = iA;
                        if (iA != 0) {
                            byte[] bArr = sk0Var2.f16446a;
                            int i18 = this.j;
                            bArr[0] = (byte) ((i18 >> 24) & 255);
                            bArr[1] = (byte) ((i18 >> 16) & 255);
                            bArr[2] = (byte) ((i18 >> 8) & 255);
                            bArr[3] = (byte) (i18 & 255);
                            this.f11738i = 4;
                            this.j = 0;
                            if (iA == 3 || iA == 4) {
                                this.f11737h = 4;
                            } else if (iA == 1) {
                                this.f11737h = 1;
                            } else {
                                this.f11737h = 2;
                            }
                        }
                    }
                }
            } else if (i16 != 1) {
                if (i16 != 2) {
                    int iH3 = -2147483647;
                    if (i16 != 3) {
                        if (i16 != 4) {
                            if (i16 != 5) {
                                int iMin = Math.min(sk0Var.B(), this.f11741m - this.f11738i);
                                this.g.b(iMin, sk0Var);
                                int i19 = this.f11738i + iMin;
                                this.f11738i = i19;
                                if (i19 == this.f11741m) {
                                    mq0.c0(this.f11745q != -9223372036854775807L);
                                    this.g.d(this.f11745q, this.f11742n == 4 ? 0 : 1, this.f11741m, 0, null);
                                    this.f11745q += this.f11739k;
                                    this.f11737h = 0;
                                }
                            } else if (f(sk0Var, sk0Var2.f16446a, this.f11744p)) {
                                byte[] bArr2 = sk0Var2.f16446a;
                                hk0 hk0VarG = nn1.G(bArr2);
                                int iH4 = hk0VarG.h(32);
                                int iD = nn1.D(hk0VarG, nn1.f14342e);
                                int i20 = iD + 1;
                                char c9 = iH4 == 1078008818 ? (char) 1 : (char) 0;
                                if (c9 == 0) {
                                    jU = -9223372036854775807L;
                                } else {
                                    if (!hk0VarG.g()) {
                                        throw ua.b("Only supports full channel mask-based audio presentation");
                                    }
                                    int i21 = iD - 1;
                                    int i22 = bArr2[i21] << 8;
                                    int i23 = bArr2[iD] & 255;
                                    String str = bq0.f9768a;
                                    char c10 = 65535;
                                    for (int i24 = 0; i24 < i21; i24++) {
                                        byte b12 = bArr2[i24];
                                        int[] iArr = bq0.f9774h;
                                        char c11 = (char) (iArr[((c10 >> '\f') ^ ((b12 & 255) >> 4)) & 255] ^ ((char) (c10 << 4)));
                                        c10 = (char) (((char) (c11 << 4)) ^ iArr[((b12 & 15) ^ (c11 >> '\f')) & 255]);
                                    }
                                    if ((((char) i22) | i23) != c10) {
                                        throw ua.a(null, "CRC check failed");
                                    }
                                    int iH5 = hk0VarG.h(2);
                                    if (iH5 != 0) {
                                        if (iH5 == 1) {
                                            i10 = 480;
                                        } else {
                                            if (iH5 != 2) {
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(iH5).length() + 51);
                                                sb2.append("Unsupported base duration index in DTS UHD header: ");
                                                sb2.append(iH5);
                                                throw ua.a(null, sb2.toString());
                                            }
                                            i10 = 384;
                                        }
                                        i4 = 3;
                                    } else {
                                        i4 = 3;
                                        i10 = 512;
                                    }
                                    int iH6 = hk0VarG.h(i4) + 1;
                                    int iH7 = hk0VarG.h(2);
                                    if (iH7 == 0) {
                                        i11 = 32000;
                                    } else if (iH7 == 1) {
                                        i11 = 44100;
                                    } else {
                                        if (iH7 != 2) {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(iH7).length() + 48);
                                            sb3.append("Unsupported clock rate index in DTS UHD header: ");
                                            sb3.append(iH7);
                                            throw ua.a(null, sb3.toString());
                                        }
                                        i11 = 48000;
                                    }
                                    if (hk0VarG.g()) {
                                        hk0VarG.f(36);
                                    }
                                    iH3 = i11 * (1 << hk0VarG.h(2));
                                    jU = bq0.u(i10 * iH6, 1000000L, i11, RoundingMode.DOWN);
                                }
                                int i25 = iH3;
                                int iD2 = 0;
                                for (char c12 = 0; c12 < c9; c12 = 1) {
                                    iD2 += nn1.D(hk0VarG, nn1.f14343f);
                                }
                                for (int i26 = 0; i26 <= 0; i26++) {
                                    AtomicInteger atomicInteger = this.f11732b;
                                    if (c9 != 0) {
                                        atomicInteger.set(nn1.D(hk0VarG, nn1.g));
                                    }
                                    iD2 += atomicInteger.get() != 0 ? nn1.D(hk0VarG, nn1.f14344h) : 0;
                                }
                                int i27 = i20 + iD2;
                                long j = jU;
                                k1 k1Var = new k1("audio/vnd.dts.uhd;profile=p2", 2, i25, i27, j);
                                if (this.f11742n == 3) {
                                    g(k1Var);
                                }
                                this.f11741m = i27;
                                if (j == -9223372036854775807L) {
                                    j = 0;
                                }
                                this.f11739k = j;
                                sk0Var2.E(0);
                                this.g.b(this.f11744p, sk0Var2);
                                this.f11737h = 6;
                            } else {
                                continue;
                            }
                        } else if (f(sk0Var, sk0Var2.f16446a, 6)) {
                            hk0 hk0VarG2 = nn1.G(sk0Var2.f16446a);
                            hk0VarG2.f(32);
                            int iD3 = nn1.D(hk0VarG2, nn1.f14345i) + 1;
                            this.f11744p = iD3;
                            int i28 = this.f11738i;
                            if (i28 > iD3) {
                                int i29 = i28 - iD3;
                                this.f11738i = i28 - i29;
                                sk0Var.E(sk0Var.f16447b - i29);
                            }
                            this.f11737h = 5;
                        }
                    } else if (f(sk0Var, sk0Var2.f16446a, this.f11743o)) {
                        hk0 hk0VarG3 = nn1.G(sk0Var2.f16446a);
                        hk0VarG3.f(40);
                        int iH8 = hk0VarG3.h(2);
                        boolean zG = hk0VarG3.g();
                        int i30 = true != zG ? 16 : 20;
                        hk0VarG3.f(true != zG ? 8 : 12);
                        int iH9 = hk0VarG3.h(i30) + 1;
                        boolean zG2 = hk0VarG3.g();
                        if (zG2) {
                            iH = hk0VarG3.h(2);
                            int iH10 = hk0VarG3.h(3) + 1;
                            if (hk0VarG3.g()) {
                                hk0VarG3.f(36);
                            }
                            int iH11 = hk0VarG3.h(3) + 1;
                            int iH12 = hk0VarG3.h(3) + 1;
                            if (iH11 != 1 || iH12 != 1) {
                                throw ua.b("Multiple audio presentations or assets not supported");
                            }
                            int i31 = iH8 + 1;
                            int iH13 = hk0VarG3.h(i31);
                            for (int i32 = 0; i32 < i31; i32++) {
                                if (((iH13 >> i32) & 1) == 1) {
                                    hk0VarG3.f(8);
                                }
                            }
                            i12 = iH10 * 512;
                            if (hk0VarG3.g()) {
                                hk0VarG3.f(2);
                                int iH14 = (hk0VarG3.h(2) + 1) << 2;
                                int iH15 = hk0VarG3.h(2) + 1;
                                for (int i33 = 0; i33 < iH15; i33++) {
                                    hk0VarG3.f(iH14);
                                }
                            }
                        } else {
                            i12 = 0;
                            iH = -1;
                        }
                        hk0VarG3.f(i30);
                        hk0VarG3.f(12);
                        if (zG2) {
                            if (hk0VarG3.g()) {
                                hk0VarG3.f(4);
                            }
                            if (hk0VarG3.g()) {
                                hk0VarG3.f(24);
                            }
                            if (hk0VarG3.g()) {
                                hk0VarG3.l(hk0VarG3.h(10) + 1);
                            }
                            hk0VarG3.f(5);
                            iH3 = nn1.f14341d[hk0VarG3.h(4)];
                            iH2 = hk0VarG3.h(8) + 1;
                        } else {
                            iH2 = -1;
                        }
                        int i34 = iH3;
                        if (zG2) {
                            if (iH == 0) {
                                i13 = 32000;
                            } else if (iH == 1) {
                                i13 = 44100;
                            } else {
                                if (iH != 2) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(iH).length() + 51);
                                    sb4.append("Unsupported reference clock code in DTS HD header: ");
                                    sb4.append(iH);
                                    throw ua.a(null, sb4.toString());
                                }
                                i13 = 48000;
                            }
                            jU2 = bq0.u(i12, 1000000L, i13, RoundingMode.DOWN);
                        } else {
                            jU2 = -9223372036854775807L;
                        }
                        g(new k1("audio/vnd.dts.hd;profile=lbr", iH2, i34, iH9, jU2));
                        this.f11741m = iH9;
                        this.f11739k = jU2 == -9223372036854775807L ? 0L : jU2;
                        sk0Var2.E(0);
                        this.g.b(this.f11743o, sk0Var2);
                        this.f11737h = 6;
                    } else {
                        continue;
                    }
                } else if (f(sk0Var, sk0Var2.f16446a, 7)) {
                    hk0 hk0VarG4 = nn1.G(sk0Var2.f16446a);
                    hk0VarG4.f(42);
                    this.f11743o = hk0VarG4.h(true == hk0VarG4.g() ? 12 : 8) + 1;
                    this.f11737h = 3;
                }
            } else if (f(sk0Var, sk0Var2.f16446a, 18)) {
                byte[] bArr3 = sk0Var2.f16446a;
                if (this.f11740l == null) {
                    String str2 = this.f11736f;
                    hk0 hk0VarG5 = nn1.G(bArr3);
                    hk0VarG5.f(60);
                    int i35 = nn1.f14338a[hk0VarG5.h(6)];
                    int i36 = nn1.f14339b[hk0VarG5.h(4)];
                    int iH16 = hk0VarG5.h(5);
                    int i37 = iH16 >= 29 ? -1 : (nn1.f14340c[iH16] * 1000) / 2;
                    hk0VarG5.f(10);
                    int i38 = i35 + (hk0VarG5.h(2) > 0 ? 1 : 0);
                    lw1 lw1Var = new lw1();
                    lw1Var.f13652a = str2;
                    lw1Var.d("video/mp2t");
                    lw1Var.e("audio/vnd.dts");
                    lw1Var.g = i37;
                    lw1Var.D = i38;
                    lw1Var.E = i36;
                    lw1Var.f13665p = null;
                    lw1Var.f13655d = this.f11733c;
                    lw1Var.f13657f = this.f11734d;
                    mx1 mx1Var = new mx1(lw1Var);
                    this.f11740l = mx1Var;
                    this.g.f(mx1Var);
                }
                this.f11741m = nn1.o(bArr3);
                byte b13 = bArr3[0];
                if (b13 != -2) {
                    if (b13 == -1) {
                        i14 = (bArr3[4] & 7) << 4;
                        b11 = bArr3[7];
                    } else if (b13 != 31) {
                        i14 = (bArr3[4] & 1) << 6;
                        b10 = bArr3[5];
                    } else {
                        i14 = (bArr3[5] & 7) << 4;
                        b11 = bArr3[6];
                    }
                    i15 = b11 & 60;
                    this.f11739k = al0.d(bq0.t(this.f11740l.F, (((i15 >> 2) | i14) + 1) * 32));
                    sk0Var2.E(0);
                    this.g.b(18, sk0Var2);
                    this.f11737h = 6;
                } else {
                    i14 = (bArr3[5] & 1) << 6;
                    b10 = bArr3[4];
                }
                i15 = b10 & 252;
                this.f11739k = al0.d(bq0.t(this.f11740l.F, (((i15 >> 2) | i14) + 1) * 32));
                sk0Var2.E(0);
                this.g.b(18, sk0Var2);
                this.f11737h = 6;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void e(z1 z1Var, h9 h9Var) {
        h9Var.a();
        h9Var.b();
        this.f11736f = h9Var.f11777e;
        h9Var.b();
        this.g = z1Var.m(h9Var.f11776d, 1);
    }

    public final boolean f(sk0 sk0Var, byte[] bArr, int i4) {
        int iMin = Math.min(sk0Var.B(), i4 - this.f11738i);
        sk0Var.H(this.f11738i, iMin, bArr);
        int i10 = this.f11738i + iMin;
        this.f11738i = i10;
        return i10 == i4;
    }

    public final void g(k1 k1Var) {
        int i4;
        int i10 = k1Var.f12920b;
        String str = k1Var.f12919a;
        if (i10 == -2147483647 || (i4 = k1Var.f12921c) == -1) {
            return;
        }
        mx1 mx1Var = this.f11740l;
        if (mx1Var != null && i4 == mx1Var.E && i10 == mx1Var.F && str.equals(mx1Var.f14052m)) {
            return;
        }
        mx1 mx1Var2 = this.f11740l;
        lw1 lw1Var = mx1Var2 == null ? new lw1() : new lw1(mx1Var2);
        lw1Var.f13652a = this.f11736f;
        lw1Var.d(this.f11735e);
        lw1Var.e(str);
        lw1Var.D = i4;
        lw1Var.E = i10;
        lw1Var.f13655d = this.f11733c;
        lw1Var.f13657f = this.f11734d;
        mx1 mx1Var3 = new mx1(lw1Var);
        this.f11740l = mx1Var3;
        this.g.f(mx1Var3);
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void a(boolean z3) {
    }
}
