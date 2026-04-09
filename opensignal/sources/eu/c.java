package eu;

import ar.o;
import bu.r;
import bu.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import lq.b0;
import wt.q1;

/* loaded from: classes.dex */
public final class c implements wt.f, q1 {

    /* renamed from: a, reason: collision with root package name */
    public final wt.g f8350a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f8351d;

    public c(d dVar, wt.g gVar) {
        this.f8351d = dVar;
        this.f8350a = gVar;
    }

    @Override // wt.q1
    public final void a(r rVar, int i10) {
        this.f8350a.a(rVar, i10);
    }

    @Override // pq.c
    public final void g(Object obj) {
        this.f8350a.g(obj);
    }

    @Override // wt.f
    public final void j(Object obj, o oVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f8352h;
        d dVar = this.f8351d;
        atomicReferenceFieldUpdater.set(dVar, null);
        cg.j jVar = new cg.j(dVar, this);
        wt.g gVar = this.f8350a;
        gVar.D(b0.f15562a, gVar.f24608g, new b(2, jVar));
    }

    @Override // wt.f
    public final t k(Object obj, o oVar) {
        d dVar = this.f8351d;
        b bVar = new b(dVar, this);
        t tVarK = this.f8350a.k((b0) obj, bVar);
        if (tVarK != null) {
            d.f8352h.set(dVar, null);
        }
        return tVarK;
    }

    @Override // pq.c
    public final pq.h m() {
        return this.f8350a.f24618x;
    }

    @Override // wt.f
    public final void n(Object obj) {
        this.f8350a.n(obj);
    }
}
