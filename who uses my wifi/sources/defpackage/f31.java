package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class f31 implements Serializable {
    public final Object f;
    public final Object g;
    public final Object h;

    public f31(Object obj, Object obj2, Object obj3) {
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f31)) {
            return false;
        }
        f31 f31Var = (f31) obj;
        return i30.c(this.f, f31Var.f) && i30.c(this.g, f31Var.g) && i30.c(this.h, f31Var.h);
    }

    public final int hashCode() {
        Object obj = this.f;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.g;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.h;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f + ", " + this.g + ", " + this.h + ')';
    }
}
