package h2;

/* loaded from: classes.dex */
public final class c0 implements c {

    /* renamed from: a, reason: collision with root package name */
    public final r2.o f9787a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9788b;

    /* renamed from: c, reason: collision with root package name */
    public final k2.r f9789c;

    /* renamed from: d, reason: collision with root package name */
    public final k2.n f9790d;

    /* renamed from: e, reason: collision with root package name */
    public final k2.o f9791e;

    /* renamed from: f, reason: collision with root package name */
    public final k2.h f9792f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9793g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9794h;

    /* renamed from: i, reason: collision with root package name */
    public final r2.a f9795i;
    public final r2.p j;
    public final n2.b k;

    /* renamed from: l, reason: collision with root package name */
    public final long f9796l;

    /* renamed from: m, reason: collision with root package name */
    public final r2.l f9797m;

    /* renamed from: n, reason: collision with root package name */
    public final g1.h0 f9798n;

    /* renamed from: o, reason: collision with root package name */
    public final i1.c f9799o;

    public c0(long j, long j7, k2.r rVar, k2.n nVar, k2.o oVar, k2.h hVar, String str, long j10, r2.a aVar, r2.p pVar, n2.b bVar, long j11, r2.l lVar, g1.h0 h0Var) {
        this(j != 16 ? new r2.c(j) : r2.n.f21212a, j7, rVar, nVar, oVar, hVar, str, j10, aVar, pVar, bVar, j11, lVar, h0Var, (i1.c) null);
    }

    public final boolean a(c0 c0Var) {
        if (this == c0Var) {
            return true;
        }
        return t2.k.a(this.f9788b, c0Var.f9788b) && br.l.a(this.f9789c, c0Var.f9789c) && br.l.a(this.f9790d, c0Var.f9790d) && br.l.a(this.f9791e, c0Var.f9791e) && br.l.a(this.f9792f, c0Var.f9792f) && br.l.a(this.f9793g, c0Var.f9793g) && t2.k.a(this.f9794h, c0Var.f9794h) && br.l.a(this.f9795i, c0Var.f9795i) && br.l.a(this.j, c0Var.j) && br.l.a(this.k, c0Var.k) && g1.r.c(this.f9796l, c0Var.f9796l);
    }

    public final boolean b(c0 c0Var) {
        return br.l.a(this.f9787a, c0Var.f9787a) && br.l.a(this.f9797m, c0Var.f9797m) && br.l.a(this.f9798n, c0Var.f9798n) && br.l.a(this.f9799o, c0Var.f9799o);
    }

    public final c0 c(c0 c0Var) {
        if (c0Var == null) {
            return this;
        }
        r2.o oVar = c0Var.f9787a;
        return d0.a(this, oVar.b(), oVar.c(), oVar.a(), c0Var.f9788b, c0Var.f9789c, c0Var.f9790d, c0Var.f9791e, c0Var.f9792f, c0Var.f9793g, c0Var.f9794h, c0Var.f9795i, c0Var.j, c0Var.k, c0Var.f9796l, c0Var.f9797m, c0Var.f9798n, c0Var.f9799o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return a(c0Var) && b(c0Var);
    }

    public final int hashCode() {
        r2.o oVar = this.f9787a;
        long jB = oVar.b();
        int i10 = g1.r.f9270h;
        int iHashCode = Long.hashCode(jB) * 31;
        g1.f0 f0VarC = oVar.c();
        int iHashCode2 = (Float.hashCode(oVar.a()) + ((iHashCode + (f0VarC != null ? f0VarC.hashCode() : 0)) * 31)) * 31;
        t2.l[] lVarArr = t2.k.f22393b;
        int iB = h0.b.b(iHashCode2, 31, this.f9788b);
        k2.r rVar = this.f9789c;
        int i11 = (iB + (rVar != null ? rVar.f14004a : 0)) * 31;
        k2.n nVar = this.f9790d;
        int iHashCode3 = (i11 + (nVar != null ? Integer.hashCode(nVar.f13996a) : 0)) * 31;
        k2.o oVar2 = this.f9791e;
        int iHashCode4 = (iHashCode3 + (oVar2 != null ? Integer.hashCode(oVar2.f13997a) : 0)) * 31;
        k2.h hVar = this.f9792f;
        int iHashCode5 = (iHashCode4 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        String str = this.f9793g;
        int iB2 = h0.b.b((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f9794h);
        r2.a aVar = this.f9795i;
        int iHashCode6 = (iB2 + (aVar != null ? Float.hashCode(aVar.f21192a) : 0)) * 31;
        r2.p pVar = this.j;
        int iHashCode7 = (iHashCode6 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        n2.b bVar = this.k;
        int iB3 = h0.b.b((iHashCode7 + (bVar != null ? bVar.f17379a.hashCode() : 0)) * 31, 31, this.f9796l);
        r2.l lVar = this.f9797m;
        int i12 = (iB3 + (lVar != null ? lVar.f21210a : 0)) * 31;
        g1.h0 h0Var = this.f9798n;
        int iHashCode8 = (i12 + (h0Var != null ? h0Var.hashCode() : 0)) * 961;
        i1.c cVar = this.f9799o;
        return iHashCode8 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanStyle(color=");
        r2.o oVar = this.f9787a;
        sb2.append((Object) g1.r.i(oVar.b()));
        sb2.append(", brush=");
        sb2.append(oVar.c());
        sb2.append(", alpha=");
        sb2.append(oVar.a());
        sb2.append(", fontSize=");
        sb2.append((Object) t2.k.d(this.f9788b));
        sb2.append(", fontWeight=");
        sb2.append(this.f9789c);
        sb2.append(", fontStyle=");
        sb2.append(this.f9790d);
        sb2.append(", fontSynthesis=");
        sb2.append(this.f9791e);
        sb2.append(", fontFamily=");
        sb2.append(this.f9792f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(this.f9793g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) t2.k.d(this.f9794h));
        sb2.append(", baselineShift=");
        sb2.append(this.f9795i);
        sb2.append(", textGeometricTransform=");
        sb2.append(this.j);
        sb2.append(", localeList=");
        sb2.append(this.k);
        sb2.append(", background=");
        h0.b.A(this.f9796l, ", textDecoration=", sb2);
        sb2.append(this.f9797m);
        sb2.append(", shadow=");
        sb2.append(this.f9798n);
        sb2.append(", platformStyle=null, drawStyle=");
        sb2.append(this.f9799o);
        sb2.append(')');
        return sb2.toString();
    }

    public c0(r2.o oVar, long j, k2.r rVar, k2.n nVar, k2.o oVar2, k2.h hVar, String str, long j7, r2.a aVar, r2.p pVar, n2.b bVar, long j10, r2.l lVar, g1.h0 h0Var, i1.c cVar) {
        this.f9787a = oVar;
        this.f9788b = j;
        this.f9789c = rVar;
        this.f9790d = nVar;
        this.f9791e = oVar2;
        this.f9792f = hVar;
        this.f9793g = str;
        this.f9794h = j7;
        this.f9795i = aVar;
        this.j = pVar;
        this.k = bVar;
        this.f9796l = j10;
        this.f9797m = lVar;
        this.f9798n = h0Var;
        this.f9799o = cVar;
    }

    public c0(long j, long j7, k2.r rVar, k2.n nVar, k2.o oVar, k2.h hVar, String str, long j10, r2.a aVar, r2.p pVar, n2.b bVar, long j11, r2.l lVar, g1.h0 h0Var, int i10) {
        this((i10 & 1) != 0 ? g1.r.f9269g : j, (i10 & 2) != 0 ? t2.k.f22394c : j7, (i10 & 4) != 0 ? null : rVar, (i10 & 8) != 0 ? null : nVar, (i10 & 16) != 0 ? null : oVar, (i10 & 32) != 0 ? null : hVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? t2.k.f22394c : j10, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : pVar, (i10 & 1024) != 0 ? null : bVar, (i10 & 2048) != 0 ? g1.r.f9269g : j11, (i10 & 4096) != 0 ? null : lVar, (i10 & 8192) != 0 ? null : h0Var);
    }
}
