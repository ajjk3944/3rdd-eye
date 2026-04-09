package p2;

import i2.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends v0 implements i1.l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31038a;

    /* renamed from: b, reason: collision with root package name */
    public final mk.c f31039b;

    public b(mk.c cVar, boolean z3) {
        this.f31038a = z3;
        this.f31039b = cVar;
    }

    @Override // i2.v0
    public final i1.m d() {
        d dVar = new d();
        dVar.f31042o = this.f31038a;
        dVar.f31043p = this.f31039b;
        return dVar;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        d dVar = (d) mVar;
        dVar.f31042o = this.f31038a;
        dVar.f31043p = this.f31039b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f31038a == bVar.f31038a && this.f31039b == bVar.f31039b;
    }

    public final int hashCode() {
        return this.f31039b.hashCode() + ((this.f31038a ? 1231 : 1237) * 31);
    }
}
