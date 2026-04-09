package m1;

/* loaded from: classes.dex */
public final class j extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f16216c;

    public j(float f10) {
        super(3);
        this.f16216c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Float.compare(this.f16216c, ((j) obj).f16216c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16216c);
    }

    public final String toString() {
        return h0.b.q(new StringBuilder("HorizontalTo(x="), this.f16216c, ')');
    }
}
