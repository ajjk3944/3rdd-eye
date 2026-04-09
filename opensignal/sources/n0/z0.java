package n0;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17368a;

    public z0(String str) {
        this.f17368a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0) && br.l.a(this.f17368a, ((z0) obj).f17368a);
    }

    public final int hashCode() {
        return this.f17368a.hashCode();
    }

    public final String toString() {
        return h0.b.r(new StringBuilder("OpaqueKey(key="), this.f17368a, ')');
    }
}
