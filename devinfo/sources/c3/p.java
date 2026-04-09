package c3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f2728c = new p(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f2729a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2730b;

    public p(float f10, float f11) {
        this.f2729a = f10;
        this.f2730b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f2729a == pVar.f2729a && this.f2730b == pVar.f2730b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f2730b) + (Float.floatToIntBits(this.f2729a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f2729a);
        sb2.append(", skewX=");
        return r5.c.k(sb2, this.f2730b, ')');
    }
}
