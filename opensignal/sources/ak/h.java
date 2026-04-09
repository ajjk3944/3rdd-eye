package ak;

/* loaded from: classes.dex */
public final class h extends p {

    /* renamed from: h, reason: collision with root package name */
    public final Exception f542h;

    public h(Exception exc) {
        this.f542h = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && br.l.a(this.f542h, ((h) obj).f542h);
    }

    public final int hashCode() {
        return this.f542h.hashCode();
    }

    public final String toString() {
        return "Failure(exception=" + this.f542h + ')';
    }
}
