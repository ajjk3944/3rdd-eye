package ht;

/* loaded from: classes.dex */
public abstract class p0 {
    public abstract d1 a();

    public abstract x b();

    public abstract boolean c();

    public abstract p0 d(jt.f fVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return c() == p0Var.c() && a() == p0Var.a() && b().equals(p0Var.b());
    }

    public final int hashCode() {
        int iHashCode = a().hashCode();
        if (a1.l(b())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (c() ? 17 : b().hashCode());
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == d1.INVARIANT) {
            return b().toString();
        }
        return a() + " " + b();
    }
}
