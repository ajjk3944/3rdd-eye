package ff;

import i3.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f24024a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24025b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24026c;

    public b(int i4, long j, String str) {
        this.f24024a = str;
        this.f24025b = j;
        this.f24026c = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i4 = bVar.f24026c;
        String str = bVar.f24024a;
        String str2 = this.f24024a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f24025b != bVar.f24025b) {
            return false;
        }
        int i10 = this.f24026c;
        return i10 == 0 ? i4 == 0 : e.a(i10, i4);
    }

    public final int hashCode() {
        String str = this.f24024a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f24025b;
        int i4 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i10 = this.f24026c;
        return (i10 != 0 ? e.c(i10) : 0) ^ i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f24024a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f24025b);
        sb2.append(", responseCode=");
        int i4 = this.f24026c;
        sb2.append(i4 != 1 ? i4 != 2 ? i4 != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb2.append("}");
        return sb2.toString();
    }
}
