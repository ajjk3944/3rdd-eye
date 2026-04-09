package E;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private final float f3599a;

    public /* synthetic */ d(float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10);
    }

    @Override // E.b
    public float a(long j10, Y0.d dVar) {
        return dVar.d1(this.f3599a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Y0.h.n(this.f3599a, ((d) obj).f3599a);
    }

    public int hashCode() {
        return Y0.h.p(this.f3599a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f3599a + ".dp)";
    }

    private d(float f10) {
        this.f3599a = f10;
    }
}
