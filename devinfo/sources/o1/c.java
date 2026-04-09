package o1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f30365e = new c(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f30366a;

    /* renamed from: b, reason: collision with root package name */
    public final float f30367b;

    /* renamed from: c, reason: collision with root package name */
    public final float f30368c;

    /* renamed from: d, reason: collision with root package name */
    public final float f30369d;

    public c(float f10, float f11, float f12, float f13) {
        this.f30366a = f10;
        this.f30367b = f11;
        this.f30368c = f12;
        this.f30369d = f13;
    }

    public static c a(c cVar, int i4) {
        return new c((i4 & 1) != 0 ? cVar.f30366a : Float.NEGATIVE_INFINITY, (i4 & 2) != 0 ? cVar.f30367b : Float.NEGATIVE_INFINITY, (i4 & 4) != 0 ? cVar.f30368c : Float.POSITIVE_INFINITY, (i4 & 8) != 0 ? cVar.f30369d : Float.POSITIVE_INFINITY);
    }

    public final long b() {
        float f10 = this.f30368c;
        float f11 = this.f30366a;
        float f12 = ((f10 - f11) / 2.0f) + f11;
        float f13 = this.f30369d;
        float f14 = this.f30367b;
        return (Float.floatToRawIntBits(((f13 - f14) / 2.0f) + f14) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    public final long c() {
        float f10 = this.f30368c - this.f30366a;
        float f11 = this.f30369d - this.f30367b;
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public final c d(c cVar) {
        return new c(Math.max(this.f30366a, cVar.f30366a), Math.max(this.f30367b, cVar.f30367b), Math.min(this.f30368c, cVar.f30368c), Math.min(this.f30369d, cVar.f30369d));
    }

    public final c e(float f10, float f11) {
        return new c(this.f30366a + f10, this.f30367b + f11, this.f30368c + f10, this.f30369d + f11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f30366a, cVar.f30366a) == 0 && Float.compare(this.f30367b, cVar.f30367b) == 0 && Float.compare(this.f30368c, cVar.f30368c) == 0 && Float.compare(this.f30369d, cVar.f30369d) == 0;
    }

    public final c f(long j) {
        int i4 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        return new c(Float.intBitsToFloat(i4) + this.f30366a, Float.intBitsToFloat(i10) + this.f30367b, Float.intBitsToFloat(i4) + this.f30368c, Float.intBitsToFloat(i10) + this.f30369d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f30369d) + r5.c.d(this.f30368c, r5.c.d(this.f30367b, Float.floatToIntBits(this.f30366a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + com.bumptech.glide.c.u(this.f30366a) + ", " + com.bumptech.glide.c.u(this.f30367b) + ", " + com.bumptech.glide.c.u(this.f30368c) + ", " + com.bumptech.glide.c.u(this.f30369d) + ')';
    }
}
