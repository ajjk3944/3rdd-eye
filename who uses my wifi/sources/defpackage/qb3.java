package defpackage;

import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qb3 {
    public final String a;
    public final s2 b;
    public final String c;

    public /* synthetic */ qb3(pb3 pb3Var) {
        this.a = (String) pb3Var.g;
        this.b = (s2) pb3Var.i;
        this.c = (String) pb3Var.h;
    }

    public final String a() {
        s2 s2Var = this.b;
        return s2Var == null ? "unknown" : s2Var.name().toLowerCase(Locale.ENGLISH);
    }

    public final boolean equals(Object obj) {
        s2 s2Var;
        s2 s2Var2;
        if (obj instanceof qb3) {
            qb3 qb3Var = (qb3) obj;
            if (this.a.equals(qb3Var.a) && (s2Var = this.b) != null && (s2Var2 = qb3Var.b) != null && s2Var.equals(s2Var2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
