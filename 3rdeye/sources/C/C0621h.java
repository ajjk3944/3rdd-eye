package C;

import C.d0;
import android.graphics.Rect;
import android.util.Size;

/* compiled from: AutoValue_SurfaceOutput_CameraInputInfo.java */
/* renamed from: C.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621h extends d0.a {

    /* renamed from: a, reason: collision with root package name */
    public final Size f709a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f710b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.impl.J f711c;

    /* renamed from: d, reason: collision with root package name */
    public final int f712d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f713e;

    public C0621h(Size size, Rect rect, androidx.camera.core.impl.J j4, int i, boolean z10) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f709a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.f710b = rect;
        this.f711c = j4;
        this.f712d = i;
        this.f713e = z10;
    }

    @Override // C.d0.a
    public final androidx.camera.core.impl.J a() {
        return this.f711c;
    }

    @Override // C.d0.a
    public final Rect b() {
        return this.f710b;
    }

    @Override // C.d0.a
    public final Size c() {
        return this.f709a;
    }

    @Override // C.d0.a
    public final boolean d() {
        return this.f713e;
    }

    @Override // C.d0.a
    public final int e() {
        return this.f712d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0.a)) {
            return false;
        }
        d0.a aVar = (d0.a) obj;
        if (!this.f709a.equals(aVar.c()) || !this.f710b.equals(aVar.b())) {
            return false;
        }
        androidx.camera.core.impl.J j4 = this.f711c;
        if (j4 == null) {
            if (aVar.a() != null) {
                return false;
            }
        } else if (!j4.equals(aVar.a())) {
            return false;
        }
        return this.f712d == aVar.e() && this.f713e == aVar.d();
    }

    public final int hashCode() {
        int iHashCode = (((this.f709a.hashCode() ^ 1000003) * 1000003) ^ this.f710b.hashCode()) * 1000003;
        androidx.camera.core.impl.J j4 = this.f711c;
        return ((((iHashCode ^ (j4 == null ? 0 : j4.hashCode())) * 1000003) ^ this.f712d) * 1000003) ^ (this.f713e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.f709a);
        sb.append(", inputCropRect=");
        sb.append(this.f710b);
        sb.append(", cameraInternal=");
        sb.append(this.f711c);
        sb.append(", rotationDegrees=");
        sb.append(this.f712d);
        sb.append(", mirroring=");
        return androidx.work.s.h(sb, this.f713e, "}");
    }
}
