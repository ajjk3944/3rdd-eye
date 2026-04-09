package xk;

import com.google.android.gms.internal.ads.l81;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e0 extends el.i {

    /* renamed from: c, reason: collision with root package name */
    public int f37182c;

    public e0(int i4) {
        super(0L, false);
        this.f37182c = i4;
    }

    public abstract ck.c c();

    public Throwable d(Object obj) {
        p pVar = obj instanceof p ? (p) obj : null;
        if (pVar != null) {
            return pVar.f37219a;
        }
        return null;
    }

    public final void g(Throwable th2) {
        x.q(c().getContext(), new l81("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ck.c cVarC = c();
            nk.k.c(cVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            cl.g gVar = (cl.g) cVarC;
            ek.c cVar = gVar.f2915e;
            Object obj = gVar.g;
            ck.h context = cVar.getContext();
            Object objN = cl.b.n(context, obj);
            y0 y0Var = null;
            s1 s1VarD = objN != cl.b.f2905d ? x.D(cVar, context, objN) : null;
            try {
                ck.h context2 = cVar.getContext();
                Object objH = h();
                Throwable thD = d(objH);
                if (thD == null) {
                    int i4 = this.f37182c;
                    boolean z3 = true;
                    if (i4 != 1 && i4 != 2) {
                        z3 = false;
                    }
                    if (z3) {
                        y0Var = (y0) context2.O(s.f37235b);
                    }
                }
                if (y0Var != null && !y0Var.c()) {
                    CancellationException cancellationExceptionP = y0Var.p();
                    b(cancellationExceptionP);
                    cVar.resumeWith(ci.b.h(cancellationExceptionP));
                } else if (thD != null) {
                    cVar.resumeWith(ci.b.h(thD));
                } else {
                    cVar.resumeWith(e(objH));
                }
                if (s1VarD == null || s1VarD.k0()) {
                    cl.b.g(context, objN);
                }
            } catch (Throwable th2) {
                if (s1VarD == null || s1VarD.k0()) {
                    cl.b.g(context, objN);
                }
                throw th2;
            }
        } catch (c0 e2) {
            x.q(c().getContext(), e2.f37174a);
        } catch (Throwable th3) {
            g(th3);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object e(Object obj) {
        return obj;
    }
}
