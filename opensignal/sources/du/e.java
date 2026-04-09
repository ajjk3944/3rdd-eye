package du;

import bu.u;
import java.util.concurrent.Executor;
import wt.l0;
import wt.q;

/* loaded from: classes.dex */
public final class e extends l0 implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public static final e f7570g = new e();

    /* renamed from: r, reason: collision with root package name */
    public static final q f7571r;

    static {
        m mVar = m.f7584g;
        int i10 = u.f2991a;
        if (64 >= i10) {
            i10 = 64;
        }
        f7571r = mVar.q0(bu.a.j("kotlinx.coroutines.io.parallelism", i10, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        n0(pq.i.f20621a, runnable);
    }

    @Override // wt.q
    public final void n0(pq.h hVar, Runnable runnable) {
        f7571r.n0(hVar, runnable);
    }

    @Override // wt.q
    public final void o0(pq.h hVar, Runnable runnable) {
        f7571r.o0(hVar, runnable);
    }

    @Override // wt.q
    public final q q0(int i10) {
        return m.f7584g.q0(1);
    }

    @Override // wt.q
    public final String toString() {
        return "Dispatchers.IO";
    }
}
