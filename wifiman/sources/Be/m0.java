package Be;

import Be.m0;
import E0.InterfaceC2629g;
import F.AbstractC2716f;
import N.AbstractC3309a0;
import N.O0;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.t1;
import T.z1;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.n1;
import b0.InterfaceC4038a;
import c0.AbstractC4173b;
import c0.AbstractC4174c;
import c0.InterfaceC4182k;
import c0.InterfaceC4184m;
import com.google.ar.core.ImageMetadata;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f0.c;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import la.C6562a;
import m0.j1;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import r0.AbstractC7554d;
import s9.d;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.C8680c;

/* loaded from: classes4.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final T.H0 f1590a = AbstractC3561w.f(new InterfaceC6824a() { // from class: Be.e0
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return m0.g();
        }
    });

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.o f1591a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f1592b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n1 f1593c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2459b0 f1594d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k0.e f1595e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ s9.d f1596f;

        /* renamed from: Be.m0$a$a, reason: collision with other inner class name */
        static final class C0069a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f1597a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f1598b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.o f1599c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ n1 f1600d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0069a(boolean z10, androidx.compose.ui.focus.o oVar, n1 n1Var, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f1598b = z10;
                this.f1599c = oVar;
                this.f1600d = n1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C0069a(this.f1598b, this.f1599c, this.f1600d, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f1597a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    if (this.f1598b) {
                        this.f1599c.f();
                        this.f1597a = 1;
                        if (Ji.i.e(this) == objG) {
                            return objG;
                        }
                    }
                    return Yg.J.f24997a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                n1 n1Var = this.f1600d;
                if (n1Var != null) {
                    n1Var.b();
                }
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((C0069a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        public static final class b implements T.K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n0 f1601a;

            public b(n0 n0Var) {
                this.f1601a = n0Var;
            }

            @Override // T.K
            public void dispose() {
                this.f1601a.b(false);
            }
        }

        a(androidx.compose.ui.focus.o oVar, boolean z10, n1 n1Var, C2459b0 c2459b0, k0.e eVar, s9.d dVar) {
            this.f1591a = oVar;
            this.f1592b = z10;
            this.f1593c = n1Var;
            this.f1594d = c2459b0;
            this.f1595e = eVar;
            this.f1596f = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final T.K h(n0 n0Var, T.L DisposableEffect) {
            AbstractC6492s.i(DisposableEffect, "$this$DisposableEffect");
            n0Var.b(true);
            return new b(n0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J i(C2459b0 c2459b0, k0.e eVar, F.B KeyboardActions) {
            AbstractC6492s.i(KeyboardActions, "$this$KeyboardActions");
            if (((R0.Q) c2459b0.b().getValue()).i().length() == 0) {
                c2459b0.d();
            }
            k0.e.c(eVar, false, 1, null);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J j(C2459b0 c2459b0, R0.Q query) {
            AbstractC6492s.i(query, "query");
            c2459b0.f(query);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J k(k0.e eVar, C2459b0 c2459b0) {
            k0.e.c(eVar, false, 1, null);
            c2459b0.d();
            return Yg.J.f24997a;
        }

        public final void f(InterfaceC3540l interfaceC3540l, int i10) {
            C6562a c6562a;
            int i11;
            e.a aVar;
            float f10;
            float f11;
            int i12;
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-205867851, i10, -1, "com.ui.wifiman.ui.component.UiSearchBox.<anonymous> (UiSearchBox.kt:169)");
            }
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            float f12 = 4;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(androidx.compose.foundation.layout.r.h(aVar2, 0.0f, 1, null), Y0.h.j(8), Y0.h.j(f12));
            c.a aVar3 = f0.c.f46573a;
            c.InterfaceC1752c interfaceC1752cI = aVar3.i();
            C8680c.f fVarN = C8680c.f66832a.n(Y0.h.j(f12));
            final C2459b0 c2459b0 = this.f1594d;
            final k0.e eVar = this.f1595e;
            s9.d dVar = this.f1596f;
            androidx.compose.ui.focus.o oVar = this.f1591a;
            C0.C cB = z.W.b(fVarN, interfaceC1752cI, interfaceC3540l, 54);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarJ);
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
            z.Z z10 = z.Z.f66823a;
            float f13 = 24;
            androidx.compose.ui.e eVarV = androidx.compose.foundation.layout.r.v(aVar2, Y0.h.j(f13));
            N9.b bVar = N9.b.f16117a;
            AbstractC7554d abstractC7554dI = AbstractC8049c.i(bVar.H(), interfaceC3540l, 0);
            C6562a c6562a2 = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            AbstractC3309a0.a(abstractC7554dI, null, eVarV, c6562a2.a(interfaceC3540l, i13).a().g().j(), interfaceC3540l, 432, 0);
            androidx.compose.ui.e eVarA = z10.a(aVar2, 1.0f, true);
            C0.C cH = androidx.compose.foundation.layout.d.h(aVar3.o(), false);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarA);
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
            interfaceC3540l.U(670499318);
            if (((R0.Q) c2459b0.b().getValue()).i().length() == 0) {
                f10 = f12;
                c6562a = c6562a2;
                i11 = i13;
                f11 = f13;
                aVar = aVar2;
                a1.c(AbstractC7930a.a(dVar, interfaceC3540l, 0), androidx.compose.foundation.layout.r.h(aVar2, 0.0f, 1, null), c6562a2.a(interfaceC3540l, i13).f().c(), 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, null, c6562a2.c(interfaceC3540l, i13).b().b(), interfaceC3540l, 48, 3120, 120824);
            } else {
                c6562a = c6562a2;
                i11 = i13;
                aVar = aVar2;
                f10 = f12;
                f11 = f13;
            }
            interfaceC3540l.J();
            e.a aVar5 = aVar;
            androidx.compose.ui.e eVarA2 = androidx.compose.ui.focus.p.a(androidx.compose.foundation.layout.r.h(aVar5, 0.0f, 1, null), oVar);
            R0.Q q10 = (R0.Q) c2459b0.b().getValue();
            C6562a c6562a3 = c6562a;
            int i14 = i11;
            j1 j1Var = new j1(c6562a3.a(interfaceC3540l, i14).f().a(), null);
            L0.U uB = c6562a3.c(interfaceC3540l, i14).b().b();
            L0.U uB2 = uB.b((15204351 & 1) != 0 ? uB.f11108a.g() : c6562a3.a(interfaceC3540l, i14).f().a(), (15204351 & 2) != 0 ? uB.f11108a.k() : 0L, (15204351 & 4) != 0 ? uB.f11108a.n() : null, (15204351 & 8) != 0 ? uB.f11108a.l() : null, (15204351 & 16) != 0 ? uB.f11108a.m() : null, (15204351 & 32) != 0 ? uB.f11108a.i() : null, (15204351 & 64) != 0 ? uB.f11108a.j() : null, (15204351 & 128) != 0 ? uB.f11108a.o() : 0L, (15204351 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? uB.f11108a.e() : null, (15204351 & 512) != 0 ? uB.f11108a.u() : null, (15204351 & 1024) != 0 ? uB.f11108a.p() : null, (15204351 & 2048) != 0 ? uB.f11108a.d() : 0L, (15204351 & 4096) != 0 ? uB.f11108a.s() : null, (15204351 & 8192) != 0 ? uB.f11108a.r() : null, (15204351 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? uB.f11108a.h() : null, (15204351 & 32768) != 0 ? uB.f11109b.h() : 0, (15204351 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? uB.f11109b.i() : 0, (15204351 & 131072) != 0 ? uB.f11109b.e() : 0L, (15204351 & 262144) != 0 ? uB.f11109b.j() : null, (15204351 & ImageMetadata.LENS_APERTURE) != 0 ? uB.f11110c : null, (15204351 & ImageMetadata.SHADING_MODE) != 0 ? uB.f11109b.f() : null, (15204351 & 2097152) != 0 ? uB.f11109b.d() : 0, (15204351 & 4194304) != 0 ? uB.f11109b.c() : 0, (15204351 & 8388608) != 0 ? uB.f11109b.k() : null);
            F.D d10 = new F.D(0, (Boolean) null, 0, R0.r.f19498b.g(), (R0.K) null, (Boolean) null, (S0.e) null, 119, (DefaultConstructorMarker) null);
            interfaceC3540l.U(670532243);
            boolean zT = interfaceC3540l.T(c2459b0) | interfaceC3540l.l(eVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: Be.i0
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return m0.a.i(c2459b0, eVar, (F.B) obj);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            F.C c10 = new F.C(null, null, null, null, (InterfaceC6835l) objF, null, 47, null);
            interfaceC3540l.U(670542397);
            boolean zT2 = interfaceC3540l.T(c2459b0);
            Object objF2 = interfaceC3540l.f();
            if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new InterfaceC6835l() { // from class: Be.j0
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return m0.a.j(c2459b0, (R0.Q) obj);
                    }
                };
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            AbstractC2716f.c(q10, (InterfaceC6835l) objF2, eVarA2, false, false, uB2, d10, c10, true, 0, 0, null, null, null, j1Var, null, interfaceC3540l, 102236160, 0, 48664);
            interfaceC3540l.R();
            interfaceC3540l.U(-1145565008);
            if (((Boolean) c2459b0.a().getValue()).booleanValue()) {
                androidx.compose.ui.e eVarI = androidx.compose.foundation.layout.o.i(androidx.compose.foundation.layout.r.v(aVar5, Y0.h.j(f11)), Y0.h.j(f10));
                interfaceC3540l.U(-1145558665);
                boolean zL = interfaceC3540l.l(eVar) | interfaceC3540l.T(c2459b0);
                Object objF3 = interfaceC3540l.f();
                if (zL || objF3 == InterfaceC3540l.f21100a.a()) {
                    objF3 = new InterfaceC6824a() { // from class: Be.k0
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return m0.a.k(eVar, c2459b0);
                        }
                    };
                    interfaceC3540l.K(objF3);
                }
                interfaceC3540l.J();
                i12 = 0;
                AbstractC3309a0.a(AbstractC8049c.i(bVar.s(), interfaceC3540l, 0), AbstractC7930a.b(new d.b(AbstractC6780c.f53461c), interfaceC3540l, 0), M9.i.f(eVarI, null, 0.0f, false, (InterfaceC6824a) objF3, interfaceC3540l, 6, 7), c6562a3.a(interfaceC3540l, i14).a().g().j(), interfaceC3540l, 0, 0);
            } else {
                i12 = 0;
            }
            interfaceC3540l.J();
            interfaceC3540l.R();
            androidx.compose.ui.focus.o oVar2 = this.f1591a;
            interfaceC3540l.U(-1242895386);
            boolean zC = interfaceC3540l.c(this.f1592b) | interfaceC3540l.T(this.f1593c);
            boolean z11 = this.f1592b;
            androidx.compose.ui.focus.o oVar3 = this.f1591a;
            n1 n1Var = this.f1593c;
            Object objF4 = interfaceC3540l.f();
            if (zC || objF4 == InterfaceC3540l.f21100a.a()) {
                objF4 = new C0069a(z11, oVar3, n1Var, null);
                interfaceC3540l.K(objF4);
            }
            interfaceC3540l.J();
            T.O.f(oVar2, (InterfaceC6839p) objF4, interfaceC3540l, 6);
            final n0 n0Var = (n0) interfaceC3540l.t(m0.m());
            interfaceC3540l.U(-1242883375);
            boolean zT3 = interfaceC3540l.T(n0Var);
            Object objF5 = interfaceC3540l.f();
            if (zT3 || objF5 == InterfaceC3540l.f21100a.a()) {
                objF5 = new InterfaceC6835l() { // from class: Be.l0
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return m0.a.h(n0Var, (T.L) obj);
                    }
                };
                interfaceC3540l.K(objF5);
            }
            interfaceC3540l.J();
            T.O.c(n0Var, (InterfaceC6835l) objF5, interfaceC3540l, i12);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            f((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0 g() {
        return new n0();
    }

    public static final void h(androidx.compose.ui.e eVar, C2459b0 c2459b0, boolean z10, final s9.d placeholderText, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        C2459b0 c2459b02;
        boolean z11;
        C2459b0 c2459b03;
        boolean z12;
        androidx.compose.ui.e eVar3;
        C2459b0 c2459b04;
        InterfaceC3540l interfaceC3540l2;
        final androidx.compose.ui.e eVar4;
        final C2459b0 c2459b05;
        AbstractC6492s.i(placeholderText, "placeholderText");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1660669553);
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
                c2459b02 = c2459b0;
                int i14 = interfaceC3540lR.T(c2459b02) ? 32 : 16;
                i12 |= i14;
            } else {
                c2459b02 = c2459b0;
            }
            i12 |= i14;
        } else {
            c2459b02 = c2459b0;
        }
        int i15 = i11 & 4;
        if (i15 != 0) {
            i12 |= 384;
            z11 = z10;
        } else {
            z11 = z10;
            if ((i10 & 384) == 0) {
                i12 |= interfaceC3540lR.c(z11) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC3540lR.T(placeholderText) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar4 = eVar2;
            c2459b05 = c2459b02;
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            interfaceC3540lR.q();
            if ((i10 & 1) == 0 || interfaceC3540lR.H()) {
                androidx.compose.ui.e eVar5 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
                if ((i11 & 2) != 0) {
                    c2459b03 = (C2459b0) n(false, false, null, null, interfaceC3540lR, 0, 15).getValue();
                    i12 &= -113;
                } else {
                    c2459b03 = c2459b02;
                }
                if (i15 != 0) {
                    eVar3 = eVar5;
                    c2459b04 = c2459b03;
                    z12 = true;
                } else {
                    z12 = z10;
                    eVar3 = eVar5;
                    c2459b04 = c2459b03;
                }
            } else {
                interfaceC3540lR.C();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                c2459b04 = c2459b02;
                z12 = z11;
                eVar3 = eVar2;
            }
            interfaceC3540lR.S();
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1660669553, i12, -1, "com.ui.wifiman.ui.component.UiSearchBox (UiSearchBox.kt:159)");
            }
            k0.e eVar6 = (k0.e) interfaceC3540lR.t(AbstractC3932k0.h());
            interfaceC3540lR.U(1358458519);
            Object objF = interfaceC3540lR.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new androidx.compose.ui.focus.o();
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            n1 n1Var = (n1) interfaceC3540lR.t(AbstractC3932k0.q());
            androidx.compose.ui.e eVarA = androidx.compose.foundation.layout.r.a(eVar3, Y0.h.j(220), Y0.h.j(40));
            long jF = C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).a().g().f();
            E.g gVarD = E.h.d(Y0.h.j(12));
            InterfaceC4038a interfaceC4038aE = b0.c.e(-205867851, true, new a((androidx.compose.ui.focus.o) objF, z12, n1Var, c2459b04, eVar6, placeholderText), interfaceC3540lR, 54);
            interfaceC3540l2 = interfaceC3540lR;
            eVar4 = eVar3;
            O0.a(eVarA, gVarD, jF, 0L, null, 0.0f, interfaceC4038aE, interfaceC3540l2, 1572864, 56);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            c2459b05 = c2459b04;
            z11 = z12;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            final boolean z13 = z11;
            x0Z.a(new InterfaceC6839p() { // from class: Be.h0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return m0.i(eVar4, c2459b05, z13, placeholderText, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J i(androidx.compose.ui.e eVar, C2459b0 c2459b0, boolean z10, s9.d dVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        h(eVar, c2459b0, z10, dVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    private static final InterfaceC4182k j(final InterfaceC6835l interfaceC6835l) {
        final String str = "visible";
        final String str2 = "closable";
        final String str3 = "query";
        return AbstractC4173b.a(new InterfaceC6839p() { // from class: Be.f0
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return m0.k(str, str2, str3, (InterfaceC4184m) obj, (C2459b0) obj2);
            }
        }, new InterfaceC6835l() { // from class: Be.g0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return m0.l(str, str2, str3, interfaceC6835l, (Map) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map k(String str, String str2, String str3, InterfaceC4184m mapSaver, C2459b0 it) {
        AbstractC6492s.i(mapSaver, "$this$mapSaver");
        AbstractC6492s.i(it, "it");
        return Zg.U.k(Yg.z.a(str, it.c().getValue()), Yg.z.a(str2, it.a().getValue()), Yg.z.a(str3, ((R0.Q) it.b().getValue()).i()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2459b0 l(String str, String str2, String str3, InterfaceC6835l interfaceC6835l, Map it) {
        AbstractC6492s.i(it, "it");
        Object obj = it.get(str);
        AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Boolean");
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Object obj2 = it.get(str2);
        AbstractC6492s.g(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        Object obj3 = it.get(str3);
        AbstractC6492s.g(obj3, "null cannot be cast to non-null type kotlin.String");
        return new C2459b0(zBooleanValue, zBooleanValue2, new R0.Q((String) obj3, 0L, (L0.S) null, 6, (DefaultConstructorMarker) null), interfaceC6835l);
    }

    public static final T.H0 m() {
        return f1590a;
    }

    public static final z1 n(boolean z10, boolean z11, R0.Q q10, InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        final InterfaceC6835l interfaceC6835l2;
        interfaceC3540l.U(1516837324);
        final boolean z12 = (i11 & 1) != 0 ? false : z10;
        final boolean z13 = (i11 & 2) != 0 ? false : z11;
        final R0.Q q11 = (i11 & 4) != 0 ? new R0.Q("", 0L, (L0.S) null, 6, (DefaultConstructorMarker) null) : q10;
        if ((i11 & 8) != 0) {
            interfaceC3540l.U(-674481717);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: Be.c0
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return m0.o((String) obj);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC6835l2 = (InterfaceC6835l) objF;
            interfaceC3540l.J();
        } else {
            interfaceC6835l2 = interfaceC6835l;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1516837324, i10, -1, "com.ui.wifiman.ui.component.rememberUiSearchBoxController (UiSearchBox.kt:114)");
        }
        Object[] objArr = new Object[0];
        InterfaceC4182k interfaceC4182kJ = j(interfaceC6835l2);
        interfaceC3540l.U(-674477554);
        boolean z14 = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.c(z12)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.c(z13)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC3540l.T(q11)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && interfaceC3540l.T(interfaceC6835l2)) || (i10 & 3072) == 2048);
        Object objF2 = interfaceC3540l.f();
        if (z14 || objF2 == InterfaceC3540l.f21100a.a()) {
            objF2 = new InterfaceC6824a() { // from class: Be.d0
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return m0.p(z12, z13, q11, interfaceC6835l2);
                }
            };
            interfaceC3540l.K(objF2);
        }
        interfaceC3540l.J();
        InterfaceC3551q0 interfaceC3551q0D = AbstractC4174c.d(objArr, interfaceC4182kJ, null, (InterfaceC6824a) objF2, interfaceC3540l, 0, 4);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return interfaceC3551q0D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J o(String it) {
        AbstractC6492s.i(it, "it");
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3551q0 p(boolean z10, boolean z11, R0.Q q10, InterfaceC6835l interfaceC6835l) {
        return t1.d(new C2459b0(z10, z11, q10, interfaceC6835l), null, 2, null);
    }

    public static final n0 q(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-1864439473);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1864439473, i10, -1, "com.ui.wifiman.ui.component.rememberUiSearchBoxVisibilityState (UiSearchBox.kt:144)");
        }
        interfaceC3540l.U(-1285964101);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = new n0();
            interfaceC3540l.K(objF);
        }
        n0 n0Var = (n0) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return n0Var;
    }
}
