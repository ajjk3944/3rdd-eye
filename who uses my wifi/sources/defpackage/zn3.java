package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zn3 extends rn3 implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return lj4.k.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zn3)) {
            return false;
        }
        mm3 mm3Var = lj4.k;
        return mm3Var.equals(mm3Var);
    }

    public final int hashCode() {
        return -lj4.k.hashCode();
    }

    public final String toString() {
        return lj4.k.toString().concat(".reverse()");
    }
}
