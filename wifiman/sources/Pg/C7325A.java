package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* renamed from: pg.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7325A extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final long f57909a;

    /* renamed from: b, reason: collision with root package name */
    final TimeUnit f57910b;

    /* renamed from: c, reason: collision with root package name */
    final gg.y f57911c;

    /* renamed from: pg.A$a */
    static final class a extends AtomicReference implements InterfaceC6043c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f57912a;

        a(InterfaceC5914d interfaceC5914d) {
            this.f57912a = interfaceC5914d;
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
            this.f57912a.a();
        }
    }

    public C7325A(long j10, TimeUnit timeUnit, gg.y yVar) {
        this.f57909a = j10;
        this.f57910b = timeUnit;
        this.f57911c = yVar;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        a aVar = new a(interfaceC5914d);
        interfaceC5914d.c(aVar);
        aVar.a(this.f57911c.f(aVar, this.f57909a, this.f57910b));
    }
}
