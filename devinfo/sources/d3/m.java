package d3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m implements e3.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f21969a;

    public m(float f10) {
        this.f21969a = f10;
    }

    @Override // e3.a
    public final float a(float f10) {
        return f10 / this.f21969a;
    }

    @Override // e3.a
    public final float b(float f10) {
        return f10 * this.f21969a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Float.compare(this.f21969a, ((m) obj).f21969a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f21969a);
    }

    public final String toString() {
        return r5.c.k(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f21969a, ')');
    }
}
