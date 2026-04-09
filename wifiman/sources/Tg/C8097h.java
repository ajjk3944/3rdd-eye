package tg;

import gg.y;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kg.InterfaceC6469f;
import lg.EnumC6592b;

/* renamed from: tg.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8097h extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final long f62390b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f62391c;

    /* renamed from: d, reason: collision with root package name */
    final gg.y f62392d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC6469f f62393e;

    /* renamed from: tg.h$a */
    static final class a extends AtomicReference implements Runnable, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final Object f62394a;

        /* renamed from: b, reason: collision with root package name */
        final long f62395b;

        /* renamed from: c, reason: collision with root package name */
        final b f62396c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicBoolean f62397d = new AtomicBoolean();

        a(Object obj, long j10, b bVar) {
            this.f62394a = obj;
            this.f62395b = j10;
            this.f62396c = bVar;
        }

        public void a(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.replace(this, interfaceC6043c);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return get() == EnumC6592b.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f62397d.compareAndSet(false, true)) {
                this.f62396c.b(this.f62395b, this.f62394a, this);
            }
        }
    }

    /* renamed from: tg.h$b */
    static final class b implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62398a;

        /* renamed from: b, reason: collision with root package name */
        final long f62399b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f62400c;

        /* renamed from: d, reason: collision with root package name */
        final y.c f62401d;

        /* renamed from: e, reason: collision with root package name */
        final InterfaceC6469f f62402e;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC6043c f62403f;

        /* renamed from: g, reason: collision with root package name */
        a f62404g;

        /* renamed from: h, reason: collision with root package name */
        volatile long f62405h;

        /* renamed from: i, reason: collision with root package name */
        boolean f62406i;

        b(gg.x xVar, long j10, TimeUnit timeUnit, y.c cVar, InterfaceC6469f interfaceC6469f) {
            this.f62398a = xVar;
            this.f62399b = j10;
            this.f62400c = timeUnit;
            this.f62401d = cVar;
            this.f62402e = interfaceC6469f;
        }

        @Override // gg.x
        public void a() {
            if (this.f62406i) {
                return;
            }
            this.f62406i = true;
            a aVar = this.f62404g;
            if (aVar != null) {
                aVar.dispose();
            }
            if (aVar != null) {
                aVar.run();
            }
            this.f62398a.a();
            this.f62401d.dispose();
        }

        void b(long j10, Object obj, a aVar) {
            if (j10 == this.f62405h) {
                this.f62398a.h(obj);
                aVar.dispose();
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62403f, interfaceC6043c)) {
                this.f62403f = interfaceC6043c;
                this.f62398a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62403f.dispose();
            this.f62401d.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62406i) {
                return;
            }
            long j10 = this.f62405h + 1;
            this.f62405h = j10;
            a aVar = this.f62404g;
            if (aVar != null) {
                aVar.dispose();
            }
            InterfaceC6469f interfaceC6469f = this.f62402e;
            if (interfaceC6469f != null && aVar != null) {
                try {
                    interfaceC6469f.accept(this.f62404g.f62394a);
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    this.f62403f.dispose();
                    this.f62398a.onError(th2);
                    this.f62406i = true;
                }
            }
            a aVar2 = new a(obj, j10, this);
            this.f62404g = aVar2;
            aVar2.a(this.f62401d.c(aVar2, this.f62399b, this.f62400c));
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62401d.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62406i) {
                Eg.a.v(th2);
                return;
            }
            a aVar = this.f62404g;
            if (aVar != null) {
                aVar.dispose();
            }
            this.f62406i = true;
            this.f62398a.onError(th2);
            this.f62401d.dispose();
        }
    }

    public C8097h(gg.v vVar, long j10, TimeUnit timeUnit, gg.y yVar, InterfaceC6469f interfaceC6469f) {
        super(vVar);
        this.f62390b = j10;
        this.f62391c = timeUnit;
        this.f62392d = yVar;
        this.f62393e = interfaceC6469f;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        this.f62287a.d(new b(new Cg.c(xVar), this.f62390b, this.f62391c, this.f62392d.c(), this.f62393e));
    }
}
