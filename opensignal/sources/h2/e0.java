package h2;

/* loaded from: classes.dex */
public final class e0 implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f9809a;

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            return br.l.a(this.f9809a, ((e0) obj).f9809a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9809a.hashCode();
    }

    public final String toString() {
        return h0.b.g(')', "StringAnnotation(value=", this.f9809a);
    }
}
