package defpackage;

import android.app.Activity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class iz2 {
    public final Activity a;
    public final jh1 b;
    public final String c;
    public final String d;

    public iz2(Activity activity, jh1 jh1Var, String str, String str2) {
        this.a = activity;
        this.b = jh1Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        jh1 jh1Var;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof iz2) {
            iz2 iz2Var = (iz2) obj;
            String str3 = iz2Var.d;
            String str4 = iz2Var.c;
            jh1 jh1Var2 = iz2Var.b;
            if (this.a.equals(iz2Var.a) && ((jh1Var = this.b) != null ? jh1Var.equals(jh1Var2) : jh1Var2 == null) && ((str = this.c) != null ? str.equals(str4) : str4 == null) && ((str2 = this.d) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        jh1 jh1Var = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (jh1Var == null ? 0 : jh1Var.hashCode())) * 1000003;
        String str = this.c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.b);
        int length2 = strValueOf.length();
        String str = this.c;
        int length3 = String.valueOf(str).length();
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        ex0.q(sb, "OfflineUtilsParams{activity=", string, ", adOverlay=", strValueOf);
        ex0.q(sb, ", gwsQueryId=", str, ", uri=", str2);
        sb.append("}");
        return sb.toString();
    }
}
