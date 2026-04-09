package bc;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2642a;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f2643d;

    public /* synthetic */ q(Handler handler, int i10) {
        this.f2642a = i10;
        this.f2643d = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2642a) {
            case 0:
                this.f2643d.post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = this.f2643d;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }
}
