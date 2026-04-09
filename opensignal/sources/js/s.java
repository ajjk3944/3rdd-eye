package js;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f13826a;

    public s(String str) {
        this.f13826a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && br.l.a(this.f13826a, ((s) obj).f13826a);
    }

    public final int hashCode() {
        return this.f13826a.hashCode();
    }

    public final String toString() {
        return h0.b.r(new StringBuilder("MemberSignature(signature="), this.f13826a, ')');
    }
}
