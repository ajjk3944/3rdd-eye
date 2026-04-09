package P;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final float f17897a;

    /* renamed from: b, reason: collision with root package name */
    private final float f17898b;

    /* renamed from: c, reason: collision with root package name */
    private final float f17899c;

    /* renamed from: d, reason: collision with root package name */
    private final float f17900d;

    public g(float f10, float f11, float f12, float f13) {
        this.f17897a = f10;
        this.f17898b = f11;
        this.f17899c = f12;
        this.f17900d = f13;
    }

    public final float a() {
        return this.f17897a;
    }

    public final float b() {
        return this.f17898b;
    }

    public final float c() {
        return this.f17899c;
    }

    public final float d() {
        return this.f17900d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f17897a == gVar.f17897a && this.f17898b == gVar.f17898b && this.f17899c == gVar.f17899c && this.f17900d == gVar.f17900d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f17897a) * 31) + Float.hashCode(this.f17898b)) * 31) + Float.hashCode(this.f17899c)) * 31) + Float.hashCode(this.f17900d);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f17897a + ", focusedAlpha=" + this.f17898b + ", hoveredAlpha=" + this.f17899c + ", pressedAlpha=" + this.f17900d + ')';
    }
}
