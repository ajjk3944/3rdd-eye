package zl;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27461a;

    public c(boolean z10) {
        this.f27461a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f27461a == ((c) obj).f27461a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27461a);
    }

    public final String toString() {
        return c7.a.r(new StringBuilder("LocationPermissionState(shouldAnimate="), this.f27461a, ')');
    }
}
