package v;

import v.n0;

/* compiled from: AutoValue_SupportedSurfaceCombination_FeatureSettings.java */
/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5648c extends n0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f46677a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46678b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f46679c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f46680d;

    public C5648c(int i, int i10, boolean z10, boolean z11) {
        this.f46677a = i;
        this.f46678b = i10;
        this.f46679c = z10;
        this.f46680d = z11;
    }

    @Override // v.n0.a
    public final int a() {
        return this.f46677a;
    }

    @Override // v.n0.a
    public final int b() {
        return this.f46678b;
    }

    @Override // v.n0.a
    public final boolean c() {
        return this.f46679c;
    }

    @Override // v.n0.a
    public final boolean d() {
        return this.f46680d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n0.a)) {
            return false;
        }
        n0.a aVar = (n0.a) obj;
        return this.f46677a == aVar.a() && this.f46678b == aVar.b() && this.f46679c == aVar.c() && this.f46680d == aVar.d();
    }

    public final int hashCode() {
        return ((((((this.f46677a ^ 1000003) * 1000003) ^ this.f46678b) * 1000003) ^ (this.f46679c ? 1231 : 1237)) * 1000003) ^ (this.f46680d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureSettings{cameraMode=");
        sb.append(this.f46677a);
        sb.append(", requiredMaxBitDepth=");
        sb.append(this.f46678b);
        sb.append(", previewStabilizationOn=");
        sb.append(this.f46679c);
        sb.append(", ultraHdrOn=");
        return androidx.work.s.h(sb, this.f46680d, "}");
    }
}
