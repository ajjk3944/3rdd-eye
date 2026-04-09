package tg;

import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kg.InterfaceC6469f;
import lg.C6595e;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class U extends gg.s {

    /* renamed from: a, reason: collision with root package name */
    final Bg.a f62214a;

    /* renamed from: b, reason: collision with root package name */
    final int f62215b;

    /* renamed from: c, reason: collision with root package name */
    final long f62216c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f62217d;

    /* renamed from: e, reason: collision with root package name */
    final gg.y f62218e;

    /* renamed from: f, reason: collision with root package name */
    a f62219f;

    static final class a extends AtomicReference implements Runnable, InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final U f62220a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6043c f62221b;

        /* renamed from: c, reason: collision with root package name */
        long f62222c;

        /* renamed from: d, reason: collision with root package name */
        boolean f62223d;

        /* renamed from: e, reason: collision with root package name */
        boolean f62224e;

        a(U u10) {
            this.f62220a = u10;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.replace(this, interfaceC6043c);
            synchronized (this.f62220a) {
                try {
                    if (this.f62224e) {
                        this.f62220a.f62214a.o1();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f62220a.k1(this);
        }
    }

    static final class b extends AtomicBoolean implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62225a;

        /* renamed from: b, reason: collision with root package name */
        final U f62226b;

        /* renamed from: c, reason: collision with root package name */
        final a f62227c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC6043c f62228d;

        b(gg.x xVar, U u10, a aVar) {
            this.f62225a = xVar;
            this.f62226b = u10;
            this.f62227c = aVar;
        }

        @Override // gg.x
        public void a() {
            if (compareAndSet(false, true)) {
                this.f62226b.j1(this.f62227c);
                this.f62225a.a();
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62228d, interfaceC6043c)) {
                this.f62228d = interfaceC6043c;
                this.f62225a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62228d.dispose();
            if (compareAndSet(false, true)) {
                this.f62226b.i1(this.f62227c);
            }
        }

        @Override // gg.x
        public void h(Object obj) {
            this.f62225a.h(obj);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62228d.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                Eg.a.v(th2);
            } else {
                this.f62226b.j1(this.f62227c);
                this.f62225a.onError(th2);
            }
        }
    }

    public U(Bg.a aVar) {
        this(aVar, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        a aVar;
        boolean z10;
        InterfaceC6043c interfaceC6043c;
        synchronized (this) {
            try {
                aVar = this.f62219f;
                if (aVar == null) {
                    aVar = new a(this);
                    this.f62219f = aVar;
                }
                long j10 = aVar.f62222c;
                if (j10 == 0 && (interfaceC6043c = aVar.f62221b) != null) {
                    interfaceC6043c.dispose();
                }
                long j11 = j10 + 1;
                aVar.f62222c = j11;
                if (aVar.f62223d || j11 != this.f62215b) {
                    z10 = false;
                } else {
                    z10 = true;
                    aVar.f62223d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f62214a.d(new b(xVar, this, aVar));
        if (z10) {
            this.f62214a.k1(aVar);
        }
    }

    void i1(a aVar) {
        synchronized (this) {
            try {
                a aVar2 = this.f62219f;
                if (aVar2 != null && aVar2 == aVar) {
                    long j10 = aVar.f62222c - 1;
                    aVar.f62222c = j10;
                    if (j10 == 0 && aVar.f62223d) {
                        if (this.f62216c == 0) {
                            k1(aVar);
                            return;
                        }
                        C6595e c6595e = new C6595e();
                        aVar.f62221b = c6595e;
                        c6595e.a(this.f62218e.f(aVar, this.f62216c, this.f62217d));
                    }
                }
            } finally {
            }
        }
    }

    void j1(a aVar) {
        synchronized (this) {
            try {
                if (this.f62219f == aVar) {
                    InterfaceC6043c interfaceC6043c = aVar.f62221b;
                    if (interfaceC6043c != null) {
                        interfaceC6043c.dispose();
                        aVar.f62221b = null;
                    }
                    long j10 = aVar.f62222c - 1;
                    aVar.f62222c = j10;
                    if (j10 == 0) {
                        this.f62219f = null;
                        this.f62214a.o1();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void k1(a aVar) {
        synchronized (this) {
            try {
                if (aVar.f62222c == 0 && aVar == this.f62219f) {
                    this.f62219f = null;
                    InterfaceC6043c interfaceC6043c = (InterfaceC6043c) aVar.get();
                    EnumC6592b.dispose(aVar);
                    if (interfaceC6043c == null) {
                        aVar.f62224e = true;
                    } else {
                        this.f62214a.o1();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public U(Bg.a aVar, int i10, long j10, TimeUnit timeUnit, gg.y yVar) {
        this.f62214a = aVar;
        this.f62215b = i10;
        this.f62216c = j10;
        this.f62217d = timeUnit;
        this.f62218e = yVar;
    }
}
