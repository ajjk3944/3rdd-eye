package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hs3 extends tr3 {
    public final int a;
    public final int b;
    public final gs3 c;

    public hs3(int i, int i2, gs3 gs3Var) {
        this.a = i;
        this.b = i2;
        this.c = gs3Var;
    }

    @Override // defpackage.mr3
    public final boolean a() {
        return this.c != gs3.j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hs3)) {
            return false;
        }
        hs3 hs3Var = (hs3) obj;
        return hs3Var.a == this.a && hs3Var.b == this.b && hs3Var.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(hs3.class, Integer.valueOf(this.a), Integer.valueOf(this.b), 16, this.c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        int length = strValueOf.length();
        int i = this.b;
        int length2 = String.valueOf(i).length();
        int length3 = String.valueOf(16).length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i2).length() + 10);
        sb.append("AesEax Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        return ga1.k(sb, "-byte IV, 16-byte tag, and ", i2, "-byte key)");
    }
}
