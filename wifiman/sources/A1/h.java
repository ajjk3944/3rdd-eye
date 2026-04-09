package A1;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public abstract class h {

    private static class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f224a;

        a(Handler handler) {
            this.f224a = (Handler) E1.h.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f224a.post((Runnable) E1.h.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f224a + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
