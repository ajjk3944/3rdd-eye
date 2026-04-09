package t2;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final float f22387a;

    public static final boolean a(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f22387a, ((f) obj).f22387a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f22387a, ((f) obj).f22387a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22387a);
    }

    public final String toString() {
        float f10 = this.f22387a;
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }
}
