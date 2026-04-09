package y3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: SafeLoggingExecutor.java */
/* loaded from: classes.dex */
public final class p implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f48091b;

    /* compiled from: SafeLoggingExecutor.java */
    public static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f48092b;

        public a(Runnable runnable) {
            this.f48092b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f48092b.run();
            } catch (Exception e4) {
                C3.a.b("Executor", "Background execution failure.", e4);
            }
        }
    }

    public p(ExecutorService executorService) {
        this.f48091b = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f48091b.execute(new a(runnable));
    }
}
