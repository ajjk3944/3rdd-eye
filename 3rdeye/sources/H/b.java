package H;

import java.util.concurrent.Executor;

/* compiled from: DirectExecutor.java */
/* loaded from: classes.dex */
public final class b implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static volatile b f1946b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
