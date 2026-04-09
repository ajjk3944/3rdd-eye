package ec;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j1 extends FutureTask implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f22811a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22812b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22813c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f22814d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, Runnable runnable, boolean z3, String str) {
        super(runnable, null);
        this.f22814d = l1Var;
        long andIncrement = l1.f22858l.getAndIncrement();
        this.f22811a = andIncrement;
        this.f22813c = str;
        this.f22812b = z3;
        if (andIncrement == Long.MAX_VALUE) {
            s0 s0Var = ((o1) l1Var.f218b).f22954f;
            o1.m(s0Var);
            s0Var.g.d("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j1 j1Var = (j1) obj;
        boolean z3 = j1Var.f22812b;
        boolean z10 = this.f22812b;
        if (z10 != z3) {
            return !z10 ? 1 : -1;
        }
        long j = j1Var.f22811a;
        long j8 = this.f22811a;
        if (j8 < j) {
            return -1;
        }
        if (j8 > j) {
            return 1;
        }
        s0 s0Var = ((o1) this.f22814d.f218b).f22954f;
        o1.m(s0Var);
        s0Var.f23054h.e(Long.valueOf(j8), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        s0 s0Var = ((o1) this.f22814d.f218b).f22954f;
        o1.m(s0Var);
        s0Var.g.e(th2, this.f22813c);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, Callable callable, boolean z3) {
        super(callable);
        this.f22814d = l1Var;
        long andIncrement = l1.f22858l.getAndIncrement();
        this.f22811a = andIncrement;
        this.f22813c = "Task exception on worker thread";
        this.f22812b = z3;
        if (andIncrement == Long.MAX_VALUE) {
            s0 s0Var = ((o1) l1Var.f218b).f22954f;
            o1.m(s0Var);
            s0Var.g.d("Tasks index overflow");
        }
    }
}
