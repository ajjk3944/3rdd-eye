package Gf;

import Af.v;
import Be.E;
import C0.C;
import E0.InterfaceC2629g;
import Ee.K;
import L0.C3174d;
import L0.U;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Yg.J;
import Zg.AbstractC3689v;
import Zg.Q;
import androidx.compose.ui.e;
import f0.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import s9.d;
import sa.AbstractC7930a;
import sh.AbstractC7978m;
import sh.C7974i;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.W;
import z.Y;
import z.Z;
import z.a0;

/* loaded from: classes4.dex */
public abstract class t {

    static final class a implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s9.d f7431a;

        a(s9.d dVar) {
            this.f7431a = dVar;
        }

        public final void a(float f10, float f11, InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.g(f10) ? 4 : 2;
            }
            if ((i10 & 131) == 130 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1771219444, i10, -1, "com.ui.wifiman.ui.wifi.scan.component.WifiScanNetworkItemTextSignalWithMinimalWidth.<anonymous> (WifiScanNetworkItem.kt:127)");
            }
            t.o(androidx.compose.foundation.layout.r.u(androidx.compose.ui.e.f28771b0, f10, 0.0f, 2, null), this.f7431a, interfaceC3540l, 0, 0);
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

    public static final void g(final androidx.compose.ui.e modifier, final j model, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1817840600);
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
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1817840600, i11, -1, "com.ui.wifiman.ui.wifi.scan.component.WifiScanNetworkItemMultiLine (WifiScanNetworkItem.kt:176)");
            }
            float f10 = 8;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(androidx.compose.foundation.layout.r.b(modifier, 0.0f, Y0.h.j(48), 1, null), Y0.h.j(16), Y0.h.j(f10));
            c.a aVar = f0.c.f46573a;
            c.InterfaceC1752c interfaceC1752cI = aVar.i();
            C8680c c8680c = C8680c.f66832a;
            C cB = W.b(c8680c.n(Y0.h.j(f10)), interfaceC1752cI, interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarJ);
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
            E1.c(interfaceC3540lA, cB, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            Z z10 = Z.f66823a;
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarB = Y.b(z10, aVar3, 1.0f, false, 2, null);
            C cA = AbstractC8685h.a(c8680c.g(), aVar.k(), interfaceC3540lR, 0);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarB);
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
            E1.c(interfaceC3540lA2, cA, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            i(null, model, interfaceC3540lR, i11 & 112, 1);
            a0.a(androidx.compose.foundation.layout.r.i(aVar3, Y0.h.j(2)), interfaceC3540lR, 6);
            m(androidx.compose.foundation.layout.o.m(aVar3, Y0.h.j(Y0.h.j(f10) + Y0.h.j(f10)), 0.0f, 0.0f, 0.0f, 14, null), new d.c(AbstractC3689v.z0(model.a(), ", ", null, null, 0, null, null, 62, null)), interfaceC3540lR, 6);
            interfaceC3540lR.R();
            q(aVar3, model.f(), interfaceC3540lR, 6);
            K.b(z10.c(aVar3, aVar.i()), interfaceC3540lR, 0, 0);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Gf.r
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return t.h(modifier, model, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(androidx.compose.ui.e eVar, j jVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        g(eVar, jVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    public static final void i(androidx.compose.ui.e eVar, final j model, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        pa.b bVarB;
        long jD;
        final androidx.compose.ui.e eVar3;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-798624153);
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
            i12 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar4 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-798624153, i12, -1, "com.ui.wifiman.ui.wifi.scan.component.WifiScanNetworkItemNameAndBadges (WifiScanNetworkItem.kt:55)");
            }
            C cB = W.b(C8680c.f66832a.n(Y0.h.j(8)), f0.c.f46573a.i(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar4);
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
            E1.c(interfaceC3540lA, cB, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            Z z10 = Z.f66823a;
            E.b(null, model.b(), interfaceC3540lR, 0, 1);
            androidx.compose.ui.e eVarA = z10.a(androidx.compose.ui.e.f28771b0, 1.0f, false);
            C3174d c3174dA = AbstractC7930a.a(model.g(), interfaceC3540lR, 0);
            if (model.e()) {
                interfaceC3540lR.U(-1323312545);
                bVarB = C6562a.f52458a.c(interfaceC3540lR, C6562a.f52459b).a();
            } else {
                interfaceC3540lR.U(-1323311297);
                bVarB = C6562a.f52458a.c(interfaceC3540lR, C6562a.f52459b).b();
            }
            U uA = bVarB.a();
            interfaceC3540lR.J();
            if (model.c()) {
                interfaceC3540lR.U(1927134355);
                jD = C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).f().d();
                interfaceC3540lR.J();
            } else {
                interfaceC3540lR.U(1927074835);
                jD = C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).f().a();
                interfaceC3540lR.J();
            }
            eVar3 = eVar4;
            a1.c(c3174dA, eVarA, jD, 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, null, uA, interfaceC3540lR, 0, 3120, 120824);
            interfaceC3540l2 = interfaceC3540lR;
            interfaceC3540l2.U(-1323302639);
            Iterator it = model.d().iterator();
            while (it.hasNext()) {
                ((De.g) it.next()).c(interfaceC3540l2, 0);
            }
            interfaceC3540l2.J();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Gf.o
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return t.j(eVar3, model, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(androidx.compose.ui.e eVar, j jVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        i(eVar, jVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    public static final void k(final androidx.compose.ui.e modifier, final j model, final u config, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        AbstractC6492s.i(config, "config");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1682613585);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(config) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1682613585, i11, -1, "com.ui.wifiman.ui.wifi.scan.component.WifiScanNetworkItemSingleLine (WifiScanNetworkItem.kt:140)");
            }
            float f10 = 8;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(androidx.compose.foundation.layout.r.b(modifier, 0.0f, Y0.h.j(48), 1, null), Y0.h.j(16), Y0.h.j(f10));
            c.a aVar = f0.c.f46573a;
            C cB = W.b(C8680c.f66832a.n(Y0.h.j(f10)), aVar.i(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarJ);
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
            E1.c(interfaceC3540lA, cB, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            Z z10 = Z.f66823a;
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            i(z10.a(aVar3, 1.0f, true), model, interfaceC3540lR, i11 & 112, 0);
            m(androidx.compose.foundation.layout.r.z(aVar3, config.a()), new d.c(AbstractC3689v.z0(model.a(), ", ", null, null, 0, null, null, 62, null)), interfaceC3540lR, 0);
            o(androidx.compose.foundation.layout.r.z(aVar3, config.b()), model.f(), interfaceC3540lR, 0, 0);
            K.b(z10.c(aVar3, aVar.i()), interfaceC3540lR, 0, 0);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Gf.s
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return t.l(modifier, model, config, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J l(androidx.compose.ui.e eVar, j jVar, u uVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        k(eVar, jVar, uVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    public static final void m(final androidx.compose.ui.e modifier, final s9.d value, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(value, "value");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1412026049);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(value) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1412026049, i12, -1, "com.ui.wifiman.ui.wifi.scan.component.WifiScanNetworkItemTextChannels (WifiScanNetworkItem.kt:91)");
            }
            C3174d c3174dA = AbstractC7930a.a(value, interfaceC3540lR, (i12 >> 3) & 14);
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(c3174dA, modifier, c6562a.a(interfaceC3540lR, i13).f().b(), 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, null, c6562a.c(interfaceC3540lR, i13).b().a(), interfaceC3540l2, (i12 << 3) & 112, 3120, 120824);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Gf.q
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return t.n(modifier, value, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J n(androidx.compose.ui.e eVar, s9.d dVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        m(eVar, dVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    public static final void o(androidx.compose.ui.e eVar, final s9.d value, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(value, "value");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1494322327);
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
            i12 |= interfaceC3540lR.T(value) ? 32 : 16;
        }
        int i14 = i12;
        if ((i14 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1494322327, i14, -1, "com.ui.wifiman.ui.wifi.scan.component.WifiScanNetworkItemTextSignal (WifiScanNetworkItem.kt:106)");
            }
            C3174d c3174dA = AbstractC7930a.a(value, interfaceC3540lR, (i14 >> 3) & 14);
            C6562a c6562a = C6562a.f52458a;
            int i15 = C6562a.f52459b;
            U uC = c6562a.c(interfaceC3540lR, i15).b().c();
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(c3174dA, eVar3, c6562a.a(interfaceC3540lR, i15).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, uC, interfaceC3540l2, (i14 << 3) & 112, 3072, 122872);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar3;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Gf.p
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return t.p(eVar2, value, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J p(androidx.compose.ui.e eVar, s9.d dVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        o(eVar, dVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    public static final void q(final androidx.compose.ui.e modifier, final s9.d value, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(value, "value");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(717462558);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(value) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(717462558, i11, -1, "com.ui.wifiman.ui.wifi.scan.component.WifiScanNetworkItemTextSignalWithMinimalWidth (WifiScanNetworkItem.kt:120)");
            }
            qa.d.d(modifier, Gf.a.f7359a.a(), b0.c.e(1771219444, true, new a(value), interfaceC3540lR, 54), interfaceC3540lR, (i11 & 14) | 432);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Gf.n
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return t.r(modifier, value, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J r(androidx.compose.ui.e eVar, s9.d dVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        q(eVar, dVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    public static final j s(int i10, InterfaceC3540l interfaceC3540l, int i11, int i12) {
        interfaceC3540l.U(1364175495);
        if ((i12 & 1) != 0) {
            i10 = 1;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1364175495, i11, -1, "com.ui.wifiman.ui.wifi.scan.component.previewNetworkListItem (WifiScanNetworkItem.kt:214)");
        }
        long jB = C6733v0.f52951b.b();
        d.c cVar = new d.c("Very long SSID, UI WiFi long long long");
        List listO = AbstractC3689v.o(1, 2, 3);
        d.c cVar2 = new d.c("41 dBm");
        C7974i c7974iS = AbstractC7978m.s(0, i10);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(c7974iS, 10));
        Iterator it = c7974iS.iterator();
        while (it.hasNext()) {
            ((Q) it).d();
            arrayList.add(v.a.f740a);
        }
        j jVar = new j(jB, cVar, false, false, listO, arrayList, cVar2, null);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jVar;
    }
}
