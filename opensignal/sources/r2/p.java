package r2;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f21213c = new p(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f21214a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21215b;

    public p(float f10, float f11) {
        this.f21214a = f10;
        this.f21215b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f21214a == pVar.f21214a && this.f21215b == pVar.f21215b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21215b) + (Float.hashCode(this.f21214a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f21214a);
        sb2.append(", skewX=");
        return h0.b.q(sb2, this.f21215b, ')');
    }
}
