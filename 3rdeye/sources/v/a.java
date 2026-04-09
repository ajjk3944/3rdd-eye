package V;

import J.e;
import V.c;
import androidx.lifecycle.InterfaceC1790x;

/* compiled from: AutoValue_LifecycleCameraRepository_Key.java */
/* loaded from: classes.dex */
public final class a extends c.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1790x f12806a;

    /* renamed from: b, reason: collision with root package name */
    public final J.a f12807b;

    public a(InterfaceC1790x interfaceC1790x, J.a aVar) {
        if (interfaceC1790x == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f12806a = interfaceC1790x;
        if (aVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f12807b = aVar;
    }

    @Override // V.c.a
    public final e.b a() {
        return this.f12807b;
    }

    @Override // V.c.a
    public final InterfaceC1790x b() {
        return this.f12806a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c.a)) {
            return false;
        }
        c.a aVar = (c.a) obj;
        return this.f12806a.equals(aVar.b()) && this.f12807b.equals(aVar.a());
    }

    public final int hashCode() {
        return ((this.f12806a.hashCode() ^ 1000003) * 1000003) ^ this.f12807b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.f12806a + ", cameraId=" + this.f12807b + "}";
    }
}
