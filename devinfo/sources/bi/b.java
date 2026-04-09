package bi;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f2263e;

    /* renamed from: i, reason: collision with root package name */
    public final c f2266i;

    /* renamed from: a, reason: collision with root package name */
    public final a f2259a = new a(0, this, false);

    /* renamed from: f, reason: collision with root package name */
    public final ReentrantLock f2264f = new ReentrantLock();
    public int g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f2265h = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final int f2261c = 4;

    /* renamed from: d, reason: collision with root package name */
    public final int f2262d = 10;

    /* renamed from: b, reason: collision with root package name */
    public final long f2260b = 60;

    public b(LinkedBlockingQueue linkedBlockingQueue, c cVar) {
        this.f2263e = linkedBlockingQueue;
        this.f2266i = cVar;
    }

    public final void a(Runnable runnable) {
        if (!this.f2263e.offer(runnable)) {
            throw new RejectedExecutionException();
        }
        ReentrantLock reentrantLock = this.f2264f;
        reentrantLock.lock();
        try {
            if (this.f2265h.get() > 0) {
                reentrantLock.unlock();
                return;
            }
            int i4 = this.g;
            if (i4 < this.f2262d) {
                int i10 = this.f2261c;
                boolean z3 = true;
                c cVar = this.f2266i;
                if (i4 < i10) {
                    cVar.newThread(new a(0, this, z3)).start();
                } else {
                    cVar.newThread(this.f2259a).start();
                }
                this.g++;
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
