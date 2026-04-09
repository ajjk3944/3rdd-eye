package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nb4 {
    public final long a;
    public final float b;
    public final long c;

    public /* synthetic */ nb4(mb4 mb4Var) {
        this.a = mb4Var.a;
        this.b = mb4Var.b;
        this.c = mb4Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb4)) {
            return false;
        }
        nb4 nb4Var = (nb4) obj;
        return this.a == nb4Var.a && this.b == nb4Var.b && this.c == nb4Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
