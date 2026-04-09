package z3;

import N7.C1094a9;
import z3.g;

/* compiled from: AutoValue_BackendResponse.java */
/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public final g.a f48438a;

    /* renamed from: b, reason: collision with root package name */
    public final long f48439b;

    public b(g.a aVar, long j4) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f48438a = aVar;
        this.f48439b = j4;
    }

    @Override // z3.g
    public final long a() {
        return this.f48439b;
    }

    @Override // z3.g
    public final g.a b() {
        return this.f48438a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f48438a.equals(gVar.b()) && this.f48439b == gVar.a();
    }

    public final int hashCode() {
        int iHashCode = (this.f48438a.hashCode() ^ 1000003) * 1000003;
        long j4 = this.f48439b;
        return iHashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.f48438a);
        sb.append(", nextRequestWaitMillis=");
        return C1094a9.f(sb, this.f48439b, "}");
    }
}
