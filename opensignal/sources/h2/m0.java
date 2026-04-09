package h2;

/* loaded from: classes.dex */
public final class m0 implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f9855a;

    public m0(String str) {
        this.f9855a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0) {
            return br.l.a(this.f9855a, ((m0) obj).f9855a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9855a.hashCode();
    }

    public final String toString() {
        return h0.b.r(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f9855a, ')');
    }
}
