package wg;

import gg.y;
import hg.C6042b;
import hg.InterfaceC6043c;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import lg.C6594d;
import lg.EnumC6593c;
import r.Y;

/* loaded from: classes4.dex */
public final class b extends y {

    /* renamed from: e, reason: collision with root package name */
    static final C2300b f64906e;

    /* renamed from: f, reason: collision with root package name */
    static final j f64907f;

    /* renamed from: g, reason: collision with root package name */
    static final int f64908g = i(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx3.computation-threads", 0).intValue());

    /* renamed from: h, reason: collision with root package name */
    static final c f64909h;

    /* renamed from: c, reason: collision with root package name */
    final ThreadFactory f64910c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference f64911d;

    static final class a extends y.c {

        /* renamed from: a, reason: collision with root package name */
        private final C6594d f64912a;

        /* renamed from: b, reason: collision with root package name */
        private final C6042b f64913b;

        /* renamed from: c, reason: collision with root package name */
        private final C6594d f64914c;

        /* renamed from: d, reason: collision with root package name */
        private final c f64915d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f64916e;

        a(c cVar) {
            this.f64915d = cVar;
            C6594d c6594d = new C6594d();
            this.f64912a = c6594d;
            C6042b c6042b = new C6042b();
            this.f64913b = c6042b;
            C6594d c6594d2 = new C6594d();
            this.f64914c = c6594d2;
            c6594d2.a(c6594d);
            c6594d2.a(c6042b);
        }

        @Override // gg.y.c
        public InterfaceC6043c b(Runnable runnable) {
            return this.f64916e ? EnumC6593c.INSTANCE : this.f64915d.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f64912a);
        }

        @Override // gg.y.c
        public InterfaceC6043c c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f64916e ? EnumC6593c.INSTANCE : this.f64915d.e(runnable, j10, timeUnit, this.f64913b);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (this.f64916e) {
                return;
            }
            this.f64916e = true;
            this.f64914c.dispose();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f64916e;
        }
    }

    /* renamed from: wg.b$b, reason: collision with other inner class name */
    static final class C2300b {

        /* renamed from: a, reason: collision with root package name */
        final int f64917a;

        /* renamed from: b, reason: collision with root package name */
        final c[] f64918b;

        /* renamed from: c, reason: collision with root package name */
        long f64919c;

        C2300b(int i10, ThreadFactory threadFactory) {
            this.f64917a = i10;
            this.f64918b = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f64918b[i11] = new c(threadFactory);
            }
        }

        public c a() {
            int i10 = this.f64917a;
            if (i10 == 0) {
                return b.f64909h;
            }
            c[] cVarArr = this.f64918b;
            long j10 = this.f64919c;
            this.f64919c = 1 + j10;
            return cVarArr[(int) (j10 % i10)];
        }

        public void b() {
            for (c cVar : this.f64918b) {
                cVar.dispose();
            }
        }
    }

    static final class c extends h {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new j("RxComputationShutdown"));
        f64909h = cVar;
        cVar.dispose();
        j jVar = new j("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        f64907f = jVar;
        C2300b c2300b = new C2300b(0, jVar);
        f64906e = c2300b;
        c2300b.b();
    }

    public b() {
        this(f64907f);
    }

    static int i(int i10, int i11) {
        return (i11 <= 0 || i11 > i10) ? i10 : i11;
    }

    @Override // gg.y
    public y.c c() {
        return new a(((C2300b) this.f64911d.get()).a());
    }

    @Override // gg.y
    public InterfaceC6043c f(Runnable runnable, long j10, TimeUnit timeUnit) {
        return ((C2300b) this.f64911d.get()).a().f(runnable, j10, timeUnit);
    }

    @Override // gg.y
    public InterfaceC6043c g(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return ((C2300b) this.f64911d.get()).a().g(runnable, j10, j11, timeUnit);
    }

    @Override // gg.y
    public void h() {
        AtomicReference atomicReference = this.f64911d;
        C2300b c2300b = f64906e;
        C2300b c2300b2 = (C2300b) atomicReference.getAndSet(c2300b);
        if (c2300b2 != c2300b) {
            c2300b2.b();
        }
    }

    public void j() {
        C2300b c2300b = new C2300b(f64908g, this.f64910c);
        if (Y.a(this.f64911d, f64906e, c2300b)) {
            return;
        }
        c2300b.b();
    }

    public b(ThreadFactory threadFactory) {
        this.f64910c = threadFactory;
        this.f64911d = new AtomicReference(f64906e);
        j();
    }
}
