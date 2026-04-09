package N;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class T implements b1 {

    /* renamed from: a, reason: collision with root package name */
    private final float f14002a;

    public /* synthetic */ T(float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10);
    }

    @Override // N.b1
    public float a(Y0.d dVar, float f10, float f11) {
        return f10 + (dVar.d1(this.f14002a) * Math.signum(f11 - f10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof T) && Y0.h.n(this.f14002a, ((T) obj).f14002a);
    }

    public int hashCode() {
        return Y0.h.p(this.f14002a);
    }

    public String toString() {
        return "FixedThreshold(offset=" + ((Object) Y0.h.r(this.f14002a)) + ')';
    }

    private T(float f10) {
        this.f14002a = f10;
    }
}
