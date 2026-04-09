package tm;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final a f22900a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22901b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f22902c;

    public g(a aVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f22900a = aVar;
        this.f22901b = arrayList;
        this.f22902c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f22900a.equals(gVar.f22900a) && this.f22901b.equals(gVar.f22901b) && this.f22902c.equals(gVar.f22902c);
    }

    public final int hashCode() {
        return this.f22902c.hashCode() + ((this.f22901b.hashCode() + (this.f22900a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NetworkRankQueryParams(boundingBox=" + this.f22900a + ", networkTypes=" + this.f22901b + ", networkIds=" + this.f22902c + ')';
    }
}
