package rg;

import gg.y;
import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class v extends gg.n {

    /* renamed from: a, reason: collision with root package name */
    final long f60591a;

    /* renamed from: b, reason: collision with root package name */
    final TimeUnit f60592b;

    /* renamed from: c, reason: collision with root package name */
    final y f60593c;

    static final class a extends AtomicReference implements InterfaceC6043c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f60594a;

        a(gg.p pVar) {
            this.f60594a = pVar;
        }

        void a(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.replace(this, interfaceC6043c);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f60594a.onSuccess(0L);
        }
    }

    public v(long j10, TimeUnit timeUnit, y yVar) {
        this.f60591a = j10;
        this.f60592b = timeUnit;
        this.f60593c = yVar;
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        a aVar = new a(pVar);
        pVar.c(aVar);
        aVar.a(this.f60593c.f(aVar, this.f60591a, this.f60592b));
    }
}
