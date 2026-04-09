package m9;

import android.os.HandlerThread;
import fg.AbstractC5824b;
import gg.y;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: m9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6783c {

    /* renamed from: a, reason: collision with root package name */
    public static final C6783c f53633a = new C6783c();

    /* renamed from: m9.c$a */
    public static final class a extends HandlerThread {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f53634a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f53635b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Semaphore f53636c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, int i10, Semaphore semaphore) {
            super(str, i10);
            this.f53634a = str;
            this.f53635b = i10;
            this.f53636c = semaphore;
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            this.f53636c.release();
        }
    }

    private C6783c() {
    }

    public static /* synthetic */ y d(C6783c c6783c, String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 10;
        }
        return c6783c.c(str, i10);
    }

    private final ThreadPoolExecutor f(int i10, long j10, final String str) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final ThreadGroup threadGroup = new ThreadGroup(str);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, j10, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: m9.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return C6783c.g(threadGroup, str, atomicInteger, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread g(ThreadGroup group, String poolName, AtomicInteger threadIndex, Runnable runnable) {
        AbstractC6492s.i(group, "$group");
        AbstractC6492s.i(poolName, "$poolName");
        AbstractC6492s.i(threadIndex, "$threadIndex");
        return new Thread(group, runnable, poolName + '[' + group.activeCount() + "](" + threadIndex.getAndIncrement() + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread i(String name, Runnable runnable) {
        AbstractC6492s.i(name, "$name");
        return new Thread(runnable, name);
    }

    public final y c(String name, int i10) {
        AbstractC6492s.i(name, "name");
        Semaphore semaphore = new Semaphore(0);
        a aVar = new a(name, i10, semaphore);
        aVar.start();
        semaphore.acquireUninterruptibly();
        y yVarC = AbstractC5824b.c(aVar.getLooper());
        AbstractC6492s.h(yVarC, "from(handlerThread.looper)");
        return yVarC;
    }

    public final y e(int i10, long j10, String poolName) {
        AbstractC6492s.i(poolName, "poolName");
        y yVarC = Gg.a.c(f(i10, j10, poolName), true, true);
        AbstractC6492s.h(yVarC, "from(\n            newThr…           true\n        )");
        return yVarC;
    }

    public final y h(final String name) {
        AbstractC6492s.i(name, "name");
        y yVarC = Gg.a.c(Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: m9.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return C6783c.i(name, runnable);
            }
        }), true, true);
        AbstractC6492s.h(yVarC, "from(\n            Execut…           true\n        )");
        return yVarC;
    }
}
