package tm;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final a f22906a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22907b;

    public i(a aVar, ArrayList arrayList) {
        this.f22906a = aVar;
        this.f22907b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f22906a.equals(iVar.f22906a) && this.f22907b.equals(iVar.f22907b);
    }

    public final int hashCode() {
        return Integer.hashCode(500) + ((this.f22907b.hashCode() + (this.f22906a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TowersQueryParams(boundingBox=" + this.f22906a + ", networkTypes=" + this.f22907b + ", limit=500)";
    }
}
