package pi;

/* loaded from: classes4.dex */
public abstract class C0 implements B0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        return c() == b02.c() && a() == b02.a() && getType().equals(b02.getType());
    }

    public int hashCode() {
        int iHashCode = a().hashCode();
        if (J0.w(getType())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (c() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (c()) {
            return "*";
        }
        if (a() == N0.INVARIANT) {
            return getType().toString();
        }
        return a() + " " + getType();
    }
}
