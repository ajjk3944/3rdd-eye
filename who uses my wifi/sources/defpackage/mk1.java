package defpackage;

import java.io.EOFException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mk1 implements jg1 {
    public final jg1 a;
    public final jk1 b;
    public kk1 g;
    public ph4 h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = v23.b;
    public final kz2 c = new kz2();

    public mk1(jg1 jg1Var, jk1 jk1Var) {
        this.a = jg1Var;
        this.b = jk1Var;
    }

    @Override // defpackage.jg1
    public final void a(kz2 kz2Var, int i, int i2) {
        if (this.g == null) {
            this.a.a(kz2Var, i, i2);
            return;
        }
        e(i);
        kz2Var.H(this.f, this.e, i);
        this.e += i;
    }

    @Override // defpackage.jg1
    public final int b(ua4 ua4Var, int i, boolean z) throws EOFException {
        if (this.g == null) {
            return this.a.b(ua4Var, i, z);
        }
        e(i);
        int iD = ua4Var.d(this.f, this.e, i);
        if (iD != -1) {
            this.e += iD;
            return iD;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.jg1
    public final void c(long j, int i, int i2, int i3, ig1 ig1Var) {
        if (this.g == null) {
            this.a.c(j, i, i2, i3, ig1Var);
            return;
        }
        zt0.M("DRM on subtitles is not supported", ig1Var == null);
        int i4 = (this.e - i3) - i2;
        try {
            this.g.g(this.f, i4, i2, new lk1(this, j, i));
        } catch (RuntimeException e) {
            if (!this.i) {
                throw e;
            }
            a30.z("Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.d = i5;
        if (i5 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // defpackage.jg1
    public final void d(ph4 ph4Var) {
        String str = ph4Var.m;
        str.getClass();
        zt0.D(pp1.g(str) == 3);
        boolean zEquals = ph4Var.equals(this.h);
        jk1 jk1Var = this.b;
        if (!zEquals) {
            this.h = ph4Var;
            this.g = jk1Var.f(ph4Var) ? jk1Var.k(ph4Var) : null;
        }
        kk1 kk1Var = this.g;
        jg1 jg1Var = this.a;
        if (kk1Var == null) {
            jg1Var.d(ph4Var);
            return;
        }
        gg4 gg4Var = new gg4(ph4Var);
        gg4Var.e("application/x-media3-cues");
        gg4Var.i = str;
        gg4Var.q = Long.MAX_VALUE;
        gg4Var.J = jk1Var.i(ph4Var);
        jg1Var.d(new ph4(gg4Var));
    }

    public final void e(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int iMax = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}
