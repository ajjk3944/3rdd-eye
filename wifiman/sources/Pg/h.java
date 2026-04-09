package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class h extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final gg.f f57957a;

    /* renamed from: b, reason: collision with root package name */
    final gg.y f57958b;

    static final class a implements InterfaceC5914d, InterfaceC6043c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f57959a;

        /* renamed from: b, reason: collision with root package name */
        final gg.y f57960b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f57961c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f57962d;

        a(InterfaceC5914d interfaceC5914d, gg.y yVar) {
            this.f57959a = interfaceC5914d;
            this.f57960b = yVar;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            if (this.f57962d) {
                return;
            }
            this.f57959a.a();
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f57961c, interfaceC6043c)) {
                this.f57961c = interfaceC6043c;
                this.f57959a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f57962d = true;
            this.f57960b.e(this);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f57962d;
        }

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            if (this.f57962d) {
                Eg.a.v(th2);
            } else {
                this.f57959a.onError(th2);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f57961c.dispose();
            this.f57961c = EnumC6592b.DISPOSED;
        }
    }

    public h(gg.f fVar, gg.y yVar) {
        this.f57957a = fVar;
        this.f57958b = yVar;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        this.f57957a.e(new a(interfaceC5914d, this.f57958b));
    }
}
