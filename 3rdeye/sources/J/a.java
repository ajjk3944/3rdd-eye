package J;

import J.e;
import androidx.camera.core.impl.AbstractC1688f0;
import androidx.camera.core.impl.C1691h;

/* compiled from: AutoValue_CameraUseCaseAdapter_CameraId.java */
/* loaded from: classes.dex */
public final class a extends e.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2646a;

    /* renamed from: b, reason: collision with root package name */
    public final C1691h f2647b;

    public a(String str, C1691h c1691h) {
        if (str == null) {
            throw new NullPointerException("Null cameraIdString");
        }
        this.f2646a = str;
        if (c1691h == null) {
            throw new NullPointerException("Null cameraConfigId");
        }
        this.f2647b = c1691h;
    }

    @Override // J.e.b
    public final AbstractC1688f0 a() {
        return this.f2647b;
    }

    @Override // J.e.b
    public final String b() {
        return this.f2646a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e.b)) {
            return false;
        }
        e.b bVar = (e.b) obj;
        return this.f2646a.equals(bVar.b()) && this.f2647b.equals(bVar.a());
    }

    public final int hashCode() {
        return ((this.f2646a.hashCode() ^ 1000003) * 1000003) ^ this.f2647b.hashCode();
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.f2646a + ", cameraConfigId=" + this.f2647b + "}";
    }
}
