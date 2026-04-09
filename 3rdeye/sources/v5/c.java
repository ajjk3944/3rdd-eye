package v5;

import java.util.HashSet;
import java.util.Set;

/* compiled from: AutoValue_RolloutsState.java */
/* loaded from: classes2.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f47057a;

    public c(HashSet hashSet) {
        this.f47057a = hashSet;
    }

    @Override // v5.e
    public final Set<d> a() {
        return this.f47057a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f47057a.equals(((e) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f47057a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f47057a + "}";
    }
}
