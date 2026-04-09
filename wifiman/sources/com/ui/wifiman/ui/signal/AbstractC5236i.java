package com.ui.wifiman.ui.signal;

import E0.InterfaceC2629g;
import Ee.C2706g;
import L9.AbstractC3198d;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.o1;
import Te.AbstractC3582g0;
import Te.InterfaceC3590k0;
import androidx.compose.ui.e;
import com.ui.wifiman.ui.signal.AbstractC5236i;
import f0.c;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import s9.d;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.W;
import z.Y;
import z.Z;
import z.a0;

/* renamed from: com.ui.wifiman.ui.signal.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5236i {

    /* renamed from: com.ui.wifiman.ui.signal.i$a */
    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5234g f44818a;

        /* renamed from: com.ui.wifiman.ui.signal.i$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1608a extends C6490p implements InterfaceC6824a {
            C1608a(Object obj) {
                super(0, obj, AbstractC5234g.class, "onClearClicked", "onClearClicked()V", 0);
            }

            public final void a() {
                ((AbstractC5234g) this.receiver).s0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        /* renamed from: com.ui.wifiman.ui.signal.i$a$b */
        static final class b implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5234g f44819a;

            /* renamed from: com.ui.wifiman.ui.signal.i$a$b$a, reason: collision with other inner class name */
            static final class C1609a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AbstractC5234g f44820a;

                /* renamed from: com.ui.wifiman.ui.signal.i$a$b$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1610a extends C6490p implements InterfaceC6824a {
                    C1610a(Object obj) {
                        super(0, obj, AbstractC5234g.class, "onDoneClicked", "onDoneClicked()V", 0);
                    }

                    public final void a() {
                        ((AbstractC5234g) this.receiver).t0();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return Yg.J.f24997a;
                    }
                }

                C1609a(AbstractC5234g abstractC5234g) {
                    this.f44820a = abstractC5234g;
                }

                public final void a(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1207532170, i10, -1, "com.ui.wifiman.ui.signal.SignalTabApComparisonConfigUi.<anonymous>.<anonymous>.<anonymous> (SignalTabApComparisonConfigUi.kt:66)");
                    }
                    d.b bVar = new d.b(AbstractC6780c.f53468d);
                    AbstractC5234g abstractC5234g = this.f44820a;
                    interfaceC3540l.U(2127177671);
                    boolean zT = interfaceC3540l.T(abstractC5234g);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C1610a(abstractC5234g);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    He.i.c(null, (InterfaceC6824a) ((th.g) objF), false, bVar, interfaceC3540l, 0, 5);
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

            b(AbstractC5234g abstractC5234g) {
                this.f44819a = abstractC5234g;
            }

            public final void a(Y ModalToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(ModalToolbar, "$this$ModalToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(244573661, i10, -1, "com.ui.wifiman.ui.signal.SignalTabApComparisonConfigUi.<anonymous>.<anonymous> (SignalTabApComparisonConfigUi.kt:65)");
                }
                L9.L.b(null, b0.c.e(-1207532170, true, new C1609a(this.f44819a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
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

        a(AbstractC5234g abstractC5234g) {
            this.f44818a = abstractC5234g;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-468167356, i10, -1, "com.ui.wifiman.ui.signal.SignalTabApComparisonConfigUi.<anonymous> (SignalTabApComparisonConfigUi.kt:56)");
            }
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            s9.d dVar = (s9.d) o1.b(this.f44818a.c(), null, interfaceC3540l, 0, 1).getValue();
            AbstractC3198d.c.b bVar = new AbstractC3198d.c.b(new d.b(AbstractC6780c.f53454b), false, 2, null);
            AbstractC5234g abstractC5234g = this.f44818a;
            interfaceC3540l.U(1832874538);
            boolean zT = interfaceC3540l.T(abstractC5234g);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C1608a(abstractC5234g);
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            Fe.j.c(eVarH, dVar, bVar, (InterfaceC6824a) ((th.g) objF), b0.c.e(244573661, true, new b(this.f44818a), interfaceC3540l, 54), 0L, interfaceC3540l, 24582, 32);
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

    /* renamed from: com.ui.wifiman.ui.signal.i$b */
    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5234g f44821a;

        /* renamed from: com.ui.wifiman.ui.signal.i$b$a */
        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Y f44822a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5233f f44823b;

            a(Y y10, C5233f c5233f) {
                this.f44822a = y10;
                this.f44823b = c5233f;
            }

            public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(2081567151, i10, -1, "com.ui.wifiman.ui.signal.SignalTabApComparisonConfigUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SignalTabApComparisonConfigUi.kt:99)");
                }
                androidx.compose.ui.e eVarB = Y.b(this.f44822a, androidx.compose.ui.e.f28771b0, 1.0f, false, 2, null);
                String str = String.format(H0.f.a(AbstractC6780c.f53513j2, interfaceC3540l, 0), Arrays.copyOf(new Object[]{Integer.valueOf(this.f44823b.b()), Integer.valueOf(this.f44823b.a())}, 2));
                AbstractC6492s.h(str, "format(...)");
                C6562a c6562a = C6562a.f52458a;
                int i11 = C6562a.f52459b;
                a1.b(str, eVarB, c6562a.a(interfaceC3540l, i11).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 0, 0, 65528);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        /* renamed from: com.ui.wifiman.ui.signal.i$b$b, reason: collision with other inner class name */
        static final class C1611b implements mh.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5234g f44824a;

            C1611b(AbstractC5234g abstractC5234g) {
                this.f44824a = abstractC5234g;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Yg.J c(AbstractC5234g abstractC5234g, InterfaceC3590k0 interfaceC3590k0) {
                abstractC5234g.q0(((InterfaceC3590k0.a) interfaceC3590k0).getId());
                return Yg.J.f24997a;
            }

            public final void b(androidx.compose.ui.e modifier, final InterfaceC3590k0 item, InterfaceC3540l interfaceC3540l, int i10) {
                int i11;
                AbstractC6492s.i(modifier, "modifier");
                AbstractC6492s.i(item, "item");
                if ((i10 & 6) == 0) {
                    i11 = i10 | (interfaceC3540l.T(modifier) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= (i10 & 64) == 0 ? interfaceC3540l.T(item) : interfaceC3540l.l(item) ? 32 : 16;
                }
                if ((i11 & 147) == 146 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1738692411, i11, -1, "com.ui.wifiman.ui.signal.SignalTabApComparisonConfigUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SignalTabApComparisonConfigUi.kt:117)");
                }
                boolean z10 = true;
                if (item instanceof InterfaceC3590k0.a) {
                    interfaceC3540l.U(-1545978367);
                    androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(modifier, 0.0f, 1, null);
                    InterfaceC3590k0.a aVar = (InterfaceC3590k0.a) item;
                    boolean zC = aVar.a().c();
                    interfaceC3540l.U(-1545971939);
                    boolean zT = interfaceC3540l.T(this.f44824a);
                    if ((i11 & 112) != 32 && ((i11 & 64) == 0 || !interfaceC3540l.l(item))) {
                        z10 = false;
                    }
                    boolean z11 = zT | z10;
                    final AbstractC5234g abstractC5234g = this.f44824a;
                    Object objF = interfaceC3540l.f();
                    if (z11 || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.signal.k
                            @Override // mh.InterfaceC6824a
                            public final Object invoke() {
                                return AbstractC5236i.b.C1611b.c(abstractC5234g, item);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    AbstractC3582g0.b(androidx.compose.foundation.d.d(eVarH, zC, null, null, (InterfaceC6824a) objF, 6, null), aVar.a(), interfaceC3540l, 0, 0);
                    interfaceC3540l.J();
                } else {
                    if (!(item instanceof InterfaceC3590k0.b)) {
                        interfaceC3540l.U(-1545980400);
                        interfaceC3540l.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540l.U(-680230164);
                    Ee.D.b(androidx.compose.foundation.layout.r.d(modifier, 0.0f, 1, null), ((InterfaceC3590k0.b) item).a(), Pe.a.f18599a.E(), interfaceC3540l, 384);
                    interfaceC3540l.J();
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.r
            public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                b((androidx.compose.ui.e) obj, (InterfaceC3590k0) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                return Yg.J.f24997a;
            }
        }

        b(AbstractC5234g abstractC5234g) {
            this.f44821a = abstractC5234g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(AbstractC5234g abstractC5234g, J9.a tab) {
            AbstractC6492s.i(tab, "tab");
            abstractC5234g.r0(tab.c());
            return Yg.J.f24997a;
        }

        public final void b(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1524508511, i10, -1, "com.ui.wifiman.ui.signal.SignalTabApComparisonConfigUi.<anonymous> (SignalTabApComparisonConfigUi.kt:75)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarF = androidx.compose.foundation.layout.r.f(aVar, 0.0f, 1, null);
            final AbstractC5234g abstractC5234g = this.f44821a;
            C8680c c8680c = C8680c.f66832a;
            C8680c.m mVarG = c8680c.g();
            c.a aVar2 = f0.c.f46573a;
            C0.C cA = AbstractC8685h.a(mVarG, aVar2.k(), interfaceC3540l, 0);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarF);
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
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            a0.a(androidx.compose.foundation.layout.r.i(aVar, c6562a.d(interfaceC3540l, i11).a().b().a(Y0.h.j(12))), interfaceC3540l, 0);
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(aVar, c6562a.d(interfaceC3540l, i11).a().a().c(), 0.0f, 2, null);
            J9.j jVar = (J9.j) o1.b(abstractC5234g.n0(), null, interfaceC3540l, 0, 1).getValue();
            interfaceC3540l.U(-368501509);
            boolean zT = interfaceC3540l.T(abstractC5234g);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: com.ui.wifiman.ui.signal.j
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return AbstractC5236i.b.c(abstractC5234g, (J9.a) obj);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            J9.h.g(eVarK, jVar, false, null, (InterfaceC6835l) objF, interfaceC3540l, 0, 12);
            float f10 = 16;
            a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(f10)), interfaceC3540l, 6);
            androidx.compose.ui.e eVarK2 = androidx.compose.foundation.layout.o.k(aVar, c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null);
            C0.C cB = W.b(c8680c.n(Y0.h.j(f10)), aVar2.l(), interfaceC3540l, 6);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarK2);
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
            E1.c(interfaceC3540lA2, cB, aVar3.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar3.g());
            InterfaceC6839p interfaceC6839pB2 = aVar3.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar3.f());
            Z z10 = Z.f66823a;
            C5233f c5233f = (C5233f) o1.b(abstractC5234g.p0(), null, interfaceC3540l, 0, 1).getValue();
            androidx.compose.ui.e eVarB = Y.b(z10, aVar, 1.0f, false, 2, null);
            String str = String.format(H0.f.a(AbstractC6780c.f53520k2, interfaceC3540l, 0), Arrays.copyOf(new Object[]{Integer.valueOf(c5233f.a())}, 1));
            AbstractC6492s.h(str, "format(...)");
            a1.b(str, eVarB, c6562a.a(interfaceC3540l, i11).f().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 0, 0, 65528);
            AbstractC7385d.e(z10, c5233f.b() > 0, null, null, null, null, b0.c.e(2081567151, true, new a(z10, c5233f), interfaceC3540l, 54), interfaceC3540l, 1572870, 30);
            interfaceC3540l.R();
            androidx.compose.ui.e eVarB2 = InterfaceC8687j.b(c8688k, androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), 1.0f, false, 2, null);
            C0.C cH = androidx.compose.foundation.layout.d.h(aVar2.o(), false);
            int iA3 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540l, eVarB2);
            InterfaceC6824a interfaceC6824aA3 = aVar3.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA3);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA3 = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA3, cH, aVar3.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar3.g());
            InterfaceC6839p interfaceC6839pB3 = aVar3.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar3.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            Ee.z.L(androidx.compose.foundation.layout.r.f(aVar, 0.0f, 1, null), (C2706g) o1.b(abstractC5234g.o0(), null, interfaceC3540l, 0, 1).getValue(), null, false, false, null, null, b0.c.e(-1738692411, true, new C1611b(abstractC5234g), interfaceC3540l, 54), interfaceC3540l, 12582918, 124);
            Ee.B.b(null, 0L, interfaceC3540l, 0, 3);
            interfaceC3540l.R();
            interfaceC3540l.R();
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

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.e r11, final com.ui.wifiman.ui.signal.AbstractC5234g r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.signal.AbstractC5236i.b(androidx.compose.ui.e, com.ui.wifiman.ui.signal.g, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, AbstractC5234g abstractC5234g, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, abstractC5234g, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
