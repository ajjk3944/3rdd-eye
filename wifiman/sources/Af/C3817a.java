package af;

import E0.InterfaceC2629g;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.z1;
import Zg.AbstractC3689v;
import af.C3806O;
import af.C3817a;
import androidx.compose.ui.e;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import ma.AbstractC6784a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import okhttp3.internal.Util;
import q.AbstractC7385d;
import q.AbstractC7402u;
import q.InterfaceC7386e;
import s9.d;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.C8680c;

/* renamed from: af.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3817a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3817a f26060a = new C3817a();

    /* renamed from: b, reason: collision with root package name */
    public static mh.r f26061b = b0.c.c(1061450567, false, C1007a.f26063a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6839p f26062c = b0.c.c(1796847713, false, b.f26066a);

    /* renamed from: af.a$a, reason: collision with other inner class name */
    static final class C1007a implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        public static final C1007a f26063a = new C1007a();

        /* renamed from: af.a$a$a, reason: collision with other inner class name */
        static final class C1008a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3808Q f26064a;

            C1008a(C3808Q c3808q) {
                this.f26064a = c3808q;
            }

            public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                long jD;
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1096899189, i10, -1, "com.ui.wifiman.ui.speed.component.ComposableSingletons$SpeedTabSpeedFactorCardUiKt.lambda-1.<anonymous>.<anonymous>.<anonymous> (SpeedTabSpeedFactorCardUi.kt:301)");
                }
                if (this.f26064a.d() && this.f26064a.c()) {
                    interfaceC3540l.U(913507516);
                    jD = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().i();
                    interfaceC3540l.J();
                } else {
                    interfaceC3540l.U(913509782);
                    jD = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().d().d();
                    interfaceC3540l.J();
                }
                Be.E.b(androidx.compose.foundation.layout.o.m(androidx.compose.ui.e.f28771b0, 0.0f, 0.0f, Y0.h.j(8), 0.0f, 11, null), ((C6733v0) AbstractC7402u.a(jD, null, "statusDotColor", null, interfaceC3540l, 384, 10).getValue()).u(), interfaceC3540l, 6, 0);
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

        /* renamed from: af.a$a$b */
        static final class b implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z1 f26065a;

            b(z1 z1Var) {
                this.f26065a = z1Var;
            }

            public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1129546612, i10, -1, "com.ui.wifiman.ui.speed.component.ComposableSingletons$SpeedTabSpeedFactorCardUiKt.lambda-1.<anonymous>.<anonymous>.<anonymous> (SpeedTabSpeedFactorCardUi.kt:335)");
                }
                AbstractC8049c.c(N9.b.f16117a.v(), androidx.compose.foundation.layout.r.v(androidx.compose.foundation.layout.o.m(androidx.compose.ui.e.f28771b0, Y0.h.j(4), 0.0f, 0.0f, 0.0f, 14, null), Y0.h.j(12)), (C6733v0) this.f26065a.getValue(), null, interfaceC3540l, 48, 4);
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

        C1007a() {
        }

        public final void a(z.Y UiSelectorHorizontalBase, C3808Q item, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(UiSelectorHorizontalBase, "$this$UiSelectorHorizontalBase");
            AbstractC6492s.i(item, "item");
            if ((i10 & 48) == 0) {
                i11 = i10 | (interfaceC3540l.T(item) ? 32 : 16);
            } else {
                i11 = i10;
            }
            if ((i11 & 145) == 144 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1061450567, i11, -1, "com.ui.wifiman.ui.speed.component.ComposableSingletons$SpeedTabSpeedFactorCardUiKt.lambda-1.<anonymous> (SpeedTabSpeedFactorCardUi.kt:296)");
            }
            C8680c.f fVarB = C8680c.f66832a.b();
            c.InterfaceC1752c interfaceC1752cI = f0.c.f46573a.i();
            e.a aVar = androidx.compose.ui.e.f28771b0;
            C0.C cB = z.W.b(fVarB, interfaceC1752cI, interfaceC3540l, 54);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, aVar);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
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
            E1.c(interfaceC3540lA, cB, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            z.Z z10 = z.Z.f66823a;
            AbstractC7385d.e(z10, item.d(), null, null, null, null, b0.c.e(-1096899189, true, new C1008a(item), interfaceC3540l, 54), interfaceC3540l, 1572870, 30);
            interfaceC3540l.U(307520705);
            long jA = item.e() ? AbstractC6784a.b.f53648a.f().a() : C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).f().c();
            interfaceC3540l.J();
            z1 z1VarA = AbstractC7402u.a(jA, null, "textColor", null, interfaceC3540l, 384, 10);
            String strB = AbstractC7930a.b(Ne.h.c(item.a()), interfaceC3540l, 0);
            int iA2 = W0.j.f23523b.a();
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            a1.b(strB, null, ((C6733v0) z1VarA.getValue()).u(), 0L, null, null, null, 0L, null, W0.j.h(iA2), 0L, W0.t.f23567a.a(), false, 1, 0, null, c6562a.c(interfaceC3540l, i12).b().f(), interfaceC3540l, 0, 3120, 54778);
            interfaceC3540l.U(307539560);
            long jA2 = item.e() ? AbstractC6784a.b.f53648a.f().a() : c6562a.a(interfaceC3540l, i12).a().h().h();
            interfaceC3540l.J();
            AbstractC7385d.e(z10, item.b(), null, null, null, null, b0.c.e(1129546612, true, new b(AbstractC7402u.a(jA2, null, "textColor", null, interfaceC3540l, 384, 10)), interfaceC3540l, 54), interfaceC3540l, 1572870, 30);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a((z.Y) obj, (C3808Q) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: af.a$b */
    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f26066a = new b();

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J e(S8.c it) {
            AbstractC6492s.i(it, "it");
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J f(String it) {
            AbstractC6492s.i(it, "it");
            return Yg.J.f24997a;
        }

        public final void c(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1796847713, i10, -1, "com.ui.wifiman.ui.speed.component.ComposableSingletons$SpeedTabSpeedFactorCardUiKt.lambda-2.<anonymous> (SpeedTabSpeedFactorCardUi.kt:379)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            d.c cVar = new d.c("WiFi Speed Factors");
            Af.w wVar = Af.w.f742a;
            W7.e eVar = W7.e.EXCELLENT;
            Ci.f fVarB = Ci.a.b(new C3808Q(S8.c.GHZ_2_4, false, false, false, false), new C3808Q(S8.c.GHZ_5, true, true, false, false), new C3808Q(S8.c.GHZ_6, false, true, false, true));
            d.c cVar2 = new d.c("Band");
            C3806O.b.a aVar2 = C3806O.b.a.CHANNEL;
            C3806O.b bVar = new C3806O.b(aVar2, new d.c("32"), null);
            C3806O.b.a aVar3 = C3806O.b.a.CHANNEL_WIDTH;
            d.c cVar3 = new d.c("80 MHz");
            W7.e eVar2 = W7.e.POOR;
            C3807P c3807p = new C3807P(cVar, wVar, eVar, fVarB, new C3806O("", cVar2, Util.V(AbstractC3689v.o(bVar, new C3806O.b(aVar3, cVar3, eVar2))), C3806O.a.C1006a.f26020a, false, 16, null), new C3806O("", new d.c("Radio Potential"), Util.V(AbstractC3689v.o(new C3806O.b(aVar2, new d.c("32"), null), new C3806O.b(aVar3, new d.c("80 MHz"), eVar2))), new C3806O.a.b(1), false, 16, null), new C3806O("", new d.c("Channel Health"), Util.V(AbstractC3689v.o(new C3806O.b(aVar2, new d.c("32"), null), new C3806O.b(aVar3, new d.c("80 MHz"), eVar2))), new C3806O.a.b(2), false, 16, null));
            interfaceC3540l.U(-695773543);
            Object objF = interfaceC3540l.f();
            InterfaceC3540l.a aVar4 = InterfaceC3540l.f21100a;
            if (objF == aVar4.a()) {
                objF = new InterfaceC6835l() { // from class: af.b
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return C3817a.b.e((S8.c) obj);
                    }
                };
                interfaceC3540l.K(objF);
            }
            InterfaceC6835l interfaceC6835l = (InterfaceC6835l) objF;
            interfaceC3540l.J();
            interfaceC3540l.U(-695772647);
            Object objF2 = interfaceC3540l.f();
            if (objF2 == aVar4.a()) {
                objF2 = new InterfaceC6835l() { // from class: af.c
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return C3817a.b.f((String) obj);
                    }
                };
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            d0.w(aVar, c3807p, interfaceC6835l, (InterfaceC6835l) objF2, null, interfaceC3540l, 3462, 16);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            c((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public final mh.r a() {
        return f26061b;
    }
}
