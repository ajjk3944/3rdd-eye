package ak;

import java.util.List;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f735a;

    /* renamed from: b, reason: collision with root package name */
    public final String f736b;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f737c;

    /* renamed from: d, reason: collision with root package name */
    public final List f738d;

    /* renamed from: e, reason: collision with root package name */
    public final List f739e;

    /* renamed from: f, reason: collision with root package name */
    public final List f740f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f741g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f742h;

    /* renamed from: i, reason: collision with root package name */
    public final String f743i;
    public final String j;
    public final c0 k;

    /* renamed from: l, reason: collision with root package name */
    public final hk.b f744l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f745m;

    /* renamed from: n, reason: collision with root package name */
    public final List f746n;

    /* renamed from: o, reason: collision with root package name */
    public final int f747o;

    /* renamed from: p, reason: collision with root package name */
    public final String f748p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f749q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f750r;

    public v0(String str, String str2, o0 o0Var, List list, boolean z10, int i10) {
        boolean z11 = (i10 & 64) != 0 ? false : z10;
        hk.b bVar = new hk.b(0L, 0L, hk.c.f10801a);
        mq.w wVar = mq.w.f16945a;
        this(str, str2, o0Var, list, wVar, wVar, z11, false, "", "", null, bVar, true, wVar, 0, null, true, false);
    }

    public static v0 a(v0 v0Var, String str, String str2, List list, int i10) {
        o0 o0Var = v0Var.f737c;
        List list2 = v0Var.f739e;
        List list3 = v0Var.f740f;
        boolean z10 = v0Var.f741g;
        boolean z11 = v0Var.f742h;
        String str3 = v0Var.f743i;
        String str4 = v0Var.j;
        c0 c0Var = v0Var.k;
        hk.b bVar = v0Var.f744l;
        boolean z12 = (i10 & 4096) != 0 ? v0Var.f745m : true;
        List list4 = v0Var.f746n;
        int i11 = v0Var.f747o;
        String str5 = v0Var.f748p;
        boolean z13 = v0Var.f749q;
        boolean z14 = v0Var.f750r;
        br.l.e(o0Var, "schedule");
        br.l.e(list2, "executionTriggers");
        br.l.e(list3, "interruptionTriggers");
        br.l.e(str3, "rescheduleOnFailFromThisJobOnwards");
        br.l.e(str4, "rescheduleOnInterruptFromThisJobOnwards");
        br.l.e(bVar, "dataUsageLimits");
        br.l.e(list4, "crossTaskDelayGroups");
        return new v0(str, str2, o0Var, list, list2, list3, z10, z11, str3, str4, c0Var, bVar, z12, list4, i11, str5, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return br.l.a(this.f735a, v0Var.f735a) && br.l.a(this.f736b, v0Var.f736b) && br.l.a(this.f737c, v0Var.f737c) && br.l.a(this.f738d, v0Var.f738d) && br.l.a(this.f739e, v0Var.f739e) && br.l.a(this.f740f, v0Var.f740f) && this.f741g == v0Var.f741g && this.f742h == v0Var.f742h && br.l.a(this.f743i, v0Var.f743i) && br.l.a(this.j, v0Var.j) && br.l.a(this.k, v0Var.k) && br.l.a(this.f744l, v0Var.f744l) && this.f745m == v0Var.f745m && br.l.a(this.f746n, v0Var.f746n) && this.f747o == v0Var.f747o && br.l.a(this.f748p, v0Var.f748p) && this.f749q == v0Var.f749q && this.f750r == v0Var.f750r;
    }

    public final int hashCode() {
        int iG = c7.a.g(this.j, c7.a.g(this.f743i, w.g.b(w.g.b(h0.b.c(h0.b.c(h0.b.c((this.f737c.hashCode() + c7.a.g(this.f736b, this.f735a.hashCode() * 31, 31)) * 31, 31, this.f738d), 31, this.f739e), 31, this.f740f), this.f741g, 31), this.f742h, 31), 31), 31);
        c0 c0Var = this.k;
        int iC = c7.a.C(this.f747o, h0.b.c(w.g.b((this.f744l.hashCode() + ((iG + (c0Var == null ? 0 : c0Var.hashCode())) * 31)) * 31, this.f745m, 31), 31, this.f746n), 31);
        String str = this.f748p;
        return Boolean.hashCode(this.f750r) + w.g.b((iC + (str != null ? str.hashCode() : 0)) * 31, this.f749q, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TaskItemConfig(name=");
        sb2.append(this.f735a);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f736b);
        sb2.append(", schedule=");
        sb2.append(this.f737c);
        sb2.append(", jobs=");
        sb2.append(this.f738d);
        sb2.append(", executionTriggers=");
        sb2.append(this.f739e);
        sb2.append(", interruptionTriggers=");
        sb2.append(this.f740f);
        sb2.append(", isNetworkIntensive=");
        sb2.append(this.f741g);
        sb2.append(", useCrossTaskDelay=");
        sb2.append(this.f742h);
        sb2.append(", rescheduleOnFailFromThisJobOnwards=");
        sb2.append(this.f743i);
        sb2.append(", rescheduleOnInterruptFromThisJobOnwards=");
        sb2.append(this.j);
        sb2.append(", measurementConfig=");
        sb2.append(this.k);
        sb2.append(", dataUsageLimits=");
        sb2.append(this.f744l);
        sb2.append(", excludedFromSdkDataUsageLimits=");
        sb2.append(this.f745m);
        sb2.append(", crossTaskDelayGroups=");
        sb2.append(this.f746n);
        sb2.append(", priority=");
        sb2.append(this.f747o);
        sb2.append(", wifiSsidRegex=");
        sb2.append(this.f748p);
        sb2.append(", savePartialJobsResults=");
        sb2.append(this.f749q);
        sb2.append(", shouldLogEvents=");
        return c7.a.r(sb2, this.f750r, ')');
    }

    public v0(String str, String str2, o0 o0Var, List list, List list2, List list3, boolean z10, boolean z11, String str3, String str4, c0 c0Var, hk.b bVar, boolean z12, List list4, int i10, String str5, boolean z13, boolean z14) {
        this.f735a = str;
        this.f736b = str2;
        this.f737c = o0Var;
        this.f738d = list;
        this.f739e = list2;
        this.f740f = list3;
        this.f741g = z10;
        this.f742h = z11;
        this.f743i = str3;
        this.j = str4;
        this.k = c0Var;
        this.f744l = bVar;
        this.f745m = z12;
        this.f746n = list4;
        this.f747o = i10;
        this.f748p = str5;
        this.f749q = z13;
        this.f750r = z14;
    }
}
