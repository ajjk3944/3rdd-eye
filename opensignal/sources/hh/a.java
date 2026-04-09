package hh;

import br.l;
import w.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f10751a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f10752b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f10753c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10754d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10755e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10756f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f10757g;

    /* renamed from: h, reason: collision with root package name */
    public final Double f10758h;

    /* renamed from: i, reason: collision with root package name */
    public final Double f10759i;
    public final Integer j;
    public final Integer k;

    /* renamed from: l, reason: collision with root package name */
    public final Double f10760l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f10761m;

    public a(Integer num, Integer num2, Integer num3, String str, int i10, String str2, Double d6, Double d10, Double d11, Integer num4, Integer num5, Double d12, Integer num6) {
        this.f10751a = num;
        this.f10752b = num2;
        this.f10753c = num3;
        this.f10754d = str;
        this.f10755e = i10;
        this.f10756f = str2;
        this.f10757g = d6;
        this.f10758h = d10;
        this.f10759i = d11;
        this.j = num4;
        this.k = num5;
        this.f10760l = d12;
        this.f10761m = num6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f10751a, aVar.f10751a) && l.a(this.f10752b, aVar.f10752b) && l.a(this.f10753c, aVar.f10753c) && l.a(this.f10754d, aVar.f10754d) && this.f10755e == aVar.f10755e && l.a(this.f10756f, aVar.f10756f) && l.a(this.f10757g, aVar.f10757g) && l.a(this.f10758h, aVar.f10758h) && l.a(this.f10759i, aVar.f10759i) && l.a(this.j, aVar.j) && l.a(this.k, aVar.k) && l.a(this.f10760l, aVar.f10760l) && l.a(this.f10761m, aVar.f10761m);
    }

    public final int hashCode() {
        Integer num = this.f10751a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10752b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10753c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f10754d;
        int iC = c7.a.C(this.f10755e, (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f10756f;
        int iHashCode4 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d6 = this.f10757g;
        int iHashCode5 = (iHashCode4 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d10 = this.f10758h;
        int iHashCode6 = (iHashCode5 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f10759i;
        int iHashCode7 = (iHashCode6 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Integer num4 = this.j;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.k;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Double d12 = this.f10760l;
        int iHashCode10 = (iHashCode9 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Integer num6 = this.f10761m;
        return iHashCode10 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IcmpPingTestResult(testCount=");
        sb2.append(this.f10751a);
        sb2.append(", testSize=");
        sb2.append(this.f10752b);
        sb2.append(", testInterval=");
        sb2.append(this.f10753c);
        sb2.append(", testArguments=");
        sb2.append(this.f10754d);
        sb2.append(", testStatus=");
        sb2.append(this.f10755e);
        sb2.append(", testServer=");
        sb2.append(this.f10756f);
        sb2.append(", latencyMax=");
        sb2.append(this.f10757g);
        sb2.append(", latencyMin=");
        sb2.append(this.f10758h);
        sb2.append(", latencyAverage=");
        sb2.append(this.f10759i);
        sb2.append(", packetSent=");
        sb2.append(this.j);
        sb2.append(", packetLost=");
        sb2.append(this.k);
        sb2.append(", packetLostPercentage=");
        sb2.append(this.f10760l);
        sb2.append(", bytesSent=");
        return g.i(sb2, this.f10761m, ')');
    }
}
