package m1;

import i1.m;
import i2.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class e extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final g3.f f28862a;

    public e(g3.f fVar) {
        this.f28862a = fVar;
    }

    @Override // i2.v0
    public final m d() {
        d dVar = new d();
        dVar.f28861o = this.f28862a;
        return dVar;
    }

    @Override // i2.v0
    public final void e(m mVar) {
        ((d) mVar).f28861o = this.f28862a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f28862a == ((e) obj).f28862a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28862a.hashCode();
    }
}
