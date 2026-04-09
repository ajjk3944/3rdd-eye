package b4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1702a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f1703b;

    public /* synthetic */ n(Handler handler, int i4) {
        this.f1702a = i4;
        this.f1703b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1702a) {
            case 0:
                runnable.getClass();
                Handler handler = this.f1703b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                this.f1703b.post(runnable);
                return;
            case 2:
                this.f1703b.post(runnable);
                return;
            case 3:
                this.f1703b.post(runnable);
                return;
            default:
                this.f1703b.post(runnable);
                return;
        }
    }

    public n(int i4) {
        this.f1702a = i4;
        switch (i4) {
            case 3:
                this.f1703b = new Handler(Looper.getMainLooper());
                break;
            case 4:
                this.f1703b = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f1703b = new Handler(Looper.getMainLooper());
                break;
        }
    }
}
