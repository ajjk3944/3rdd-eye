package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lw3 {
    public final Class a;
    public final v34 b;

    public /* synthetic */ lw3(Class cls, v34 v34Var) {
        this.a = cls;
        this.b = v34Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lw3)) {
            return false;
        }
        lw3 lw3Var = (lw3) obj;
        return lw3Var.a.equals(this.a) && lw3Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        String simpleName = this.a.getSimpleName();
        String strValueOf = String.valueOf(this.b);
        return ex0.l(new StringBuilder(simpleName.length() + 21 + strValueOf.length()), simpleName, ", object identifier: ", strValueOf);
    }
}
