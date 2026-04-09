package com.ui.wifiman.ui.discovery.prefs.lan;

import A9.i;
import Be.v0;
import F9.AbstractC2859x;
import F9.F;
import F9.I;
import F9.P;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.o1;
import Yg.J;
import android.content.res.Resources;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import m8.AbstractC6780c;
import mh.InterfaceC6835l;
import mh.q;
import th.g;
import z.InterfaceC8687j;

/* loaded from: classes4.dex */
public abstract class f {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f44615a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f44616b;

        /* renamed from: com.ui.wifiman.ui.discovery.prefs.lan.f$a$a, reason: collision with other inner class name */
        static final class C1569a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f44617a;

            /* renamed from: com.ui.wifiman.ui.discovery.prefs.lan.f$a$a$a, reason: collision with other inner class name */
            static final class C1570a implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ d f44618a;

                /* renamed from: com.ui.wifiman.ui.discovery.prefs.lan.f$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1571a extends C6490p implements InterfaceC6835l {
                    C1571a(Object obj) {
                        super(1, obj, d.class, "onUbiquitiOnTopValueChanged", "onUbiquitiOnTopValueChanged(Z)V", 0);
                    }

                    public final void a(boolean z10) {
                        ((d) this.receiver).q0(z10);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Boolean) obj).booleanValue());
                        return J.f24997a;
                    }
                }

                C1570a(d dVar) {
                    this.f44618a = dVar;
                }

                public final void a(i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(947077757, i10, -1, "com.ui.wifiman.ui.discovery.prefs.lan.DiscoveryHomeDisplayPrefsLanUi.<anonymous>.<anonymous>.<anonymous> (DiscoveryHomeDisplayPrefsLanUi.kt:51)");
                    }
                    String strA = H0.f.a(AbstractC6780c.f53588u0, interfaceC3540l, 0);
                    boolean zBooleanValue = ((Boolean) o1.b(this.f44618a.o0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                    d dVar = this.f44618a;
                    interfaceC3540l.U(1525266785);
                    boolean zT = interfaceC3540l.T(dVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C1571a(dVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    I.c(null, strA, null, zBooleanValue, null, 0.0f, (InterfaceC6835l) ((g) objF), null, false, null, null, interfaceC3540l, 0, 0, 1973);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                    a((i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            /* renamed from: com.ui.wifiman.ui.discovery.prefs.lan.f$a$a$b */
            static final class b implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ d f44619a;

                /* renamed from: com.ui.wifiman.ui.discovery.prefs.lan.f$a$a$b$a, reason: collision with other inner class name */
                /* synthetic */ class C1572a extends C6490p implements InterfaceC6835l {
                    C1572a(Object obj) {
                        super(1, obj, d.class, "onSortTypeClicked", "onSortTypeClicked(Lcom/ui/wifiman/ui/discovery/prefs/lan/DiscoveryHomeDisplayPrefsLan$SortType;)V", 0);
                    }

                    public final void a(c p02) {
                        AbstractC6492s.i(p02, "p0");
                        ((d) this.receiver).p0(p02);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a((c) obj);
                        return J.f24997a;
                    }
                }

                b(d dVar) {
                    this.f44619a = dVar;
                }

                public final void a(i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(1044548340, i10, -1, "com.ui.wifiman.ui.discovery.prefs.lan.DiscoveryHomeDisplayPrefsLanUi.<anonymous>.<anonymous>.<anonymous> (DiscoveryHomeDisplayPrefsLanUi.kt:58)");
                    }
                    Ci.c cVar = (Ci.c) o1.b(this.f44619a.n0(), null, interfaceC3540l, 0, 1).getValue();
                    d dVar = this.f44619a;
                    interfaceC3540l.U(1525274167);
                    boolean zT = interfaceC3540l.T(dVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C1572a(dVar);
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

            C1569a(d dVar) {
                this.f44617a = dVar;
            }

            public final void a(InterfaceC8687j UiSettings, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiSettings, "$this$UiSettings");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-344407291, i10, -1, "com.ui.wifiman.ui.discovery.prefs.lan.DiscoveryHomeDisplayPrefsLanUi.<anonymous>.<anonymous> (DiscoveryHomeDisplayPrefsLanUi.kt:50)");
                }
                AbstractC2859x.c(null, null, null, null, null, null, null, null, b0.c.e(947077757, true, new C1570a(this.f44617a), interfaceC3540l, 54), interfaceC3540l, 100663296, 255);
                AbstractC2859x.c(null, null, null, null, null, null, null, null, b0.c.e(1044548340, true, new b(this.f44617a), interfaceC3540l, 54), interfaceC3540l, 100663296, 255);
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
            this.f44615a = eVar;
            this.f44616b = dVar;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1630981618, i10, -1, "com.ui.wifiman.ui.discovery.prefs.lan.DiscoveryHomeDisplayPrefsLanUi.<anonymous> (DiscoveryHomeDisplayPrefsLanUi.kt:49)");
            }
            P.b(this.f44615a, null, null, b0.c.e(-344407291, true, new C1569a(this.f44616b), interfaceC3540l, 54), interfaceC3540l, 3072, 6);
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
    public static final void b(final androidx.compose.ui.e r11, final com.ui.wifiman.ui.discovery.prefs.lan.d r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.discovery.prefs.lan.f.b(androidx.compose.ui.e, com.ui.wifiman.ui.discovery.prefs.lan.d, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, d dVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, dVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
