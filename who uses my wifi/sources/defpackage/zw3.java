package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zw3 extends cx3 {
    public final int a;
    public final int b;
    public final yw3 c;
    public final xw3 d;

    public zw3(int i, int i2, yw3 yw3Var, xw3 xw3Var) {
        this.a = i;
        this.b = i2;
        this.c = yw3Var;
        this.d = xw3Var;
    }

    @Override // defpackage.mr3
    public final boolean a() {
        return this.c != yw3.e;
    }

    public final int b() {
        yw3 yw3Var = yw3.e;
        int i = this.b;
        yw3 yw3Var2 = this.c;
        if (yw3Var2 == yw3Var) {
            return i;
        }
        if (yw3Var2 == yw3.b || yw3Var2 == yw3.c || yw3Var2 == yw3.d) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zw3)) {
            return false;
        }
        zw3 zw3Var = (zw3) obj;
        return zw3Var.a == this.a && zw3Var.b() == b() && zw3Var.c == this.c && zw3Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(zw3.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i = this.b;
        int length3 = String.valueOf(i).length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i2).length() + 10);
        ex0.q(sb, "HMAC Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        ex0.o(sb, ", ", i, "-byte tags, and ", i2);
        sb.append("-byte key)");
        return sb.toString();
    }
}
