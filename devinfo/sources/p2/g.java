package p2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f31048b = new g(new sk.a());

    /* renamed from: a, reason: collision with root package name */
    public final sk.a f31049a;

    public g(sk.a aVar) {
        this.f31049a = aVar;
        if (Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f31049a.equals(((g) obj).f31049a);
    }

    public final int hashCode() {
        return (this.f31049a.hashCode() + (Float.floatToIntBits(0.0f) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.f31049a + ", steps=0)";
    }
}
