package L4;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class e implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f11224a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f11225b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private Task f11226c = Tasks.forResult(null);

    e(ExecutorService executorService) {
        this.f11224a = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task d(Runnable runnable, Task task) {
        runnable.run();
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task e(Callable callable, Task task) {
        return (Task) callable.call();
    }

    public ExecutorService c() {
        return this.f11224a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f11224a.execute(runnable);
    }

    public Task f(final Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.f11225b) {
            taskContinueWithTask = this.f11226c.continueWithTask(this.f11224a, new Continuation() { // from class: L4.d
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return e.d(runnable, task);
                }
            });
            this.f11226c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public Task h(final Callable callable) {
        Task taskContinueWithTask;
        synchronized (this.f11225b) {
            taskContinueWithTask = this.f11226c.continueWithTask(this.f11224a, new Continuation() { // from class: L4.c
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return e.e(callable, task);
                }
            });
            this.f11226c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }
}
