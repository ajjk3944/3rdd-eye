package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y8 implements i9 {

    /* renamed from: a, reason: collision with root package name */
    public final j8 f18668a;

    /* renamed from: b, reason: collision with root package name */
    public final hk0 f18669b = new hk0(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    public int f18670c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f18671d;

    /* renamed from: e, reason: collision with root package name */
    public zo0 f18672e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18673f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18674h;

    /* renamed from: i, reason: collision with root package name */
    public int f18675i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18676k;

    public y8(j8 j8Var) {
        this.f18668a = j8Var;
    }

    @Override // com.google.android.gms.internal.ads.i9
    public final void a() {
        this.f18670c = 0;
        this.f18671d = 0;
        this.f18674h = false;
        this.f18668a.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.hk0] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.j8] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // com.google.android.gms.internal.ads.i9
    public final void b(int i4, sk0 sk0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        long jD;
        long j;
        this.f18672e.getClass();
        int i14 = i4 & 1;
        ?? r32 = this.f18668a;
        int i15 = -1;
        int i16 = 2;
        ?? r72 = 0;
        int i17 = 1;
        if (i14 != 0) {
            int i18 = this.f18670c;
            if (i18 != 0 && i18 != 1) {
                if (i18 != 2) {
                    int i19 = this.j;
                    if (i19 != -1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i19).length() + 48);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i19);
                        sb2.append(" more bytes");
                        ls.t("PesReader", sb2.toString());
                    }
                    r32.a(sk0Var.f16448c == 0);
                } else {
                    ls.t("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f18670c = 1;
            this.f18671d = 0;
        }
        int i20 = i4;
        while (sk0Var.B() > 0) {
            int i21 = this.f18670c;
            if (i21 != 0) {
                ?? r10 = this.f18669b;
                if (i21 != i17) {
                    if (i21 != i16) {
                        int iB = sk0Var.B();
                        int i22 = this.j;
                        int i23 = i22 == i15 ? r72 : iB - i22;
                        if (i23 > 0) {
                            iB -= i23;
                            sk0Var.C(sk0Var.f16447b + iB);
                        }
                        r32.d(sk0Var);
                        int i24 = this.j;
                        if (i24 != i15) {
                            int i25 = i24 - iB;
                            this.j = i25;
                            if (i25 == 0) {
                                r32.a(r72);
                                this.f18670c = i17;
                                this.f18671d = r72;
                            }
                        }
                    } else {
                        if (c(sk0Var, r10.f11893a, Math.min(10, this.f18675i)) && c(sk0Var, null, this.f18675i)) {
                            r10.d(r72);
                            if (this.f18673f) {
                                r10.f(4);
                                long jH = r10.h(3);
                                r10.f(i17);
                                int iH = r10.h(15) << 15;
                                r10.f(i17);
                                long jH2 = r10.h(15);
                                r10.f(i17);
                                if (this.f18674h || !this.g) {
                                    j = jH;
                                } else {
                                    r10.f(4);
                                    j = jH;
                                    r10.f(i17);
                                    int iH2 = r10.h(15) << 15;
                                    r10.f(i17);
                                    long jH3 = r10.h(15);
                                    r10.f(i17);
                                    this.f18672e.d((r10.h(3) << 30) | iH2 | jH3);
                                    this.f18674h = true;
                                }
                                jD = this.f18672e.d(jH2 | (j << 30) | iH);
                            } else {
                                jD = -9223372036854775807L;
                            }
                            i20 |= true != this.f18676k ? 0 : 4;
                            r32.c(i20, jD);
                            this.f18670c = 3;
                            this.f18671d = 0;
                            r72 = 0;
                            i15 = -1;
                            i16 = 2;
                            i17 = 1;
                        }
                    }
                    int i26 = r72;
                    i10 = i16;
                    i11 = i26;
                    i12 = i17;
                } else {
                    int i27 = r72;
                    if (c(sk0Var, r10.f11893a, 9)) {
                        r10.d(i27);
                        int iH3 = r10.h(24);
                        i12 = 1;
                        if (iH3 != 1) {
                            a0.g.z(new StringBuilder(String.valueOf(iH3).length() + 30), "Unexpected start code prefix: ", iH3, "PesReader");
                            i15 = -1;
                            this.j = -1;
                            i13 = 0;
                            i10 = 2;
                        } else {
                            r10.f(8);
                            int iH4 = r10.h(16);
                            r10.f(5);
                            this.f18676k = r10.g();
                            i10 = 2;
                            r10.f(2);
                            this.f18673f = r10.g();
                            this.g = r10.g();
                            r10.f(6);
                            int iH5 = r10.h(8);
                            this.f18675i = iH5;
                            if (iH4 == 0) {
                                this.j = -1;
                                i13 = 2;
                                i15 = -1;
                            } else {
                                int i28 = (iH4 - 3) - iH5;
                                this.j = i28;
                                if (i28 < 0) {
                                    a0.g.z(new StringBuilder(String.valueOf(i28).length() + 36), "Found negative packet payload size: ", i28, "PesReader");
                                    i15 = -1;
                                    this.j = -1;
                                } else {
                                    i15 = -1;
                                }
                                i13 = 2;
                            }
                        }
                        this.f18670c = i13;
                        i11 = 0;
                        this.f18671d = 0;
                    } else {
                        i11 = i27;
                        i15 = -1;
                        i10 = 2;
                        i12 = 1;
                    }
                }
            } else {
                int i29 = r72;
                i10 = i16;
                i11 = i29;
                i12 = i17;
                sk0Var.G(sk0Var.B());
            }
            int i30 = i10;
            r72 = i11;
            i16 = i30;
            i17 = i12;
        }
    }

    public final boolean c(sk0 sk0Var, byte[] bArr, int i4) {
        int iMin = Math.min(sk0Var.B(), i4 - this.f18671d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            sk0Var.G(iMin);
        } else {
            sk0Var.H(this.f18671d, iMin, bArr);
        }
        int i10 = this.f18671d + iMin;
        this.f18671d = i10;
        return i10 == i4;
    }

    @Override // com.google.android.gms.internal.ads.i9
    public final void d(zo0 zo0Var, z1 z1Var, h9 h9Var) {
        this.f18672e = zo0Var;
        this.f18668a.e(z1Var, h9Var);
    }
}
