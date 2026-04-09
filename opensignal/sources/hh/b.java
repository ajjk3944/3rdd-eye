package hh;

import br.l;
import w.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f10762a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f10763b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f10764c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10765d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10766e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10767f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f10768g;

    /* renamed from: h, reason: collision with root package name */
    public final Double f10769h;

    /* renamed from: i, reason: collision with root package name */
    public final Double f10770i;
    public final Integer j;
    public final Integer k;

    /* renamed from: l, reason: collision with root package name */
    public final Double f10771l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f10772m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f10773n;

    /* renamed from: o, reason: collision with root package name */
    public final String f10774o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f10775p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f10776q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f10777r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f10778s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f10779t;

    /* renamed from: u, reason: collision with root package name */
    public final Integer f10780u;

    public b(Integer num, Integer num2, Integer num3, String str, int i10, String str2, Double d6, Double d10, Double d11, Integer num4, Integer num5, Double d12, Integer num6, Integer num7, String str3, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13) {
        this.f10762a = num;
        this.f10763b = num2;
        this.f10764c = num3;
        this.f10765d = str;
        this.f10766e = i10;
        this.f10767f = str2;
        this.f10768g = d6;
        this.f10769h = d10;
        this.f10770i = d11;
        this.j = num4;
        this.k = num5;
        this.f10771l = d12;
        this.f10772m = num6;
        this.f10773n = num7;
        this.f10774o = str3;
        this.f10775p = num8;
        this.f10776q = num9;
        this.f10777r = num10;
        this.f10778s = num11;
        this.f10779t = num12;
        this.f10780u = num13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f10762a, bVar.f10762a) && l.a(this.f10763b, bVar.f10763b) && l.a(this.f10764c, bVar.f10764c) && l.a(this.f10765d, bVar.f10765d) && this.f10766e == bVar.f10766e && l.a(this.f10767f, bVar.f10767f) && l.a(this.f10768g, bVar.f10768g) && l.a(this.f10769h, bVar.f10769h) && l.a(this.f10770i, bVar.f10770i) && l.a(this.j, bVar.j) && l.a(this.k, bVar.k) && l.a(this.f10771l, bVar.f10771l) && l.a(this.f10772m, bVar.f10772m) && l.a(this.f10773n, bVar.f10773n) && l.a(this.f10774o, bVar.f10774o) && l.a(this.f10775p, bVar.f10775p) && l.a(this.f10776q, bVar.f10776q) && l.a(this.f10777r, bVar.f10777r) && l.a(this.f10778s, bVar.f10778s) && l.a(this.f10779t, bVar.f10779t) && l.a(this.f10780u, bVar.f10780u);
    }

    public final int hashCode() {
        Integer num = this.f10762a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10763b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10764c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f10765d;
        int iC = c7.a.C(this.f10766e, (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f10767f;
        int iHashCode4 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d6 = this.f10768g;
        int iHashCode5 = (iHashCode4 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d10 = this.f10769h;
        int iHashCode6 = (iHashCode5 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f10770i;
        int iHashCode7 = (iHashCode6 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Integer num4 = this.j;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.k;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Double d12 = this.f10771l;
        int iHashCode10 = (iHashCode9 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Integer num6 = this.f10772m;
        int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f10773n;
        int iHashCode12 = (iHashCode11 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str3 = this.f10774o;
        int iHashCode13 = (iHashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num8 = this.f10775p;
        int iHashCode14 = (iHashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f10776q;
        int iHashCode15 = (iHashCode14 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.f10777r;
        int iHashCode16 = (iHashCode15 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.f10778s;
        int iHashCode17 = (iHashCode16 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.f10779t;
        int iHashCode18 = (iHashCode17 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.f10780u;
        return iHashCode18 + (num13 != null ? num13.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IcmpTestResult(testCount=");
        sb2.append(this.f10762a);
        sb2.append(", testSize=");
        sb2.append(this.f10763b);
        sb2.append(", testInterval=");
        sb2.append(this.f10764c);
        sb2.append(", testArguments=");
        sb2.append(this.f10765d);
        sb2.append(", testStatus=");
        sb2.append(this.f10766e);
        sb2.append(", testServer=");
        sb2.append(this.f10767f);
        sb2.append(", latencyMax=");
        sb2.append(this.f10768g);
        sb2.append(", latencyMin=");
        sb2.append(this.f10769h);
        sb2.append(", latencyAverage=");
        sb2.append(this.f10770i);
        sb2.append(", packetSent=");
        sb2.append(this.j);
        sb2.append(", packetLost=");
        sb2.append(this.k);
        sb2.append(", packetLostPercentage=");
        sb2.append(this.f10771l);
        sb2.append(", bytesSent=");
        sb2.append(this.f10772m);
        sb2.append(", tracerouteStatus=");
        sb2.append(this.f10773n);
        sb2.append(", tracerouteNodeInfo=");
        sb2.append(this.f10774o);
        sb2.append(", tracerouteTtl=");
        sb2.append(this.f10775p);
        sb2.append(", tracerouteConfigPacketDelay=");
        sb2.append(this.f10776q);
        sb2.append(", tracerouteConfigPacketCount=");
        sb2.append(this.f10777r);
        sb2.append(", tracerouteConfigMaxHopCount=");
        sb2.append(this.f10778s);
        sb2.append(", tracerouteConfigMaxNodeTimeout=");
        sb2.append(this.f10779t);
        sb2.append(", tracerouteConfigIpMaskCount=");
        return g.i(sb2, this.f10780u, ')');
    }
}
