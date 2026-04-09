package E;

import E.z;

/* compiled from: AutoValue_ProcessingNode_InputPacket.java */
/* loaded from: classes.dex */
public final class f extends z.b {

    /* renamed from: a, reason: collision with root package name */
    public final A f1312a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.c f1313b;

    public f(A a10, androidx.camera.core.c cVar) {
        if (a10 == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f1312a = a10;
        this.f1313b = cVar;
    }

    @Override // E.z.b
    public final androidx.camera.core.c a() {
        return this.f1313b;
    }

    @Override // E.z.b
    public final A b() {
        return this.f1312a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z.b)) {
            return false;
        }
        z.b bVar = (z.b) obj;
        return this.f1312a.equals(bVar.b()) && this.f1313b.equals(bVar.a());
    }

    public final int hashCode() {
        return ((this.f1312a.hashCode() ^ 1000003) * 1000003) ^ this.f1313b.hashCode();
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.f1312a + ", imageProxy=" + this.f1313b + "}";
    }
}
