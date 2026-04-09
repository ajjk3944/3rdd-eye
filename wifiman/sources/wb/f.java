package Wb;

import S8.l;
import b8.AbstractC4075b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: t, reason: collision with root package name */
    public static final a f23810t = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f23811a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23812b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23813c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23814d;

    /* renamed from: e, reason: collision with root package name */
    private final String f23815e;

    /* renamed from: f, reason: collision with root package name */
    private final String f23816f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f23817g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f23818h;

    /* renamed from: i, reason: collision with root package name */
    private final Integer f23819i;

    /* renamed from: j, reason: collision with root package name */
    private final Integer f23820j;

    /* renamed from: k, reason: collision with root package name */
    private final Integer f23821k;

    /* renamed from: l, reason: collision with root package name */
    private final String f23822l;

    /* renamed from: m, reason: collision with root package name */
    private final String f23823m;

    /* renamed from: n, reason: collision with root package name */
    private final long f23824n;

    /* renamed from: o, reason: collision with root package name */
    private final Integer f23825o;

    /* renamed from: p, reason: collision with root package name */
    private final Integer f23826p;

    /* renamed from: q, reason: collision with root package name */
    private final String f23827q;

    /* renamed from: r, reason: collision with root package name */
    private final Integer f23828r;

    /* renamed from: s, reason: collision with root package name */
    private final String f23829s;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public f(long j10, String name, String str, String str2, String str3, String str4, Integer num, Long l10, Integer num2, Integer num3, Integer num4, String str5, String str6, long j11, Integer num5, Integer num6, String str7, Integer num7, String str8) {
        AbstractC6492s.i(name, "name");
        this.f23811a = j10;
        this.f23812b = name;
        this.f23813c = str;
        this.f23814d = str2;
        this.f23815e = str3;
        this.f23816f = str4;
        this.f23817g = num;
        this.f23818h = l10;
        this.f23819i = num2;
        this.f23820j = num3;
        this.f23821k = num4;
        this.f23822l = str5;
        this.f23823m = str6;
        this.f23824n = j11;
        this.f23825o = num5;
        this.f23826p = num6;
        this.f23827q = str7;
        this.f23828r = num7;
        this.f23829s = str8;
    }

    public final String a() {
        return this.f23816f;
    }

    public final String b() {
        return this.f23815e;
    }

    public final String c() {
        return this.f23814d;
    }

    public final long d() {
        return this.f23824n;
    }

    public final Integer e() {
        return this.f23820j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f23811a == fVar.f23811a && AbstractC6492s.d(this.f23812b, fVar.f23812b) && AbstractC6492s.d(this.f23813c, fVar.f23813c) && AbstractC6492s.d(this.f23814d, fVar.f23814d) && AbstractC6492s.d(this.f23815e, fVar.f23815e) && AbstractC6492s.d(this.f23816f, fVar.f23816f) && AbstractC6492s.d(this.f23817g, fVar.f23817g) && AbstractC6492s.d(this.f23818h, fVar.f23818h) && AbstractC6492s.d(this.f23819i, fVar.f23819i) && AbstractC6492s.d(this.f23820j, fVar.f23820j) && AbstractC6492s.d(this.f23821k, fVar.f23821k) && AbstractC6492s.d(this.f23822l, fVar.f23822l) && AbstractC6492s.d(this.f23823m, fVar.f23823m) && this.f23824n == fVar.f23824n && AbstractC6492s.d(this.f23825o, fVar.f23825o) && AbstractC6492s.d(this.f23826p, fVar.f23826p) && AbstractC6492s.d(this.f23827q, fVar.f23827q) && AbstractC6492s.d(this.f23828r, fVar.f23828r) && AbstractC6492s.d(this.f23829s, fVar.f23829s);
    }

    public final long f() {
        return this.f23811a;
    }

    public final S8.a g() {
        String str = this.f23823m;
        if (str != null) {
            return Qb.a.b(str);
        }
        return null;
    }

    public final String h() {
        return this.f23823m;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.f23811a) * 31) + this.f23812b.hashCode()) * 31;
        String str = this.f23813c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23814d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f23815e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f23816f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f23817g;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Long l10 = this.f23818h;
        int iHashCode7 = (iHashCode6 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num2 = this.f23819i;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f23820j;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f23821k;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str5 = this.f23822l;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f23823m;
        int iHashCode12 = (((iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31) + Long.hashCode(this.f23824n)) * 31;
        Integer num5 = this.f23825o;
        int iHashCode13 = (iHashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f23826p;
        int iHashCode14 = (iHashCode13 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str7 = this.f23827q;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num7 = this.f23828r;
        int iHashCode16 = (iHashCode15 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str8 = this.f23829s;
        return iHashCode16 + (str8 != null ? str8.hashCode() : 0);
    }

    public final Integer i() {
        return this.f23819i;
    }

    public final String j() {
        return this.f23812b;
    }

    public final Integer k() {
        return this.f23821k;
    }

    public final Integer l() {
        return this.f23826p;
    }

    public final String m() {
        return this.f23827q;
    }

    public final Integer n() {
        return this.f23828r;
    }

    public final String o() {
        return this.f23829s;
    }

    public final Integer p() {
        return this.f23817g;
    }

    public final Integer q() {
        return this.f23825o;
    }

    public final String r() {
        return this.f23813c;
    }

    public final Long s() {
        return this.f23818h;
    }

    public final S8.c t() {
        String str = this.f23822l;
        if (str != null) {
            return Qb.c.b(str);
        }
        return null;
    }

    public String toString() {
        return "RoomSignalMapperPlace(id=" + this.f23811a + ", name=" + this.f23812b + ", ssid=" + this.f23813c + ", bssid=" + this.f23814d + ", apName=" + this.f23815e + ", apModel=" + this.f23816f + ", signalWifi=" + this.f23817g + ", throughput=" + this.f23818h + ", latency=" + this.f23819i + ", dnsLatency=" + this.f23820j + ", packetLoss=" + this.f23821k + ", wifiBandId=" + this.f23822l + ", ieeeModeId=" + this.f23823m + ", created=" + this.f23824n + ", simPrimaryIndex=" + this.f23825o + ", signalCellSim0=" + this.f23826p + ", signalCellSim0Type=" + this.f23827q + ", signalCellSim1=" + this.f23828r + ", signalCellSim1Type=" + this.f23829s + ")";
    }

    public final String u() {
        return this.f23822l;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Long l10, String name, String str, String str2, String str3, String str4, l lVar, Long l11, AbstractC4075b abstractC4075b, AbstractC4075b abstractC4075b2, Integer num, S8.c cVar, S8.a aVar, long j10, Integer num2, Integer num3, String str5, Integer num4, String str6) {
        this(l10 != null ? l10.longValue() : 0L, name, str, str2, str3, str4, lVar != null ? Integer.valueOf(lVar.b()) : null, l11, abstractC4075b != null ? Integer.valueOf(abstractC4075b.b()) : null, abstractC4075b2 != null ? Integer.valueOf(abstractC4075b2.b()) : null, num, cVar != null ? Qb.c.a(cVar) : null, aVar != null ? Qb.a.a(aVar) : null, j10, num2, num3, str5, num4, str6);
        AbstractC6492s.i(name, "name");
    }
}
