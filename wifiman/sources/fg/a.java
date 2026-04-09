package Fg;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import r.Y;
import yg.EnumC8672g;
import zg.AbstractC8751d;
import zg.AbstractC8755h;
import zg.C8748a;
import zg.EnumC8757j;

/* loaded from: classes4.dex */
public final class a extends b {

    /* renamed from: i, reason: collision with root package name */
    static final Object[] f6626i = new Object[0];

    /* renamed from: j, reason: collision with root package name */
    static final C0269a[] f6627j = new C0269a[0];

    /* renamed from: k, reason: collision with root package name */
    static final C0269a[] f6628k = new C0269a[0];

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference f6629b;

    /* renamed from: c, reason: collision with root package name */
    final ReadWriteLock f6630c;

    /* renamed from: d, reason: collision with root package name */
    final Lock f6631d;

    /* renamed from: e, reason: collision with root package name */
    final Lock f6632e;

    /* renamed from: f, reason: collision with root package name */
    final AtomicReference f6633f;

    /* renamed from: g, reason: collision with root package name */
    final AtomicReference f6634g;

    /* renamed from: h, reason: collision with root package name */
    long f6635h;

    /* renamed from: Fg.a$a, reason: collision with other inner class name */
    static final class C0269a extends AtomicLong implements Dj.c, C8748a.InterfaceC2392a {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f6636a;

        /* renamed from: b, reason: collision with root package name */
        final a f6637b;

        /* renamed from: c, reason: collision with root package name */
        boolean f6638c;

        /* renamed from: d, reason: collision with root package name */
        boolean f6639d;

        /* renamed from: e, reason: collision with root package name */
        C8748a f6640e;

        /* renamed from: f, reason: collision with root package name */
        boolean f6641f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f6642g;

        /* renamed from: h, reason: collision with root package name */
        long f6643h;

        C0269a(Dj.b bVar, a aVar) {
            this.f6636a = bVar;
            this.f6637b = aVar;
        }

        void a() {
            if (this.f6642g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f6642g) {
                        return;
                    }
                    if (this.f6638c) {
                        return;
                    }
                    a aVar = this.f6637b;
                    Lock lock = aVar.f6631d;
                    lock.lock();
                    this.f6643h = aVar.f6635h;
                    Object obj = aVar.f6633f.get();
                    lock.unlock();
                    this.f6639d = obj != null;
                    this.f6638c = true;
                    if (obj == null || test(obj)) {
                        return;
                    }
                    c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void c() {
            C8748a c8748a;
            while (!this.f6642g) {
                synchronized (this) {
                    try {
                        c8748a = this.f6640e;
                        if (c8748a == null) {
                            this.f6639d = false;
                            return;
                        }
                        this.f6640e = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                c8748a.d(this);
            }
        }

        @Override // Dj.c
        public void cancel() {
            if (this.f6642g) {
                return;
            }
            this.f6642g = true;
            this.f6637b.n2(this);
        }

        void d(Object obj, long j10) {
            if (this.f6642g) {
                return;
            }
            if (!this.f6641f) {
                synchronized (this) {
                    try {
                        if (this.f6642g) {
                            return;
                        }
                        if (this.f6643h == j10) {
                            return;
                        }
                        if (this.f6639d) {
                            C8748a c8748a = this.f6640e;
                            if (c8748a == null) {
                                c8748a = new C8748a(4);
                                this.f6640e = c8748a;
                            }
                            c8748a.c(obj);
                            return;
                        }
                        this.f6638c = true;
                        this.f6641f = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        public boolean g() {
            return get() == 0;
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.a(this, j10);
            }
        }

        @Override // zg.C8748a.InterfaceC2392a, kg.p
        public boolean test(Object obj) {
            if (this.f6642g) {
                return true;
            }
            if (EnumC8757j.isComplete(obj)) {
                this.f6636a.a();
                return true;
            }
            if (EnumC8757j.isError(obj)) {
                this.f6636a.onError(EnumC8757j.getError(obj));
                return true;
            }
            long j10 = get();
            if (j10 == 0) {
                cancel();
                this.f6636a.onError(MissingBackpressureException.a());
                return true;
            }
            this.f6636a.h(EnumC8757j.getValue(obj));
            if (j10 == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
    }

    a() {
        this.f6633f = new AtomicReference();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f6630c = reentrantReadWriteLock;
        this.f6631d = reentrantReadWriteLock.readLock();
        this.f6632e = reentrantReadWriteLock.writeLock();
        this.f6629b = new AtomicReference(f6627j);
        this.f6634g = new AtomicReference();
    }

    public static a j2() {
        return new a();
    }

    public static a k2(Object obj) {
        Objects.requireNonNull(obj, "defaultValue is null");
        return new a(obj);
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        C0269a c0269a = new C0269a(bVar, this);
        bVar.j(c0269a);
        if (i2(c0269a)) {
            if (c0269a.f6642g) {
                n2(c0269a);
                return;
            } else {
                c0269a.a();
                return;
            }
        }
        Throwable th2 = (Throwable) this.f6634g.get();
        if (th2 == AbstractC8755h.f67282a) {
            bVar.a();
        } else {
            bVar.onError(th2);
        }
    }

    @Override // Dj.b
    public void a() {
        if (Y.a(this.f6634g, null, AbstractC8755h.f67282a)) {
            Object objComplete = EnumC8757j.complete();
            for (C0269a c0269a : p2(objComplete)) {
                c0269a.d(objComplete, this.f6635h);
            }
        }
    }

    @Override // Dj.b
    public void h(Object obj) {
        AbstractC8755h.c(obj, "onNext called with a null value.");
        if (this.f6634g.get() != null) {
            return;
        }
        Object next = EnumC8757j.next(obj);
        o2(next);
        for (C0269a c0269a : (C0269a[]) this.f6629b.get()) {
            c0269a.d(next, this.f6635h);
        }
    }

    boolean i2(C0269a c0269a) {
        C0269a[] c0269aArr;
        C0269a[] c0269aArr2;
        do {
            c0269aArr = (C0269a[]) this.f6629b.get();
            if (c0269aArr == f6628k) {
                return false;
            }
            int length = c0269aArr.length;
            c0269aArr2 = new C0269a[length + 1];
            System.arraycopy(c0269aArr, 0, c0269aArr2, 0, length);
            c0269aArr2[length] = c0269a;
        } while (!Y.a(this.f6629b, c0269aArr, c0269aArr2));
        return true;
    }

    @Override // Dj.b, gg.l
    public void j(Dj.c cVar) {
        if (this.f6634g.get() != null) {
            cVar.cancel();
        } else {
            cVar.request(Long.MAX_VALUE);
        }
    }

    public Object l2() {
        Object obj = this.f6633f.get();
        if (EnumC8757j.isComplete(obj) || EnumC8757j.isError(obj)) {
            return null;
        }
        return EnumC8757j.getValue(obj);
    }

    public boolean m2(Object obj) {
        AbstractC8755h.c(obj, "offer called with a null value.");
        C0269a[] c0269aArr = (C0269a[]) this.f6629b.get();
        for (C0269a c0269a : c0269aArr) {
            if (c0269a.g()) {
                return false;
            }
        }
        Object next = EnumC8757j.next(obj);
        o2(next);
        for (C0269a c0269a2 : c0269aArr) {
            c0269a2.d(next, this.f6635h);
        }
        return true;
    }

    void n2(C0269a c0269a) {
        C0269a[] c0269aArr;
        C0269a[] c0269aArr2;
        do {
            c0269aArr = (C0269a[]) this.f6629b.get();
            int length = c0269aArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (c0269aArr[i10] == c0269a) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                c0269aArr2 = f6627j;
            } else {
                C0269a[] c0269aArr3 = new C0269a[length - 1];
                System.arraycopy(c0269aArr, 0, c0269aArr3, 0, i10);
                System.arraycopy(c0269aArr, i10 + 1, c0269aArr3, i10, (length - i10) - 1);
                c0269aArr2 = c0269aArr3;
            }
        } while (!Y.a(this.f6629b, c0269aArr, c0269aArr2));
    }

    void o2(Object obj) {
        Lock lock = this.f6632e;
        lock.lock();
        this.f6635h++;
        this.f6633f.lazySet(obj);
        lock.unlock();
    }

    @Override // Dj.b
    public void onError(Throwable th2) {
        AbstractC8755h.c(th2, "onError called with a null Throwable.");
        if (!Y.a(this.f6634g, null, th2)) {
            Eg.a.v(th2);
            return;
        }
        Object objError = EnumC8757j.error(th2);
        for (C0269a c0269a : p2(objError)) {
            c0269a.d(objError, this.f6635h);
        }
    }

    C0269a[] p2(Object obj) {
        o2(obj);
        return (C0269a[]) this.f6629b.getAndSet(f6628k);
    }

    a(Object obj) {
        this();
        this.f6633f.lazySet(obj);
    }
}
