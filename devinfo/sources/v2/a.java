package v2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f35766a;

    public a(int i4) {
        this.f35766a = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f35766a == ((a) obj).f35766a;
    }

    public final int hashCode() {
        return this.f35766a;
    }

    public final String toString() {
        return d.h.u(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f35766a, ')');
    }
}
