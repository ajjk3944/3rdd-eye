package F7;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: RawJsonRepositoryResult.kt */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1706a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1707b;

    public r(LinkedHashSet linkedHashSet, ArrayList arrayList) {
        this.f1706a = linkedHashSet;
        this.f1707b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f1706a.equals(rVar.f1706a) && this.f1707b.equals(rVar.f1707b);
    }

    public final int hashCode() {
        return this.f1707b.hashCode() + (this.f1706a.hashCode() * 31);
    }

    public final String toString() {
        return "RawJsonRepositoryRemoveResult(ids=" + this.f1706a + ", errors=" + this.f1707b + ')';
    }
}
