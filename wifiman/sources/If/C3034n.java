package If;

/* renamed from: If.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3034n {

    /* renamed from: a, reason: collision with root package name */
    private final float f9183a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9184b;

    public C3034n(float f10, boolean z10) {
        this.f9183a = f10;
        this.f9184b = z10;
    }

    public final boolean a() {
        return this.f9184b;
    }

    public final float b() {
        return this.f9183a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3034n)) {
            return false;
        }
        C3034n c3034n = (C3034n) obj;
        return Float.compare(this.f9183a, c3034n.f9183a) == 0 && this.f9184b == c3034n.f9184b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f9183a) * 31) + Boolean.hashCode(this.f9184b);
    }

    public String toString() {
        return "BatteryState(level=" + this.f9183a + ", charging=" + this.f9184b + ")";
    }
}
