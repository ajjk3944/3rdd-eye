package b1;

import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1631a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f1631a == ((a) obj).f1631a;
    }

    public final int hashCode() {
        return this.f1631a;
    }

    public final String toString() {
        return h.u(new StringBuilder("DeltaCounter(count="), this.f1631a, ')');
    }
}
