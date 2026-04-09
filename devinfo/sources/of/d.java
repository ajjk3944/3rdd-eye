package of;

import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f30544a;

    public d(HashSet hashSet) {
        this.f30544a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return this.f30544a.equals(((d) obj).f30544a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30544a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f30544a + "}";
    }
}
