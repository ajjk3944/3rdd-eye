package m1;

/* loaded from: classes.dex */
public final class x extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f16259c;

    public x(float f10) {
        super(3);
        this.f16259c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Float.compare(this.f16259c, ((x) obj).f16259c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16259c);
    }

    public final String toString() {
        return h0.b.q(new StringBuilder("RelativeVerticalTo(dy="), this.f16259c, ')');
    }
}
