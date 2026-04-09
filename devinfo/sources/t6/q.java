package t6;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q extends t {

    /* renamed from: a, reason: collision with root package name */
    public final h f34392a = h.f34355b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        return this.f34392a.equals(((q) obj).f34392a);
    }

    public final int hashCode() {
        return this.f34392a.hashCode() + (q.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f34392a + '}';
    }
}
