package lf;

/* loaded from: classes.dex */
public final class j1 extends l2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15307a;

    public j1(String str) {
        this.f15307a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        return this.f15307a.equals(((j1) ((l2) obj)).f15307a);
    }

    public final int hashCode() {
        return this.f15307a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return w.g.j(new StringBuilder("User{identifier="), this.f15307a, "}");
    }
}
