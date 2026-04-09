package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Yl extends C4631g6 {

    /* renamed from: d, reason: collision with root package name */
    public List f40435d;

    /* renamed from: e, reason: collision with root package name */
    public List f40436e;

    /* renamed from: f, reason: collision with root package name */
    public String f40437f;

    /* renamed from: g, reason: collision with root package name */
    public String f40438g;

    /* renamed from: h, reason: collision with root package name */
    public Map f40439h;
    public N3 i;

    /* renamed from: j, reason: collision with root package name */
    public List f40440j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f40441k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f40442l;

    /* renamed from: m, reason: collision with root package name */
    public String f40443m;

    /* renamed from: n, reason: collision with root package name */
    public long f40444n;

    /* renamed from: o, reason: collision with root package name */
    public final C5052wg f40445o;

    /* renamed from: p, reason: collision with root package name */
    public final Y7 f40446p;

    public Yl() {
        this(Ga.j().t(), new Y7());
    }

    public final long a(long j4) {
        if (this.f40444n == 0) {
            this.f40444n = j4;
        }
        return this.f40444n;
    }

    public final N3 c() {
        return this.i;
    }

    public final Map<String, String> d() {
        return this.f40439h;
    }

    public final String e() {
        return this.f40443m;
    }

    public final String f() {
        return this.f40437f;
    }

    public final long g() {
        return this.f40444n;
    }

    public final String h() {
        return this.f40438g;
    }

    public final List<String> i() {
        return this.f40440j;
    }

    public final C5052wg j() {
        return this.f40445o;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> k() {
        /*
            r9 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List r1 = r9.f40435d
            boolean r1 = io.appmetrica.analytics.impl.AbstractC4623fo.a(r1)
            if (r1 != 0) goto L12
            java.util.List r1 = r9.f40435d
            r0.addAll(r1)
        L12:
            java.util.List r1 = r9.f40436e
            boolean r1 = io.appmetrica.analytics.impl.AbstractC4623fo.a(r1)
            if (r1 != 0) goto L1f
            java.util.List r1 = r9.f40436e
            r0.addAll(r1)
        L1f:
            io.appmetrica.analytics.impl.Y7 r1 = r9.f40446p
            io.appmetrica.analytics.impl.Qm r1 = r1.f40408a
            java.lang.Object r1 = r1.a()
            java.lang.String[] r1 = (java.lang.String[]) r1
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L55
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r1.length
            r6 = r2
        L34:
            if (r6 >= r5) goto L4a
            r7 = r1[r6]
            if (r7 == 0) goto L41
            boolean r8 = y9.q.i0(r7)
            if (r8 != 0) goto L41
            goto L42
        L41:
            r7 = r3
        L42:
            if (r7 == 0) goto L47
            r4.add(r7)
        L47:
            int r6 = r6 + 1
            goto L34
        L4a:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L51
            goto L52
        L51:
            r4 = r3
        L52:
            if (r4 == 0) goto L55
            goto L73
        L55:
            java.lang.String[] r1 = io.appmetrica.analytics.BuildConfig.DEFAULT_HOSTS
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r1.length
        L5d:
            if (r2 >= r5) goto L73
            r6 = r1[r2]
            if (r6 == 0) goto L6a
            boolean r7 = y9.q.i0(r6)
            if (r7 != 0) goto L6a
            goto L6b
        L6a:
            r6 = r3
        L6b:
            if (r6 == 0) goto L70
            r4.add(r6)
        L70:
            int r2 = r2 + 1
            goto L5d
        L73:
            r0.addAll(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Yl.k():java.util.List");
    }

    public final List<String> l() {
        return this.f40436e;
    }

    public final List<String> m() {
        return this.f40435d;
    }

    public final boolean n() {
        return this.f40441k;
    }

    public final boolean o() {
        return this.f40442l;
    }

    @Override // io.appmetrica.analytics.impl.C4631g6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f40435d + ", mStartupHostsFromClient=" + this.f40436e + ", mDistributionReferrer='" + this.f40437f + "', mInstallReferrerSource='" + this.f40438g + "', mClidsFromClient=" + this.f40439h + ", mNewCustomHosts=" + this.f40440j + ", mHasNewCustomHosts=" + this.f40441k + ", mSuccessfulStartup=" + this.f40442l + ", mCountryInit='" + this.f40443m + "', mFirstStartupTime=" + this.f40444n + "} " + super.toString();
    }

    public Yl(C5052wg c5052wg, Y7 y72) {
        this.i = new N3(null, EnumC4685i8.f41060c);
        this.f40444n = 0L;
        this.f40445o = c5052wg;
        this.f40446p = y72;
    }

    public final void a(List<String> list) {
        this.f40440j = list;
    }

    public final void a(boolean z10) {
        this.f40441k = z10;
    }

    public final void a(String str) {
        this.f40443m = str;
    }
}
