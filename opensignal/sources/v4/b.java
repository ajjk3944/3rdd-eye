package v4;

import br.l;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f23843a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return l.a(this.f23843a, ((b) obj).f23843a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23843a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f23843a + ')';
    }
}
