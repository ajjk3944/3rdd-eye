package Ia;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f8995a;

    /* renamed from: b, reason: collision with root package name */
    private final Double f8996b;

    /* renamed from: c, reason: collision with root package name */
    private final Double f8997c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8998d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8999e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9000f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9001g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9002h;

    /* renamed from: i, reason: collision with root package name */
    private final Long f9003i;

    public c(String url, Double d10, Double d11, String str, String str2, String str3, String str4, String str5, Long l10) {
        AbstractC6492s.i(url, "url");
        this.f8995a = url;
        this.f8996b = d10;
        this.f8997c = d11;
        this.f8998d = str;
        this.f8999e = str2;
        this.f9000f = str3;
        this.f9001g = str4;
        this.f9002h = str5;
        this.f9003i = l10;
    }

    public final String a() {
        return this.f9000f;
    }

    public final String b() {
        return this.f9001g;
    }

    public final String c() {
        return this.f9002h;
    }

    public final Double d() {
        return this.f8996b;
    }

    public final Double e() {
        return this.f8997c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC6492s.d(this.f8995a, cVar.f8995a) && AbstractC6492s.d(this.f8996b, cVar.f8996b) && AbstractC6492s.d(this.f8997c, cVar.f8997c) && AbstractC6492s.d(this.f8998d, cVar.f8998d) && AbstractC6492s.d(this.f8999e, cVar.f8999e) && AbstractC6492s.d(this.f9000f, cVar.f9000f) && AbstractC6492s.d(this.f9001g, cVar.f9001g) && AbstractC6492s.d(this.f9002h, cVar.f9002h) && AbstractC6492s.d(this.f9003i, cVar.f9003i);
    }

    public final String f() {
        return this.f8998d;
    }

    public final String g() {
        return this.f8999e;
    }

    public final Long h() {
        return this.f9003i;
    }

    public int hashCode() {
        int iHashCode = this.f8995a.hashCode() * 31;
        Double d10 = this.f8996b;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f8997c;
        int iHashCode3 = (iHashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str = this.f8998d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f8999e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9000f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9001g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9002h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l10 = this.f9003i;
        return iHashCode8 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String i() {
        return this.f8995a;
    }

    public String toString() {
        return "UiSpeedtestInternetServer(url=" + this.f8995a + ", latitude=" + this.f8996b + ", longitude=" + this.f8997c + ", provider=" + this.f8998d + ", providerUrl=" + this.f8999e + ", city=" + this.f9000f + ", country=" + this.f9001g + ", countryCode=" + this.f9002h + ", speedMbps=" + this.f9003i + ")";
    }
}
