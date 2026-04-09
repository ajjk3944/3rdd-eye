package r2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f21192a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f21192a, ((a) obj).f21192a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21192a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f21192a + ')';
    }
}
