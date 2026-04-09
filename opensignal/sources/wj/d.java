package wj;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f24540a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f24541b;

    public d(ArrayList arrayList, List list) {
        this.f24540a = list;
        this.f24541b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f24540a.equals(dVar.f24540a) && this.f24541b.equals(dVar.f24541b);
    }

    public final int hashCode() {
        return this.f24541b.hashCode() + (this.f24540a.hashCode() * 31);
    }

    public final String toString() {
        return "RingPolygon(outer=" + this.f24540a + ", holes=" + this.f24541b + ')';
    }
}
