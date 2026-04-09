package tg;

import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import lg.EnumC6593c;

/* loaded from: classes4.dex */
public final class n0 extends gg.s {

    /* renamed from: a, reason: collision with root package name */
    final gg.y f62511a;

    /* renamed from: b, reason: collision with root package name */
    final long f62512b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f62513c;

    static final class a extends AtomicReference implements InterfaceC6043c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62514a;

        a(gg.x xVar) {
            this.f62514a = xVar;
        }

        public void a(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.trySet(this, interfaceC6043c);
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
            if (isDisposed()) {
                return;
            }
            this.f62514a.h(0L);
            lazySet(EnumC6593c.INSTANCE);
            this.f62514a.a();
        }
    }

    public n0(long j10, TimeUnit timeUnit, gg.y yVar) {
        this.f62512b = j10;
        this.f62513c = timeUnit;
        this.f62511a = yVar;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        a aVar = new a(xVar);
        xVar.c(aVar);
        aVar.a(this.f62511a.f(aVar, this.f62512b, this.f62513c));
    }
}
