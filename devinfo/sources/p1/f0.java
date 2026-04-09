package p1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 extends z {

    /* renamed from: f, reason: collision with root package name */
    public final o1.d f30962f;
    public final j g;

    public f0(o1.d dVar) {
        j jVarA;
        this.f30962f = dVar;
        if (com.bumptech.glide.f.m(dVar)) {
            jVarA = null;
        } else {
            jVarA = l.a();
            je.u.c(jVarA, dVar);
        }
        this.g = jVarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            return nk.k.a(this.f30962f, ((f0) obj).f30962f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30962f.hashCode();
    }

    @Override // p1.z
    public final o1.c k() {
        o1.d dVar = this.f30962f;
        return new o1.c(dVar.f30370a, dVar.f30371b, dVar.f30372c, dVar.f30373d);
    }
}
