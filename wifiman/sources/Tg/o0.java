package tg;

import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicBoolean;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class o0 extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final gg.y f62517b;

    static final class a extends AtomicBoolean implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62518a;

        /* renamed from: b, reason: collision with root package name */
        final gg.y f62519b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f62520c;

        /* renamed from: tg.o0$a$a, reason: collision with other inner class name */
        final class RunnableC2187a implements Runnable {
            RunnableC2187a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f62520c.dispose();
            }
        }

        a(gg.x xVar, gg.y yVar) {
            this.f62518a = xVar;
            this.f62519b = yVar;
        }

        @Override // gg.x
        public void a() {
            if (get()) {
                return;
            }
            this.f62518a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62520c, interfaceC6043c)) {
                this.f62520c = interfaceC6043c;
                this.f62518a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f62519b.e(new RunnableC2187a());
            }
        }

        @Override // gg.x
        public void h(Object obj) {
            if (get()) {
                return;
            }
            this.f62518a.h(obj);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return get();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (get()) {
                Eg.a.v(th2);
            } else {
                this.f62518a.onError(th2);
            }
        }
    }

    public o0(gg.v vVar, gg.y yVar) {
        super(vVar);
        this.f62517b = yVar;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        this.f62287a.d(new a(xVar, this.f62517b));
    }
}
