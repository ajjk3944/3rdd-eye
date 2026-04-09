package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class X3 implements InterfaceC1243h4 {

    /* renamed from: a, reason: collision with root package name */
    public final I3 f12365a;

    /* renamed from: b, reason: collision with root package name */
    public final C1443kr f12366b = new C1443kr(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    public int f12367c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f12368d;

    /* renamed from: e, reason: collision with root package name */
    public C2038vt f12369e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12370f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12371g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12372h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f12373j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12374k;

    public X3(I3 i3) {
        this.f12365a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.kr] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.I3] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // com.google.android.gms.internal.ads.InterfaceC1243h4
    public final void a(int i, C2036vr c2036vr) {
        int i3;
        int i6;
        int i7;
        int i8;
        long jD;
        long j6;
        this.f12369e.getClass();
        int i9 = i & 1;
        ?? r32 = this.f12365a;
        int i10 = -1;
        int i11 = 2;
        ?? r7 = 0;
        int i12 = 1;
        if (i9 != 0) {
            int i13 = this.f12367c;
            if (i13 != 0 && i13 != 1) {
                if (i13 != 2) {
                    int i14 = this.f12373j;
                    if (i14 != -1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i14).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i14);
                        sb.append(" more bytes");
                        AbstractC2022vd.v("PesReader", sb.toString());
                    }
                    r32.b(c2036vr.f17356c == 0);
                } else {
                    AbstractC2022vd.v("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f12367c = 1;
            this.f12368d = 0;
        }
        int i15 = i;
        while (c2036vr.B() > 0) {
            int i16 = this.f12367c;
            if (i16 != 0) {
                ?? r10 = this.f12366b;
                if (i16 != i12) {
                    if (i16 != i11) {
                        int iB = c2036vr.B();
                        int i17 = this.f12373j;
                        int i18 = i17 == i10 ? r7 : iB - i17;
                        if (i18 > 0) {
                            iB -= i18;
                            c2036vr.C(c2036vr.f17355b + iB);
                        }
                        r32.d(c2036vr);
                        int i19 = this.f12373j;
                        if (i19 != i10) {
                            int i20 = i19 - iB;
                            this.f12373j = i20;
                            if (i20 == 0) {
                                r32.b(r7);
                                this.f12367c = i12;
                                this.f12368d = r7;
                            }
                        }
                    } else {
                        if (b(c2036vr, r10.f15294a, Math.min(10, this.i)) && b(c2036vr, null, this.i)) {
                            r10.d(r7);
                            if (this.f12370f) {
                                r10.f(4);
                                long jH = r10.h(3);
                                r10.f(i12);
                                int iH = r10.h(15) << 15;
                                r10.f(i12);
                                long jH2 = r10.h(15);
                                r10.f(i12);
                                if (this.f12372h || !this.f12371g) {
                                    j6 = jH;
                                } else {
                                    r10.f(4);
                                    j6 = jH;
                                    r10.f(i12);
                                    int iH2 = r10.h(15) << 15;
                                    r10.f(i12);
                                    long jH3 = r10.h(15);
                                    r10.f(i12);
                                    this.f12369e.d((r10.h(3) << 30) | iH2 | jH3);
                                    this.f12372h = true;
                                }
                                jD = this.f12369e.d(jH2 | (j6 << 30) | iH);
                            } else {
                                jD = -9223372036854775807L;
                            }
                            i15 |= true != this.f12374k ? 0 : 4;
                            r32.c(i15, jD);
                            this.f12367c = 3;
                            this.f12368d = 0;
                            r7 = 0;
                            i10 = -1;
                            i11 = 2;
                            i12 = 1;
                        }
                    }
                    int i21 = r7;
                    i3 = i11;
                    i6 = i21;
                    i7 = i12;
                } else {
                    int i22 = r7;
                    if (b(c2036vr, r10.f15294a, 9)) {
                        r10.d(i22);
                        int iH3 = r10.h(24);
                        i7 = 1;
                        if (iH3 != 1) {
                            A.f.u(new StringBuilder(String.valueOf(iH3).length() + 30), "Unexpected start code prefix: ", iH3, "PesReader");
                            i10 = -1;
                            this.f12373j = -1;
                            i8 = 0;
                            i3 = 2;
                        } else {
                            r10.f(8);
                            int iH4 = r10.h(16);
                            r10.f(5);
                            this.f12374k = r10.g();
                            i3 = 2;
                            r10.f(2);
                            this.f12370f = r10.g();
                            this.f12371g = r10.g();
                            r10.f(6);
                            int iH5 = r10.h(8);
                            this.i = iH5;
                            if (iH4 == 0) {
                                this.f12373j = -1;
                                i8 = 2;
                                i10 = -1;
                            } else {
                                int i23 = (iH4 - 3) - iH5;
                                this.f12373j = i23;
                                if (i23 < 0) {
                                    A.f.u(new StringBuilder(String.valueOf(i23).length() + 36), "Found negative packet payload size: ", i23, "PesReader");
                                    i10 = -1;
                                    this.f12373j = -1;
                                } else {
                                    i10 = -1;
                                }
                                i8 = 2;
                            }
                        }
                        this.f12367c = i8;
                        i6 = 0;
                        this.f12368d = 0;
                    } else {
                        i6 = i22;
                        i10 = -1;
                        i3 = 2;
                        i7 = 1;
                    }
                }
            } else {
                int i24 = r7;
                i3 = i11;
                i6 = i24;
                i7 = i12;
                c2036vr.G(c2036vr.B());
            }
            int i25 = i3;
            r7 = i6;
            i11 = i25;
            i12 = i7;
        }
    }

    public final boolean b(C2036vr c2036vr, byte[] bArr, int i) {
        int iMin = Math.min(c2036vr.B(), i - this.f12368d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c2036vr.G(iMin);
        } else {
            c2036vr.H(this.f12368d, iMin, bArr);
        }
        int i3 = this.f12368d + iMin;
        this.f12368d = i3;
        return i3 == i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1243h4
    public final void c() {
        this.f12367c = 0;
        this.f12368d = 0;
        this.f12372h = false;
        this.f12365a.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1243h4
    public final void e(C2038vt c2038vt, InterfaceC2100x0 interfaceC2100x0, C1189g4 c1189g4) {
        this.f12369e = c2038vt;
        this.f12365a.e(interfaceC2100x0, c1189g4);
    }
}
