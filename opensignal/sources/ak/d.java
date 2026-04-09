package ak;

import java.util.List;

/* loaded from: classes.dex */
public final class d {
    public final boolean A;
    public final boolean B;
    public final boolean C;

    /* renamed from: a, reason: collision with root package name */
    public final String f472a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f473b;

    /* renamed from: c, reason: collision with root package name */
    public final String f474c;

    /* renamed from: d, reason: collision with root package name */
    public final int f475d;

    /* renamed from: e, reason: collision with root package name */
    public final int f476e;

    /* renamed from: f, reason: collision with root package name */
    public final int f477f;

    /* renamed from: g, reason: collision with root package name */
    public final long f478g;

    /* renamed from: h, reason: collision with root package name */
    public final long f479h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f480i;
    public final boolean j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final int f481l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f482m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f483n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f484o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f485p;

    /* renamed from: q, reason: collision with root package name */
    public final int f486q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f487r;

    /* renamed from: s, reason: collision with root package name */
    public final int f488s;

    /* renamed from: t, reason: collision with root package name */
    public final List f489t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f490u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f491v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f492w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f493x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f494y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f495z;

    public d(String str, boolean z10, String str2, int i10, int i11, int i12, long j, long j7, boolean z11, boolean z12, boolean z13, int i13, boolean z14, boolean z15, boolean z16, boolean z17, int i14, boolean z18, int i15, List list, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27) {
        br.l.e(list, "devicesExcludedFromSentryLogging");
        this.f472a = str;
        this.f473b = z10;
        this.f474c = str2;
        this.f475d = i10;
        this.f476e = i11;
        this.f477f = i12;
        this.f478g = j;
        this.f479h = j7;
        this.f480i = z11;
        this.j = z12;
        this.k = z13;
        this.f481l = i13;
        this.f482m = z14;
        this.f483n = z15;
        this.f484o = z16;
        this.f485p = z17;
        this.f486q = i14;
        this.f487r = z18;
        this.f488s = i15;
        this.f489t = list;
        this.f490u = z19;
        this.f491v = z20;
        this.f492w = z21;
        this.f493x = z22;
        this.f494y = z23;
        this.f495z = z24;
        this.A = z25;
        this.B = z26;
        this.C = z27;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return br.l.a(this.f472a, dVar.f472a) && this.f473b == dVar.f473b && br.l.a(this.f474c, dVar.f474c) && this.f475d == dVar.f475d && this.f476e == dVar.f476e && this.f477f == dVar.f477f && this.f478g == dVar.f478g && this.f479h == dVar.f479h && this.f480i == dVar.f480i && this.j == dVar.j && this.k == dVar.k && this.f481l == dVar.f481l && this.f482m == dVar.f482m && this.f483n == dVar.f483n && this.f484o == dVar.f484o && this.f485p == dVar.f485p && this.f486q == dVar.f486q && this.f487r == dVar.f487r && this.f488s == dVar.f488s && br.l.a(this.f489t, dVar.f489t) && this.f490u == dVar.f490u && this.f491v == dVar.f491v && this.f492w == dVar.f492w && this.f493x == dVar.f493x && this.f494y == dVar.f494y && this.f495z == dVar.f495z && this.A == dVar.A && this.B == dVar.B && this.C == dVar.C;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.C) + w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(h0.b.c(c7.a.C(this.f488s, w.g.b(c7.a.C(this.f486q, w.g.b(w.g.b(w.g.b(w.g.b(c7.a.C(this.f481l, w.g.b(w.g.b(w.g.b(h0.b.b(h0.b.b(c7.a.C(this.f477f, c7.a.C(this.f476e, c7.a.C(this.f475d, c7.a.g(this.f474c, w.g.b(this.f472a.hashCode() * 31, this.f473b, 31), 31), 31), 31), 31), 31, this.f478g), 31, this.f479h), this.f480i, 31), this.j, 31), this.k, 31), 31), this.f482m, 31), this.f483n, 31), this.f484o, 31), this.f485p, 31), 31), this.f487r, 31), 31), 31, this.f489t), this.f490u, 31), this.f491v, 31), this.f492w, 31), this.f493x, 31), this.f494y, 31), this.f495z, 31), this.A, 31), this.B, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackgroundConfig(regexNrState=");
        sb2.append(this.f472a);
        sb2.append(", ipCollectionEnabled=");
        sb2.append(this.f473b);
        sb2.append(", ipLookupUrl=");
        sb2.append(this.f474c);
        sb2.append(", maxReportsPerUpload=");
        sb2.append(this.f475d);
        sb2.append(", targetDtDeltaInterval=");
        sb2.append(this.f476e);
        sb2.append(", cellInfoUpdaterMethod=");
        sb2.append(this.f477f);
        sb2.append(", ipFreshnessTimeMs=");
        sb2.append(this.f478g);
        sb2.append(", storeResultsForMaxMs=");
        sb2.append(this.f479h);
        sb2.append(", wifiIdentityCollectionEnabled=");
        sb2.append(this.f480i);
        sb2.append(", useTelephonyCallbackForApi31Plus=");
        sb2.append(this.j);
        sb2.append(", connectionTrackingEnabled=");
        sb2.append(this.k);
        sb2.append(", mmwaveDetectionMethod=");
        sb2.append(this.f481l);
        sb2.append(", loggingThreadFactoryEnabled=");
        sb2.append(this.f482m);
        sb2.append(", useFlagUpdateCurrentToCancelAlarms=");
        sb2.append(this.f483n);
        sb2.append(", connectionTrackingNrStatusEnabled=");
        sb2.append(this.f484o);
        sb2.append(", connectionLastTaskTimeEnabled=");
        sb2.append(this.f485p);
        sb2.append(", crashCatcherVersion=");
        sb2.append(this.f486q);
        sb2.append(", payloadEncryptionEnabled=");
        sb2.append(this.f487r);
        sb2.append(", dataSimDetectionMethod=");
        sb2.append(this.f488s);
        sb2.append(", devicesExcludedFromSentryLogging=");
        sb2.append(this.f489t);
        sb2.append(", monitorIsConnectedField=");
        sb2.append(this.f490u);
        sb2.append(", monitorNetworkState=");
        sb2.append(this.f491v);
        sb2.append(", useLongRunningPipeline=");
        sb2.append(this.f492w);
        sb2.append(", checkIsNetworkConnected=");
        sb2.append(this.f493x);
        sb2.append(", dualSimCoreCollectionEnabled=");
        sb2.append(this.f494y);
        sb2.append(", dnsServersObfuscationEnabled=");
        sb2.append(this.f495z);
        sb2.append(", shouldStopRunningJob=");
        sb2.append(this.A);
        sb2.append(", checkIsNetworkValidated=");
        sb2.append(this.B);
        sb2.append(", finishKeepAliveJobServiceAfterExecution=");
        return c7.a.r(sb2, this.C, ')');
    }
}
