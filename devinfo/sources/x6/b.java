package x6;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final int f36978a;

    public b(int i4) {
        this.f36978a = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f36978a == ((b) obj).f36978a;
    }

    public final int hashCode() {
        return this.f36978a;
    }

    public final String toString() {
        return d.h.u(new StringBuilder("ConstraintsNotMet(reason="), this.f36978a, ')');
    }
}
