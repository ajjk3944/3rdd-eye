package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hj {
    public final HashSet a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hj.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((hj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
