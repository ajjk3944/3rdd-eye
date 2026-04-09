package androidx.camera.core.impl;

/* compiled from: AutoValue_OutputSurfaceConfiguration.java */
/* renamed from: androidx.camera.core.impl.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1695j extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1693i f15059a;

    /* renamed from: b, reason: collision with root package name */
    public final C1693i f15060b;

    /* renamed from: c, reason: collision with root package name */
    public final C1693i f15061c;

    /* renamed from: d, reason: collision with root package name */
    public final C1693i f15062d;

    public C1695j(C1693i c1693i, C1693i c1693i2, C1693i c1693i3, C1693i c1693i4) {
        if (c1693i == null) {
            throw new NullPointerException("Null previewOutputSurface");
        }
        this.f15059a = c1693i;
        if (c1693i2 == null) {
            throw new NullPointerException("Null imageCaptureOutputSurface");
        }
        this.f15060b = c1693i2;
        this.f15061c = c1693i3;
        this.f15062d = c1693i4;
    }

    @Override // androidx.camera.core.impl.w0
    public final v0 a() {
        return this.f15061c;
    }

    @Override // androidx.camera.core.impl.w0
    public final v0 b() {
        return this.f15060b;
    }

    @Override // androidx.camera.core.impl.w0
    public final v0 c() {
        return this.f15062d;
    }

    @Override // androidx.camera.core.impl.w0
    public final v0 d() {
        return this.f15059a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (!this.f15059a.equals(w0Var.d()) || !this.f15060b.equals(w0Var.b())) {
            return false;
        }
        C1693i c1693i = this.f15061c;
        if (c1693i == null) {
            if (w0Var.a() != null) {
                return false;
            }
        } else if (!c1693i.equals(w0Var.a())) {
            return false;
        }
        C1693i c1693i2 = this.f15062d;
        return c1693i2 == null ? w0Var.c() == null : c1693i2.equals(w0Var.c());
    }

    public final int hashCode() {
        int iHashCode = (((this.f15059a.hashCode() ^ 1000003) * 1000003) ^ this.f15060b.hashCode()) * 1000003;
        C1693i c1693i = this.f15061c;
        int iHashCode2 = (iHashCode ^ (c1693i == null ? 0 : c1693i.hashCode())) * 1000003;
        C1693i c1693i2 = this.f15062d;
        return iHashCode2 ^ (c1693i2 != null ? c1693i2.hashCode() : 0);
    }

    public final String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.f15059a + ", imageCaptureOutputSurface=" + this.f15060b + ", imageAnalysisOutputSurface=" + this.f15061c + ", postviewOutputSurface=" + this.f15062d + "}";
    }
}
