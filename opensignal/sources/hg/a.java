package hg;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10733a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10734b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10735c;

    /* renamed from: d, reason: collision with root package name */
    public final b f10736d;

    /* renamed from: e, reason: collision with root package name */
    public final d f10737e;

    public a(String str, String str2, String str3, b bVar, d dVar) {
        this.f10733a = str;
        this.f10734b = str2;
        this.f10735c = str3;
        this.f10736d = bVar;
        this.f10737e = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            d dVar = aVar.f10737e;
            b bVar = aVar.f10736d;
            String str = aVar.f10735c;
            String str2 = aVar.f10734b;
            String str3 = aVar.f10733a;
            String str4 = this.f10733a;
            if (str4 != null ? str4.equals(str3) : str3 == null) {
                String str5 = this.f10734b;
                if (str5 != null ? str5.equals(str2) : str2 == null) {
                    String str6 = this.f10735c;
                    if (str6 != null ? str6.equals(str) : str == null) {
                        b bVar2 = this.f10736d;
                        if (bVar2 != null ? bVar2.equals(bVar) : bVar == null) {
                            d dVar2 = this.f10737e;
                            if (dVar2 != null ? dVar2.equals(dVar) : dVar == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10733a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f10734b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10735c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f10736d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        d dVar = this.f10737e;
        return (dVar != null ? dVar.hashCode() : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f10733a + ", fid=" + this.f10734b + ", refreshToken=" + this.f10735c + ", authToken=" + this.f10736d + ", responseCode=" + this.f10737e + "}";
    }
}
