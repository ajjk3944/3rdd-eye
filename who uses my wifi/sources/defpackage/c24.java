package defpackage;

import java.math.BigInteger;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c24 extends cx3 {
    public static final BigInteger e = BigInteger.valueOf(65537);
    public final int a;
    public final BigInteger b;
    public final b24 c;
    public final a24 d;

    public c24(int i, BigInteger bigInteger, b24 b24Var, a24 a24Var) {
        this.a = i;
        this.b = bigInteger;
        this.c = b24Var;
        this.d = a24Var;
    }

    @Override // defpackage.mr3
    public final boolean a() {
        return this.c != b24.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c24)) {
            return false;
        }
        c24 c24Var = (c24) obj;
        return c24Var.a == this.a && Objects.equals(c24Var.b, this.b) && c24Var.c == this.c && c24Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(c24.class, Integer.valueOf(this.a), this.b, this.c, this.d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i = this.a;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i).length() + 13);
        ex0.q(sb, "RSA SSA PKCS1 Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        sb.append(", publicExponent: ");
        sb.append(strValueOf3);
        sb.append(", and ");
        sb.append(i);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
