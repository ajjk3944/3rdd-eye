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
import androidx.compose.ui.platform.AbstractC3932k0;
import f0.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s9.d;
import sa.AbstractC7930a;
import sh.AbstractC7978m;
import sh.C7974i;
import z.AbstractC8685h;
import z.AbstractC8696t;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8675A;
import z.W;
import z.Z;

/* loaded from: classes4.dex */
public abstract class m {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f7409a;

        a(k kVar) {
            this.f7409a = kVar;
        }

        public final void a(InterfaceC8675A FlowRow, InterfaceC3540l interfaceC3540l, int i10) {
            pa.b bVarB;
            long jC;
            AbstractC6492s.i(FlowRow, "$this$FlowRow");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1955942484, i10, -1, "com.ui.wifiman.ui.wifi.scan.component.WifiScanNetworkItemExtended.<anonymous>.<anonymous>.<anonymous> (WifiScanNetworkItemExtended.kt:84)");
            }
            C3174d c3174dA = AbstractC7930a.a(this.f7409a.f(), interfaceC3540l, 0);
            if (this.f7409a.d()) {
                interfaceC3540l.U(-256587138);
                bVarB = C6562a.f52458a.c(interfaceC3540l, C6562a.f52459b).a();
            } else {
                interfaceC3540l.U(-256585890);
                bVarB = C6562a.f52458a.c(interfaceC3540l, C6562a.f52459b).b();
            }
            U uA = bVarB.a();
            interfaceC3540l.J();
            if (this.f7409a.g()) {
                interfaceC3540l.U(635908900);
                jC = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).f().c();
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(635833508);
                jC = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).f().a();
                interfaceC3540l.J();
            }
            a1.c(c3174dA, null, jC, 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, null, uA, interfaceC3540l, 0, 3120, 120826);
            Iterator it = this.f7409a.c().iterator();
            while (it.hasNext()) {
                ((De.g) it.next()).c(interfaceC3540l, 0);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8675A) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public static final void b(androidx.compose.ui.e eVar, final k model, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(156141229);
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
        if ((2 & i11) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(156141229, i12, -1, "com.ui.wifiman.ui.wifi.scan.component.WifiScanNetworkItemExtended (WifiScanNetworkItemExtended.kt:56)");
            }
            float f10 = 8;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(eVar3, Y0.h.j(16), Y0.h.j(f10));
            C8680c c8680c = C8680c.f66832a;
            C8680c.f fVarN = c8680c.n(Y0.h.j(f10));
            c.a aVar = f0.c.f46573a;
            C cB = W.b(fVarN, aVar.l(), interfaceC3540lR, 6);
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
            interfaceC3540lR.U(-1205591831);
            Y0.d dVar = (Y0.d) interfaceC3540lR.t(AbstractC3932k0.g());
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            float fS = Y0.h.d(dVar.n0(c6562a.c(interfaceC3540lR, i14).a().a().s())).s();
            interfaceC3540lR.J();
            androidx.compose.ui.e eVarI = androidx.compose.foundation.layout.r.i(aVar3, fS);
            C cH = androidx.compose.foundation.layout.d.h(aVar.e(), false);
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
            E.b(null, model.b(), interfaceC3540lR, 0, 1);
            interfaceC3540lR.R();
            androidx.compose.ui.e eVarC = z10.c(z10.a(aVar3, 1.0f, true), aVar.i());
            float f11 = 4;
            C cA = AbstractC8685h.a(c8680c.n(Y0.h.j(f11)), aVar.k(), interfaceC3540lR, 6);
            int iA3 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540lR, eVarC);
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
            E1.c(interfaceC3540lA3, cA, aVar2.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar2.g());
            InterfaceC6839p interfaceC6839pB3 = aVar2.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            androidx.compose.ui.e eVar4 = eVar3;
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC8696t.a(null, c8680c.n(Y0.h.j(f10)), c8680c.n(Y0.h.j(f11)), 0, 0, null, b0.c.e(-1955942484, true, new a(model), interfaceC3540lR, 54), interfaceC3540lR, 1573296, 57);
            a1.c(AbstractC7930a.a(!model.a().isEmpty() ? new d.b(AbstractC6780c.f53358M4, AbstractC3689v.e(AbstractC3689v.z0(model.a(), ", ", null, null, 0, null, null, 62, null))) : new d.b(AbstractC6780c.f53351L4), interfaceC3540l2, 0), null, c6562a.a(interfaceC3540l2, i14).f().c(), 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, null, c6562a.c(interfaceC3540l2, i14).b().a(), interfaceC3540l2, 0, 3120, 120826);
            interfaceC3540l2.R();
            t.q(z10.c(aVar3, aVar.i()), model.e(), interfaceC3540l2, 0);
            K.b(z10.c(aVar3, aVar.i()), interfaceC3540l2, 0, 0);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar4;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Gf.l
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return m.c(eVar2, model, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, k kVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, kVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    public static final k d(int i10, InterfaceC3540l interfaceC3540l, int i11, int i12) {
        interfaceC3540l.U(-1536230798);
        int i13 = (i12 & 1) != 0 ? 1 : i10;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1536230798, i11, -1, "com.ui.wifiman.ui.wifi.scan.component.previewNetworkItemExtendedModel (WifiScanNetworkItemExtended.kt:128)");
        }
        long jB = C6733v0.f52951b.b();
        d.c cVar = new d.c("Very long SSID, UI WiFi");
        List listO = AbstractC3689v.o(1, 2, 3);
        d.c cVar2 = new d.c("41 dBm");
        C7974i c7974iS = AbstractC7978m.s(0, i13);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(c7974iS, 10));
        Iterator it = c7974iS.iterator();
        while (it.hasNext()) {
            ((Q) it).d();
            arrayList.add(v.a.f740a);
        }
        k kVar = new k(jB, cVar, false, false, listO, arrayList, cVar2, S8.c.GHZ_2_4, null);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return kVar;
    }
}
