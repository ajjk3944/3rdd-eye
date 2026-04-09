package ao;

import w.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f2159a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2160b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2161c;

    public a(long j, boolean z10, long j7) {
        this.f2159a = j;
        this.f2160b = z10;
        this.f2161c = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2159a == aVar.f2159a && this.f2160b == aVar.f2160b && this.f2161c == aVar.f2161c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2161c) + g.b(Long.hashCode(this.f2159a) * 31, this.f2160b, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CoreBackendTargetingAudienceResult(id=");
        sb2.append(this.f2159a);
        sb2.append(", isSuccess=");
        sb2.append(this.f2160b);
        sb2.append(", cacheUntilMs=");
        return g.h(sb2, this.f2161c, ')');
    }
}
