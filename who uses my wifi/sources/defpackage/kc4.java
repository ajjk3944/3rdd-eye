package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kc4 {
    public static final kc4 b = new kc4(new yf3());
    public final dn3 a;

    public kc4(yf3 yf3Var) {
        this.a = (dn3) yf3Var.f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kc4) && this.a.equals(((kc4) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
