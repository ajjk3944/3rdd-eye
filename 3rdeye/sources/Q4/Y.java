package Q4;

import N7.C1094a9;
import Q4.f0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
/* loaded from: classes2.dex */
public final class Y extends f0.e.d.f {

    /* renamed from: a, reason: collision with root package name */
    public final List<f0.e.d.AbstractC0145e> f11137a;

    public Y() {
        throw null;
    }

    public Y(List list) {
        this.f11137a = list;
    }

    @Override // Q4.f0.e.d.f
    public final List<f0.e.d.AbstractC0145e> a() {
        return this.f11137a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.f) {
            return this.f11137a.equals(((f0.e.d.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f11137a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return C1094a9.h(new StringBuilder("RolloutsState{rolloutAssignments="), this.f11137a, "}");
    }
}
