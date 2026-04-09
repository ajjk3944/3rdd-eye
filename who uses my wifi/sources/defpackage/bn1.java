package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bn1 implements jn1 {
    public final an1 a;
    public final kz2 b = new kz2(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public bn1(an1 an1Var) {
        this.a = an1Var;
    }

    @Override // defpackage.jn1
    public final void a(int i, kz2 kz2Var) {
        int i2 = i & 1;
        int iK = i2 != 0 ? kz2Var.b + kz2Var.K() : -1;
        if (this.f) {
            if (i2 == 0) {
                return;
            }
            this.f = false;
            kz2Var.E(iK);
            this.d = 0;
        }
        while (kz2Var.B() > 0) {
            int i3 = this.d;
            kz2 kz2Var2 = this.b;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iK2 = kz2Var.K();
                    kz2Var.E(kz2Var.b - 1);
                    if (iK2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(kz2Var.B(), 3 - this.d);
                kz2Var.H(kz2Var2.a, this.d, iMin);
                int i4 = this.d + iMin;
                this.d = i4;
                if (i4 == 3) {
                    kz2Var2.E(0);
                    kz2Var2.C(3);
                    kz2Var2.G(1);
                    int iK3 = kz2Var2.K();
                    boolean z = (iK3 & 128) != 0;
                    int iK4 = kz2Var2.K();
                    this.e = z;
                    int i5 = (((iK3 & 15) << 8) | iK4) + 3;
                    this.c = i5;
                    byte[] bArr = kz2Var2.a;
                    if (bArr.length < i5) {
                        int length = bArr.length;
                        kz2Var2.A(Math.min(4098, Math.max(i5, length + length)));
                    }
                }
            } else {
                int iMin2 = Math.min(kz2Var.B(), this.c - this.d);
                kz2Var.H(kz2Var2.a, this.d, iMin2);
                int i6 = this.d + iMin2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.e) {
                        kz2Var2.C(i7);
                    } else {
                        if (v23.f(0, i7, -1, kz2Var2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        kz2Var2.C(this.c - 4);
                    }
                    kz2Var2.E(0);
                    this.a.e(kz2Var2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.jn1
    public final void b(x13 x13Var, nf1 nf1Var, in1 in1Var) {
        this.a.b(x13Var, nf1Var, in1Var);
        this.f = true;
    }

    @Override // defpackage.jn1
    public final void d() {
        this.f = true;
    }
}
