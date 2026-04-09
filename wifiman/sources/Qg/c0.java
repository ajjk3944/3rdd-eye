package qg;

import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jg.AbstractC6327a;
import kg.InterfaceC6469f;
import lg.C6595e;
import lg.EnumC6592b;
import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class c0 extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final AbstractC6327a f58899b;

    /* renamed from: c, reason: collision with root package name */
    final int f58900c;

    /* renamed from: d, reason: collision with root package name */
    final long f58901d;

    /* renamed from: e, reason: collision with root package name */
    final TimeUnit f58902e;

    /* renamed from: f, reason: collision with root package name */
    final gg.y f58903f;

    /* renamed from: g, reason: collision with root package name */
    a f58904g;

    static final class a extends AtomicReference implements Runnable, InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final c0 f58905a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6043c f58906b;

        /* renamed from: c, reason: collision with root package name */
        long f58907c;

        /* renamed from: d, reason: collision with root package name */
        boolean f58908d;

        /* renamed from: e, reason: collision with root package name */
        boolean f58909e;

        a(c0 c0Var) {
            this.f58905a = c0Var;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.replace(this, interfaceC6043c);
            synchronized (this.f58905a) {
                try {
                    if (this.f58909e) {
                        this.f58905a.f58899b.l2();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f58905a.j2(this);
        }
    }

    static final class b extends AtomicBoolean implements gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58910a;

        /* renamed from: b, reason: collision with root package name */
        final c0 f58911b;

        /* renamed from: c, reason: collision with root package name */
        final a f58912c;

        /* renamed from: d, reason: collision with root package name */
        Dj.c f58913d;

        b(Dj.b bVar, c0 c0Var, a aVar) {
            this.f58910a = bVar;
            this.f58911b = c0Var;
            this.f58912c = aVar;
        }

        @Override // Dj.b
        public void a() {
            if (compareAndSet(false, true)) {
                this.f58911b.i2(this.f58912c);
                this.f58910a.a();
            }
        }

        @Override // Dj.c
        public void cancel() {
            this.f58913d.cancel();
            if (compareAndSet(false, true)) {
                this.f58911b.h2(this.f58912c);
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f58910a.h(obj);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f58913d, cVar)) {
                this.f58913d = cVar;
                this.f58910a.j(this);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                Eg.a.v(th2);
            } else {
                this.f58911b.i2(this.f58912c);
                this.f58910a.onError(th2);
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            this.f58913d.request(j10);
        }
    }

    public c0(AbstractC6327a abstractC6327a) {
        this(abstractC6327a, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        a aVar;
        boolean z10;
        InterfaceC6043c interfaceC6043c;
        synchronized (this) {
            try {
                aVar = this.f58904g;
                if (aVar == null) {
                    aVar = new a(this);
                    this.f58904g = aVar;
                }
                long j10 = aVar.f58907c;
                if (j10 == 0 && (interfaceC6043c = aVar.f58906b) != null) {
                    interfaceC6043c.dispose();
                }
                long j11 = j10 + 1;
                aVar.f58907c = j11;
                if (aVar.f58908d || j11 != this.f58900c) {
                    z10 = false;
                } else {
                    z10 = true;
                    aVar.f58908d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f58899b.D1(new b(bVar, this, aVar));
        if (z10) {
            this.f58899b.h2(aVar);
        }
    }

    void h2(a aVar) {
        synchronized (this) {
            try {
                a aVar2 = this.f58904g;
                if (aVar2 != null && aVar2 == aVar) {
                    long j10 = aVar.f58907c - 1;
                    aVar.f58907c = j10;
                    if (j10 == 0 && aVar.f58908d) {
                        if (this.f58901d == 0) {
                            j2(aVar);
                            return;
                        }
                        C6595e c6595e = new C6595e();
                        aVar.f58906b = c6595e;
                        c6595e.a(this.f58903f.f(aVar, this.f58901d, this.f58902e));
                    }
                }
            } finally {
            }
        }
    }

    void i2(a aVar) {
        synchronized (this) {
            try {
                if (this.f58904g == aVar) {
                    InterfaceC6043c interfaceC6043c = aVar.f58906b;
                    if (interfaceC6043c != null) {
                        interfaceC6043c.dispose();
                        aVar.f58906b = null;
                    }
                    long j10 = aVar.f58907c - 1;
                    aVar.f58907c = j10;
                    if (j10 == 0) {
                        this.f58904g = null;
                        this.f58899b.l2();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void j2(a aVar) {
        synchronized (this) {
            try {
                if (aVar.f58907c == 0 && aVar == this.f58904g) {
                    this.f58904g = null;
                    InterfaceC6043c interfaceC6043c = (InterfaceC6043c) aVar.get();
                    EnumC6592b.dispose(aVar);
                    if (interfaceC6043c == null) {
                        aVar.f58909e = true;
                    } else {
                        this.f58899b.l2();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public c0(AbstractC6327a abstractC6327a, int i10, long j10, TimeUnit timeUnit, gg.y yVar) {
        this.f58899b = abstractC6327a;
        this.f58900c = i10;
        this.f58901d = j10;
        this.f58902e = timeUnit;
        this.f58903f = yVar;
    }
}
