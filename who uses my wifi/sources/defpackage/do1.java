package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class do1 {
    public final String a;
    public final String b;

    public do1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && do1.class == obj.getClass()) {
            do1 do1Var = (do1) obj;
            if (TextUtils.equals(this.a, do1Var.a) && TextUtils.equals(this.b, do1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        ex0.q(sb, "Header[name=", str, ",value=", str2);
        sb.append("]");
        return sb.toString();
    }
}
