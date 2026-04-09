package Jf;

import C0.C;
import E0.InterfaceC2629g;
import If.EnumC3021a;
import If.L;
import L0.C3174d;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import W0.j;
import Yg.J;
import androidx.compose.foundation.layout.o;
import androidx.compose.ui.e;
import com.ubnt.usurvey.product.l;
import com.ubnt.usurvey.product.r;
import com.ubnt.usurvey.product.s;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import s9.c;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* loaded from: classes4.dex */
public abstract class i {
    public static final void b(final androidx.compose.ui.e modifier, final float f10, final s9.d dVar, final s9.d dVar2, final s9.d dVar3, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        Object obj;
        int i12;
        C6562a c6562a;
        e.a aVar;
        C6562a c6562a2;
        int i13;
        e.a aVar2;
        AbstractC6492s.i(modifier, "modifier");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1350470339);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.g(f10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(dVar) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.T(dVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC3540lR.T(dVar3) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        int i14 = i11;
        if ((i14 & 9363) == 9362 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1350470339, i14, -1, "com.ui.wifiman.ui.wmw.common.WmwStatusPopupProgress (WmwStatusPopupProgress.kt:30)");
            }
            C8680c c8680c = C8680c.f66832a;
            C8680c.f fVarN = c8680c.n(Y0.h.j(16));
            c.a aVar3 = f0.c.f46573a;
            C cA = AbstractC8685h.a(fVarN, aVar3.k(), interfaceC3540lR, 6);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, modifier);
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
            E1.c(interfaceC3540lA, cA, aVar4.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar4.g());
            InterfaceC6839p interfaceC6839pB = aVar4.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar4.f());
            C8688k c8688k = C8688k.f66923a;
            r rVarA = s.a(l.WM_W_d64);
            AbstractC6492s.f(rVarA);
            c.a aVar5 = new c.a(rVarA.a(), null, 2, null);
            e.a aVar6 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar6, 0.0f, 1, null);
            C6562a c6562a3 = C6562a.f52458a;
            int i15 = C6562a.f52459b;
            AbstractC8049c.e(aVar5, androidx.compose.foundation.layout.r.i(o.k(eVarH, 0.0f, c6562a3.d(interfaceC3540lR, i15).a().a().c(), 1, null), L.b(EnumC3021a.FW_UPDATE_PROGRESS)), null, null, null, null, null, 0.0f, null, interfaceC3540lR, 0, 254);
            interfaceC3540lR.U(620778989);
            if (dVar == null) {
                c6562a = c6562a3;
                aVar = aVar6;
                i12 = i15;
                obj = null;
            } else {
                obj = null;
                i12 = i15;
                c6562a = c6562a3;
                aVar = aVar6;
                a1.c(AbstractC7930a.a(dVar, interfaceC3540lR, (i14 >> 6) & 14), androidx.compose.foundation.layout.r.h(aVar6, 0.0f, 1, null), c6562a3.a(interfaceC3540lR, i15).f().a(), 0L, null, null, null, 0L, null, j.h(j.f23523b.a()), 0L, 0, false, 0, 0, null, null, c6562a3.c(interfaceC3540lR, i15).a().d(), interfaceC3540lR, 48, 0, 130552);
                J j10 = J.f24997a;
            }
            interfaceC3540lR.J();
            interfaceC3540lR.U(620789553);
            if (dVar2 == null) {
                i13 = i12;
                c6562a2 = c6562a;
                aVar2 = aVar;
            } else {
                e.a aVar7 = aVar;
                androidx.compose.ui.e eVarH2 = androidx.compose.foundation.layout.r.h(aVar7, 0.0f, 1, obj);
                C3174d c3174dA = AbstractC7930a.a(dVar2, interfaceC3540lR, (i14 >> 9) & 14);
                int i16 = i12;
                C6562a c6562a4 = c6562a;
                c6562a2 = c6562a4;
                i13 = i16;
                aVar2 = aVar7;
                a1.c(c3174dA, eVarH2, c6562a4.a(interfaceC3540lR, i16).f().b(), 0L, null, null, null, 0L, null, j.h(j.f23523b.a()), 0L, 0, false, 0, 0, null, null, c6562a4.c(interfaceC3540lR, i16).b().a(), interfaceC3540lR, 48, 0, 130552);
                J j11 = J.f24997a;
            }
            interfaceC3540lR.J();
            e.a aVar8 = aVar2;
            androidx.compose.ui.e eVarH3 = androidx.compose.foundation.layout.r.h(aVar8, 0.0f, 1, obj);
            C cA2 = AbstractC8685h.a(c8680c.n(Y0.h.j(4)), aVar3.k(), interfaceC3540lR, 6);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarH3);
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
            E1.c(interfaceC3540lA2, cA2, aVar4.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar4.g());
            InterfaceC6839p interfaceC6839pB2 = aVar4.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar4.f());
            E9.d.c(androidx.compose.foundation.layout.r.h(aVar8, 0.0f, 1, obj), f10, null, 0.0f, 0.0f, 0, false, interfaceC3540lR, (i14 & 112) | 6, 124);
            interfaceC3540lR.U(935048122);
            if (dVar3 != null) {
                androidx.compose.ui.e eVarH4 = androidx.compose.foundation.layout.r.h(aVar8, 0.0f, 1, obj);
                C6562a c6562a5 = c6562a2;
                int i17 = i13;
                a1.c(AbstractC7930a.a(dVar3, interfaceC3540lR, (i14 >> 12) & 14), eVarH4, c6562a5.a(interfaceC3540lR, i17).f().b(), 0L, null, null, null, 0L, null, j.h(j.f23523b.f()), 0L, 0, false, 0, 0, null, null, c6562a5.c(interfaceC3540lR, i17).b().f(), interfaceC3540lR, 48, 0, 130552);
                J j12 = J.f24997a;
            }
            interfaceC3540lR.J();
            interfaceC3540lR.R();
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Jf.h
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj2, Object obj3) {
                    return i.c(modifier, f10, dVar, dVar2, dVar3, i10, (InterfaceC3540l) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, float f10, s9.d dVar, s9.d dVar2, s9.d dVar3, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, f10, dVar, dVar2, dVar3, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
