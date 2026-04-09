package Te;

/* loaded from: classes4.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private final float f21711a;

    /* renamed from: b, reason: collision with root package name */
    private final float f21712b;

    public L(float f10, float f11) {
        this.f21711a = f10;
        this.f21712b = f11;
    }

    public final float a() {
        return this.f21712b;
    }

    public final float b() {
        return this.f21711a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return Float.compare(this.f21711a, l10.f21711a) == 0 && Float.compare(this.f21712b, l10.f21712b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f21711a) * 31) + Float.hashCode(this.f21712b);
    }

    public String toString() {
        return "XAxis(min=" + this.f21711a + ", max=" + this.f21712b + ")";
    }
}
