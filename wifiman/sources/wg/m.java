package wg;

import hg.InterfaceC6043c;
import hg.InterfaceC6044d;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes4.dex */
public final class m extends AtomicReferenceArray implements Runnable, Callable, InterfaceC6043c {

    /* renamed from: c, reason: collision with root package name */
    static final Object f64976c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final Object f64977d = new Object();

    /* renamed from: e, reason: collision with root package name */
    static final Object f64978e = new Object();

    /* renamed from: f, reason: collision with root package name */
    static final Object f64979f = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Runnable f64980a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f64981b;

    public m(Runnable runnable, InterfaceC6044d interfaceC6044d) {
        this(runnable, interfaceC6044d, true);
    }

    public void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f64979f) {
                return;
            }
            if (obj == f64977d) {
                future.cancel(false);
                return;
            } else if (obj == f64978e) {
                future.cancel(this.f64981b);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f64979f || obj5 == (obj3 = f64977d) || obj5 == (obj4 = f64978e)) {
                break;
            }
            boolean z10 = get(2) != Thread.currentThread();
            if (z10) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z10 && this.f64981b);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f64979f || obj == (obj2 = f64976c) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((InterfaceC6044d) obj).c(this);
    }

    @Override // hg.InterfaceC6043c
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == f64976c || obj == f64979f;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f64980a.run();
            Object obj3 = get(0);
            if (obj3 != f64976c && compareAndSet(0, obj3, f64979f) && obj3 != null) {
                ((InterfaceC6044d) obj3).c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f64977d || obj2 == f64978e) {
                    break;
                }
            } while (!compareAndSet(1, obj2, f64979f));
            lazySet(2, null);
        } catch (Throwable th2) {
            try {
                Eg.a.v(th2);
                throw th2;
            } catch (Throwable th3) {
                Object obj4 = get(0);
                if (obj4 != f64976c && compareAndSet(0, obj4, f64979f) && obj4 != null) {
                    ((InterfaceC6044d) obj4).c(this);
                }
                do {
                    obj = get(1);
                    if (obj == f64977d || obj == f64978e) {
                        break;
                    }
                } while (!compareAndSet(1, obj, f64979f));
                lazySet(2, null);
                throw th3;
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReferenceArray
    public String toString() {
        String str;
        Object obj = get(1);
        if (obj == f64979f) {
            str = "Finished";
        } else if (obj == f64977d) {
            str = "Disposed(Sync)";
        } else if (obj == f64978e) {
            str = "Disposed(Async)";
        } else {
            Object obj2 = get(2);
            if (obj2 == null) {
                str = "Waiting";
            } else {
                str = "Running on " + obj2;
            }
        }
        return m.class.getSimpleName() + "[" + str + "]";
    }

    public m(Runnable runnable, InterfaceC6044d interfaceC6044d, boolean z10) {
        super(3);
        this.f64980a = runnable;
        this.f64981b = z10;
        lazySet(0, interfaceC6044d);
    }
}
