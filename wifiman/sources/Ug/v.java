package ug;

import gg.D;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicReference;
import lg.C6595e;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class v extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final D f63042a;

    /* renamed from: b, reason: collision with root package name */
    final gg.y f63043b;

    static final class a extends AtomicReference implements gg.B, InterfaceC6043c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f63044a;

        /* renamed from: b, reason: collision with root package name */
        final C6595e f63045b = new C6595e();

        /* renamed from: c, reason: collision with root package name */
        final D f63046c;

        a(gg.B b10, D d10) {
            this.f63044a = b10;
            this.f63046c = d10;
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this, interfaceC6043c);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
            this.f63045b.dispose();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            this.f63044a.onError(th2);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            this.f63044a.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f63046c.a(this);
        }
    }

    public v(D d10, gg.y yVar) {
        this.f63042a = d10;
        this.f63043b = yVar;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        a aVar = new a(b10, this.f63042a);
        b10.c(aVar);
        aVar.f63045b.a(this.f63043b.e(aVar));
    }
}
