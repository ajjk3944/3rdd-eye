package rj;

import br.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f21557a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21558b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21559c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21560d;

    /* renamed from: e, reason: collision with root package name */
    public final double f21561e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21562f;

    /* renamed from: g, reason: collision with root package name */
    public final double f21563g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21564h;

    /* renamed from: i, reason: collision with root package name */
    public final double f21565i;
    public final int j;
    public final double k;

    /* renamed from: l, reason: collision with root package name */
    public final double f21566l;

    /* renamed from: m, reason: collision with root package name */
    public final double f21567m;

    /* renamed from: n, reason: collision with root package name */
    public final int f21568n;

    /* renamed from: o, reason: collision with root package name */
    public final int f21569o;

    /* renamed from: p, reason: collision with root package name */
    public final double f21570p;

    /* renamed from: q, reason: collision with root package name */
    public final double f21571q;

    /* renamed from: r, reason: collision with root package name */
    public final int f21572r;

    /* renamed from: s, reason: collision with root package name */
    public final String f21573s;

    /* renamed from: t, reason: collision with root package name */
    public final long f21574t;

    /* renamed from: u, reason: collision with root package name */
    public final String f21575u;

    /* renamed from: v, reason: collision with root package name */
    public final String f21576v;

    /* renamed from: w, reason: collision with root package name */
    public final int f21577w;

    public d(long j, String str, long j7, int i10, double d6, int i11, double d10, int i12, double d11, int i13, double d12, double d13, double d14, int i14, int i15, double d15, double d16, int i16, String str2, long j10, String str3, String str4, int i17) {
        l.e(str, "taskName");
        this.f21557a = j;
        this.f21558b = str;
        this.f21559c = j7;
        this.f21560d = i10;
        this.f21561e = d6;
        this.f21562f = i11;
        this.f21563g = d10;
        this.f21564h = i12;
        this.f21565i = d11;
        this.j = i13;
        this.k = d12;
        this.f21566l = d13;
        this.f21567m = d14;
        this.f21568n = i14;
        this.f21569o = i15;
        this.f21570p = d15;
        this.f21571q = d16;
        this.f21572r = i16;
        this.f21573s = str2;
        this.f21574t = j10;
        this.f21575u = str3;
        this.f21576v = str4;
        this.f21577w = i17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f21557a == dVar.f21557a && l.a(this.f21558b, dVar.f21558b) && this.f21559c == dVar.f21559c && this.f21560d == dVar.f21560d && Double.compare(this.f21561e, dVar.f21561e) == 0 && this.f21562f == dVar.f21562f && Double.compare(this.f21563g, dVar.f21563g) == 0 && this.f21564h == dVar.f21564h && Double.compare(this.f21565i, dVar.f21565i) == 0 && this.j == dVar.j && Double.compare(this.k, dVar.k) == 0 && Double.compare(this.f21566l, dVar.f21566l) == 0 && Double.compare(this.f21567m, dVar.f21567m) == 0 && this.f21568n == dVar.f21568n && this.f21569o == dVar.f21569o && Double.compare(this.f21570p, dVar.f21570p) == 0 && Double.compare(this.f21571q, dVar.f21571q) == 0 && this.f21572r == dVar.f21572r && l.a(this.f21573s, dVar.f21573s) && this.f21574t == dVar.f21574t && l.a(this.f21575u, dVar.f21575u) && l.a(this.f21576v, dVar.f21576v) && this.f21577w == dVar.f21577w;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21577w) + c7.a.g(this.f21576v, c7.a.g(this.f21575u, h0.b.b(c7.a.g(this.f21573s, c7.a.C(this.f21572r, h0.b.a(this.f21571q, h0.b.a(this.f21570p, c7.a.C(this.f21569o, c7.a.C(this.f21568n, h0.b.a(this.f21567m, h0.b.a(this.f21566l, h0.b.a(this.k, c7.a.C(this.j, h0.b.a(this.f21565i, c7.a.C(this.f21564h, h0.b.a(this.f21563g, c7.a.C(this.f21562f, h0.b.a(this.f21561e, c7.a.C(this.f21560d, h0.b.b(c7.a.g(this.f21558b, Long.hashCode(this.f21557a) * 31, 31), 31, this.f21559c), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.f21574t), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QosTableRow(id=");
        sb2.append(this.f21557a);
        sb2.append(", taskName=");
        sb2.append(this.f21558b);
        sb2.append(", executionDate=");
        sb2.append(this.f21559c);
        sb2.append(", connectionType=");
        sb2.append(this.f21560d);
        sb2.append(", download=");
        sb2.append(this.f21561e);
        sb2.append(", downloadTestStatus=");
        sb2.append(this.f21562f);
        sb2.append(", upload=");
        sb2.append(this.f21563g);
        sb2.append(", uploadTestStatus=");
        sb2.append(this.f21564h);
        sb2.append(", latency=");
        sb2.append(this.f21565i);
        sb2.append(", latencyTestStatus=");
        sb2.append(this.j);
        sb2.append(", jitter=");
        sb2.append(this.k);
        sb2.append(", packetDiscard=");
        sb2.append(this.f21566l);
        sb2.append(", icmp=");
        sb2.append(this.f21567m);
        sb2.append(", icmpTestStatus=");
        sb2.append(this.f21568n);
        sb2.append(", rssi=");
        sb2.append(this.f21569o);
        sb2.append(", lat=");
        sb2.append(this.f21570p);
        sb2.append(", lng=");
        sb2.append(this.f21571q);
        sb2.append(", qosTestType=");
        sb2.append(this.f21572r);
        sb2.append(", connectionId=");
        sb2.append(this.f21573s);
        sb2.append(", connectionStartDate=");
        sb2.append(this.f21574t);
        sb2.append(", connectionSsid=");
        sb2.append(this.f21575u);
        sb2.append(", connectionAccessPoint=");
        sb2.append(this.f21576v);
        sb2.append(", connectionTechnology=");
        return c7.a.q(sb2, this.f21577w, ')');
    }
}
