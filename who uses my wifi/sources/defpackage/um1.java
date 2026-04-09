package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class um1 implements gm1 {
    public final kz2 a;
    public final xf1 b;
    public final String c;
    public final int d;
    public final String e;
    public jg1 f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public um1(int i, String str, String str2) {
        kz2 kz2Var = new kz2(4);
        this.a = kz2Var;
        kz2Var.a[0] = -1;
        this.b = new xf1();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.gm1
    public final void a() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.gm1
    public final void b(kz2 kz2Var) {
        this.f.getClass();
        while (kz2Var.B() > 0) {
            int i = this.h;
            kz2 kz2Var2 = this.a;
            if (i == 0) {
                byte[] bArr = kz2Var.a;
                int i2 = kz2Var.b;
                int i3 = kz2Var.c;
                while (true) {
                    if (i2 >= i3) {
                        kz2Var.E(i3);
                        break;
                    }
                    int i4 = i2 + 1;
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        kz2Var.E(i4);
                        this.k = false;
                        kz2Var2.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2 = i4;
                }
            } else if (i != 1) {
                int iMin = Math.min(kz2Var.B(), this.m - this.i);
                this.f.a(kz2Var, iMin, 0);
                int i5 = this.i + iMin;
                this.i = i5;
                if (i5 >= this.m) {
                    zt0.b0(this.n != -9223372036854775807L);
                    this.f.c(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            } else {
                int iMin2 = Math.min(kz2Var.B(), 4 - this.i);
                kz2Var.H(kz2Var2.a, this.i, iMin2);
                int i6 = this.i + iMin2;
                this.i = i6;
                if (i6 >= 4) {
                    kz2Var2.E(0);
                    int iB = kz2Var2.b();
                    xf1 xf1Var = this.b;
                    if (xf1Var.a(iB)) {
                        this.m = xf1Var.b;
                        if (!this.j) {
                            this.l = (xf1Var.f * 1000000) / xf1Var.c;
                            gg4 gg4Var = new gg4();
                            gg4Var.a = this.g;
                            gg4Var.d(this.e);
                            gg4Var.e((String) xf1Var.g);
                            gg4Var.m = 4096;
                            gg4Var.D = xf1Var.d;
                            gg4Var.E = xf1Var.c;
                            gg4Var.d = this.c;
                            gg4Var.f = this.d;
                            this.f.d(new ph4(gg4Var));
                            this.j = true;
                        }
                        kz2Var2.E(0);
                        this.f.a(kz2Var2, 4, 0);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            }
        }
    }

    @Override // defpackage.gm1
    public final void d(int i, long j) {
        this.n = j;
    }

    @Override // defpackage.gm1
    public final void e(nf1 nf1Var, in1 in1Var) {
        in1Var.a();
        in1Var.b();
        this.g = in1Var.e;
        in1Var.b();
        this.f = nf1Var.z(in1Var.d, 1);
    }

    @Override // defpackage.gm1
    public final void c(boolean z) {
    }
}
