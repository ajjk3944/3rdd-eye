package fa;

import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f23850a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23851b;

    public a(int i4, long j) {
        if (i4 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f23850a = i4;
        this.f23851b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i3.e.a(this.f23850a, aVar.f23850a) && this.f23851b == aVar.f23851b;
    }

    public final int hashCode() {
        int iC = (i3.e.c(this.f23850a) ^ 1000003) * 1000003;
        long j = this.f23851b;
        return iC ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i4 = this.f23850a;
        sb2.append(i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb2.append(", nextRequestWaitMillis=");
        return u.s(this.f23851b, "}", sb2);
    }
}
