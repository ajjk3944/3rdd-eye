package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class G3 implements I3 {

    /* renamed from: a, reason: collision with root package name */
    public final C2036vr f8269a;

    /* renamed from: c, reason: collision with root package name */
    public final String f8271c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8272d;

    /* renamed from: f, reason: collision with root package name */
    public String f8274f;

    /* renamed from: g, reason: collision with root package name */
    public T0 f8275g;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f8277j;

    /* renamed from: k, reason: collision with root package name */
    public long f8278k;

    /* renamed from: l, reason: collision with root package name */
    public TP f8279l;

    /* renamed from: m, reason: collision with root package name */
    public int f8280m;

    /* renamed from: n, reason: collision with root package name */
    public int f8281n;

    /* renamed from: h, reason: collision with root package name */
    public int f8276h = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f8284q = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f8270b = new AtomicInteger();

    /* renamed from: o, reason: collision with root package name */
    public int f8282o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f8283p = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String f8273e = "video/mp2t";

    public G3(String str, int i, int i3) {
        this.f8269a = new C2036vr(new byte[i3]);
        this.f8271c = str;
        this.f8272d = i;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void a() {
        this.f8276h = 0;
        this.i = 0;
        this.f8277j = 0;
        this.f8284q = -9223372036854775807L;
        this.f8270b.set(0);
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void b(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void c(int i, long j6) {
        this.f8284q = j6;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void d(C2036vr c2036vr) throws P4 {
        long jU;
        int i;
        int i3;
        int i6;
        int i7;
        int iH;
        int iH2;
        long jU2;
        int i8;
        int i9;
        byte b5;
        int i10;
        byte b6;
        this.f8275g.getClass();
        while (c2036vr.B() > 0) {
            int i11 = this.f8276h;
            C2036vr c2036vr2 = this.f8269a;
            if (i11 == 0) {
                while (true) {
                    if (c2036vr.B() > 0) {
                        int i12 = this.f8277j << 8;
                        this.f8277j = i12;
                        int iK = i12 | c2036vr.K();
                        this.f8277j = iK;
                        int iA = AbstractC0933bL.a(iK);
                        this.f8281n = iA;
                        if (iA != 0) {
                            byte[] bArr = c2036vr2.f17354a;
                            int i13 = this.f8277j;
                            bArr[0] = (byte) ((i13 >> 24) & 255);
                            bArr[1] = (byte) ((i13 >> 16) & 255);
                            bArr[2] = (byte) ((i13 >> 8) & 255);
                            bArr[3] = (byte) (i13 & 255);
                            this.i = 4;
                            this.f8277j = 0;
                            if (iA == 3 || iA == 4) {
                                this.f8276h = 4;
                            } else if (iA == 1) {
                                this.f8276h = 1;
                            } else {
                                this.f8276h = 2;
                            }
                        }
                    }
                }
            } else if (i11 != 1) {
                if (i11 != 2) {
                    int iH3 = -2147483647;
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                int iMin = Math.min(c2036vr.B(), this.f8280m - this.i);
                                this.f8275g.a(iMin, c2036vr);
                                int i14 = this.i + iMin;
                                this.i = i14;
                                if (i14 == this.f8280m) {
                                    AbstractC0582Jp.h0(this.f8284q != -9223372036854775807L);
                                    this.f8275g.c(this.f8284q, this.f8281n == 4 ? 0 : 1, this.f8280m, 0, null);
                                    this.f8284q += this.f8278k;
                                    this.f8276h = 0;
                                }
                            } else if (f(c2036vr, c2036vr2.f17354a, this.f8283p)) {
                                byte[] bArr2 = c2036vr2.f17354a;
                                C1443kr c1443krK = AbstractC0933bL.K(bArr2);
                                int iH4 = c1443krK.h(32);
                                int I6 = AbstractC0933bL.I(c1443krK, AbstractC0933bL.f13355e);
                                int i15 = I6 + 1;
                                char c6 = iH4 == 1078008818 ? (char) 1 : (char) 0;
                                if (c6 == 0) {
                                    jU = -9223372036854775807L;
                                } else {
                                    if (!c1443krK.g()) {
                                        throw P4.b("Only supports full channel mask-based audio presentation");
                                    }
                                    int i16 = I6 - 1;
                                    int i17 = bArr2[i16] << 8;
                                    int i18 = bArr2[I6] & 255;
                                    String str = Vt.f12096a;
                                    char c7 = 65535;
                                    for (int i19 = 0; i19 < i16; i19++) {
                                        byte b7 = bArr2[i19];
                                        int[] iArr = Vt.f12103h;
                                        char c8 = (char) (iArr[((c7 >> '\f') ^ ((b7 & 255) >> 4)) & 255] ^ ((char) (c7 << 4)));
                                        c7 = (char) (((char) (c8 << 4)) ^ iArr[((b7 & 15) ^ (c8 >> '\f')) & 255]);
                                    }
                                    if ((((char) i17) | i18) != c7) {
                                        throw P4.a(null, "CRC check failed");
                                    }
                                    int iH5 = c1443krK.h(2);
                                    if (iH5 != 0) {
                                        if (iH5 == 1) {
                                            i3 = 480;
                                        } else {
                                            if (iH5 != 2) {
                                                StringBuilder sb = new StringBuilder(String.valueOf(iH5).length() + 51);
                                                sb.append("Unsupported base duration index in DTS UHD header: ");
                                                sb.append(iH5);
                                                throw P4.a(null, sb.toString());
                                            }
                                            i3 = 384;
                                        }
                                        i = 3;
                                    } else {
                                        i = 3;
                                        i3 = 512;
                                    }
                                    int iH6 = c1443krK.h(i) + 1;
                                    int iH7 = c1443krK.h(2);
                                    if (iH7 == 0) {
                                        i6 = 32000;
                                    } else if (iH7 == 1) {
                                        i6 = 44100;
                                    } else {
                                        if (iH7 != 2) {
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(iH7).length() + 48);
                                            sb2.append("Unsupported clock rate index in DTS UHD header: ");
                                            sb2.append(iH7);
                                            throw P4.a(null, sb2.toString());
                                        }
                                        i6 = 48000;
                                    }
                                    if (c1443krK.g()) {
                                        c1443krK.f(36);
                                    }
                                    iH3 = i6 * (1 << c1443krK.h(2));
                                    jU = Vt.u(i3 * iH6, 1000000L, i6, RoundingMode.DOWN);
                                }
                                int i20 = iH3;
                                int I7 = 0;
                                for (char c9 = 0; c9 < c6; c9 = 1) {
                                    I7 += AbstractC0933bL.I(c1443krK, AbstractC0933bL.f13356f);
                                }
                                for (int i21 = 0; i21 <= 0; i21++) {
                                    AtomicInteger atomicInteger = this.f8270b;
                                    if (c6 != 0) {
                                        atomicInteger.set(AbstractC0933bL.I(c1443krK, AbstractC0933bL.f13357g));
                                    }
                                    I7 += atomicInteger.get() != 0 ? AbstractC0933bL.I(c1443krK, AbstractC0933bL.f13358h) : 0;
                                }
                                int i22 = i15 + I7;
                                long j6 = jU;
                                C1239h0 c1239h0 = new C1239h0("audio/vnd.dts.uhd;profile=p2", 2, i20, i22, j6);
                                if (this.f8281n == 3) {
                                    g(c1239h0);
                                }
                                this.f8280m = i22;
                                if (j6 == -9223372036854775807L) {
                                    j6 = 0;
                                }
                                this.f8278k = j6;
                                c2036vr2.E(0);
                                this.f8275g.a(this.f8283p, c2036vr2);
                                this.f8276h = 6;
                            } else {
                                continue;
                            }
                        } else if (f(c2036vr, c2036vr2.f17354a, 6)) {
                            C1443kr c1443krK2 = AbstractC0933bL.K(c2036vr2.f17354a);
                            c1443krK2.f(32);
                            int I8 = AbstractC0933bL.I(c1443krK2, AbstractC0933bL.i) + 1;
                            this.f8283p = I8;
                            int i23 = this.i;
                            if (i23 > I8) {
                                int i24 = i23 - I8;
                                this.i = i23 - i24;
                                c2036vr.E(c2036vr.f17355b - i24);
                            }
                            this.f8276h = 5;
                        }
                    } else if (f(c2036vr, c2036vr2.f17354a, this.f8282o)) {
                        C1443kr c1443krK3 = AbstractC0933bL.K(c2036vr2.f17354a);
                        c1443krK3.f(40);
                        int iH8 = c1443krK3.h(2);
                        boolean zG = c1443krK3.g();
                        int i25 = true != zG ? 16 : 20;
                        c1443krK3.f(true != zG ? 8 : 12);
                        int iH9 = c1443krK3.h(i25) + 1;
                        boolean zG2 = c1443krK3.g();
                        if (zG2) {
                            iH = c1443krK3.h(2);
                            int iH10 = c1443krK3.h(3) + 1;
                            if (c1443krK3.g()) {
                                c1443krK3.f(36);
                            }
                            int iH11 = c1443krK3.h(3) + 1;
                            int iH12 = c1443krK3.h(3) + 1;
                            if (iH11 != 1 || iH12 != 1) {
                                throw P4.b("Multiple audio presentations or assets not supported");
                            }
                            int i26 = iH8 + 1;
                            int iH13 = c1443krK3.h(i26);
                            for (int i27 = 0; i27 < i26; i27++) {
                                if (((iH13 >> i27) & 1) == 1) {
                                    c1443krK3.f(8);
                                }
                            }
                            i7 = iH10 * 512;
                            if (c1443krK3.g()) {
                                c1443krK3.f(2);
                                int iH14 = (c1443krK3.h(2) + 1) << 2;
                                int iH15 = c1443krK3.h(2) + 1;
                                for (int i28 = 0; i28 < iH15; i28++) {
                                    c1443krK3.f(iH14);
                                }
                            }
                        } else {
                            i7 = 0;
                            iH = -1;
                        }
                        c1443krK3.f(i25);
                        c1443krK3.f(12);
                        if (zG2) {
                            if (c1443krK3.g()) {
                                c1443krK3.f(4);
                            }
                            if (c1443krK3.g()) {
                                c1443krK3.f(24);
                            }
                            if (c1443krK3.g()) {
                                c1443krK3.l(c1443krK3.h(10) + 1);
                            }
                            c1443krK3.f(5);
                            iH3 = AbstractC0933bL.f13354d[c1443krK3.h(4)];
                            iH2 = c1443krK3.h(8) + 1;
                        } else {
                            iH2 = -1;
                        }
                        int i29 = iH3;
                        if (zG2) {
                            if (iH == 0) {
                                i8 = 32000;
                            } else if (iH == 1) {
                                i8 = 44100;
                            } else {
                                if (iH != 2) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(iH).length() + 51);
                                    sb3.append("Unsupported reference clock code in DTS HD header: ");
                                    sb3.append(iH);
                                    throw P4.a(null, sb3.toString());
                                }
                                i8 = 48000;
                            }
                            jU2 = Vt.u(i7, 1000000L, i8, RoundingMode.DOWN);
                        } else {
                            jU2 = -9223372036854775807L;
                        }
                        g(new C1239h0("audio/vnd.dts.hd;profile=lbr", iH2, i29, iH9, jU2));
                        this.f8280m = iH9;
                        this.f8278k = jU2 == -9223372036854775807L ? 0L : jU2;
                        c2036vr2.E(0);
                        this.f8275g.a(this.f8282o, c2036vr2);
                        this.f8276h = 6;
                    } else {
                        continue;
                    }
                } else if (f(c2036vr, c2036vr2.f17354a, 7)) {
                    C1443kr c1443krK4 = AbstractC0933bL.K(c2036vr2.f17354a);
                    c1443krK4.f(42);
                    this.f8282o = c1443krK4.h(true == c1443krK4.g() ? 12 : 8) + 1;
                    this.f8276h = 3;
                }
            } else if (f(c2036vr, c2036vr2.f17354a, 18)) {
                byte[] bArr3 = c2036vr2.f17354a;
                if (this.f8279l == null) {
                    String str2 = this.f8274f;
                    C1443kr c1443krK5 = AbstractC0933bL.K(bArr3);
                    c1443krK5.f(60);
                    int i30 = AbstractC0933bL.f13351a[c1443krK5.h(6)];
                    int i31 = AbstractC0933bL.f13352b[c1443krK5.h(4)];
                    int iH16 = c1443krK5.h(5);
                    int i32 = iH16 >= 29 ? -1 : (AbstractC0933bL.f13353c[iH16] * TTAdConstant.STYLE_SIZE_RADIO_1_1) / 2;
                    c1443krK5.f(10);
                    int i33 = i30 + (c1443krK5.h(2) > 0 ? 1 : 0);
                    C1855sP c1855sP = new C1855sP();
                    c1855sP.f16722a = str2;
                    c1855sP.d("video/mp2t");
                    c1855sP.e("audio/vnd.dts");
                    c1855sP.f16728g = i32;
                    c1855sP.f16714D = i33;
                    c1855sP.f16715E = i31;
                    c1855sP.f16736p = null;
                    c1855sP.f16725d = this.f8271c;
                    c1855sP.f16727f = this.f8272d;
                    TP tp = new TP(c1855sP);
                    this.f8279l = tp;
                    this.f8275g.e(tp);
                }
                this.f8280m = AbstractC0933bL.q(bArr3);
                byte b8 = bArr3[0];
                if (b8 != -2) {
                    if (b8 == -1) {
                        i9 = (bArr3[4] & 7) << 4;
                        b6 = bArr3[7];
                    } else if (b8 != 31) {
                        i9 = (bArr3[4] & 1) << 6;
                        b5 = bArr3[5];
                    } else {
                        i9 = (bArr3[5] & 7) << 4;
                        b6 = bArr3[6];
                    }
                    i10 = b6 & 60;
                    this.f8278k = Cr.b(Vt.t(this.f8279l.f11379F, (((i10 >> 2) | i9) + 1) * 32));
                    c2036vr2.E(0);
                    this.f8275g.a(18, c2036vr2);
                    this.f8276h = 6;
                } else {
                    i9 = (bArr3[5] & 1) << 6;
                    b5 = bArr3[4];
                }
                i10 = b5 & 252;
                this.f8278k = Cr.b(Vt.t(this.f8279l.f11379F, (((i10 >> 2) | i9) + 1) * 32));
                c2036vr2.E(0);
                this.f8275g.a(18, c2036vr2);
                this.f8276h = 6;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void e(InterfaceC2100x0 interfaceC2100x0, C1189g4 c1189g4) {
        c1189g4.a();
        c1189g4.b();
        this.f8274f = c1189g4.f14198e;
        c1189g4.b();
        this.f8275g = interfaceC2100x0.x(c1189g4.f14197d, 1);
    }

    public final boolean f(C2036vr c2036vr, byte[] bArr, int i) {
        int iMin = Math.min(c2036vr.B(), i - this.i);
        c2036vr.H(this.i, iMin, bArr);
        int i3 = this.i + iMin;
        this.i = i3;
        return i3 == i;
    }

    public final void g(C1239h0 c1239h0) {
        int i;
        int i3 = c1239h0.f14408b;
        String str = c1239h0.f14407a;
        if (i3 == -2147483647 || (i = c1239h0.f14409c) == -1) {
            return;
        }
        TP tp = this.f8279l;
        if (tp != null && i == tp.f11378E && i3 == tp.f11379F && str.equals(tp.f11397m)) {
            return;
        }
        TP tp2 = this.f8279l;
        C1855sP c1855sP = tp2 == null ? new C1855sP() : new C1855sP(tp2);
        c1855sP.f16722a = this.f8274f;
        c1855sP.d(this.f8273e);
        c1855sP.e(str);
        c1855sP.f16714D = i;
        c1855sP.f16715E = i3;
        c1855sP.f16725d = this.f8271c;
        c1855sP.f16727f = this.f8272d;
        TP tp3 = new TP(c1855sP);
        this.f8279l = tp3;
        this.f8275g.e(tp3);
    }
}
