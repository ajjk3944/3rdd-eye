package L4;

import androidx.privacysandbox.ads.adservices.measurement.k;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f11221a = new k();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task b(TaskCompletionSource taskCompletionSource, AtomicBoolean atomicBoolean, CancellationTokenSource cancellationTokenSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
        } else if (task.getException() != null) {
            taskCompletionSource.trySetException(task.getException());
        } else if (atomicBoolean.getAndSet(true)) {
            cancellationTokenSource.cancel();
        }
        return Tasks.forResult(null);
    }

    public static Task c(Task task, Task task2) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Continuation continuation = new Continuation() { // from class: L4.a
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return b.b(taskCompletionSource, atomicBoolean, cancellationTokenSource, task3);
            }
        };
        Executor executor = f11221a;
        task.continueWithTask(executor, continuation);
        task2.continueWithTask(executor, continuation);
        return taskCompletionSource.getTask();
    }
}
