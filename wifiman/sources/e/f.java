package E;

/* loaded from: classes.dex */
final class f implements b {

    /* renamed from: a, reason: collision with root package name */
    private final float f3601a;

    public f(float f10) {
        this.f3601a = f10;
    }

    @Override // E.b
    public float a(long j10, Y0.d dVar) {
        return this.f3601a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f3601a, ((f) obj).f3601a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f3601a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f3601a + ".px)";
    }
}
