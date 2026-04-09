package x;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private HandlerThread f3387b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f3388c;

    /* renamed from: f, reason: collision with root package name */
    private final int f3391f;

    /* renamed from: g, reason: collision with root package name */
    private final int f3392g;

    /* renamed from: h, reason: collision with root package name */
    private final String f3393h;

    /* renamed from: a, reason: collision with root package name */
    private final Object f3386a = new Object();

    /* renamed from: e, reason: collision with root package name */
    private Handler.Callback f3390e = new a();

    /* renamed from: d, reason: collision with root package name */
    private int f3389d = 0;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                c.this.a();
                return true;
            }
            if (i2 != 1) {
                return true;
            }
            c.this.b((Runnable) message.obj);
            return true;
        }
    }

    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f3395b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Handler f3396c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f3397d;

        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f3399b;

            a(Object obj) {
                this.f3399b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f3397d.a(this.f3399b);
            }
        }

        b(Callable callable, Handler handler, d dVar) {
            this.f3395b = callable;
            this.f3396c = handler;
            this.f3397d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Exception {
            Object objCall;
            try {
                objCall = this.f3395b.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f3396c.post(new a(objCall));
        }
    }

    /* renamed from: x.c$c, reason: collision with other inner class name */
    class RunnableC0039c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f3401b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callable f3402c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReentrantLock f3403d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f3404e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Condition f3405f;

        RunnableC0039c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f3401b = atomicReference;
            this.f3402c = callable;
            this.f3403d = reentrantLock;
            this.f3404e = atomicBoolean;
            this.f3405f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f3401b.set(this.f3402c.call());
            } catch (Exception unused) {
            }
            this.f3403d.lock();
            try {
                this.f3404e.set(false);
                this.f3405f.signal();
            } finally {
                this.f3403d.unlock();
            }
        }
    }

    public interface d<T> {
        void a(T t2);
    }

    public c(String str, int i2, int i3) {
        this.f3393h = str;
        this.f3392g = i2;
        this.f3391f = i3;
    }

    private void c(Runnable runnable) {
        synchronized (this.f3386a) {
            if (this.f3387b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f3393h, this.f3392g);
                this.f3387b = handlerThread;
                handlerThread.start();
                this.f3388c = new Handler(this.f3387b.getLooper(), this.f3390e);
                this.f3389d++;
            }
            this.f3388c.removeMessages(0);
            Handler handler = this.f3388c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    void a() {
        synchronized (this.f3386a) {
            if (this.f3388c.hasMessages(1)) {
                return;
            }
            this.f3387b.quit();
            this.f3387b = null;
            this.f3388c = null;
        }
    }

    void b(Runnable runnable) {
        runnable.run();
        synchronized (this.f3386a) {
            this.f3388c.removeMessages(0);
            Handler handler = this.f3388c;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f3391f);
        }
    }

    public <T> void d(Callable<T> callable, d<T> dVar) {
        c(new b(callable, new Handler(), dVar));
    }

    public <T> T e(Callable<T> callable, int i2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        c(new RunnableC0039c(atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i2);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}
