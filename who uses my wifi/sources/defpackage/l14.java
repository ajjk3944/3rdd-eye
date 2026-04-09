package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l14 extends cx3 {
    public final ps3 a;
    public final j14 b;
    public final ls3 c;
    public final ts3 d;

    public l14(ps3 ps3Var, j14 j14Var, ls3 ls3Var, ts3 ts3Var) {
        this.a = ps3Var;
        this.b = j14Var;
        this.c = ls3Var;
        this.d = ts3Var;
    }

    @Override // defpackage.mr3
    public final boolean a() {
        return this.d != ts3.n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l14)) {
            return false;
        }
        l14 l14Var = (l14) obj;
        return l14Var.a == this.a && l14Var.b == this.b && l14Var.c == this.c && l14Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(l14.class, this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        String str = this.d.g;
        int length = str.length();
        String str2 = this.c.b;
        int length2 = str2.length();
        String str3 = this.a.g;
        int length3 = str3.length();
        String str4 = this.b.a;
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + str4.length() + 1);
        ex0.q(sb, "ECDSA Parameters (variant: ", str, ", hashType: ", str2);
        ex0.q(sb, ", encoding: ", str3, ", curve: ", str4);
        sb.append(")");
        return sb.toString();
    }
}
