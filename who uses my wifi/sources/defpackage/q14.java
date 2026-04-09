package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q14 extends cx3 {
    public final p14 a;

    public q14(p14 p14Var) {
        this.a = p14Var;
    }

    @Override // defpackage.mr3
    public final boolean a() {
        return this.a != p14.e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q14) && ((q14) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(q14.class, this.a);
    }

    public final String toString() {
        String str = this.a.a;
        return ex0.l(new StringBuilder(str.length() + 30), "Ed25519 Parameters (variant: ", str, ")");
    }
}
