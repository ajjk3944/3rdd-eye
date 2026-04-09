package hf;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f10640a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10641b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10642c;

    public b(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f10640a = str;
        this.f10641b = str2;
        this.f10642c = str3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            String str3 = bVar.f10642c;
            String str4 = bVar.f10641b;
            if (this.f10640a.equals(bVar.f10640a) && ((str = this.f10641b) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f10642c) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f10640a.hashCode() ^ 1000003) * 1000003;
        String str = this.f10641b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f10642c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f10640a);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f10641b);
        sb2.append(", firebaseAuthenticationToken=");
        return w.g.j(sb2, this.f10642c, "}");
    }
}
