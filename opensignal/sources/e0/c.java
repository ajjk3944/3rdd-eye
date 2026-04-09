package e0;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f7633a;

    public c(float f10) {
        this.f7633a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            b0.a.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // e0.a
    public final float a(long j, t2.c cVar) {
        return (this.f7633a / 100.0f) * f1.e.b(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f7633a, ((c) obj).f7633a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7633a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f7633a + "%)";
    }
}
