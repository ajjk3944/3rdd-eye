package u4;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public abstract class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f46573b;

    public m() {
        this.f46573b = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e4) {
            TaskCompletionSource taskCompletionSource = this.f46573b;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e4);
            }
        }
    }

    public m(TaskCompletionSource taskCompletionSource) {
        this.f46573b = taskCompletionSource;
    }
}
