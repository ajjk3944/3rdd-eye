package g0;

import br.l;
import h2.b0;
import h2.f0;
import h2.g0;
import h2.j0;
import h2.m;
import java.util.List;
import mq.w;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public h2.f f9135a;

    /* renamed from: b, reason: collision with root package name */
    public k2.g f9136b;

    /* renamed from: c, reason: collision with root package name */
    public int f9137c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9138d;

    /* renamed from: e, reason: collision with root package name */
    public int f9139e;

    /* renamed from: f, reason: collision with root package name */
    public int f9140f;

    /* renamed from: g, reason: collision with root package name */
    public List f9141g;

    /* renamed from: h, reason: collision with root package name */
    public b f9142h;

    /* renamed from: i, reason: collision with root package name */
    public long f9143i = a.f9123a;
    public t2.c j;
    public j0 k;

    /* renamed from: l, reason: collision with root package name */
    public cj.a f9144l;

    /* renamed from: m, reason: collision with root package name */
    public t2.i f9145m;

    /* renamed from: n, reason: collision with root package name */
    public g0 f9146n;

    /* renamed from: o, reason: collision with root package name */
    public long f9147o;

    public d(h2.f fVar, j0 j0Var, k2.g gVar, int i10, boolean z10, int i11, int i12, w wVar) {
        this.f9135a = fVar;
        this.f9136b = gVar;
        this.f9137c = i10;
        this.f9138d = z10;
        this.f9139e = i11;
        this.f9140f = i12;
        this.f9141g = wVar;
        this.k = j0Var;
    }

    public final boolean a(long j, t2.i iVar) {
        cj.a aVar;
        this.f9147o = (this.f9147o << 2) | 3;
        if (this.f9140f > 1) {
            b bVar = this.f9142h;
            j0 j0Var = this.k;
            t2.c cVar = this.j;
            l.b(cVar);
            b bVarO = ic.a.o(bVar, iVar, j0Var, cVar, this.f9136b);
            this.f9142h = bVarO;
            j = bVarO.a(this.f9140f, j);
        }
        g0 g0Var = this.f9146n;
        if (g0Var != null) {
            m mVar = g0Var.f9825b;
            f0 f0Var = g0Var.f9824a;
            if (!mVar.f9847a.d()) {
                t2.i iVar2 = f0Var.f9821h;
                long j7 = f0Var.j;
                if (iVar == iVar2 && (t2.a.b(j, j7) || (t2.a.h(j) == t2.a.h(j7) && t2.a.j(j) == t2.a.j(j7) && t2.a.g(j) >= mVar.f9851e && !mVar.f9849c))) {
                    g0 g0Var2 = this.f9146n;
                    l.b(g0Var2);
                    if (t2.a.b(j, g0Var2.f9824a.j)) {
                        return false;
                    }
                    g0 g0Var3 = this.f9146n;
                    l.b(g0Var3);
                    this.f9146n = c(iVar, j, g0Var3.f9825b);
                    return true;
                }
            }
        }
        cj.a aVar2 = this.f9144l;
        if (aVar2 == null || iVar != this.f9145m || aVar2.d()) {
            this.f9145m = iVar;
            h2.f fVar = this.f9135a;
            j0 j0VarE = b0.e(this.k, iVar);
            t2.c cVar2 = this.j;
            l.b(cVar2);
            k2.g gVar = this.f9136b;
            List list = this.f9141g;
            if (list == null) {
                list = w.f16945a;
            }
            aVar = new cj.a(fVar, j0VarE, list, cVar2, gVar);
        } else {
            aVar = aVar2;
        }
        this.f9144l = aVar;
        long jN = i3.g.n(j, this.f9138d, this.f9137c, aVar.g());
        boolean z10 = this.f9138d;
        int i10 = this.f9137c;
        int i11 = this.f9139e;
        this.f9146n = c(iVar, j, new m(aVar, jN, ((z10 || !(i10 == 2 || i10 == 4 || i10 == 5)) && i11 >= 1) ? i11 : 1, i10));
        return true;
    }

    public final void b(t2.c cVar) {
        long jA;
        t2.c cVar2 = this.j;
        if (cVar != null) {
            int i10 = a.f9124b;
            jA = a.a(cVar.getDensity(), cVar.y());
        } else {
            jA = a.f9123a;
        }
        if (cVar2 == null) {
            this.j = cVar;
            this.f9143i = jA;
        } else if (cVar == null || this.f9143i != jA) {
            this.j = cVar;
            this.f9143i = jA;
            this.f9147o = (this.f9147o << 2) | 1;
            this.f9144l = null;
            this.f9146n = null;
        }
    }

    public final g0 c(t2.i iVar, long j, m mVar) {
        float fMin = Math.min(mVar.f9847a.g(), mVar.f9850d);
        h2.f fVar = this.f9135a;
        j0 j0Var = this.k;
        List list = this.f9141g;
        if (list == null) {
            list = w.f16945a;
        }
        int i10 = this.f9139e;
        boolean z10 = this.f9138d;
        int i11 = this.f9137c;
        t2.c cVar = this.j;
        l.b(cVar);
        return new g0(new f0(fVar, j0Var, list, i10, z10, i11, cVar, iVar, this.f9136b, j), mVar, t2.b.d(j, (dr.a.d(fMin) << 32) | (dr.a.d(mVar.f9851e) & 4294967295L)));
    }

    public final String toString() {
        f0 f0Var;
        StringBuilder sb2 = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object aVar = "null";
        sb2.append(this.f9146n != null ? "<TextLayoutResult>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) a.b(this.f9143i));
        sb2.append(", history=");
        sb2.append(this.f9147o);
        sb2.append(", constraints=");
        g0 g0Var = this.f9146n;
        if (g0Var != null && (f0Var = g0Var.f9824a) != null) {
            aVar = new t2.a(f0Var.j);
        }
        sb2.append(aVar);
        sb2.append(')');
        return sb2.toString();
    }
}
