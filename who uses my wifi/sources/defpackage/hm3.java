package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hm3 extends rn3 implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        hm3 hm3Var = ui2.a;
        Integer numValueOf = Integer.valueOf(((fi2) obj).p);
        hm3 hm3Var2 = ui2.a;
        return numValueOf.compareTo(Integer.valueOf(((fi2) obj2).p));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hm3)) {
            return false;
        }
        Object obj2 = gj1.g;
        if (!obj2.equals(obj2)) {
            return false;
        }
        Object obj3 = qn3.g;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return Objects.hash(gj1.g, qn3.g);
    }

    public final String toString() {
        String string = gj1.g.toString();
        return ex0.l(new StringBuilder(string.length() + 31), "Ordering.natural().onResultOf(", string, ")");
    }
}
