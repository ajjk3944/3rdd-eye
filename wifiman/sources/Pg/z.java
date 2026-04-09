package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.C6042b;
import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import zg.AbstractC8755h;

/* loaded from: classes4.dex */
public final class z extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final gg.f f58027a;

    /* renamed from: b, reason: collision with root package name */
    final long f58028b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f58029c;

    /* renamed from: d, reason: collision with root package name */
    final gg.y f58030d;

    /* renamed from: e, reason: collision with root package name */
    final gg.f f58031e;

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f58032a;

        /* renamed from: b, reason: collision with root package name */
        final C6042b f58033b;

        /* renamed from: c, reason: collision with root package name */
        final InterfaceC5914d f58034c;

        /* renamed from: pg.z$a$a, reason: collision with other inner class name */
        final class C2044a implements InterfaceC5914d {
            C2044a() {
            }

            @Override // gg.InterfaceC5914d
            public void a() {
                a.this.f58033b.dispose();
                a.this.f58034c.a();
            }

            @Override // gg.InterfaceC5914d
            public void c(InterfaceC6043c interfaceC6043c) {
                a.this.f58033b.a(interfaceC6043c);
            }

            @Override // gg.InterfaceC5914d
            public void onError(Throwable th2) {
                a.this.f58033b.dispose();
                a.this.f58034c.onError(th2);
            }
        }

        a(AtomicBoolean atomicBoolean, C6042b c6042b, InterfaceC5914d interfaceC5914d) {
            this.f58032a = atomicBoolean;
            this.f58033b = c6042b;
            this.f58034c = interfaceC5914d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f58032a.compareAndSet(false, true)) {
                this.f58033b.d();
                gg.f fVar = z.this.f58031e;
                if (fVar != null) {
                    fVar.e(new C2044a());
                    return;
                }
                InterfaceC5914d interfaceC5914d = this.f58034c;
                z zVar = z.this;
                interfaceC5914d.onError(new TimeoutException(AbstractC8755h.g(zVar.f58028b, zVar.f58029c)));
            }
        }
    }

    static final class b implements InterfaceC5914d {

        /* renamed from: a, reason: collision with root package name */
        private final C6042b f58037a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f58038b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC5914d f58039c;

        b(C6042b c6042b, AtomicBoolean atomicBoolean, InterfaceC5914d interfaceC5914d) {
            this.f58037a = c6042b;
            this.f58038b = atomicBoolean;
            this.f58039c = interfaceC5914d;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            if (this.f58038b.compareAndSet(false, true)) {
                this.f58037a.dispose();
                this.f58039c.a();
            }
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f58037a.a(interfaceC6043c);
        }

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            if (!this.f58038b.compareAndSet(false, true)) {
                Eg.a.v(th2);
            } else {
                this.f58037a.dispose();
                this.f58039c.onError(th2);
            }
        }
    }

    public z(gg.f fVar, long j10, TimeUnit timeUnit, gg.y yVar, gg.f fVar2) {
        this.f58027a = fVar;
        this.f58028b = j10;
        this.f58029c = timeUnit;
        this.f58030d = yVar;
        this.f58031e = fVar2;
    }

    @Override // gg.AbstractC5912b
    public void V(InterfaceC5914d interfaceC5914d) {
        C6042b c6042b = new C6042b();
        interfaceC5914d.c(c6042b);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        c6042b.a(this.f58030d.f(new a(atomicBoolean, c6042b, interfaceC5914d), this.f58028b, this.f58029c));
        this.f58027a.e(new b(c6042b, atomicBoolean, interfaceC5914d));
    }
}
