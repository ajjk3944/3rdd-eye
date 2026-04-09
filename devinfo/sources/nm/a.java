package nm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f29994a;

    /* renamed from: b, reason: collision with root package name */
    public final float f29995b;

    /* renamed from: c, reason: collision with root package name */
    public final float f29996c;

    /* renamed from: d, reason: collision with root package name */
    public final float f29997d;

    public a(float f10, float f11, float f12, float f13) {
        this.f29994a = f10;
        this.f29995b = f11;
        this.f29996c = f12;
        this.f29997d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f29994a, aVar.f29994a) == 0 && Float.compare(this.f29995b, aVar.f29995b) == 0 && Float.compare(this.f29996c, aVar.f29996c) == 0 && Float.compare(this.f29997d, aVar.f29997d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f29997d) + r5.c.d(this.f29996c, r5.c.d(this.f29995b, Float.floatToIntBits(this.f29994a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AbsolutePixelPadding(start=");
        sb2.append(this.f29994a);
        sb2.append(", end=");
        sb2.append(this.f29995b);
        sb2.append(", top=");
        sb2.append(this.f29996c);
        sb2.append(", bottom=");
        return r5.c.k(sb2, this.f29997d, ')');
    }
}
