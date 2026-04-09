package bi;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import je.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2267a;

    /* renamed from: b, reason: collision with root package name */
    public final Number f2268b;

    public c(int i4) {
        this.f2267a = i4;
        switch (i4) {
            case 1:
                this.f2268b = new AtomicInteger(0);
                break;
            default:
                this.f2268b = new AtomicInteger(1);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f2267a) {
            case 0:
                Thread thread = new Thread(runnable, "DI_ThreadPool-" + ((AtomicInteger) this.f2268b).getAndIncrement());
                thread.setPriority(4);
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                thread2.setName("arch_disk_io_" + ((AtomicInteger) this.f2268b).getAndIncrement());
                return thread2;
            default:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new v(runnable));
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f2268b).getAndIncrement());
                return threadNewThread;
        }
    }

    public c(AtomicLong atomicLong) {
        this.f2267a = 2;
        this.f2268b = atomicLong;
    }
}
