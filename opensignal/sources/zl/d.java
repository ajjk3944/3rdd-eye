package zl;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27462a;

    public d(boolean z10) {
        this.f27462a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f27462a == ((d) obj).f27462a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27462a);
    }

    public final String toString() {
        return c7.a.r(new StringBuilder("PhonePermissionState(shouldAnimate="), this.f27462a, ')');
    }
}
