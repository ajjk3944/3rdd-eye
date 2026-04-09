package ug;

import gg.D;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class s extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final D f63027a;

    /* renamed from: b, reason: collision with root package name */
    final gg.y f63028b;

    static final class a extends AtomicReference implements gg.B, InterfaceC6043c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f63029a;

        /* renamed from: b, reason: collision with root package name */
        final gg.y f63030b;

        /* renamed from: c, reason: collision with root package name */
        Object f63031c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f63032d;

        a(gg.B b10, gg.y yVar) {
            this.f63029a = b10;
            this.f63030b = yVar;
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this, interfaceC6043c)) {
                this.f63029a.c(this);
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

        @Override // gg.B
        public void onError(Throwable th2) {
            this.f63032d = th2;
            EnumC6592b.replace(this, this.f63030b.e(this));
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            this.f63031c = obj;
            EnumC6592b.replace(this, this.f63030b.e(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f63032d;
            if (th2 != null) {
                this.f63029a.onError(th2);
            } else {
                this.f63029a.onSuccess(this.f63031c);
            }
        }
    }

    public s(D d10, gg.y yVar) {
        this.f63027a = d10;
        this.f63028b = yVar;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        this.f63027a.a(new a(b10, this.f63028b));
    }
}
