package N;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.A;

/* compiled from: AutoValue_Packet.java */
/* loaded from: classes.dex */
public final class b<T> extends m<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f4366a;

    /* renamed from: b, reason: collision with root package name */
    public final G.f f4367b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4368c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f4369d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f4370e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4371f;

    /* renamed from: g, reason: collision with root package name */
    public final Matrix f4372g;

    /* renamed from: h, reason: collision with root package name */
    public final A f4373h;

    public b(T t10, G.f fVar, int i, Size size, Rect rect, int i10, Matrix matrix, A a10) {
        if (t10 == null) {
            throw new NullPointerException("Null data");
        }
        this.f4366a = t10;
        this.f4367b = fVar;
        this.f4368c = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f4369d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f4370e = rect;
        this.f4371f = i10;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f4372g = matrix;
        if (a10 == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f4373h = a10;
    }

    @Override // N.m
    public final A a() {
        return this.f4373h;
    }

    @Override // N.m
    public final Rect b() {
        return this.f4370e;
    }

    @Override // N.m
    public final T c() {
        return this.f4366a;
    }

    @Override // N.m
    public final G.f d() {
        return this.f4367b;
    }

    @Override // N.m
    public final int e() {
        return this.f4368c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f4366a.equals(mVar.c())) {
            return false;
        }
        G.f fVar = this.f4367b;
        if (fVar == null) {
            if (mVar.d() != null) {
                return false;
            }
        } else if (!fVar.equals(mVar.d())) {
            return false;
        }
        return this.f4368c == mVar.e() && this.f4369d.equals(mVar.h()) && this.f4370e.equals(mVar.b()) && this.f4371f == mVar.f() && this.f4372g.equals(mVar.g()) && this.f4373h.equals(mVar.a());
    }

    @Override // N.m
    public final int f() {
        return this.f4371f;
    }

    @Override // N.m
    public final Matrix g() {
        return this.f4372g;
    }

    @Override // N.m
    public final Size h() {
        return this.f4369d;
    }

    public final int hashCode() {
        int iHashCode = (this.f4366a.hashCode() ^ 1000003) * 1000003;
        G.f fVar = this.f4367b;
        return ((((((((((((iHashCode ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003) ^ this.f4368c) * 1000003) ^ this.f4369d.hashCode()) * 1000003) ^ this.f4370e.hashCode()) * 1000003) ^ this.f4371f) * 1000003) ^ this.f4372g.hashCode()) * 1000003) ^ this.f4373h.hashCode();
    }

    public final String toString() {
        return "Packet{data=" + this.f4366a + ", exif=" + this.f4367b + ", format=" + this.f4368c + ", size=" + this.f4369d + ", cropRect=" + this.f4370e + ", rotationDegrees=" + this.f4371f + ", sensorToBufferTransform=" + this.f4372g + ", cameraCaptureResult=" + this.f4373h + "}";
    }
}
