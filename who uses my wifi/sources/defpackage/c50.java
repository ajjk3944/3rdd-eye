package defpackage;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c50 extends tn0 {
    public static final DecimalFormat q;
    public static final DecimalFormat r;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        q = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(2);
        DecimalFormat decimalFormat2 = new DecimalFormat();
        r = decimalFormat2;
        decimalFormat2.setMinimumIntegerDigits(3);
    }

    public static long q(int i) throws t91 {
        long j = i >> 4;
        int i2 = i & 15;
        if (j > 9 || i2 > 9) {
            throw new t91("Invalid LOC Encoding");
        }
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                return j;
            }
            j *= 10;
            i2 = i3;
        }
    }

    public static String r(long j, char c, char c2) {
        StringBuilder sb = new StringBuilder();
        long j2 = j - 2147483648L;
        if (j2 < 0) {
            j2 = -j2;
            c = c2;
        }
        sb.append(j2 / 3600000);
        long j3 = j2 % 3600000;
        sb.append(" ");
        sb.append(j3 / 60000);
        sb.append(" ");
        s(sb, r, j3 % 60000, 1000L);
        sb.append(" ");
        sb.append(c);
        return sb.toString();
    }

    public static void s(StringBuilder sb, NumberFormat numberFormat, long j, long j2) {
        sb.append(j / j2);
        long j3 = j % j2;
        if (j3 != 0) {
            sb.append(".");
            sb.append(numberFormat.format(j3));
        }
    }

    public static int t(long j) {
        byte b = 0;
        while (j > 9) {
            b = (byte) (b + 1);
            j /= 10;
        }
        return (int) ((j << 4) + (b & 255));
    }

    @Override // defpackage.tn0
    public final void k(cm cmVar) throws t91 {
        if (cmVar.i() != 0) {
            throw new t91("Invalid LOC version");
        }
        this.k = q(cmVar.i());
        this.l = q(cmVar.i());
        this.m = q(cmVar.i());
        this.n = cmVar.g();
        this.o = cmVar.g();
        this.p = cmVar.g();
    }

    @Override // defpackage.tn0
    public final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(r(this.n, 'N', 'S'));
        sb.append(" ");
        sb.append(r(this.o, 'E', 'W'));
        sb.append(" ");
        long j = this.p - 10000000;
        DecimalFormat decimalFormat = q;
        s(sb, decimalFormat, j, 100L);
        sb.append("m ");
        s(sb, decimalFormat, this.k, 100L);
        sb.append("m ");
        s(sb, decimalFormat, this.l, 100L);
        sb.append("m ");
        s(sb, decimalFormat, this.m, 100L);
        sb.append("m");
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.q(0);
        t3Var.q(t(this.k));
        t3Var.q(t(this.l));
        t3Var.q(t(this.m));
        t3Var.o(this.n);
        t3Var.o(this.o);
        t3Var.o(this.p);
    }
}
