package y4;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public abstract class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f48110b;

    public h() {
        this.f48110b = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e4) {
            TaskCompletionSource taskCompletionSource = this.f48110b;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e4);
            }
        }
    }

    public h(TaskCompletionSource taskCompletionSource) {
        this.f48110b = taskCompletionSource;
    }
}
