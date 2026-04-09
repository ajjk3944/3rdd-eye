package le;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f28708a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28709b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f28710c;

    public c(String str, long j, Map map) {
        nk.k.e(map, "additionalCustomKeys");
        this.f28708a = str;
        this.f28709b = j;
        this.f28710c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return nk.k.a(this.f28708a, cVar.f28708a) && this.f28709b == cVar.f28709b && nk.k.a(this.f28710c, cVar.f28710c);
    }

    public final int hashCode() {
        int iHashCode = this.f28708a.hashCode() * 31;
        long j = this.f28709b;
        return this.f28710c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f28708a + ", timestamp=" + this.f28709b + ", additionalCustomKeys=" + this.f28710c + ')';
    }
}
