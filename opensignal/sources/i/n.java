package i;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11095a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f11096d = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final dd.o f11097g;

    /* renamed from: r, reason: collision with root package name */
    public Runnable f11098r;

    public n(dd.o oVar) {
        this.f11097g = oVar;
    }

    public final void a() {
        synchronized (this.f11095a) {
            try {
                Runnable runnable = (Runnable) this.f11096d.poll();
                this.f11098r = runnable;
                if (runnable != null) {
                    this.f11097g.execute(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f11095a) {
            try {
                this.f11096d.add(new a5.o(this, 17, runnable));
                if (this.f11098r == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
