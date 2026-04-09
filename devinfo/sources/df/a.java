package df;

import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f22226a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22227b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22228c;

    public a(String str, long j, long j8) {
        this.f22226a = str;
        this.f22227b = j;
        this.f22228c = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f22226a.equals(aVar.f22226a) && this.f22227b == aVar.f22227b && this.f22228c == aVar.f22228c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f22226a.hashCode() ^ 1000003) * 1000003;
        long j = this.f22227b;
        long j8 = this.f22228c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f22226a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f22227b);
        sb2.append(", tokenCreationTimestamp=");
        return u.s(this.f22228c, "}", sb2);
    }
}
