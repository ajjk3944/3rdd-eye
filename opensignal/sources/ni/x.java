package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class x extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18278a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18279b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18280c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18281d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18282e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18283f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f18284g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18285h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f18286i;
    public final String j;
    public final Integer k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f18287l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f18288m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f18289n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f18290o;

    public x(long j, long j7, String str, long j10, String str2, String str3, Integer num, String str4, Integer num2, String str5, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        br.l.e(str, "taskName");
        br.l.e(str2, "dataEndpoint");
        br.l.e(str3, "jobType");
        this.f18278a = j;
        this.f18279b = j7;
        this.f18280c = str;
        this.f18281d = j10;
        this.f18282e = str2;
        this.f18283f = str3;
        this.f18284g = num;
        this.f18285h = str4;
        this.f18286i = num2;
        this.j = str5;
        this.k = num3;
        this.f18287l = num4;
        this.f18288m = num5;
        this.f18289n = num6;
        this.f18290o = num7;
    }

    public static x i(x xVar, long j) {
        long j7 = xVar.f18279b;
        String str = xVar.f18280c;
        long j10 = xVar.f18281d;
        String str2 = xVar.f18282e;
        String str3 = xVar.f18283f;
        Integer num = xVar.f18284g;
        String str4 = xVar.f18285h;
        Integer num2 = xVar.f18286i;
        String str5 = xVar.j;
        Integer num3 = xVar.k;
        Integer num4 = xVar.f18287l;
        Integer num5 = xVar.f18288m;
        Integer num6 = xVar.f18289n;
        Integer num7 = xVar.f18290o;
        br.l.e(str, "taskName");
        br.l.e(str2, "dataEndpoint");
        br.l.e(str3, "jobType");
        return new x(j, j7, str, j10, str2, str3, num, str4, num2, str5, num3, num4, num5, num6, num7);
    }

    @Override // vj.c
    public final String a() {
        return this.f18282e;
    }

    @Override // vj.c
    public final long b() {
        return this.f18278a;
    }

    @Override // vj.c
    public final String c() {
        return this.f18283f;
    }

    @Override // vj.c
    public final long d() {
        return this.f18279b;
    }

    @Override // vj.c
    public final String e() {
        return this.f18280c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f18278a == xVar.f18278a && this.f18279b == xVar.f18279b && br.l.a(this.f18280c, xVar.f18280c) && this.f18281d == xVar.f18281d && br.l.a(this.f18282e, xVar.f18282e) && br.l.a(this.f18283f, xVar.f18283f) && br.l.a(this.f18284g, xVar.f18284g) && br.l.a(this.f18285h, xVar.f18285h) && br.l.a(this.f18286i, xVar.f18286i) && br.l.a(this.j, xVar.j) && br.l.a(this.k, xVar.k) && br.l.a(this.f18287l, xVar.f18287l) && br.l.a(this.f18288m, xVar.f18288m) && br.l.a(this.f18289n, xVar.f18289n) && br.l.a(this.f18290o, xVar.f18290o);
    }

    @Override // vj.c
    public final long f() {
        return this.f18281d;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) {
        xu.d.Y(jSONObject, "ICMP_TRACEROUTE_STATUS", this.f18284g);
        xu.d.Y(jSONObject, "ICMP_TRACEROUTE_NODE_INFO", this.f18285h);
        xu.d.Y(jSONObject, "ICMP_TRACEROUTE_TTL", this.f18286i);
        xu.d.Y(jSONObject, "ICMP_TRACEROUTE_TEST_EVENTS", this.j);
        xu.d.Y(jSONObject, "ICMP_TRACEROUTE_CONFIG_PACKET_DELAY", this.k);
        xu.d.Y(jSONObject, "ICMP_TRACEROUTE_CONFIG_PACKET_COUNT", this.f18287l);
        xu.d.Y(jSONObject, "ICMP_TRACEROUTE_CONFIG_MAX_HOP_COUNT", this.f18288m);
        xu.d.Y(jSONObject, "ICMP_TRACEROUTE_CONFIG_MAX_NODE_TIMEOUT", this.f18289n);
        xu.d.Y(jSONObject, "ICMP_TRACEROUTE_CONFIG_IP_MASK_COUNT", this.f18290o);
    }

    public final int hashCode() {
        int iG = c7.a.g(this.f18283f, c7.a.g(this.f18282e, h0.b.b(c7.a.g(this.f18280c, h0.b.b(Long.hashCode(this.f18278a) * 31, 31, this.f18279b), 31), 31, this.f18281d), 31), 31);
        Integer num = this.f18284g;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f18285h;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f18286i;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.k;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f18287l;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f18288m;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f18289n;
        int iHashCode8 = (iHashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f18290o;
        return iHashCode8 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IcmpTracerouteJobResult(id=");
        sb2.append(this.f18278a);
        sb2.append(", taskId=");
        sb2.append(this.f18279b);
        sb2.append(", taskName=");
        sb2.append(this.f18280c);
        sb2.append(", timeOfResult=");
        sb2.append(this.f18281d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f18282e);
        sb2.append(", jobType=");
        sb2.append(this.f18283f);
        sb2.append(", tracerouteStatus=");
        sb2.append(this.f18284g);
        sb2.append(", tracerouteNodeInfo=");
        sb2.append(this.f18285h);
        sb2.append(", tracerouteTtl=");
        sb2.append(this.f18286i);
        sb2.append(", events=");
        sb2.append(this.j);
        sb2.append(", tracerouteConfigPacketDelay=");
        sb2.append(this.k);
        sb2.append(", tracerouteConfigPacketCount=");
        sb2.append(this.f18287l);
        sb2.append(", tracerouteConfigMaxHopCount=");
        sb2.append(this.f18288m);
        sb2.append(", tracerouteConfigMaxNodeTimeout=");
        sb2.append(this.f18289n);
        sb2.append(", tracerouteConfigIpMaskCount=");
        return w.g.i(sb2, this.f18290o, ')');
    }
}
