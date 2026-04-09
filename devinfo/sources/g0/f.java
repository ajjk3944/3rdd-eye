package g0;

import i2.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class f extends v0 {
    @Override // i2.v0
    public final i1.m d() {
        i1.e eVar = i1.b.f25534d;
        g gVar = new g();
        gVar.f24114o = eVar;
        return gVar;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        ((g) mVar).f24114o = i1.b.f25534d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f ? (f) obj : null) == null) {
            return false;
        }
        i1.e eVar = i1.b.f25534d;
        return eVar.equals(eVar);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(0.0f) + (Float.floatToIntBits(-1.0f) * 31)) * 31) + 1237;
    }
}
