package n0;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public abstract class e {

    public static class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f23512a;

        public a(Handler handler) {
            this.f23512a = (Handler) r0.i.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f23512a.post((Runnable) r0.i.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f23512a + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
