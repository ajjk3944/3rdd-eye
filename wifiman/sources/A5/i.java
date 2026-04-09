package A5;

import D3.AbstractExecutorServiceC2578t;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s3.AbstractC7901p;

/* loaded from: classes3.dex */
public class i extends AbstractExecutorServiceC2578t {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f332b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f333a;

    public i() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: A5.t
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: A5.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.d(runnable);
                    }
                });
            }
        });
        this.f333a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    static /* synthetic */ void d(Runnable runnable) {
        f332b.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Deque deque, Runnable runnable) {
        AbstractC7901p.l(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // D3.U
    protected final /* synthetic */ Object a() {
        return this.f333a;
    }

    @Override // D3.AbstractExecutorServiceC2578t
    protected final ExecutorService b() {
        return this.f333a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f332b.get();
        if (deque == null || deque.size() > 1) {
            this.f333a.execute(new Runnable() { // from class: A5.s
                @Override // java.lang.Runnable
                public final void run() {
                    i.e((Deque) i.f332b.get(), runnable);
                }
            });
        } else {
            e(deque, runnable);
        }
    }
}
