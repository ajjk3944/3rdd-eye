package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t0 extends vj.c {
    public final String A;
    public final Integer B;
    public final String C;

    /* renamed from: a, reason: collision with root package name */
    public final long f18170a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18171b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18172c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18173d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18174e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18175f;

    /* renamed from: g, reason: collision with root package name */
    public final double f18176g;

    /* renamed from: h, reason: collision with root package name */
    public final double f18177h;

    /* renamed from: i, reason: collision with root package name */
    public final double f18178i;
    public final double j;
    public final double k;

    /* renamed from: l, reason: collision with root package name */
    public final double f18179l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18180m;

    /* renamed from: n, reason: collision with root package name */
    public final int f18181n;

    /* renamed from: o, reason: collision with root package name */
    public final double f18182o;

    /* renamed from: p, reason: collision with root package name */
    public final int f18183p;

    /* renamed from: q, reason: collision with root package name */
    public final double f18184q;

    /* renamed from: r, reason: collision with root package name */
    public final String f18185r;

    /* renamed from: s, reason: collision with root package name */
    public final int f18186s;

    /* renamed from: t, reason: collision with root package name */
    public final int f18187t;

    /* renamed from: u, reason: collision with root package name */
    public final int f18188u;

    /* renamed from: v, reason: collision with root package name */
    public final int f18189v;

    /* renamed from: w, reason: collision with root package name */
    public final int f18190w;

    /* renamed from: x, reason: collision with root package name */
    public final String f18191x;

    /* renamed from: y, reason: collision with root package name */
    public final String f18192y;

    /* renamed from: z, reason: collision with root package name */
    public final String f18193z;

    public t0(long j, long j7, String str, long j10, String str2, String str3, double d6, double d10, double d11, double d12, double d13, double d14, int i10, int i11, double d15, int i12, double d16, String str4, int i13, int i14, int i15, int i16, int i17, String str5, String str6, String str7, String str8, Integer num, String str9) {
        br.l.e(str, "taskName");
        br.l.e(str2, "dataEndpoint");
        br.l.e(str3, "jobType");
        this.f18170a = j;
        this.f18171b = j7;
        this.f18172c = str;
        this.f18173d = j10;
        this.f18174e = str2;
        this.f18175f = str3;
        this.f18176g = d6;
        this.f18177h = d10;
        this.f18178i = d11;
        this.j = d12;
        this.k = d13;
        this.f18179l = d14;
        this.f18180m = i10;
        this.f18181n = i11;
        this.f18182o = d15;
        this.f18183p = i12;
        this.f18184q = d16;
        this.f18185r = str4;
        this.f18186s = i13;
        this.f18187t = i14;
        this.f18188u = i15;
        this.f18189v = i16;
        this.f18190w = i17;
        this.f18191x = str5;
        this.f18192y = str6;
        this.f18193z = str7;
        this.A = str8;
        this.B = num;
        this.C = str9;
    }

    public static t0 i(t0 t0Var, long j) {
        long j7 = t0Var.f18171b;
        String str = t0Var.f18172c;
        long j10 = t0Var.f18173d;
        String str2 = t0Var.f18174e;
        String str3 = t0Var.f18175f;
        double d6 = t0Var.f18176g;
        double d10 = t0Var.f18177h;
        double d11 = t0Var.f18178i;
        double d12 = t0Var.j;
        double d13 = t0Var.k;
        double d14 = t0Var.f18179l;
        int i10 = t0Var.f18180m;
        int i11 = t0Var.f18181n;
        double d15 = t0Var.f18182o;
        int i12 = t0Var.f18183p;
        double d16 = t0Var.f18184q;
        String str4 = t0Var.f18185r;
        int i13 = t0Var.f18186s;
        int i14 = t0Var.f18187t;
        int i15 = t0Var.f18188u;
        int i16 = t0Var.f18189v;
        int i17 = t0Var.f18190w;
        String str5 = t0Var.f18191x;
        String str6 = t0Var.f18192y;
        String str7 = t0Var.f18193z;
        String str8 = t0Var.A;
        Integer num = t0Var.B;
        String str9 = t0Var.C;
        br.l.e(str, "taskName");
        br.l.e(str2, "dataEndpoint");
        br.l.e(str3, "jobType");
        return new t0(j, j7, str, j10, str2, str3, d6, d10, d11, d12, d13, d14, i10, i11, d15, i12, d16, str4, i13, i14, i15, i16, i17, str5, str6, str7, str8, num, str9);
    }

    @Override // vj.c
    public final String a() {
        return this.f18174e;
    }

    @Override // vj.c
    public final long b() {
        return this.f18170a;
    }

    @Override // vj.c
    public final String c() {
        return this.f18175f;
    }

    @Override // vj.c
    public final long d() {
        return this.f18171b;
    }

    @Override // vj.c
    public final String e() {
        return this.f18172c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f18170a == t0Var.f18170a && this.f18171b == t0Var.f18171b && br.l.a(this.f18172c, t0Var.f18172c) && this.f18173d == t0Var.f18173d && br.l.a(this.f18174e, t0Var.f18174e) && br.l.a(this.f18175f, t0Var.f18175f) && Double.compare(this.f18176g, t0Var.f18176g) == 0 && Double.compare(this.f18177h, t0Var.f18177h) == 0 && Double.compare(this.f18178i, t0Var.f18178i) == 0 && Double.compare(this.j, t0Var.j) == 0 && Double.compare(this.k, t0Var.k) == 0 && Double.compare(this.f18179l, t0Var.f18179l) == 0 && this.f18180m == t0Var.f18180m && this.f18181n == t0Var.f18181n && Double.compare(this.f18182o, t0Var.f18182o) == 0 && this.f18183p == t0Var.f18183p && Double.compare(this.f18184q, t0Var.f18184q) == 0 && br.l.a(this.f18185r, t0Var.f18185r) && this.f18186s == t0Var.f18186s && this.f18187t == t0Var.f18187t && this.f18188u == t0Var.f18188u && this.f18189v == t0Var.f18189v && this.f18190w == t0Var.f18190w && br.l.a(this.f18191x, t0Var.f18191x) && br.l.a(this.f18192y, t0Var.f18192y) && br.l.a(this.f18193z, t0Var.f18193z) && br.l.a(this.A, t0Var.A) && br.l.a(this.B, t0Var.B) && br.l.a(this.C, t0Var.C);
    }

    @Override // vj.c
    public final long f() {
        return this.f18173d;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("throughput_server_response_min_latency", this.f18176g);
        jSONObject.put("throughput_server_response_max_latency", this.f18177h);
        jSONObject.put("throughput_server_response_avg_latency", this.f18178i);
        jSONObject.put("throughput_server_response_min_jitter", this.j);
        jSONObject.put("throughput_server_response_max_jitter", this.k);
        jSONObject.put("throughput_server_response_avg_jitter", this.f18179l);
        jSONObject.put("throughput_server_response_packets_sent", this.f18180m);
        jSONObject.put("throughput_server_response_packets_discarded", this.f18181n);
        jSONObject.put("throughput_server_response_packets_discard_percentage", this.f18182o);
        jSONObject.put("throughput_server_response_packets_lost", this.f18183p);
        jSONObject.put("throughput_server_response_packets_lost_percentage", this.f18184q);
        xu.d.Y(jSONObject, "throughput_server_response_test_server", this.f18185r);
        jSONObject.put("throughput_server_response_config_number_of_packets", this.f18186s);
        jSONObject.put("throughput_server_response_config_packet_size", this.f18187t);
        jSONObject.put("throughput_server_response_config_packet_delay", this.f18188u);
        jSONObject.put("throughput_server_response_test_status", this.f18189v);
        jSONObject.put("throughput_server_response_dns_lookup_time", this.f18190w);
        xu.d.Y(jSONObject, "throughput_server_response_sent_times", this.f18191x);
        xu.d.Y(jSONObject, "throughput_server_response_received_times", this.f18192y);
        xu.d.Y(jSONObject, "throughput_server_response_received_packets", this.f18193z);
        xu.d.Y(jSONObject, "throughput_server_response_events", this.A);
        xu.d.Y(jSONObject, "throughput_server_response_version", this.B);
        xu.d.Y(jSONObject, "throughput_server_response_verification_statuses", this.C);
    }

    public final int hashCode() {
        int iA = h0.b.a(this.f18184q, c7.a.C(this.f18183p, h0.b.a(this.f18182o, c7.a.C(this.f18181n, c7.a.C(this.f18180m, h0.b.a(this.f18179l, h0.b.a(this.k, h0.b.a(this.j, h0.b.a(this.f18178i, h0.b.a(this.f18177h, h0.b.a(this.f18176g, c7.a.g(this.f18175f, c7.a.g(this.f18174e, h0.b.b(c7.a.g(this.f18172c, h0.b.b(Long.hashCode(this.f18170a) * 31, 31, this.f18171b), 31), 31, this.f18173d), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str = this.f18185r;
        int iC = c7.a.C(this.f18190w, c7.a.C(this.f18189v, c7.a.C(this.f18188u, c7.a.C(this.f18187t, c7.a.C(this.f18186s, (iA + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31);
        String str2 = this.f18191x;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18192y;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18193z;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.B;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.C;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThroughputServerResponseJobResult(id=");
        sb2.append(this.f18170a);
        sb2.append(", taskId=");
        sb2.append(this.f18171b);
        sb2.append(", taskName=");
        sb2.append(this.f18172c);
        sb2.append(", timeOfResult=");
        sb2.append(this.f18173d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f18174e);
        sb2.append(", jobType=");
        sb2.append(this.f18175f);
        sb2.append(", minLatency=");
        sb2.append(this.f18176g);
        sb2.append(", maxLatency=");
        sb2.append(this.f18177h);
        sb2.append(", avgLatency=");
        sb2.append(this.f18178i);
        sb2.append(", minJitter=");
        sb2.append(this.j);
        sb2.append(", maxJitter=");
        sb2.append(this.k);
        sb2.append(", avgJitter=");
        sb2.append(this.f18179l);
        sb2.append(", packetsSent=");
        sb2.append(this.f18180m);
        sb2.append(", packetsDiscarded=");
        sb2.append(this.f18181n);
        sb2.append(", packetsDiscardPercent=");
        sb2.append(this.f18182o);
        sb2.append(", packetsLost=");
        sb2.append(this.f18183p);
        sb2.append(", packetsLostPercent=");
        sb2.append(this.f18184q);
        sb2.append(", testServer=");
        sb2.append(this.f18185r);
        sb2.append(", numberOfPackets=");
        sb2.append(this.f18186s);
        sb2.append(", packetSize=");
        sb2.append(this.f18187t);
        sb2.append(", packetDelay=");
        sb2.append(this.f18188u);
        sb2.append(", testStatus=");
        sb2.append(this.f18189v);
        sb2.append(", dnsLookupTime=");
        sb2.append(this.f18190w);
        sb2.append(", sentTimes=");
        sb2.append(this.f18191x);
        sb2.append(", receivedTimes=");
        sb2.append(this.f18192y);
        sb2.append(", receivedPackets=");
        sb2.append(this.f18193z);
        sb2.append(", events=");
        sb2.append(this.A);
        sb2.append(", version=");
        sb2.append(this.B);
        sb2.append(", verificationStatuses=");
        return h0.b.r(sb2, this.C, ')');
    }
}
