package g0;

import br.l;
import h2.b0;
import h2.j0;
import h2.r;
import mq.w;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public String f9148a;

    /* renamed from: b, reason: collision with root package name */
    public j0 f9149b;

    /* renamed from: c, reason: collision with root package name */
    public k2.g f9150c;

    /* renamed from: d, reason: collision with root package name */
    public int f9151d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9152e;

    /* renamed from: f, reason: collision with root package name */
    public int f9153f;

    /* renamed from: g, reason: collision with root package name */
    public int f9154g;

    /* renamed from: i, reason: collision with root package name */
    public t2.c f9156i;
    public h2.b j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public long f9157l;

    /* renamed from: m, reason: collision with root package name */
    public b f9158m;

    /* renamed from: n, reason: collision with root package name */
    public r f9159n;

    /* renamed from: o, reason: collision with root package name */
    public t2.i f9160o;

    /* renamed from: q, reason: collision with root package name */
    public long f9162q;

    /* renamed from: h, reason: collision with root package name */
    public long f9155h = a.f9123a;

    /* renamed from: p, reason: collision with root package name */
    public long f9161p = t2.b.g(0, 0, 0, 0);

    public e(String str, j0 j0Var, k2.g gVar, int i10, boolean z10, int i11, int i12) {
        this.f9148a = str;
        this.f9149b = j0Var;
        this.f9150c = gVar;
        this.f9151d = i10;
        this.f9152e = z10;
        this.f9153f = i11;
        this.f9154g = i12;
        long j = 0;
        this.f9157l = (j & 4294967295L) | (j << 32);
    }

    public final boolean a(long j, t2.i iVar) {
        long jA;
        r rVar;
        this.f9162q = (this.f9162q << 2) | 3;
        boolean z10 = true;
        if (this.f9154g > 1) {
            j0 j0Var = this.f9149b;
            b bVar = this.f9158m;
            t2.c cVar = this.f9156i;
            l.b(cVar);
            b bVarO = ic.a.o(bVar, iVar, j0Var, cVar, this.f9150c);
            this.f9158m = bVarO;
            jA = bVarO.a(this.f9154g, j);
        } else {
            jA = j;
        }
        h2.b bVar2 = this.j;
        boolean z11 = false;
        if (bVar2 != null && (rVar = this.f9159n) != null && !rVar.d() && iVar == this.f9160o && (t2.a.b(jA, this.f9161p) || (t2.a.h(jA) == t2.a.h(this.f9161p) && t2.a.j(jA) == t2.a.j(this.f9161p) && t2.a.g(jA) >= bVar2.b() && !bVar2.f9781d.f11172d))) {
            if (!t2.a.b(jA, this.f9161p)) {
                h2.b bVar3 = this.j;
                l.b(bVar3);
                this.f9157l = t2.b.d(jA, (dr.a.d(Math.min(bVar3.f9778a.E.c(), bVar3.c())) << 32) | (dr.a.d(bVar3.b()) & 4294967295L));
                if (this.f9151d == 3 || (((int) (r12 >> 32)) >= bVar3.c() && ((int) (4294967295L & r12)) >= bVar3.b())) {
                    z10 = false;
                }
                this.k = z10;
                this.f9161p = jA;
            }
            return false;
        }
        r dVar = this.f9159n;
        if (dVar == null || iVar != this.f9160o || dVar.d()) {
            this.f9160o = iVar;
            String str = this.f9148a;
            j0 j0VarE = b0.e(this.f9149b, iVar);
            t2.c cVar2 = this.f9156i;
            l.b(cVar2);
            k2.g gVar = this.f9150c;
            w wVar = w.f16945a;
            dVar = new o2.d(str, j0VarE, wVar, wVar, gVar, cVar2);
        }
        this.f9159n = dVar;
        long jN = i3.g.n(jA, this.f9152e, this.f9151d, dVar.g());
        boolean z12 = this.f9152e;
        int i10 = this.f9151d;
        int i11 = this.f9153f;
        h2.b bVar4 = new h2.b((o2.d) dVar, ((z12 || !(i10 == 2 || i10 == 4 || i10 == 5)) && i11 >= 1) ? i11 : 1, i10, jN);
        this.f9161p = jA;
        this.f9157l = t2.b.d(jA, (dr.a.d(bVar4.b()) & 4294967295L) | (dr.a.d(bVar4.c()) << 32));
        if (this.f9151d != 3 && (((int) (r1 >> 32)) < bVar4.c() || ((int) (r1 & 4294967295L)) < bVar4.b())) {
            z11 = true;
        }
        this.k = z11;
        this.j = bVar4;
        return true;
    }

    public final void b() {
        this.j = null;
        this.f9159n = null;
        this.f9160o = null;
        this.f9161p = t2.b.g(0, 0, 0, 0);
        long j = 0;
        this.f9157l = (j & 4294967295L) | (j << 32);
        this.k = false;
    }

    public final void c(t2.c cVar) {
        long jA;
        t2.c cVar2 = this.f9156i;
        if (cVar != null) {
            int i10 = a.f9124b;
            jA = a.a(cVar.getDensity(), cVar.y());
        } else {
            jA = a.f9123a;
        }
        if (cVar2 == null) {
            this.f9156i = cVar;
            this.f9155h = jA;
        } else if (cVar == null || this.f9155h != jA) {
            this.f9156i = cVar;
            this.f9155h = jA;
            this.f9162q = (this.f9162q << 2) | 1;
            b();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb2.append(this.j != null ? "<paragraph>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) a.b(this.f9155h));
        sb2.append(", history=");
        return c7.a.n(this.f9162q, ", constraints=$)", sb2);
    }
}
