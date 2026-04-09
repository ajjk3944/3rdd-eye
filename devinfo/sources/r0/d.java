package r0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f32500a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32501b;

    /* renamed from: c, reason: collision with root package name */
    public final float f32502c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32503d;

    /* renamed from: e, reason: collision with root package name */
    public final float f32504e;

    public d(float f10, float f11, float f12, float f13, float f14) {
        this.f32500a = f10;
        this.f32501b = f11;
        this.f32502c = f12;
        this.f32503d = f13;
        this.f32504e = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return d3.f.b(this.f32500a, dVar.f32500a) && d3.f.b(this.f32501b, dVar.f32501b) && d3.f.b(this.f32502c, dVar.f32502c) && d3.f.b(this.f32503d, dVar.f32503d) && d3.f.b(this.f32504e, dVar.f32504e);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f32504e) + r5.c.d(this.f32503d, r5.c.d(this.f32502c, r5.c.d(this.f32501b, Float.floatToIntBits(this.f32500a) * 31, 31), 31), 31);
    }
}
