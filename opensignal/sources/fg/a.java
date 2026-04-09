package fg;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8838a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8839b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8840c;

    public a(String str, long j, long j7) {
        this.f8838a = str;
        this.f8839b = j;
        this.f8840c = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f8838a.equals(aVar.f8838a) && this.f8839b == aVar.f8839b && this.f8840c == aVar.f8840c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f8838a.hashCode() ^ 1000003) * 1000003;
        long j = this.f8839b;
        long j7 = this.f8840c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f8838a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f8839b);
        sb2.append(", tokenCreationTimestamp=");
        return c7.a.n(this.f8840c, "}", sb2);
    }
}
