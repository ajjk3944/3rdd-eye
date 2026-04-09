package L2;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2519a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f2520b;

    public /* synthetic */ i(Handler handler, int i) {
        this.f2519a = i;
        this.f2520b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2519a) {
            case 0:
                this.f2520b.post(runnable);
                return;
            case 1:
                runnable.getClass();
                Handler handler = this.f2520b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                this.f2520b.post(runnable);
                return;
        }
    }
}
