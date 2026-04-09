package hh;

import br.l;
import w.g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f10781a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10782b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f10783c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f10784d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f10785e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f10786f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f10787g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f10788h;

    public c(Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.f10781a = num;
        this.f10782b = str;
        this.f10783c = num2;
        this.f10784d = num3;
        this.f10785e = num4;
        this.f10786f = num5;
        this.f10787g = num6;
        this.f10788h = num7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f10781a, cVar.f10781a) && l.a(this.f10782b, cVar.f10782b) && l.a(this.f10783c, cVar.f10783c) && l.a(this.f10784d, cVar.f10784d) && l.a(this.f10785e, cVar.f10785e) && l.a(this.f10786f, cVar.f10786f) && l.a(this.f10787g, cVar.f10787g) && l.a(this.f10788h, cVar.f10788h);
    }

    public final int hashCode() {
        Integer num = this.f10781a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f10782b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f10783c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10784d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10785e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f10786f;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f10787g;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f10788h;
        return iHashCode7 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IcmpTracerouteTestResult(tracerouteStatus=");
        sb2.append(this.f10781a);
        sb2.append(", tracerouteNodeInfo=");
        sb2.append(this.f10782b);
        sb2.append(", tracerouteTtl=");
        sb2.append(this.f10783c);
        sb2.append(", tracerouteConfigPacketDelay=");
        sb2.append(this.f10784d);
        sb2.append(", tracerouteConfigPacketCount=");
        sb2.append(this.f10785e);
        sb2.append(", tracerouteConfigMaxHopCount=");
        sb2.append(this.f10786f);
        sb2.append(", tracerouteConfigMaxNodeTimeout=");
        sb2.append(this.f10787g);
        sb2.append(", tracerouteConfigIpMaskCount=");
        return g.i(sb2, this.f10788h, ')');
    }
}
