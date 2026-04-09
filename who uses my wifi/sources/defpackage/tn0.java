package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Supplier;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class tn0 implements Cloneable, Comparable, Serializable {
    public static final DecimalFormat j;
    public gg0 f;
    public int g;
    public int h;
    public long i;

    static {
        k80.d(tn0.class);
        DecimalFormat decimalFormat = new DecimalFormat();
        j = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(3);
    }

    public tn0(gg0 gg0Var, int i, int i2) {
        if (!gg0Var.isAbsolute()) {
            throw new l30(gg0Var);
        }
        k31.a(i);
        yl.a(i2);
        qb1.e(0L);
        this.f = gg0Var;
        this.g = i;
        this.h = i2;
        this.i = 0L;
    }

    public static String a(byte[] bArr, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('\"');
        }
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 32 || i >= 127) {
                sb.append('\\');
                sb.append(j.format(i));
            } else if (i == 34 || i == 92) {
                sb.append('\\');
                sb.append((char) i);
            } else {
                sb.append((char) i);
            }
        }
        if (z) {
            sb.append('\"');
        }
        return sb.toString();
    }

    public static void b(String str, gg0 gg0Var) {
        if (gg0Var.isAbsolute()) {
            return;
        }
        throw new l30("'" + gg0Var + "' on field " + str + " is not an absolute name");
    }

    public static void c(String str, int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("\"" + str + "\" " + i + " must be an unsigned 16 bit value");
        }
    }

    public static tn0 e(cm cmVar, int i, boolean z) throws t91 {
        int i2 = cmVar.g;
        ByteBuffer byteBuffer = (ByteBuffer) cmVar.j;
        gg0 gg0Var = new gg0(cmVar);
        int iF = cmVar.f();
        int iF2 = cmVar.f();
        if (i == 0) {
            return i(gg0Var, iF, iF2, 0L);
        }
        long jG = cmVar.g();
        int iF3 = cmVar.f();
        if (iF3 == 0 && z && (i == 1 || i == 2)) {
            return i(gg0Var, iF, iF2, jG);
        }
        tn0 tn0VarG = g(gg0Var, iF, iF2, jG, true);
        if (byteBuffer.remaining() < iF3) {
            throw new t91("truncated record");
        }
        if (iF3 > i2 - byteBuffer.position()) {
            throw new IllegalArgumentException("cannot set active region past end of input");
        }
        byteBuffer.limit(byteBuffer.position() + iF3);
        tn0VarG.k(cmVar);
        if (byteBuffer.remaining() > 0) {
            throw new t91("invalid record length");
        }
        byteBuffer.limit(i2);
        return tn0VarG;
    }

    public static tn0 g(gg0 gg0Var, int i, int i2, long j2, boolean z) {
        tn0 psVar;
        if (z) {
            bs0 bs0Var = k31.a;
            bs0Var.getClass();
            k31.a(i);
            Supplier supplier = (Supplier) bs0Var.m.get(Integer.valueOf(i));
            psVar = supplier != null ? (tn0) supplier.get() : new t31();
        } else {
            psVar = new ps();
        }
        psVar.f = gg0Var;
        psVar.g = i;
        psVar.h = i2;
        psVar.i = j2;
        return psVar;
    }

    public static tn0 i(gg0 gg0Var, int i, int i2, long j2) {
        if (!gg0Var.isAbsolute()) {
            throw new l30(gg0Var);
        }
        k31.a(i);
        yl.a(i2);
        qb1.e(j2);
        return g(gg0Var, i, i2, j2, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        tn0 tn0Var = (tn0) obj;
        if (this == tn0Var) {
            return 0;
        }
        int iD = this.f.compareTo(tn0Var.f);
        if (iD != 0) {
            return iD;
        }
        int i = this.h - tn0Var.h;
        if (i != 0) {
            return i;
        }
        int i2 = this.g - tn0Var.g;
        if (i2 != 0) {
            return i2;
        }
        byte[] bArrJ = j();
        byte[] bArrJ2 = tn0Var.j();
        int iMin = Math.min(bArrJ.length, bArrJ2.length);
        for (int i3 = 0; i3 < iMin; i3++) {
            byte b = bArrJ[i3];
            byte b2 = bArrJ2[i3];
            if (b != b2) {
                return (b & 255) - (b2 & 255);
            }
        }
        return bArrJ.length - bArrJ2.length;
    }

    public final tn0 d() {
        try {
            return (tn0) clone();
        } catch (CloneNotSupportedException unused) {
            throw new IllegalStateException();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof tn0)) {
            return false;
        }
        tn0 tn0Var = (tn0) obj;
        if (this.g == tn0Var.g && this.h == tn0Var.h && this.f.equals(tn0Var.f)) {
            return Arrays.equals(j(), tn0Var.j());
        }
        return false;
    }

    public gg0 f() {
        return null;
    }

    public int h() {
        return this.g;
    }

    public int hashCode() {
        int i = 0;
        for (byte b : p(true)) {
            i += (i << 3) + (b & 255);
        }
        return i;
    }

    public final byte[] j() {
        t3 t3Var = new t3(2, (byte) 0);
        m(t3Var, null, true);
        return t3Var.i();
    }

    public abstract void k(cm cmVar);

    public abstract String l();

    public abstract void m(t3 t3Var, jh jhVar, boolean z);

    public final boolean n(tn0 tn0Var) {
        return h() == tn0Var.h() && this.h == tn0Var.h && this.f.equals(tn0Var.f);
    }

    public final void o(t3 t3Var, int i, jh jhVar) {
        this.f.q(t3Var, jhVar);
        t3Var.m(this.g);
        t3Var.m(this.h);
        if (i == 0) {
            return;
        }
        t3Var.o(this.i);
        int i2 = t3Var.g;
        t3Var.m(0);
        m(t3Var, jhVar, false);
        t3Var.n((t3Var.g - i2) - 2, i2);
    }

    public final byte[] p(boolean z) {
        t3 t3Var = new t3(2, (byte) 0);
        this.f.s(t3Var);
        t3Var.m(this.g);
        t3Var.m(this.h);
        if (z) {
            t3Var.o(0L);
        } else {
            t3Var.o(this.i);
        }
        int i = t3Var.g;
        t3Var.m(0);
        m(t3Var, null, true);
        t3Var.n((t3Var.g - i) - 2, i);
        return t3Var.i();
    }

    public String toString() {
        HashMap map;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        if (sb.length() < 8) {
            sb.append("\t");
        }
        if (sb.length() < 16) {
            sb.append("\t");
        }
        sb.append("\t");
        HashMap map2 = tj0.a;
        if (map2 == null || map2.get("BINDTTL".toLowerCase()) == null) {
            sb.append(this.i);
        } else {
            long j2 = this.i;
            qb1.e(j2);
            StringBuilder sb2 = new StringBuilder();
            long j3 = j2 % 60;
            long j4 = j2 / 60;
            long j5 = j4 % 60;
            long j6 = j4 / 60;
            long j7 = j6 % 24;
            long j8 = j6 / 24;
            long j9 = j8 % 7;
            long j10 = j8 / 7;
            if (j10 > 0) {
                sb2.append(j10);
                sb2.append("W");
            }
            if (j9 > 0) {
                sb2.append(j9);
                sb2.append("D");
            }
            if (j7 > 0) {
                sb2.append(j7);
                sb2.append("H");
            }
            if (j5 > 0) {
                sb2.append(j5);
                sb2.append("M");
            }
            if (j3 > 0 || (j10 == 0 && j9 == 0 && j7 == 0 && j5 == 0)) {
                sb2.append(j3);
                sb2.append("S");
            }
            sb.append(sb2.toString());
        }
        sb.append("\t");
        if (this.h != 1 || (map = tj0.a) == null || map.get("noPrintIN".toLowerCase()) == null) {
            sb.append(yl.a.e(this.h));
            sb.append("\t");
        }
        sb.append(k31.a.e(this.g));
        String strL = l();
        if (!strL.isEmpty()) {
            sb.append("\t");
            sb.append(strL);
        }
        return sb.toString();
    }
}
