package c3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f2702a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f2702a, ((a) obj).f2702a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f2702a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f2702a + ')';
    }
}
