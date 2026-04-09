package n0;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final r f17326a;

    public u(r rVar) {
        this.f17326a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return br.l.a(this.f17326a, ((u) obj).f17326a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17326a.hashCode() * 31;
    }
}
