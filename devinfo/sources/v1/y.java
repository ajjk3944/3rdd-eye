package v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f35764c;

    public y(float f10) {
        super(3);
        this.f35764c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Float.compare(this.f35764c, ((y) obj).f35764c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f35764c);
    }

    public final String toString() {
        return r5.c.k(new StringBuilder("RelativeVerticalTo(dy="), this.f35764c, ')');
    }
}
