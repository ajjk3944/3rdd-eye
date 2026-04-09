package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hz2 {
    public final String a;
    public final String b;
    public final Drawable c;

    public hz2(String str, String str2, Drawable drawable) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.b = str2;
        this.c = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof hz2) {
            hz2 hz2Var = (hz2) obj;
            Drawable drawable2 = hz2Var.c;
            String str = hz2Var.a;
            String str2 = this.a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.b.equals(hz2Var.b) && ((drawable = this.c) != null ? drawable.equals(drawable2) : drawable2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
        Drawable drawable = this.c;
        return (drawable != null ? drawable.hashCode() : 0) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String str = this.a;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        ex0.q(sb, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return ex0.l(sb, ", icon=", strValueOf, "}");
    }
}
