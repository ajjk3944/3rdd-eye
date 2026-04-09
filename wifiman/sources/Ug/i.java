package ug;

import gg.D;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import kg.InterfaceC6469f;

/* loaded from: classes4.dex */
public final class i extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final D f62993a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC6469f f62994b;

    final class a implements gg.B {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f62995a;

        a(gg.B b10) {
            this.f62995a = b10;
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f62995a.c(interfaceC6043c);
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            this.f62995a.onError(th2);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            try {
                i.this.f62994b.accept(obj);
                this.f62995a.onSuccess(obj);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f62995a.onError(th2);
            }
        }
    }

    public i(D d10, InterfaceC6469f interfaceC6469f) {
        this.f62993a = d10;
        this.f62994b = interfaceC6469f;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        this.f62993a.a(new a(b10));
    }
}
