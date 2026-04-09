package sg;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f22045a;

    public d(HashSet hashSet) {
        this.f22045a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return this.f22045a.equals(((d) obj).f22045a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22045a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f22045a + "}";
    }
}
