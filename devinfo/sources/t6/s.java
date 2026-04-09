package t6;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s extends t {

    /* renamed from: a, reason: collision with root package name */
    public final h f34393a = h.f34355b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        return this.f34393a.equals(((s) obj).f34393a);
    }

    public final int hashCode() {
        return this.f34393a.hashCode() + (s.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f34393a + '}';
    }
}
