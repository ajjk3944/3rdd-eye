package rg;

import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class d extends gg.n {

    /* renamed from: a, reason: collision with root package name */
    final gg.r f60521a;

    /* renamed from: b, reason: collision with root package name */
    final gg.f f60522b;

    static final class a implements gg.p {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference f60523a;

        /* renamed from: b, reason: collision with root package name */
        final gg.p f60524b;

        a(AtomicReference atomicReference, gg.p pVar) {
            this.f60523a = atomicReference;
            this.f60524b = pVar;
        }

        @Override // gg.p
        public void a() {
            this.f60524b.a();
        }

        @Override // gg.p
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.replace(this.f60523a, interfaceC6043c);
        }

        @Override // gg.p
        public void onError(Throwable th2) {
            this.f60524b.onError(th2);
        }

        @Override // gg.p
        public void onSuccess(Object obj) {
            this.f60524b.onSuccess(obj);
        }
    }

    static final class b extends AtomicReference implements InterfaceC5914d, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f60525a;

        /* renamed from: b, reason: collision with root package name */
        final gg.r f60526b;

        b(gg.p pVar, gg.r rVar) {
            this.f60525a = pVar;
            this.f60526b = rVar;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            this.f60526b.a(new a(this, this.f60525a));
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this, interfaceC6043c)) {
                this.f60525a.c(this);
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
            this.f60525a.onError(th2);
        }
    }

    public d(gg.r rVar, gg.f fVar) {
        this.f60521a = rVar;
        this.f60522b = fVar;
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        this.f60522b.e(new b(pVar, this.f60521a));
    }
}
