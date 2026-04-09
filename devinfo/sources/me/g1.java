package me;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g1 extends i2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f29140a;

    public g1(List list) {
        this.f29140a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        return this.f29140a.equals(((g1) ((i2) obj)).f29140a);
    }

    public final int hashCode() {
        return this.f29140a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f29140a + "}";
    }
}
