package ak;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f449a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f450b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f451c;

    /* renamed from: d, reason: collision with root package name */
    public final h1 f452d;

    /* renamed from: e, reason: collision with root package name */
    public final s0 f453e;

    /* renamed from: f, reason: collision with root package name */
    public final j1 f454f;

    /* renamed from: g, reason: collision with root package name */
    public final c1 f455g;

    /* renamed from: h, reason: collision with root package name */
    public final l f456h;

    /* renamed from: i, reason: collision with root package name */
    public final a1 f457i;
    public final q0 j;
    public final x k;

    /* renamed from: l, reason: collision with root package name */
    public final e f458l;

    /* renamed from: m, reason: collision with root package name */
    public final mj.e f459m;

    /* renamed from: n, reason: collision with root package name */
    public final l1 f460n;

    /* renamed from: o, reason: collision with root package name */
    public final c f461o;

    /* renamed from: p, reason: collision with root package name */
    public final p0 f462p;

    /* renamed from: q, reason: collision with root package name */
    public final d0 f463q;

    /* renamed from: r, reason: collision with root package name */
    public final v f464r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f465s;

    /* renamed from: t, reason: collision with root package name */
    public final n0 f466t;

    public c0(d dVar, a0 a0Var, f1 f1Var, h1 h1Var, s0 s0Var, j1 j1Var, c1 c1Var, l lVar, a1 a1Var, q0 q0Var, x xVar, e eVar, mj.e eVar2, l1 l1Var, c cVar, p0 p0Var, d0 d0Var, v vVar, e0 e0Var, n0 n0Var) {
        this.f449a = dVar;
        this.f450b = a0Var;
        this.f451c = f1Var;
        this.f452d = h1Var;
        this.f453e = s0Var;
        this.f454f = j1Var;
        this.f455g = c1Var;
        this.f456h = lVar;
        this.f457i = a1Var;
        this.j = q0Var;
        this.k = xVar;
        this.f458l = eVar;
        this.f459m = eVar2;
        this.f460n = l1Var;
        this.f461o = cVar;
        this.f462p = p0Var;
        this.f463q = d0Var;
        this.f464r = vVar;
        this.f465s = e0Var;
        this.f466t = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return br.l.a(this.f449a, c0Var.f449a) && br.l.a(this.f450b, c0Var.f450b) && br.l.a(this.f451c, c0Var.f451c) && br.l.a(this.f452d, c0Var.f452d) && br.l.a(this.f453e, c0Var.f453e) && br.l.a(this.f454f, c0Var.f454f) && br.l.a(this.f455g, c0Var.f455g) && br.l.a(this.f456h, c0Var.f456h) && br.l.a(this.f457i, c0Var.f457i) && br.l.a(this.j, c0Var.j) && br.l.a(this.k, c0Var.k) && br.l.a(this.f458l, c0Var.f458l) && br.l.a(this.f459m, c0Var.f459m) && br.l.a(this.f460n, c0Var.f460n) && br.l.a(this.f461o, c0Var.f461o) && br.l.a(this.f462p, c0Var.f462p) && br.l.a(this.f463q, c0Var.f463q) && br.l.a(this.f464r, c0Var.f464r) && br.l.a(this.f465s, c0Var.f465s) && br.l.a(this.f466t, c0Var.f466t);
    }

    public final int hashCode() {
        return this.f466t.f620a.hashCode() + ((this.f465s.hashCode() + h0.b.c((this.f463q.hashCode() + ((this.f462p.hashCode() + h0.b.c((this.f460n.hashCode() + ((this.f459m.hashCode() + ((this.f458l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.f457i.hashCode() + ((this.f456h.hashCode() + ((this.f455g.hashCode() + ((this.f454f.hashCode() + ((this.f453e.hashCode() + ((this.f452d.hashCode() + ((this.f451c.hashCode() + ((this.f450b.hashCode() + (this.f449a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f461o.f448a)) * 31)) * 31, 31, this.f464r.f734a)) * 31);
    }

    public final String toString() {
        return "MeasurementConfig(backgroundConfig=" + this.f449a + ", locationConfig=" + this.f450b + ", udpConfig=" + this.f451c + ", udpVerificationConfig=" + this.f452d + ", speedTestConfig=" + this.f453e + ", videoConfig=" + this.f454f + ", traceRouteConfig=" + this.f455g + ", dataLimitsConfig=" + this.f456h + ", throughputTestConfig=" + this.f457i + ", serverResponseTestConfig=" + this.j + ", icmpTestConfig=" + this.k + ", cellConfig=" + this.f458l + ", sdkDataUsageLimits=" + this.f459m + ", wifiScanConfig=" + this.f460n + ", assistantConfig=" + this.f461o + ", sdkInSdkConfig=" + this.f462p + ", mlvisConfig=" + this.f463q + ", httpHeadLatencyConfig=" + this.f464r + ", networkRestrictionsConfig=" + this.f465s + ", regionRestrictionsConfig=" + this.f466t + ')';
    }
}
