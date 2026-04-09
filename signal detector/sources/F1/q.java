package f1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class q implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public int f20076a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
        threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f20076a);
        this.f20076a = this.f20076a + 1;
        return threadNewThread;
    }
}
