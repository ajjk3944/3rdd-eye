package o0;

import d3.l;
import je.u;
import nk.k;
import s2.h0;
import s2.o;
import s2.z;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f30320a;

    /* renamed from: b, reason: collision with root package name */
    public h0 f30321b;

    /* renamed from: c, reason: collision with root package name */
    public v2.d f30322c;

    /* renamed from: d, reason: collision with root package name */
    public int f30323d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30324e;

    /* renamed from: f, reason: collision with root package name */
    public int f30325f;
    public int g;

    /* renamed from: i, reason: collision with root package name */
    public d3.c f30327i;
    public s2.a j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f30328k;

    /* renamed from: l, reason: collision with root package name */
    public long f30329l;

    /* renamed from: m, reason: collision with root package name */
    public b f30330m;

    /* renamed from: n, reason: collision with root package name */
    public o f30331n;

    /* renamed from: o, reason: collision with root package name */
    public l f30332o;

    /* renamed from: s, reason: collision with root package name */
    public long f30336s;

    /* renamed from: h, reason: collision with root package name */
    public long f30326h = a.f30309a;

    /* renamed from: p, reason: collision with root package name */
    public long f30333p = d3.b.g(0, 0, 0, 0);

    /* renamed from: q, reason: collision with root package name */
    public int f30334q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f30335r = -1;

    public d(String str, h0 h0Var, v2.d dVar, int i4, boolean z3, int i10, int i11) {
        this.f30320a = str;
        this.f30321b = h0Var;
        this.f30322c = dVar;
        this.f30323d = i4;
        this.f30324e = z3;
        this.f30325f = i10;
        this.g = i11;
        long j = 0;
        this.f30329l = (j & 4294967295L) | (j << 32);
    }

    public static long f(d dVar, long j, l lVar) {
        int i4;
        h0 h0Var = dVar.f30321b;
        b bVar = dVar.f30330m;
        d3.c cVar = dVar.f30327i;
        k.b(cVar);
        v2.d dVar2 = dVar.f30322c;
        if ((bVar == null || lVar != bVar.f30312a || !z.e(h0Var, lVar).equals(bVar.f30313b) || cVar.a() != bVar.f30314c.f21952a || dVar2 != bVar.f30315d) && ((bVar = b.f30311h) == null || lVar != bVar.f30312a || !z.e(h0Var, lVar).equals(bVar.f30313b) || cVar.a() != bVar.f30314c.f21952a || dVar2 != bVar.f30315d)) {
            bVar = new b(lVar, z.e(h0Var, lVar), new d3.d(cVar.a(), cVar.F()), dVar2);
            b.f30311h = bVar;
        }
        dVar.f30330m = bVar;
        int i10 = dVar.g;
        d3.d dVar3 = bVar.f30314c;
        float f10 = bVar.g;
        float f11 = bVar.f30317f;
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            float fB = z.a(c.f30318a, bVar.f30316e, d3.b.b(0, 0, 15), dVar3, bVar.f30315d, 1).b();
            float fB2 = z.a(c.f30319b, bVar.f30316e, d3.b.b(0, 0, 15), dVar3, bVar.f30315d, 2).b() - fB;
            bVar.g = fB;
            bVar.f30317f = fB2;
            f11 = fB2;
            f10 = fB;
        }
        if (i10 != 1) {
            int iRound = Math.round((f11 * (i10 - 1)) + f10);
            i4 = iRound >= 0 ? iRound : 0;
            int iG = d3.a.g(j);
            if (i4 > iG) {
                i4 = iG;
            }
        } else {
            i4 = d3.a.i(j);
        }
        return d3.b.a(d3.a.j(j), d3.a.h(j), i4, d3.a.g(j));
    }

    public final int a(int i4, l lVar) {
        int i10 = this.f30334q;
        int i11 = this.f30335r;
        if (i4 == i10 && i10 != -1) {
            return i11;
        }
        long jA = d3.b.a(0, i4, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = f(this, jA, lVar);
        }
        o oVarE = e(lVar);
        long jK = a.a.k(jA, this.f30324e, this.f30323d, oVarE.m());
        boolean z3 = this.f30324e;
        int i12 = this.f30323d;
        int i13 = this.f30325f;
        int iF = com.bumptech.glide.d.f(new s2.a((z2.c) oVarE, ((z3 || !(i12 == 2 || i12 == 4 || i12 == 5)) && i13 >= 1) ? i13 : 1, i12, jK).b());
        int i14 = d3.a.i(jA);
        if (iF < i14) {
            iF = i14;
        }
        this.f30334q = i4;
        this.f30335r = iF;
        return iF;
    }

    public final boolean b(long j, l lVar) {
        o oVar;
        this.f30336s = (this.f30336s << 2) | 3;
        boolean z3 = true;
        long jF = this.g > 1 ? f(this, j, lVar) : j;
        s2.a aVar = this.j;
        boolean z10 = false;
        if (aVar != null && (oVar = this.f30331n) != null && !oVar.b() && lVar == this.f30332o && (d3.a.b(jF, this.f30333p) || (d3.a.h(jF) == d3.a.h(this.f30333p) && d3.a.j(jF) == d3.a.j(this.f30333p) && d3.a.g(jF) >= aVar.b() && !aVar.f33330d.f34143d))) {
            if (!d3.a.b(jF, this.f30333p)) {
                s2.a aVar2 = this.j;
                k.b(aVar2);
                this.f30329l = d3.b.d(jF, (com.bumptech.glide.d.f(Math.min(aVar2.f33327a.f37848i.c(), aVar2.c())) << 32) | (com.bumptech.glide.d.f(aVar2.b()) & 4294967295L));
                if (this.f30323d == 3 || (((int) (r12 >> 32)) >= aVar2.c() && ((int) (4294967295L & r12)) >= aVar2.b())) {
                    z3 = false;
                }
                this.f30328k = z3;
                this.f30333p = jF;
            }
            return false;
        }
        o oVarE = e(lVar);
        long jK = a.a.k(jF, this.f30324e, this.f30323d, oVarE.m());
        boolean z11 = this.f30324e;
        int i4 = this.f30323d;
        int i10 = this.f30325f;
        s2.a aVar3 = new s2.a((z2.c) oVarE, ((z11 || !(i4 == 2 || i4 == 4 || i4 == 5)) && i10 >= 1) ? i10 : 1, i4, jK);
        this.f30333p = jF;
        this.f30329l = d3.b.d(jF, (com.bumptech.glide.d.f(aVar3.b()) & 4294967295L) | (com.bumptech.glide.d.f(aVar3.c()) << 32));
        if (this.f30323d != 3 && (((int) (r1 >> 32)) < aVar3.c() || ((int) (r1 & 4294967295L)) < aVar3.b())) {
            z10 = true;
        }
        this.f30328k = z10;
        this.j = aVar3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.f30331n = null;
        this.f30332o = null;
        this.f30334q = -1;
        this.f30335r = -1;
        this.f30333p = d3.b.g(0, 0, 0, 0);
        long j = 0;
        this.f30329l = (j & 4294967295L) | (j << 32);
        this.f30328k = false;
    }

    public final void d(d3.c cVar) {
        long jA;
        d3.c cVar2 = this.f30327i;
        if (cVar != null) {
            int i4 = a.f30310b;
            jA = a.a(cVar.a(), cVar.F());
        } else {
            jA = a.f30309a;
        }
        if (cVar2 == null) {
            this.f30327i = cVar;
            this.f30326h = jA;
        } else if (cVar == null || this.f30326h != jA) {
            this.f30327i = cVar;
            this.f30326h = jA;
            this.f30336s = (this.f30336s << 2) | 1;
            c();
        }
    }

    public final o e(l lVar) {
        o cVar = this.f30331n;
        if (cVar == null || lVar != this.f30332o || cVar.b()) {
            this.f30332o = lVar;
            String str = this.f30320a;
            h0 h0VarE = z.e(this.f30321b, lVar);
            d3.c cVar2 = this.f30327i;
            k.b(cVar2);
            v2.d dVar = this.f30322c;
            s sVar = s.f38317a;
            cVar = new z2.c(str, h0VarE, sVar, sVar, dVar, cVar2);
        }
        this.f30331n = cVar;
        return cVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb2.append(this.j != null ? "<paragraph>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) a.b(this.f30326h));
        sb2.append(", history=");
        return u.s(this.f30336s, ", constraints=$)", sb2);
    }
}
