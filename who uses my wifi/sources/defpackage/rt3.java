package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rt3 extends tr3 {
    public final cs3 a;

    public rt3(cs3 cs3Var) {
        this.a = cs3Var;
    }

    @Override // defpackage.mr3
    public final boolean a() {
        return this.a != cs3.m;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rt3) && ((rt3) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(rt3.class, this.a);
    }

    public final String toString() {
        String str = this.a.g;
        return ex0.l(new StringBuilder(str.length() + 40), "XChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
