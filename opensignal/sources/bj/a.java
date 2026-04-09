package bj;

import br.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2770a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2771b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2772c;

    /* renamed from: d, reason: collision with root package name */
    public final nj.b f2773d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2774e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2775f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2776g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2777h;

    /* renamed from: i, reason: collision with root package name */
    public final long f2778i;
    public final long j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2779l;

    /* renamed from: m, reason: collision with root package name */
    public final long f2780m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2781n;

    public a(String str, int i10, int i11, nj.b bVar, long j, int i12, int i13, long j7, long j10, long j11, long j12, long j13, long j14, boolean z10) {
        l.e(str, "taskName");
        l.e(bVar, "networkGeneration");
        this.f2770a = str;
        this.f2771b = i10;
        this.f2772c = i11;
        this.f2773d = bVar;
        this.f2774e = j;
        this.f2775f = i12;
        this.f2776g = i13;
        this.f2777h = j7;
        this.f2778i = j10;
        this.j = j11;
        this.k = j12;
        this.f2779l = j13;
        this.f2780m = j14;
        this.f2781n = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f2770a, aVar.f2770a) && this.f2771b == aVar.f2771b && this.f2772c == aVar.f2772c && this.f2773d == aVar.f2773d && this.f2774e == aVar.f2774e && this.f2775f == aVar.f2775f && this.f2776g == aVar.f2776g && this.f2777h == aVar.f2777h && this.f2778i == aVar.f2778i && this.j == aVar.j && this.k == aVar.k && this.f2779l == aVar.f2779l && this.f2780m == aVar.f2780m && this.f2781n == aVar.f2781n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2781n) + h0.b.b(h0.b.b(h0.b.b(h0.b.b(h0.b.b(h0.b.b(c7.a.C(this.f2776g, c7.a.C(this.f2775f, h0.b.b((this.f2773d.hashCode() + c7.a.C(this.f2772c, c7.a.C(this.f2771b, this.f2770a.hashCode() * 31, 31), 31)) * 31, 31, this.f2774e), 31), 31), 31, this.f2777h), 31, this.f2778i), 31, this.j), 31, this.k), 31, this.f2779l), 31, this.f2780m);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TaskDataUsage(taskName=");
        sb2.append(this.f2770a);
        sb2.append(", networkType=");
        sb2.append(this.f2771b);
        sb2.append(", networkConnectionType=");
        sb2.append(this.f2772c);
        sb2.append(", networkGeneration=");
        sb2.append(this.f2773d);
        sb2.append(", collectionTime=");
        sb2.append(this.f2774e);
        sb2.append(", foregroundExecutionCount=");
        sb2.append(this.f2775f);
        sb2.append(", backgroundExecutionCount=");
        sb2.append(this.f2776g);
        sb2.append(", foregroundDataUsage=");
        sb2.append(this.f2777h);
        sb2.append(", backgroundDataUsage=");
        sb2.append(this.f2778i);
        sb2.append(", foregroundDownloadDataUsage=");
        sb2.append(this.j);
        sb2.append(", backgroundDownloadDataUsage=");
        sb2.append(this.k);
        sb2.append(", foregroundUploadDataUsage=");
        sb2.append(this.f2779l);
        sb2.append(", backgroundUploadDataUsage=");
        sb2.append(this.f2780m);
        sb2.append(", excludedFromSdkDataUsageLimits=");
        return c7.a.r(sb2, this.f2781n, ')');
    }
}
