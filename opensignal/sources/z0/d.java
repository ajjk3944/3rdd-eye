package z0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f26487a;

    public d(float f10) {
        this.f26487a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Float.compare(this.f26487a, ((d) obj).f26487a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26487a);
    }

    public final String toString() {
        return h0.b.q(new StringBuilder("Vertical(bias="), this.f26487a, ')');
    }
}
