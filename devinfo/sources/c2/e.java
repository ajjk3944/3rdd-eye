package c2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f2601a;

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f2601a == ((e) obj).f2601a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f2601a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.f2601a + ')';
    }
}
