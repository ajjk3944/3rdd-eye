package r7;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f32853d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final ThreadGroup f32854a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f32855b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    public final String f32856c;

    public e() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f32854a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f32856c = "lottie-" + f32853d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f32854a, runnable, this.f32856c + this.f32855b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
