package ak;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f435a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f436b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437c;

    public b0(boolean z10, boolean z11, boolean z12) {
        this.f435a = z10;
        this.f436b = z11;
        this.f437c = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f435a == b0Var.f435a && this.f436b == b0Var.f436b && this.f437c == b0Var.f437c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f437c) + w.g.b(Boolean.hashCode(this.f435a) * 31, this.f436b, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationSettings(locationEnabled=");
        sb2.append(this.f435a);
        sb2.append(", gpsUsable=");
        sb2.append(this.f436b);
        sb2.append(", networkPresent=");
        return c7.a.r(sb2, this.f437c, ')');
    }
}
