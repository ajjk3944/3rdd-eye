package k2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final x f13981a;

    public d(x xVar) {
        this.f13981a = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && br.l.a(this.f13981a, ((d) obj).f13981a);
    }

    public final int hashCode() {
        return this.f13981a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f13981a + ", loaderKey=null)";
    }
}
