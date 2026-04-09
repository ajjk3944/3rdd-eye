package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicReference;
import lg.C6595e;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class x extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final gg.f f58016a;

    /* renamed from: b, reason: collision with root package name */
    final gg.y f58017b;

    static final class a extends AtomicReference implements InterfaceC5914d, InterfaceC6043c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f58018a;

        /* renamed from: b, reason: collision with root package name */
        final C6595e f58019b = new C6595e();

        /* renamed from: c, reason: collision with root package name */
        final gg.f f58020c;

        a(InterfaceC5914d interfaceC5914d, gg.f fVar) {
            this.f58018a = interfaceC5914d;
            this.f58020c = fVar;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            this.f58018a.a();
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this, interfaceC6043c);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
            this.f58019b.dispose();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            this.f58018a.onError(th2);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f58020c.e(this);
        }
    }

    public x(gg.f fVar, gg.y yVar) {
        this.f58016a = fVar;
        this.f58017b = yVar;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        a aVar = new a(interfaceC5914d, this.f58016a);
        interfaceC5914d.c(aVar);
        aVar.f58019b.a(this.f58017b.e(aVar));
    }
}
