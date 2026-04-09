package g0;

import i2.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class z extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f24196a;

    public z(a0 a0Var) {
        this.f24196a = a0Var;
    }

    @Override // i2.v0
    public final i1.m d() {
        c0 c0Var = new c0();
        c0Var.f24107o = this.f24196a;
        return c0Var;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        ((c0) mVar).f24107o = this.f24196a;
    }

    public final boolean equals(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar == null) {
            return false;
        }
        return nk.k.a(this.f24196a, zVar.f24196a);
    }

    public final int hashCode() {
        return this.f24196a.hashCode();
    }
}
