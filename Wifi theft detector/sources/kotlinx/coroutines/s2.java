package kotlinx.coroutines;

import kotlin.Pair;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes4.dex */
public final class s2 extends kotlinx.coroutines.internal.y {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f22598e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public s2(kotlin.coroutines.d dVar, c9.c cVar) {
        t2 t2Var = t2.f22694a;
        super(dVar.get(t2Var) == null ? dVar.plus(t2Var) : dVar, cVar);
        this.f22598e = new ThreadLocal();
        if (cVar.getContext().get(kotlin.coroutines.c.F8) instanceof CoroutineDispatcher) {
            return;
        }
        Object objC = ThreadContextKt.c(dVar, null);
        ThreadContextKt.a(dVar, objC);
        V0(dVar, objC);
    }

    @Override // kotlinx.coroutines.internal.y, kotlinx.coroutines.a
    public void Q0(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f22598e.get();
            if (pair != null) {
                ThreadContextKt.a((kotlin.coroutines.d) pair.getFirst(), pair.getSecond());
            }
            this.f22598e.remove();
        }
        Object objA = f0.a(obj, this.f22567d);
        c9.c cVar = this.f22567d;
        kotlin.coroutines.d context = cVar.getContext();
        Object objC = ThreadContextKt.c(context, null);
        s2 s2VarG = objC != ThreadContextKt.f22512a ? CoroutineContextKt.g(cVar, context, objC) : null;
        try {
            this.f22567d.resumeWith(objA);
            y8.s sVar = y8.s.f25199a;
            if (s2VarG == null || s2VarG.U0()) {
                ThreadContextKt.a(context, objC);
            }
        } catch (Throwable th) {
            if (s2VarG == null || s2VarG.U0()) {
                ThreadContextKt.a(context, objC);
            }
            throw th;
        }
    }

    public final boolean U0() {
        boolean z10 = this.threadLocalIsSet && this.f22598e.get() == null;
        this.f22598e.remove();
        return !z10;
    }

    public final void V0(kotlin.coroutines.d dVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f22598e.set(y8.i.a(dVar, obj));
    }
}
