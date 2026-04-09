package mv;

import br.l;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Map f17069a = new ConcurrentHashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && l.a(this.f17069a, ((e) obj).f17069a);
    }

    public final int hashCode() {
        return this.f17069a.hashCode();
    }

    public final String toString() {
        return "Properties(data=" + this.f17069a + ')';
    }
}
