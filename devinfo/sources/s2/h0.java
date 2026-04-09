package s2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final h0 f33390d = new h0(0, null, 0, 0, 16777215);

    /* renamed from: a, reason: collision with root package name */
    public final a0 f33391a;

    /* renamed from: b, reason: collision with root package name */
    public final p f33392b;

    /* renamed from: c, reason: collision with root package name */
    public final s f33393c;

    public h0(a0 a0Var, p pVar, s sVar) {
        this.f33391a = a0Var;
        this.f33392b = pVar;
        this.f33393c = sVar;
    }

    public static h0 a(h0 h0Var, long j, v2.k kVar, v2.p pVar, long j8, long j9, c3.i iVar, int i4) {
        long jB = h0Var.f33391a.f33333a.b();
        long j10 = (i4 & 2) != 0 ? h0Var.f33391a.f33334b : j;
        v2.k kVar2 = (i4 & 4) != 0 ? h0Var.f33391a.f33335c : kVar;
        a0 a0Var = h0Var.f33391a;
        v2.i iVar2 = a0Var.f33336d;
        v2.j jVar = a0Var.f33337e;
        v2.p pVar2 = (i4 & 32) != 0 ? a0Var.f33338f : pVar;
        String str = a0Var.g;
        long j11 = (i4 & 128) != 0 ? a0Var.f33339h : j8;
        c3.a aVar = a0Var.f33340i;
        c3.p pVar3 = a0Var.j;
        y2.c cVar = a0Var.f33341k;
        long j12 = a0Var.f33342l;
        c3.l lVar = a0Var.f33343m;
        p1.i0 i0Var = a0Var.f33344n;
        r1.c cVar2 = a0Var.f33345o;
        p pVar4 = h0Var.f33392b;
        int i10 = pVar4.f33411a;
        int i11 = pVar4.f33412b;
        long j13 = (i4 & 131072) != 0 ? pVar4.f33413c : j9;
        c3.q qVar = pVar4.f33414d;
        s sVar = (i4 & 524288) != 0 ? h0Var.f33393c : s0.c.f33220a;
        return new h0(new a0(p1.s.c(jB, a0Var.f33333a.b()) ? a0Var.f33333a : jB != 16 ? new c3.c(jB) : c3.n.f2727a, j10, kVar2, iVar2, jVar, pVar2, str, j11, aVar, pVar3, cVar, j12, lVar, i0Var, cVar2), new p(i10, i11, j13, qVar, sVar != null ? sVar.f33423a : null, (i4 & 1048576) != 0 ? pVar4.f33416f : iVar, pVar4.g, pVar4.f33417h, pVar4.f33418i), sVar);
    }

    public static h0 d(h0 h0Var, long j, long j8, v2.k kVar, long j9, int i4, long j10, int i10) {
        long j11 = (i10 & 2) != 0 ? d3.n.f21971c : j8;
        v2.k kVar2 = (i10 & 4) != 0 ? null : kVar;
        long j12 = (i10 & 128) != 0 ? d3.n.f21971c : j9;
        long j13 = p1.s.f31018h;
        int i11 = (32768 & i10) != 0 ? 0 : i4;
        long j14 = (i10 & 131072) != 0 ? d3.n.f21971c : j10;
        a0 a0VarA = b0.a(h0Var.f33391a, j, null, Float.NaN, j11, kVar2, null, null, null, null, j12, null, null, null, j13, null, null, null);
        p pVarA = q.a(h0Var.f33392b, i11, 0, j14, null, null, null, 0, 0, null);
        return (h0Var.f33391a == a0VarA && h0Var.f33392b == pVarA) ? h0Var : new h0(a0VarA, pVarA);
    }

    public final long b() {
        return this.f33391a.f33333a.b();
    }

    public final h0 c(h0 h0Var) {
        return (h0Var == null || h0Var.equals(f33390d)) ? this : new h0(this.f33391a.c(h0Var.f33391a), this.f33392b.a(h0Var.f33392b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return nk.k.a(this.f33391a, h0Var.f33391a) && nk.k.a(this.f33392b, h0Var.f33392b) && nk.k.a(this.f33393c, h0Var.f33393c);
    }

    public final int hashCode() {
        int iHashCode = (this.f33392b.hashCode() + (this.f33391a.hashCode() * 31)) * 31;
        s sVar = this.f33393c;
        return iHashCode + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        sb2.append((Object) p1.s.i(b()));
        sb2.append(", brush=");
        a0 a0Var = this.f33391a;
        sb2.append(a0Var.f33333a.e());
        sb2.append(", alpha=");
        sb2.append(a0Var.f33333a.a());
        sb2.append(", fontSize=");
        sb2.append((Object) d3.n.e(a0Var.f33334b));
        sb2.append(", fontWeight=");
        sb2.append(a0Var.f33335c);
        sb2.append(", fontStyle=");
        sb2.append(a0Var.f33336d);
        sb2.append(", fontSynthesis=");
        sb2.append(a0Var.f33337e);
        sb2.append(", fontFamily=");
        sb2.append(a0Var.f33338f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(a0Var.g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) d3.n.e(a0Var.f33339h));
        sb2.append(", baselineShift=");
        sb2.append(a0Var.f33340i);
        sb2.append(", textGeometricTransform=");
        sb2.append(a0Var.j);
        sb2.append(", localeList=");
        sb2.append(a0Var.f33341k);
        sb2.append(", background=");
        a0.g.w(a0Var.f33342l, ", textDecoration=", sb2);
        sb2.append(a0Var.f33343m);
        sb2.append(", shadow=");
        sb2.append(a0Var.f33344n);
        sb2.append(", drawStyle=");
        sb2.append(a0Var.f33345o);
        sb2.append(", textAlign=");
        p pVar = this.f33392b;
        sb2.append((Object) c3.k.a(pVar.f33411a));
        sb2.append(", textDirection=");
        sb2.append((Object) c3.m.a(pVar.f33412b));
        sb2.append(", lineHeight=");
        sb2.append((Object) d3.n.e(pVar.f33413c));
        sb2.append(", textIndent=");
        sb2.append(pVar.f33414d);
        sb2.append(", platformStyle=");
        sb2.append(this.f33393c);
        sb2.append(", lineHeightStyle=");
        sb2.append(pVar.f33416f);
        sb2.append(", lineBreak=");
        sb2.append((Object) c3.e.a(pVar.g));
        sb2.append(", hyphens=");
        sb2.append((Object) c3.d.a(pVar.f33417h));
        sb2.append(", textMotion=");
        sb2.append(pVar.f33418i);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h0(a0 a0Var, p pVar) {
        a0Var.getClass();
        r rVar = pVar.f33415e;
        this(a0Var, pVar, rVar == null ? null : new s(rVar));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h0(long j, v2.k kVar, long j8, long j9, int i4) {
        long j10 = p1.s.f31018h;
        this(new a0(j10, (i4 & 2) != 0 ? d3.n.f21971c : j, (i4 & 4) != 0 ? null : kVar, null, null, (i4 & 32) != 0 ? null : v2.p.f35782a, null, (i4 & 128) != 0 ? d3.n.f21971c : j8, null, null, null, j10, null, null), new p(0, 0, (i4 & 131072) != 0 ? d3.n.f21971c : j9, null, null, null, 0, 0, null), null);
    }
}
