package E;

import C.K;
import E.D;

/* compiled from: AutoValue_TakePictureManager_CaptureError.java */
/* loaded from: classes.dex */
public final class g extends D.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1314a;

    /* renamed from: b, reason: collision with root package name */
    public final K f1315b;

    public g(int i, K k10) {
        this.f1314a = i;
        this.f1315b = k10;
    }

    @Override // E.D.a
    public final K a() {
        return this.f1315b;
    }

    @Override // E.D.a
    public final int b() {
        return this.f1314a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D.a)) {
            return false;
        }
        D.a aVar = (D.a) obj;
        return this.f1314a == aVar.b() && this.f1315b.equals(aVar.a());
    }

    public final int hashCode() {
        return ((this.f1314a ^ 1000003) * 1000003) ^ this.f1315b.hashCode();
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.f1314a + ", imageCaptureException=" + this.f1315b + "}";
    }
}
