package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wm1 implements jn1 {
    public final gm1 a;
    public final lg1 b = new lg1(10, new byte[10]);
    public int c = 0;
    public int d;
    public x13 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public wm1(gm1 gm1Var) {
        this.a = gm1Var;
    }

    @Override // defpackage.jn1
    public final void a(int i, kz2 kz2Var) {
        int i2;
        int i3;
        long jC;
        long j;
        this.e.getClass();
        int i4 = i & 1;
        gm1 gm1Var = this.a;
        int i5 = -1;
        int i6 = 2;
        if (i4 != 0) {
            int i7 = this.c;
            if (i7 != 0 && i7 != 1) {
                if (i7 != 2) {
                    int i8 = this.j;
                    if (i8 != -1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i8);
                        sb.append(" more bytes");
                        a30.x(sb.toString());
                    }
                    gm1Var.c(kz2Var.c == 0);
                } else {
                    a30.x("Unexpected start indicator reading extended header");
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i9 = i;
        while (kz2Var.B() > 0) {
            int i10 = this.c;
            if (i10 != 0) {
                lg1 lg1Var = this.b;
                if (i10 != 1) {
                    if (i10 != i6) {
                        int iB = kz2Var.B();
                        int i11 = this.j;
                        int i12 = i11 == i5 ? 0 : iB - i11;
                        if (i12 > 0) {
                            iB -= i12;
                            kz2Var.C(kz2Var.b + iB);
                        }
                        gm1Var.b(kz2Var);
                        int i13 = this.j;
                        if (i13 != i5) {
                            int i14 = i13 - iB;
                            this.j = i14;
                            if (i14 == 0) {
                                gm1Var.c(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    } else {
                        if (c(kz2Var, lg1Var.a, Math.min(10, this.i)) && c(kz2Var, null, this.i)) {
                            lg1Var.l(0);
                            if (this.f) {
                                lg1Var.o(4);
                                long jR = lg1Var.r(3);
                                lg1Var.o(1);
                                int iR = lg1Var.r(15) << 15;
                                lg1Var.o(1);
                                long jR2 = lg1Var.r(15);
                                lg1Var.o(1);
                                if (this.h || !this.g) {
                                    j = jR;
                                } else {
                                    lg1Var.o(4);
                                    j = jR;
                                    lg1Var.o(1);
                                    int iR2 = lg1Var.r(15) << 15;
                                    lg1Var.o(1);
                                    long jR3 = lg1Var.r(15);
                                    lg1Var.o(1);
                                    this.e.c((lg1Var.r(3) << 30) | iR2 | jR3);
                                    this.h = true;
                                }
                                jC = this.e.c(jR2 | (j << 30) | iR);
                            } else {
                                jC = -9223372036854775807L;
                            }
                            i9 |= true != this.k ? 0 : 4;
                            gm1Var.d(i9, jC);
                            this.c = 3;
                            this.d = 0;
                            i5 = -1;
                            i6 = 2;
                        }
                    }
                    i2 = i6;
                } else if (c(kz2Var, lg1Var.a, 9)) {
                    lg1Var.l(0);
                    int iR3 = lg1Var.r(24);
                    if (iR3 != 1) {
                        ga1.q(new StringBuilder(String.valueOf(iR3).length() + 30), iR3, "Unexpected start code prefix: ");
                        i5 = -1;
                        this.j = -1;
                        i3 = 0;
                        i2 = 2;
                    } else {
                        lg1Var.o(8);
                        int iR4 = lg1Var.r(16);
                        lg1Var.o(5);
                        this.k = lg1Var.q();
                        i2 = 2;
                        lg1Var.o(2);
                        this.f = lg1Var.q();
                        this.g = lg1Var.q();
                        lg1Var.o(6);
                        int iR5 = lg1Var.r(8);
                        this.i = iR5;
                        if (iR4 == 0) {
                            this.j = -1;
                            i3 = 2;
                            i5 = -1;
                        } else {
                            int i15 = (iR4 - 3) - iR5;
                            this.j = i15;
                            if (i15 < 0) {
                                ga1.q(new StringBuilder(String.valueOf(i15).length() + 36), i15, "Found negative packet payload size: ");
                                i5 = -1;
                                this.j = -1;
                            } else {
                                i5 = -1;
                            }
                            i3 = 2;
                        }
                    }
                    this.c = i3;
                    this.d = 0;
                } else {
                    i5 = -1;
                    i2 = 2;
                }
            } else {
                i2 = i6;
                kz2Var.G(kz2Var.B());
            }
            i6 = i2;
        }
    }

    @Override // defpackage.jn1
    public final void b(x13 x13Var, nf1 nf1Var, in1 in1Var) {
        this.e = x13Var;
        this.a.e(nf1Var, in1Var);
    }

    public final boolean c(kz2 kz2Var, byte[] bArr, int i) {
        int iMin = Math.min(kz2Var.B(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            kz2Var.G(iMin);
        } else {
            kz2Var.H(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    @Override // defpackage.jn1
    public final void d() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }
}
