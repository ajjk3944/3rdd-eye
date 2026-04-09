package s9;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final v9.a f21928a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f21929b;

    public a(v9.a aVar, HashMap map) {
        this.f21928a = aVar;
        this.f21929b = map;
    }

    public final long a(j9.d dVar, long j, int i10) {
        long jE = j - this.f21928a.e();
        b bVar = (b) this.f21929b.get(dVar);
        long j7 = bVar.f21930a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i10 - 1) * j7 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j7 > 1 ? j7 : 2L) * r12))), jE), bVar.f21931b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f21928a.equals(aVar.f21928a) && this.f21929b.equals(aVar.f21929b);
    }

    public final int hashCode() {
        return ((this.f21928a.hashCode() ^ 1000003) * 1000003) ^ this.f21929b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f21928a + ", values=" + this.f21929b + "}";
    }
}
