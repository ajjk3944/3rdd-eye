package j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class u extends i2.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final y f26985a;

    public u(y yVar) {
        this.f26985a = yVar;
    }

    @Override // i2.v0
    public final i1.m d() {
        v vVar = new v();
        vVar.f26989o = this.f26985a;
        return vVar;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        v vVar = (v) mVar;
        y yVar = vVar.f26989o;
        y yVar2 = this.f26985a;
        if (nk.k.a(yVar, yVar2) || !vVar.f25554a.f25565n) {
            return;
        }
        y yVar3 = vVar.f26989o;
        yVar3.d();
        yVar3.f27025b = null;
        yVar3.f27026c = -1;
        yVar2.j = vVar;
        vVar.f26989o = yVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && nk.k.a(this.f26985a, ((u) obj).f26985a);
    }

    public final int hashCode() {
        return this.f26985a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.f26985a + ')';
    }
}
