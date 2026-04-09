package ug;

import gg.D;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* renamed from: ug.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8170e extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final D f62974a;

    /* renamed from: b, reason: collision with root package name */
    final gg.v f62975b;

    /* renamed from: ug.e$a */
    static final class a extends AtomicReference implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f62976a;

        /* renamed from: b, reason: collision with root package name */
        final D f62977b;

        /* renamed from: c, reason: collision with root package name */
        boolean f62978c;

        a(gg.B b10, D d10) {
            this.f62976a = b10;
            this.f62977b = d10;
        }

        @Override // gg.x
        public void a() {
            if (this.f62978c) {
                return;
            }
            this.f62978c = true;
            this.f62977b.a(new og.k(this, this.f62976a));
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this, interfaceC6043c)) {
                this.f62976a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
        }

        @Override // gg.x
        public void h(Object obj) {
            ((InterfaceC6043c) get()).dispose();
            a();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62978c) {
                Eg.a.v(th2);
            } else {
                this.f62978c = true;
                this.f62976a.onError(th2);
            }
        }
    }

    public C8170e(D d10, gg.v vVar) {
        this.f62974a = d10;
        this.f62975b = vVar;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        this.f62975b.d(new a(b10, this.f62974a));
    }
}
