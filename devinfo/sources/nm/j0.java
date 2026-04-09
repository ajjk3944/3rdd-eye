package nm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: e, reason: collision with root package name */
    public static final j0 f30068e = new j0(h0.f30052b, 0.0f, l.f30086d, new i0(1, null));

    /* renamed from: a, reason: collision with root package name */
    public final h0 f30069a;

    /* renamed from: b, reason: collision with root package name */
    public final float f30070b;

    /* renamed from: c, reason: collision with root package name */
    public final nk.l f30071c;

    /* renamed from: d, reason: collision with root package name */
    public final ek.j f30072d;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(h0 h0Var, float f10, mk.a aVar, mk.c cVar) {
        this.f30069a = h0Var;
        this.f30070b = f10;
        this.f30071c = (nk.l) aVar;
        this.f30072d = (ek.j) cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f30069a == j0Var.f30069a && Float.compare(this.f30070b, j0Var.f30070b) == 0 && this.f30071c.equals(j0Var.f30071c) && this.f30072d.equals(j0Var.f30072d);
    }

    public final int hashCode() {
        return this.f30072d.hashCode() + ((this.f30071c.hashCode() + r5.c.d(this.f30070b, this.f30069a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "ScrollInfo(direction=" + this.f30069a + ", speedMultiplier=" + this.f30070b + ", maxScrollDistanceProvider=" + this.f30071c + ", onScroll=" + this.f30072d + ')';
    }
}
