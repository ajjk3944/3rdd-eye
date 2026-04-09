package kotlinx.coroutines;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes4.dex */
public abstract class t0 extends w9.g {

    /* renamed from: c, reason: collision with root package name */
    public int f22692c;

    public t0(int i10) {
        this.f22692c = i10;
    }

    public abstract void b(Object obj, Throwable th);

    public abstract c9.c c();

    public Throwable f(Object obj) {
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var != null) {
            return c0Var.f22236a;
        }
        return null;
    }

    public Object g(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            y8.d.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.p.b(th);
        h0.a(c().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objB;
        Object objB2;
        w9.h hVar = this.f24852b;
        try {
            c9.c cVarC = c();
            kotlin.jvm.internal.p.c(cVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            kotlinx.coroutines.internal.i iVar = (kotlinx.coroutines.internal.i) cVarC;
            c9.c cVar = iVar.f22536e;
            Object obj = iVar.f22538g;
            kotlin.coroutines.d context = cVar.getContext();
            Object objC = ThreadContextKt.c(context, obj);
            s2 s2VarG = objC != ThreadContextKt.f22512a ? CoroutineContextKt.g(cVar, context, objC) : null;
            try {
                kotlin.coroutines.d context2 = cVar.getContext();
                Object objJ = j();
                Throwable thF = f(objJ);
                r1 r1Var = (thF == null && u0.b(this.f22692c)) ? (r1) context2.get(r1.H8) : null;
                if (r1Var != null && !r1Var.isActive()) {
                    CancellationException cancellationExceptionM = r1Var.m();
                    b(objJ, cancellationExceptionM);
                    Result.Companion aVar = Result.INSTANCE;
                    cVar.resumeWith(Result.b(kotlin.c.a(cancellationExceptionM)));
                } else if (thF != null) {
                    Result.Companion aVar2 = Result.INSTANCE;
                    cVar.resumeWith(Result.b(kotlin.c.a(thF)));
                } else {
                    Result.Companion aVar3 = Result.INSTANCE;
                    cVar.resumeWith(Result.b(g(objJ)));
                }
                y8.s sVar = y8.s.f25199a;
                if (s2VarG == null || s2VarG.U0()) {
                    ThreadContextKt.a(context, objC);
                }
                try {
                    hVar.a();
                    objB2 = Result.b(y8.s.f25199a);
                } catch (Throwable th) {
                    Result.Companion aVar4 = Result.INSTANCE;
                    objB2 = Result.b(kotlin.c.a(th));
                }
                h(null, Result.e(objB2));
            } catch (Throwable th2) {
                if (s2VarG == null || s2VarG.U0()) {
                    ThreadContextKt.a(context, objC);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                Result.Companion aVar5 = Result.INSTANCE;
                hVar.a();
                objB = Result.b(y8.s.f25199a);
            } catch (Throwable th4) {
                Result.Companion aVar6 = Result.INSTANCE;
                objB = Result.b(kotlin.c.a(th4));
            }
            h(th3, Result.e(objB));
        }
    }
}
