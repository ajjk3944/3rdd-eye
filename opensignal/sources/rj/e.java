package rj;

import br.l;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f21578a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21579b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21580c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21581d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21582e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21583f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21584g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21585h;

    /* renamed from: i, reason: collision with root package name */
    public final String f21586i;
    public final String j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final String f21587l;

    /* renamed from: m, reason: collision with root package name */
    public final String f21588m;

    /* renamed from: n, reason: collision with root package name */
    public final String f21589n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f21590o;

    public e(long j, String str, int i10, int i11, String str2, String str3, int i12, int i13, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10) {
        l.e(str, "taskName");
        l.e(str2, "networkGeneration");
        l.e(str3, "consumptionForDay");
        l.e(str4, "foregroundDataUsage");
        l.e(str5, "backgroundDataUsage");
        l.e(str6, "foregroundDownloadDataUsage");
        l.e(str7, "backgroundDownloadDataUsage");
        l.e(str8, "foregroundUploadDataUsage");
        l.e(str9, "backgroundUploadDataUsage");
        this.f21578a = j;
        this.f21579b = str;
        this.f21580c = i10;
        this.f21581d = i11;
        this.f21582e = str2;
        this.f21583f = str3;
        this.f21584g = i12;
        this.f21585h = i13;
        this.f21586i = str4;
        this.j = str5;
        this.k = str6;
        this.f21587l = str7;
        this.f21588m = str8;
        this.f21589n = str9;
        this.f21590o = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f21578a == eVar.f21578a && l.a(this.f21579b, eVar.f21579b) && this.f21580c == eVar.f21580c && this.f21581d == eVar.f21581d && l.a(this.f21582e, eVar.f21582e) && l.a(this.f21583f, eVar.f21583f) && this.f21584g == eVar.f21584g && this.f21585h == eVar.f21585h && l.a(this.f21586i, eVar.f21586i) && l.a(this.j, eVar.j) && l.a(this.k, eVar.k) && l.a(this.f21587l, eVar.f21587l) && l.a(this.f21588m, eVar.f21588m) && l.a(this.f21589n, eVar.f21589n) && this.f21590o == eVar.f21590o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21590o) + c7.a.g(this.f21589n, c7.a.g(this.f21588m, c7.a.g(this.f21587l, c7.a.g(this.k, c7.a.g(this.j, c7.a.g(this.f21586i, c7.a.C(this.f21585h, c7.a.C(this.f21584g, c7.a.g(this.f21583f, c7.a.g(this.f21582e, c7.a.C(this.f21581d, c7.a.C(this.f21580c, c7.a.g(this.f21579b, Long.hashCode(this.f21578a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TaskStatsTableRow(id=");
        sb2.append(this.f21578a);
        sb2.append(", taskName=");
        sb2.append(this.f21579b);
        sb2.append(", networkType=");
        sb2.append(this.f21580c);
        sb2.append(", networkConnectionType=");
        sb2.append(this.f21581d);
        sb2.append(", networkGeneration=");
        sb2.append(this.f21582e);
        sb2.append(", consumptionForDay=");
        sb2.append(this.f21583f);
        sb2.append(", foregroundExecutionCount=");
        sb2.append(this.f21584g);
        sb2.append(", backgroundExecutionCount=");
        sb2.append(this.f21585h);
        sb2.append(", foregroundDataUsage=");
        sb2.append(this.f21586i);
        sb2.append(", backgroundDataUsage=");
        sb2.append(this.j);
        sb2.append(", foregroundDownloadDataUsage=");
        sb2.append(this.k);
        sb2.append(", backgroundDownloadDataUsage=");
        sb2.append(this.f21587l);
        sb2.append(", foregroundUploadDataUsage=");
        sb2.append(this.f21588m);
        sb2.append(", backgroundUploadDataUsage=");
        sb2.append(this.f21589n);
        sb2.append(", excludedFromSdkDataUsageLimits=");
        return c7.a.r(sb2, this.f21590o, ')');
    }
}
