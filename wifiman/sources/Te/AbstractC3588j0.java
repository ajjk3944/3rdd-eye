package Te;

import E0.InterfaceC2629g;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.X0;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.C8680c;

/* renamed from: Te.j0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3588j0 {
    public static final void c(androidx.compose.ui.e eVar, final s9.d text, final InterfaceC6824a onClicked, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        androidx.compose.ui.e eVar3;
        AbstractC6492s.i(text, "text");
        AbstractC6492s.i(onClicked, "onClicked");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1345988441);
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
            i12 |= interfaceC3540lR.T(text) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.l(onClicked) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
        } else {
            eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1345988441, i12, -1, "com.ui.wifiman.ui.signal.components.SignalTabApComparisonButton (SignalTabApComparisonButton.kt:26)");
            }
            interfaceC3540lR.U(-1426754512);
            boolean z10 = (i12 & 896) == 256;
            Object objF = interfaceC3540lR.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: Te.h0
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return AbstractC3588j0.d(onClicked);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            androidx.compose.ui.e eVarD = androidx.compose.foundation.d.d(eVar3, false, null, null, (InterfaceC6824a) objF, 7, null);
            C0.C cB = z.W.b(C8680c.f66832a.n(Y0.h.j(4)), f0.c.f46573a.i(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarD);
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
            z.Z z11 = z.Z.f66823a;
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarA = z11.a(aVar2, 1.0f, false);
            String strB = AbstractC7930a.b(text, interfaceC3540lR, (i12 >> 3) & 14);
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            a1.b(strB, eVarA, c6562a.a(interfaceC3540lR, i14).a().j(), 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, c6562a.c(interfaceC3540lR, i14).b().a(), interfaceC3540lR, 0, 3120, 55288);
            AbstractC8049c.c(N9.b.f16117a.e(), androidx.compose.foundation.layout.r.v(aVar2, Y0.h.j(20)), C6733v0.g(c6562a.a(interfaceC3540lR, i14).a().j()), null, interfaceC3540lR, 48, 4);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            final androidx.compose.ui.e eVar4 = eVar3;
            x0Z.a(new InterfaceC6839p() { // from class: Te.i0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3588j0.e(eVar4, text, onClicked, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d(InterfaceC6824a interfaceC6824a) {
        interfaceC6824a.invoke();
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, s9.d dVar, InterfaceC6824a interfaceC6824a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, dVar, interfaceC6824a, interfaceC3540l, T.L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
