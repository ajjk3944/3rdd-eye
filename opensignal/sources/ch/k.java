package ch;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class k implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f3958d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f3959a;

    /* renamed from: b, reason: collision with root package name */
    public final j f3960b;

    /* renamed from: c, reason: collision with root package name */
    public final q3.a f3961c;

    public k(String str, j jVar, q3.a aVar) {
        this.f3959a = str;
        this.f3960b = jVar;
        this.f3961c = aVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(this.f3959a + f3958d.getAndIncrement());
        if (((ak.g) this.f3961c.f20680g).f529f.f449a.f486q == 2) {
            thread.setUncaughtExceptionHandler(this.f3960b);
        }
        return thread;
    }
}
