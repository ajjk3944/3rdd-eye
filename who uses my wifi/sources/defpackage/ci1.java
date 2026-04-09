package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ci1 extends wh1 {
    public final String b;
    public final String c;

    public ci1(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ci1.class == obj.getClass()) {
            ci1 ci1Var = (ci1) obj;
            if (this.a.equals(ci1Var.a) && Objects.equals(this.b, ci1Var.b) && Objects.equals(this.c, ci1Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() + 527;
        String str = this.b;
        return this.c.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.wh1
    public final String toString() {
        String str = this.a;
        int length = String.valueOf(str).length() + 6;
        String str2 = this.c;
        return ex0.l(new StringBuilder(str2.length() + length), str, ": url=", str2);
    }
}
