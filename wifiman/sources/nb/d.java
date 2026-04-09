package Nb;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: o, reason: collision with root package name */
    public static final a f16346o = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f16347a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16348b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16349c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16350d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16351e;

    /* renamed from: f, reason: collision with root package name */
    private final Float f16352f;

    /* renamed from: g, reason: collision with root package name */
    private final Float f16353g;

    /* renamed from: h, reason: collision with root package name */
    private final String f16354h;

    /* renamed from: i, reason: collision with root package name */
    private final Boolean f16355i;

    /* renamed from: j, reason: collision with root package name */
    private final String f16356j;

    /* renamed from: k, reason: collision with root package name */
    private final String f16357k;

    /* renamed from: l, reason: collision with root package name */
    private final Boolean f16358l;

    /* renamed from: m, reason: collision with root package name */
    private final String f16359m;

    /* renamed from: n, reason: collision with root package name */
    private final String f16360n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(String id2, String ssoAccountId, String str, String str2, String str3, Float f10, Float f11, String str4, Boolean bool, String str5, String str6, Boolean bool2, String str7, String str8) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(ssoAccountId, "ssoAccountId");
        this.f16347a = id2;
        this.f16348b = ssoAccountId;
        this.f16349c = str;
        this.f16350d = str2;
        this.f16351e = str3;
        this.f16352f = f10;
        this.f16353g = f11;
        this.f16354h = str4;
        this.f16355i = bool;
        this.f16356j = str5;
        this.f16357k = str6;
        this.f16358l = bool2;
        this.f16359m = str7;
        this.f16360n = str8;
    }

    public final Boolean a() {
        return this.f16355i;
    }

    public final String b() {
        return this.f16349c;
    }

    public final String c() {
        return this.f16347a;
    }

    public final Float d() {
        return this.f16353g;
    }

    public final Float e() {
        return this.f16352f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC6492s.d(this.f16347a, dVar.f16347a) && AbstractC6492s.d(this.f16348b, dVar.f16348b) && AbstractC6492s.d(this.f16349c, dVar.f16349c) && AbstractC6492s.d(this.f16350d, dVar.f16350d) && AbstractC6492s.d(this.f16351e, dVar.f16351e) && AbstractC6492s.d(this.f16352f, dVar.f16352f) && AbstractC6492s.d(this.f16353g, dVar.f16353g) && AbstractC6492s.d(this.f16354h, dVar.f16354h) && AbstractC6492s.d(this.f16355i, dVar.f16355i) && AbstractC6492s.d(this.f16356j, dVar.f16356j) && AbstractC6492s.d(this.f16357k, dVar.f16357k) && AbstractC6492s.d(this.f16358l, dVar.f16358l) && AbstractC6492s.d(this.f16359m, dVar.f16359m) && AbstractC6492s.d(this.f16360n, dVar.f16360n);
    }

    public final String f() {
        return this.f16354h;
    }

    public final String g() {
        return this.f16351e;
    }

    public final String h() {
        return this.f16356j;
    }

    public int hashCode() {
        int iHashCode = ((this.f16347a.hashCode() * 31) + this.f16348b.hashCode()) * 31;
        String str = this.f16349c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f16350d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16351e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f10 = this.f16352f;
        int iHashCode5 = (iHashCode4 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f16353g;
        int iHashCode6 = (iHashCode5 + (f11 == null ? 0 : f11.hashCode())) * 31;
        String str4 = this.f16354h;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f16355i;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.f16356j;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f16357k;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool2 = this.f16358l;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.f16359m;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f16360n;
        return iHashCode12 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String i() {
        return this.f16350d;
    }

    public final String j() {
        return this.f16360n;
    }

    public final String k() {
        return this.f16359m;
    }

    public final String l() {
        return this.f16357k;
    }

    public final String m() {
        return this.f16348b;
    }

    public final Boolean n() {
        return this.f16358l;
    }

    public String toString() {
        return "RoomUbiquitiCloudConsole(id=" + this.f16347a + ", ssoAccountId=" + this.f16348b + ", fwVersion=" + this.f16349c + ", name=" + this.f16350d + ", mac=" + this.f16351e + ", locationLon=" + this.f16352f + ", locationLat=" + this.f16353g + ", locationText=" + this.f16354h + ", available=" + this.f16355i + ", model=" + this.f16356j + ", productId=" + this.f16357k + ", isOwnedByMe=" + this.f16358l + ", networkVersion=" + this.f16359m + ", networkTeleportAvailability=" + this.f16360n + ")";
    }
}
