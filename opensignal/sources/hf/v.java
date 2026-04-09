package hf;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class v implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10720a;

    /* renamed from: b, reason: collision with root package name */
    public final Number f10721b;

    public v() {
        this.f10720a = 1;
        this.f10721b = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f10720a) {
            case 0:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new u(runnable));
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f10721b).getAndIncrement());
                return threadNewThread;
            default:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f10721b).getAndIncrement());
                return thread;
        }
    }

    public v(AtomicLong atomicLong) {
        this.f10720a = 0;
        this.f10721b = atomicLong;
    }
}
