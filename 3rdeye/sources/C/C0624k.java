package C;

import C.k0;
import android.graphics.Matrix;
import android.graphics.Rect;

/* compiled from: AutoValue_SurfaceRequest_TransformationInfo.java */
/* renamed from: C.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624k extends k0.d {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f724a;

    /* renamed from: b, reason: collision with root package name */
    public final int f725b;

    /* renamed from: c, reason: collision with root package name */
    public final int f726c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f727d;

    /* renamed from: e, reason: collision with root package name */
    public final Matrix f728e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f729f;

    public C0624k(Rect rect, int i, int i10, boolean z10, Matrix matrix, boolean z11) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f724a = rect;
        this.f725b = i;
        this.f726c = i10;
        this.f727d = z10;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f728e = matrix;
        this.f729f = z11;
    }

    @Override // C.k0.d
    public final Rect a() {
        return this.f724a;
    }

    @Override // C.k0.d
    public final int b() {
        return this.f725b;
    }

    @Override // C.k0.d
    public final Matrix c() {
        return this.f728e;
    }

    @Override // C.k0.d
    public final int d() {
        return this.f726c;
    }

    @Override // C.k0.d
    public final boolean e() {
        return this.f727d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k0.d)) {
            return false;
        }
        k0.d dVar = (k0.d) obj;
        return this.f724a.equals(dVar.a()) && this.f725b == dVar.b() && this.f726c == dVar.d() && this.f727d == dVar.e() && this.f728e.equals(dVar.c()) && this.f729f == dVar.f();
    }

    @Override // C.k0.d
    public final boolean f() {
        return this.f729f;
    }

    public final int hashCode() {
        return ((((((((((this.f724a.hashCode() ^ 1000003) * 1000003) ^ this.f725b) * 1000003) ^ this.f726c) * 1000003) ^ (this.f727d ? 1231 : 1237)) * 1000003) ^ this.f728e.hashCode()) * 1000003) ^ (this.f729f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationInfo{getCropRect=");
        sb.append(this.f724a);
        sb.append(", getRotationDegrees=");
        sb.append(this.f725b);
        sb.append(", getTargetRotation=");
        sb.append(this.f726c);
        sb.append(", hasCameraTransform=");
        sb.append(this.f727d);
        sb.append(", getSensorToBufferTransform=");
        sb.append(this.f728e);
        sb.append(", isMirroring=");
        return androidx.work.s.h(sb, this.f729f, "}");
    }
}
