package qg;

import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import yg.AbstractC8666a;
import yg.EnumC8672g;
import zg.AbstractC8751d;

/* loaded from: classes4.dex */
public final class U extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final int f58798c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f58799d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f58800e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC6464a f58801f;

    /* renamed from: g, reason: collision with root package name */
    final InterfaceC6469f f58802g;

    static final class a extends AbstractC8666a implements gg.l {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58803a;

        /* renamed from: b, reason: collision with root package name */
        final Dg.f f58804b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f58805c;

        /* renamed from: d, reason: collision with root package name */
        final InterfaceC6464a f58806d;

        /* renamed from: e, reason: collision with root package name */
        final InterfaceC6469f f58807e;

        /* renamed from: f, reason: collision with root package name */
        Dj.c f58808f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f58809g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f58810h;

        /* renamed from: i, reason: collision with root package name */
        Throwable f58811i;

        /* renamed from: j, reason: collision with root package name */
        final AtomicLong f58812j = new AtomicLong();

        /* renamed from: k, reason: collision with root package name */
        boolean f58813k;

        a(Dj.b bVar, int i10, boolean z10, boolean z11, InterfaceC6464a interfaceC6464a, InterfaceC6469f interfaceC6469f) {
            this.f58803a = bVar;
            this.f58806d = interfaceC6464a;
            this.f58805c = z11;
            this.f58807e = interfaceC6469f;
            this.f58804b = z10 ? new Dg.i(i10) : new Dg.h(i10);
        }

        @Override // Dj.b
        public void a() {
            this.f58810h = true;
            if (this.f58813k) {
                this.f58803a.a();
            } else {
                g();
            }
        }

        @Override // Dj.c
        public void cancel() {
            if (this.f58809g) {
                return;
            }
            this.f58809g = true;
            this.f58808f.cancel();
            if (this.f58813k || getAndIncrement() != 0) {
                return;
            }
            this.f58804b.clear();
        }

        @Override // Dg.g
        public void clear() {
            this.f58804b.clear();
        }

        boolean d(boolean z10, boolean z11, Dj.b bVar) {
            if (this.f58809g) {
                this.f58804b.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f58805c) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.f58811i;
                if (th2 != null) {
                    bVar.onError(th2);
                } else {
                    bVar.a();
                }
                return true;
            }
            Throwable th3 = this.f58811i;
            if (th3 != null) {
                this.f58804b.clear();
                bVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            bVar.a();
            return true;
        }

        void g() {
            if (getAndIncrement() == 0) {
                Dg.f fVar = this.f58804b;
                Dj.b bVar = this.f58803a;
                int iAddAndGet = 1;
                while (!d(this.f58810h, fVar.isEmpty(), bVar)) {
                    long j10 = this.f58812j.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        boolean z10 = this.f58810h;
                        Object objPoll = fVar.poll();
                        boolean z11 = objPoll == null;
                        if (d(z10, z11, bVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        bVar.h(objPoll);
                        j11++;
                    }
                    if (j11 == j10 && d(this.f58810h, fVar.isEmpty(), bVar)) {
                        return;
                    }
                    if (j11 != 0 && j10 != Long.MAX_VALUE) {
                        this.f58812j.addAndGet(-j11);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f58804b.offer(obj)) {
                if (this.f58813k) {
                    this.f58803a.h(null);
                    return;
                } else {
                    g();
                    return;
                }
            }
            this.f58808f.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.f58806d.run();
                this.f58807e.accept(obj);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                missingBackpressureException.initCause(th2);
            }
            onError(missingBackpressureException);
        }

        @Override // Dg.g
        public boolean isEmpty() {
            return this.f58804b.isEmpty();
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f58808f, cVar)) {
                this.f58808f = cVar;
                this.f58803a.j(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f58811i = th2;
            this.f58810h = true;
            if (this.f58813k) {
                this.f58803a.onError(th2);
            } else {
                g();
            }
        }

        @Override // Dg.g
        public Object poll() {
            return this.f58804b.poll();
        }

        @Override // Dj.c
        public void request(long j10) {
            if (this.f58813k || !EnumC8672g.validate(j10)) {
                return;
            }
            AbstractC8751d.a(this.f58812j, j10);
            g();
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f58813k = true;
            return 2;
        }
    }

    public U(gg.i iVar, int i10, boolean z10, boolean z11, InterfaceC6464a interfaceC6464a, InterfaceC6469f interfaceC6469f) {
        super(iVar);
        this.f58798c = i10;
        this.f58799d = z10;
        this.f58800e = z11;
        this.f58801f = interfaceC6464a;
        this.f58802g = interfaceC6469f;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar, this.f58798c, this.f58799d, this.f58800e, this.f58801f, this.f58802g));
    }
}
