package l8;

import java.util.Map;
import mq.x;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final r f14970b = new r(x.f16946a);

    /* renamed from: a, reason: collision with root package name */
    public final Map f14971a;

    public r(Map map) {
        this.f14971a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return br.l.a(this.f14971a, ((r) obj).f14971a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14971a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f14971a + ')';
    }
}
