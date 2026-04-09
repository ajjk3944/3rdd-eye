package O4;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ExecutorUtils.java */
/* loaded from: classes2.dex */
public final class L implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f10268b;

    /* compiled from: ExecutorUtils.java */
    public class a extends AbstractRunnableC1458d {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f10269b;

        public a(Runnable runnable) {
            this.f10269b = runnable;
        }

        @Override // O4.AbstractRunnableC1458d
        public final void a() {
            this.f10269b.run();
        }
    }

    public L(String str, AtomicLong atomicLong) {
        this.f10267a = str;
        this.f10268b = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new a(runnable));
        threadNewThread.setName(this.f10267a + this.f10268b.getAndIncrement());
        return threadNewThread;
    }
}
