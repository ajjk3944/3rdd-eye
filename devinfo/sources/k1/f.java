package k1;

import km.y;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f27805a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27806b;

    /* renamed from: c, reason: collision with root package name */
    public final g f27807c;

    /* renamed from: d, reason: collision with root package name */
    public final y f27808d;

    public f(int i4, long j, g gVar, y yVar) {
        this.f27805a = i4;
        this.f27806b = j;
        this.f27807c = gVar;
        this.f27808d = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f27805a == fVar.f27805a && this.f27806b == fVar.f27806b && this.f27807c == fVar.f27807c && k.a(this.f27808d, fVar.f27808d);
    }

    public final int hashCode() {
        int i4 = this.f27805a * 31;
        long j = this.f27806b;
        int iHashCode = (this.f27807c.hashCode() + ((i4 + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        y yVar = this.f27808d;
        return iHashCode + (yVar == null ? 0 : yVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f27805a + ", timestamp=" + this.f27806b + ", type=" + this.f27807c + ", structureCompat=" + this.f27808d + ')';
    }
}
