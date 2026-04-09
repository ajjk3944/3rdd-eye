package g0;

import i2.v0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final q f24178a;

    public r(q qVar) {
        this.f24178a = qVar;
    }

    @Override // i2.v0
    public final i1.m d() {
        t tVar = new t();
        tVar.f24181o = this.f24178a;
        tVar.f24182p = 1.0f;
        return tVar;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        t tVar = (t) mVar;
        tVar.f24181o = this.f24178a;
        tVar.f24182p = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f24178a == ((r) obj).f24178a;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f) + (this.f24178a.hashCode() * 31);
    }
}
