package c3;

import g3.AbstractC5861a;
import java.util.concurrent.Executor;

/* renamed from: c3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class ExecutorC4213n implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f33814a;

    /* renamed from: c3.n$a */
    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f33815a;

        a(Runnable runnable) {
            this.f33815a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f33815a.run();
            } catch (Exception e10) {
                AbstractC5861a.c("Executor", "Background execution failure.", e10);
            }
        }
    }

    ExecutorC4213n(Executor executor) {
        this.f33814a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f33814a.execute(new a(runnable));
    }
}
