package zc;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class y0 extends FutureTask implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f27269a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27270d;

    /* renamed from: g, reason: collision with root package name */
    public final String f27271g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a1 f27272r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(a1 a1Var, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        this.f27272r = a1Var;
        long andIncrement = a1.H.getAndIncrement();
        this.f27269a = andIncrement;
        this.f27271g = str;
        this.f27270d = z10;
        if (andIncrement == Long.MAX_VALUE) {
            j0 j0Var = ((c1) a1Var.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.B.b("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y0 y0Var = (y0) obj;
        boolean z10 = y0Var.f27270d;
        boolean z11 = this.f27270d;
        if (z11 != z10) {
            return !z11 ? 1 : -1;
        }
        long j = y0Var.f27269a;
        long j7 = this.f27269a;
        if (j7 < j) {
            return -1;
        }
        if (j7 > j) {
            return 1;
        }
        j0 j0Var = ((c1) this.f27272r.f1504d).f26889y;
        c1.g(j0Var);
        j0Var.D.c(Long.valueOf(j7), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        j0 j0Var = ((c1) this.f27272r.f1504d).f26889y;
        c1.g(j0Var);
        j0Var.B.c(th2, this.f27271g);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(a1 a1Var, Callable callable, boolean z10) {
        super(callable);
        this.f27272r = a1Var;
        long andIncrement = a1.H.getAndIncrement();
        this.f27269a = andIncrement;
        this.f27271g = "Task exception on worker thread";
        this.f27270d = z10;
        if (andIncrement == Long.MAX_VALUE) {
            j0 j0Var = ((c1) a1Var.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.B.b("Tasks index overflow");
        }
    }
}
