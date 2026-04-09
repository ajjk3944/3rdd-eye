package m8;

/* loaded from: classes.dex */
public final class a extends a.a {

    /* renamed from: f, reason: collision with root package name */
    public final int f16320f;

    public a(int i10) {
        this.f16320f = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f16320f == ((a) obj).f16320f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16320f;
    }

    public final String toString() {
        return String.valueOf(this.f16320f);
    }
}
