package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ds3 extends tr3 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final cs3 e;
    public final bs3 f;

    public ds3(int i, int i2, int i3, int i4, cs3 cs3Var, bs3 bs3Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = cs3Var;
        this.f = bs3Var;
    }

    @Override // defpackage.mr3
    public final boolean a() {
        return this.e != cs3.j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ds3)) {
            return false;
        }
        ds3 ds3Var = (ds3) obj;
        return ds3Var.a == this.a && ds3Var.b == this.b && ds3Var.c == this.c && ds3Var.d == this.d && ds3Var.e == this.e && ds3Var.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(ds3.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.e);
        String strValueOf2 = String.valueOf(this.f);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i = this.c;
        int length3 = String.valueOf(i).length();
        int i2 = this.d;
        int length4 = String.valueOf(i2).length();
        int i3 = this.a;
        int length5 = String.valueOf(i3).length();
        int i4 = this.b;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i4).length() + 15);
        ex0.q(sb, "AesCtrHmacAead Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        ex0.o(sb, ", ", i, "-byte IV, and ", i2);
        ex0.o(sb, "-byte tags, and ", i3, "-byte AES key, and ", i4);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }
}
