package qg;

import gg.y;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kg.InterfaceC6469f;
import lg.EnumC6592b;
import yg.EnumC8672g;
import zg.AbstractC8751d;

/* renamed from: qg.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7492j extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final long f59066c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f59067d;

    /* renamed from: e, reason: collision with root package name */
    final gg.y f59068e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC6469f f59069f;

    /* renamed from: qg.j$a */
    static final class a extends AtomicReference implements Runnable, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final Object f59070a;

        /* renamed from: b, reason: collision with root package name */
        final long f59071b;

        /* renamed from: c, reason: collision with root package name */
        final b f59072c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicBoolean f59073d = new AtomicBoolean();

        a(Object obj, long j10, b bVar) {
            this.f59070a = obj;
            this.f59071b = j10;
            this.f59072c = bVar;
        }

        void a() {
            if (this.f59073d.compareAndSet(false, true)) {
                this.f59072c.c(this.f59071b, this.f59070a, this);
            }
        }

        public void c(InterfaceC6043c interfaceC6043c) {
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
            a();
        }
    }

    /* renamed from: qg.j$b */
    static final class b extends AtomicLong implements gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59074a;

        /* renamed from: b, reason: collision with root package name */
        final long f59075b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f59076c;

        /* renamed from: d, reason: collision with root package name */
        final y.c f59077d;

        /* renamed from: e, reason: collision with root package name */
        final InterfaceC6469f f59078e;

        /* renamed from: f, reason: collision with root package name */
        Dj.c f59079f;

        /* renamed from: g, reason: collision with root package name */
        a f59080g;

        /* renamed from: h, reason: collision with root package name */
        volatile long f59081h;

        /* renamed from: i, reason: collision with root package name */
        boolean f59082i;

        b(Dj.b bVar, long j10, TimeUnit timeUnit, y.c cVar, InterfaceC6469f interfaceC6469f) {
            this.f59074a = bVar;
            this.f59075b = j10;
            this.f59076c = timeUnit;
            this.f59077d = cVar;
            this.f59078e = interfaceC6469f;
        }

        @Override // Dj.b
        public void a() {
            if (this.f59082i) {
                return;
            }
            this.f59082i = true;
            a aVar = this.f59080g;
            if (aVar != null) {
                aVar.dispose();
            }
            if (aVar != null) {
                aVar.a();
            }
            this.f59074a.a();
            this.f59077d.dispose();
        }

        void c(long j10, Object obj, a aVar) {
            if (j10 == this.f59081h) {
                if (get() == 0) {
                    cancel();
                    this.f59074a.onError(MissingBackpressureException.a());
                } else {
                    this.f59074a.h(obj);
                    AbstractC8751d.d(this, 1L);
                    aVar.dispose();
                }
            }
        }

        @Override // Dj.c
        public void cancel() {
            this.f59079f.cancel();
            this.f59077d.dispose();
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f59082i) {
                return;
            }
            long j10 = this.f59081h + 1;
            this.f59081h = j10;
            a aVar = this.f59080g;
            if (aVar != null) {
                aVar.dispose();
            }
            InterfaceC6469f interfaceC6469f = this.f59078e;
            if (interfaceC6469f != null && aVar != null) {
                try {
                    interfaceC6469f.accept(aVar.f59070a);
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    this.f59079f.cancel();
                    this.f59082i = true;
                    this.f59074a.onError(th2);
                    this.f59077d.dispose();
                }
            }
            a aVar2 = new a(obj, j10, this);
            this.f59080g = aVar2;
            aVar2.c(this.f59077d.c(aVar2, this.f59075b, this.f59076c));
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59079f, cVar)) {
                this.f59079f = cVar;
                this.f59074a.j(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59082i) {
                Eg.a.v(th2);
                return;
            }
            this.f59082i = true;
            a aVar = this.f59080g;
            if (aVar != null) {
                aVar.dispose();
            }
            this.f59074a.onError(th2);
            this.f59077d.dispose();
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.a(this, j10);
            }
        }
    }

    public C7492j(gg.i iVar, long j10, TimeUnit timeUnit, gg.y yVar, InterfaceC6469f interfaceC6469f) {
        super(iVar);
        this.f59066c = j10;
        this.f59067d = timeUnit;
        this.f59068e = yVar;
        this.f59069f = interfaceC6469f;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new b(new Ig.a(bVar), this.f59066c, this.f59067d, this.f59068e.c(), this.f59069f));
    }
}
