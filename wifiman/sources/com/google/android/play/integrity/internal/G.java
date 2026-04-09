package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public abstract class G implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f38114a;

    G() {
        this.f38114a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f38114a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    protected abstract void b();

    final TaskCompletionSource c() {
        return this.f38114a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public G(TaskCompletionSource taskCompletionSource) {
        this.f38114a = taskCompletionSource;
    }
}
