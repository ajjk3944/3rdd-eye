package ma;

/* loaded from: classes.dex */
public final class w implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f16627a;

    /* renamed from: b, reason: collision with root package name */
    public final a5.u f16628b = new a5.u(new byte[10], 10, 3, (byte) 0);

    /* renamed from: c, reason: collision with root package name */
    public int f16629c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f16630d;

    /* renamed from: e, reason: collision with root package name */
    public qb.u f16631e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16632f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16633g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16634h;

    /* renamed from: i, reason: collision with root package name */
    public int f16635i;
    public int j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public long f16636l;

    public w(i iVar) {
        this.f16627a = iVar;
    }

    @Override // ma.h0
    public final void a() {
        this.f16629c = 0;
        this.f16630d = 0;
        this.f16634h = false;
        this.f16627a.a();
    }

    @Override // ma.h0
    public final void b(int i10, fb.f fVar) {
        int i11;
        int i12;
        int i13;
        qb.b.k(this.f16631e);
        int i14 = i10 & 1;
        i iVar = this.f16627a;
        int i15 = 2;
        int i16 = 0;
        if (i14 != 0) {
            int i17 = this.f16629c;
            if (i17 != 0 && i17 != 1) {
                if (i17 == 2) {
                    io.sentry.android.core.e0.p("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i17 != 3) {
                        throw new IllegalStateException();
                    }
                    int i18 = this.j;
                    if (i18 != -1) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i18);
                        sb2.append(" more bytes");
                        io.sentry.android.core.e0.p("PesReader", sb2.toString());
                    }
                    iVar.d();
                }
            }
            this.f16629c = 1;
            this.f16630d = 0;
        }
        int i19 = i10;
        while (fVar.a() > 0) {
            int i20 = this.f16629c;
            if (i20 != 0) {
                a5.u uVar = this.f16628b;
                if (i20 != 1) {
                    if (i20 == i15) {
                        if (c(fVar, uVar.f158b, Math.min(10, this.f16635i)) && c(fVar, null, this.f16635i)) {
                            uVar.p(i16);
                            this.f16636l = -9223372036854775807L;
                            if (this.f16632f) {
                                uVar.s(4);
                                uVar.s(1);
                                uVar.s(1);
                                long jI = (uVar.i(15) << 15) | (uVar.i(3) << 30) | uVar.i(15);
                                uVar.s(1);
                                if (!this.f16634h && this.f16633g) {
                                    uVar.s(4);
                                    uVar.s(1);
                                    uVar.s(1);
                                    uVar.s(1);
                                    this.f16631e.b((uVar.i(3) << 30) | (uVar.i(15) << 15) | uVar.i(15));
                                    this.f16634h = true;
                                }
                                this.f16636l = this.f16631e.b(jI);
                            }
                            i19 |= this.k ? 4 : 0;
                            iVar.e(i19, this.f16636l);
                            this.f16629c = 3;
                            this.f16630d = 0;
                            i16 = 0;
                            i15 = 2;
                        }
                    } else {
                        if (i20 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = fVar.a();
                        int i21 = this.j;
                        int i22 = i21 == -1 ? i16 : iA - i21;
                        if (i22 > 0) {
                            iA -= i22;
                            fVar.x(fVar.f8801b + iA);
                        }
                        iVar.c(fVar);
                        int i23 = this.j;
                        if (i23 != -1) {
                            int i24 = i23 - iA;
                            this.j = i24;
                            if (i24 == 0) {
                                iVar.d();
                                this.f16629c = 1;
                                this.f16630d = i16;
                            }
                        }
                    }
                    i11 = i15;
                    i12 = i16;
                } else {
                    i12 = i16;
                    if (c(fVar, uVar.f158b, 9)) {
                        uVar.p(i12);
                        int i25 = uVar.i(24);
                        if (i25 != 1) {
                            c7.a.y("Unexpected start code prefix: ", 41, i25, "PesReader");
                            this.j = -1;
                            i13 = 0;
                            i11 = 2;
                        } else {
                            uVar.s(8);
                            int i26 = uVar.i(16);
                            uVar.s(5);
                            this.k = uVar.h();
                            i11 = 2;
                            uVar.s(2);
                            this.f16632f = uVar.h();
                            this.f16633g = uVar.h();
                            uVar.s(6);
                            int i27 = uVar.i(8);
                            this.f16635i = i27;
                            if (i26 == 0) {
                                this.j = -1;
                            } else {
                                int i28 = (i26 - 3) - i27;
                                this.j = i28;
                                if (i28 < 0) {
                                    c7.a.y("Found negative packet payload size: ", 47, i28, "PesReader");
                                    this.j = -1;
                                }
                            }
                            i13 = 2;
                        }
                        this.f16629c = i13;
                        i12 = 0;
                        this.f16630d = 0;
                    } else {
                        i11 = 2;
                    }
                }
            } else {
                i11 = i15;
                i12 = i16;
                fVar.z(fVar.a());
            }
            i16 = i12;
            i15 = i11;
        }
    }

    public final boolean c(fb.f fVar, byte[] bArr, int i10) {
        int iMin = Math.min(fVar.a(), i10 - this.f16630d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            fVar.z(iMin);
        } else {
            fVar.c(bArr, this.f16630d, iMin);
        }
        int i11 = this.f16630d + iMin;
        this.f16630d = i11;
        return i11 == i10;
    }

    @Override // ma.h0
    public final void d(qb.u uVar, ca.m mVar, g0 g0Var) {
        this.f16631e = uVar;
        this.f16627a.f(mVar, g0Var);
    }
}
