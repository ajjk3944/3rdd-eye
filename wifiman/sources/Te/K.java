package Te;

/* loaded from: classes4.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final float f21671a;

    /* renamed from: b, reason: collision with root package name */
    private final float f21672b;

    public K(float f10, float f11) {
        this.f21671a = f10;
        this.f21672b = f11;
    }

    public final float a() {
        return this.f21672b;
    }

    public final float b() {
        return this.f21671a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k10 = (K) obj;
        return Float.compare(this.f21671a, k10.f21671a) == 0 && Float.compare(this.f21672b, k10.f21672b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f21671a) * 31) + Float.hashCode(this.f21672b);
    }

    public String toString() {
        return "Outage(start=" + this.f21671a + ", end=" + this.f21672b + ")";
    }
}
