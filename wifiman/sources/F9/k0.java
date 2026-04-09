package F9;

import E0.InterfaceC2629g;
import F.AbstractC2716f;
import F9.k0;
import N.AbstractC3343s;
import N.a1;
import Q0.A;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.InterfaceC3563x;
import T.L0;
import T.t1;
import androidx.compose.ui.e;
import com.google.ar.core.ImageMetadata;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.AbstractC6713l0;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import s9.d;
import t9.AbstractC8046b;
import ta.AbstractC8049c;
import z.C8680c;

/* loaded from: classes3.dex */
public abstract class k0 {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6251a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f6252b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6253c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f6254d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6255e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f6256f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f6257g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f6258h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f6259i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Ci.e f6260j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f6261k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.o f6262l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f6263m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ k0.e f6264n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f6265o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ F.D f6266p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ F.C f6267q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractC6713l0 f6268r;

        /* renamed from: F9.k0$a$a, reason: collision with other inner class name */
        static final class C0246a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f6269a;

            C0246a(InterfaceC3551q0 interfaceC3551q0) {
                this.f6269a = interfaceC3551q0;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(744716208, i10, -1, "com.ui.core.ui.component.settings.UiSettingsTextField.<anonymous>.<anonymous>.<anonymous> (UiSettingsTextField.kt:172)");
                }
                AbstractC8049c.c(k0.g(this.f6269a) ? N9.b.f16117a.w().g(new d.b(AbstractC8046b.f61868c)) : N9.b.f16117a.x().g(new d.b(AbstractC8046b.f61869d)), null, C6733v0.g(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().j()), null, interfaceC3540l, 0, 5);
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
            final /* synthetic */ z.Y f6270a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f6271b;

            b(z.Y y10, InterfaceC6835l interfaceC6835l) {
                this.f6270a = y10;
                this.f6271b = interfaceC6835l;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Yg.J c(InterfaceC6835l interfaceC6835l) {
                interfaceC6835l.invoke("");
                return Yg.J.f24997a;
            }

            public final void b(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1060922264, i10, -1, "com.ui.core.ui.component.settings.UiSettingsTextField.<anonymous>.<anonymous>.<anonymous> (UiSettingsTextField.kt:212)");
                }
                androidx.compose.ui.e eVarC = this.f6270a.c(androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(20)), f0.c.f46573a.i());
                interfaceC3540l.U(-1704616851);
                boolean zT = interfaceC3540l.T(this.f6271b);
                final InterfaceC6835l interfaceC6835l = this.f6271b;
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: F9.l0
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return k0.a.b.c(interfaceC6835l);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                N.Z.a((InterfaceC6824a) objF, eVarC, false, null, C2838b.f6176a.b(), interfaceC3540l, 24576, 12);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                b((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        a(String str, InterfaceC3551q0 interfaceC3551q0, boolean z10, boolean z11, int i10, boolean z12, InterfaceC3551q0 interfaceC3551q02, String str2, long j10, Ci.e eVar, InterfaceC6835l interfaceC6835l, androidx.compose.ui.focus.o oVar, String str3, k0.e eVar2, InterfaceC3551q0 interfaceC3551q03, F.D d10, F.C c10, AbstractC6713l0 abstractC6713l0) {
            this.f6251a = str;
            this.f6252b = interfaceC3551q0;
            this.f6253c = z10;
            this.f6254d = z11;
            this.f6255e = i10;
            this.f6256f = z12;
            this.f6257g = interfaceC3551q02;
            this.f6258h = str2;
            this.f6259i = j10;
            this.f6260j = eVar;
            this.f6261k = interfaceC6835l;
            this.f6262l = oVar;
            this.f6263m = str3;
            this.f6264n = eVar2;
            this.f6265o = interfaceC3551q03;
            this.f6266p = d10;
            this.f6267q = c10;
            this.f6268r = abstractC6713l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J h(androidx.compose.ui.graphics.c graphicsLayer) {
            AbstractC6492s.i(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.I1(E.h.g());
            graphicsLayer.G(true);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J i(InterfaceC3551q0 interfaceC3551q0, String str, k0.l focusState) {
            AbstractC6492s.i(focusState, "focusState");
            if (focusState.getHasFocus()) {
                interfaceC3551q0.setValue(null);
            } else {
                interfaceC3551q0.setValue(str);
            }
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J j(InterfaceC6835l interfaceC6835l, String it) {
            AbstractC6492s.i(it, "it");
            interfaceC6835l.invoke(it);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J k(InterfaceC3551q0 interfaceC3551q0) {
            k0.h(interfaceC3551q0, !k0.g(interfaceC3551q0));
            return Yg.J.f24997a;
        }

        public final void f(z.Y UiSettingsBase, InterfaceC3540l interfaceC3540l, int i10) {
            long jD;
            String str;
            boolean z10;
            androidx.compose.ui.e eVarB;
            int i11;
            R0.c0 c0VarC;
            e.a aVar;
            int i12;
            int i13;
            boolean z11;
            char c10;
            e.a aVar2;
            AbstractC6492s.i(UiSettingsBase, "$this$UiSettingsBase");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2061437675, i10, -1, "com.ui.core.ui.component.settings.UiSettingsTextField.<anonymous> (UiSettingsTextField.kt:109)");
            }
            String str2 = this.f6251a;
            if (str2 == null || kotlin.text.t.m0(str2)) {
                str2 = null;
            }
            this.f6252b.setValue(Boolean.valueOf(this.f6253c && str2 != null));
            L0.U u10 = (L0.U) interfaceC3540l.t(a1.e());
            if (str2 == null || !this.f6254d) {
                interfaceC3540l.U(-1247138827);
                jD = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).f().d();
            } else {
                interfaceC3540l.U(-1247137931);
                jD = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).f().a();
            }
            interfaceC3540l.J();
            long j10 = jD;
            long jG = Y0.w.g(16);
            A.a aVar3 = Q0.A.f18971b;
            L0.U uB = u10.b((15204351 & 1) != 0 ? u10.f11108a.g() : j10, (15204351 & 2) != 0 ? u10.f11108a.k() : jG, (15204351 & 4) != 0 ? u10.f11108a.n() : aVar3.e(), (15204351 & 8) != 0 ? u10.f11108a.l() : null, (15204351 & 16) != 0 ? u10.f11108a.m() : null, (15204351 & 32) != 0 ? u10.f11108a.i() : null, (15204351 & 64) != 0 ? u10.f11108a.j() : null, (15204351 & 128) != 0 ? u10.f11108a.o() : Y0.w.g(0), (15204351 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? u10.f11108a.e() : null, (15204351 & 512) != 0 ? u10.f11108a.u() : null, (15204351 & 1024) != 0 ? u10.f11108a.p() : null, (15204351 & 2048) != 0 ? u10.f11108a.d() : 0L, (15204351 & 4096) != 0 ? u10.f11108a.s() : null, (15204351 & 8192) != 0 ? u10.f11108a.r() : null, (15204351 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? u10.f11108a.h() : null, (15204351 & 32768) != 0 ? u10.f11109b.h() : this.f6255e, (15204351 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? u10.f11109b.i() : 0, (15204351 & 131072) != 0 ? u10.f11109b.e() : Y0.w.g(24), (15204351 & 262144) != 0 ? u10.f11109b.j() : null, (15204351 & ImageMetadata.LENS_APERTURE) != 0 ? u10.f11110c : null, (15204351 & ImageMetadata.SHADING_MODE) != 0 ? u10.f11109b.f() : null, (15204351 & 2097152) != 0 ? u10.f11109b.d() : 0, (15204351 & 4194304) != 0 ? u10.f11109b.c() : 0, (15204351 & 8388608) != 0 ? u10.f11109b.k() : null);
            c.a aVar4 = f0.c.f46573a;
            c.InterfaceC1752c interfaceC1752cI = aVar4.i();
            boolean z12 = this.f6256f;
            final InterfaceC3551q0 interfaceC3551q0 = this.f6257g;
            String str3 = this.f6258h;
            boolean z13 = this.f6254d;
            long j11 = this.f6259i;
            InterfaceC3551q0 interfaceC3551q02 = this.f6252b;
            Ci.e eVar = this.f6260j;
            final InterfaceC6835l interfaceC6835l = this.f6261k;
            androidx.compose.ui.focus.o oVar = this.f6262l;
            final String str4 = this.f6263m;
            k0.e eVar2 = this.f6264n;
            final InterfaceC3551q0 interfaceC3551q03 = this.f6265o;
            F.D d10 = this.f6266p;
            F.C c11 = this.f6267q;
            AbstractC6713l0 abstractC6713l0 = this.f6268r;
            e.a aVar5 = androidx.compose.ui.e.f28771b0;
            C8680c c8680c = C8680c.f66832a;
            C0.C cB = z.W.b(c8680c.f(), interfaceC1752cI, interfaceC3540l, 48);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, aVar5);
            InterfaceC2629g.a aVar6 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar6.a();
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
            E1.c(interfaceC3540lA, cB, aVar6.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar6.g());
            InterfaceC6839p interfaceC6839pB = aVar6.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar6.f());
            z.Z z14 = z.Z.f66823a;
            interfaceC3540l.U(1522571297);
            interfaceC3540l.U(1522572205);
            if (str3 != null) {
                str = str3;
                z10 = false;
                eVarB = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.b.c(androidx.compose.foundation.layout.r.i(androidx.compose.foundation.layout.r.z(aVar5, Y0.h.j(64)), Y0.h.j(32)), C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().f(), E.h.d(Y0.h.j(6))), Y0.h.j(4), 0.0f, 2, null);
            } else {
                str = str3;
                z10 = false;
                eVarB = z.Y.b(z14, aVar5, 1.0f, false, 2, null);
            }
            interfaceC3540l.J();
            interfaceC3540l.J();
            C0.C cB2 = z.W.b(c8680c.b(), aVar4.i(), interfaceC3540l, 54);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarB);
            InterfaceC6824a interfaceC6824aA2 = aVar6.a();
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
            E1.c(interfaceC3540lA2, cB2, aVar6.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar6.g());
            InterfaceC6839p interfaceC6839pB2 = aVar6.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar6.f());
            androidx.compose.ui.e eVarA = androidx.compose.ui.focus.p.a(M9.c.a(z.Y.b(z14, aVar5, 1.0f, false, 2, null), eVar, interfaceC6835l), oVar);
            interfaceC3540l.U(-1704722502);
            boolean zT = interfaceC3540l.T(str4);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: F9.g0
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return k0.a.i(interfaceC3551q03, str4, (k0.l) obj);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            androidx.compose.ui.e eVarK = M9.i.k(androidx.compose.ui.focus.e.a(eVarA, (InterfaceC6835l) objF), eVar2);
            if (str2 == null && (str2 = (String) interfaceC3551q03.getValue()) == null) {
                str2 = "";
            }
            if (k0.g(interfaceC3551q0) || interfaceC3551q03.getValue() != null) {
                i11 = 0;
                c0VarC = R0.c0.f19456a.c();
            } else {
                i11 = 0;
                c0VarC = new R0.J((char) 0, 1, null);
            }
            R0.c0 c0Var = c0VarC;
            interfaceC3540l.U(-1704707802);
            boolean zT2 = interfaceC3540l.T(interfaceC6835l);
            Object objF2 = interfaceC3540l.f();
            if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new InterfaceC6835l() { // from class: F9.h0
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return k0.a.j(interfaceC6835l, (String) obj);
                    }
                };
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            String str5 = str;
            int i14 = i11;
            AbstractC2716f.d(str2, (InterfaceC6835l) objF2, eVarK, z13, false, uB, d10, c11, true, 0, 0, c0Var, null, null, abstractC6713l0, null, interfaceC3540l, 100663296, 0, 46608);
            interfaceC3540l.R();
            interfaceC3540l.U(1522633091);
            if (z12) {
                i12 = 16;
                aVar = aVar5;
                i13 = 6;
                z.a0.a(androidx.compose.foundation.layout.r.z(aVar, Y0.h.j(16)), interfaceC3540l, 6);
                androidx.compose.ui.e eVarC = z14.c(androidx.compose.foundation.layout.r.v(aVar, Y0.h.j(20)), aVar4.i());
                interfaceC3540l.U(1522641938);
                boolean zT3 = interfaceC3540l.T(interfaceC3551q0);
                Object objF3 = interfaceC3540l.f();
                if (zT3 || objF3 == InterfaceC3540l.f21100a.a()) {
                    objF3 = new InterfaceC6824a() { // from class: F9.i0
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return k0.a.k(interfaceC3551q0);
                        }
                    };
                    interfaceC3540l.K(objF3);
                }
                interfaceC3540l.J();
                z11 = true;
                c10 = '6';
                N.Z.a((InterfaceC6824a) objF3, eVarC, false, null, b0.c.e(744716208, true, new C0246a(interfaceC3551q0), interfaceC3540l, 54), interfaceC3540l, 24576, 12);
            } else {
                aVar = aVar5;
                i12 = 16;
                i13 = 6;
                z11 = true;
                c10 = '6';
            }
            interfaceC3540l.J();
            interfaceC3540l.U(1522664535);
            if (str5 != null) {
                z.a0.a(androidx.compose.foundation.layout.r.z(aVar, Y0.h.j(i12)), interfaceC3540l, i13);
                interfaceC3540l.U(1522669729);
                long jK = z13 ? j11 : C6733v0.k(j11, ((Number) interfaceC3540l.t(AbstractC3343s.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                interfaceC3540l.J();
                aVar2 = aVar;
                a1.b(str5, null, jK, Y0.w.g(i12), null, aVar3.e(), null, Y0.w.g(i14), null, null, Y0.w.g(24), W0.t.f23567a.b(), false, 1, 0, null, null, interfaceC3540l, 12782592, 3126, 119634);
            } else {
                aVar2 = aVar;
            }
            interfaceC3540l.J();
            AbstractC7385d.e(z14, ((Boolean) interfaceC3551q02.getValue()).booleanValue(), null, null, null, null, C2838b.f6176a.a(), interfaceC3540l, 1572870, 30);
            interfaceC3540l.U(1522690521);
            Object objF4 = interfaceC3540l.f();
            if (objF4 == InterfaceC3540l.f21100a.a()) {
                objF4 = new InterfaceC6835l() { // from class: F9.j0
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return k0.a.h((androidx.compose.ui.graphics.c) obj);
                    }
                };
                interfaceC3540l.K(objF4);
            }
            interfaceC3540l.J();
            AbstractC7385d.e(z14, ((Boolean) interfaceC3551q02.getValue()).booleanValue(), androidx.compose.ui.graphics.b.a(aVar2, (InterfaceC6835l) objF4), androidx.compose.animation.g.o(null, 0.0f, 3, null), androidx.compose.animation.g.q(null, 0.0f, 3, null), null, b0.c.e(1060922264, true, new b(z14, interfaceC6835l), interfaceC3540l, 54), interfaceC3540l, 1600902, 16);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            f((z.Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6272a;

        b(String str) {
            this.f6272a = str;
        }

        public final void a(z.Y UiSettingsBase, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiSettingsBase, "$this$UiSettingsBase");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1145416790, i10, -1, "com.ui.core.ui.component.settings.UiSettingsTextField.<anonymous> (UiSettingsTextField.kt:223)");
            }
            G9.e.b(this.f6272a, androidx.compose.foundation.layout.o.m(androidx.compose.ui.e.f28771b0, 0.0f, 0.0f, 0.0f, Y0.h.j(8), 7, null), interfaceC3540l, 48, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:360:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(androidx.compose.ui.e r79, java.lang.String r80, java.lang.String r81, final java.lang.String r82, final mh.InterfaceC6835l r83, mh.InterfaceC6824a r84, java.lang.Boolean r85, mh.InterfaceC6824a r86, boolean r87, java.lang.String r88, int r89, java.lang.String r90, java.lang.String r91, long r92, Ci.e r94, boolean r95, boolean r96, m0.AbstractC6713l0 r97, F.D r98, F.C r99, androidx.compose.ui.focus.o r100, T.InterfaceC3540l r101, final int r102, final int r103, final int r104, final int r105) {
        /*
            Method dump skipped, instructions count: 1688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F9.k0.d(androidx.compose.ui.e, java.lang.String, java.lang.String, java.lang.String, mh.l, mh.a, java.lang.Boolean, mh.a, boolean, java.lang.String, int, java.lang.String, java.lang.String, long, Ci.e, boolean, boolean, m0.l0, F.D, F.C, androidx.compose.ui.focus.o, T.l, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, String str, String str2, String str3, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, Boolean bool, InterfaceC6824a interfaceC6824a2, boolean z10, String str4, int i10, String str5, String str6, long j10, Ci.e eVar2, boolean z11, boolean z12, AbstractC6713l0 abstractC6713l0, F.D d10, F.C c10, androidx.compose.ui.focus.o oVar, int i11, int i12, int i13, int i14, InterfaceC3540l interfaceC3540l, int i15) {
        d(eVar, str, str2, str3, interfaceC6835l, interfaceC6824a, bool, interfaceC6824a2, z10, str4, i10, str5, str6, j10, eVar2, z11, z12, abstractC6713l0, d10, c10, oVar, interfaceC3540l, L0.a(i11 | 1), L0.a(i12), L0.a(i13), i14);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3551q0 f(boolean z10) {
        return t1.d(Boolean.valueOf(!z10), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(InterfaceC3551q0 interfaceC3551q0) {
        return ((Boolean) interfaceC3551q0.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC3551q0 interfaceC3551q0, boolean z10) {
        interfaceC3551q0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J i(InterfaceC6824a interfaceC6824a, androidx.compose.ui.focus.o oVar) {
        if (interfaceC6824a != null) {
            interfaceC6824a.invoke();
        }
        oVar.f();
        return Yg.J.f24997a;
    }
}
