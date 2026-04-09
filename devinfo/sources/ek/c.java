package ek;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nk.k;
import xk.r;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class c extends a {
    private final ck.h _context;
    private transient ck.c<Object> intercepted;

    public c(ck.c cVar, ck.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // ck.c
    public ck.h getContext() {
        ck.h hVar = this._context;
        k.b(hVar);
        return hVar;
    }

    public final ck.c<Object> intercepted() {
        ck.c<Object> cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        ck.e eVar = (ck.e) getContext().O(ck.d.f2897a);
        ck.c<Object> gVar = eVar != null ? new cl.g((r) eVar, this) : this;
        this.intercepted = gVar;
        return gVar;
    }

    @Override // ek.a
    public void releaseIntercepted() {
        ck.c<Object> cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            ck.f fVarO = getContext().O(ck.d.f2897a);
            k.b(fVarO);
            cl.g gVar = (cl.g) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = cl.g.f2913h;
            while (atomicReferenceFieldUpdater.get(gVar) == cl.b.f2904c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            xk.h hVar = obj instanceof xk.h ? (xk.h) obj : null;
            if (hVar != null) {
                hVar.o();
            }
        }
        this.intercepted = b.f23531a;
    }

    public c(ck.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
