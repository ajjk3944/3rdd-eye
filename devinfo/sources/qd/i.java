package qd;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f32248a;

    public i() {
        this.f32248a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e2) {
            TaskCompletionSource taskCompletionSource = this.f32248a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e2);
            }
        }
    }

    public i(TaskCompletionSource taskCompletionSource) {
        this.f32248a = taskCompletionSource;
    }
}
