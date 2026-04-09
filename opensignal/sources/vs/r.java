package vs;

/* loaded from: classes.dex */
public final class r extends t {

    /* renamed from: a, reason: collision with root package name */
    public final ht.x f23965a;

    public r(ht.x xVar) {
        this.f23965a = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && br.l.a(this.f23965a, ((r) obj).f23965a);
    }

    public final int hashCode() {
        return this.f23965a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.f23965a + ')';
    }
}
