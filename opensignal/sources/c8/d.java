package c8;

/* loaded from: classes.dex */
public final class d implements k {

    /* renamed from: a, reason: collision with root package name */
    public final o f3325a;

    /* renamed from: b, reason: collision with root package name */
    public final eu.j f3326b;

    public d(int i10, o oVar) {
        this.f3325a = oVar;
        int i11 = eu.k.f8361a;
        this.f3326b = new eu.j(i10, 0);
    }

    @Override // c8.k
    public final l a(f8.m mVar, l8.n nVar) {
        return new f(mVar.f8701a, nVar, this.f3326b, this.f3325a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof d;
    }

    public final int hashCode() {
        return d.class.hashCode();
    }
}
