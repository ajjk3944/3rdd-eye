package lf;

import java.util.List;

/* loaded from: classes.dex */
public final class g1 extends i2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f15253a;

    public g1(List list) {
        this.f15253a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        return this.f15253a.equals(((g1) ((i2) obj)).f15253a);
    }

    public final int hashCode() {
        return this.f15253a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f15253a + "}";
    }
}
