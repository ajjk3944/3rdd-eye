package lf;

/* loaded from: classes.dex */
public final class c1 extends f2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15200a;

    public c1(String str) {
        this.f15200a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        return this.f15200a.equals(((c1) ((f2) obj)).f15200a);
    }

    public final int hashCode() {
        return this.f15200a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return w.g.j(new StringBuilder("Log{content="), this.f15200a, "}");
    }
}
