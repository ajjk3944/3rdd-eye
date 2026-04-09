package p1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 extends z {

    /* renamed from: f, reason: collision with root package name */
    public final o1.c f30955f;

    public e0(o1.c cVar) {
        this.f30955f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            return nk.k.a(this.f30955f, ((e0) obj).f30955f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30955f.hashCode();
    }

    @Override // p1.z
    public final o1.c k() {
        return this.f30955f;
    }
}
