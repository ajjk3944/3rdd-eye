package k2;

/* loaded from: classes.dex */
public final class a implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f13968a;

    public a(int i10) {
        this.f13968a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f13968a == ((a) obj).f13968a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13968a);
    }

    public final String toString() {
        return c7.a.q(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f13968a, ')');
    }
}
