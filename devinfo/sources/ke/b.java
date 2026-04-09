package ke;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import je.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f28255a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28256b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public Task f28257c = Tasks.forResult(null);

    public b(ExecutorService executorService) {
        this.f28255a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.f28256b) {
            taskContinueWithTask = this.f28257c.continueWithTask(this.f28255a, new ca.b(28, runnable));
            this.f28257c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public final Task b(k kVar) {
        Task taskContinueWithTask;
        synchronized (this.f28256b) {
            taskContinueWithTask = this.f28257c.continueWithTask(this.f28255a, new ca.b(27, kVar));
            this.f28257c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f28255a.execute(runnable);
    }
}
