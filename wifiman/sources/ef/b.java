package Ef;

import Ef.b;
import Fe.j;
import He.i;
import L9.L;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.q;
import s9.d;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import z.InterfaceC8687j;
import z.Y;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4711a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static q f4712b = b0.c.c(416788915, false, a.f4713a);

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4713a = new a();

        /* renamed from: Ef.b$a$a, reason: collision with other inner class name */
        static final class C0198a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC8511f.b f4714a;

            /* renamed from: Ef.b$a$a$a, reason: collision with other inner class name */
            static final class C0199a implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC8511f.b f4715a;

                C0199a(InterfaceC8511f.b bVar) {
                    this.f4715a = bVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J c(InterfaceC8511f.b bVar) {
                    bVar.a();
                    return J.f24997a;
                }

                public final void b(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-319915803, i10, -1, "com.ui.wifiman.ui.wifi.network.prefs.ComposableSingletons$WifiNetworkDisplayPrefsUiKt.lambda-1.<anonymous>.<anonymous>.<anonymous> (WifiNetworkDisplayPrefsUi.kt:34)");
                    }
                    d.b bVar = new d.b(AbstractC6780c.f53468d);
                    interfaceC3540l.U(-1384963474);
                    boolean zT = interfaceC3540l.T(this.f4715a);
                    final InterfaceC8511f.b bVar2 = this.f4715a;
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6824a() { // from class: Ef.a
                            @Override // mh.InterfaceC6824a
                            public final Object invoke() {
                                return b.a.C0198a.C0199a.c(bVar2);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    i.c(null, (InterfaceC6824a) objF, false, bVar, interfaceC3540l, 0, 5);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    b((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            C0198a(InterfaceC8511f.b bVar) {
                this.f4714a = bVar;
            }

            public final void a(Y ModalToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(ModalToolbar, "$this$ModalToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-2089333300, i10, -1, "com.ui.wifiman.ui.wifi.network.prefs.ComposableSingletons$WifiNetworkDisplayPrefsUiKt.lambda-1.<anonymous>.<anonymous> (WifiNetworkDisplayPrefsUi.kt:33)");
                }
                L.b(null, b0.c.e(-319915803, true, new C0199a(this.f4714a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        a() {
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(416788915, i10, -1, "com.ui.wifiman.ui.wifi.network.prefs.ComposableSingletons$WifiNetworkDisplayPrefsUiKt.lambda-1.<anonymous> (WifiNetworkDisplayPrefsUi.kt:29)");
            }
            j.c(null, new d.b(AbstractC6780c.f53356M2), null, null, b0.c.e(-2089333300, true, new C0198a((InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K())), interfaceC3540l, 54), 0L, interfaceC3540l, 24576, 45);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public final q a() {
        return f4712b;
    }
}
