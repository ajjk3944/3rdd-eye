package wt;

import java.util.concurrent.CancellationException;
import lf.t1;

/* loaded from: classes.dex */
public abstract class c0 extends du.j {

    /* renamed from: g, reason: collision with root package name */
    public int f24608g;

    public c0(int i10) {
        super(0L, false);
        this.f24608g = i10;
    }

    public abstract pq.c c();

    public Throwable d(Object obj) {
        o oVar = obj instanceof o ? (o) obj : null;
        if (oVar != null) {
            return oVar.f24644a;
        }
        return null;
    }

    public final void h(Throwable th2) {
        w.o(new lq.k("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2), c().m());
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            pq.c cVarC = c();
            br.l.c(cVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            bu.f fVar = (bu.f) cVarC;
            rq.c cVar = fVar.f2964x;
            Object obj = fVar.B;
            pq.h hVarM = cVar.m();
            Object objL = bu.a.l(hVarM, obj);
            t0 t0Var = null;
            o1 o1VarA = objL != bu.a.f2954d ? w.A(cVar, hVarM, objL) : null;
            try {
                pq.h hVarM2 = cVar.m();
                Object objI = i();
                Throwable thD = d(objI);
                if (thD == null) {
                    int i10 = this.f24608g;
                    boolean z10 = true;
                    if (i10 != 1 && i10 != 2) {
                        z10 = false;
                    }
                    if (z10) {
                        t0Var = (t0) hVarM2.Y(r.f24653d);
                    }
                }
                if (t0Var != null && !t0Var.b()) {
                    CancellationException cancellationExceptionY = t0Var.y();
                    b(cancellationExceptionY);
                    cVar.g(t1.k(cancellationExceptionY));
                } else if (thD != null) {
                    cVar.g(t1.k(thD));
                } else {
                    cVar.g(f(objI));
                }
                if (o1VarA != null && !o1VarA.b0()) {
                    return;
                }
                bu.a.g(hVarM, objL);
            } catch (Throwable th2) {
                if (o1VarA == null || o1VarA.b0()) {
                    bu.a.g(hVarM, objL);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            h(th3);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
