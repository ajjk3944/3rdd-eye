package nd;

import S8.l;
import b8.AbstractC4075b;
import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: nd.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6934f {

    /* renamed from: t, reason: collision with root package name */
    public static final a f54571t = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f54572a;

    /* renamed from: b, reason: collision with root package name */
    private final String f54573b;

    /* renamed from: c, reason: collision with root package name */
    private final String f54574c;

    /* renamed from: d, reason: collision with root package name */
    private final C5969a f54575d;

    /* renamed from: e, reason: collision with root package name */
    private final String f54576e;

    /* renamed from: f, reason: collision with root package name */
    private final String f54577f;

    /* renamed from: g, reason: collision with root package name */
    private final l f54578g;

    /* renamed from: h, reason: collision with root package name */
    private final Integer f54579h;

    /* renamed from: i, reason: collision with root package name */
    private final V7.a f54580i;

    /* renamed from: j, reason: collision with root package name */
    private final V7.b f54581j;

    /* renamed from: k, reason: collision with root package name */
    private final V7.a f54582k;

    /* renamed from: l, reason: collision with root package name */
    private final V7.b f54583l;

    /* renamed from: m, reason: collision with root package name */
    private final W7.a f54584m;

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC4075b f54585n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC4075b f54586o;

    /* renamed from: p, reason: collision with root package name */
    private final b8.d f54587p;

    /* renamed from: q, reason: collision with root package name */
    private final S8.c f54588q;

    /* renamed from: r, reason: collision with root package name */
    private final S8.a f54589r;

    /* renamed from: s, reason: collision with root package name */
    private final long f54590s;

    /* renamed from: nd.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6934f(String id2, String name, String str, C5969a c5969a, String str2, String str3, l lVar, Integer num, V7.a aVar, V7.b bVar, V7.a aVar2, V7.b bVar2, W7.a aVar3, AbstractC4075b abstractC4075b, AbstractC4075b abstractC4075b2, b8.d dVar, S8.c cVar, S8.a aVar4, long j10) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(name, "name");
        this.f54572a = id2;
        this.f54573b = name;
        this.f54574c = str;
        this.f54575d = c5969a;
        this.f54576e = str2;
        this.f54577f = str3;
        this.f54578g = lVar;
        this.f54579h = num;
        this.f54580i = aVar;
        this.f54581j = bVar;
        this.f54582k = aVar2;
        this.f54583l = bVar2;
        this.f54584m = aVar3;
        this.f54585n = abstractC4075b;
        this.f54586o = abstractC4075b2;
        this.f54587p = dVar;
        this.f54588q = cVar;
        this.f54589r = aVar4;
        this.f54590s = j10;
    }

    public final String a() {
        return this.f54576e;
    }

    public final String b() {
        return this.f54577f;
    }

    public final S8.c c() {
        return this.f54588q;
    }

    public final C5969a d() {
        return this.f54575d;
    }

    public final long e() {
        return this.f54590s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6934f)) {
            return false;
        }
        C6934f c6934f = (C6934f) obj;
        return AbstractC6492s.d(this.f54572a, c6934f.f54572a) && AbstractC6492s.d(this.f54573b, c6934f.f54573b) && AbstractC6492s.d(this.f54574c, c6934f.f54574c) && AbstractC6492s.d(this.f54575d, c6934f.f54575d) && AbstractC6492s.d(this.f54576e, c6934f.f54576e) && AbstractC6492s.d(this.f54577f, c6934f.f54577f) && AbstractC6492s.d(this.f54578g, c6934f.f54578g) && AbstractC6492s.d(this.f54579h, c6934f.f54579h) && AbstractC6492s.d(this.f54580i, c6934f.f54580i) && AbstractC6492s.d(this.f54581j, c6934f.f54581j) && AbstractC6492s.d(this.f54582k, c6934f.f54582k) && AbstractC6492s.d(this.f54583l, c6934f.f54583l) && AbstractC6492s.d(this.f54584m, c6934f.f54584m) && AbstractC6492s.d(this.f54585n, c6934f.f54585n) && AbstractC6492s.d(this.f54586o, c6934f.f54586o) && AbstractC6492s.d(this.f54587p, c6934f.f54587p) && this.f54588q == c6934f.f54588q && this.f54589r == c6934f.f54589r && this.f54590s == c6934f.f54590s;
    }

    public final AbstractC4075b f() {
        return this.f54586o;
    }

    public final String g() {
        return this.f54572a;
    }

    public final S8.a h() {
        return this.f54589r;
    }

    public int hashCode() {
        int iHashCode = ((this.f54572a.hashCode() * 31) + this.f54573b.hashCode()) * 31;
        String str = this.f54574c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C5969a c5969a = this.f54575d;
        int iHashCode3 = (iHashCode2 + (c5969a == null ? 0 : c5969a.hashCode())) * 31;
        String str2 = this.f54576e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f54577f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        l lVar = this.f54578g;
        int iHashCode6 = (iHashCode5 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Integer num = this.f54579h;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        V7.a aVar = this.f54580i;
        int iHashCode8 = (iHashCode7 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        V7.b bVar = this.f54581j;
        int iHashCode9 = (iHashCode8 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        V7.a aVar2 = this.f54582k;
        int iHashCode10 = (iHashCode9 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        V7.b bVar2 = this.f54583l;
        int iHashCode11 = (iHashCode10 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        W7.a aVar3 = this.f54584m;
        int iHashCode12 = (iHashCode11 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        AbstractC4075b abstractC4075b = this.f54585n;
        int iHashCode13 = (iHashCode12 + (abstractC4075b == null ? 0 : abstractC4075b.hashCode())) * 31;
        AbstractC4075b abstractC4075b2 = this.f54586o;
        int iHashCode14 = (iHashCode13 + (abstractC4075b2 == null ? 0 : abstractC4075b2.hashCode())) * 31;
        b8.d dVar = this.f54587p;
        int iHashCode15 = (iHashCode14 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        S8.c cVar = this.f54588q;
        int iHashCode16 = (iHashCode15 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        S8.a aVar4 = this.f54589r;
        return ((iHashCode16 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31) + Long.hashCode(this.f54590s);
    }

    public final AbstractC4075b i() {
        return this.f54585n;
    }

    public final String j() {
        return this.f54573b;
    }

    public final b8.d k() {
        return this.f54587p;
    }

    public final l l() {
        return this.f54578g;
    }

    public final V7.b m() {
        return this.f54581j;
    }

    public final V7.a n() {
        return this.f54580i;
    }

    public final V7.b o() {
        return this.f54583l;
    }

    public final V7.a p() {
        return this.f54582k;
    }

    public final Integer q() {
        return this.f54579h;
    }

    public final String r() {
        return this.f54574c;
    }

    public final W7.a s() {
        return this.f54584m;
    }

    public String toString() {
        return "SignalMapperPlace(id=" + this.f54572a + ", name=" + this.f54573b + ", ssid=" + this.f54574c + ", bssid=" + this.f54575d + ", apModel=" + this.f54576e + ", apName=" + this.f54577f + ", signalWifi=" + this.f54578g + ", simPrimaryIndex=" + this.f54579h + ", sim0Signal=" + this.f54580i + ", sim0Connection=" + this.f54581j + ", sim1Signal=" + this.f54582k + ", sim1Connection=" + this.f54583l + ", throughput=" + this.f54584m + ", latency=" + this.f54585n + ", dnsLatency=" + this.f54586o + ", packetLoss=" + this.f54587p + ", band=" + this.f54588q + ", ieeeMode=" + this.f54589r + ", created=" + this.f54590s + ")";
    }
}
