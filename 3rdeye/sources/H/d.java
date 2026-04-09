package H;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: HighPriorityExecutor.java */
/* loaded from: classes.dex */
public final class d implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static volatile d f1957c;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f1958b = Executors.newSingleThreadExecutor(new a());

    /* compiled from: HighPriorityExecutor.java */
    public class a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1958b.execute(runnable);
    }
}
