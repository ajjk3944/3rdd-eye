package i1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g implements n {

    /* renamed from: a, reason: collision with root package name */
    public final n f25547a;

    /* renamed from: b, reason: collision with root package name */
    public final n f25548b;

    public g(n nVar, n nVar2) {
        this.f25547a = nVar;
        this.f25548b = nVar2;
    }

    @Override // i1.n
    public final boolean a(mk.c cVar) {
        return this.f25547a.a(cVar) && this.f25548b.a(cVar);
    }

    @Override // i1.n
    public final /* synthetic */ n b(n nVar) {
        return d.h.j(this, nVar);
    }

    @Override // i1.n
    public final Object c(Object obj, mk.e eVar) {
        return this.f25548b.c(this.f25547a.c(obj, eVar), eVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return nk.k.a(this.f25547a, gVar.f25547a) && nk.k.a(this.f25548b, gVar.f25548b);
    }

    public final int hashCode() {
        return (this.f25548b.hashCode() * 31) + this.f25547a.hashCode();
    }

    public final String toString() {
        return r5.c.l(new StringBuilder("["), (String) c("", f.f25546a), ']');
    }
}
