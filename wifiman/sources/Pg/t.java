package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class t extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final gg.f f57992a;

    /* renamed from: b, reason: collision with root package name */
    final gg.y f57993b;

    static final class a extends AtomicReference implements InterfaceC5914d, InterfaceC6043c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f57994a;

        /* renamed from: b, reason: collision with root package name */
        final gg.y f57995b;

        /* renamed from: c, reason: collision with root package name */
        Throwable f57996c;

        a(InterfaceC5914d interfaceC5914d, gg.y yVar) {
            this.f57994a = interfaceC5914d;
            this.f57995b = yVar;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            EnumC6592b.replace(this, this.f57995b.e(this));
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this, interfaceC6043c)) {
                this.f57994a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            this.f57996c = th2;
            EnumC6592b.replace(this, this.f57995b.e(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f57996c;
            if (th2 == null) {
                this.f57994a.a();
            } else {
                this.f57996c = null;
                this.f57994a.onError(th2);
            }
        }
    }

    public t(gg.f fVar, gg.y yVar) {
        this.f57992a = fVar;
        this.f57993b = yVar;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        this.f57992a.e(new a(interfaceC5914d, this.f57993b));
    }
}
