package x3;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class m implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f24950a;

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f24951a;

        public a(Runnable runnable) {
            this.f24951a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f24951a.run();
            } catch (Exception e10) {
                b4.a.d("Executor", "Background execution failure.", e10);
            }
        }
    }

    public m(Executor executor) {
        this.f24950a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f24950a.execute(new a(runnable));
    }
}
