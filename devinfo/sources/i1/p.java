package i1;

import i2.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p extends v0 {
    @Override // i2.v0
    public final m d() {
        q qVar = new q();
        qVar.f25566o = 1.0f;
        return qVar;
    }

    @Override // i2.v0
    public final void e(m mVar) {
        ((q) mVar).f25566o = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f);
    }

    public final String toString() {
        return "ZIndexElement(zIndex=1.0)";
    }
}
