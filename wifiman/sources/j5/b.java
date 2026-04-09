package J5;

import J5.a;
import gg.x;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import r.Y;

/* loaded from: classes3.dex */
public final class b extends d {

    /* renamed from: f, reason: collision with root package name */
    private static final Object[] f9764f = new Object[0];

    /* renamed from: g, reason: collision with root package name */
    static final a[] f9765g = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference f9766a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference f9767b;

    /* renamed from: c, reason: collision with root package name */
    final Lock f9768c;

    /* renamed from: d, reason: collision with root package name */
    final Lock f9769d;

    /* renamed from: e, reason: collision with root package name */
    long f9770e;

    static final class a implements InterfaceC6043c, a.InterfaceC0390a {

        /* renamed from: a, reason: collision with root package name */
        final x f9771a;

        /* renamed from: b, reason: collision with root package name */
        final b f9772b;

        /* renamed from: c, reason: collision with root package name */
        boolean f9773c;

        /* renamed from: d, reason: collision with root package name */
        boolean f9774d;

        /* renamed from: e, reason: collision with root package name */
        J5.a f9775e;

        /* renamed from: f, reason: collision with root package name */
        boolean f9776f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f9777g;

        /* renamed from: h, reason: collision with root package name */
        long f9778h;

        a(x xVar, b bVar) {
            this.f9771a = xVar;
            this.f9772b = bVar;
        }

        void a() {
            if (this.f9777g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f9777g) {
                        return;
                    }
                    if (this.f9773c) {
                        return;
                    }
                    b bVar = this.f9772b;
                    Lock lock = bVar.f9768c;
                    lock.lock();
                    this.f9778h = bVar.f9770e;
                    Object obj = bVar.f9766a.get();
                    lock.unlock();
                    this.f9774d = obj != null;
                    this.f9773c = true;
                    if (obj != null) {
                        test(obj);
                        b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b() {
            J5.a aVar;
            while (!this.f9777g) {
                synchronized (this) {
                    try {
                        aVar = this.f9775e;
                        if (aVar == null) {
                            this.f9774d = false;
                            return;
                        }
                        this.f9775e = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                aVar.c(this);
            }
        }

        void c(Object obj, long j10) {
            if (this.f9777g) {
                return;
            }
            if (!this.f9776f) {
                synchronized (this) {
                    try {
                        if (this.f9777g) {
                            return;
                        }
                        if (this.f9778h == j10) {
                            return;
                        }
                        if (this.f9774d) {
                            J5.a aVar = this.f9775e;
                            if (aVar == null) {
                                aVar = new J5.a(4);
                                this.f9775e = aVar;
                            }
                            aVar.b(obj);
                            return;
                        }
                        this.f9773c = true;
                        this.f9776f = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (this.f9777g) {
                return;
            }
            this.f9777g = true;
            this.f9772b.n1(this);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f9777g;
        }

        @Override // J5.a.InterfaceC0390a, kg.p
        public boolean test(Object obj) {
            if (this.f9777g) {
                return false;
            }
            this.f9771a.h(obj);
            return false;
        }
    }

    b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f9768c = reentrantReadWriteLock.readLock();
        this.f9769d = reentrantReadWriteLock.writeLock();
        this.f9767b = new AtomicReference(f9765g);
        this.f9766a = new AtomicReference();
    }

    public static b l1() {
        return new b();
    }

    public static b m1(Object obj) {
        return new b(obj);
    }

    @Override // gg.s
    protected void L0(x xVar) {
        a aVar = new a(xVar, this);
        xVar.c(aVar);
        k1(aVar);
        if (aVar.f9777g) {
            n1(aVar);
        } else {
            aVar.a();
        }
    }

    @Override // J5.d, kg.InterfaceC6469f
    public void accept(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value == null");
        }
        o1(obj);
        for (a aVar : (a[]) this.f9767b.get()) {
            aVar.c(obj, this.f9770e);
        }
    }

    @Override // J5.d
    public boolean i1() {
        return ((a[]) this.f9767b.get()).length != 0;
    }

    void k1(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f9767b.get();
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!Y.a(this.f9767b, aVarArr, aVarArr2));
    }

    void n1(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f9767b.get();
            int length = aVarArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (aVarArr[i10] == aVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr2 = f9765g;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!Y.a(this.f9767b, aVarArr, aVarArr2));
    }

    void o1(Object obj) {
        this.f9769d.lock();
        this.f9770e++;
        this.f9766a.lazySet(obj);
        this.f9769d.unlock();
    }

    b(Object obj) {
        this();
        if (obj != null) {
            this.f9766a.lazySet(obj);
            return;
        }
        throw new NullPointerException("defaultValue == null");
    }
}
