package Qi;

import Ii.C3073p;
import Ii.InterfaceC3069n;
import Yg.J;
import Yg.u;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import gg.B;
import gg.D;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public abstract class b {

    public static final class a implements InterfaceC5914d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3069n f19358a;

        a(InterfaceC3069n interfaceC3069n) {
            this.f19358a = interfaceC3069n;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            InterfaceC3069n interfaceC3069n = this.f19358a;
            u.a aVar = u.f25017b;
            interfaceC3069n.resumeWith(u.c(J.f24997a));
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            b.d(this.f19358a, interfaceC6043c);
        }

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            InterfaceC3069n interfaceC3069n = this.f19358a;
            u.a aVar = u.f25017b;
            interfaceC3069n.resumeWith(u.c(v.a(th2)));
        }
    }

    /* renamed from: Qi.b$b, reason: collision with other inner class name */
    public static final class C0684b implements B {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3069n f19359a;

        C0684b(InterfaceC3069n interfaceC3069n) {
            this.f19359a = interfaceC3069n;
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            b.d(this.f19359a, interfaceC6043c);
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            InterfaceC3069n interfaceC3069n = this.f19359a;
            u.a aVar = u.f25017b;
            interfaceC3069n.resumeWith(u.c(v.a(th2)));
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            this.f19359a.resumeWith(u.c(obj));
        }
    }

    public static final Object b(gg.f fVar, InterfaceC5380e interfaceC5380e) {
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        fVar.e(new a(c3073p));
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU == AbstractC5467b.g() ? objU : J.f24997a;
    }

    public static final Object c(D d10, InterfaceC5380e interfaceC5380e) {
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        d10.a(new C0684b(c3073p));
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU;
    }

    public static final void d(InterfaceC3069n interfaceC3069n, final InterfaceC6043c interfaceC6043c) {
        interfaceC3069n.B(new InterfaceC6835l() { // from class: Qi.a
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return b.e(interfaceC6043c, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(InterfaceC6043c interfaceC6043c, Throwable th2) {
        interfaceC6043c.dispose();
        return J.f24997a;
    }
}
