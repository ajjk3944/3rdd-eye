package ug;

import gg.D;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* renamed from: ug.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8169d extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final D f62970a;

    /* renamed from: b, reason: collision with root package name */
    final gg.f f62971b;

    /* renamed from: ug.d$a */
    static final class a extends AtomicReference implements InterfaceC5914d, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f62972a;

        /* renamed from: b, reason: collision with root package name */
        final D f62973b;

        a(gg.B b10, D d10) {
            this.f62972a = b10;
            this.f62973b = d10;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            this.f62973b.a(new og.k(this, this.f62972a));
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this, interfaceC6043c)) {
                this.f62972a.c(this);
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
            this.f62972a.onError(th2);
        }
    }

    public C8169d(D d10, gg.f fVar) {
        this.f62970a = d10;
        this.f62971b = fVar;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        this.f62971b.e(new a(b10, this.f62970a));
    }
}
