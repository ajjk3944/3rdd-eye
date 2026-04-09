package jf;

import Be.AbstractC2489y;
import Be.v0;
import C0.C;
import E0.InterfaceC2629g;
import F9.u0;
import L0.C3174d;
import L0.U;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.O;
import T.X0;
import T.o1;
import W0.t;
import Yg.J;
import android.content.res.Resources;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import c2.AbstractC4197c;
import c2.C4195a;
import d.AbstractC5265c;
import f0.c;
import hf.AbstractC6027J;
import hf.C6039k;
import jf.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m0.C6733v0;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import ye.AbstractC8664j;
import ye.C8663i;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.W;
import z.Y;
import z.Z;
import z.a0;

/* loaded from: classes4.dex */
public abstract class l {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f50844a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6324g f50845b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6325h f50846c;

        a(androidx.compose.ui.e eVar, C6324g c6324g, AbstractC6325h abstractC6325h) {
            this.f50844a = eVar;
            this.f50845b = c6324g;
            this.f50846c = abstractC6325h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(C6039k c6039k, AbstractC6325h abstractC6325h) {
            if (c6039k.a() != null) {
                abstractC6325h.s0(c6039k.a());
            }
            return J.f24997a;
        }

        public final void b(InterfaceC8687j UiContentCard, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6325h abstractC6325h;
            C6324g c6324g;
            float f10;
            C8680c c8680c;
            AbstractC6492s.i(UiContentCard, "$this$UiContentCard");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1922624864, i10, -1, "com.ui.wifiman.ui.speedtest.result.SpeedtestResultDetailContentUi.<anonymous>.<anonymous>.<anonymous> (SpeedtestResultDetailContentUi.kt:63)");
            }
            float f11 = 16;
            a0.a(r.l(this.f50844a, Y0.h.j(f11)), interfaceC3540l, 0);
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = r.h(aVar, 0.0f, 1, null);
            C8680c c8680c2 = C8680c.f66832a;
            float f12 = 4;
            C8680c.f fVarN = c8680c2.n(Y0.h.j(f12));
            C6324g c6324g2 = this.f50845b;
            androidx.compose.ui.e eVar = this.f50844a;
            AbstractC6325h abstractC6325h2 = this.f50846c;
            c.a aVar2 = f0.c.f46573a;
            C cA = AbstractC8685h.a(fVarN, aVar2.k(), interfaceC3540l, 6);
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
            float f13 = 8;
            l.c(androidx.compose.foundation.layout.o.j(r.h(aVar, 0.0f, 1, null), Y0.h.j(f11), Y0.h.j(f13)), c6324g2, interfaceC3540l, 6, 0);
            AbstractC6027J.E(androidx.compose.foundation.layout.o.j(r.h(aVar, 0.0f, 1, null), Y0.h.j(f11), Y0.h.j(f13)), c6324g2.g(), interfaceC3540l, 6);
            if (c6324g2.c() != null) {
                interfaceC3540l.U(-1832510579);
                abstractC6325h = abstractC6325h2;
                c6324g = c6324g2;
                f10 = f12;
                c8680c = c8680c2;
                AbstractC2489y.b(androidx.compose.foundation.layout.o.j(r.h(eVar, 0.0f, 1, null), Y0.h.j(f11), Y0.h.j(f13)), C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f(), N9.b.f16117a.A(), c6324g2.c(), interfaceC3540l, 0, 0);
                interfaceC3540l.J();
            } else {
                abstractC6325h = abstractC6325h2;
                c6324g = c6324g2;
                f10 = f12;
                c8680c = c8680c2;
                interfaceC3540l.U(-1831922385);
                a0.a(r.i(aVar, Y0.h.j(30)), interfaceC3540l, 6);
                interfaceC3540l.J();
            }
            androidx.compose.ui.e eVarK = r.k(r.h(aVar, 0.0f, 1, null), Y0.h.j(210), 0.0f, 2, null);
            C cA2 = AbstractC8685h.a(c8680c.g(), aVar2.k(), interfaceC3540l, 0);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarK);
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
            E1.c(interfaceC3540lA2, cA2, aVar3.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar3.g());
            InterfaceC6839p interfaceC6839pB2 = aVar3.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar3.f());
            interfaceC3540l.U(-1658915572);
            for (final C6039k c6039k : c6324g.d()) {
                androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), Y0.h.j(f11), Y0.h.j(f10));
                s9.d dVarB = c6039k.b();
                s9.d dVarC = c6039k.c();
                boolean z10 = c6039k.a() != null;
                interfaceC3540l.U(2030003365);
                final AbstractC6325h abstractC6325h3 = abstractC6325h;
                boolean zT = interfaceC3540l.T(c6039k) | interfaceC3540l.T(abstractC6325h3);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: jf.k
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return l.a.c(c6039k, abstractC6325h3);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                hf.m.b(eVarJ, dVarB, dVarC, z10, (InterfaceC6824a) objF, interfaceC3540l, 6);
                abstractC6325h = abstractC6325h3;
            }
            interfaceC3540l.J();
            interfaceC3540l.R();
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6322e f50847a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6325h f50848b;

        static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6322e f50849a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC6325h f50850b;

            /* renamed from: jf.l$b$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1878a extends C6490p implements InterfaceC6835l {
                C1878a(Object obj) {
                    super(1, obj, AbstractC6325h.class, "onShareResultsWithYourISPChanged", "onShareResultsWithYourISPChanged(Z)V", 0);
                }

                public final void a(boolean z10) {
                    ((AbstractC6325h) this.receiver).w0(z10);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((Boolean) obj).booleanValue());
                    return J.f24997a;
                }
            }

            a(C6322e c6322e, AbstractC6325h abstractC6325h) {
                this.f50849a = c6322e;
                this.f50850b = abstractC6325h;
            }

            public final void a(InterfaceC8687j UiContentCard, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                AbstractC6492s.i(UiContentCard, "$this$UiContentCard");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-771428058, i10, -1, "com.ui.wifiman.ui.speedtest.result.SpeedtestResultDetailContentUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedtestResultDetailContentUi.kt:155)");
                }
                androidx.compose.ui.e eVarH = r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                String strA = H0.f.a(AbstractC6780c.f53563q3, interfaceC3540l, 0);
                String strA2 = H0.f.a(AbstractC6780c.f53570r3, interfaceC3540l, 0);
                boolean zA = this.f50849a.a();
                AbstractC6325h abstractC6325h = this.f50850b;
                interfaceC3540l.U(1603547358);
                boolean zT = interfaceC3540l.T(abstractC6325h);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new C1878a(abstractC6325h);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                u0.c(eVarH, null, strA, strA2, zA, (InterfaceC6835l) ((th.g) objF), null, null, false, null, interfaceC3540l, 6, 962);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        b(C6322e c6322e, AbstractC6325h abstractC6325h) {
            this.f50847a = c6322e;
            this.f50848b = abstractC6325h;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-365325149, i10, -1, "com.ui.wifiman.ui.speedtest.result.SpeedtestResultDetailContentUi.<anonymous>.<anonymous> (SpeedtestResultDetailContentUi.kt:149)");
            }
            C6322e c6322e = this.f50847a;
            if (c6322e != null) {
                B9.h.i(androidx.compose.foundation.layout.o.k(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().a().c(), 0.0f, 2, null), null, null, null, null, null, null, null, b0.c.e(-771428058, true, new a(c6322e, this.f50848b), interfaceC3540l, 54), interfaceC3540l, 100663296, 254);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* synthetic */ class c extends C6490p implements InterfaceC6824a {
        c(Object obj) {
            super(0, obj, AbstractC6325h.class, "onDoneClicked", "onDoneClicked()V", 0);
        }

        public final void a() {
            ((AbstractC6325h) this.receiver).t0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    /* synthetic */ class d extends C6490p implements InterfaceC6824a {
        d(Object obj) {
            super(0, obj, AbstractC6325h.class, "onShareClicked", "onShareClicked()V", 0);
        }

        public final void a() {
            ((AbstractC6325h) this.receiver).v0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    /* synthetic */ class e extends C6490p implements InterfaceC6824a {
        e(Object obj) {
            super(0, obj, AbstractC6325h.class, "onReportProblemClicked", "onReportProblemClicked()V", 0);
        }

        public final void a() {
            ((AbstractC6325h) this.receiver).u0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(androidx.compose.ui.e eVar, final C6324g c6324g, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(772234401);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(c6324g) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(772234401, i12, -1, "com.ui.wifiman.ui.speedtest.result.Header (SpeedtestResultDetailContentUi.kt:209)");
            }
            C8680c c8680c = C8680c.f66832a;
            C8680c.f fVarN = c8680c.n(Y0.h.j(2));
            c.a aVar = f0.c.f46573a;
            C cA = AbstractC8685h.a(fVarN, aVar.k(), interfaceC3540lR, 6);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar3);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, cA, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = r.h(aVar3, 0.0f, 1, null);
            float f10 = 4;
            C cB = W.b(c8680c.n(Y0.h.j(f10)), aVar.l(), interfaceC3540lR, 6);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarH);
            InterfaceC6824a interfaceC6824aA2 = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA2);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA2, cB, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            Z z10 = Z.f66823a;
            s9.b bVarA = c6324g.a();
            float f11 = 16;
            androidx.compose.ui.e eVarV = r.v(aVar3, Y0.h.j(f11));
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            androidx.compose.ui.e eVar4 = eVar3;
            AbstractC8049c.c(bVarA, eVarV, C6733v0.g(c6562a.a(interfaceC3540lR, i14).a().d().f()), null, interfaceC3540lR, 48, 4);
            androidx.compose.ui.e eVarB = Y.b(z10, aVar3, 1.0f, false, 2, null);
            C3174d c3174dA = AbstractC7930a.a(c6324g.b(), interfaceC3540lR, 0);
            U uA = c6562a.c(interfaceC3540lR, i14).b().a();
            long jA = c6562a.a(interfaceC3540lR, i14).f().a();
            t.a aVar4 = t.f23567a;
            a1.c(c3174dA, eVarB, jA, 0L, null, null, null, 0L, null, null, 0L, aVar4.b(), false, 1, 0, null, null, uA, interfaceC3540lR, 0, 3120, 120824);
            a1.c(AbstractC7930a.a(c6324g.f(), interfaceC3540lR, 0), wf.c.c(aVar3, 0.7f), c6562a.a(interfaceC3540lR, i14).f().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i14).b().f(), interfaceC3540lR, 0, 0, 131064);
            interfaceC3540lR.R();
            androidx.compose.ui.e eVarH2 = r.h(aVar3, 0.0f, 1, null);
            C cB2 = W.b(c8680c.n(Y0.h.j(f10)), aVar.l(), interfaceC3540lR, 6);
            int iA3 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540lR, eVarH2);
            InterfaceC6824a interfaceC6824aA3 = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA3);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA3 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA3, cB2, aVar2.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar2.g());
            InterfaceC6839p interfaceC6839pB3 = aVar2.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar2.f());
            a0.a(r.z(aVar3, Y0.h.j(f11)), interfaceC3540lR, 6);
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(AbstractC7930a.a(c6324g.e(), interfaceC3540lR, 0), null, c6562a.a(interfaceC3540lR, i14).f().c(), 0L, null, null, null, 0L, null, null, 0L, aVar4.b(), false, 1, 0, null, null, c6562a.c(interfaceC3540lR, i14).b().f(), interfaceC3540l2, 0, 3120, 120826);
            interfaceC3540l2.R();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar4;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: jf.j
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return l.d(eVar2, c6324g, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(androidx.compose.ui.e eVar, C6324g c6324g, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, c6324g, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    public static final void e(androidx.compose.ui.e eVar, AbstractC6325h abstractC6325h, InterfaceC3540l interfaceC3540l, final int i10, final int i11) throws Resources.NotFoundException {
        final androidx.compose.ui.e eVar2;
        int i12;
        AbstractC6325h abstractC6325h2;
        int i13;
        AbstractC6325h abstractC6325h3;
        int i14;
        androidx.compose.ui.e eVar3;
        C8680c c8680c;
        int i15;
        AbstractC6325h abstractC6325h4;
        androidx.compose.ui.e eVar4;
        InterfaceC3540l interfaceC3540l2;
        final AbstractC6325h abstractC6325h5;
        e.a aVar;
        int i16;
        int i17;
        int i18;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-167283170);
        int i19 = i11 & 1;
        if (i19 != 0) {
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
                abstractC6325h2 = abstractC6325h;
                if (interfaceC3540lR.T(abstractC6325h2)) {
                    i18 = 32;
                }
                i12 |= i18;
            } else {
                abstractC6325h2 = abstractC6325h;
            }
            i18 = 16;
            i12 |= i18;
        } else {
            abstractC6325h2 = abstractC6325h;
        }
        int i20 = i12;
        if ((i20 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            abstractC6325h5 = abstractC6325h2;
        } else {
            interfaceC3540lR.q();
            if ((i10 & 1) == 0 || interfaceC3540lR.H()) {
                androidx.compose.ui.e eVar5 = i19 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
                if ((i11 & 2) != 0) {
                    interfaceC3540lR.U(-1927673007);
                    S sA = C4195a.f33733a.a(interfaceC3540lR, C4195a.f33735c);
                    if (sA == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    i13 = 0;
                    N nB = AbstractC4197c.b(AbstractC6325h.class, sA, null, (P.c) interfaceC3540lR.t(AbstractC8664j.c()), null, interfaceC3540lR, 0, 16);
                    InterfaceC4017o interfaceC4017o = (InterfaceC4017o) interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Object objT = interfaceC3540lR.t(AbstractC5265c.a());
                    AbstractC6492s.g(objT, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) objT;
                    Object objT2 = interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    interfaceC3540lR.U(831146569);
                    boolean zL = interfaceC3540lR.l(nB) | interfaceC3540lR.l(cVar) | interfaceC3540lR.l(interfaceC4017o);
                    Object objF = interfaceC3540lR.f();
                    if (zL || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C8663i(nB, interfaceC4017o, cVar);
                        interfaceC3540lR.K(objF);
                    }
                    interfaceC3540lR.J();
                    O.c(objT2, (InterfaceC6835l) objF, interfaceC3540lR, 0);
                    interfaceC3540lR.J();
                    i20 &= -113;
                    abstractC6325h3 = (AbstractC6325h) nB;
                } else {
                    i13 = 0;
                    abstractC6325h3 = abstractC6325h2;
                }
                i14 = i20;
                eVar3 = eVar5;
            } else {
                interfaceC3540lR.C();
                if ((i11 & 2) != 0) {
                    i20 &= -113;
                }
                eVar3 = eVar2;
                abstractC6325h3 = abstractC6325h2;
                i13 = 0;
                i14 = i20;
            }
            interfaceC3540lR.S();
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-167283170, i14, -1, "com.ui.wifiman.ui.speedtest.result.SpeedtestResultDetailContentUi (SpeedtestResultDetailContentUi.kt:48)");
            }
            androidx.compose.ui.e eVarD = androidx.compose.foundation.m.d(r.h(eVar3, 0.0f, 1, null), androidx.compose.foundation.m.a(i13, interfaceC3540lR, i13, 1), false, null, false, 14, null);
            C8680c c8680c2 = C8680c.f66832a;
            C8680c.m mVarG = c8680c2.g();
            c.a aVar2 = f0.c.f46573a;
            C cA = AbstractC8685h.a(mVarG, aVar2.k(), interfaceC3540lR, i13);
            int iA = AbstractC3536j.a(interfaceC3540lR, i13);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarD);
            InterfaceC2629g.a aVar3 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar3.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, cA, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar3.f());
            C8688k c8688k = C8688k.f66923a;
            C6324g c6324g = (C6324g) o1.b(abstractC6325h3.p0(), null, interfaceC3540lR, i13, 1).getValue();
            interfaceC3540lR.U(-978293090);
            if (c6324g == null) {
                c8680c = c8680c2;
                i15 = i14;
                abstractC6325h4 = abstractC6325h3;
                eVar4 = eVar3;
                interfaceC3540l2 = interfaceC3540lR;
            } else {
                c8680c = c8680c2;
                i15 = i14;
                abstractC6325h4 = abstractC6325h3;
                eVar4 = eVar3;
                interfaceC3540l2 = interfaceC3540lR;
                B9.h.i(androidx.compose.foundation.layout.o.k(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), C6562a.f52458a.d(interfaceC3540lR, C6562a.f52459b).a().a().c(), 0.0f, 2, null), null, null, null, null, null, null, null, b0.c.e(1922624864, true, new a(eVar3, c6324g, abstractC6325h3), interfaceC3540lR, 54), interfaceC3540lR, 100663296, 254);
                J j10 = J.f24997a;
            }
            interfaceC3540l2.J();
            interfaceC3540lR = interfaceC3540l2;
            C6322e c6322e = (C6322e) o1.b(abstractC6325h4.o0(), null, interfaceC3540lR, 0, 1).getValue();
            e.a aVar4 = androidx.compose.ui.e.f28771b0;
            AbstractC7385d.d(c8688k, c6322e != null, r.h(aVar4, 0.0f, 1, null), null, null, null, C6318a.f50811a.a(), interfaceC3540lR, 1573254, 28);
            androidx.compose.ui.e eVarH = r.h(aVar4, 0.0f, 1, null);
            boolean z10 = c6322e != null;
            AbstractC6325h abstractC6325h6 = abstractC6325h4;
            abstractC6325h5 = abstractC6325h6;
            AbstractC7385d.d(c8688k, z10, eVarH, null, null, null, b0.c.e(-365325149, true, new b(c6322e, abstractC6325h6), interfaceC3540lR, 54), interfaceC3540lR, 1573254, 28);
            C6320c c6320c = (C6320c) o1.b(abstractC6325h5.n0(), null, interfaceC3540lR, 0, 1).getValue();
            interfaceC3540lR.U(-978148199);
            if (c6320c == null) {
                i16 = 1;
            } else {
                v0.b(null, interfaceC3540lR, 0, 1);
                androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(r.h(aVar4, 0.0f, 1, null), Y0.h.j(16), Y0.h.j(8));
                C cA2 = AbstractC8685h.a(c8680c.n(Y0.h.j(4)), aVar2.k(), interfaceC3540lR, 6);
                int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
                InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
                androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarJ);
                InterfaceC6824a interfaceC6824aA2 = aVar3.a();
                if (interfaceC3540lR.x() == null) {
                    AbstractC3536j.c();
                }
                interfaceC3540lR.u();
                if (interfaceC3540lR.o()) {
                    interfaceC3540lR.D(interfaceC6824aA2);
                } else {
                    interfaceC3540lR.I();
                }
                InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540lR);
                E1.c(interfaceC3540lA2, cA2, aVar3.e());
                E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar3.g());
                InterfaceC6839p interfaceC6839pB2 = aVar3.b();
                if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                    interfaceC3540lA2.K(Integer.valueOf(iA2));
                    interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
                }
                E1.c(interfaceC3540lA2, eVarE2, aVar3.f());
                interfaceC3540lR.U(203918456);
                if (c6320c.a()) {
                    androidx.compose.ui.e eVarH2 = r.h(aVar4, 0.0f, 1, null);
                    String strA = H0.f.a(AbstractC6780c.f53468d, interfaceC3540lR, 0);
                    interfaceC3540lR.U(203925452);
                    boolean z11 = (((i15 & 112) ^ 48) > 32 && interfaceC3540lR.T(abstractC6325h5)) || (i15 & 48) == 32;
                    Object objF2 = interfaceC3540lR.f();
                    if (z11 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new c(abstractC6325h5);
                        interfaceC3540lR.K(objF2);
                    }
                    interfaceC3540lR.J();
                    aVar = aVar4;
                    i16 = 1;
                    w9.r.b(eVarH2, (InterfaceC6824a) ((th.g) objF2), false, false, null, null, strA, null, interfaceC3540lR, 6, 188);
                } else {
                    aVar = aVar4;
                    i16 = 1;
                }
                interfaceC3540lR.J();
                interfaceC3540lR.U(203928142);
                e.a aVar5 = aVar;
                if (c6320c.c()) {
                    androidx.compose.ui.e eVarH3 = r.h(aVar5, 0.0f, i16, null);
                    String strA2 = H0.f.a(AbstractC6780c.f53556p3, interfaceC3540lR, 0);
                    interfaceC3540lR.U(203935789);
                    i17 = 32;
                    int i21 = ((((i15 & 112) ^ 48) <= 32 || !interfaceC3540lR.T(abstractC6325h5)) && (i15 & 48) != 32) ? 0 : i16;
                    Object objF3 = interfaceC3540lR.f();
                    if (i21 != 0 || objF3 == InterfaceC3540l.f21100a.a()) {
                        objF3 = new d(abstractC6325h5);
                        interfaceC3540lR.K(objF3);
                    }
                    interfaceC3540lR.J();
                    w9.o.c(eVarH3, (InterfaceC6824a) ((th.g) objF3), false, false, null, strA2, interfaceC3540lR, 6, 28);
                } else {
                    i17 = 32;
                }
                interfaceC3540lR.J();
                interfaceC3540lR.U(203938527);
                if (c6320c.b()) {
                    androidx.compose.ui.e eVarH4 = r.h(aVar5, 0.0f, i16, null);
                    String strA3 = H0.f.a(AbstractC6780c.f53549o3, interfaceC3540lR, 0);
                    interfaceC3540lR.U(203946453);
                    int i22 = ((((i15 & 112) ^ 48) <= i17 || !interfaceC3540lR.T(abstractC6325h5)) && (i15 & 48) != i17) ? 0 : i16;
                    Object objF4 = interfaceC3540lR.f();
                    if (i22 != 0 || objF4 == InterfaceC3540l.f21100a.a()) {
                        objF4 = new e(abstractC6325h5);
                        interfaceC3540lR.K(objF4);
                    }
                    interfaceC3540lR.J();
                    w9.o.c(eVarH4, (InterfaceC6824a) ((th.g) objF4), false, false, null, strA3, interfaceC3540lR, 6, 28);
                }
                interfaceC3540lR.J();
                interfaceC3540lR.R();
                J j11 = J.f24997a;
            }
            interfaceC3540lR.J();
            v0.b(null, interfaceC3540lR, 0, i16);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar4;
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: jf.i
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return l.f(eVar2, abstractC6325h5, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(androidx.compose.ui.e eVar, AbstractC6325h abstractC6325h, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) throws Resources.NotFoundException {
        e(eVar, abstractC6325h, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
