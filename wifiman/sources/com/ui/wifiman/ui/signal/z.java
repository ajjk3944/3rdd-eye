package com.ui.wifiman.ui.signal;

import F9.AbstractC2856u;
import F9.AbstractC2859x;
import F9.k0;
import L9.AbstractC3198d;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import T.o1;
import T.t1;
import Zg.AbstractC3689v;
import android.content.res.Resources;
import androidx.compose.ui.e;
import com.ui.wifiman.ui.signal.z;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import s9.d;
import sa.AbstractC7930a;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import z.InterfaceC8687j;
import z.Y;

/* loaded from: classes4.dex */
public abstract class z {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f44883a;

        /* renamed from: com.ui.wifiman.ui.signal.z$a$a, reason: collision with other inner class name */
        static final class C1615a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f44884a;

            /* renamed from: com.ui.wifiman.ui.signal.z$a$a$a, reason: collision with other inner class name */
            static final class C1616a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ w f44885a;

                /* renamed from: com.ui.wifiman.ui.signal.z$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1617a extends C6490p implements InterfaceC6824a {
                    C1617a(Object obj) {
                        super(0, obj, w.class, "onSaveClicked", "onSaveClicked()V", 0);
                    }

                    public final void a() {
                        ((w) this.receiver).r0();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return Yg.J.f24997a;
                    }
                }

                C1616a(w wVar) {
                    this.f44885a = wVar;
                }

                public final void a(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1915199882, i10, -1, "com.ui.wifiman.ui.signal.SignalTabPlaceAddUi.<anonymous>.<anonymous>.<anonymous> (SignalTabPlaceAddUi.kt:56)");
                    }
                    d.b bVar = new d.b(AbstractC6780c.f53496h);
                    boolean zBooleanValue = ((Boolean) o1.b(this.f44885a.o0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                    w wVar = this.f44885a;
                    interfaceC3540l.U(-202901017);
                    boolean zT = interfaceC3540l.T(wVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C1617a(wVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    He.i.c(null, (InterfaceC6824a) ((th.g) objF), zBooleanValue, bVar, interfaceC3540l, 0, 1);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return Yg.J.f24997a;
                }
            }

            C1615a(w wVar) {
                this.f44884a = wVar;
            }

            public final void a(Y ModalToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(ModalToolbar, "$this$ModalToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1007073373, i10, -1, "com.ui.wifiman.ui.signal.SignalTabPlaceAddUi.<anonymous>.<anonymous> (SignalTabPlaceAddUi.kt:55)");
                }
                L9.L.b(null, b0.c.e(-1915199882, true, new C1616a(this.f44884a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        a(w wVar) {
            this.f44883a = wVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(InterfaceC8511f.b bVar) {
            bVar.a();
            return Yg.J.f24997a;
        }

        public final void b(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(705274180, i10, -1, "com.ui.wifiman.ui.signal.SignalTabPlaceAddUi.<anonymous> (SignalTabPlaceAddUi.kt:47)");
            }
            final InterfaceC8511f.b bVar = (InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K());
            d.b bVar2 = new d.b(AbstractC6780c.f53279B2);
            AbstractC3198d.c.b bVar3 = new AbstractC3198d.c.b(new d.b(AbstractC6780c.f53447a), false, 2, null);
            interfaceC3540l.U(-121251592);
            boolean zT = interfaceC3540l.T(bVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.signal.y
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return z.a.c(bVar);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            Fe.j.c(null, bVar2, bVar3, (InterfaceC6824a) objF, b0.c.e(1007073373, true, new C1615a(this.f44883a), interfaceC3540l, 54), 0L, interfaceC3540l, 24576, 33);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f44886a;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f44887a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f44888b;

            /* renamed from: com.ui.wifiman.ui.signal.z$b$a$a, reason: collision with other inner class name */
            static final class C1618a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ w f44889a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC3551q0 f44890b;

                C1618a(w wVar, InterfaceC3551q0 interfaceC3551q0) {
                    this.f44889a = wVar;
                    this.f44890b = interfaceC3551q0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Yg.J e(w wVar, F.B KeyboardActions) {
                    AbstractC6492s.i(KeyboardActions, "$this$KeyboardActions");
                    wVar.r0();
                    return Yg.J.f24997a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Yg.J f(w wVar, InterfaceC3551q0 interfaceC3551q0, String it) {
                    AbstractC6492s.i(it, "it");
                    b.f(interfaceC3551q0, it);
                    wVar.q0(it);
                    return Yg.J.f24997a;
                }

                public final void c(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(197465874, i10, -1, "com.ui.wifiman.ui.signal.SignalTabPlaceAddUi.<anonymous>.<anonymous>.<anonymous> (SignalTabPlaceAddUi.kt:80)");
                    }
                    androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                    String strA = H0.f.a(AbstractC6780c.f53582t1, interfaceC3540l, 0);
                    String strA2 = H0.f.a(AbstractC6780c.f53272A2, interfaceC3540l, 0);
                    String strE = b.e(this.f44890b);
                    F.D d10 = new F.D(0, (Boolean) null, 0, R0.r.f19498b.b(), (R0.K) null, (Boolean) null, (S0.e) null, 119, (DefaultConstructorMarker) null);
                    interfaceC3540l.U(-202865364);
                    boolean zT = interfaceC3540l.T(this.f44889a);
                    final w wVar = this.f44889a;
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6835l() { // from class: com.ui.wifiman.ui.signal.A
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return z.b.a.C1618a.e(wVar, (F.B) obj);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    F.C c10 = new F.C((InterfaceC6835l) objF, null, null, null, null, null, 62, null);
                    interfaceC3540l.U(-202862655);
                    boolean zT2 = interfaceC3540l.T(this.f44889a);
                    final w wVar2 = this.f44889a;
                    final InterfaceC3551q0 interfaceC3551q0 = this.f44890b;
                    Object objF2 = interfaceC3540l.f();
                    if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new InterfaceC6835l() { // from class: com.ui.wifiman.ui.signal.B
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return z.b.a.C1618a.f(wVar2, interfaceC3551q0, (String) obj);
                            }
                        };
                        interfaceC3540l.K(objF2);
                    }
                    interfaceC3540l.J();
                    k0.d(eVarH, strA, null, strE, (InterfaceC6835l) objF2, null, null, null, false, null, 0, strA2, null, 0L, null, false, false, null, d10, c10, null, interfaceC3540l, 6, 100663296, 0, 1308644);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                    c((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return Yg.J.f24997a;
                }
            }

            /* renamed from: com.ui.wifiman.ui.signal.z$b$a$b, reason: collision with other inner class name */
            static final class C1619b implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ w f44891a;

                C1619b(w wVar) {
                    this.f44891a = wVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Yg.J c(w wVar, String str) {
                    wVar.p0(str);
                    return Yg.J.f24997a;
                }

                public final void b(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) {
                    InterfaceC3540l interfaceC3540l2 = interfaceC3540l;
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(1456102907, i10, -1, "com.ui.wifiman.ui.signal.SignalTabPlaceAddUi.<anonymous>.<anonymous>.<anonymous> (SignalTabPlaceAddUi.kt:100)");
                    }
                    Object obj = null;
                    int i11 = 0;
                    int i12 = 1;
                    Iterable<s9.d> iterable = (Iterable) o1.b(this.f44891a.n0(), null, interfaceC3540l2, 0, 1).getValue();
                    final w wVar = this.f44891a;
                    ArrayList arrayList = new ArrayList(AbstractC3689v.w(iterable, 10));
                    for (s9.d dVar : iterable) {
                        final String strB = AbstractC7930a.b(dVar, interfaceC3540l2, i11);
                        androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, i12, obj);
                        String strB2 = AbstractC7930a.b(dVar, interfaceC3540l2, i11);
                        interfaceC3540l2.U(448235995);
                        boolean zT = interfaceC3540l2.T(wVar) | interfaceC3540l2.T(strB);
                        Object objF = interfaceC3540l.f();
                        if (zT || objF == InterfaceC3540l.f21100a.a()) {
                            objF = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.signal.C
                                @Override // mh.InterfaceC6824a
                                public final Object invoke() {
                                    return z.b.a.C1619b.c(wVar, strB);
                                }
                            };
                            interfaceC3540l2.K(objF);
                        }
                        interfaceC3540l.J();
                        ArrayList arrayList2 = arrayList;
                        interfaceC3540l2 = interfaceC3540l;
                        AbstractC2856u.c(eVarH, null, strB2, null, null, null, null, false, null, null, (InterfaceC6824a) objF, null, 0.0f, null, interfaceC3540l2, 196614, 0, 15322);
                        arrayList2.add(Yg.J.f24997a);
                        arrayList = arrayList2;
                        obj = obj;
                        wVar = wVar;
                        i12 = i12;
                        i11 = i11;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    b((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return Yg.J.f24997a;
                }
            }

            a(w wVar, InterfaceC3551q0 interfaceC3551q0) {
                this.f44887a = wVar;
                this.f44888b = interfaceC3551q0;
            }

            public final void a(InterfaceC8687j UiSettings, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiSettings, "$this$UiSettings");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1274379382, i10, -1, "com.ui.wifiman.ui.signal.SignalTabPlaceAddUi.<anonymous>.<anonymous> (SignalTabPlaceAddUi.kt:77)");
                }
                e.a aVar = androidx.compose.ui.e.f28771b0;
                AbstractC2859x.c(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), null, null, null, null, null, null, null, b0.c.e(197465874, true, new C1618a(this.f44887a, this.f44888b), interfaceC3540l, 54), interfaceC3540l, 100663302, 254);
                AbstractC2859x.c(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), null, null, null, null, null, null, null, b0.c.e(1456102907, true, new C1619b(this.f44887a), interfaceC3540l, 54), interfaceC3540l, 100663302, 254);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        b(w wVar) {
            this.f44886a = wVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String e(InterfaceC3551q0 interfaceC3551q0) {
            return (String) interfaceC3551q0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(InterfaceC3551q0 interfaceC3551q0, String str) {
            interfaceC3551q0.setValue(str);
        }

        public final void c(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(89044257, i10, -1, "com.ui.wifiman.ui.signal.SignalTabPlaceAddUi.<anonymous> (SignalTabPlaceAddUi.kt:66)");
            }
            interfaceC3540l.U(-121235945);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = t1.d("", null, 2, null);
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            F9.P.b(eVarH, null, androidx.compose.foundation.layout.o.d(c6562a.d(interfaceC3540l, i11).a().a().c(), Y0.h.j(0), c6562a.d(interfaceC3540l, i11).a().a().c(), c6562a.d(interfaceC3540l, i11).a().b().d()), b0.c.e(-1274379382, true, new a(this.f44886a, (InterfaceC3551q0) objF), interfaceC3540l, 54), interfaceC3540l, 3078, 2);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            c((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.e r11, final com.ui.wifiman.ui.signal.w r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.signal.z.b(androidx.compose.ui.e, com.ui.wifiman.ui.signal.w, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, w wVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, wVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
