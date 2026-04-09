package defpackage;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ot3 extends tr3 {
    public final bs3 a;
    public final int b;

    public ot3(bs3 bs3Var, int i) {
        this.a = bs3Var;
        this.b = i;
    }

    public static ot3 b(bs3 bs3Var, int i) throws GeneralSecurityException {
        if (i < 8 || i > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new ot3(bs3Var, i);
    }

    @Override // defpackage.mr3
    public final boolean a() {
        return this.a != bs3.n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ot3)) {
            return false;
        }
        ot3 ot3Var = (ot3) obj;
        return ot3Var.a == this.a && ot3Var.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(ot3.class, this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        String str = this.a.g;
        int length = str.length();
        int i = this.b;
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(i).length() + 1);
        sb.append("X-AES-GCM Parameters (variant: ");
        sb.append(str);
        sb.append("salt_size_bytes: ");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
