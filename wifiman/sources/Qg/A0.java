package qg;

import java.util.concurrent.atomic.AtomicBoolean;
import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class A0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final gg.y f58686c;

    static final class a extends AtomicBoolean implements gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58687a;

        /* renamed from: b, reason: collision with root package name */
        final gg.y f58688b;

        /* renamed from: c, reason: collision with root package name */
        Dj.c f58689c;

        /* renamed from: qg.A0$a$a, reason: collision with other inner class name */
        final class RunnableC2068a implements Runnable {
            RunnableC2068a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f58689c.cancel();
            }
        }

        a(Dj.b bVar, gg.y yVar) {
            this.f58687a = bVar;
            this.f58688b = yVar;
        }

        @Override // Dj.b
        public void a() {
            if (get()) {
                return;
            }
            this.f58687a.a();
        }

        @Override // Dj.c
        public void cancel() {
            if (compareAndSet(false, true)) {
                this.f58688b.e(new RunnableC2068a());
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (get()) {
                return;
            }
            this.f58687a.h(obj);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f58689c, cVar)) {
                this.f58689c = cVar;
                this.f58687a.j(this);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (get()) {
                Eg.a.v(th2);
            } else {
                this.f58687a.onError(th2);
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            this.f58689c.request(j10);
        }
    }

    public A0(gg.i iVar, gg.y yVar) {
        super(iVar);
        this.f58686c = yVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar, this.f58686c));
    }
}
