package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v implements h1.c {

    /* renamed from: a, reason: collision with root package name */
    public final s f34989a;

    public v(s sVar) {
        this.f34989a = sVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return nk.k.a(this.f34989a, ((v) obj).f34989a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34989a.hashCode() * 31;
    }
}
