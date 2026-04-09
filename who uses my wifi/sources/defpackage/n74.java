package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class n74 {
    public static final n74 h;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        int i = -1;
        h = new n74(1, 2, 3, null, i, i);
        String str = v23.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ n74(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
        this.e = i4;
        this.f = i5;
    }

    public static boolean a(n74 n74Var) {
        if (n74Var == null) {
            return true;
        }
        int i = n74Var.a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = n74Var.b;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = n74Var.c;
        if ((i3 != -1 && i3 != 3) || n74Var.d != null) {
            return false;
        }
        int i4 = n74Var.f;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = n74Var.e;
        return i5 == -1 || i5 == 8;
    }

    public static int b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String e(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? ex0.j(new StringBuilder(String.valueOf(i).length() + 22), "Undefined color space ", i) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String f(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? ex0.j(new StringBuilder(String.valueOf(i).length() + 25), "Undefined color transfer ", i) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static String g(int i) {
        return i != -1 ? i != 1 ? i != 2 ? ex0.j(new StringBuilder(String.valueOf(i).length() + 22), "Undefined color range ", i) : "Limited range" : "Full range" : "Unset color range";
    }

    public final boolean d() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n74.class == obj.getClass()) {
            n74 n74Var = (n74) obj;
            if (this.a == n74Var.a && this.b == n74Var.b && this.c == n74Var.c && Arrays.equals(this.d, n74Var.d) && this.e == n74Var.e && this.f == n74Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((Arrays.hashCode(this.d) + ((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        this.g = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String strE = e(this.a);
        String strG = g(this.b);
        String strF = f(this.c);
        int i = this.e;
        String strI = i != -1 ? ex0.i(new StringBuilder(String.valueOf(i).length() + 8), i, "bit Luma") : "NA";
        int i2 = this.f;
        String strI2 = i2 != -1 ? ex0.i(new StringBuilder(String.valueOf(i2).length() + 10), i2, "bit Chroma") : "NA";
        boolean z = this.d != null;
        StringBuilder sb = new StringBuilder(ga1.i(strI2, ga1.i(strI, ga1.i(String.valueOf(z), ga1.i(strG, strE.length() + 12, 2) + strF.length() + 2, 2), 2), 1));
        sb.append("ColorInfo(");
        sb.append(strE);
        sb.append(", ");
        sb.append(strG);
        sb.append(", ");
        sb.append(strF);
        sb.append(", ");
        sb.append(z);
        ex0.q(sb, ", ", strI, ", ", strI2);
        sb.append(")");
        return sb.toString();
    }
}
