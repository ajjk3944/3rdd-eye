package g1;

/* loaded from: classes.dex */
public final class b0 extends f0 {

    /* renamed from: e, reason: collision with root package name */
    public final f1.d f9201e;

    /* renamed from: f, reason: collision with root package name */
    public final i f9202f;

    public b0(f1.d dVar) {
        i iVarA;
        this.f9201e = dVar;
        long j = dVar.f8412e;
        if ((j >>> 32) == (4294967295L & j) && j == dVar.f8413f && j == dVar.f8414g && j == dVar.f8415h) {
            iVarA = null;
        } else {
            iVarA = l.a();
            i.a(iVarA, dVar);
        }
        this.f9202f = iVarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            return br.l.a(this.f9201e, ((b0) obj).f9201e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9201e.hashCode();
    }

    @Override // g1.f0
    public final f1.c i() {
        f1.d dVar = this.f9201e;
        return new f1.c(dVar.f8408a, dVar.f8409b, dVar.f8410c, dVar.f8411d);
    }
}
