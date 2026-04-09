package t2;

/* loaded from: classes.dex */
public final class j implements u2.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f22392a;

    public j(float f10) {
        this.f22392a = f10;
    }

    @Override // u2.a
    public final float a(float f10) {
        return f10 / this.f22392a;
    }

    @Override // u2.a
    public final float b(float f10) {
        return f10 * this.f22392a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Float.compare(this.f22392a, ((j) obj).f22392a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22392a);
    }

    public final String toString() {
        return h0.b.q(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f22392a, ')');
    }
}
