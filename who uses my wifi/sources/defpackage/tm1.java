package defpackage;

import java.util.Collections;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tm1 implements gm1 {
    public final String a;
    public final int b;
    public final kz2 c;
    public final lg1 d;
    public jg1 e;
    public String f;
    public ph4 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public tm1(String str, int i) {
        this.a = str;
        this.b = i;
        kz2 kz2Var = new kz2(1024);
        this.c = kz2Var;
        byte[] bArr = kz2Var.a;
        this.d = new lg1(bArr.length, bArr);
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.gm1
    public final void a() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // defpackage.gm1
    public final void b(kz2 kz2Var) throws lq1 {
        int iR;
        int i;
        int i2;
        int iR2;
        boolean zQ;
        int i3;
        this.e.getClass();
        while (kz2Var.B() > 0) {
            int i4 = this.h;
            if (i4 != 0) {
                int i5 = 2;
                if (i4 != 1) {
                    lg1 lg1Var = this.d;
                    kz2 kz2Var2 = this.c;
                    if (i4 != 2) {
                        int iMin = Math.min(kz2Var.B(), this.j - this.i);
                        kz2Var.H(lg1Var.a, this.i, iMin);
                        int i6 = this.i + iMin;
                        this.i = i6;
                        if (i6 == this.j) {
                            lg1Var.l(0);
                            if (lg1Var.q()) {
                                if (this.m) {
                                }
                                this.h = 0;
                            } else {
                                this.m = true;
                                int iR3 = lg1Var.r(1);
                                if (iR3 == 1) {
                                    iR2 = lg1Var.r(1);
                                    i2 = 1;
                                } else {
                                    i2 = iR3;
                                    iR2 = 0;
                                }
                                this.n = iR2;
                                if (iR2 != 0) {
                                    throw lq1.a(null, null);
                                }
                                if (i2 == 1) {
                                    lg1Var.r((lg1Var.r(2) + 1) * 8);
                                    i2 = 1;
                                }
                                if (!lg1Var.q()) {
                                    throw lq1.a(null, null);
                                }
                                this.o = lg1Var.r(6);
                                int iR4 = lg1Var.r(4);
                                int iR5 = lg1Var.r(3);
                                if (iR4 != 0 || iR5 != 0) {
                                    throw lq1.a(null, null);
                                }
                                if (i2 == 0) {
                                    int i7 = (lg1Var.b * 8) + lg1Var.c;
                                    int iF = lg1Var.f();
                                    qe1 qe1VarG0 = i30.g0(lg1Var, true);
                                    this.v = qe1VarG0.a;
                                    this.s = qe1VarG0.b;
                                    this.u = qe1VarG0.c;
                                    int iF2 = iF - lg1Var.f();
                                    lg1Var.l(i7);
                                    byte[] bArr = new byte[(iF2 + 7) / 8];
                                    lg1Var.v(iF2, bArr);
                                    gg4 gg4Var = new gg4();
                                    gg4Var.a = this.f;
                                    gg4Var.d("video/mp2t");
                                    gg4Var.e("audio/mp4a-latm");
                                    gg4Var.i = this.v;
                                    gg4Var.D = this.u;
                                    gg4Var.E = this.s;
                                    gg4Var.o = Collections.singletonList(bArr);
                                    gg4Var.d = this.a;
                                    gg4Var.f = this.b;
                                    ph4 ph4Var = new ph4(gg4Var);
                                    if (!ph4Var.equals(this.g)) {
                                        this.g = ph4Var;
                                        this.t = 1024000000 / ph4Var.F;
                                        this.e.d(ph4Var);
                                    }
                                } else {
                                    int iF3 = lg1Var.f();
                                    qe1 qe1VarG02 = i30.g0(lg1Var, true);
                                    this.v = qe1VarG02.a;
                                    this.s = qe1VarG02.b;
                                    this.u = qe1VarG02.c;
                                    lg1Var.o(lg1Var.r((lg1Var.r(2) + 1) * 8) - (iF3 - lg1Var.f()));
                                }
                                int iR6 = lg1Var.r(3);
                                this.p = iR6;
                                if (iR6 == 0) {
                                    lg1Var.o(8);
                                } else if (iR6 == 1) {
                                    lg1Var.o(9);
                                } else if (iR6 == 3 || iR6 == 4 || iR6 == 5) {
                                    lg1Var.o(6);
                                } else {
                                    if (iR6 != 6 && iR6 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    lg1Var.o(1);
                                }
                                boolean zQ2 = lg1Var.q();
                                this.q = zQ2;
                                this.r = 0L;
                                if (zQ2) {
                                    if (i2 != 1) {
                                        do {
                                            zQ = lg1Var.q();
                                            this.r = (this.r << 8) + lg1Var.r(8);
                                        } while (zQ);
                                    } else {
                                        this.r = lg1Var.r((lg1Var.r(2) + 1) * 8);
                                    }
                                }
                                if (lg1Var.q()) {
                                    lg1Var.o(8);
                                }
                            }
                            if (this.n != 0) {
                                throw lq1.a(null, null);
                            }
                            if (this.o != 0) {
                                throw lq1.a(null, null);
                            }
                            if (this.p != 0) {
                                throw lq1.a(null, null);
                            }
                            int i8 = 0;
                            do {
                                iR = lg1Var.r(8);
                                i8 += iR;
                            } while (iR == 255);
                            int i9 = (lg1Var.b * 8) + lg1Var.c;
                            if ((i9 & 7) == 0) {
                                kz2Var2.E(i9 >> 3);
                                i = 0;
                            } else {
                                lg1Var.v(i8 * 8, kz2Var2.a);
                                i = 0;
                                kz2Var2.E(0);
                            }
                            this.e.a(kz2Var2, i8, i);
                            zt0.b0(this.l != -9223372036854775807L);
                            this.e.c(this.l, 1, i8, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                lg1Var.o((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    } else {
                        int iK = ((this.k & (-225)) << 8) | kz2Var.K();
                        this.j = iK;
                        if (iK > kz2Var2.a.length) {
                            kz2Var2.y(iK);
                            byte[] bArr2 = kz2Var2.a;
                            int length = bArr2.length;
                            lg1Var.a = bArr2;
                            i3 = 0;
                            lg1Var.b = 0;
                            lg1Var.c = 0;
                            lg1Var.d = length;
                        } else {
                            i3 = 0;
                        }
                        this.i = i3;
                        this.h = 3;
                    }
                } else {
                    int iK2 = kz2Var.K();
                    if ((iK2 & 224) == 224) {
                        this.k = iK2;
                    } else if (iK2 != 86) {
                        i5 = 0;
                    }
                    this.h = i5;
                }
            } else if (kz2Var.K() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // defpackage.gm1
    public final void d(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.gm1
    public final void e(nf1 nf1Var, in1 in1Var) {
        in1Var.a();
        in1Var.b();
        this.e = nf1Var.z(in1Var.d, 1);
        in1Var.b();
        this.f = in1Var.e;
    }

    @Override // defpackage.gm1
    public final void c(boolean z) {
    }
}
