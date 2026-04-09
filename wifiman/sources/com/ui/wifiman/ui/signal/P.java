package com.ui.wifiman.ui.signal;

import E0.InterfaceC2629g;
import Ii.F0;
import N.C0;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.o1;
import android.content.res.Resources;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.P;
import c2.AbstractC4197c;
import c2.C4195a;
import com.google.ar.core.ImageMetadata;
import com.ui.wifiman.ui.component.network.C5205c;
import com.ui.wifiman.ui.signal.P;
import d.AbstractC5265c;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f0.c;
import f2.AbstractC5498D;
import f2.C5501G;
import f2.C5512k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import of.C7125a;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import s9.d;
import ye.AbstractC8664j;
import ye.C8663i;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.Y;
import z.j0;

/* loaded from: classes4.dex */
public abstract class P {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7125a.c f44770a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5205c.b f44771b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5232e f44772c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ N f44773d;

        /* renamed from: com.ui.wifiman.ui.signal.P$a$a, reason: collision with other inner class name */
        static final class C1601a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5232e f44774a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ N f44775b;

            /* renamed from: com.ui.wifiman.ui.signal.P$a$a$a, reason: collision with other inner class name */
            static final class C1602a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ N f44776a;

                /* renamed from: com.ui.wifiman.ui.signal.P$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1603a extends C6490p implements InterfaceC6824a {
                    C1603a(Object obj) {
                        super(0, obj, N.class, "onPlacesAddClicked", "onPlacesAddClicked()V", 0);
                    }

                    public final void a() {
                        ((N) this.receiver).u0();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return Yg.J.f24997a;
                    }
                }

                C1602a(N n10) {
                    this.f44776a = n10;
                }

                public final void a(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                    AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(304335277, i10, -1, "com.ui.wifiman.ui.signal.SignalTabUi.<anonymous>.<anonymous>.<anonymous> (SignalTabUi.kt:59)");
                    }
                    String strA = H0.f.a(AbstractC6780c.f53286C2, interfaceC3540l, 0);
                    N n10 = this.f44776a;
                    interfaceC3540l.U(-1264070341);
                    boolean zT = interfaceC3540l.T(n10);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C1603a(n10);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    L9.O.c(strA, null, false, (InterfaceC6824a) ((th.g) objF), interfaceC3540l, 0, 6);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                    a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return Yg.J.f24997a;
                }
            }

            C1601a(AbstractC5232e abstractC5232e, N n10) {
                this.f44774a = abstractC5232e;
                this.f44775b = n10;
            }

            public final void a(Y WifimanNetworkConnectionToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(WifimanNetworkConnectionToolbar, "$this$WifimanNetworkConnectionToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1508868799, i10, -1, "com.ui.wifiman.ui.signal.SignalTabUi.<anonymous>.<anonymous> (SignalTabUi.kt:54)");
                }
                EnumC5231d enumC5231d = (EnumC5231d) o1.b(this.f44774a.n0(), null, interfaceC3540l, 0, 1).getValue();
                boolean zBooleanValue = ((Boolean) o1.b(this.f44775b.p0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                if (enumC5231d == EnumC5231d.SIGNAL) {
                    if (zBooleanValue) {
                        L9.L.b(null, b0.c.e(304335277, true, new C1602a(this.f44775b), interfaceC3540l, 54), interfaceC3540l, 48, 1);
                    }
                } else if (enumC5231d != EnumC5231d.FLOORPLAN && enumC5231d != null) {
                    throw new NoWhenBranchMatchedException();
                }
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

        a(C7125a.c cVar, C5205c.b bVar, AbstractC5232e abstractC5232e, N n10) {
            this.f44770a = cVar;
            this.f44771b = bVar;
            this.f44772c = abstractC5232e;
            this.f44773d = n10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(447580611, i10, -1, "com.ui.wifiman.ui.signal.SignalTabUi.<anonymous> (SignalTabUi.kt:47)");
            }
            He.C.b(j0.c(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null)), this.f44770a, this.f44771b, b0.c.e(-1508868799, true, new C1601a(this.f44772c, this.f44773d), interfaceC3540l, 54), interfaceC3540l, 3072, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5232e f44777a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f44778b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5240m f44779c;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f44780a;

            a(N n10) {
                this.f44780a = n10;
            }

            public final void a(C5512k it, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(it, "it");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(972806288, i10, -1, "com.ui.wifiman.ui.signal.SignalTabUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SignalTabUi.kt:109)");
                }
                M.c(null, this.f44780a, interfaceC3540l, 0, 1);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((C5512k) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        /* renamed from: com.ui.wifiman.ui.signal.P$b$b, reason: collision with other inner class name */
        static final class C1604b implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5240m f44781a;

            C1604b(AbstractC5240m abstractC5240m) {
                this.f44781a = abstractC5240m;
            }

            public final void a(C5512k it, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(it, "it");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1054295303, i10, -1, "com.ui.wifiman.ui.signal.SignalTabUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SignalTabUi.kt:110)");
                }
                v.b(null, this.f44781a, interfaceC3540l, 0, 1);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((C5512k) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f44782a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f2.w f44783b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(f2.w wVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f44783b = wVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new c(this.f44783b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f44782a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                this.f44783b.u(false);
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((c) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f44784a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f2.w f44785b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ EnumC5231d f44786c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(f2.w wVar, EnumC5231d enumC5231d, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f44785b = wVar;
                this.f44786c = enumC5231d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Yg.J E(C5501G c5501g) {
                c5501g.d(true);
                return Yg.J.f24997a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Yg.J v(f2.w wVar, f2.z zVar) {
                zVar.c(wVar.I().V(), new InterfaceC6835l() { // from class: com.ui.wifiman.ui.signal.U
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return P.b.d.E((C5501G) obj);
                    }
                });
                zVar.g(true);
                zVar.j(true);
                return Yg.J.f24997a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new d(this.f44785b, this.f44786c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                String strName;
                AbstractC5467b.g();
                if (this.f44784a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                f2.w wVar = this.f44785b;
                EnumC5231d enumC5231d = this.f44786c;
                if (enumC5231d == null || (strName = enumC5231d.name()) == null) {
                    strName = "SIGNAL";
                }
                final f2.w wVar2 = this.f44785b;
                wVar.V(strName, new InterfaceC6835l() { // from class: com.ui.wifiman.ui.signal.T
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj2) {
                        return P.b.d.v(wVar2, (f2.z) obj2);
                    }
                });
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((d) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        b(AbstractC5232e abstractC5232e, N n10, AbstractC5240m abstractC5240m) {
            this.f44777a = abstractC5232e;
            this.f44778b = n10;
            this.f44779c = abstractC5240m;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J e(AbstractC5232e abstractC5232e, J9.a tab) {
            EnumC5231d enumC5231d;
            AbstractC6492s.i(tab, "tab");
            int iC = tab.c();
            if (iC == 0) {
                enumC5231d = EnumC5231d.SIGNAL;
            } else {
                if (iC != 1) {
                    throw new IllegalStateException("unknown tab id " + tab.c());
                }
                enumC5231d = EnumC5231d.FLOORPLAN;
            }
            abstractC5232e.o0(enumC5231d);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J f(N n10, AbstractC5240m abstractC5240m, f2.u NavHost) {
            AbstractC6492s.i(NavHost, "$this$NavHost");
            Ae.a.c(NavHost, "SIGNAL", null, null, b0.c.c(972806288, true, new a(n10)), 6, null);
            Ae.a.c(NavHost, "FLOORPLAN", null, null, b0.c.c(1054295303, true, new C1604b(abstractC5240m)), 6, null);
            return Yg.J.f24997a;
        }

        public final void c(z.N scaffoldPadding, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            F0 f02;
            AbstractC6492s.i(scaffoldPadding, "scaffoldPadding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(scaffoldPadding) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-835976132, i11, -1, "com.ui.wifiman.ui.signal.SignalTabUi.<anonymous> (SignalTabUi.kt:74)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.o.h(androidx.compose.foundation.layout.r.f(aVar, 0.0f, 1, null), scaffoldPadding);
            final AbstractC5232e abstractC5232e = this.f44777a;
            final N n10 = this.f44778b;
            final AbstractC5240m abstractC5240m = this.f44779c;
            C8680c.m mVarG = C8680c.f66832a.g();
            c.a aVar2 = f0.c.f46573a;
            C0.C cA = AbstractC8685h.a(mVarG, aVar2.k(), interfaceC3540l, 0);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
            InterfaceC2629g.a aVar3 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar3.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA, cA, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar3.f());
            C8688k c8688k = C8688k.f66923a;
            J9.j jVarE = P.e((EnumC5231d) o1.b(abstractC5232e.n0(), null, interfaceC3540l, 0, 1).getValue(), interfaceC3540l, 0);
            androidx.compose.ui.e eVarH2 = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(eVarH2, c6562a.d(interfaceC3540l, i12).a().a().c(), 0.0f, c6562a.d(interfaceC3540l, i12).a().a().c(), 0.0f, 10, null);
            interfaceC3540l.U(1774766279);
            boolean zT = interfaceC3540l.T(abstractC5232e);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: com.ui.wifiman.ui.signal.Q
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return P.b.e(abstractC5232e, (J9.a) obj);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            J9.h.g(eVarM, jVarE, false, null, (InterfaceC6835l) objF, interfaceC3540l, 0, 12);
            androidx.compose.ui.e eVarA = c8688k.a(aVar, 1.0f, true);
            C0.C cH = androidx.compose.foundation.layout.d.h(aVar2.o(), false);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarA);
            InterfaceC6824a interfaceC6824aA2 = aVar3.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA2);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA2, cH, aVar3.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar3.g());
            InterfaceC6839p interfaceC6839pB2 = aVar3.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar3.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            f2.w wVarD = g2.l.d(new AbstractC5498D[0], interfaceC3540l, 0);
            androidx.compose.ui.e eVarF = androidx.compose.foundation.layout.r.f(aVar, 0.0f, 1, null);
            interfaceC3540l.U(-1264016398);
            boolean zT2 = interfaceC3540l.T(n10) | interfaceC3540l.T(abstractC5240m);
            Object objF2 = interfaceC3540l.f();
            if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new InterfaceC6835l() { // from class: com.ui.wifiman.ui.signal.S
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return P.b.f(n10, abstractC5240m, (f2.u) obj);
                    }
                };
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            g2.m.b(wVarD, "SIGNAL", eVarF, null, null, null, null, null, null, null, (InterfaceC6835l) objF2, interfaceC3540l, 384, 0, 1016);
            interfaceC3540l.U(-1264005140);
            boolean zL = interfaceC3540l.l(wVarD);
            Object objF3 = interfaceC3540l.f();
            if (zL || objF3 == InterfaceC3540l.f21100a.a()) {
                f02 = null;
                objF3 = new c(wVarD, null);
                interfaceC3540l.K(objF3);
            } else {
                f02 = null;
            }
            interfaceC3540l.J();
            T.O.f(wVarD, (InterfaceC6839p) objF3, interfaceC3540l, 0);
            EnumC5231d enumC5231d = (EnumC5231d) o1.b(abstractC5232e.n0(), f02, interfaceC3540l, 0, 1).getValue();
            interfaceC3540l.U(-1263998719);
            boolean zL2 = interfaceC3540l.l(wVarD) | interfaceC3540l.T(enumC5231d);
            Object objF4 = interfaceC3540l.f();
            if (zL2 || objF4 == InterfaceC3540l.f21100a.a()) {
                objF4 = new d(wVarD, enumC5231d, f02);
                interfaceC3540l.K(objF4);
            }
            interfaceC3540l.J();
            T.O.f(enumC5231d, (InterfaceC6839p) objF4, interfaceC3540l, 0);
            Ee.B.b(null, c6562a.a(interfaceC3540l, i12).e().a(), interfaceC3540l, 0, 1);
            interfaceC3540l.R();
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            c((z.N) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void b(androidx.compose.ui.e eVar, AbstractC5232e abstractC5232e, C7125a.c cVar, C5205c.b bVar, N n10, AbstractC5240m abstractC5240m, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        AbstractC5232e abstractC5232e2;
        C7125a.c cVar2;
        C5205c.b bVar2;
        N n11;
        AbstractC5240m abstractC5240m2;
        String str;
        String str2;
        int i13;
        int i14;
        int i15;
        int i16;
        androidx.compose.ui.e eVar3;
        int i17;
        int i18;
        final C5205c.b bVar3;
        int i19;
        N n12;
        AbstractC5240m abstractC5240m3;
        N n13;
        int i20;
        final AbstractC5232e abstractC5232e3;
        final N n14;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(2109335678);
        int i21 = i11 & 1;
        if (i21 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                abstractC5232e2 = abstractC5232e;
                int i22 = interfaceC3540lR.T(abstractC5232e2) ? 32 : 16;
                i12 |= i22;
            } else {
                abstractC5232e2 = abstractC5232e;
            }
            i12 |= i22;
        } else {
            abstractC5232e2 = abstractC5232e;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                cVar2 = cVar;
                int i23 = interfaceC3540lR.T(cVar2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                i12 |= i23;
            } else {
                cVar2 = cVar;
            }
            i12 |= i23;
        } else {
            cVar2 = cVar;
        }
        if ((i10 & 3072) == 0) {
            bVar2 = bVar;
            i12 |= ((i11 & 8) == 0 && interfaceC3540lR.T(bVar2)) ? 2048 : 1024;
        } else {
            bVar2 = bVar;
        }
        if ((i10 & 24576) == 0) {
            n11 = n10;
            i12 |= ((i11 & 16) == 0 && interfaceC3540lR.T(n11)) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        } else {
            n11 = n10;
        }
        if ((196608 & i10) == 0) {
            abstractC5240m2 = abstractC5240m;
            i12 |= ((i11 & 32) == 0 && interfaceC3540lR.T(abstractC5240m2)) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        } else {
            abstractC5240m2 = abstractC5240m;
        }
        if ((74899 & i12) == 74898 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            abstractC5232e3 = abstractC5232e2;
            n14 = n11;
            bVar3 = bVar2;
        } else {
            interfaceC3540lR.q();
            if ((i10 & 1) == 0 || interfaceC3540lR.H()) {
                androidx.compose.ui.e eVar4 = i21 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
                if ((i11 & 2) != 0) {
                    interfaceC3540lR.U(-1927673007);
                    androidx.lifecycle.S sA = C4195a.f33733a.a(interfaceC3540lR, C4195a.f33735c);
                    if (sA == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                    str2 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity";
                    androidx.lifecycle.N nB = AbstractC4197c.b(AbstractC5232e.class, sA, null, (P.c) interfaceC3540lR.t(AbstractC8664j.c()), null, interfaceC3540lR, 0, 16);
                    InterfaceC4017o interfaceC4017o = (InterfaceC4017o) interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Object objT = interfaceC3540lR.t(AbstractC5265c.a());
                    AbstractC6492s.g(objT, str2);
                    androidx.appcompat.app.c cVar3 = (androidx.appcompat.app.c) objT;
                    Object objT2 = interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    i13 = 831146569;
                    interfaceC3540lR.U(831146569);
                    boolean zL = interfaceC3540lR.l(nB) | interfaceC3540lR.l(cVar3) | interfaceC3540lR.l(interfaceC4017o);
                    Object objF = interfaceC3540lR.f();
                    if (zL || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C8663i(nB, interfaceC4017o, cVar3);
                        interfaceC3540lR.K(objF);
                    }
                    interfaceC3540lR.J();
                    T.O.c(objT2, (InterfaceC6835l) objF, interfaceC3540lR, 0);
                    interfaceC3540lR.J();
                    i12 &= -113;
                    i14 = 0;
                    abstractC5232e2 = (AbstractC5232e) nB;
                } else {
                    str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                    str2 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity";
                    i13 = 831146569;
                    i14 = 0;
                }
                if ((i11 & 4) != 0) {
                    interfaceC3540lR.U(-1927673007);
                    androidx.lifecycle.S sA2 = C4195a.f33733a.a(interfaceC3540lR, C4195a.f33735c);
                    if (sA2 == null) {
                        throw new IllegalStateException(str);
                    }
                    int i24 = i13;
                    androidx.lifecycle.N nB2 = AbstractC4197c.b(C7125a.c.class, sA2, null, (P.c) interfaceC3540lR.t(AbstractC8664j.c()), null, interfaceC3540lR, 0, 16);
                    InterfaceC4017o interfaceC4017o2 = (InterfaceC4017o) interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Object objT3 = interfaceC3540lR.t(AbstractC5265c.a());
                    AbstractC6492s.g(objT3, str2);
                    androidx.appcompat.app.c cVar4 = (androidx.appcompat.app.c) objT3;
                    Object objT4 = interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    interfaceC3540lR.U(i24);
                    boolean zL2 = interfaceC3540lR.l(nB2) | interfaceC3540lR.l(cVar4) | interfaceC3540lR.l(interfaceC4017o2);
                    Object objF2 = interfaceC3540lR.f();
                    if (zL2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new C8663i(nB2, interfaceC4017o2, cVar4);
                        interfaceC3540lR.K(objF2);
                    }
                    interfaceC3540lR.J();
                    i15 = 0;
                    T.O.c(objT4, (InterfaceC6835l) objF2, interfaceC3540lR, 0);
                    interfaceC3540lR.J();
                    i12 &= -897;
                    i16 = i24;
                    cVar2 = (C7125a.c) nB2;
                } else {
                    int i25 = i13;
                    i15 = i14;
                    i16 = i25;
                }
                if ((i11 & 8) != 0) {
                    interfaceC3540lR.U(-1927673007);
                    androidx.lifecycle.S sA3 = C4195a.f33733a.a(interfaceC3540lR, C4195a.f33735c);
                    if (sA3 == null) {
                        throw new IllegalStateException(str);
                    }
                    eVar3 = eVar4;
                    int i26 = i15;
                    androidx.lifecycle.N nB3 = AbstractC4197c.b(C5205c.b.class, sA3, null, (P.c) interfaceC3540lR.t(AbstractC8664j.c()), null, interfaceC3540lR, 0, 16);
                    InterfaceC4017o interfaceC4017o3 = (InterfaceC4017o) interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Object objT5 = interfaceC3540lR.t(AbstractC5265c.a());
                    AbstractC6492s.g(objT5, str2);
                    androidx.appcompat.app.c cVar5 = (androidx.appcompat.app.c) objT5;
                    Object objT6 = interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    i17 = 831146569;
                    interfaceC3540lR.U(831146569);
                    boolean zL3 = interfaceC3540lR.l(nB3) | interfaceC3540lR.l(cVar5) | interfaceC3540lR.l(interfaceC4017o3);
                    Object objF3 = interfaceC3540lR.f();
                    if (zL3 || objF3 == InterfaceC3540l.f21100a.a()) {
                        objF3 = new C8663i(nB3, interfaceC4017o3, cVar5);
                        interfaceC3540lR.K(objF3);
                    }
                    interfaceC3540lR.J();
                    T.O.c(objT6, (InterfaceC6835l) objF3, interfaceC3540lR, i26);
                    interfaceC3540lR.J();
                    i18 = i12 & (-7169);
                    bVar3 = (C5205c.b) nB3;
                } else {
                    eVar3 = eVar4;
                    i17 = i16;
                    i18 = i12;
                    bVar3 = bVar;
                }
                if ((i11 & 16) != 0) {
                    interfaceC3540lR.U(-1927673007);
                    androidx.lifecycle.S sA4 = C4195a.f33733a.a(interfaceC3540lR, C4195a.f33735c);
                    if (sA4 == null) {
                        throw new IllegalStateException(str);
                    }
                    i19 = i17;
                    androidx.lifecycle.N nB4 = AbstractC4197c.b(N.class, sA4, null, (P.c) interfaceC3540lR.t(AbstractC8664j.c()), null, interfaceC3540lR, 0, 16);
                    InterfaceC4017o interfaceC4017o4 = (InterfaceC4017o) interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Object objT7 = interfaceC3540lR.t(AbstractC5265c.a());
                    AbstractC6492s.g(objT7, str2);
                    androidx.appcompat.app.c cVar6 = (androidx.appcompat.app.c) objT7;
                    Object objT8 = interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    interfaceC3540lR.U(i19);
                    boolean zL4 = interfaceC3540lR.l(nB4) | interfaceC3540lR.l(cVar6) | interfaceC3540lR.l(interfaceC4017o4);
                    Object objF4 = interfaceC3540lR.f();
                    if (zL4 || objF4 == InterfaceC3540l.f21100a.a()) {
                        objF4 = new C8663i(nB4, interfaceC4017o4, cVar6);
                        interfaceC3540lR.K(objF4);
                    }
                    interfaceC3540lR.J();
                    T.O.c(objT8, (InterfaceC6835l) objF4, interfaceC3540lR, 0);
                    interfaceC3540lR.J();
                    n12 = (N) nB4;
                    i18 &= -57345;
                } else {
                    i19 = i17;
                    n12 = n10;
                }
                if ((i11 & 32) != 0) {
                    interfaceC3540lR.U(-1927673007);
                    androidx.lifecycle.S sA5 = C4195a.f33733a.a(interfaceC3540lR, C4195a.f33735c);
                    if (sA5 == null) {
                        throw new IllegalStateException(str);
                    }
                    androidx.lifecycle.N nB5 = AbstractC4197c.b(AbstractC5240m.class, sA5, null, (P.c) interfaceC3540lR.t(AbstractC8664j.c()), null, interfaceC3540lR, 0, 16);
                    InterfaceC4017o interfaceC4017o5 = (InterfaceC4017o) interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Object objT9 = interfaceC3540lR.t(AbstractC5265c.a());
                    AbstractC6492s.g(objT9, str2);
                    androidx.appcompat.app.c cVar7 = (androidx.appcompat.app.c) objT9;
                    Object objT10 = interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    interfaceC3540lR.U(i19);
                    boolean zL5 = interfaceC3540lR.l(nB5) | interfaceC3540lR.l(cVar7) | interfaceC3540lR.l(interfaceC4017o5);
                    Object objF5 = interfaceC3540lR.f();
                    if (zL5 || objF5 == InterfaceC3540l.f21100a.a()) {
                        objF5 = new C8663i(nB5, interfaceC4017o5, cVar7);
                        interfaceC3540lR.K(objF5);
                    }
                    interfaceC3540lR.J();
                    T.O.c(objT10, (InterfaceC6835l) objF5, interfaceC3540lR, 0);
                    interfaceC3540lR.J();
                    eVar2 = eVar3;
                    i20 = i18 & (-458753);
                    abstractC5240m3 = (AbstractC5240m) nB5;
                    n13 = n12;
                } else {
                    eVar2 = eVar3;
                    abstractC5240m3 = abstractC5240m;
                    n13 = n12;
                    i20 = i18;
                }
            } else {
                interfaceC3540lR.C();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                }
                i20 = i12;
                abstractC5240m3 = abstractC5240m2;
                n13 = n11;
                bVar3 = bVar2;
            }
            interfaceC3540lR.S();
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2109335678, i20, -1, "com.ui.wifiman.ui.signal.SignalTabUi (SignalTabUi.kt:42)");
            }
            C0.a(eVar2, null, b0.c.e(447580611, true, new a(cVar2, bVar3, abstractC5232e2, n13), interfaceC3540lR, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).e().a(), 0L, b0.c.e(-835976132, true, new b(abstractC5232e2, n13, abstractC5240m3), interfaceC3540lR, 54), interfaceC3540lR, (i20 & 14) | 384, 12582912, 98298);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            abstractC5240m2 = abstractC5240m3;
            abstractC5232e3 = abstractC5232e2;
            n14 = n13;
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            final androidx.compose.ui.e eVar5 = eVar2;
            final C7125a.c cVar8 = cVar2;
            final AbstractC5240m abstractC5240m4 = abstractC5240m2;
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.signal.O
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return P.c(eVar5, abstractC5232e3, cVar8, bVar3, n14, abstractC5240m4, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, AbstractC5232e abstractC5232e, C7125a.c cVar, C5205c.b bVar, N n10, AbstractC5240m abstractC5240m, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, abstractC5232e, cVar, bVar, n10, abstractC5240m, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J9.j e(EnumC5231d enumC5231d, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-495317918);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-495317918, i10, -1, "com.ui.wifiman.ui.signal.rememberContentTabs (SignalTabUi.kt:143)");
        }
        interfaceC3540l.U(1867930681);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(enumC5231d)) || (i10 & 6) == 4;
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            d.b bVar = new d.b(AbstractC6780c.f53300E2);
            Pe.a aVar = Pe.a.f18599a;
            objF = new J9.j(new J9.a(0, bVar, aVar.K(), enumC5231d == EnumC5231d.SIGNAL, null, null, 48, null), new J9.a(1, new d.b(AbstractC6780c.f53293D2), aVar.n(), enumC5231d == EnumC5231d.FLOORPLAN, null, null, 48, null));
            interfaceC3540l.K(objF);
        }
        J9.j jVar = (J9.j) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jVar;
    }
}
