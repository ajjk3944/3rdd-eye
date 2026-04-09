package Hg;

import gg.x;
import hg.InterfaceC6043c;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import r.Y;
import zg.AbstractC8755h;
import zg.C8748a;
import zg.EnumC8757j;

/* loaded from: classes4.dex */
public final class a extends d {

    /* renamed from: h, reason: collision with root package name */
    static final C0328a[] f7940h = new C0328a[0];

    /* renamed from: i, reason: collision with root package name */
    static final C0328a[] f7941i = new C0328a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference f7942a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference f7943b;

    /* renamed from: c, reason: collision with root package name */
    final ReadWriteLock f7944c;

    /* renamed from: d, reason: collision with root package name */
    final Lock f7945d;

    /* renamed from: e, reason: collision with root package name */
    final Lock f7946e;

    /* renamed from: f, reason: collision with root package name */
    final AtomicReference f7947f;

    /* renamed from: g, reason: collision with root package name */
    long f7948g;

    /* renamed from: Hg.a$a, reason: collision with other inner class name */
    static final class C0328a implements InterfaceC6043c, C8748a.InterfaceC2392a {

        /* renamed from: a, reason: collision with root package name */
        final x f7949a;

        /* renamed from: b, reason: collision with root package name */
        final a f7950b;

        /* renamed from: c, reason: collision with root package name */
        boolean f7951c;

        /* renamed from: d, reason: collision with root package name */
        boolean f7952d;

        /* renamed from: e, reason: collision with root package name */
        C8748a f7953e;

        /* renamed from: f, reason: collision with root package name */
        boolean f7954f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f7955g;

        /* renamed from: h, reason: collision with root package name */
        long f7956h;

        C0328a(x xVar, a aVar) {
            this.f7949a = xVar;
            this.f7950b = aVar;
        }

        void a() {
            if (this.f7955g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f7955g) {
                        return;
                    }
                    if (this.f7951c) {
                        return;
                    }
                    a aVar = this.f7950b;
                    Lock lock = aVar.f7945d;
                    lock.lock();
                    this.f7956h = aVar.f7948g;
                    Object obj = aVar.f7942a.get();
                    lock.unlock();
                    this.f7952d = obj != null;
                    this.f7951c = true;
                    if (obj == null || test(obj)) {
                        return;
                    }
                    b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b() {
            C8748a c8748a;
            while (!this.f7955g) {
                synchronized (this) {
                    try {
                        c8748a = this.f7953e;
                        if (c8748a == null) {
                            this.f7952d = false;
                            return;
                        }
                        this.f7953e = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                c8748a.d(this);
            }
        }

        void c(Object obj, long j10) {
            if (this.f7955g) {
                return;
            }
            if (!this.f7954f) {
                synchronized (this) {
                    try {
                        if (this.f7955g) {
                            return;
                        }
                        if (this.f7956h == j10) {
                            return;
                        }
                        if (this.f7952d) {
                            C8748a c8748a = this.f7953e;
                            if (c8748a == null) {
                                c8748a = new C8748a(4);
                                this.f7953e = c8748a;
                            }
                            c8748a.c(obj);
                            return;
                        }
                        this.f7951c = true;
                        this.f7954f = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (this.f7955g) {
                return;
            }
            this.f7955g = true;
            this.f7950b.p1(this);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f7955g;
        }

        @Override // zg.C8748a.InterfaceC2392a, kg.p
        public boolean test(Object obj) {
            return this.f7955g || EnumC8757j.accept(obj, this.f7949a);
        }
    }

    a(Object obj) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f7944c = reentrantReadWriteLock;
        this.f7945d = reentrantReadWriteLock.readLock();
        this.f7946e = reentrantReadWriteLock.writeLock();
        this.f7943b = new AtomicReference(f7940h);
        this.f7942a = new AtomicReference(obj);
        this.f7947f = new AtomicReference();
    }

    public static a k1() {
        return new a(null);
    }

    public static a l1(Object obj) {
        Objects.requireNonNull(obj, "defaultValue is null");
        return new a(obj);
    }

    @Override // gg.s
    protected void L0(x xVar) {
        C0328a c0328a = new C0328a(xVar, this);
        xVar.c(c0328a);
        if (j1(c0328a)) {
            if (c0328a.f7955g) {
                p1(c0328a);
                return;
            } else {
                c0328a.a();
                return;
            }
        }
        Throwable th2 = (Throwable) this.f7947f.get();
        if (th2 == AbstractC8755h.f67282a) {
            xVar.a();
        } else {
            xVar.onError(th2);
        }
    }

    @Override // gg.x
    public void a() {
        if (Y.a(this.f7947f, null, AbstractC8755h.f67282a)) {
            Object objComplete = EnumC8757j.complete();
            for (C0328a c0328a : r1(objComplete)) {
                c0328a.c(objComplete, this.f7948g);
            }
        }
    }

    @Override // gg.x
    public void c(InterfaceC6043c interfaceC6043c) {
        if (this.f7947f.get() != null) {
            interfaceC6043c.dispose();
        }
    }

    @Override // gg.x
    public void h(Object obj) {
        AbstractC8755h.c(obj, "onNext called with a null value.");
        if (this.f7947f.get() != null) {
            return;
        }
        Object next = EnumC8757j.next(obj);
        q1(next);
        for (C0328a c0328a : (C0328a[]) this.f7943b.get()) {
            c0328a.c(next, this.f7948g);
        }
    }

    boolean j1(C0328a c0328a) {
        C0328a[] c0328aArr;
        C0328a[] c0328aArr2;
        do {
            c0328aArr = (C0328a[]) this.f7943b.get();
            if (c0328aArr == f7941i) {
                return false;
            }
            int length = c0328aArr.length;
            c0328aArr2 = new C0328a[length + 1];
            System.arraycopy(c0328aArr, 0, c0328aArr2, 0, length);
            c0328aArr2[length] = c0328a;
        } while (!Y.a(this.f7943b, c0328aArr, c0328aArr2));
        return true;
    }

    public Object m1() {
        Object obj = this.f7942a.get();
        if (EnumC8757j.isComplete(obj) || EnumC8757j.isError(obj)) {
            return null;
        }
        return EnumC8757j.getValue(obj);
    }

    public boolean n1() {
        return EnumC8757j.isComplete(this.f7942a.get());
    }

    public boolean o1() {
        return EnumC8757j.isError(this.f7942a.get());
    }

    @Override // gg.x
    public void onError(Throwable th2) {
        AbstractC8755h.c(th2, "onError called with a null Throwable.");
        if (!Y.a(this.f7947f, null, th2)) {
            Eg.a.v(th2);
            return;
        }
        Object objError = EnumC8757j.error(th2);
        for (C0328a c0328a : r1(objError)) {
            c0328a.c(objError, this.f7948g);
        }
    }

    void p1(C0328a c0328a) {
        C0328a[] c0328aArr;
        C0328a[] c0328aArr2;
        do {
            c0328aArr = (C0328a[]) this.f7943b.get();
            int length = c0328aArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (c0328aArr[i10] == c0328a) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                c0328aArr2 = f7940h;
            } else {
                C0328a[] c0328aArr3 = new C0328a[length - 1];
                System.arraycopy(c0328aArr, 0, c0328aArr3, 0, i10);
                System.arraycopy(c0328aArr, i10 + 1, c0328aArr3, i10, (length - i10) - 1);
                c0328aArr2 = c0328aArr3;
            }
        } while (!Y.a(this.f7943b, c0328aArr, c0328aArr2));
    }

    void q1(Object obj) {
        this.f7946e.lock();
        this.f7948g++;
        this.f7942a.lazySet(obj);
        this.f7946e.unlock();
    }

    C0328a[] r1(Object obj) {
        q1(obj);
        return (C0328a[]) this.f7943b.getAndSet(f7941i);
    }
}
