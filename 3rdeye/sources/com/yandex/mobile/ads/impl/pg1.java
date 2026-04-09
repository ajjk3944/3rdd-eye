package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c72;

/* loaded from: classes3.dex */
public final class pg1 implements c72 {

    /* renamed from: a, reason: collision with root package name */
    private final w40 f31734a;

    /* renamed from: b, reason: collision with root package name */
    private final tf1 f31735b = new tf1(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    private int f31736c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f31737d;

    /* renamed from: e, reason: collision with root package name */
    private c52 f31738e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f31739f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31740g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f31741h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f31742j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f31743k;

    /* renamed from: l, reason: collision with root package name */
    private long f31744l;

    public pg1(w40 w40Var) {
        this.f31734a = w40Var;
    }

    @Override // com.yandex.mobile.ads.impl.c72
    public final void a(int i, uf1 uf1Var) throws yf1 {
        int i10;
        int i11;
        int i12;
        if (this.f31738e == null) {
            throw new IllegalStateException();
        }
        int i13 = -1;
        int i14 = 0;
        if ((i & 1) != 0) {
            int i15 = this.f31736c;
            if (i15 != 0 && i15 != 1) {
                if (i15 == 2) {
                    rs0.d("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i15 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f31742j != -1) {
                        rs0.d("PesReader", "Unexpected start indicator: expected " + this.f31742j + " more bytes");
                    }
                    this.f31734a.b();
                }
            }
            this.f31736c = 1;
            this.f31737d = 0;
        }
        int i16 = i;
        while (uf1Var.a() > 0) {
            int i17 = this.f31736c;
            if (i17 == 0) {
                i10 = i13;
                i11 = i14;
                uf1Var.f(uf1Var.a());
            } else if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 != 3) {
                        throw new IllegalStateException();
                    }
                    int iA = uf1Var.a();
                    int i18 = this.f31742j;
                    int i19 = i18 == i13 ? i14 : iA - i18;
                    if (i19 > 0) {
                        iA -= i19;
                        uf1Var.d(uf1Var.d() + iA);
                    }
                    this.f31734a.a(uf1Var);
                    int i20 = this.f31742j;
                    if (i20 != i13) {
                        int i21 = i20 - iA;
                        this.f31742j = i21;
                        if (i21 == 0) {
                            this.f31734a.b();
                            this.f31736c = 1;
                            this.f31737d = i14;
                        }
                    }
                } else if (a(Math.min(10, this.i), uf1Var, this.f31735b.f33573a) && a(this.i, uf1Var, (byte[]) null)) {
                    this.f31735b.c(i14);
                    this.f31744l = -9223372036854775807L;
                    if (this.f31739f) {
                        this.f31735b.d(4);
                        this.f31735b.d(1);
                        this.f31735b.d(1);
                        long jB = (this.f31735b.b(15) << 15) | (this.f31735b.b(3) << 30) | this.f31735b.b(15);
                        this.f31735b.d(1);
                        if (!this.f31741h && this.f31740g) {
                            this.f31735b.d(4);
                            this.f31735b.d(1);
                            this.f31735b.d(1);
                            this.f31735b.d(1);
                            this.f31738e.b((this.f31735b.b(3) << 30) | (this.f31735b.b(15) << 15) | this.f31735b.b(15));
                            this.f31741h = true;
                        }
                        this.f31744l = this.f31738e.b(jB);
                    }
                    i16 |= this.f31743k ? 4 : 0;
                    this.f31734a.a(i16, this.f31744l);
                    this.f31736c = 3;
                    this.f31737d = 0;
                    i14 = 0;
                    i13 = -1;
                }
                i10 = i13;
                i11 = i14;
            } else {
                i11 = i14;
                if (a(9, uf1Var, this.f31735b.f33573a)) {
                    this.f31735b.c(i11);
                    int iB = this.f31735b.b(24);
                    if (iB != 1) {
                        kr0.a("Unexpected start code prefix: ", iB, "PesReader");
                        this.f31742j = -1;
                        i12 = 0;
                        i10 = -1;
                    } else {
                        this.f31735b.d(8);
                        int iB2 = this.f31735b.b(16);
                        this.f31735b.d(5);
                        this.f31743k = this.f31735b.f();
                        this.f31735b.d(2);
                        this.f31739f = this.f31735b.f();
                        this.f31740g = this.f31735b.f();
                        this.f31735b.d(6);
                        int iB3 = this.f31735b.b(8);
                        this.i = iB3;
                        if (iB2 == 0) {
                            this.f31742j = -1;
                        } else {
                            int i22 = (iB2 - 3) - iB3;
                            this.f31742j = i22;
                            if (i22 < 0) {
                                rs0.d("PesReader", "Found negative packet payload size: " + this.f31742j);
                                i10 = -1;
                                this.f31742j = -1;
                            }
                            i12 = 2;
                        }
                        i10 = -1;
                        i12 = 2;
                    }
                    this.f31736c = i12;
                    i11 = 0;
                    this.f31737d = 0;
                } else {
                    i10 = -1;
                }
            }
            i14 = i11;
            i13 = i10;
        }
    }

    private boolean a(int i, uf1 uf1Var, byte[] bArr) {
        int iMin = Math.min(uf1Var.a(), i - this.f31737d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            uf1Var.f(iMin);
        } else {
            uf1Var.a(bArr, this.f31737d, iMin);
        }
        int i10 = this.f31737d + iMin;
        this.f31737d = i10;
        return i10 == i;
    }

    @Override // com.yandex.mobile.ads.impl.c72
    public final void a(c52 c52Var, w70 w70Var, c72.d dVar) {
        this.f31738e = c52Var;
        this.f31734a.a(w70Var, dVar);
    }

    @Override // com.yandex.mobile.ads.impl.c72
    public final void a() {
        this.f31736c = 0;
        this.f31737d = 0;
        this.f31741h = false;
        this.f31734a.a();
    }
}
