package ff;

import i3.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f24019a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24020b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24021c;

    /* renamed from: d, reason: collision with root package name */
    public final b f24022d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24023e;

    public a(String str, String str2, String str3, b bVar, int i4) {
        this.f24019a = str;
        this.f24020b = str2;
        this.f24021c = str3;
        this.f24022d = bVar;
        this.f24023e = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i4 = aVar.f24023e;
        b bVar = aVar.f24022d;
        String str = aVar.f24021c;
        String str2 = aVar.f24020b;
        String str3 = aVar.f24019a;
        String str4 = this.f24019a;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = this.f24020b;
        if (str5 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str5.equals(str2)) {
            return false;
        }
        String str6 = this.f24021c;
        if (str6 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str6.equals(str)) {
            return false;
        }
        b bVar2 = this.f24022d;
        if (bVar2 == null) {
            if (bVar != null) {
                return false;
            }
        } else if (!bVar2.equals(bVar)) {
            return false;
        }
        int i10 = this.f24023e;
        return i10 == 0 ? i4 == 0 : e.a(i10, i4);
    }

    public final int hashCode() {
        String str = this.f24019a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f24020b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f24021c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f24022d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i4 = this.f24023e;
        return (i4 != 0 ? e.c(i4) : 0) ^ iHashCode4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f24019a);
        sb2.append(", fid=");
        sb2.append(this.f24020b);
        sb2.append(", refreshToken=");
        sb2.append(this.f24021c);
        sb2.append(", authToken=");
        sb2.append(this.f24022d);
        sb2.append(", responseCode=");
        int i4 = this.f24023e;
        sb2.append(i4 != 1 ? i4 != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb2.append("}");
        return sb2.toString();
    }
}
