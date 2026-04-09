package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ij1 {
    public final jg1 a;
    public tj1 d;
    public fj1 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final ph4 j;
    public boolean m;
    public final sj1 b = new sj1();
    public final kz2 c = new kz2();
    public final kz2 k = new kz2(1);
    public final kz2 l = new kz2();

    public ij1(jg1 jg1Var, tj1 tj1Var, fj1 fj1Var, ph4 ph4Var) {
        this.a = jg1Var;
        this.d = tj1Var;
        this.e = fj1Var;
        this.j = ph4Var;
        this.d = tj1Var;
        this.e = fj1Var;
        jg1Var.d(ph4Var);
        a();
    }

    public final void a() {
        sj1 sj1Var = this.b;
        sj1Var.d = 0;
        sj1Var.p = 0L;
        sj1Var.q = false;
        sj1Var.k = false;
        sj1Var.o = false;
        sj1Var.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.m = false;
    }

    public final int b() {
        int i = !this.m ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return e() != null ? i | 1073741824 : i;
    }

    public final boolean c() {
        this.f++;
        if (!this.m) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i, int i2) {
        kz2 kz2Var;
        rj1 rj1VarE = e();
        if (rj1VarE == null) {
            return 0;
        }
        int length = rj1VarE.d;
        sj1 sj1Var = this.b;
        if (length != 0) {
            kz2Var = sj1Var.n;
        } else {
            byte[] bArr = rj1VarE.e;
            String str = v23.a;
            length = bArr.length;
            kz2 kz2Var2 = this.l;
            kz2Var2.z(length, bArr);
            kz2Var = kz2Var2;
        }
        boolean z = sj1Var.k && sj1Var.l[this.f];
        boolean z2 = z || i2 != 0;
        int i3 = true != z2 ? 0 : 128;
        kz2 kz2Var3 = this.k;
        kz2Var3.a[0] = (byte) (i3 | length);
        kz2Var3.E(0);
        jg1 jg1Var = this.a;
        jg1Var.a(kz2Var3, 1, 1);
        jg1Var.a(kz2Var, length, 1);
        if (!z2) {
            return length + 1;
        }
        kz2 kz2Var4 = this.c;
        if (!z) {
            kz2Var4.y(8);
            byte[] bArr2 = kz2Var4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i2;
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            jg1Var.a(kz2Var4, 8, 1);
            return length + 9;
        }
        int i4 = length + 1;
        kz2 kz2Var5 = sj1Var.n;
        int iL = kz2Var5.L();
        kz2Var5.G(-2);
        int i5 = (iL * 6) + 2;
        if (i2 != 0) {
            kz2Var4.y(i5);
            byte[] bArr3 = kz2Var4.a;
            kz2Var5.H(bArr3, 0, i5);
            int i6 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i6 >> 8) & 255);
            bArr3[3] = (byte) (i6 & 255);
        } else {
            kz2Var4 = kz2Var5;
        }
        jg1Var.a(kz2Var4, i5, 1);
        return i4 + i5;
    }

    public final rj1 e() {
        if (!this.m) {
            return null;
        }
        sj1 sj1Var = this.b;
        fj1 fj1Var = sj1Var.a;
        String str = v23.a;
        int i = fj1Var.a;
        rj1 rj1Var = sj1Var.m;
        if (rj1Var == null) {
            rj1Var = this.d.a.l[i];
        }
        if (rj1Var == null || !rj1Var.a) {
            return null;
        }
        return rj1Var;
    }
}
