package je;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f27538a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27539b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27540c;

    public c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f27538a = str;
        this.f27539b = str2;
        this.f27540c = str3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str3 = cVar.f27540c;
            String str4 = cVar.f27539b;
            if (this.f27538a.equals(cVar.f27538a) && ((str = this.f27539b) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f27540c) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f27538a.hashCode() ^ 1000003) * 1000003;
        String str = this.f27539b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f27540c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f27538a);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f27539b);
        sb2.append(", firebaseAuthenticationToken=");
        return d.h.w(sb2, this.f27540c, "}");
    }
}
