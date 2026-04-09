package ug;

import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class x extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final long f63059a;

    /* renamed from: b, reason: collision with root package name */
    final TimeUnit f63060b;

    /* renamed from: c, reason: collision with root package name */
    final gg.y f63061c;

    static final class a extends AtomicReference implements InterfaceC6043c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f63062a;

        a(gg.B b10) {
            this.f63062a = b10;
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
            this.f63062a.onSuccess(0L);
        }
    }

    public x(long j10, TimeUnit timeUnit, gg.y yVar) {
        this.f63059a = j10;
        this.f63060b = timeUnit;
        this.f63061c = yVar;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        a aVar = new a(b10);
        b10.c(aVar);
        aVar.a(this.f63061c.f(aVar, this.f63059a, this.f63060b));
    }
}
