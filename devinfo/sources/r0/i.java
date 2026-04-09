package r0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final float f32545a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32546b;

    /* renamed from: c, reason: collision with root package name */
    public final float f32547c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32548d;

    /* renamed from: e, reason: collision with root package name */
    public final float f32549e;

    public i(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f32545a = f10;
        this.f32546b = f11;
        this.f32547c = f12;
        this.f32548d = f13;
        this.f32549e = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return d3.f.b(this.f32545a, iVar.f32545a) && d3.f.b(this.f32546b, iVar.f32546b) && d3.f.b(this.f32547c, iVar.f32547c) && d3.f.b(this.f32548d, iVar.f32548d) && d3.f.b(this.f32549e, iVar.f32549e);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f32549e) + r5.c.d(this.f32548d, r5.c.d(this.f32547c, r5.c.d(this.f32546b, Float.floatToIntBits(this.f32545a) * 31, 31), 31), 31);
    }
}
