package yt;

import bu.t;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wt.u0;
import wt.w;

/* loaded from: classes.dex */
public final class o extends wt.a implements p, g {

    /* renamed from: r, reason: collision with root package name */
    public final c f26455r;

    public o(pq.h hVar, c cVar) {
        super(hVar, true);
        this.f26455r = cVar;
    }

    @Override // wt.a
    public final void X(Throwable th2, boolean z10) {
        if (this.f26455r.g(th2, false) || z10) {
            return;
        }
        w.o(th2, this.f24597g);
    }

    @Override // yt.r
    public final Object a(Object obj, pq.c cVar) {
        return this.f26455r.a(obj, cVar);
    }

    @Override // wt.a
    public final void a0(Object obj) {
        this.f26455r.g(null, false);
    }

    public final void b0(bs.a aVar) {
        c cVar = this.f26455r;
        cVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.F;
        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, null, aVar)) {
            if (atomicReferenceFieldUpdater.get(cVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(cVar);
                    t tVar = e.f26442q;
                    if (obj != tVar) {
                        if (obj == e.f26443r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    t tVar2 = e.f26443r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, tVar, tVar2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != tVar) {
                            break;
                        }
                    }
                    aVar.a(cVar.n());
                    return;
                }
            }
        }
    }

    @Override // yt.r
    public final Object c(Object obj) {
        return this.f26455r.c(obj);
    }

    @Override // wt.b1, wt.t0
    public final void h(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new u0(s(), null, this);
        }
        p(cancellationException);
    }

    @Override // wt.b1
    public final void p(CancellationException cancellationException) {
        this.f26455r.g(cancellationException, true);
        o(cancellationException);
    }
}
