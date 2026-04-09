package U9;

import Y9.e;
import b9.C1992A;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Dispatcher.kt */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f12691a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<e.a> f12692b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque<e.a> f12693c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque<Y9.e> f12694d = new ArrayDeque<>();

    public final synchronized ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (this.f12691a == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = V9.b.f13059g + " Dispatcher";
                kotlin.jvm.internal.l.f(name, "name");
                this.f12691a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new V9.a(name, false));
            }
            threadPoolExecutor = this.f12691a;
            kotlin.jvm.internal.l.c(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public final void b(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            C1992A c1992a = C1992A.f18074a;
        }
        d();
    }

    public final void c(e.a aVar) {
        aVar.f13853c.decrementAndGet();
        b(this.f12693c, aVar);
    }

    public final void d() {
        byte[] bArr = V9.b.f13053a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<e.a> it = this.f12692b.iterator();
                kotlin.jvm.internal.l.e(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    e.a next = it.next();
                    if (this.f12693c.size() >= 64) {
                        break;
                    }
                    if (next.f13853c.get() < 5) {
                        it.remove();
                        next.f13853c.incrementAndGet();
                        arrayList.add(next);
                        this.f12693c.add(next);
                    }
                }
                e();
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e.a aVar = (e.a) arrayList.get(i);
            ExecutorService executorServiceA = a();
            aVar.getClass();
            Y9.e eVar = Y9.e.this;
            m mVar = eVar.f13836b.f12750b;
            byte[] bArr2 = V9.b.f13053a;
            try {
                try {
                    ((ThreadPoolExecutor) executorServiceA).execute(aVar);
                } catch (RejectedExecutionException e4) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e4);
                    eVar.h(interruptedIOException);
                    aVar.f13852b.onFailure(eVar, interruptedIOException);
                    eVar.f13836b.f12750b.c(aVar);
                }
            } catch (Throwable th2) {
                eVar.f13836b.f12750b.c(aVar);
                throw th2;
            }
        }
    }

    public final synchronized int e() {
        return this.f12693c.size() + this.f12694d.size();
    }
}
