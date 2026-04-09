package nf;

import C0.C;
import E0.InterfaceC2629g;
import L0.C3174d;
import L0.U;
import Li.P;
import Li.z;
import N.a1;
import Q0.A;
import Q0.AbstractC3434k;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.InterfaceC3563x;
import T.L0;
import T.O;
import T.X0;
import T.o1;
import T.t1;
import Y0.w;
import Yg.J;
import Zg.AbstractC3689v;
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
import com.ui.wifiman.ui.component.network.AbstractC5210h;
import com.ui.wifiman.ui.component.network.AbstractC5217o;
import com.ui.wifiman.ui.component.network.C5211i;
import com.ui.wifiman.ui.component.network.C5212j;
import com.ui.wifiman.ui.component.network.C5213k;
import d.AbstractC5265c;
import f0.c;
import ff.AbstractC5822c;
import ff.EnumC5820a;
import hf.AbstractC6027J;
import hf.AbstractC6038j;
import hf.C6036h;
import hf.t;
import j0.AbstractC6230a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import nf.p;
import org.kodein.di.DI;
import pa.C7273a;
import q.AbstractC7391j;
import r.AbstractC7535j;
import s.InterfaceC7836I;
import s9.d;
import sa.AbstractC7930a;
import x9.AbstractC8438h;
import xe.InterfaceC8511f;
import y.AbstractC8557l;
import y.InterfaceC8558m;
import ye.AbstractC8664j;
import ye.C8663i;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.W;
import z.Z;
import z.a0;

/* loaded from: classes4.dex */
public abstract class p {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f54677a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8511f.b f54678b;

        /* renamed from: nf.p$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1991a extends C6490p implements InterfaceC6824a {
            C1991a(Object obj) {
                super(0, obj, h.class, "onMeteredNetworkConfirmed", "onMeteredNetworkConfirmed()V", 0);
            }

            public final void a() {
                ((h) this.receiver).u0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        a(h hVar, InterfaceC8511f.b bVar) {
            this.f54677a = hVar;
            this.f54678b = bVar;
        }

        private static final boolean e(InterfaceC3551q0 interfaceC3551q0) {
            return ((Boolean) interfaceC3551q0.getValue()).booleanValue();
        }

        private static final void f(InterfaceC3551q0 interfaceC3551q0, boolean z10) {
            interfaceC3551q0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J h(h hVar, InterfaceC3551q0 interfaceC3551q0) {
            f(interfaceC3551q0, !e(interfaceC3551q0));
            hVar.v0(e(interfaceC3551q0));
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J i(InterfaceC8511f.b bVar) {
            bVar.a();
            return J.f24997a;
        }

        public final void c(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            Object obj;
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-818616434, i10, -1, "com.ui.wifiman.ui.speedtest.test.MeteredNetworkWarning.<anonymous> (SpeedtestProcessUi.kt:162)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = r.h(aVar, 0.0f, 1, null);
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(eVarH, 0.0f, c6562a.d(interfaceC3540l, i11).a().b().c(), 1, null);
            C8680c c8680c = C8680c.f66832a;
            float f10 = 4;
            C8680c.f fVarN = c8680c.n(Y0.h.j(f10));
            c.a aVar2 = f0.c.f46573a;
            c.b bVarG = aVar2.g();
            final h hVar = this.f54677a;
            final InterfaceC8511f.b bVar = this.f54678b;
            C cA = AbstractC8685h.a(fVarN, bVarG, interfaceC3540l, 54);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarK);
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
            a1.c(AbstractC7930a.a(new d.b(AbstractC6780c.f53493g3), interfaceC3540l, 0), androidx.compose.foundation.layout.o.j(aVar, c6562a.d(interfaceC3540l, i11).a().a().d(), Y0.h.j(f10)), c6562a.a(interfaceC3540l, i11).f().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 0, 0, 131064);
            interfaceC3540l.U(-1151746541);
            Object objF = interfaceC3540l.f();
            InterfaceC3540l.a aVar4 = InterfaceC3540l.f21100a;
            if (objF == aVar4.a()) {
                obj = null;
                objF = t1.d(Boolean.FALSE, null, 2, null);
                interfaceC3540l.K(objF);
            } else {
                obj = null;
            }
            final InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
            interfaceC3540l.J();
            androidx.compose.ui.e eVarL = androidx.compose.foundation.layout.o.l(r.h(aVar, 0.0f, 1, obj), c6562a.d(interfaceC3540l, i11).a().a().d(), Y0.h.j(f10), c6562a.d(interfaceC3540l, i11).a().a().d(), Y0.h.j(f10));
            InterfaceC7836I interfaceC7836IC = Q.o.c(false, 0.0f, 0L, 7, null);
            interfaceC3540l.U(-1151730632);
            Object objF2 = interfaceC3540l.f();
            if (objF2 == aVar4.a()) {
                objF2 = AbstractC8557l.a();
                interfaceC3540l.K(objF2);
            }
            InterfaceC8558m interfaceC8558m = (InterfaceC8558m) objF2;
            interfaceC3540l.J();
            interfaceC3540l.U(-1151728120);
            boolean zT = interfaceC3540l.T(hVar);
            Object objF3 = interfaceC3540l.f();
            if (zT || objF3 == aVar4.a()) {
                objF3 = new InterfaceC6824a() { // from class: nf.n
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return p.a.h(hVar, interfaceC3551q0);
                    }
                };
                interfaceC3540l.K(objF3);
            }
            interfaceC3540l.J();
            androidx.compose.ui.e eVarB = androidx.compose.foundation.d.b(eVarL, interfaceC8558m, interfaceC7836IC, false, null, null, (InterfaceC6824a) objF3, 28, null);
            C cB = W.b(c8680c.n(Y0.h.j(8)), aVar2.i(), interfaceC3540l, 54);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarB);
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
            AbstractC8438h.m(null, e(interfaceC3551q0), null, false, null, interfaceC3540l, 384, 25);
            a1.c(AbstractC7930a.a(new d.b(AbstractC6780c.f53486f3), interfaceC3540l, 0), aVar, c6562a.a(interfaceC3540l, i11).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 48, 0, 131064);
            interfaceC3540l.R();
            a0.a(r.i(aVar, Y0.h.j(f10)), interfaceC3540l, 6);
            androidx.compose.ui.e eVarK2 = androidx.compose.foundation.layout.o.k(r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540l, i11).a().a().c(), 0.0f, 2, null);
            String strA = H0.f.a(AbstractC6780c.f53479e3, interfaceC3540l, 0);
            interfaceC3540l.U(-1151692658);
            boolean zT2 = interfaceC3540l.T(hVar);
            Object objF4 = interfaceC3540l.f();
            if (zT2 || objF4 == aVar4.a()) {
                objF4 = new C1991a(hVar);
                interfaceC3540l.K(objF4);
            }
            interfaceC3540l.J();
            w9.r.b(eVarK2, (InterfaceC6824a) ((th.g) objF4), false, false, null, null, strA, null, interfaceC3540l, 0, 188);
            androidx.compose.ui.e eVarK3 = androidx.compose.foundation.layout.o.k(r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540l, i11).a().a().c(), 0.0f, 2, null);
            String strA2 = H0.f.a(AbstractC6780c.f53447a, interfaceC3540l, 0);
            interfaceC3540l.U(-1151682735);
            boolean zT3 = interfaceC3540l.T(bVar);
            Object objF5 = interfaceC3540l.f();
            if (zT3 || objF5 == aVar4.a()) {
                objF5 = new InterfaceC6824a() { // from class: nf.o
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return p.a.i(bVar);
                    }
                };
                interfaceC3540l.K(objF5);
            }
            interfaceC3540l.J();
            w9.o.c(eVarK3, (InterfaceC6824a) objF5, false, false, null, strA2, interfaceC3540l, 0, 28);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
            c((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ nf.c f54679a;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f54680a;

            static {
                int[] iArr = new int[nf.g.values().length];
                try {
                    iArr[nf.g.LATENCY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[nf.g.DOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[nf.g.UP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f54680a = iArr;
            }
        }

        b(nf.c cVar) {
            this.f54679a = cVar;
        }

        public final void a(boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            d.b bVar;
            long jC;
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.c(z10) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1147414567, i11, -1, "com.ui.wifiman.ui.speedtest.test.SpeedtestProcessContainer.<anonymous>.<anonymous> (SpeedtestProcessUi.kt:290)");
            }
            nf.g gVarC = this.f54679a.c();
            androidx.compose.ui.e eVarA = AbstractC6230a.a(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), z10 ? 1.0f : 0.0f);
            C8680c.f fVarN = C8680c.f66832a.n(Y0.h.j(16));
            c.b bVarG = f0.c.f46573a.g();
            nf.c cVar = this.f54679a;
            C cA = AbstractC8685h.a(fVarN, bVarG, interfaceC3540l, 54);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarA);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
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
            E1.c(interfaceC3540lA, cA, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            C8688k c8688k = C8688k.f66923a;
            int[] iArr = a.f54680a;
            int i12 = iArr[gVarC.ordinal()];
            if (i12 == 1) {
                bVar = new d.b(AbstractC6780c.f53528l3);
            } else if (i12 == 2) {
                bVar = new d.b(AbstractC6780c.f53514j3);
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new d.b(AbstractC6780c.f53535m3);
            }
            C3174d c3174dA = AbstractC7930a.a(bVar, interfaceC3540l, 0);
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            U uC = c6562a.c(interfaceC3540l, i13).a().c();
            int i14 = iArr[gVarC.ordinal()];
            if (i14 == 1) {
                interfaceC3540l.U(1947273223);
                jC = c6562a.a(interfaceC3540l, i13).f().c();
                interfaceC3540l.J();
            } else if (i14 == 2) {
                interfaceC3540l.U(1947275852);
                jC = AbstractC5822c.a(EnumC5820a.DOWN, interfaceC3540l, 6);
                interfaceC3540l.J();
            } else {
                if (i14 != 3) {
                    interfaceC3540l.U(1947270594);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(1947278508);
                jC = AbstractC5822c.a(EnumC5820a.UP, interfaceC3540l, 6);
                interfaceC3540l.J();
            }
            a1.c(c3174dA, null, jC, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, uC, interfaceC3540l, 0, 0, 131066);
            a1.c(AbstractC7930a.a(cVar.e(), interfaceC3540l, 0), null, c6562a.a(interfaceC3540l, i13).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, p.t(interfaceC3540l, 0), interfaceC3540l, 0, 0, 131066);
            a1.c(AbstractC7930a.a(cVar.d(), interfaceC3540l, 0), null, c6562a.a(interfaceC3540l, i13).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l, i13).a().c(), interfaceC3540l, 0, 0, 131066);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a(((Boolean) obj).booleanValue(), (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class c implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ nf.b f54681a;

        c(nf.b bVar) {
            this.f54681a = bVar;
        }

        public final void a(boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.c(z10) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(14053409, i10, -1, "com.ui.wifiman.ui.speedtest.test.SpeedtestProcessContainer.<anonymous>.<anonymous>.<anonymous> (SpeedtestProcessUi.kt:351)");
            }
            if (z10) {
                interfaceC3540l.U(237362668);
                AbstractC6038j.b(r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), new C6036h[]{this.f54681a.a()}, interfaceC3540l, 6);
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(237541228);
                a0.a(r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), interfaceC3540l, 6);
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a(((Boolean) obj).booleanValue(), (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class d implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f54682a;

        d(h hVar) {
            this.f54682a = hVar;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2126560713, i10, -1, "com.ui.wifiman.ui.speedtest.test.SpeedtestProcessTest.<anonymous> (SpeedtestProcessUi.kt:98)");
            }
            Fe.j.c(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), (s9.d) o1.b(this.f54682a.getTitle(), null, interfaceC3540l, 0, 1).getValue(), null, null, null, 0L, interfaceC3540l, 6, 60);
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

    static final class e implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f54683a;

        static final class a implements mh.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f54684a;

            a(h hVar) {
                this.f54684a = hVar;
            }

            public final void a(float f10, float f11, InterfaceC3540l interfaceC3540l, int i10) {
                int i11;
                J j10;
                if ((i10 & 6) == 0) {
                    i11 = i10 | (interfaceC3540l.g(f10) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 131) == 130 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1261819652, i11, -1, "com.ui.wifiman.ui.speedtest.test.SpeedtestProcessTest.<anonymous>.<anonymous> (SpeedtestProcessUi.kt:120)");
                }
                t.a aVar = (t.a) o1.b(this.f54684a.t0(), null, interfaceC3540l, 0, 1).getValue();
                interfaceC3540l.U(-338333473);
                if (aVar == null) {
                    j10 = null;
                } else {
                    androidx.compose.ui.e eVarH = r.h(r.k(androidx.compose.ui.e.f28771b0, Y0.h.j(72), 0.0f, 2, null), 0.0f, 1, null);
                    C6562a c6562a = C6562a.f52458a;
                    int i12 = C6562a.f52459b;
                    float f12 = 32;
                    AbstractC6027J.E(androidx.compose.foundation.layout.o.m(eVarH, c6562a.d(interfaceC3540l, i12).a().a().a(Y0.h.j(f12)), c6562a.d(interfaceC3540l, i12).a().b().a(Y0.h.j(24)), c6562a.d(interfaceC3540l, i12).a().a().a(Y0.h.j(f12)), 0.0f, 8, null), aVar, interfaceC3540l, 0);
                    j10 = J.f24997a;
                }
                interfaceC3540l.J();
                if (j10 == null) {
                    a0.a(r.i(r.k(androidx.compose.ui.e.f28771b0, Y0.h.j(72), 0.0f, 2, null), f10), interfaceC3540l, 0);
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.r
            public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                a(((Y0.h) obj).s(), ((Y0.h) obj2).s(), (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                return J.f24997a;
            }
        }

        e(h hVar) {
            this.f54683a = hVar;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1482073254, i10, -1, "com.ui.wifiman.ui.speedtest.test.SpeedtestProcessTest.<anonymous> (SpeedtestProcessUi.kt:111)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            qa.d.d(r.h(aVar, 0.0f, 1, null), C6939a.f54629a.a(), b0.c.e(-1261819652, true, new a(this.f54683a), interfaceC3540l, 54), interfaceC3540l, 438);
            p.j(r.h(aVar, 0.0f, 1, null), this.f54683a, interfaceC3540l, 6);
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

    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54685a;

        static {
            int[] iArr = new int[nf.d.values().length];
            try {
                iArr[nf.d.NOTHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[nf.d.TEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[nf.d.METERED_NETWORK_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f54685a = iArr;
        }
    }

    public static final class g extends h {

        /* renamed from: i, reason: collision with root package name */
        private final z f54688i;

        /* renamed from: j, reason: collision with root package name */
        private final z f54689j;

        /* renamed from: l, reason: collision with root package name */
        private final z f54691l;

        /* renamed from: m, reason: collision with root package name */
        private final z f54692m;

        /* renamed from: g, reason: collision with root package name */
        private final z f54686g = P.a(nf.d.TEST);

        /* renamed from: h, reason: collision with root package name */
        private final z f54687h = P.a(new d.b(AbstractC6780c.f53507i3));

        /* renamed from: k, reason: collision with root package name */
        private final z f54690k = P.a(new C5213k(new C5211i(N9.b.f16117a.B()), AbstractC3689v.e(new C5212j(new C5211i(Pe.a.f18599a.V()), AbstractC5210h.b.C1557b.f44497a))));

        g(t.a aVar, nf.g gVar, s9.d dVar, s9.d dVar2, nf.b bVar, nf.f fVar) {
            this.f54688i = P.a(aVar);
            this.f54689j = P.a(new nf.c(true, gVar, dVar, dVar2));
            this.f54691l = P.a(bVar);
            this.f54692m = P.a(fVar);
        }

        @Override // nf.h
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public z s0() {
            return this.f54689j;
        }

        @Override // nf.h
        /* renamed from: B0, reason: merged with bridge method [inline-methods] */
        public z getTitle() {
            return this.f54687h;
        }

        @Override // nf.h
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public z t0() {
            return this.f54688i;
        }

        @Override // org.kodein.di.c
        public DI d() {
            throw new IllegalStateException();
        }

        @Override // nf.h
        public void u0() {
        }

        @Override // nf.h
        public void v0(boolean z10) {
        }

        @Override // nf.h
        /* renamed from: w0, reason: merged with bridge method [inline-methods] */
        public z n0() {
            return this.f54691l;
        }

        @Override // nf.h
        /* renamed from: x0, reason: merged with bridge method [inline-methods] */
        public z o0() {
            return this.f54690k;
        }

        @Override // nf.h
        /* renamed from: y0, reason: merged with bridge method [inline-methods] */
        public z p0() {
            return this.f54686g;
        }

        @Override // nf.h
        /* renamed from: z0, reason: merged with bridge method [inline-methods] */
        public z r0() {
            return this.f54692m;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void f(final androidx.compose.ui.e r11, final nf.h r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.p.f(androidx.compose.ui.e, nf.h, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(androidx.compose.ui.e eVar, h hVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        f(eVar, hVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final androidx.compose.ui.e eVar, final nf.f fVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540l3;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1951910304);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(fVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l3 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1951910304, i11, -1, "com.ui.wifiman.ui.speedtest.test.ServerInfo (SpeedtestProcessUi.kt:241)");
            }
            C cA = AbstractC8685h.a(C8680c.f66832a.n(Y0.h.j(8)), f0.c.f46573a.g(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
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
            E1.c(interfaceC3540lA, cA, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            C8688k c8688k = C8688k.f66923a;
            s9.d dVarB = fVar.b();
            interfaceC3540lR.U(-555524552);
            if (dVarB == null) {
                i12 = 0;
                interfaceC3540l2 = interfaceC3540lR;
            } else {
                C3174d c3174dA = AbstractC7930a.a(dVarB, interfaceC3540lR, 0);
                C6562a c6562a = C6562a.f52458a;
                int i13 = C6562a.f52459b;
                U uA = c6562a.c(interfaceC3540lR, i13).b().a();
                long jA = c6562a.a(interfaceC3540lR, i13).f().a();
                int iA2 = W0.j.f23523b.a();
                int iB = W0.t.f23567a.b();
                W0.j jVarH = W0.j.h(iA2);
                i12 = 0;
                interfaceC3540l2 = interfaceC3540lR;
                a1.c(c3174dA, null, jA, 0L, null, null, null, 0L, null, jVarH, 0L, iB, false, 1, 0, null, null, uA, interfaceC3540l2, 0, 3120, 120314);
            }
            interfaceC3540l2.J();
            s9.d dVarA = fVar.a();
            InterfaceC3540l interfaceC3540l4 = interfaceC3540l2;
            interfaceC3540l4.U(-555513320);
            if (dVarA == null) {
                interfaceC3540l3 = interfaceC3540l4;
            } else {
                C3174d c3174dA2 = AbstractC7930a.a(dVarA, interfaceC3540l4, i12);
                C6562a c6562a2 = C6562a.f52458a;
                int i14 = C6562a.f52459b;
                interfaceC3540l3 = interfaceC3540l4;
                a1.c(c3174dA2, null, c6562a2.a(interfaceC3540l4, i14).f().a(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.a()), 0L, W0.t.f23567a.b(), false, 2, 0, null, null, c6562a2.c(interfaceC3540l4, i14).b().a(), interfaceC3540l3, 0, 3120, 120314);
            }
            interfaceC3540l3.J();
            interfaceC3540l3.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l3.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: nf.l
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return p.i(eVar, fVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i(androidx.compose.ui.e eVar, nf.f fVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        h(eVar, fVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final androidx.compose.ui.e eVar, final h hVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-546958788);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(hVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-546958788, i11, -1, "com.ui.wifiman.ui.speedtest.test.SpeedtestProcessContainer (SpeedtestProcessUi.kt:275)");
            }
            C8680c.f fVarN = C8680c.f66832a.n(Y0.h.j(16));
            c.a aVar = f0.c.f46573a;
            C cA = AbstractC8685h.a(fVarN, aVar.g(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
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
            a0.a(r.i(aVar3, Y0.h.j(40)), interfaceC3540lR, 6);
            nf.c cVar = (nf.c) o1.b(hVar.s0(), null, interfaceC3540lR, 0, 1).getValue();
            AbstractC7391j.a(Boolean.valueOf(cVar.f()), null, AbstractC7535j.l(1000, 0, null, 6, null), "visible", b0.c.e(1147414567, true, new b(cVar), interfaceC3540lR, 54), interfaceC3540lR, 28032, 2);
            C5213k c5213k = (C5213k) o1.b(hVar.o0(), null, interfaceC3540lR, 0, 1).getValue();
            interfaceC3540lR.U(1535723482);
            if (c5213k != null) {
                AbstractC5217o.h(null, Y0.h.j(42), Y0.h.j(6), c5213k, interfaceC3540lR, 432, 1);
            }
            interfaceC3540lR.J();
            nf.b bVar = (nf.b) o1.b(hVar.n0(), null, interfaceC3540lR, 0, 1).getValue();
            androidx.compose.ui.e eVarI = r.i(r.h(aVar3, 0.0f, 1, null), Y0.h.j(300));
            C cH = androidx.compose.foundation.layout.d.h(aVar.b(), false);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarI);
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
            E1.c(interfaceC3540lA2, cH, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            AbstractC7391j.a(Boolean.valueOf(bVar.b()), r.f(aVar3, 0.0f, 1, null), AbstractC7535j.l(1000, 0, null, 6, null), "chart visible", b0.c.e(14053409, true, new c(bVar), interfaceC3540lR, 54), interfaceC3540lR, 28080, 0);
            androidx.compose.animation.a.a((nf.f) o1.b(hVar.r0(), null, interfaceC3540lR, 0, 1).getValue(), r.h(aVar3, 0.0f, 1, null), null, null, "server info", null, C6939a.f54629a.c(), interfaceC3540lR, 1597488, 44);
            interfaceC3540lR.R();
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: nf.m
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return p.k(eVar, hVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J k(androidx.compose.ui.e eVar, h hVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        j(eVar, hVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void l(final androidx.compose.ui.e r11, final nf.h r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.p.l(androidx.compose.ui.e, nf.h, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J m(androidx.compose.ui.e eVar, h hVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        l(eVar, hVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final void n(androidx.compose.ui.e eVar, h hVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        final h hVar2;
        boolean z10;
        ?? r22;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1480556607);
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
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                hVar2 = hVar;
                int i14 = interfaceC3540lR.T(hVar2) ? 32 : 16;
                i12 |= i14;
            } else {
                hVar2 = hVar;
            }
            i12 |= i14;
        } else {
            hVar2 = hVar;
        }
        int i15 = i12;
        if ((i15 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            interfaceC3540lR.q();
            if ((i10 & 1) == 0 || interfaceC3540lR.H()) {
                androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
                if ((i11 & 2) != 0) {
                    interfaceC3540lR.U(-1927673007);
                    S sA = C4195a.f33733a.a(interfaceC3540lR, C4195a.f33735c);
                    if (sA == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    z10 = false;
                    N nB = AbstractC4197c.b(h.class, sA, null, (P.c) interfaceC3540lR.t(AbstractC8664j.c()), null, interfaceC3540lR, 0, 16);
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
                    i15 &= -113;
                    hVar2 = (h) nB;
                } else {
                    z10 = false;
                }
                eVar2 = eVar3;
                r22 = z10;
            } else {
                interfaceC3540lR.C();
                if ((i11 & 2) != 0) {
                    i15 &= -113;
                }
                r22 = 0;
            }
            interfaceC3540lR.S();
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1480556607, i15, -1, "com.ui.wifiman.ui.speedtest.test.SpeedtestProcessUi (SpeedtestProcessUi.kt:69)");
            }
            C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), r22);
            int iA = AbstractC3536j.a(interfaceC3540lR, r22);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar2);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
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
            E1.c(interfaceC3540lA, cH, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            int i16 = f.f54685a[((nf.d) o1.b(hVar2.p0(), null, interfaceC3540lR, r22, 1).getValue()).ordinal()];
            if (i16 == 1) {
                interfaceC3540lR.U(548814397);
                a0.a(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), interfaceC3540lR, 6);
                interfaceC3540lR.J();
            } else if (i16 == 2) {
                interfaceC3540lR.U(-1229214868);
                l(androidx.compose.ui.e.f28771b0, hVar2, interfaceC3540lR, (i15 & 112) | 6, r22);
                interfaceC3540lR.J();
            } else {
                if (i16 != 3) {
                    interfaceC3540lR.U(-1229224239);
                    interfaceC3540lR.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540lR.U(-1229209555);
                f(androidx.compose.ui.e.f28771b0, hVar2, interfaceC3540lR, (i15 & 112) | 6, r22);
                interfaceC3540lR.J();
            }
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: nf.i
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return p.o(eVar2, hVar2, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J o(androidx.compose.ui.e eVar, h hVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        n(eVar, hVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    public static final h s(t.a aVar, nf.g gVar, s9.d dVar, s9.d dVar2, nf.b bVar, nf.f fVar, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        interfaceC3540l.U(-725957475);
        t.a aVar2 = (i11 & 1) != 0 ? null : aVar;
        nf.g gVar2 = (i11 & 2) != 0 ? nf.g.DOWN : gVar;
        s9.d cVar = (i11 & 4) != 0 ? new d.c("20.0") : dVar;
        s9.d cVar2 = (i11 & 8) != 0 ? new d.c("Mbps") : dVar2;
        nf.b bVar2 = (i11 & 16) != 0 ? new nf.b(true, AbstractC6038j.e(null, interfaceC3540l, 0, 1)) : bVar;
        nf.f fVar2 = (i11 & 32) != 0 ? new nf.f(null, null, 3, null) : fVar;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-725957475, i10, -1, "com.ui.wifiman.ui.speedtest.test.previewSpeedtestProcessVM (SpeedtestProcessUi.kt:405)");
        }
        g gVar3 = new g(aVar2, gVar2, cVar, cVar2, bVar2, fVar2);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return gVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U t(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-1864326629);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1864326629, i10, -1, "com.ui.wifiman.ui.speedtest.test.rememberSpeedTextStyle (SpeedtestProcessUi.kt:383)");
        }
        interfaceC3540l.U(1084158797);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            AbstractC3434k abstractC3434kA = C7273a.f57808a.a();
            A aE = A.f18971b.e();
            objF = new U(0L, w.g(64), aE, null, null, abstractC3434kA, null, w.g(0), null, null, null, 0L, null, null, null, 0, 0, w.g(70), null, null, null, 0, 0, null, 16645977, null);
            interfaceC3540l.K(objF);
        }
        U u10 = (U) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return u10;
    }
}
