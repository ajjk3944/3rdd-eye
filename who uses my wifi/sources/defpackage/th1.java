package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class th1 extends wh1 {
    public final String b;
    public final String c;
    public final String d;

    public th1(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && th1.class == obj.getClass()) {
            th1 th1Var = (th1) obj;
            if (Objects.equals(this.c, th1Var.c) && Objects.equals(this.b, th1Var.b) && Objects.equals(this.d, th1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() + ((this.b.hashCode() + 527) * 31);
        String str = this.d;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.wh1
    public final String toString() {
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.d;
        int length2 = String.valueOf(str2).length();
        String str3 = this.b;
        int length3 = str3.length() + length + 11 + 14;
        String str4 = this.c;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 7 + length2);
        ex0.q(sb, str, ": language=", str3, ", description=");
        return ex0.l(sb, str4, ", text=", str2);
    }
}
