package m1;

/* loaded from: classes.dex */
public final class r extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f16244c;

    public r(float f10) {
        super(3);
        this.f16244c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Float.compare(this.f16244c, ((r) obj).f16244c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16244c);
    }

    public final String toString() {
        return h0.b.q(new StringBuilder("RelativeHorizontalTo(dx="), this.f16244c, ')');
    }
}
