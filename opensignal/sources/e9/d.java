package e9;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f7983d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final ThreadGroup f7984a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f7985b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    public final String f7986c;

    public d() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f7984a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f7986c = "lottie-" + f7983d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f7984a, runnable, this.f7986c + this.f7985b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
