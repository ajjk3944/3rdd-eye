package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18251a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18252b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18253c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18254d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18255e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18256f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f18257g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f18258h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f18259i;
    public final String j;
    public final Integer k;

    /* renamed from: l, reason: collision with root package name */
    public final String f18260l;

    /* renamed from: m, reason: collision with root package name */
    public final Double f18261m;

    /* renamed from: n, reason: collision with root package name */
    public final Double f18262n;

    /* renamed from: o, reason: collision with root package name */
    public final Double f18263o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f18264p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f18265q;

    /* renamed from: r, reason: collision with root package name */
    public final Double f18266r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f18267s;

    /* renamed from: t, reason: collision with root package name */
    public final String f18268t;

    public w(long j, long j7, String str, long j10, String str2, String str3, Integer num, Integer num2, Integer num3, String str4, Integer num4, String str5, Double d6, Double d10, Double d11, Integer num5, Integer num6, Double d12, Integer num7, String str6) {
        br.l.e(str, "taskName");
        br.l.e(str2, "dataEndpoint");
        br.l.e(str3, "jobType");
        this.f18251a = j;
        this.f18252b = j7;
        this.f18253c = str;
        this.f18254d = j10;
        this.f18255e = str2;
        this.f18256f = str3;
        this.f18257g = num;
        this.f18258h = num2;
        this.f18259i = num3;
        this.j = str4;
        this.k = num4;
        this.f18260l = str5;
        this.f18261m = d6;
        this.f18262n = d10;
        this.f18263o = d11;
        this.f18264p = num5;
        this.f18265q = num6;
        this.f18266r = d12;
        this.f18267s = num7;
        this.f18268t = str6;
    }

    public static w i(w wVar, long j) {
        long j7 = wVar.f18252b;
        String str = wVar.f18253c;
        long j10 = wVar.f18254d;
        String str2 = wVar.f18255e;
        String str3 = wVar.f18256f;
        Integer num = wVar.f18257g;
        Integer num2 = wVar.f18258h;
        Integer num3 = wVar.f18259i;
        String str4 = wVar.j;
        Integer num4 = wVar.k;
        String str5 = wVar.f18260l;
        Double d6 = wVar.f18261m;
        Double d10 = wVar.f18262n;
        Double d11 = wVar.f18263o;
        Integer num5 = wVar.f18264p;
        Integer num6 = wVar.f18265q;
        Double d12 = wVar.f18266r;
        Integer num7 = wVar.f18267s;
        String str6 = wVar.f18268t;
        br.l.e(str, "taskName");
        br.l.e(str2, "dataEndpoint");
        br.l.e(str3, "jobType");
        return new w(j, j7, str, j10, str2, str3, num, num2, num3, str4, num4, str5, d6, d10, d11, num5, num6, d12, num7, str6);
    }

    @Override // vj.c
    public final String a() {
        return this.f18255e;
    }

    @Override // vj.c
    public final long b() {
        return this.f18251a;
    }

    @Override // vj.c
    public final String c() {
        return this.f18256f;
    }

    @Override // vj.c
    public final long d() {
        return this.f18252b;
    }

    @Override // vj.c
    public final String e() {
        return this.f18253c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f18251a == wVar.f18251a && this.f18252b == wVar.f18252b && br.l.a(this.f18253c, wVar.f18253c) && this.f18254d == wVar.f18254d && br.l.a(this.f18255e, wVar.f18255e) && br.l.a(this.f18256f, wVar.f18256f) && br.l.a(this.f18257g, wVar.f18257g) && br.l.a(this.f18258h, wVar.f18258h) && br.l.a(this.f18259i, wVar.f18259i) && br.l.a(this.j, wVar.j) && br.l.a(this.k, wVar.k) && br.l.a(this.f18260l, wVar.f18260l) && br.l.a(this.f18261m, wVar.f18261m) && br.l.a(this.f18262n, wVar.f18262n) && br.l.a(this.f18263o, wVar.f18263o) && br.l.a(this.f18264p, wVar.f18264p) && br.l.a(this.f18265q, wVar.f18265q) && br.l.a(this.f18266r, wVar.f18266r) && br.l.a(this.f18267s, wVar.f18267s) && br.l.a(this.f18268t, wVar.f18268t);
    }

    @Override // vj.c
    public final long f() {
        return this.f18254d;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) {
        xu.d.Y(jSONObject, "ICMP_TEST_COUNT", this.f18257g);
        xu.d.Y(jSONObject, "ICMP_TEST_SIZE_BYTES", this.f18258h);
        xu.d.Y(jSONObject, "ICMP_TEST_PERIOD_MS", this.f18259i);
        xu.d.Y(jSONObject, "ICMP_TEST_ARGUMENTS", this.j);
        xu.d.Y(jSONObject, "ICMP_TEST_STATUS", this.k);
        xu.d.Y(jSONObject, "ICMP_TEST_SERVER", this.f18260l);
        xu.d.Y(jSONObject, "ICMP_TEST_LATENCY_MAX", this.f18261m);
        xu.d.Y(jSONObject, "ICMP_TEST_LATENCY_MIN", this.f18262n);
        xu.d.Y(jSONObject, "ICMP_TEST_LATENCY_AVERAGE", this.f18263o);
        xu.d.Y(jSONObject, "ICMP_TEST_PACKET_SENT", this.f18264p);
        xu.d.Y(jSONObject, "ICMP_TEST_PACKET_LOST", this.f18265q);
        xu.d.Y(jSONObject, "ICMP_TEST_PACKET_LOST_PERCENTAGE", this.f18266r);
        xu.d.Y(jSONObject, "ICMP_TEST_BYTES_SENT", this.f18267s);
        xu.d.Y(jSONObject, "ICMP_TEST_EVENTS", this.f18268t);
    }

    public final int hashCode() {
        int iG = c7.a.g(this.f18256f, c7.a.g(this.f18255e, h0.b.b(c7.a.g(this.f18253c, h0.b.b(Long.hashCode(this.f18251a) * 31, 31, this.f18252b), 31), 31, this.f18254d), 31), 31);
        Integer num = this.f18257g;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f18258h;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f18259i;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.j;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num4 = this.k;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.f18260l;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d6 = this.f18261m;
        int iHashCode7 = (iHashCode6 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d10 = this.f18262n;
        int iHashCode8 = (iHashCode7 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f18263o;
        int iHashCode9 = (iHashCode8 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Integer num5 = this.f18264p;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f18265q;
        int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Double d12 = this.f18266r;
        int iHashCode12 = (iHashCode11 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Integer num7 = this.f18267s;
        int iHashCode13 = (iHashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str3 = this.f18268t;
        return iHashCode13 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IcmpPingJobResult(id=");
        sb2.append(this.f18251a);
        sb2.append(", taskId=");
        sb2.append(this.f18252b);
        sb2.append(", taskName=");
        sb2.append(this.f18253c);
        sb2.append(", timeOfResult=");
        sb2.append(this.f18254d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f18255e);
        sb2.append(", jobType=");
        sb2.append(this.f18256f);
        sb2.append(", testCount=");
        sb2.append(this.f18257g);
        sb2.append(", testSizeBytes=");
        sb2.append(this.f18258h);
        sb2.append(", testPeriodMs=");
        sb2.append(this.f18259i);
        sb2.append(", testArguments=");
        sb2.append(this.j);
        sb2.append(", testStatus=");
        sb2.append(this.k);
        sb2.append(", testServer=");
        sb2.append(this.f18260l);
        sb2.append(", latencyMax=");
        sb2.append(this.f18261m);
        sb2.append(", latencyMin=");
        sb2.append(this.f18262n);
        sb2.append(", latencyAverage=");
        sb2.append(this.f18263o);
        sb2.append(", packetSent=");
        sb2.append(this.f18264p);
        sb2.append(", packetLost=");
        sb2.append(this.f18265q);
        sb2.append(", packetLostPercentage=");
        sb2.append(this.f18266r);
        sb2.append(", bytesSent=");
        sb2.append(this.f18267s);
        sb2.append(", events=");
        return h0.b.r(sb2, this.f18268t, ')');
    }
}
