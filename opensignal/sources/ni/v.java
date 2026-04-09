package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v extends vj.c {
    public final Integer A;
    public final Integer B;

    /* renamed from: a, reason: collision with root package name */
    public final long f18218a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18219b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18220c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18221d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18222e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18223f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f18224g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f18225h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f18226i;
    public final String j;
    public final Integer k;

    /* renamed from: l, reason: collision with root package name */
    public final String f18227l;

    /* renamed from: m, reason: collision with root package name */
    public final Double f18228m;

    /* renamed from: n, reason: collision with root package name */
    public final Double f18229n;

    /* renamed from: o, reason: collision with root package name */
    public final Double f18230o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f18231p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f18232q;

    /* renamed from: r, reason: collision with root package name */
    public final Double f18233r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f18234s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f18235t;

    /* renamed from: u, reason: collision with root package name */
    public final String f18236u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f18237v;

    /* renamed from: w, reason: collision with root package name */
    public final String f18238w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f18239x;

    /* renamed from: y, reason: collision with root package name */
    public final Integer f18240y;

    /* renamed from: z, reason: collision with root package name */
    public final Integer f18241z;

    public v(long j, long j7, String str, long j10, String str2, String str3, Integer num, Integer num2, Integer num3, String str4, Integer num4, String str5, Double d6, Double d10, Double d11, Integer num5, Integer num6, Double d12, Integer num7, Integer num8, String str6, Integer num9, String str7, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14) {
        br.l.e(str, "taskName");
        br.l.e(str2, "dataEndpoint");
        br.l.e(str3, "jobType");
        this.f18218a = j;
        this.f18219b = j7;
        this.f18220c = str;
        this.f18221d = j10;
        this.f18222e = str2;
        this.f18223f = str3;
        this.f18224g = num;
        this.f18225h = num2;
        this.f18226i = num3;
        this.j = str4;
        this.k = num4;
        this.f18227l = str5;
        this.f18228m = d6;
        this.f18229n = d10;
        this.f18230o = d11;
        this.f18231p = num5;
        this.f18232q = num6;
        this.f18233r = d12;
        this.f18234s = num7;
        this.f18235t = num8;
        this.f18236u = str6;
        this.f18237v = num9;
        this.f18238w = str7;
        this.f18239x = num10;
        this.f18240y = num11;
        this.f18241z = num12;
        this.A = num13;
        this.B = num14;
    }

    public static v i(v vVar, long j) {
        long j7 = vVar.f18219b;
        String str = vVar.f18220c;
        long j10 = vVar.f18221d;
        String str2 = vVar.f18222e;
        String str3 = vVar.f18223f;
        Integer num = vVar.f18224g;
        Integer num2 = vVar.f18225h;
        Integer num3 = vVar.f18226i;
        String str4 = vVar.j;
        Integer num4 = vVar.k;
        String str5 = vVar.f18227l;
        Double d6 = vVar.f18228m;
        Double d10 = vVar.f18229n;
        Double d11 = vVar.f18230o;
        Integer num5 = vVar.f18231p;
        Integer num6 = vVar.f18232q;
        Double d12 = vVar.f18233r;
        Integer num7 = vVar.f18234s;
        Integer num8 = vVar.f18235t;
        String str6 = vVar.f18236u;
        Integer num9 = vVar.f18237v;
        String str7 = vVar.f18238w;
        Integer num10 = vVar.f18239x;
        Integer num11 = vVar.f18240y;
        Integer num12 = vVar.f18241z;
        Integer num13 = vVar.A;
        Integer num14 = vVar.B;
        br.l.e(str, "taskName");
        br.l.e(str2, "dataEndpoint");
        br.l.e(str3, "jobType");
        return new v(j, j7, str, j10, str2, str3, num, num2, num3, str4, num4, str5, d6, d10, d11, num5, num6, d12, num7, num8, str6, num9, str7, num10, num11, num12, num13, num14);
    }

    @Override // vj.c
    public final String a() {
        return this.f18222e;
    }

    @Override // vj.c
    public final long b() {
        return this.f18218a;
    }

    @Override // vj.c
    public final String c() {
        return this.f18223f;
    }

    @Override // vj.c
    public final long d() {
        return this.f18219b;
    }

    @Override // vj.c
    public final String e() {
        return this.f18220c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f18218a == vVar.f18218a && this.f18219b == vVar.f18219b && br.l.a(this.f18220c, vVar.f18220c) && this.f18221d == vVar.f18221d && br.l.a(this.f18222e, vVar.f18222e) && br.l.a(this.f18223f, vVar.f18223f) && br.l.a(this.f18224g, vVar.f18224g) && br.l.a(this.f18225h, vVar.f18225h) && br.l.a(this.f18226i, vVar.f18226i) && br.l.a(this.j, vVar.j) && br.l.a(this.k, vVar.k) && br.l.a(this.f18227l, vVar.f18227l) && br.l.a(this.f18228m, vVar.f18228m) && br.l.a(this.f18229n, vVar.f18229n) && br.l.a(this.f18230o, vVar.f18230o) && br.l.a(this.f18231p, vVar.f18231p) && br.l.a(this.f18232q, vVar.f18232q) && br.l.a(this.f18233r, vVar.f18233r) && br.l.a(this.f18234s, vVar.f18234s) && br.l.a(this.f18235t, vVar.f18235t) && br.l.a(this.f18236u, vVar.f18236u) && br.l.a(this.f18237v, vVar.f18237v) && br.l.a(this.f18238w, vVar.f18238w) && br.l.a(this.f18239x, vVar.f18239x) && br.l.a(this.f18240y, vVar.f18240y) && br.l.a(this.f18241z, vVar.f18241z) && br.l.a(this.A, vVar.A) && br.l.a(this.B, vVar.B);
    }

    @Override // vj.c
    public final long f() {
        return this.f18221d;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) {
        xu.d.Y(jSONObject, "ICMP_TEST_COUNT", this.f18224g);
        xu.d.Y(jSONObject, "ICMP_TEST_SIZE_BYTES", this.f18225h);
        xu.d.Y(jSONObject, "ICMP_TEST_PERIOD_MS", this.f18226i);
        xu.d.Y(jSONObject, "ICMP_TEST_ARGUMENTS", this.j);
        xu.d.Y(jSONObject, "ICMP_TEST_STATUS", this.k);
        xu.d.Y(jSONObject, "ICMP_TEST_SERVER", this.f18227l);
        xu.d.Y(jSONObject, "ICMP_TEST_LATENCY_MAX", this.f18228m);
        xu.d.Y(jSONObject, "ICMP_TEST_LATENCY_MIN", this.f18229n);
        xu.d.Y(jSONObject, "ICMP_TEST_LATENCY_AVERAGE", this.f18230o);
        xu.d.Y(jSONObject, "ICMP_TEST_PACKET_SENT", this.f18231p);
        xu.d.Y(jSONObject, "ICMP_TEST_PACKET_LOST", this.f18232q);
        xu.d.Y(jSONObject, "ICMP_TEST_PACKET_LOST_PERCENTAGE", this.f18233r);
        xu.d.Y(jSONObject, "ICMP_TEST_BYTES_SENT", this.f18234s);
        xu.d.Y(jSONObject, "ICMP_TRACEROUTE_STATUS", this.f18235t);
        xu.d.Y(jSONObject, "ICMP_TRACEROUTE_NODE_INFO", this.f18236u);
        xu.d.Y(jSONObject, "ICMP_TRACEROUTE_TTL", this.f18237v);
        xu.d.Y(jSONObject, "KEY_ICMP_TEST_EVENTS", this.f18238w);
        xu.d.Y(jSONObject, "ICMP_TRACEROUTE_CONFIG_PACKET_DELAY", this.f18239x);
        xu.d.Y(jSONObject, "ICMP_TRACEROUTE_CONFIG_PACKET_COUNT", this.f18240y);
        xu.d.Y(jSONObject, "ICMP_TRACEROUTE_CONFIG_MAX_HOP_COUNT", this.f18241z);
        xu.d.Y(jSONObject, "ICMP_TRACEROUTE_CONFIG_MAX_NODE_TIMEOUT", this.A);
        xu.d.Y(jSONObject, "ICMP_TRACEROUTE_CONFIG_IP_MASK_COUNT", this.B);
    }

    public final int hashCode() {
        int iG = c7.a.g(this.f18223f, c7.a.g(this.f18222e, h0.b.b(c7.a.g(this.f18220c, h0.b.b(Long.hashCode(this.f18218a) * 31, 31, this.f18219b), 31), 31, this.f18221d), 31), 31);
        Integer num = this.f18224g;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f18225h;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f18226i;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.j;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num4 = this.k;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.f18227l;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d6 = this.f18228m;
        int iHashCode7 = (iHashCode6 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d10 = this.f18229n;
        int iHashCode8 = (iHashCode7 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f18230o;
        int iHashCode9 = (iHashCode8 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Integer num5 = this.f18231p;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f18232q;
        int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Double d12 = this.f18233r;
        int iHashCode12 = (iHashCode11 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Integer num7 = this.f18234s;
        int iHashCode13 = (iHashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f18235t;
        int iHashCode14 = (iHashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str3 = this.f18236u;
        int iHashCode15 = (iHashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num9 = this.f18237v;
        int iHashCode16 = (iHashCode15 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str4 = this.f18238w;
        int iHashCode17 = (iHashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num10 = this.f18239x;
        int iHashCode18 = (iHashCode17 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.f18240y;
        int iHashCode19 = (iHashCode18 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.f18241z;
        int iHashCode20 = (iHashCode19 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.A;
        int iHashCode21 = (iHashCode20 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.B;
        return iHashCode21 + (num14 != null ? num14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IcmpJobResult(id=");
        sb2.append(this.f18218a);
        sb2.append(", taskId=");
        sb2.append(this.f18219b);
        sb2.append(", taskName=");
        sb2.append(this.f18220c);
        sb2.append(", timeOfResult=");
        sb2.append(this.f18221d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f18222e);
        sb2.append(", jobType=");
        sb2.append(this.f18223f);
        sb2.append(", testCount=");
        sb2.append(this.f18224g);
        sb2.append(", testSizeBytes=");
        sb2.append(this.f18225h);
        sb2.append(", testPeriodMs=");
        sb2.append(this.f18226i);
        sb2.append(", testArguments=");
        sb2.append(this.j);
        sb2.append(", testStatus=");
        sb2.append(this.k);
        sb2.append(", testServer=");
        sb2.append(this.f18227l);
        sb2.append(", latencyMax=");
        sb2.append(this.f18228m);
        sb2.append(", latencyMin=");
        sb2.append(this.f18229n);
        sb2.append(", latencyAverage=");
        sb2.append(this.f18230o);
        sb2.append(", packetSent=");
        sb2.append(this.f18231p);
        sb2.append(", packetLost=");
        sb2.append(this.f18232q);
        sb2.append(", packetLostPercentage=");
        sb2.append(this.f18233r);
        sb2.append(", bytesSent=");
        sb2.append(this.f18234s);
        sb2.append(", tracerouteStatus=");
        sb2.append(this.f18235t);
        sb2.append(", tracerouteNodeInfo=");
        sb2.append(this.f18236u);
        sb2.append(", tracerouteTtl=");
        sb2.append(this.f18237v);
        sb2.append(", events=");
        sb2.append(this.f18238w);
        sb2.append(", tracerouteConfigPacketDelay=");
        sb2.append(this.f18239x);
        sb2.append(", tracerouteConfigPacketCount=");
        sb2.append(this.f18240y);
        sb2.append(", tracerouteConfigMaxHopCount=");
        sb2.append(this.f18241z);
        sb2.append(", tracerouteConfigMaxNodeTimeout=");
        sb2.append(this.A);
        sb2.append(", tracerouteConfigIpMaskCount=");
        return w.g.i(sb2, this.B, ')');
    }
}
