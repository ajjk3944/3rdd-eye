package k2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13978a;

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return br.l.a(this.f13978a, ((c) obj).f13978a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f13978a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.f13978a + ')';
    }
}
