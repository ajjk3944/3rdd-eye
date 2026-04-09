package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rw3 extends cx3 {
    public final int a;
    public final int b;
    public final gs3 c;

    public rw3(int i, int i2, gs3 gs3Var) {
        this.a = i;
        this.b = i2;
        this.c = gs3Var;
    }

    @Override // defpackage.mr3
    public final boolean a() {
        return this.c != gs3.n;
    }

    public final int b() {
        gs3 gs3Var = gs3.n;
        int i = this.b;
        gs3 gs3Var2 = this.c;
        if (gs3Var2 == gs3Var) {
            return i;
        }
        if (gs3Var2 == gs3.k || gs3Var2 == gs3.l || gs3Var2 == gs3.m) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rw3)) {
            return false;
        }
        rw3 rw3Var = (rw3) obj;
        return rw3Var.a == this.a && rw3Var.b() == b() && rw3Var.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(rw3.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        int length = strValueOf.length();
        int i = this.b;
        int length2 = String.valueOf(i).length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i2).length() + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        return ga1.k(sb, "-byte tags, and ", i2, "-byte key)");
    }
}
