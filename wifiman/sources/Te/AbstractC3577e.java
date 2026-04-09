package Te;

import Be.AbstractC2487w;
import E0.InterfaceC2629g;
import L0.C3174d;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.X0;
import W0.t;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3932k0;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import l0.AbstractC6532h;
import l0.AbstractC6538n;
import l0.C6531g;
import l0.C6537m;
import la.C6562a;
import m0.AbstractC6688Y;
import m0.C6733v0;
import m0.U0;
import m0.V0;
import m0.j1;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.InterfaceC7039f;
import org.conscrypt.PSKKeyManager;
import s.AbstractC7848i;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* renamed from: Te.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3577e {
    public static final void d(final androidx.compose.ui.e modifier, final C3569a model, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        float f10;
        C8680c c8680c;
        InterfaceC3540l interfaceC3540l2;
        e.a aVar;
        boolean z10;
        float f11;
        int i12;
        C8680c c8680c2;
        e.a aVar2;
        int i13;
        C6562a c6562a;
        int i14;
        C6562a c6562a2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(381650030);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(381650030, i11, -1, "com.ui.wifiman.ui.signal.components.AccessPointRoamingItem (AccessPointRoamingItem.kt:77)");
            }
            float f12 = 16;
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.i.a(androidx.compose.foundation.layout.r.k(modifier, Y0.h.j(48), 0.0f, 2, null), z.J.Min), Y0.h.j(f12), 0.0f, 2, null);
            C8680c c8680c3 = C8680c.f66832a;
            C8680c.f fVarN = c8680c3.n(Y0.h.j(8));
            c.a aVar3 = f0.c.f46573a;
            C0.C cB = z.W.b(fVarN, aVar3.i(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarK);
            InterfaceC2629g.a aVar4 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar4.a();
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
            E1.c(interfaceC3540lA, cB, aVar4.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar4.g());
            InterfaceC6839p interfaceC6839pB = aVar4.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar4.f());
            z.Z z11 = z.Z.f66823a;
            e.a aVar5 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarD = androidx.compose.foundation.layout.r.d(aVar5, 0.0f, 1, null);
            C0.C cA = AbstractC8685h.a(c8680c3.g(), aVar3.g(), interfaceC3540lR, 48);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarD);
            InterfaceC6824a interfaceC6824aA2 = aVar4.a();
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
            E1.c(interfaceC3540lA2, cA, aVar4.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar4.g());
            InterfaceC6839p interfaceC6839pB2 = aVar4.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar4.f());
            C8688k c8688k = C8688k.f66923a;
            if (model.b()) {
                interfaceC3540lR.U(1579981890);
                f10 = f12;
                c8680c = c8680c3;
                f(c8688k.a(aVar5, 1.0f, true), C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).a().g().i(), false, interfaceC3540lR, 384);
                interfaceC3540lR.J();
            } else {
                f10 = f12;
                c8680c = c8680c3;
                interfaceC3540lR.U(1580217211);
                z.a0.a(c8688k.a(aVar5, 1.0f, true), interfaceC3540lR, 0);
                interfaceC3540lR.J();
            }
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC2487w.b(model.d(), androidx.compose.foundation.layout.r.v(aVar5, Y0.h.j(40)), null, null, null, 0.0f, 0L, interfaceC3540lR, 48, 62);
            if (model.a()) {
                interfaceC3540l2.U(1580466947);
                aVar = aVar5;
                z10 = true;
                f11 = 1.0f;
                f(c8688k.a(aVar, 1.0f, true), C6562a.f52458a.a(interfaceC3540l2, C6562a.f52459b).a().g().i(), true, interfaceC3540l2, 384);
                interfaceC3540l2.J();
                i12 = 0;
            } else {
                aVar = aVar5;
                z10 = true;
                f11 = 1.0f;
                interfaceC3540l2.U(1580701307);
                i12 = 0;
                z.a0.a(c8688k.a(aVar, 1.0f, true), interfaceC3540l2, 0);
                interfaceC3540l2.J();
            }
            interfaceC3540l2.R();
            androidx.compose.ui.e eVarA = z11.a(aVar, f11, z10);
            C0.C cA2 = AbstractC8685h.a(c8680c.b(), aVar3.k(), interfaceC3540l2, 6);
            int iA3 = AbstractC3536j.a(interfaceC3540l2, i12);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540l2.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540l2, eVarA);
            InterfaceC6824a interfaceC6824aA3 = aVar4.a();
            if (interfaceC3540l2.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l2.u();
            if (interfaceC3540l2.o()) {
                interfaceC3540l2.D(interfaceC6824aA3);
            } else {
                interfaceC3540l2.I();
            }
            InterfaceC3540l interfaceC3540lA3 = E1.a(interfaceC3540l2);
            E1.c(interfaceC3540lA3, cA2, aVar4.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar4.g());
            InterfaceC6839p interfaceC6839pB3 = aVar4.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar4.f());
            float f13 = 4;
            z.a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(f13)), interfaceC3540l2, 6);
            s9.d dVarE = model.e();
            interfaceC3540l2.U(-1750113529);
            if (dVarE == null) {
                c8680c2 = c8680c;
                aVar2 = aVar;
            } else {
                C8680c c8680c4 = c8680c;
                C0.C cB2 = z.W.b(c8680c4.n(Y0.h.j(f13)), aVar3.i(), interfaceC3540l2, 54);
                int iA4 = AbstractC3536j.a(interfaceC3540l2, i12);
                InterfaceC3563x interfaceC3563xG4 = interfaceC3540l2.G();
                androidx.compose.ui.e eVarE4 = androidx.compose.ui.c.e(interfaceC3540l2, aVar);
                InterfaceC6824a interfaceC6824aA4 = aVar4.a();
                if (interfaceC3540l2.x() == null) {
                    AbstractC3536j.c();
                }
                interfaceC3540l2.u();
                if (interfaceC3540l2.o()) {
                    interfaceC3540l2.D(interfaceC6824aA4);
                } else {
                    interfaceC3540l2.I();
                }
                InterfaceC3540l interfaceC3540lA4 = E1.a(interfaceC3540l2);
                E1.c(interfaceC3540lA4, cB2, aVar4.e());
                E1.c(interfaceC3540lA4, interfaceC3563xG4, aVar4.g());
                InterfaceC6839p interfaceC6839pB4 = aVar4.b();
                if (interfaceC3540lA4.o() || !AbstractC6492s.d(interfaceC3540lA4.f(), Integer.valueOf(iA4))) {
                    interfaceC3540lA4.K(Integer.valueOf(iA4));
                    interfaceC3540lA4.Q(Integer.valueOf(iA4), interfaceC6839pB4);
                }
                E1.c(interfaceC3540lA4, eVarE4, aVar4.f());
                s9.b bVarO = N9.b.f16117a.O();
                androidx.compose.ui.e eVarV = androidx.compose.foundation.layout.r.v(aVar, Y0.h.j(f10));
                C6562a c6562a3 = C6562a.f52458a;
                int i15 = C6562a.f52459b;
                AbstractC8049c.c(bVarO, eVarV, C6733v0.g(c6562a3.a(interfaceC3540l2, i15).c().a()), null, interfaceC3540l2, 48, 4);
                C3174d c3174dA = AbstractC7930a.a(model.e(), interfaceC3540l2, i12);
                L0.U uA = c6562a3.c(interfaceC3540l2, i15).b().a();
                c8680c2 = c8680c4;
                aVar2 = aVar;
                a1.c(c3174dA, null, c6562a3.a(interfaceC3540l2, i15).f().c(), 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, null, uA, interfaceC3540l2, 0, 3120, 120826);
                interfaceC3540l2.R();
                z.a0.a(androidx.compose.foundation.layout.r.i(aVar2, Y0.h.j(f13)), interfaceC3540l2, 6);
                Yg.J j10 = Yg.J.f24997a;
            }
            interfaceC3540l2.J();
            C3174d c3174dA2 = AbstractC7930a.a(model.g(), interfaceC3540l2, 0);
            C6562a c6562a4 = C6562a.f52458a;
            int i16 = C6562a.f52459b;
            L0.U uB = c6562a4.c(interfaceC3540l2, i16).b().b();
            long jA = c6562a4.a(interfaceC3540l2, i16).f().a();
            t.a aVar6 = W0.t.f23567a;
            a1.c(c3174dA2, null, jA, 0L, null, null, null, 0L, null, null, 0L, aVar6.b(), false, 1, 0, null, null, uB, interfaceC3540l2, 0, 3120, 120826);
            s9.d dVarF = model.f();
            interfaceC3540l2.U(-1750077249);
            if (dVarF == null) {
                i13 = i16;
                c6562a = c6562a4;
            } else {
                z.a0.a(androidx.compose.foundation.layout.r.i(aVar2, Y0.h.j(f13)), interfaceC3540l2, 6);
                i13 = i16;
                c6562a = c6562a4;
                a1.c(AbstractC7930a.a(model.f(), interfaceC3540l2, 0), null, c6562a4.a(interfaceC3540l2, i16).f().c(), 0L, null, null, null, 0L, null, null, 0L, aVar6.b(), false, 1, 0, null, null, c6562a4.c(interfaceC3540l2, i16).b().a(), interfaceC3540l2, 0, 3120, 120826);
                Yg.J j11 = Yg.J.f24997a;
            }
            interfaceC3540l2.J();
            z.a0.a(androidx.compose.foundation.layout.r.i(aVar2, Y0.h.j(f13)), interfaceC3540l2, 6);
            interfaceC3540l2.R();
            C0.C cA3 = AbstractC8685h.a(c8680c2.b(), aVar3.j(), interfaceC3540l2, 54);
            int iA5 = AbstractC3536j.a(interfaceC3540l2, 0);
            InterfaceC3563x interfaceC3563xG5 = interfaceC3540l2.G();
            androidx.compose.ui.e eVarE5 = androidx.compose.ui.c.e(interfaceC3540l2, aVar2);
            InterfaceC6824a interfaceC6824aA5 = aVar4.a();
            if (interfaceC3540l2.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l2.u();
            if (interfaceC3540l2.o()) {
                interfaceC3540l2.D(interfaceC6824aA5);
            } else {
                interfaceC3540l2.I();
            }
            InterfaceC3540l interfaceC3540lA5 = E1.a(interfaceC3540l2);
            E1.c(interfaceC3540lA5, cA3, aVar4.e());
            E1.c(interfaceC3540lA5, interfaceC3563xG5, aVar4.g());
            InterfaceC6839p interfaceC6839pB5 = aVar4.b();
            if (interfaceC3540lA5.o() || !AbstractC6492s.d(interfaceC3540lA5.f(), Integer.valueOf(iA5))) {
                interfaceC3540lA5.K(Integer.valueOf(iA5));
                interfaceC3540lA5.Q(Integer.valueOf(iA5), interfaceC6839pB5);
            }
            E1.c(interfaceC3540lA5, eVarE5, aVar4.f());
            z.a0.a(androidx.compose.foundation.layout.r.i(aVar2, Y0.h.j(f13)), interfaceC3540l2, 6);
            s9.d dVarH = model.h();
            interfaceC3540l2.U(-1750053612);
            if (dVarH == null) {
                i14 = i13;
                c6562a2 = c6562a;
            } else {
                int i17 = i13;
                C6562a c6562a5 = c6562a;
                i14 = i17;
                c6562a2 = c6562a5;
                a1.c(AbstractC7930a.a(model.h(), interfaceC3540l2, 0), null, c6562a5.a(interfaceC3540l2, i17).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a5.c(interfaceC3540l2, i17).b().b(), interfaceC3540l2, 0, 0, 131066);
                Yg.J j12 = Yg.J.f24997a;
            }
            interfaceC3540l2.J();
            s9.d dVarI = model.i();
            interfaceC3540l2.U(-1750045204);
            if (dVarI != null) {
                z.a0.a(androidx.compose.foundation.layout.r.i(aVar2, Y0.h.j(f13)), interfaceC3540l2, 6);
                int i18 = i14;
                C6562a c6562a6 = c6562a2;
                a1.c(AbstractC7930a.a(model.i(), interfaceC3540l2, 0), null, c6562a6.a(interfaceC3540l2, i18).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a6.c(interfaceC3540l2, i18).b().a(), interfaceC3540l2, 0, 0, 131066);
                Yg.J j13 = Yg.J.f24997a;
            }
            interfaceC3540l2.J();
            z.a0.a(androidx.compose.foundation.layout.r.i(aVar2, Y0.h.j(f13)), interfaceC3540l2, 6);
            interfaceC3540l2.R();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.d
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3577e.e(modifier, model, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, C3569a c3569a, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        d(eVar, c3569a, interfaceC3540l, T.L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    private static final void f(final androidx.compose.ui.e eVar, final long j10, final boolean z10, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1563656474);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.j(j10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.c(z10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1563656474, i11, -1, "com.ui.wifiman.ui.signal.components.ArrowConnectionHalf (AccessPointRoamingItem.kt:218)");
            }
            Y0.d dVar = (Y0.d) interfaceC3540lR.t(AbstractC3932k0.g());
            interfaceC3540lR.U(-871804024);
            boolean zT = interfaceC3540lR.T(dVar);
            Object objF = interfaceC3540lR.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C3579f(dVar.getDensity() * 5.0f, dVar.getDensity() * 3.0f, dVar.getDensity() * 1.0f, V0.f52859a.b(new float[]{dVar.getDensity() * 3.5f, dVar.getDensity() * 3.5f}, z10 ? 0.0f : dVar.getDensity() * 3.5f));
                interfaceC3540lR.K(objF);
            }
            final C3579f c3579f = (C3579f) objF;
            interfaceC3540lR.J();
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.r.k(androidx.compose.foundation.layout.r.B(eVar, Y0.h.j(5.0f), 0.0f, 2, null), Y0.h.j(3.0f), 0.0f, 2, null);
            interfaceC3540lR.U(-871778219);
            boolean zL = ((i11 & 112) == 32) | ((i11 & 896) == 256) | interfaceC3540lR.l(c3579f);
            Object objF2 = interfaceC3540lR.f();
            if (zL || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new InterfaceC6835l() { // from class: Te.b
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return AbstractC3577e.g(z10, c3579f, j10, (InterfaceC7039f) obj);
                    }
                };
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            AbstractC7848i.a(eVarK, (InterfaceC6835l) objF2, interfaceC3540lR, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.c
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3577e.h(eVar, j10, z10, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J g(boolean z10, C3579f c3579f, long j10, InterfaceC7039f Canvas) {
        AbstractC6492s.i(Canvas, "$this$Canvas");
        if (z10) {
            U0 u0A = AbstractC6688Y.a();
            u0A.n(C6531g.m(AbstractC6538n.b(Canvas.c())), 0.0f);
            float f10 = 2;
            u0A.u(C6531g.m(AbstractC6538n.b(Canvas.c())) + (c3579f.b() / f10), c3579f.a());
            u0A.u(C6531g.m(AbstractC6538n.b(Canvas.c())) - (c3579f.b() / f10), c3579f.a());
            InterfaceC7039f.R0(Canvas, u0A, new j1(j10, null), 0.0f, null, null, 0, 60, null);
        }
        if (z10) {
            InterfaceC7039f.w1(Canvas, j10, AbstractC6532h.a(C6531g.m(AbstractC6538n.b(Canvas.c())), C6537m.g(Canvas.c())), AbstractC6532h.a(C6531g.m(AbstractC6538n.b(Canvas.c())), c3579f.a()), c3579f.d(), 0, c3579f.c(), 0.0f, null, 0, 464, null);
        } else {
            InterfaceC7039f.w1(Canvas, j10, AbstractC6532h.a(C6531g.m(AbstractC6538n.b(Canvas.c())), 0.0f), AbstractC6532h.a(C6531g.m(AbstractC6538n.b(Canvas.c())), C6537m.g(Canvas.c())), c3579f.d(), 0, c3579f.c(), 0.0f, null, 0, 464, null);
        }
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J h(androidx.compose.ui.e eVar, long j10, boolean z10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        f(eVar, j10, z10, interfaceC3540l, T.L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
