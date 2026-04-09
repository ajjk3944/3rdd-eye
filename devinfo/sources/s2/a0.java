package s2;

import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final c3.o f33333a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33334b;

    /* renamed from: c, reason: collision with root package name */
    public final v2.k f33335c;

    /* renamed from: d, reason: collision with root package name */
    public final v2.i f33336d;

    /* renamed from: e, reason: collision with root package name */
    public final v2.j f33337e;

    /* renamed from: f, reason: collision with root package name */
    public final v2.p f33338f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final long f33339h;

    /* renamed from: i, reason: collision with root package name */
    public final c3.a f33340i;
    public final c3.p j;

    /* renamed from: k, reason: collision with root package name */
    public final y2.c f33341k;

    /* renamed from: l, reason: collision with root package name */
    public final long f33342l;

    /* renamed from: m, reason: collision with root package name */
    public final c3.l f33343m;

    /* renamed from: n, reason: collision with root package name */
    public final p1.i0 f33344n;

    /* renamed from: o, reason: collision with root package name */
    public final r1.c f33345o;

    public a0(long j, long j8, v2.k kVar, v2.i iVar, v2.j jVar, v2.p pVar, String str, long j9, c3.a aVar, c3.p pVar2, y2.c cVar, long j10, c3.l lVar, p1.i0 i0Var) {
        this(j != 16 ? new c3.c(j) : c3.n.f2727a, j8, kVar, iVar, jVar, pVar, str, j9, aVar, pVar2, cVar, j10, lVar, i0Var, (r1.c) null);
    }

    public final boolean a(a0 a0Var) {
        if (this == a0Var) {
            return true;
        }
        return d3.n.a(this.f33334b, a0Var.f33334b) && nk.k.a(this.f33335c, a0Var.f33335c) && nk.k.a(this.f33336d, a0Var.f33336d) && nk.k.a(this.f33337e, a0Var.f33337e) && nk.k.a(this.f33338f, a0Var.f33338f) && nk.k.a(this.g, a0Var.g) && d3.n.a(this.f33339h, a0Var.f33339h) && nk.k.a(this.f33340i, a0Var.f33340i) && nk.k.a(this.j, a0Var.j) && nk.k.a(this.f33341k, a0Var.f33341k) && p1.s.c(this.f33342l, a0Var.f33342l);
    }

    public final boolean b(a0 a0Var) {
        return nk.k.a(this.f33333a, a0Var.f33333a) && nk.k.a(this.f33343m, a0Var.f33343m) && nk.k.a(this.f33344n, a0Var.f33344n) && nk.k.a(this.f33345o, a0Var.f33345o);
    }

    public final a0 c(a0 a0Var) {
        if (a0Var == null) {
            return this;
        }
        c3.o oVar = a0Var.f33333a;
        return b0.a(this, oVar.b(), oVar.e(), oVar.a(), a0Var.f33334b, a0Var.f33335c, a0Var.f33336d, a0Var.f33337e, a0Var.f33338f, a0Var.g, a0Var.f33339h, a0Var.f33340i, a0Var.j, a0Var.f33341k, a0Var.f33342l, a0Var.f33343m, a0Var.f33344n, a0Var.f33345o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return a(a0Var) && b(a0Var);
    }

    public final int hashCode() {
        c3.o oVar = this.f33333a;
        long jB = oVar.b();
        int i4 = p1.s.f31019i;
        int iA = yj.q.a(jB) * 31;
        p1.z zVarE = oVar.e();
        int iD = (d3.n.d(this.f33334b) + ((Float.floatToIntBits(oVar.a()) + ((iA + (zVarE != null ? zVarE.hashCode() : 0)) * 31)) * 31)) * 31;
        v2.k kVar = this.f33335c;
        int i10 = (iD + (kVar != null ? kVar.f35780a : 0)) * 31;
        v2.i iVar = this.f33336d;
        int i11 = (i10 + (iVar != null ? iVar.f35774a : 0)) * 31;
        v2.j jVar = this.f33337e;
        int i12 = (i11 + (jVar != null ? jVar.f35775a : 0)) * 31;
        v2.p pVar = this.f33338f;
        int iHashCode = (i12 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        String str = this.g;
        int iD2 = (d3.n.d(this.f33339h) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        c3.a aVar = this.f33340i;
        int iFloatToIntBits = (iD2 + (aVar != null ? Float.floatToIntBits(aVar.f2702a) : 0)) * 31;
        c3.p pVar2 = this.j;
        int iHashCode2 = (iFloatToIntBits + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        y2.c cVar = this.f33341k;
        int iF = a0.g.f((iHashCode2 + (cVar != null ? cVar.f37320a.hashCode() : 0)) * 31, 31, this.f33342l);
        c3.l lVar = this.f33343m;
        int i13 = (iF + (lVar != null ? lVar.f2725a : 0)) * 31;
        p1.i0 i0Var = this.f33344n;
        int iHashCode3 = (i13 + (i0Var != null ? i0Var.hashCode() : 0)) * 961;
        r1.c cVar2 = this.f33345o;
        return iHashCode3 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanStyle(color=");
        c3.o oVar = this.f33333a;
        sb2.append((Object) p1.s.i(oVar.b()));
        sb2.append(", brush=");
        sb2.append(oVar.e());
        sb2.append(", alpha=");
        sb2.append(oVar.a());
        sb2.append(", fontSize=");
        sb2.append((Object) d3.n.e(this.f33334b));
        sb2.append(", fontWeight=");
        sb2.append(this.f33335c);
        sb2.append(", fontStyle=");
        sb2.append(this.f33336d);
        sb2.append(", fontSynthesis=");
        sb2.append(this.f33337e);
        sb2.append(", fontFamily=");
        sb2.append(this.f33338f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(this.g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) d3.n.e(this.f33339h));
        sb2.append(", baselineShift=");
        sb2.append(this.f33340i);
        sb2.append(", textGeometricTransform=");
        sb2.append(this.j);
        sb2.append(", localeList=");
        sb2.append(this.f33341k);
        sb2.append(", background=");
        a0.g.w(this.f33342l, ", textDecoration=", sb2);
        sb2.append(this.f33343m);
        sb2.append(", shadow=");
        sb2.append(this.f33344n);
        sb2.append(", platformStyle=null, drawStyle=");
        sb2.append(this.f33345o);
        sb2.append(')');
        return sb2.toString();
    }

    public a0(c3.o oVar, long j, v2.k kVar, v2.i iVar, v2.j jVar, v2.p pVar, String str, long j8, c3.a aVar, c3.p pVar2, y2.c cVar, long j9, c3.l lVar, p1.i0 i0Var, r1.c cVar2) {
        this.f33333a = oVar;
        this.f33334b = j;
        this.f33335c = kVar;
        this.f33336d = iVar;
        this.f33337e = jVar;
        this.f33338f = pVar;
        this.g = str;
        this.f33339h = j8;
        this.f33340i = aVar;
        this.j = pVar2;
        this.f33341k = cVar;
        this.f33342l = j9;
        this.f33343m = lVar;
        this.f33344n = i0Var;
        this.f33345o = cVar2;
    }

    public a0(long j, long j8, v2.k kVar, v2.i iVar, v2.j jVar, v2.p pVar, String str, long j9, c3.a aVar, c3.p pVar2, y2.c cVar, long j10, c3.l lVar, p1.i0 i0Var, int i4) {
        this((i4 & 1) != 0 ? p1.s.f31018h : j, (i4 & 2) != 0 ? d3.n.f21971c : j8, (i4 & 4) != 0 ? null : kVar, (i4 & 8) != 0 ? null : iVar, (i4 & 16) != 0 ? null : jVar, (i4 & 32) != 0 ? null : pVar, (i4 & 64) != 0 ? null : str, (i4 & 128) != 0 ? d3.n.f21971c : j9, (i4 & 256) != 0 ? null : aVar, (i4 & 512) != 0 ? null : pVar2, (i4 & Segment.SHARE_MINIMUM) != 0 ? null : cVar, (i4 & 2048) != 0 ? p1.s.f31018h : j10, (i4 & Buffer.SEGMENTING_THRESHOLD) != 0 ? null : lVar, (i4 & Segment.SIZE) != 0 ? null : i0Var);
    }
}
