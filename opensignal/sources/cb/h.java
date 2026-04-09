package cb;

import qb.v;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f3563a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3564b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3565c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3566d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3567e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f3563a = str;
        this.f3564b = str2;
        this.f3565c = str3;
        this.f3566d = str4;
        this.f3567e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return v.a(this.f3563a, hVar.f3563a) && v.a(this.f3564b, hVar.f3564b) && v.a(this.f3565c, hVar.f3565c) && v.a(this.f3566d, hVar.f3566d) && v.a(this.f3567e, hVar.f3567e);
    }

    public final int hashCode() {
        String str = this.f3563a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3564b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3565c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f3566d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f3567e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
