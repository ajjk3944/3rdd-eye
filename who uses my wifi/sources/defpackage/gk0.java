package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gk0 implements Serializable {
    public final Object f;
    public final Object g;

    public gk0(Object obj, Object obj2) {
        this.f = obj;
        this.g = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk0)) {
            return false;
        }
        gk0 gk0Var = (gk0) obj;
        return i30.c(this.f, gk0Var.f) && i30.c(this.g, gk0Var.g);
    }

    public final int hashCode() {
        Object obj = this.f;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.g;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f + ", " + this.g + ')';
    }
}
