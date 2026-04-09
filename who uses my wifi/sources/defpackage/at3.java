package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class at3 extends tr3 {
    public final String a;
    public final zs3 b;

    public at3(String str, zs3 zs3Var) {
        this.a = str;
        this.b = zs3Var;
    }

    @Override // defpackage.mr3
    public final boolean a() {
        return this.b != zs3.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof at3)) {
            return false;
        }
        at3 at3Var = (at3) obj;
        return at3Var.a.equals(this.a) && at3Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(at3.class, this.a, this.b);
    }

    public final String toString() {
        String str = this.b.b;
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 45 + str.length() + 1);
        ex0.q(sb, "LegacyKmsAead Parameters (keyUri: ", str2, ", variant: ", str);
        sb.append(")");
        return sb.toString();
    }
}
