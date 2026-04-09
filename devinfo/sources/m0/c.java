package m0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f28850a;

    public c(float f10) {
        this.f28850a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            f0.a.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // m0.a
    public final float a(long j, d3.c cVar) {
        return (this.f28850a / 100.0f) * o1.e.b(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f28850a, ((c) obj).f28850a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f28850a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f28850a + "%)";
    }
}
