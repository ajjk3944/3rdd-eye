package ds;

import ba.m;
import br.l;
import gt.j;
import java.util.Iterator;
import lu.u;
import mq.n;
import mq.o;
import qs.g;
import sr.h;
import st.f;
import st.p;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final cj.a f7470a;

    /* renamed from: d, reason: collision with root package name */
    public final hs.b f7471d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7472g;

    /* renamed from: r, reason: collision with root package name */
    public final j f7473r;

    public c(cj.a aVar, hs.b bVar, boolean z10) {
        l.e(aVar, "c");
        l.e(bVar, "annotationOwner");
        this.f7470a = aVar;
        this.f7471d = bVar;
        this.f7472g = z10;
        this.f7473r = ((gt.l) ((a) aVar.f3974d).f7446a).c(new as.d(8, this));
    }

    @Override // sr.h
    public final boolean G(qs.c cVar) {
        return m.A(this, cVar);
    }

    @Override // sr.h
    public final boolean isEmpty() {
        return this.f7471d.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        hs.b bVar = this.f7471d;
        p pVarB0 = st.l.b0(o.j0(bVar.getAnnotations()), this.f7473r);
        g gVar = bs.d.f2929a;
        return new st.e(new f(st.l.Z(mq.l.Y(new st.j[]{pVarB0, new n(4, bs.d.a(or.n.f19699m, bVar, this.f7470a))})), false, new u(3)));
    }

    @Override // sr.h
    public final sr.b w(qs.c cVar) {
        sr.b bVar;
        l.e(cVar, "fqName");
        hs.b bVar2 = this.f7471d;
        xr.e eVarA = bVar2.a(cVar);
        if (eVarA != null && (bVar = (sr.b) this.f7473r.a(eVarA)) != null) {
            return bVar;
        }
        g gVar = bs.d.f2929a;
        return bs.d.a(cVar, bVar2, this.f7470a);
    }
}
