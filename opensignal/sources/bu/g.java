package bu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import wt.a0;
import wt.y;

/* loaded from: classes.dex */
public final class g extends wt.q implements a0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater D = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");
    public final Object B;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f2966g;

    /* renamed from: r, reason: collision with root package name */
    public final wt.q f2967r;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: x, reason: collision with root package name */
    public final int f2968x;

    /* renamed from: y, reason: collision with root package name */
    public final k f2969y;

    /* JADX WARN: Multi-variable type inference failed */
    public g(wt.q qVar, int i10) {
        a0 a0Var = qVar instanceof a0 ? (a0) qVar : null;
        this.f2966g = a0Var == null ? y.f24672a : a0Var;
        this.f2967r = qVar;
        this.f2968x = i10;
        this.f2969y = new k();
        this.B = new Object();
    }

    @Override // wt.a0
    public final void G(long j, wt.g gVar) {
        this.f2966g.G(j, gVar);
    }

    @Override // wt.q
    public final void n0(pq.h hVar, Runnable runnable) {
        Runnable runnableR0;
        this.f2969y.a(runnable);
        if (D.get(this) >= this.f2968x || !s0() || (runnableR0 = r0()) == null) {
            return;
        }
        this.f2967r.n0(this, new re.a(5, this, runnableR0, false));
    }

    @Override // wt.q
    public final void o0(pq.h hVar, Runnable runnable) {
        Runnable runnableR0;
        this.f2969y.a(runnable);
        if (D.get(this) >= this.f2968x || !s0() || (runnableR0 = r0()) == null) {
            return;
        }
        this.f2967r.o0(this, new re.a(5, this, runnableR0, false));
    }

    @Override // wt.q
    public final wt.q q0(int i10) {
        a.a(1);
        return 1 >= this.f2968x ? this : super.q0(1);
    }

    public final Runnable r0() {
        while (true) {
            Runnable runnable = (Runnable) this.f2969y.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.B) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f2969y.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean s0() {
        synchronized (this.B) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D;
            if (atomicIntegerFieldUpdater.get(this) >= this.f2968x) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // wt.q
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2967r);
        sb2.append(".limitedParallelism(");
        return c7.a.q(sb2, this.f2968x, ')');
    }
}
