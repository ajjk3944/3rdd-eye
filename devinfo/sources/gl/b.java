package gl;

import b7.u;
import cl.s;
import d0.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import xk.u1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements xk.g, u1 {

    /* renamed from: a, reason: collision with root package name */
    public final xk.h f24756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f24757b;

    public b(c cVar, xk.h hVar) {
        this.f24757b = cVar;
        this.f24756a = hVar;
    }

    @Override // xk.u1
    public final void a(s sVar, int i4) {
        this.f24756a.a(sVar, i4);
    }

    @Override // xk.g
    public final void f(Object obj, mk.f fVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f24758h;
        c cVar = this.f24757b;
        atomicReferenceFieldUpdater.set(cVar, null);
        u uVar = new u(cVar, this);
        xk.h hVar = this.f24756a;
        hVar.B(yj.u.f37649a, hVar.f37182c, new w(3, uVar));
    }

    @Override // ck.c
    public final ck.h getContext() {
        return this.f24756a.f37194e;
    }

    @Override // xk.g
    public final boolean i(Throwable th2) {
        return this.f24756a.i(th2);
    }

    @Override // xk.g
    public final cl.u j(Object obj, mk.f fVar) {
        c cVar = this.f24757b;
        w wVar = new w(cVar, this);
        cl.u uVarJ = this.f24756a.j((yj.u) obj, wVar);
        if (uVarJ != null) {
            c.f24758h.set(cVar, null);
        }
        return uVarJ;
    }

    @Override // xk.g
    public final void n(Object obj) {
        this.f24756a.n(obj);
    }

    @Override // ck.c
    public final void resumeWith(Object obj) {
        this.f24756a.resumeWith(obj);
    }
}
