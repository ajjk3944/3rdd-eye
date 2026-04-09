package j9;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f13429a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f13429a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f13429a.equals(((c) obj).f13429a);
    }

    public final int hashCode() {
        return this.f13429a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return w.g.j(new StringBuilder("Encoding{name=\""), this.f13429a, "\"}");
    }
}
