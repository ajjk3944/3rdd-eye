package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* renamed from: pg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7327a extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final gg.f f57920a;

    /* renamed from: b, reason: collision with root package name */
    final gg.f f57921b;

    /* renamed from: pg.a$a, reason: collision with other inner class name */
    static final class C2042a implements InterfaceC5914d {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference f57922a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC5914d f57923b;

        C2042a(AtomicReference atomicReference, InterfaceC5914d interfaceC5914d) {
            this.f57922a = atomicReference;
            this.f57923b = interfaceC5914d;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            this.f57923b.a();
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.replace(this.f57922a, interfaceC6043c);
        }

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            this.f57923b.onError(th2);
        }
    }

    /* renamed from: pg.a$b */
    static final class b extends AtomicReference implements InterfaceC5914d, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f57924a;

        /* renamed from: b, reason: collision with root package name */
        final gg.f f57925b;

        b(InterfaceC5914d interfaceC5914d, gg.f fVar) {
            this.f57924a = interfaceC5914d;
            this.f57925b = fVar;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            this.f57925b.e(new C2042a(this, this.f57924a));
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this, interfaceC6043c)) {
                this.f57924a.c(this);
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
            this.f57924a.onError(th2);
        }
    }

    public C7327a(gg.f fVar, gg.f fVar2) {
        this.f57920a = fVar;
        this.f57921b = fVar2;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        this.f57920a.e(new b(interfaceC5914d, this.f57921b));
    }
}
