package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d02 {
    public final int a;
    public final String b;
    public final int c;
    public final ph4[] d;
    public int e;

    static {
        String str = v23.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public d02(String str, ph4... ph4VarArr) {
        int length = ph4VarArr.length;
        int i = 1;
        zt0.D(length > 0);
        this.b = str;
        this.d = ph4VarArr;
        this.a = length;
        int iG = pp1.g(ph4VarArr[0].m);
        this.c = iG == -1 ? pp1.g(ph4VarArr[0].l) : iG;
        String str2 = ph4VarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i2 = ph4VarArr[0].f | 16384;
        while (true) {
            ph4[] ph4VarArr2 = this.d;
            if (i >= ph4VarArr2.length) {
                return;
            }
            String str3 = ph4VarArr2[i].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                ph4[] ph4VarArr3 = this.d;
                a("languages", ph4VarArr3[0].d, ph4VarArr3[i].d, i);
                return;
            } else {
                ph4[] ph4VarArr4 = this.d;
                if (i2 != (ph4VarArr4[i].f | 16384)) {
                    a("role flags", Integer.toBinaryString(ph4VarArr4[0].f), Integer.toBinaryString(this.d[i].f), i);
                    return;
                }
                i++;
            }
        }
    }

    public static void a(String str, String str2, String str3, int i) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i).length() + 1);
        ex0.q(sb, "Different ", str, " combined in one TrackGroup: '", str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        a30.C("TrackGroup", "", new IllegalStateException(sb.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d02.class == obj.getClass()) {
            d02 d02Var = (d02) obj;
            if (this.b.equals(d02Var.b) && Arrays.equals(this.d, d02Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.d) + ((this.b.hashCode() + 527) * 31);
        this.e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string = Arrays.toString(this.d);
        String str = this.b;
        return ex0.l(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length()), str, ": ", string);
    }
}
