package ke;

import ah.d;
import com.applovin.impl.da;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final da f28254a = new da(1);

    public static Task a(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        d dVar = new d(taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource, 8);
        da daVar = f28254a;
        task.continueWithTask(daVar, dVar);
        task2.continueWithTask(daVar, dVar);
        return taskCompletionSource.getTask();
    }
}
