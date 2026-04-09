package E;

import l0.C6537m;

/* loaded from: classes.dex */
final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    private final float f3600a;

    public e(float f10) {
        this.f3600a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // E.b
    public float a(long j10, Y0.d dVar) {
        return C6537m.h(j10) * (this.f3600a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f3600a, ((e) obj).f3600a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f3600a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f3600a + "%)";
    }
}
