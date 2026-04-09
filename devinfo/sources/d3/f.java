package d3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final float f21957a;

    public static int a(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return 0;
        }
        return Float.compare(f10, f11);
    }

    public static final boolean b(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static String c(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.f21957a, ((f) obj).f21957a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f21957a, ((f) obj).f21957a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f21957a);
    }

    public final String toString() {
        return c(this.f21957a);
    }
}
