package lh;

import br.l;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final double f15510a;

    /* renamed from: b, reason: collision with root package name */
    public final double f15511b;

    /* renamed from: c, reason: collision with root package name */
    public final double f15512c;

    /* renamed from: d, reason: collision with root package name */
    public final double f15513d;

    /* renamed from: e, reason: collision with root package name */
    public final double f15514e;

    /* renamed from: f, reason: collision with root package name */
    public final double f15515f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15516g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15517h;

    /* renamed from: i, reason: collision with root package name */
    public final double f15518i;
    public final int j;
    public final double k;

    /* renamed from: l, reason: collision with root package name */
    public final String f15519l;

    /* renamed from: m, reason: collision with root package name */
    public final int f15520m;

    /* renamed from: n, reason: collision with root package name */
    public final int f15521n;

    /* renamed from: o, reason: collision with root package name */
    public final int f15522o;

    /* renamed from: p, reason: collision with root package name */
    public final int f15523p;

    /* renamed from: q, reason: collision with root package name */
    public final int f15524q;

    /* renamed from: r, reason: collision with root package name */
    public final String f15525r;

    /* renamed from: s, reason: collision with root package name */
    public final String f15526s;

    /* renamed from: t, reason: collision with root package name */
    public final String f15527t;

    /* renamed from: u, reason: collision with root package name */
    public final List f15528u;

    /* renamed from: v, reason: collision with root package name */
    public final List f15529v;

    public b(double d6, double d10, double d11, double d12, double d13, double d14, int i10, int i11, double d15, int i12, double d16, String str, int i13, int i14, int i15, int i16, int i17, String str2, String str3, String str4, List list, List list2) {
        this.f15510a = d6;
        this.f15511b = d10;
        this.f15512c = d11;
        this.f15513d = d12;
        this.f15514e = d13;
        this.f15515f = d14;
        this.f15516g = i10;
        this.f15517h = i11;
        this.f15518i = d15;
        this.j = i12;
        this.k = d16;
        this.f15519l = str;
        this.f15520m = i13;
        this.f15521n = i14;
        this.f15522o = i15;
        this.f15523p = i16;
        this.f15524q = i17;
        this.f15525r = str2;
        this.f15526s = str3;
        this.f15527t = str4;
        this.f15528u = list;
        this.f15529v = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Double.compare(this.f15510a, bVar.f15510a) == 0 && Double.compare(this.f15511b, bVar.f15511b) == 0 && Double.compare(this.f15512c, bVar.f15512c) == 0 && Double.compare(this.f15513d, bVar.f15513d) == 0 && Double.compare(this.f15514e, bVar.f15514e) == 0 && Double.compare(this.f15515f, bVar.f15515f) == 0 && this.f15516g == bVar.f15516g && this.f15517h == bVar.f15517h && Double.compare(this.f15518i, bVar.f15518i) == 0 && this.j == bVar.j && Double.compare(this.k, bVar.k) == 0 && l.a(this.f15519l, bVar.f15519l) && this.f15520m == bVar.f15520m && this.f15521n == bVar.f15521n && this.f15522o == bVar.f15522o && this.f15523p == bVar.f15523p && this.f15524q == bVar.f15524q && l.a(this.f15525r, bVar.f15525r) && l.a(this.f15526s, bVar.f15526s) && l.a(this.f15527t, bVar.f15527t) && l.a(this.f15528u, bVar.f15528u) && l.a(this.f15529v, bVar.f15529v);
    }

    public final int hashCode() {
        int iA = h0.b.a(this.k, c7.a.C(this.j, h0.b.a(this.f15518i, c7.a.C(this.f15517h, c7.a.C(this.f15516g, h0.b.a(this.f15515f, h0.b.a(this.f15514e, h0.b.a(this.f15513d, h0.b.a(this.f15512c, h0.b.a(this.f15511b, Double.hashCode(this.f15510a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str = this.f15519l;
        int iC = c7.a.C(this.f15524q, c7.a.C(this.f15523p, c7.a.C(this.f15522o, c7.a.C(this.f15521n, c7.a.C(this.f15520m, (iA + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31);
        String str2 = this.f15525r;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f15526s;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f15527t;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f15528u;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f15529v;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThroughputServerResponseTestResult(minLatency=");
        sb2.append(this.f15510a);
        sb2.append(", maxLatency=");
        sb2.append(this.f15511b);
        sb2.append(", avgLatency=");
        sb2.append(this.f15512c);
        sb2.append(", minJitter=");
        sb2.append(this.f15513d);
        sb2.append(", maxJitter=");
        sb2.append(this.f15514e);
        sb2.append(", avgJitter=");
        sb2.append(this.f15515f);
        sb2.append(", packetsSent=");
        sb2.append(this.f15516g);
        sb2.append(", packetsDiscarded=");
        sb2.append(this.f15517h);
        sb2.append(", packetsDiscardPercent=");
        sb2.append(this.f15518i);
        sb2.append(", packetsLost=");
        sb2.append(this.j);
        sb2.append(", packetsLostPercent=");
        sb2.append(this.k);
        sb2.append(", testServer=");
        sb2.append(this.f15519l);
        sb2.append(", numberOfPackets=");
        sb2.append(this.f15520m);
        sb2.append(", packetSize=");
        sb2.append(this.f15521n);
        sb2.append(", packetDelay=");
        sb2.append(this.f15522o);
        sb2.append(", testStatus=");
        sb2.append(this.f15523p);
        sb2.append(", dnsLookupTime=");
        sb2.append(this.f15524q);
        sb2.append(", sentTimes=");
        sb2.append(this.f15525r);
        sb2.append(", receivedTimes=");
        sb2.append(this.f15526s);
        sb2.append(", receivedPacketsNumbers=");
        sb2.append(this.f15527t);
        sb2.append(", sentPacketBytesList=");
        sb2.append(this.f15528u);
        sb2.append(", receivedPacketBytesList=");
        return h0.b.t(sb2, this.f15529v, ')');
    }
}
