package Gf;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import mh.InterfaceC6839p;
import s9.d;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7359a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f7360b = b0.c.c(-87439745, false, C0299a.f7363a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6839p f7361c = b0.c.c(1230688585, false, b.f7364a);

    /* renamed from: d, reason: collision with root package name */
    public static InterfaceC6839p f7362d = b0.c.c(1700811968, false, c.f7365a);

    /* renamed from: Gf.a$a, reason: collision with other inner class name */
    static final class C0299a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C0299a f7363a = new C0299a();

        C0299a() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-87439745, i10, -1, "com.ui.wifiman.ui.wifi.scan.component.ComposableSingletons$WifiScanNetworkItemKt.lambda-1.<anonymous> (WifiScanNetworkItem.kt:124)");
            }
            t.o(null, new d.c("-100 Dbm"), interfaceC3540l, 48, 1);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7364a = new b();

        b() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1230688585, i10, -1, "com.ui.wifiman.ui.wifi.scan.component.ComposableSingletons$WifiScanNetworkItemKt.lambda-2.<anonymous> (WifiScanNetworkItem.kt:230)");
            }
            t.k(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), t.s(0, interfaceC3540l, 0, 1), new u(Y0.h.j(50), Y0.h.j(30), null), interfaceC3540l, 390);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class c implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7365a = new c();

        c() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1700811968, i10, -1, "com.ui.wifiman.ui.wifi.scan.component.ComposableSingletons$WifiScanNetworkItemKt.lambda-3.<anonymous> (WifiScanNetworkItem.kt:245)");
            }
            t.g(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), t.s(0, interfaceC3540l, 0, 1), interfaceC3540l, 6);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public final InterfaceC6839p a() {
        return f7360b;
    }
}
