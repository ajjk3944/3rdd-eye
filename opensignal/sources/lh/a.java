package lh;

import br.l;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f15499a;

    /* renamed from: b, reason: collision with root package name */
    public final double f15500b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15501c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15502d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15503e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15504f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15505g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15506h;

    /* renamed from: i, reason: collision with root package name */
    public final String f15507i;
    public final String j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final List f15508l;

    /* renamed from: m, reason: collision with root package name */
    public final List f15509m;

    public a(double d6, double d10, String str, long j, int i10, int i11, int i12, int i13, String str2, String str3, String str4, List list, List list2) {
        this.f15499a = d6;
        this.f15500b = d10;
        this.f15501c = str;
        this.f15502d = j;
        this.f15503e = i10;
        this.f15504f = i11;
        this.f15505g = i12;
        this.f15506h = i13;
        this.f15507i = str2;
        this.j = str3;
        this.k = str4;
        this.f15508l = list;
        this.f15509m = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Double.compare(this.f15499a, aVar.f15499a) == 0 && Double.compare(this.f15500b, aVar.f15500b) == 0 && l.a(this.f15501c, aVar.f15501c) && this.f15502d == aVar.f15502d && this.f15503e == aVar.f15503e && this.f15504f == aVar.f15504f && this.f15505g == aVar.f15505g && this.f15506h == aVar.f15506h && l.a(this.f15507i, aVar.f15507i) && l.a(this.j, aVar.j) && l.a(this.k, aVar.k) && l.a(this.f15508l, aVar.f15508l) && l.a(this.f15509m, aVar.f15509m);
    }

    public final int hashCode() {
        int iA = h0.b.a(this.f15500b, Double.hashCode(this.f15499a) * 31, 31);
        String str = this.f15501c;
        int iC = c7.a.C(this.f15506h, c7.a.C(this.f15505g, c7.a.C(this.f15504f, c7.a.C(this.f15503e, h0.b.b((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f15502d), 31), 31), 31), 31);
        String str2 = this.f15507i;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f15508l;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f15509m;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThroughputDownloadTestResult(speed=");
        sb2.append(this.f15499a);
        sb2.append(", throughputAverage=");
        sb2.append(this.f15500b);
        sb2.append(", testServer=");
        sb2.append(this.f15501c);
        sb2.append(", testSize=");
        sb2.append(this.f15502d);
        sb2.append(", tpStatus=");
        sb2.append(this.f15503e);
        sb2.append(", dnsLookupTime=");
        sb2.append(this.f15504f);
        sb2.append(", ttfa=");
        sb2.append(this.f15505g);
        sb2.append(", ttfb=");
        sb2.append(this.f15506h);
        sb2.append(", diagnosticAws=");
        sb2.append(this.f15507i);
        sb2.append(", awsEdgeLocationDownload=");
        sb2.append(this.j);
        sb2.append(", awsXCacheDownload=");
        sb2.append(this.k);
        sb2.append(", samplingTimes=");
        sb2.append(this.f15508l);
        sb2.append(", samplingCumulativeBytes=");
        return h0.b.t(sb2, this.f15509m, ')');
    }
}
