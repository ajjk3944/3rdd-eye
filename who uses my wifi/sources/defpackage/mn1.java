package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mn1 implements ln1 {
    public final nf1 a;
    public final jg1 b;
    public final cm c;
    public final ph4 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public mn1(nf1 nf1Var, jg1 jg1Var, cm cmVar, String str, int i) throws lq1 {
        this.a = nf1Var;
        this.b = jg1Var;
        this.c = cmVar;
        int i2 = cmVar.f;
        int i3 = cmVar.g;
        int i4 = cmVar.i * i2;
        int i5 = cmVar.h;
        int i6 = i4 / 8;
        if (i5 != i6) {
            throw lq1.a(null, ga1.l(new StringBuilder(String.valueOf(i6).length() + 28 + String.valueOf(i5).length()), "Expected block size: ", i6, "; got: ", i5));
        }
        int i7 = i3 * i6;
        int i8 = i7 * 8;
        int iMax = Math.max(i6, i7 / 10);
        this.e = iMax;
        gg4 gg4Var = new gg4();
        gg4Var.d("audio/wav");
        gg4Var.e(str);
        gg4Var.g = i8;
        gg4Var.h = i8;
        gg4Var.m = iMax;
        gg4Var.D = i2;
        gg4Var.E = i3;
        gg4Var.F = i;
        this.d = new ph4(gg4Var);
    }

    @Override // defpackage.ln1
    public final void a(int i, long j) {
        this.a.v(new pn1(this.c, 1, i, j));
        this.b.d(this.d);
    }

    @Override // defpackage.ln1
    public final boolean b(mf1 mf1Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int iB = this.b.b(mf1Var, (int) Math.min(i2 - i, j2), true);
            if (iB == -1) {
                j2 = 0;
            } else {
                this.g += iB;
                j2 -= iB;
            }
        }
        int i3 = this.g;
        int i4 = this.c.h;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long jT = this.f + v23.t(this.h, 1000000L, r2.g, RoundingMode.DOWN);
            int i6 = i5 * i4;
            int i7 = this.g - i6;
            this.b.c(jT, 1, i6, i7, null);
            this.h += i5;
            this.g = i7;
        }
        return j2 <= 0;
    }

    @Override // defpackage.ln1
    public final void d(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }
}
