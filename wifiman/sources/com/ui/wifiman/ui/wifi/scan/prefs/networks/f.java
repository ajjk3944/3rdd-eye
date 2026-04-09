package com.ui.wifiman.ui.wifi.scan.prefs.networks;

import A9.i;
import Be.v0;
import F9.AbstractC2859x;
import F9.F;
import F9.P;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.o1;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6835l;
import mh.q;
import th.g;
import z.InterfaceC8687j;

/* loaded from: classes4.dex */
public abstract class f {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f45216a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f45217b;

        /* renamed from: com.ui.wifiman.ui.wifi.scan.prefs.networks.f$a$a, reason: collision with other inner class name */
        static final class C1648a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f45218a;

            /* renamed from: com.ui.wifiman.ui.wifi.scan.prefs.networks.f$a$a$a, reason: collision with other inner class name */
            static final class C1649a implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ d f45219a;

                /* renamed from: com.ui.wifiman.ui.wifi.scan.prefs.networks.f$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1650a extends C6490p implements InterfaceC6835l {
                    C1650a(Object obj) {
                        super(1, obj, d.class, "onSortTypeClicked", "onSortTypeClicked(Lcom/ui/wifiman/ui/wifi/scan/prefs/networks/WifiScanDisplayPrefsNetworks$SortType;)V", 0);
                    }

                    public final void a(c p02) {
                        AbstractC6492s.i(p02, "p0");
                        ((d) this.receiver).o0(p02);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a((c) obj);
                        return J.f24997a;
                    }
                }

                C1649a(d dVar) {
                    this.f45219a = dVar;
                }

                public final void a(i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(1388843843, i10, -1, "com.ui.wifiman.ui.wifi.scan.prefs.networks.WifiScanDisplayPrefsNetworksUi.<anonymous>.<anonymous>.<anonymous> (WifiScanDisplayPrefsNetworksUi.kt:49)");
                    }
                    Ci.c cVar = (Ci.c) o1.b(this.f45219a.n0(), null, interfaceC3540l, 0, 1).getValue();
                    d dVar = this.f45219a;
                    interfaceC3540l.U(991085530);
                    boolean zT = interfaceC3540l.T(dVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C1650a(dVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    F.c(null, cVar, (InterfaceC6835l) ((g) objF), interfaceC3540l, 0, 1);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    a((i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            C1648a(d dVar) {
                this.f45218a = dVar;
            }

            public final void a(InterfaceC8687j UiSettings, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiSettings, "$this$UiSettings");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(256223163, i10, -1, "com.ui.wifiman.ui.wifi.scan.prefs.networks.WifiScanDisplayPrefsNetworksUi.<anonymous>.<anonymous> (WifiScanDisplayPrefsNetworksUi.kt:48)");
                }
                AbstractC2859x.c(null, null, null, null, null, null, null, null, b0.c.e(1388843843, true, new C1649a(this.f45218a), interfaceC3540l, 54), interfaceC3540l, 100663296, 255);
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

        a(androidx.compose.ui.e eVar, d dVar) {
            this.f45216a = eVar;
            this.f45217b = dVar;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1732130386, i10, -1, "com.ui.wifiman.ui.wifi.scan.prefs.networks.WifiScanDisplayPrefsNetworksUi.<anonymous> (WifiScanDisplayPrefsNetworksUi.kt:47)");
            }
            P.b(this.f45216a, null, null, b0.c.e(256223163, true, new C1648a(this.f45217b), interfaceC3540l, 54), interfaceC3540l, 3072, 6);
            v0.b(null, interfaceC3540l, 0, 1);
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

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.e r11, final com.ui.wifiman.ui.wifi.scan.prefs.networks.d r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.wifi.scan.prefs.networks.f.b(androidx.compose.ui.e, com.ui.wifiman.ui.wifi.scan.prefs.networks.d, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, d dVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, dVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
