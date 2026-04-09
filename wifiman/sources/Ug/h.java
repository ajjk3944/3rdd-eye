package ug;

import gg.D;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import kg.InterfaceC6469f;
import lg.EnumC6593c;

/* loaded from: classes4.dex */
public final class h extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final D f62988a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC6469f f62989b;

    static final class a implements gg.B {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f62990a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC6469f f62991b;

        /* renamed from: c, reason: collision with root package name */
        boolean f62992c;

        a(gg.B b10, InterfaceC6469f interfaceC6469f) {
            this.f62990a = b10;
            this.f62991b = interfaceC6469f;
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            try {
                this.f62991b.accept(interfaceC6043c);
                this.f62990a.c(interfaceC6043c);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f62992c = true;
                interfaceC6043c.dispose();
                EnumC6593c.error(th2, this.f62990a);
            }
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            if (this.f62992c) {
                Eg.a.v(th2);
            } else {
                this.f62990a.onError(th2);
            }
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            if (this.f62992c) {
                return;
            }
            this.f62990a.onSuccess(obj);
        }
    }

    public h(D d10, InterfaceC6469f interfaceC6469f) {
        this.f62988a = d10;
        this.f62989b = interfaceC6469f;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        this.f62988a.a(new a(b10, this.f62989b));
    }
}
