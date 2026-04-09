package F9;

import E0.InterfaceC2629g;
import F.AbstractC2716f;
import F9.c0;
import H.k;
import N.AbstractC3343s;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.InterfaceC3563x;
import T.L0;
import androidx.compose.ui.e;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m0.AbstractC6713l0;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import z.C8680c;

/* loaded from: classes3.dex */
public abstract class c0 {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6200a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6201b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f6202c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f6203d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ H.l f6204e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f6205f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ci.e f6206g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ k0.e f6207h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.o f6208i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ H.b f6209j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ L0.U f6210k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ F.D f6211l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ H.d f6212m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ AbstractC6713l0 f6213n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f6214o;

        /* renamed from: F9.c0$a$a, reason: collision with other inner class name */
        static final class C0245a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f6215a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f6216b;

            C0245a(String str, int i10) {
                this.f6215a = str;
                this.f6216b = i10;
            }

            public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(626321815, i10, -1, "com.ui.core.ui.component.settings.UiSettingsTextField2.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiSettingsTextField2.kt:151)");
                }
                c.InterfaceC1752c interfaceC1752cI = f0.c.f46573a.i();
                C8680c.f fVarB = C8680c.f66832a.b();
                String str = this.f6215a;
                int i11 = this.f6216b;
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
                androidx.compose.ui.e eVarB = z.Y.b(z.Z.f66823a, aVar, 1.0f, false, 2, null);
                String str2 = str == null ? "" : str;
                C6562a c6562a = C6562a.f52458a;
                int i12 = C6562a.f52459b;
                a1.b(str2, eVarB, c6562a.a(interfaceC3540l, i12).f().d(), 0L, null, null, null, 0L, null, W0.j.h(i11), 0L, 0, false, 1, 0, null, c6562a.c(interfaceC3540l, i12).b().b(), interfaceC3540l, 0, 3072, 56824);
                interfaceC3540l.R();
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

        /* synthetic */ class b extends C6490p implements InterfaceC6824a {
            b(Object obj) {
                super(0, obj, H.m.class, "clearText", "clearText(Landroidx/compose/foundation/text/input/TextFieldState;)V", 1);
            }

            public final void a() {
                H.m.a((H.l) this.receiver);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        a(String str, boolean z10, long j10, InterfaceC3551q0 interfaceC3551q0, H.l lVar, String str2, Ci.e eVar, k0.e eVar2, androidx.compose.ui.focus.o oVar, H.b bVar, L0.U u10, F.D d10, H.d dVar, AbstractC6713l0 abstractC6713l0, int i10) {
            this.f6200a = str;
            this.f6201b = z10;
            this.f6202c = j10;
            this.f6203d = interfaceC3551q0;
            this.f6204e = lVar;
            this.f6205f = str2;
            this.f6206g = eVar;
            this.f6207h = eVar2;
            this.f6208i = oVar;
            this.f6209j = bVar;
            this.f6210k = u10;
            this.f6211l = d10;
            this.f6212m = dVar;
            this.f6213n = abstractC6713l0;
            this.f6214o = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(H.l lVar, String autofill) {
            AbstractC6492s.i(autofill, "autofill");
            H.f fVarR = lVar.r();
            try {
                fVarR.append(autofill);
                lVar.d(fVarR);
                lVar.f();
                return Yg.J.f24997a;
            } catch (Throwable th2) {
                lVar.f();
                throw th2;
            }
        }

        public final void b(z.Y UiSettingsBase, InterfaceC3540l interfaceC3540l, int i10) {
            e.a aVar;
            androidx.compose.ui.e eVarB;
            AbstractC6492s.i(UiSettingsBase, "$this$UiSettingsBase");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-643185383, i10, -1, "com.ui.core.ui.component.settings.UiSettingsTextField2.<anonymous> (UiSettingsTextField2.kt:107)");
            }
            c.a aVar2 = f0.c.f46573a;
            c.InterfaceC1752c interfaceC1752cI = aVar2.i();
            String str = this.f6200a;
            boolean z10 = this.f6201b;
            long j10 = this.f6202c;
            InterfaceC3551q0 interfaceC3551q0 = this.f6203d;
            final H.l lVar = this.f6204e;
            String str2 = this.f6205f;
            Ci.e eVar = this.f6206g;
            k0.e eVar2 = this.f6207h;
            androidx.compose.ui.focus.o oVar = this.f6208i;
            H.b bVar = this.f6209j;
            L0.U u10 = this.f6210k;
            F.D d10 = this.f6211l;
            H.d dVar = this.f6212m;
            AbstractC6713l0 abstractC6713l0 = this.f6213n;
            int i11 = this.f6214o;
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            C8680c c8680c = C8680c.f66832a;
            C0.C cB = z.W.b(c8680c.f(), interfaceC1752cI, interfaceC3540l, 48);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, aVar3);
            InterfaceC2629g.a aVar4 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar4.a();
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
            E1.c(interfaceC3540lA, cB, aVar4.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar4.g());
            InterfaceC6839p interfaceC6839pB = aVar4.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar4.f());
            z.Z z11 = z.Z.f66823a;
            interfaceC3540l.U(1581447199);
            if (str != null) {
                aVar = aVar3;
                eVarB = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.b.c(androidx.compose.foundation.layout.r.i(androidx.compose.foundation.layout.r.z(aVar3, Y0.h.j(64)), Y0.h.j(32)), C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().f(), E.h.d(Y0.h.j(6))), Y0.h.j(4), 0.0f, 2, null);
            } else {
                aVar = aVar3;
                eVarB = z.Y.b(z11, aVar, 1.0f, false, 2, null);
            }
            interfaceC3540l.J();
            C0.C cH = androidx.compose.foundation.layout.d.h(aVar2.e(), false);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarB);
            InterfaceC6824a interfaceC6824aA2 = aVar4.a();
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
            E1.c(interfaceC3540lA2, cH, aVar4.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar4.g());
            InterfaceC6839p interfaceC6839pB2 = aVar4.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar4.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            C0.C cB2 = z.W.b(c8680c.b(), aVar2.i(), interfaceC3540l, 54);
            int iA3 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540l.G();
            e.a aVar5 = aVar;
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540l, aVar5);
            InterfaceC6824a interfaceC6824aA3 = aVar4.a();
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
            E1.c(interfaceC3540lA3, cB2, aVar4.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar4.g());
            InterfaceC6839p interfaceC6839pB3 = aVar4.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar4.f());
            androidx.compose.ui.e eVarB2 = z.Y.b(z11, aVar5, 1.0f, false, 2, null);
            interfaceC3540l.U(-873936349);
            boolean zT = interfaceC3540l.T(lVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: F9.b0
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return c0.a.c(lVar, (String) obj);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            long jK = j10;
            AbstractC2716f.a(lVar, M9.i.k(androidx.compose.ui.focus.p.a(M9.i.d(M9.c.a(eVarB2, eVar, (InterfaceC6835l) objF), eVar2, oVar), oVar), eVar2), z10, false, bVar, u10, d10, dVar, k.c.f7556b, null, null, abstractC6713l0, null, null, null, interfaceC3540l, 100663296, 0, 30216);
            interfaceC3540l.R();
            AbstractC7385d.f((str2 == null || kotlin.text.t.m0(str2) || !kotlin.text.t.m0(lVar.i())) ? false : true, null, androidx.compose.animation.g.o(null, 0.0f, 3, null), androidx.compose.animation.g.q(null, 0.0f, 3, null), null, b0.c.e(626321815, true, new C0245a(str2, i11), interfaceC3540l, 54), interfaceC3540l, 200064, 18);
            interfaceC3540l.R();
            interfaceC3540l.U(1581535944);
            if (str != null) {
                androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(aVar5, Y0.h.j(16), 0.0f, 0.0f, 0.0f, 14, null);
                interfaceC3540l.U(1581541355);
                if (!z10) {
                    jK = C6733v0.k(jK, ((Number) interfaceC3540l.t(AbstractC3343s.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                }
                interfaceC3540l.J();
                a1.b(str, eVarM, jK, Y0.w.g(16), null, Q0.A.f18971b.e(), null, Y0.w.g(0), null, null, Y0.w.g(24), W0.t.f23567a.b(), false, 1, 0, null, null, interfaceC3540l, 12782640, 3126, 119632);
            }
            interfaceC3540l.J();
            boolean zBooleanValue = ((Boolean) interfaceC3551q0.getValue()).booleanValue();
            interfaceC3540l.U(1581558609);
            boolean zT2 = interfaceC3540l.T(lVar);
            Object objF2 = interfaceC3540l.f();
            if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new b(lVar);
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            G9.c.b(z11, zBooleanValue, (InterfaceC6824a) ((th.g) objF2), interfaceC3540l, 6);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b((z.Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6217a;

        b(String str) {
            this.f6217a = str;
        }

        public final void a(z.Y UiSettingsBase, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiSettingsBase, "$this$UiSettingsBase");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(444927448, i10, -1, "com.ui.core.ui.component.settings.UiSettingsTextField2.<anonymous> (UiSettingsTextField2.kt:188)");
            }
            G9.e.b(this.f6217a, androidx.compose.foundation.layout.o.m(androidx.compose.ui.e.f28771b0, 0.0f, 0.0f, 0.0f, Y0.h.j(8), 7, null), interfaceC3540l, 48, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((z.Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:327:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011a  */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r74v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r80v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r80v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r82v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r83v0, types: [java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.e r73, java.lang.String r74, java.lang.String r75, H.l r76, H.b r77, mh.InterfaceC6824a r78, boolean r79, java.lang.String r80, int r81, java.lang.String r82, java.lang.String r83, long r84, Ci.e r86, boolean r87, m0.AbstractC6713l0 r88, F.D r89, H.d r90, androidx.compose.ui.focus.o r91, T.InterfaceC3540l r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 1601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F9.c0.c(androidx.compose.ui.e, java.lang.String, java.lang.String, H.l, H.b, mh.a, boolean, java.lang.String, int, java.lang.String, java.lang.String, long, Ci.e, boolean, m0.l0, F.D, H.d, androidx.compose.ui.focus.o, T.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d(k0.e eVar, androidx.compose.ui.focus.o oVar) {
        k0.e.c(eVar, false, 1, null);
        oVar.f();
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, String str, String str2, H.l lVar, H.b bVar, InterfaceC6824a interfaceC6824a, boolean z10, String str3, int i10, String str4, String str5, long j10, Ci.e eVar2, boolean z11, AbstractC6713l0 abstractC6713l0, F.D d10, H.d dVar, androidx.compose.ui.focus.o oVar, int i11, int i12, int i13, InterfaceC3540l interfaceC3540l, int i14) {
        c(eVar, str, str2, lVar, bVar, interfaceC6824a, z10, str3, i10, str4, str5, j10, eVar2, z11, abstractC6713l0, d10, dVar, oVar, interfaceC3540l, L0.a(i11 | 1), L0.a(i12), i13);
        return Yg.J.f24997a;
    }
}
