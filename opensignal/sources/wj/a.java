package wj;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f24537a;

    /* renamed from: b, reason: collision with root package name */
    public final double f24538b;

    public a(double d6, double d10) {
        this.f24537a = d6;
        this.f24538b = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Double.compare(this.f24537a, aVar.f24537a) == 0 && Double.compare(this.f24538b, aVar.f24538b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f24538b) + (Double.hashCode(this.f24537a) * 31);
    }

    public final String toString() {
        return "Point(lat=" + this.f24537a + ", lng=" + this.f24538b + ')';
    }
}
