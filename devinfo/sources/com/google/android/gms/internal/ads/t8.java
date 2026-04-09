package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import java.util.Collections;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t8 implements j8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16731a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16732b;

    /* renamed from: c, reason: collision with root package name */
    public final sk0 f16733c;

    /* renamed from: d, reason: collision with root package name */
    public final hk0 f16734d;

    /* renamed from: e, reason: collision with root package name */
    public u2 f16735e;

    /* renamed from: f, reason: collision with root package name */
    public String f16736f;
    public mx1 g;

    /* renamed from: h, reason: collision with root package name */
    public int f16737h;

    /* renamed from: i, reason: collision with root package name */
    public int f16738i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f16739k;

    /* renamed from: l, reason: collision with root package name */
    public long f16740l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16741m;

    /* renamed from: n, reason: collision with root package name */
    public int f16742n;

    /* renamed from: o, reason: collision with root package name */
    public int f16743o;

    /* renamed from: p, reason: collision with root package name */
    public int f16744p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16745q;

    /* renamed from: r, reason: collision with root package name */
    public long f16746r;

    /* renamed from: s, reason: collision with root package name */
    public int f16747s;

    /* renamed from: t, reason: collision with root package name */
    public long f16748t;

    /* renamed from: u, reason: collision with root package name */
    public int f16749u;

    /* renamed from: v, reason: collision with root package name */
    public String f16750v;

    public t8(String str, int i4) {
        this.f16731a = str;
        this.f16732b = i4;
        sk0 sk0Var = new sk0(Segment.SHARE_MINIMUM);
        this.f16733c = sk0Var;
        byte[] bArr = sk0Var.f16446a;
        this.f16734d = new hk0(bArr, bArr.length);
        this.f16740l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void b() {
        this.f16737h = 0;
        this.f16740l = -9223372036854775807L;
        this.f16741m = false;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void c(int i4, long j) {
        this.f16740l = j;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void d(sk0 sk0Var) throws ua {
        int iH;
        int i4;
        int iH2;
        boolean zG;
        int i10;
        this.f16735e.getClass();
        while (sk0Var.B() > 0) {
            int i11 = this.f16737h;
            if (i11 != 0) {
                int i12 = 2;
                if (i11 != 1) {
                    hk0 hk0Var = this.f16734d;
                    sk0 sk0Var2 = this.f16733c;
                    if (i11 != 2) {
                        int iMin = Math.min(sk0Var.B(), this.j - this.f16738i);
                        sk0Var.H(this.f16738i, iMin, hk0Var.f11893a);
                        int i13 = this.f16738i + iMin;
                        this.f16738i = i13;
                        if (i13 == this.j) {
                            hk0Var.d(0);
                            if (hk0Var.g()) {
                                if (this.f16741m) {
                                }
                                this.f16737h = 0;
                            } else {
                                this.f16741m = true;
                                int iH3 = hk0Var.h(1);
                                if (iH3 == 1) {
                                    iH2 = hk0Var.h(1);
                                    i4 = 1;
                                } else {
                                    i4 = iH3;
                                    iH2 = 0;
                                }
                                this.f16742n = iH2;
                                if (iH2 != 0) {
                                    throw ua.a(null, null);
                                }
                                if (i4 == 1) {
                                    hk0Var.h((hk0Var.h(2) + 1) * 8);
                                    i4 = 1;
                                }
                                if (!hk0Var.g()) {
                                    throw ua.a(null, null);
                                }
                                this.f16743o = hk0Var.h(6);
                                int iH4 = hk0Var.h(4);
                                int iH5 = hk0Var.h(3);
                                if (iH4 != 0 || iH5 != 0) {
                                    throw ua.a(null, null);
                                }
                                if (i4 == 0) {
                                    int i14 = (hk0Var.f11894b * 8) + hk0Var.f11895c;
                                    int iB = hk0Var.b();
                                    k1 k1VarL = ls.l(hk0Var, true);
                                    this.f16750v = k1VarL.f12919a;
                                    this.f16747s = k1VarL.f12920b;
                                    this.f16749u = k1VarL.f12921c;
                                    int iB2 = iB - hk0Var.b();
                                    hk0Var.d(i14);
                                    byte[] bArr = new byte[(iB2 + 7) / 8];
                                    hk0Var.j(iB2, bArr);
                                    lw1 lw1Var = new lw1();
                                    lw1Var.f13652a = this.f16736f;
                                    lw1Var.d("video/mp2t");
                                    lw1Var.e("audio/mp4a-latm");
                                    lw1Var.f13659i = this.f16750v;
                                    lw1Var.D = this.f16749u;
                                    lw1Var.E = this.f16747s;
                                    lw1Var.f13664o = Collections.singletonList(bArr);
                                    lw1Var.f13655d = this.f16731a;
                                    lw1Var.f13657f = this.f16732b;
                                    mx1 mx1Var = new mx1(lw1Var);
                                    if (!mx1Var.equals(this.g)) {
                                        this.g = mx1Var;
                                        this.f16748t = 1024000000 / mx1Var.F;
                                        this.f16735e.f(mx1Var);
                                    }
                                } else {
                                    int iB3 = hk0Var.b();
                                    k1 k1VarL2 = ls.l(hk0Var, true);
                                    this.f16750v = k1VarL2.f12919a;
                                    this.f16747s = k1VarL2.f12920b;
                                    this.f16749u = k1VarL2.f12921c;
                                    hk0Var.f(hk0Var.h((hk0Var.h(2) + 1) * 8) - (iB3 - hk0Var.b()));
                                }
                                int iH6 = hk0Var.h(3);
                                this.f16744p = iH6;
                                if (iH6 == 0) {
                                    hk0Var.f(8);
                                } else if (iH6 == 1) {
                                    hk0Var.f(9);
                                } else if (iH6 == 3 || iH6 == 4 || iH6 == 5) {
                                    hk0Var.f(6);
                                } else {
                                    if (iH6 != 6 && iH6 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    hk0Var.f(1);
                                }
                                boolean zG2 = hk0Var.g();
                                this.f16745q = zG2;
                                this.f16746r = 0L;
                                if (zG2) {
                                    if (i4 != 1) {
                                        do {
                                            zG = hk0Var.g();
                                            this.f16746r = (this.f16746r << 8) + hk0Var.h(8);
                                        } while (zG);
                                    } else {
                                        this.f16746r = hk0Var.h((hk0Var.h(2) + 1) * 8);
                                    }
                                }
                                if (hk0Var.g()) {
                                    hk0Var.f(8);
                                }
                            }
                            if (this.f16742n != 0) {
                                throw ua.a(null, null);
                            }
                            if (this.f16743o != 0) {
                                throw ua.a(null, null);
                            }
                            if (this.f16744p != 0) {
                                throw ua.a(null, null);
                            }
                            int i15 = 0;
                            do {
                                iH = hk0Var.h(8);
                                i15 += iH;
                            } while (iH == 255);
                            int i16 = (hk0Var.f11894b * 8) + hk0Var.f11895c;
                            if ((i16 & 7) == 0) {
                                sk0Var2.E(i16 >> 3);
                            } else {
                                hk0Var.j(i15 * 8, sk0Var2.f16446a);
                                sk0Var2.E(0);
                            }
                            this.f16735e.b(i15, sk0Var2);
                            mq0.c0(this.f16740l != -9223372036854775807L);
                            this.f16735e.d(this.f16740l, 1, i15, 0, null);
                            this.f16740l += this.f16748t;
                            if (this.f16745q) {
                                hk0Var.f((int) this.f16746r);
                            }
                            this.f16737h = 0;
                        } else {
                            continue;
                        }
                    } else {
                        int iK = ((this.f16739k & (-225)) << 8) | sk0Var.K();
                        this.j = iK;
                        if (iK > sk0Var2.f16446a.length) {
                            sk0Var2.y(iK);
                            byte[] bArr2 = sk0Var2.f16446a;
                            int length = bArr2.length;
                            hk0Var.f11893a = bArr2;
                            i10 = 0;
                            hk0Var.f11894b = 0;
                            hk0Var.f11895c = 0;
                            hk0Var.f11896d = length;
                        } else {
                            i10 = 0;
                        }
                        this.f16738i = i10;
                        this.f16737h = 3;
                    }
                } else {
                    int iK2 = sk0Var.K();
                    if ((iK2 & 224) == 224) {
                        this.f16739k = iK2;
                    } else if (iK2 != 86) {
                        i12 = 0;
                    }
                    this.f16737h = i12;
                }
            } else if (sk0Var.K() == 86) {
                this.f16737h = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void e(z1 z1Var, h9 h9Var) {
        h9Var.a();
        h9Var.b();
        this.f16735e = z1Var.m(h9Var.f11776d, 1);
        h9Var.b();
        this.f16736f = h9Var.f11777e;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void a(boolean z3) {
    }
}
