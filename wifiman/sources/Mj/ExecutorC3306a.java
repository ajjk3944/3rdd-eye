package Mj;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: Mj.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class ExecutorC3306a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f13321a = new Handler(Looper.getMainLooper());

    ExecutorC3306a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f13321a.post(runnable);
    }
}
