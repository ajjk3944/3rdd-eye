package zk;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import xk.u1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f38326a = j.f38359p;

    /* renamed from: b, reason: collision with root package name */
    public xk.h f38327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f38328c;

    public c(h hVar) {
        this.f38328c = hVar;
    }

    @Override // xk.u1
    public final void a(cl.s sVar, int i4) {
        xk.h hVar = this.f38327b;
        if (hVar != null) {
            hVar.a(sVar, i4);
        }
    }

    public final Object b(ek.c cVar) throws Throwable {
        p pVarQ;
        Object obj = this.f38326a;
        boolean z3 = true;
        if (obj == j.f38359p || obj == j.f38355l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.g;
            h hVar = this.f38328c;
            p pVar = (p) atomicReferenceFieldUpdater.get(hVar);
            while (true) {
                if (hVar.x()) {
                    this.f38326a = j.f38355l;
                    Throwable thR = hVar.r();
                    if (thR != null) {
                        int i4 = cl.t.f2940a;
                        throw thR;
                    }
                    z3 = false;
                } else {
                    long andIncrement = h.f38338c.getAndIncrement(hVar);
                    long j = j.f38347b;
                    long j8 = andIncrement / j;
                    int i10 = (int) (andIncrement % j);
                    if (pVar.f2939c != j8) {
                        pVarQ = hVar.q(j8, pVar);
                        if (pVarQ == null) {
                            continue;
                        }
                    } else {
                        pVarQ = pVar;
                    }
                    Object objI = hVar.I(pVarQ, i10, andIncrement, null);
                    cl.u uVar = j.f38356m;
                    if (objI == uVar) {
                        throw new IllegalStateException("unreachable");
                    }
                    cl.u uVar2 = j.f38358o;
                    if (objI == uVar2) {
                        if (andIncrement < hVar.u()) {
                            pVarQ.a();
                        }
                        pVar = pVarQ;
                    } else {
                        if (objI == j.f38357n) {
                            h hVar2 = this.f38328c;
                            xk.h hVarP = xk.x.p(a.a.r(cVar));
                            try {
                                this.f38327b = hVarP;
                                Object objI2 = hVar2.I(pVarQ, i10, andIncrement, this);
                                if (objI2 == uVar) {
                                    a(pVarQ, i10);
                                } else {
                                    if (objI2 == uVar2) {
                                        if (andIncrement < hVar2.u()) {
                                            pVarQ.a();
                                        }
                                        p pVar2 = (p) h.g.get(hVar2);
                                        while (true) {
                                            if (hVar2.x()) {
                                                xk.h hVar3 = this.f38327b;
                                                nk.k.b(hVar3);
                                                this.f38327b = null;
                                                this.f38326a = j.f38355l;
                                                Throwable thR2 = hVar.r();
                                                if (thR2 == null) {
                                                    hVar3.resumeWith(Boolean.FALSE);
                                                } else {
                                                    hVar3.resumeWith(ci.b.h(thR2));
                                                }
                                            } else {
                                                long andIncrement2 = h.f38338c.getAndIncrement(hVar2);
                                                long j9 = j.f38347b;
                                                long j10 = andIncrement2 / j9;
                                                int i11 = (int) (andIncrement2 % j9);
                                                if (pVar2.f2939c != j10) {
                                                    p pVarQ2 = hVar2.q(j10, pVar2);
                                                    if (pVarQ2 != null) {
                                                        pVar2 = pVarQ2;
                                                    }
                                                }
                                                Object objI3 = hVar2.I(pVar2, i11, andIncrement2, this);
                                                if (objI3 == j.f38356m) {
                                                    a(pVar2, i11);
                                                    break;
                                                }
                                                if (objI3 == j.f38358o) {
                                                    if (andIncrement2 < hVar2.u()) {
                                                        pVar2.a();
                                                    }
                                                } else {
                                                    if (objI3 == j.f38357n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    pVar2.a();
                                                    this.f38326a = objI3;
                                                    this.f38327b = null;
                                                }
                                            }
                                        }
                                    } else {
                                        pVarQ.a();
                                        this.f38326a = objI2;
                                        this.f38327b = null;
                                    }
                                    hVarP.f(Boolean.TRUE, null);
                                }
                                return hVarP.r();
                            } catch (Throwable th2) {
                                hVarP.A();
                                throw th2;
                            }
                        }
                        pVarQ.a();
                        this.f38326a = objI;
                    }
                }
            }
        }
        return Boolean.valueOf(z3);
    }

    public final Object c() throws Throwable {
        Object obj = this.f38326a;
        cl.u uVar = j.f38359p;
        if (obj == uVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f38326a = uVar;
        if (obj != j.f38355l) {
            return obj;
        }
        Throwable thS = this.f38328c.s();
        int i4 = cl.t.f2940a;
        throw thS;
    }
}
