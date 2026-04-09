package m1;

/* loaded from: classes.dex */
public final class y extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f16260c;

    public y(float f10) {
        super(3);
        this.f16260c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Float.compare(this.f16260c, ((y) obj).f16260c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16260c);
    }

    public final String toString() {
        return h0.b.q(new StringBuilder("VerticalTo(y="), this.f16260c, ')');
    }
}
