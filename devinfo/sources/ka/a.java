package ka;

import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final na.a f28109a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f28110b;

    public a(na.a aVar, HashMap map) {
        this.f28109a = aVar;
        this.f28110b = map;
    }

    public final long a(ba.c cVar, long j, int i4) {
        long jI = j - this.f28109a.i();
        b bVar = (b) this.f28110b.get(cVar);
        long j8 = bVar.f28111a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i4 - 1) * j8 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j8 > 1 ? j8 : 2L) * r12))), jI), bVar.f28112b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f28109a.equals(aVar.f28109a) && this.f28110b.equals(aVar.f28110b);
    }

    public final int hashCode() {
        return ((this.f28109a.hashCode() ^ 1000003) * 1000003) ^ this.f28110b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f28109a + ", values=" + this.f28110b + "}";
    }
}
