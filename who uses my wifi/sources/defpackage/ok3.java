package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ok3 {
    public final int a;
    public final String b;
    public final int c;

    public ok3(String str, int i, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ok3) {
            ok3 ok3Var = (ok3) obj;
            String str2 = ok3Var.b;
            if (this.a == ok3Var.a && ((str = this.b) != null ? str.equals(str2) : str2 == null) && this.c == ok3Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return (((str == null ? 0 : str.hashCode()) ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ this.c;
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        String str = this.b;
        int length2 = String.valueOf(str).length();
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 9 + String.valueOf(i2).length() + 1);
        sb.append("OverlayDisplayState{statusCode=");
        sb.append(i);
        sb.append(", sessionToken=");
        sb.append(str);
        return ga1.k(sb, ", uiMode=", i2, "}");
    }
}
