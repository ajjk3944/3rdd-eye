package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hv3 {
    public static final hv3 b = new hv3(Collections.unmodifiableMap(new HashMap()));
    public final Map a;

    public /* synthetic */ hv3(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hv3) {
            return this.a.equals(((hv3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
