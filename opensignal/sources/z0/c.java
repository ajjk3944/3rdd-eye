package z0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f26486a;

    public c(float f10) {
        this.f26486a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f26486a, ((c) obj).f26486a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26486a);
    }

    public final String toString() {
        return h0.b.q(new StringBuilder("Horizontal(bias="), this.f26486a, ')');
    }
}
