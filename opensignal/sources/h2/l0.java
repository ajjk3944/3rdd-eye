package h2;

/* loaded from: classes.dex */
public final class l0 implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f9846a;

    public l0(String str) {
        this.f9846a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            return br.l.a(this.f9846a, ((l0) obj).f9846a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9846a.hashCode();
    }

    public final String toString() {
        return h0.b.r(new StringBuilder("UrlAnnotation(url="), this.f9846a, ')');
    }
}
