package b2;

import i1.m;
import i2.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class f extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f1645a;

    public f(e eVar) {
        this.f1645a = eVar;
    }

    @Override // i2.v0
    public final m d() {
        return new j(g3.k.f24502a, this.f1645a);
    }

    @Override // i2.v0
    public final void e(m mVar) {
        j jVar = (j) mVar;
        jVar.f1655o = g3.k.f24502a;
        e eVar = jVar.f1656p;
        if (eVar.f1641a == jVar) {
            eVar.f1641a = null;
        }
        e eVar2 = this.f1645a;
        if (!eVar2.equals(eVar)) {
            jVar.f1656p = eVar2;
        }
        if (jVar.f25565n) {
            e eVar3 = jVar.f1656p;
            eVar3.f1641a = jVar;
            eVar3.f1642b = null;
            jVar.f1657q = null;
            eVar3.f1643c = new b(1, jVar);
            eVar3.f1644d = jVar.b0();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        Object obj2 = g3.k.f24502a;
        return obj2.equals(obj2) && fVar.f1645a.equals(this.f1645a);
    }

    public final int hashCode() {
        return this.f1645a.hashCode() + (g3.k.f24502a.hashCode() * 31);
    }
}
