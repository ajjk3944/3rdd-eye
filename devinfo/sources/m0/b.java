package m0;

import d3.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f28849a;

    public b(float f10) {
        this.f28849a = f10;
    }

    @Override // m0.a
    public final float a(long j, d3.c cVar) {
        return cVar.I(this.f28849a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.b(this.f28849a, ((b) obj).f28849a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f28849a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f28849a + ".dp)";
    }
}
