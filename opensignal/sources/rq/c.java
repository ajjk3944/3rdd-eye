package rq;

import br.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public final pq.h f21666d;

    /* renamed from: g, reason: collision with root package name */
    public transient pq.c f21667g;

    public c(pq.c cVar, pq.h hVar) {
        super(cVar);
        this.f21666d = hVar;
    }

    @Override // pq.c
    public pq.h m() {
        pq.h hVar = this.f21666d;
        l.b(hVar);
        return hVar;
    }

    @Override // rq.a
    public void r() {
        pq.c cVar = this.f21667g;
        if (cVar != null && cVar != this) {
            pq.f fVarY = m().Y(pq.d.f20620a);
            l.b(fVarY);
            bu.f fVar = (bu.f) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bu.f.D;
            while (atomicReferenceFieldUpdater.get(fVar) == bu.a.f2953c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            wt.g gVar = obj instanceof wt.g ? (wt.g) obj : null;
            if (gVar != null) {
                gVar.r();
            }
        }
        this.f21667g = b.f21665a;
    }

    public c(pq.c cVar) {
        this(cVar, cVar != null ? cVar.m() : null);
    }
}
