package u2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: LottieThreadFactory.java */
/* renamed from: u2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC5625d implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f46541d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final ThreadGroup f46542a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f46543b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    public final String f46544c;

    public ThreadFactoryC5625d() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f46542a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f46544c = "lottie-" + f46541d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f46542a, runnable, this.f46544c + this.f46543b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
