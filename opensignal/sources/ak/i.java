package ak;

/* loaded from: classes.dex */
public final class i extends p {

    /* renamed from: h, reason: collision with root package name */
    public final g f546h;

    public i(g gVar) {
        this.f546h = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && br.l.a(this.f546h, ((i) obj).f546h);
    }

    public final int hashCode() {
        return this.f546h.hashCode();
    }

    public final String toString() {
        return "Success(config=" + this.f546h + ')';
    }
}
