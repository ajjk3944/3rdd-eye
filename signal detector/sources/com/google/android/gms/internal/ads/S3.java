package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes.dex */
public final class S3 implements I3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11108a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11109b;

    /* renamed from: c, reason: collision with root package name */
    public final C2036vr f11110c;

    /* renamed from: d, reason: collision with root package name */
    public final C1443kr f11111d;

    /* renamed from: e, reason: collision with root package name */
    public T0 f11112e;

    /* renamed from: f, reason: collision with root package name */
    public String f11113f;

    /* renamed from: g, reason: collision with root package name */
    public TP f11114g;

    /* renamed from: h, reason: collision with root package name */
    public int f11115h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f11116j;

    /* renamed from: k, reason: collision with root package name */
    public int f11117k;

    /* renamed from: l, reason: collision with root package name */
    public long f11118l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11119m;

    /* renamed from: n, reason: collision with root package name */
    public int f11120n;

    /* renamed from: o, reason: collision with root package name */
    public int f11121o;

    /* renamed from: p, reason: collision with root package name */
    public int f11122p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11123q;

    /* renamed from: r, reason: collision with root package name */
    public long f11124r;

    /* renamed from: s, reason: collision with root package name */
    public int f11125s;

    /* renamed from: t, reason: collision with root package name */
    public long f11126t;

    /* renamed from: u, reason: collision with root package name */
    public int f11127u;

    /* renamed from: v, reason: collision with root package name */
    public String f11128v;

    public S3(String str, int i) {
        this.f11108a = str;
        this.f11109b = i;
        C2036vr c2036vr = new C2036vr(1024);
        this.f11110c = c2036vr;
        byte[] bArr = c2036vr.f17354a;
        this.f11111d = new C1443kr(bArr, bArr.length);
        this.f11118l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void a() {
        this.f11115h = 0;
        this.f11118l = -9223372036854775807L;
        this.f11119m = false;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void b(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void c(int i, long j6) {
        this.f11118l = j6;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void d(C2036vr c2036vr) throws P4 {
        int iH;
        int i;
        int iH2;
        boolean zG;
        int i3;
        this.f11112e.getClass();
        while (c2036vr.B() > 0) {
            int i6 = this.f11115h;
            if (i6 != 0) {
                int i7 = 2;
                if (i6 != 1) {
                    C1443kr c1443kr = this.f11111d;
                    C2036vr c2036vr2 = this.f11110c;
                    if (i6 != 2) {
                        int iMin = Math.min(c2036vr.B(), this.f11116j - this.i);
                        c2036vr.H(this.i, iMin, c1443kr.f15294a);
                        int i8 = this.i + iMin;
                        this.i = i8;
                        if (i8 == this.f11116j) {
                            c1443kr.d(0);
                            if (c1443kr.g()) {
                                if (this.f11119m) {
                                }
                                this.f11115h = 0;
                            } else {
                                this.f11119m = true;
                                int iH3 = c1443kr.h(1);
                                if (iH3 == 1) {
                                    iH2 = c1443kr.h(1);
                                    i = 1;
                                } else {
                                    i = iH3;
                                    iH2 = 0;
                                }
                                this.f11120n = iH2;
                                if (iH2 != 0) {
                                    throw P4.a(null, null);
                                }
                                if (i == 1) {
                                    c1443kr.h((c1443kr.h(2) + 1) * 8);
                                    i = 1;
                                }
                                if (!c1443kr.g()) {
                                    throw P4.a(null, null);
                                }
                                this.f11121o = c1443kr.h(6);
                                int iH4 = c1443kr.h(4);
                                int iH5 = c1443kr.h(3);
                                if (iH4 != 0 || iH5 != 0) {
                                    throw P4.a(null, null);
                                }
                                if (i == 0) {
                                    int i9 = (c1443kr.f15295b * 8) + c1443kr.f15296c;
                                    int iB = c1443kr.b();
                                    C1239h0 c1239h0M = AbstractC2022vd.m(c1443kr, true);
                                    this.f11128v = c1239h0M.f14407a;
                                    this.f11125s = c1239h0M.f14408b;
                                    this.f11127u = c1239h0M.f14409c;
                                    int iB2 = iB - c1443kr.b();
                                    c1443kr.d(i9);
                                    byte[] bArr = new byte[(iB2 + 7) / 8];
                                    c1443kr.j(iB2, bArr);
                                    C1855sP c1855sP = new C1855sP();
                                    c1855sP.f16722a = this.f11113f;
                                    c1855sP.d("video/mp2t");
                                    c1855sP.e("audio/mp4a-latm");
                                    c1855sP.i = this.f11128v;
                                    c1855sP.f16714D = this.f11127u;
                                    c1855sP.f16715E = this.f11125s;
                                    c1855sP.f16735o = Collections.singletonList(bArr);
                                    c1855sP.f16725d = this.f11108a;
                                    c1855sP.f16727f = this.f11109b;
                                    TP tp = new TP(c1855sP);
                                    if (!tp.equals(this.f11114g)) {
                                        this.f11114g = tp;
                                        this.f11126t = 1024000000 / tp.f11379F;
                                        this.f11112e.e(tp);
                                    }
                                } else {
                                    int iB3 = c1443kr.b();
                                    C1239h0 c1239h0M2 = AbstractC2022vd.m(c1443kr, true);
                                    this.f11128v = c1239h0M2.f14407a;
                                    this.f11125s = c1239h0M2.f14408b;
                                    this.f11127u = c1239h0M2.f14409c;
                                    c1443kr.f(c1443kr.h((c1443kr.h(2) + 1) * 8) - (iB3 - c1443kr.b()));
                                }
                                int iH6 = c1443kr.h(3);
                                this.f11122p = iH6;
                                if (iH6 == 0) {
                                    c1443kr.f(8);
                                } else if (iH6 == 1) {
                                    c1443kr.f(9);
                                } else if (iH6 == 3 || iH6 == 4 || iH6 == 5) {
                                    c1443kr.f(6);
                                } else {
                                    if (iH6 != 6 && iH6 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    c1443kr.f(1);
                                }
                                boolean zG2 = c1443kr.g();
                                this.f11123q = zG2;
                                this.f11124r = 0L;
                                if (zG2) {
                                    if (i != 1) {
                                        do {
                                            zG = c1443kr.g();
                                            this.f11124r = (this.f11124r << 8) + c1443kr.h(8);
                                        } while (zG);
                                    } else {
                                        this.f11124r = c1443kr.h((c1443kr.h(2) + 1) * 8);
                                    }
                                }
                                if (c1443kr.g()) {
                                    c1443kr.f(8);
                                }
                            }
                            if (this.f11120n != 0) {
                                throw P4.a(null, null);
                            }
                            if (this.f11121o != 0) {
                                throw P4.a(null, null);
                            }
                            if (this.f11122p != 0) {
                                throw P4.a(null, null);
                            }
                            int i10 = 0;
                            do {
                                iH = c1443kr.h(8);
                                i10 += iH;
                            } while (iH == 255);
                            int i11 = (c1443kr.f15295b * 8) + c1443kr.f15296c;
                            if ((i11 & 7) == 0) {
                                c2036vr2.E(i11 >> 3);
                            } else {
                                c1443kr.j(i10 * 8, c2036vr2.f17354a);
                                c2036vr2.E(0);
                            }
                            this.f11112e.a(i10, c2036vr2);
                            AbstractC0582Jp.h0(this.f11118l != -9223372036854775807L);
                            this.f11112e.c(this.f11118l, 1, i10, 0, null);
                            this.f11118l += this.f11126t;
                            if (this.f11123q) {
                                c1443kr.f((int) this.f11124r);
                            }
                            this.f11115h = 0;
                        } else {
                            continue;
                        }
                    } else {
                        int iK = ((this.f11117k & (-225)) << 8) | c2036vr.K();
                        this.f11116j = iK;
                        if (iK > c2036vr2.f17354a.length) {
                            c2036vr2.y(iK);
                            byte[] bArr2 = c2036vr2.f17354a;
                            int length = bArr2.length;
                            c1443kr.f15294a = bArr2;
                            i3 = 0;
                            c1443kr.f15295b = 0;
                            c1443kr.f15296c = 0;
                            c1443kr.f15297d = length;
                        } else {
                            i3 = 0;
                        }
                        this.i = i3;
                        this.f11115h = 3;
                    }
                } else {
                    int iK2 = c2036vr.K();
                    if ((iK2 & 224) == 224) {
                        this.f11117k = iK2;
                    } else if (iK2 != 86) {
                        i7 = 0;
                    }
                    this.f11115h = i7;
                }
            } else if (c2036vr.K() == 86) {
                this.f11115h = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void e(InterfaceC2100x0 interfaceC2100x0, C1189g4 c1189g4) {
        c1189g4.a();
        c1189g4.b();
        this.f11112e = interfaceC2100x0.x(c1189g4.f14197d, 1);
        c1189g4.b();
        this.f11113f = c1189g4.f14198e;
    }
}
