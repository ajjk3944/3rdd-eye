package qg;

import hg.InterfaceC6043c;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import lg.EnumC6593c;
import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class z0 extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final gg.y f59415b;

    /* renamed from: c, reason: collision with root package name */
    final long f59416c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f59417d;

    static final class a extends AtomicReference implements Dj.c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59418a;

        /* renamed from: b, reason: collision with root package name */
        volatile boolean f59419b;

        a(Dj.b bVar) {
            this.f59418a = bVar;
        }

        public void a(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.trySet(this, interfaceC6043c);
        }

        @Override // Dj.c
        public void cancel() {
            EnumC6592b.dispose(this);
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                this.f59419b = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != EnumC6592b.DISPOSED) {
                if (!this.f59419b) {
                    lazySet(EnumC6593c.INSTANCE);
                    this.f59418a.onError(MissingBackpressureException.a());
                } else {
                    this.f59418a.h(0L);
                    lazySet(EnumC6593c.INSTANCE);
                    this.f59418a.a();
                }
            }
        }
    }

    public z0(long j10, TimeUnit timeUnit, gg.y yVar) {
        this.f59416c = j10;
        this.f59417d = timeUnit;
        this.f59415b = yVar;
    }

    @Override // gg.i
    public void E1(Dj.b bVar) {
        a aVar = new a(bVar);
        bVar.j(aVar);
        aVar.a(this.f59415b.f(aVar, this.f59416c, this.f59417d));
    }
}
