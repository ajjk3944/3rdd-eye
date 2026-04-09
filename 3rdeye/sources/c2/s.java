package c2;

import e2.InterfaceExecutorC4305a;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* compiled from: SerialExecutorImpl.java */
/* loaded from: classes.dex */
public final class s implements InterfaceExecutorC4305a {

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f18428c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f18429d;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<a> f18427b = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    public final Object f18430e = new Object();

    /* compiled from: SerialExecutorImpl.java */
    public static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final s f18431b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f18432c;

        public a(s sVar, Runnable runnable) {
            this.f18431b = sVar;
            this.f18432c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f18432c.run();
                synchronized (this.f18431b.f18430e) {
                    this.f18431b.b();
                }
            } catch (Throwable th) {
                synchronized (this.f18431b.f18430e) {
                    this.f18431b.b();
                    throw th;
                }
            }
        }
    }

    public s(ExecutorService executorService) {
        this.f18428c = executorService;
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f18430e) {
            z10 = !this.f18427b.isEmpty();
        }
        return z10;
    }

    public final void b() {
        a aVarPoll = this.f18427b.poll();
        this.f18429d = aVarPoll;
        if (aVarPoll != null) {
            this.f18428c.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f18430e) {
            try {
                this.f18427b.add(new a(this, runnable));
                if (this.f18429d == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
