package k4;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public abstract class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f51202a;

    j() {
        this.f51202a = null;
    }

    protected abstract void a();

    final TaskCompletionSource b() {
        return this.f51202a;
    }

    public final void c(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f51202a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            c(e10);
        }
    }

    public j(TaskCompletionSource taskCompletionSource) {
        this.f51202a = taskCompletionSource;
    }
}
