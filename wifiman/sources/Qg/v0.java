package qg;

import gg.y;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kg.InterfaceC6469f;
import lg.C6595e;
import yg.EnumC8672g;
import zg.AbstractC8751d;

/* loaded from: classes4.dex */
public final class v0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final long f59270c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f59271d;

    /* renamed from: e, reason: collision with root package name */
    final gg.y f59272e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC6469f f59273f;

    static final class a extends AtomicLong implements gg.l, Dj.c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59274a;

        /* renamed from: b, reason: collision with root package name */
        final long f59275b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f59276c;

        /* renamed from: d, reason: collision with root package name */
        final y.c f59277d;

        /* renamed from: e, reason: collision with root package name */
        final InterfaceC6469f f59278e;

        /* renamed from: f, reason: collision with root package name */
        Dj.c f59279f;

        /* renamed from: g, reason: collision with root package name */
        final C6595e f59280g = new C6595e();

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f59281h;

        /* renamed from: i, reason: collision with root package name */
        boolean f59282i;

        a(Dj.b bVar, long j10, TimeUnit timeUnit, y.c cVar, InterfaceC6469f interfaceC6469f) {
            this.f59274a = bVar;
            this.f59275b = j10;
            this.f59276c = timeUnit;
            this.f59277d = cVar;
            this.f59278e = interfaceC6469f;
        }

        @Override // Dj.b
        public void a() {
            if (this.f59282i) {
                return;
            }
            this.f59282i = true;
            this.f59274a.a();
            this.f59277d.dispose();
        }

        @Override // Dj.c
        public void cancel() {
            this.f59279f.cancel();
            this.f59277d.dispose();
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f59282i) {
                return;
            }
            if (this.f59281h) {
                InterfaceC6469f interfaceC6469f = this.f59278e;
                if (interfaceC6469f != null) {
                    try {
                        interfaceC6469f.accept(obj);
                        return;
                    } catch (Throwable th2) {
                        AbstractC6152a.b(th2);
                        this.f59279f.cancel();
                        this.f59282i = true;
                        this.f59274a.onError(th2);
                        this.f59277d.dispose();
                        return;
                    }
                }
                return;
            }
            this.f59281h = true;
            if (get() == 0) {
                this.f59279f.cancel();
                this.f59282i = true;
                this.f59274a.onError(MissingBackpressureException.a());
                this.f59277d.dispose();
                return;
            }
            this.f59274a.h(obj);
            AbstractC8751d.d(this, 1L);
            InterfaceC6043c interfaceC6043c = (InterfaceC6043c) this.f59280g.get();
            if (interfaceC6043c != null) {
                interfaceC6043c.dispose();
            }
            this.f59280g.a(this.f59277d.c(this, this.f59275b, this.f59276c));
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59279f, cVar)) {
                this.f59279f = cVar;
                this.f59274a.j(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59282i) {
                Eg.a.v(th2);
                return;
            }
            this.f59282i = true;
            this.f59274a.onError(th2);
            this.f59277d.dispose();
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.a(this, j10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f59281h = false;
        }
    }

    public v0(gg.i iVar, long j10, TimeUnit timeUnit, gg.y yVar, InterfaceC6469f interfaceC6469f) {
        super(iVar);
        this.f59270c = j10;
        this.f59271d = timeUnit;
        this.f59272e = yVar;
        this.f59273f = interfaceC6469f;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(new Ig.a(bVar), this.f59270c, this.f59271d, this.f59272e.c(), this.f59273f));
    }
}
