package mp;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f16901a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16902b;

    public a(int i10, int i11) {
        this.f16901a = i10;
        this.f16902b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16901a == aVar.f16901a && this.f16902b == aVar.f16902b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16902b) + (Integer.hashCode(this.f16901a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NpsItemMetrics(itemSizePx=");
        sb2.append(this.f16901a);
        sb2.append(", innerSpacingPx=");
        return c7.a.q(sb2, this.f16902b, ')');
    }
}
