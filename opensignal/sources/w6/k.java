package w6;

import a5.b0;
import ma.g0;

/* loaded from: classes.dex */
public final class k implements w {

    /* renamed from: a, reason: collision with root package name */
    public final f f24314a;

    /* renamed from: b, reason: collision with root package name */
    public final a5.u f24315b = new a5.u(new byte[10], 10, 0, (byte) 0);

    /* renamed from: c, reason: collision with root package name */
    public int f24316c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f24317d;

    /* renamed from: e, reason: collision with root package name */
    public b0 f24318e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24319f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24320g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24321h;

    /* renamed from: i, reason: collision with root package name */
    public int f24322i;
    public int j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public long f24323l;

    public k(f fVar) {
        this.f24314a = fVar;
    }

    @Override // w6.w
    public final void a() {
        this.f24316c = 0;
        this.f24317d = 0;
        this.f24321h = false;
        this.f24314a.a();
    }

    @Override // w6.w
    public final void b(int i10, a5.v vVar) {
        int i11;
        int i12;
        int i13;
        a5.a.j(this.f24318e);
        int i14 = i10 & 1;
        f fVar = this.f24314a;
        int i15 = 2;
        int i16 = 0;
        if (i14 != 0) {
            int i17 = this.f24316c;
            if (i17 != 0 && i17 != 1) {
                if (i17 == 2) {
                    a5.a.B("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i17 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        a5.a.B("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    fVar.d();
                }
            }
            this.f24316c = 1;
            this.f24317d = 0;
        }
        int i18 = i10;
        while (vVar.a() > 0) {
            int i19 = this.f24316c;
            if (i19 != 0) {
                a5.u uVar = this.f24315b;
                if (i19 != 1) {
                    if (i19 == i15) {
                        if (c(vVar, uVar.f158b, Math.min(10, this.f24322i)) && c(vVar, null, this.f24322i)) {
                            uVar.p(i16);
                            this.f24323l = -9223372036854775807L;
                            if (this.f24319f) {
                                uVar.s(4);
                                uVar.s(1);
                                uVar.s(1);
                                long jI = (uVar.i(15) << 15) | (uVar.i(3) << 30) | uVar.i(15);
                                uVar.s(1);
                                if (!this.f24321h && this.f24320g) {
                                    uVar.s(4);
                                    uVar.s(1);
                                    uVar.s(1);
                                    uVar.s(1);
                                    this.f24318e.b((uVar.i(3) << 30) | (uVar.i(15) << 15) | uVar.i(15));
                                    this.f24321h = true;
                                }
                                this.f24323l = this.f24318e.b(jI);
                            }
                            i18 |= this.k ? 4 : 0;
                            fVar.e(i18, this.f24323l);
                            this.f24316c = 3;
                            this.f24317d = 0;
                            i16 = 0;
                            i15 = 2;
                        }
                    } else {
                        if (i19 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = vVar.a();
                        int i20 = this.j;
                        int i21 = i20 == -1 ? i16 : iA - i20;
                        if (i21 > 0) {
                            iA -= i21;
                            vVar.D(vVar.f166b + iA);
                        }
                        fVar.b(vVar);
                        int i22 = this.j;
                        if (i22 != -1) {
                            int i23 = i22 - iA;
                            this.j = i23;
                            if (i23 == 0) {
                                fVar.d();
                                this.f24316c = 1;
                                this.f24317d = i16;
                            }
                        }
                    }
                    i11 = i15;
                    i12 = i16;
                } else {
                    i12 = i16;
                    if (c(vVar, uVar.f158b, 9)) {
                        uVar.p(i12);
                        int i24 = uVar.i(24);
                        if (i24 != 1) {
                            c7.a.z("Unexpected start code prefix: ", i24, "PesReader");
                            this.j = -1;
                            i13 = 0;
                            i11 = 2;
                        } else {
                            uVar.s(8);
                            int i25 = uVar.i(16);
                            uVar.s(5);
                            this.k = uVar.h();
                            i11 = 2;
                            uVar.s(2);
                            this.f24319f = uVar.h();
                            this.f24320g = uVar.h();
                            uVar.s(6);
                            int i26 = uVar.i(8);
                            this.f24322i = i26;
                            if (i25 == 0) {
                                this.j = -1;
                            } else {
                                int i27 = (i25 - 3) - i26;
                                this.j = i27;
                                if (i27 < 0) {
                                    a5.a.B("PesReader", "Found negative packet payload size: " + this.j);
                                    this.j = -1;
                                }
                            }
                            i13 = 2;
                        }
                        this.f24316c = i13;
                        i12 = 0;
                        this.f24317d = 0;
                    } else {
                        i11 = 2;
                    }
                }
            } else {
                i11 = i15;
                i12 = i16;
                vVar.F(vVar.a());
            }
            i16 = i12;
            i15 = i11;
        }
    }

    public final boolean c(a5.v vVar, byte[] bArr, int i10) {
        int iMin = Math.min(vVar.a(), i10 - this.f24317d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            vVar.F(iMin);
        } else {
            vVar.e(bArr, this.f24317d, iMin);
        }
        int i11 = this.f24317d + iMin;
        this.f24317d = i11;
        return i11 == i10;
    }

    @Override // w6.w
    public final void g(b0 b0Var, u5.m mVar, g0 g0Var) {
        this.f24318e = b0Var;
        this.f24314a.g(mVar, g0Var);
    }
}
