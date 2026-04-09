package rj;

import br.l;
import w.g;

/* loaded from: classes.dex */
public final class f {
    public final long A;
    public final boolean B;
    public final int C;
    public final String D;
    public final int E;
    public final String F;
    public final String G;
    public final boolean H;
    public final boolean I;

    /* renamed from: a, reason: collision with root package name */
    public final long f21591a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21592b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21593c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21594d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21595e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21596f;

    /* renamed from: g, reason: collision with root package name */
    public final long f21597g;

    /* renamed from: h, reason: collision with root package name */
    public final long f21598h;

    /* renamed from: i, reason: collision with root package name */
    public final int f21599i;
    public final String j;
    public final gk.f k;

    /* renamed from: l, reason: collision with root package name */
    public final long f21600l;

    /* renamed from: m, reason: collision with root package name */
    public final long f21601m;

    /* renamed from: n, reason: collision with root package name */
    public final long f21602n;

    /* renamed from: o, reason: collision with root package name */
    public final long f21603o;

    /* renamed from: p, reason: collision with root package name */
    public final int f21604p;

    /* renamed from: q, reason: collision with root package name */
    public final String f21605q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f21606r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f21607s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f21608t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f21609u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f21610v;

    /* renamed from: w, reason: collision with root package name */
    public final String f21611w;

    /* renamed from: x, reason: collision with root package name */
    public final String f21612x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f21613y;

    /* renamed from: z, reason: collision with root package name */
    public final long f21614z;

    public f(long j, String str, String str2, String str3, String str4, long j7, long j10, long j11, int i10, String str5, gk.f fVar, long j12, long j13, long j14, long j15, int i11, String str6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str7, String str8, boolean z15, long j16, long j17, boolean z16, int i12, String str9, int i13, String str10, String str11, boolean z17, boolean z18) {
        l.e(str, "name");
        l.e(str2, "dataEndpoint");
        l.e(str3, "executeTriggers");
        l.e(str4, "interruptionTriggers");
        l.e(str5, "jobs");
        l.e(fVar, "scheduleType");
        l.e(str6, "state");
        l.e(str7, "rescheduleOnFailFromThisJobOnwards");
        l.e(str8, "rescheduleOnInterruptFromThisJobOnwards");
        l.e(str9, "crossTaskDelayGroups");
        l.e(str10, "lastLocation");
        this.f21591a = j;
        this.f21592b = str;
        this.f21593c = str2;
        this.f21594d = str3;
        this.f21595e = str4;
        this.f21596f = j7;
        this.f21597g = j10;
        this.f21598h = j11;
        this.f21599i = i10;
        this.j = str5;
        this.k = fVar;
        this.f21600l = j12;
        this.f21601m = j13;
        this.f21602n = j14;
        this.f21603o = j15;
        this.f21604p = i11;
        this.f21605q = str6;
        this.f21606r = z10;
        this.f21607s = z11;
        this.f21608t = z12;
        this.f21609u = z13;
        this.f21610v = z14;
        this.f21611w = str7;
        this.f21612x = str8;
        this.f21613y = z15;
        this.f21614z = j16;
        this.A = j17;
        this.B = z16;
        this.C = i12;
        this.D = str9;
        this.E = i13;
        this.F = str10;
        this.G = str11;
        this.H = z17;
        this.I = z18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f21591a == fVar.f21591a && l.a(this.f21592b, fVar.f21592b) && l.a(this.f21593c, fVar.f21593c) && l.a(this.f21594d, fVar.f21594d) && l.a(this.f21595e, fVar.f21595e) && this.f21596f == fVar.f21596f && this.f21597g == fVar.f21597g && this.f21598h == fVar.f21598h && this.f21599i == fVar.f21599i && l.a(this.j, fVar.j) && this.k == fVar.k && this.f21600l == fVar.f21600l && this.f21601m == fVar.f21601m && this.f21602n == fVar.f21602n && this.f21603o == fVar.f21603o && this.f21604p == fVar.f21604p && l.a(this.f21605q, fVar.f21605q) && this.f21606r == fVar.f21606r && this.f21607s == fVar.f21607s && this.f21608t == fVar.f21608t && this.f21609u == fVar.f21609u && this.f21610v == fVar.f21610v && l.a(this.f21611w, fVar.f21611w) && l.a(this.f21612x, fVar.f21612x) && this.f21613y == fVar.f21613y && this.f21614z == fVar.f21614z && this.A == fVar.A && this.B == fVar.B && this.C == fVar.C && l.a(this.D, fVar.D) && this.E == fVar.E && l.a(this.F, fVar.F) && l.a(this.G, fVar.G) && this.H == fVar.H && this.I == fVar.I;
    }

    public final int hashCode() {
        int iG = c7.a.g(this.F, c7.a.C(this.E, c7.a.g(this.D, c7.a.C(this.C, g.b(h0.b.b(h0.b.b(g.b(c7.a.g(this.f21612x, c7.a.g(this.f21611w, g.b(g.b(g.b(g.b(g.b(c7.a.g(this.f21605q, c7.a.C(this.f21604p, h0.b.b(h0.b.b(h0.b.b(h0.b.b((this.k.hashCode() + c7.a.g(this.j, c7.a.C(this.f21599i, h0.b.b(h0.b.b(h0.b.b(c7.a.g(this.f21595e, c7.a.g(this.f21594d, c7.a.g(this.f21593c, c7.a.g(this.f21592b, Long.hashCode(this.f21591a) * 31, 31), 31), 31), 31), 31, this.f21596f), 31, this.f21597g), 31, this.f21598h), 31), 31)) * 31, 31, this.f21600l), 31, this.f21601m), 31, this.f21602n), 31, this.f21603o), 31), 31), this.f21606r, 31), this.f21607s, 31), this.f21608t, 31), this.f21609u, 31), this.f21610v, 31), 31), 31), this.f21613y, 31), 31, this.f21614z), 31, this.A), this.B, 31), 31), 31), 31), 31);
        String str = this.G;
        return Boolean.hashCode(this.I) + g.b((iG + (str == null ? 0 : str.hashCode())) * 31, this.H, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TaskTableRow(id=");
        sb2.append(this.f21591a);
        sb2.append(", name=");
        sb2.append(this.f21592b);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f21593c);
        sb2.append(", executeTriggers=");
        sb2.append(this.f21594d);
        sb2.append(", interruptionTriggers=");
        sb2.append(this.f21595e);
        sb2.append(", initialDelay=");
        sb2.append(this.f21596f);
        sb2.append(", repeatPeriod=");
        sb2.append(this.f21597g);
        sb2.append(", spacingDelay=");
        sb2.append(this.f21598h);
        sb2.append(", repeatCount=");
        sb2.append(this.f21599i);
        sb2.append(", jobs=");
        sb2.append(this.j);
        sb2.append(", scheduleType=");
        sb2.append(this.k);
        sb2.append(", timeAdded=");
        sb2.append(this.f21600l);
        sb2.append(", startingExecuteTime=");
        sb2.append(this.f21601m);
        sb2.append(", lastSuccessfulExecuteTime=");
        sb2.append(this.f21602n);
        sb2.append(", scheduleTime=");
        sb2.append(this.f21603o);
        sb2.append(", currentExecuteCount=");
        sb2.append(this.f21604p);
        sb2.append(", state=");
        sb2.append(this.f21605q);
        sb2.append(", rescheduleForTriggers=");
        sb2.append(this.f21606r);
        sb2.append(", manualExecution=");
        sb2.append(this.f21607s);
        sb2.append(", consentRequired=");
        sb2.append(this.f21608t);
        sb2.append(", isScheduledInPipeline=");
        sb2.append(this.f21609u);
        sb2.append(", isNetworkIntensive=");
        sb2.append(this.f21610v);
        sb2.append(", rescheduleOnFailFromThisJobOnwards=");
        sb2.append(this.f21611w);
        sb2.append(", rescheduleOnInterruptFromThisJobOnwards=");
        sb2.append(this.f21612x);
        sb2.append(", useCrossTaskDelay=");
        sb2.append(this.f21613y);
        sb2.append(", dataUsageLimitsKilobytes=");
        sb2.append(this.f21614z);
        sb2.append(", dataUsageLimitsDays=");
        sb2.append(this.A);
        sb2.append(", excludedFromSdkDataUsageLimits=");
        sb2.append(this.B);
        sb2.append(", dataUsageLimitsAppStatusMode=");
        sb2.append(this.C);
        sb2.append(", crossTaskDelayGroups=");
        sb2.append(this.D);
        sb2.append(", priority=");
        sb2.append(this.E);
        sb2.append(", lastLocation=");
        sb2.append(this.F);
        sb2.append(", wifiSsidRegex=");
        sb2.append(this.G);
        sb2.append(", savePartialJobsResults=");
        sb2.append(this.H);
        sb2.append(", shouldLogEvents=");
        return c7.a.r(sb2, this.I, ')');
    }
}
