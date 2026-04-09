package nk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f29981a;

    public n(Class cls) {
        this.f29981a = cls;
    }

    @Override // nk.d
    public final Class a() {
        return this.f29981a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return k.a(this.f29981a, ((n) obj).f29981a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29981a.hashCode();
    }

    public final String toString() {
        return this.f29981a.toString() + " (Kotlin reflection is not available)";
    }
}
