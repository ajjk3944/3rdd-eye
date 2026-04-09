package zk;

import c2.d0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import xk.z0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t extends xk.a implements u, l {

    /* renamed from: d, reason: collision with root package name */
    public final h f38375d;

    public t(ck.h hVar, h hVar2) {
        super(hVar, true);
        this.f38375d = hVar2;
    }

    @Override // zk.w
    public final yb.i a() {
        return this.f38375d.a();
    }

    @Override // zk.w
    public final Object b() {
        return this.f38375d.b();
    }

    @Override // zk.w
    public final Object d(bl.p pVar) {
        h hVar = this.f38375d;
        hVar.getClass();
        return h.D(hVar, pVar);
    }

    @Override // xk.f1, xk.y0
    public final void e(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new z0(u(), null, this);
        }
        s(cancellationException);
    }

    @Override // xk.a
    public final void g0(Throwable th2, boolean z3) {
        if (this.f38375d.m(th2, false) || z3) {
            return;
        }
        xk.x.q(this.f37167c, th2);
    }

    @Override // zk.x
    public final Object h(ck.c cVar, Object obj) {
        return this.f38375d.h(cVar, obj);
    }

    @Override // xk.a
    public final void h0(Object obj) {
        this.f38375d.j(null);
    }

    @Override // zk.w
    public final c iterator() {
        h hVar = this.f38375d;
        hVar.getClass();
        return new c(hVar);
    }

    public final void j0(d0 d0Var) {
        h hVar = this.f38375d;
        hVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.j;
        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, null, d0Var)) {
            if (atomicReferenceFieldUpdater.get(hVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(hVar);
                    cl.u uVar = j.f38360q;
                    if (obj != uVar) {
                        if (obj == j.f38361r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    cl.u uVar2 = j.f38361r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, uVar, uVar2)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != uVar) {
                            break;
                        }
                    }
                    d0Var.invoke(hVar.r());
                    return;
                }
            }
        }
    }

    @Override // zk.w
    public final Object k(ek.j jVar) {
        return this.f38375d.k(jVar);
    }

    @Override // zk.x
    public final Object l(Object obj) {
        return this.f38375d.l(obj);
    }

    @Override // xk.f1
    public final void s(CancellationException cancellationException) {
        this.f38375d.m(cancellationException, true);
        r(cancellationException);
    }
}
