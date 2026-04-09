package com.ui.wifiman.ui.settings.preferences;

import Be.v0;
import F9.AbstractC2859x;
import F9.F;
import F9.P;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.o1;
import Yg.J;
import Zg.AbstractC3689v;
import com.ui.wifiman.ui.settings.preferences.t;
import com.ui.wifiman.ui.settings.preferences.x;
import fh.InterfaceC5826a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import z.InterfaceC8687j;

/* loaded from: classes4.dex */
public abstract class x {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f44726a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f44727b;

        /* renamed from: com.ui.wifiman.ui.settings.preferences.x$a$a, reason: collision with other inner class name */
        static final class C1595a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ u f44728a;

            /* renamed from: com.ui.wifiman.ui.settings.preferences.x$a$a$a, reason: collision with other inner class name */
            static final class C1596a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Ci.c f44729a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ u f44730b;

                C1596a(Ci.c cVar, u uVar) {
                    this.f44729a = cVar;
                    this.f44730b = uVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J c(u uVar, t it) {
                    AbstractC6492s.i(it, "it");
                    uVar.o0(it.e());
                    return J.f24997a;
                }

                public final void b(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1241131087, i10, -1, "com.ui.wifiman.ui.settings.preferences.UnitSystemConfigUi.<anonymous>.<anonymous>.<anonymous> (UnitSystemConfigUi.kt:62)");
                    }
                    Ci.c cVar = this.f44729a;
                    interfaceC3540l.U(462749685);
                    boolean zT = interfaceC3540l.T(this.f44730b);
                    final u uVar = this.f44730b;
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6835l() { // from class: com.ui.wifiman.ui.settings.preferences.w
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return x.a.C1595a.C1596a.c(uVar, (t) obj);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    F.c(null, cVar, (InterfaceC6835l) objF, interfaceC3540l, 0, 1);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    b((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            /* renamed from: com.ui.wifiman.ui.settings.preferences.x$a$a$b */
            public /* synthetic */ class b {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f44731a;

                static {
                    int[] iArr = new int[T7.c.values().length];
                    try {
                        iArr[T7.c.METRIC.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[T7.c.IMPERIAL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f44731a = iArr;
                }
            }

            C1595a(u uVar) {
                this.f44728a = uVar;
            }

            public final void a(InterfaceC8687j UiSettings, InterfaceC3540l interfaceC3540l, int i10) {
                t bVar;
                AbstractC6492s.i(UiSettings, "$this$UiSettings");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(854872105, i10, -1, "com.ui.wifiman.ui.settings.preferences.UnitSystemConfigUi.<anonymous>.<anonymous> (UnitSystemConfigUi.kt:51)");
                }
                T7.c cVar = (T7.c) o1.b(this.f44728a.n0(), null, interfaceC3540l, 0, 1).getValue();
                interfaceC3540l.U(1859776328);
                boolean zT = interfaceC3540l.T(cVar);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    InterfaceC5826a entries = T7.c.getEntries();
                    ArrayList arrayList = new ArrayList(AbstractC3689v.w(entries, 10));
                    Iterator<E> it = entries.iterator();
                    while (it.hasNext()) {
                        int i11 = b.f44731a[((T7.c) it.next()).ordinal()];
                        if (i11 == 1) {
                            bVar = new t.b(cVar == T7.c.METRIC);
                        } else {
                            if (i11 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar = new t.a(cVar == T7.c.IMPERIAL);
                        }
                        arrayList.add(bVar);
                    }
                    objF = Ci.a.h(arrayList);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                AbstractC2859x.c(null, null, null, null, null, null, null, null, b0.c.e(-1241131087, true, new C1596a((Ci.c) objF, this.f44728a), interfaceC3540l, 54), interfaceC3540l, 100663296, 255);
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

        a(androidx.compose.ui.e eVar, u uVar) {
            this.f44726a = eVar;
            this.f44727b = uVar;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2118133952, i10, -1, "com.ui.wifiman.ui.settings.preferences.UnitSystemConfigUi.<anonymous> (UnitSystemConfigUi.kt:50)");
            }
            P.b(this.f44726a, null, null, b0.c.e(854872105, true, new C1595a(this.f44727b), interfaceC3540l, 54), interfaceC3540l, 3072, 6);
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
    public static final void b(final androidx.compose.ui.e r11, final com.ui.wifiman.ui.settings.preferences.u r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.settings.preferences.x.b(androidx.compose.ui.e, com.ui.wifiman.ui.settings.preferences.u, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, u uVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, uVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
