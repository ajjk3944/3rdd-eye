package lh;

import br.l;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f15530a;

    /* renamed from: b, reason: collision with root package name */
    public final double f15531b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15532c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15533d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15534e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15535f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15536g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15537h;

    /* renamed from: i, reason: collision with root package name */
    public final String f15538i;
    public final String j;
    public final List k;

    /* renamed from: l, reason: collision with root package name */
    public final List f15539l;

    public c(double d6, double d10, String str, long j, long j7, int i10, int i11, int i12, String str2, String str3, List list, List list2) {
        this.f15530a = d6;
        this.f15531b = d10;
        this.f15532c = str;
        this.f15533d = j;
        this.f15534e = j7;
        this.f15535f = i10;
        this.f15536g = i11;
        this.f15537h = i12;
        this.f15538i = str2;
        this.j = str3;
        this.k = list;
        this.f15539l = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Double.compare(this.f15530a, cVar.f15530a) == 0 && Double.compare(this.f15531b, cVar.f15531b) == 0 && l.a(this.f15532c, cVar.f15532c) && this.f15533d == cVar.f15533d && this.f15534e == cVar.f15534e && this.f15535f == cVar.f15535f && this.f15536g == cVar.f15536g && this.f15537h == cVar.f15537h && l.a(this.f15538i, cVar.f15538i) && l.a(this.j, cVar.j) && l.a(this.k, cVar.k) && l.a(this.f15539l, cVar.f15539l);
    }

    public final int hashCode() {
        int iA = h0.b.a(this.f15531b, Double.hashCode(this.f15530a) * 31, 31);
        String str = this.f15532c;
        int iC = c7.a.C(this.f15537h, c7.a.C(this.f15536g, c7.a.C(this.f15535f, h0.b.b(h0.b.b((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f15533d), 31, this.f15534e), 31), 31), 31);
        String str2 = this.f15538i;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.k;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f15539l;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThroughputUploadTestResult(speed=");
        sb2.append(this.f15530a);
        sb2.append(", throughputAverage=");
        sb2.append(this.f15531b);
        sb2.append(", testServer=");
        sb2.append(this.f15532c);
        sb2.append(", testServerTimestamp=");
        sb2.append(this.f15533d);
        sb2.append(", testSize=");
        sb2.append(this.f15534e);
        sb2.append(", testStatus=");
        sb2.append(this.f15535f);
        sb2.append(", dnsLookupTime=");
        sb2.append(this.f15536g);
        sb2.append(", ttfa=");
        sb2.append(this.f15537h);
        sb2.append(", awsDiagnostic=");
        sb2.append(this.f15538i);
        sb2.append(", awsEdgeLocation=");
        sb2.append(this.j);
        sb2.append(", samplingTimes=");
        sb2.append(this.k);
        sb2.append(", samplingCumulativeBytes=");
        return h0.b.t(sb2, this.f15539l, ')');
    }
}
