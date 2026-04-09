package ak;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final List f734a;

    public v(ArrayList arrayList) {
        br.l.e(arrayList, "endpointList");
        this.f734a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && br.l.a(this.f734a, ((v) obj).f734a);
    }

    public final int hashCode() {
        return this.f734a.hashCode();
    }

    public final String toString() {
        return h0.b.t(new StringBuilder("HttpHeadLatencyConfig(endpointList="), this.f734a, ')');
    }
}
