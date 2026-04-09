package J;

/* compiled from: AutoValue_ImmutableZoomState.java */
/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final float f2648a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2649b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2650c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2651d;

    public b(float f10, float f11, float f12, float f13) {
        this.f2648a = f10;
        this.f2649b = f11;
        this.f2650c = f12;
        this.f2651d = f13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Float.floatToIntBits(this.f2648a) == Float.floatToIntBits(((b) fVar).f2648a)) {
                b bVar = (b) fVar;
                if (Float.floatToIntBits(this.f2649b) == Float.floatToIntBits(bVar.f2649b) && Float.floatToIntBits(this.f2650c) == Float.floatToIntBits(bVar.f2650c) && Float.floatToIntBits(this.f2651d) == Float.floatToIntBits(bVar.f2651d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f2648a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f2649b)) * 1000003) ^ Float.floatToIntBits(this.f2650c)) * 1000003) ^ Float.floatToIntBits(this.f2651d);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f2648a + ", maxZoomRatio=" + this.f2649b + ", minZoomRatio=" + this.f2650c + ", linearZoom=" + this.f2651d + "}";
    }
}
