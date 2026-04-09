package b1;

import br.l;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f2375a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2376b;

    /* renamed from: c, reason: collision with root package name */
    public final g f2377c;

    /* renamed from: d, reason: collision with root package name */
    public final a2.g f2378d;

    public f(int i10, long j, g gVar, a2.g gVar2) {
        this.f2375a = i10;
        this.f2376b = j;
        this.f2377c = gVar;
        this.f2378d = gVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2375a == fVar.f2375a && this.f2376b == fVar.f2376b && this.f2377c == fVar.f2377c && l.a(this.f2378d, fVar.f2378d);
    }

    public final int hashCode() {
        int iHashCode = (this.f2377c.hashCode() + h0.b.b(Integer.hashCode(this.f2375a) * 31, 31, this.f2376b)) * 31;
        a2.g gVar = this.f2378d;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f2375a + ", timestamp=" + this.f2376b + ", type=" + this.f2377c + ", structureCompat=" + this.f2378d + ')';
    }
}
