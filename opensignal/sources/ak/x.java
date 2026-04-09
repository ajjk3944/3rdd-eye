package ak;

import java.util.List;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f759a;

    /* renamed from: b, reason: collision with root package name */
    public final List f760b;

    /* renamed from: c, reason: collision with root package name */
    public final int f761c;

    /* renamed from: d, reason: collision with root package name */
    public final long f762d;

    /* renamed from: e, reason: collision with root package name */
    public final int f763e;

    /* renamed from: f, reason: collision with root package name */
    public final int f764f;

    /* renamed from: g, reason: collision with root package name */
    public final String f765g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f766h;

    /* renamed from: i, reason: collision with root package name */
    public final int f767i;
    public final int j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f768l;

    /* renamed from: m, reason: collision with root package name */
    public final int f769m;

    /* renamed from: n, reason: collision with root package name */
    public final int f770n;

    /* renamed from: o, reason: collision with root package name */
    public final String f771o;

    /* renamed from: p, reason: collision with root package name */
    public final String f772p;

    /* renamed from: q, reason: collision with root package name */
    public final int f773q;

    /* renamed from: r, reason: collision with root package name */
    public final int f774r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f775s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f776t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f777u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f778v;

    /* renamed from: w, reason: collision with root package name */
    public final float f779w;

    /* renamed from: x, reason: collision with root package name */
    public final float f780x;

    public x(String str, List list, int i10, long j, int i11, int i12, String str2, boolean z10, int i13, int i14, int i15, int i16, int i17, int i18, String str3, String str4, int i19, int i20, boolean z11, boolean z12, boolean z13, boolean z14) {
        br.l.e(str, "testUrl");
        br.l.e(list, "testServers");
        br.l.e(str3, "tracerouteIpV4Mask");
        br.l.e(str4, "tracerouteIpV6Mask");
        this.f759a = str;
        this.f760b = list;
        this.f761c = i10;
        this.f762d = j;
        this.f763e = i11;
        this.f764f = i12;
        this.f765g = str2;
        this.f766h = z10;
        this.f767i = i13;
        this.j = i14;
        this.k = i15;
        this.f768l = i16;
        this.f769m = i17;
        this.f770n = i18;
        this.f771o = str3;
        this.f772p = str4;
        this.f773q = i19;
        this.f774r = i20;
        this.f775s = z11;
        this.f776t = z12;
        this.f777u = z13;
        this.f778v = z14;
        this.f779w = i12 / 1000.0f;
        this.f780x = i13 / 1000.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return br.l.a(this.f759a, xVar.f759a) && br.l.a(this.f760b, xVar.f760b) && this.f761c == xVar.f761c && this.f762d == xVar.f762d && this.f763e == xVar.f763e && this.f764f == xVar.f764f && br.l.a(this.f765g, xVar.f765g) && this.f766h == xVar.f766h && this.f767i == xVar.f767i && this.j == xVar.j && this.k == xVar.k && this.f768l == xVar.f768l && this.f769m == xVar.f769m && this.f770n == xVar.f770n && br.l.a(this.f771o, xVar.f771o) && br.l.a(this.f772p, xVar.f772p) && this.f773q == xVar.f773q && this.f774r == xVar.f774r && this.f775s == xVar.f775s && this.f776t == xVar.f776t && this.f777u == xVar.f777u && this.f778v == xVar.f778v;
    }

    public final int hashCode() {
        int iC = c7.a.C(this.f764f, c7.a.C(this.f763e, h0.b.b(c7.a.C(this.f761c, h0.b.c(this.f759a.hashCode() * 31, 31, this.f760b), 31), 31, this.f762d), 31), 31);
        String str = this.f765g;
        return Boolean.hashCode(this.f778v) + w.g.b(w.g.b(w.g.b(c7.a.C(this.f774r, c7.a.C(this.f773q, c7.a.g(this.f772p, c7.a.g(this.f771o, c7.a.C(this.f770n, c7.a.C(this.f769m, c7.a.C(this.f768l, c7.a.C(this.k, c7.a.C(this.j, c7.a.C(this.f767i, w.g.b((iC + (str == null ? 0 : str.hashCode())) * 31, this.f766h, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), this.f775s, 31), this.f776t, 31), this.f777u, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IcmpTestConfig(testUrl=");
        sb2.append(this.f759a);
        sb2.append(", testServers=");
        sb2.append(this.f760b);
        sb2.append(", testCount=");
        sb2.append(this.f761c);
        sb2.append(", testTimeoutMs=");
        sb2.append(this.f762d);
        sb2.append(", testSizeBytes=");
        sb2.append(this.f763e);
        sb2.append(", testPeriodMs=");
        sb2.append(this.f764f);
        sb2.append(", testArguments=");
        sb2.append(this.f765g);
        sb2.append(", tracerouteEnabled=");
        sb2.append(this.f766h);
        sb2.append(", tracerouteTestPeriodMs=");
        sb2.append(this.f767i);
        sb2.append(", tracerouteNodeTimeoutMs=");
        sb2.append(this.j);
        sb2.append(", tracerouteMaxHopCount=");
        sb2.append(this.k);
        sb2.append(", tracerouteTestTimeoutMs=");
        sb2.append(this.f768l);
        sb2.append(", tracerouteTestCount=");
        sb2.append(this.f769m);
        sb2.append(", tracerouteIpMaskHopCount=");
        sb2.append(this.f770n);
        sb2.append(", tracerouteIpV4Mask=");
        sb2.append(this.f771o);
        sb2.append(", tracerouteIpV6Mask=");
        sb2.append(this.f772p);
        sb2.append(", tracerouteFirstHopWifi=");
        sb2.append(this.f773q);
        sb2.append(", tracerouteFirstHopCellular=");
        sb2.append(this.f774r);
        sb2.append(", tracerouteInternalAddressForWifiEnabled=");
        sb2.append(this.f775s);
        sb2.append(", tracerouteInternalAddressForCellularEnabled=");
        sb2.append(this.f776t);
        sb2.append(", tracerouteRunOnResolvedIpAddress=");
        sb2.append(this.f777u);
        sb2.append(", tracerouteContinueOnDuplicateHops=");
        return c7.a.r(sb2, this.f778v, ')');
    }
}
