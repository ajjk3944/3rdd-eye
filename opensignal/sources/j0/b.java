package j0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f13019a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13020b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13021c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13022d;

    public b(float f10, float f11, float f12, float f13) {
        this.f13019a = f10;
        this.f13020b = f11;
        this.f13021c = f12;
        this.f13022d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13019a == bVar.f13019a && this.f13020b == bVar.f13020b && this.f13021c == bVar.f13021c && this.f13022d == bVar.f13022d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13022d) + w.g.a(w.g.a(Float.hashCode(this.f13019a) * 31, this.f13020b, 31), this.f13021c, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.f13019a);
        sb2.append(", focusedAlpha=");
        sb2.append(this.f13020b);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.f13021c);
        sb2.append(", pressedAlpha=");
        return h0.b.q(sb2, this.f13022d, ')');
    }
}
