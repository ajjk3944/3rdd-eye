package Xb;

import b8.EnumC4076c;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: p, reason: collision with root package name */
    public static final C0917a f24219p = new C0917a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f24220a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24221b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24222c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24223d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24224e;

    /* renamed from: f, reason: collision with root package name */
    private final String f24225f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f24226g;

    /* renamed from: h, reason: collision with root package name */
    private final Integer f24227h;

    /* renamed from: i, reason: collision with root package name */
    private final String f24228i;

    /* renamed from: j, reason: collision with root package name */
    private final Integer f24229j;

    /* renamed from: k, reason: collision with root package name */
    private final String f24230k;

    /* renamed from: l, reason: collision with root package name */
    private final Integer f24231l;

    /* renamed from: m, reason: collision with root package name */
    private final Integer f24232m;

    /* renamed from: n, reason: collision with root package name */
    private final Float f24233n;

    /* renamed from: o, reason: collision with root package name */
    private final List f24234o;

    /* renamed from: Xb.a$a, reason: collision with other inner class name */
    public static final class C0917a {
        public /* synthetic */ C0917a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0917a() {
        }
    }

    public a(long j10, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, Integer num3, String str7, Integer num4, Integer num5, Float f10, List list) {
        this.f24220a = j10;
        this.f24221b = str;
        this.f24222c = str2;
        this.f24223d = str3;
        this.f24224e = str4;
        this.f24225f = str5;
        this.f24226g = num;
        this.f24227h = num2;
        this.f24228i = str6;
        this.f24229j = num3;
        this.f24230k = str7;
        this.f24231l = num4;
        this.f24232m = num5;
        this.f24233n = f10;
        this.f24234o = list;
    }

    public final a a(long j10, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, Integer num3, String str7, Integer num4, Integer num5, Float f10, List list) {
        return new a(j10, str, str2, str3, str4, str5, num, num2, str6, num3, str7, num4, num5, f10, list);
    }

    public final String c() {
        return this.f24224e;
    }

    public final String d() {
        return this.f24228i;
    }

    public final Integer e() {
        return this.f24229j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f24220a == aVar.f24220a && AbstractC6492s.d(this.f24221b, aVar.f24221b) && AbstractC6492s.d(this.f24222c, aVar.f24222c) && AbstractC6492s.d(this.f24223d, aVar.f24223d) && AbstractC6492s.d(this.f24224e, aVar.f24224e) && AbstractC6492s.d(this.f24225f, aVar.f24225f) && AbstractC6492s.d(this.f24226g, aVar.f24226g) && AbstractC6492s.d(this.f24227h, aVar.f24227h) && AbstractC6492s.d(this.f24228i, aVar.f24228i) && AbstractC6492s.d(this.f24229j, aVar.f24229j) && AbstractC6492s.d(this.f24230k, aVar.f24230k) && AbstractC6492s.d(this.f24231l, aVar.f24231l) && AbstractC6492s.d(this.f24232m, aVar.f24232m) && AbstractC6492s.d(this.f24233n, aVar.f24233n) && AbstractC6492s.d(this.f24234o, aVar.f24234o);
    }

    public final String f() {
        return this.f24230k;
    }

    public final String g() {
        return this.f24221b;
    }

    public final List h() {
        return this.f24234o;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f24220a) * 31;
        String str = this.f24221b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24222c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24223d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f24224e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f24225f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f24226g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f24227h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.f24228i;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.f24229j;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.f24230k;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num4 = this.f24231l;
        int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f24232m;
        int iHashCode13 = (iHashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Float f10 = this.f24233n;
        int iHashCode14 = (iHashCode13 + (f10 == null ? 0 : f10.hashCode())) * 31;
        List list = this.f24234o;
        return iHashCode14 + (list != null ? list.hashCode() : 0);
    }

    public final S8.a i() {
        String str = this.f24225f;
        if (str != null) {
            return Qb.a.b(str);
        }
        return null;
    }

    public final EnumC4076c j() {
        return Qb.b.b(this.f24221b);
    }

    public final Integer k() {
        return this.f24231l;
    }

    public final Integer l() {
        return this.f24232m;
    }

    public final long m() {
        return this.f24220a;
    }

    public final Integer n() {
        return this.f24226g;
    }

    public final Integer o() {
        return this.f24227h;
    }

    public final String p() {
        return this.f24222c;
    }

    public final String q() {
        return this.f24223d;
    }

    public final S8.c r() {
        String str = this.f24228i;
        if (str != null) {
            return Qb.c.b(str);
        }
        return null;
    }

    public final S8.d s() {
        String str = this.f24230k;
        if (str != null) {
            return Qb.d.a(str);
        }
        return null;
    }

    public final Float t() {
        return this.f24233n;
    }

    public String toString() {
        return "RoomSpeedtestEnvironment(resultId=" + this.f24220a + ", connectionTypeId=" + this.f24221b + ", ssid=" + this.f24222c + ", topology=" + this.f24223d + ", apName=" + this.f24224e + ", wifiModeId=" + this.f24225f + ", signal=" + this.f24226g + ", signalAp=" + this.f24227h + ", bandId=" + this.f24228i + ", channel=" + this.f24229j + ", channelWidthId=" + this.f24230k + ", rateDownload=" + this.f24231l + ", rateUpload=" + this.f24232m + ", wifiExperience=" + this.f24233n + ", dnsServers=" + this.f24234o + ")";
    }

    public final String u() {
        return this.f24225f;
    }

    public a(long j10, EnumC4076c enumC4076c, String str, String str2, String str3, S8.a aVar, Integer num, Integer num2, S8.c cVar, Integer num3, S8.d dVar, Integer num4, Integer num5, Float f10, List list) {
        this(j10, enumC4076c != null ? Qb.b.a(enumC4076c) : null, str, str2, str3, aVar != null ? Qb.a.a(aVar) : null, num, num2, cVar != null ? Qb.c.a(cVar) : null, num3, dVar != null ? Qb.d.b(dVar) : null, num4, num5, f10, list);
    }
}
