package mf;

import C0.C;
import E0.InterfaceC2629g;
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
import W0.t;
import Y0.h;
import Yg.J;
import androidx.compose.foundation.layout.o;
import androidx.compose.ui.e;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mf.AbstractC6818a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.W;
import z.Z;

/* renamed from: mf.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6821d {
    public static final void c(final e modifier, final AbstractC6818a.C1959a server, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(server, "server");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-710004126);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(server) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-710004126, i11, -1, "com.ui.wifiman.ui.speedtest.server.card.InternetSpeedServerPickerCardServer (InternetSpeedServerPickerCardServer.kt:26)");
            }
            d(modifier, server.d(), server.c(), server.b(), server.a(), interfaceC3540lR, i11 & 14);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: mf.b
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6821d.e(modifier, server, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void d(final e modifier, final s9.d title, final s9.d subtitle, final boolean z10, final boolean z11, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        pa.b bVarB;
        int i12;
        C6562a c6562a;
        pa.b bVarB2;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(title, "title");
        AbstractC6492s.i(subtitle, "subtitle");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-284032973);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(title) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(subtitle) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.c(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC3540lR.c(z11) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        int i13 = i11;
        if ((i13 & 9363) == 9362 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-284032973, i13, -1, "com.ui.wifiman.ui.speedtest.server.card.InternetSpeedServerPickerCardServer (InternetSpeedServerPickerCardServer.kt:41)");
            }
            float f10 = 16;
            e eVarJ = o.j(modifier, h.j(f10), h.j(12));
            C8680c c8680c = C8680c.f66832a;
            C8680c.f fVarN = c8680c.n(h.j(f10));
            c.a aVar = f0.c.f46573a;
            C cB = W.b(fVarN, aVar.i(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarJ);
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
            e eVarA = Z.f66823a.a(e.f28771b0, 1.0f, true);
            C cA = AbstractC8685h.a(c8680c.n(h.j(4)), aVar.k(), interfaceC3540lR, 6);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarA);
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
            C3174d c3174dA = AbstractC7930a.a(title, interfaceC3540lR, (i13 >> 3) & 14);
            if (z10) {
                interfaceC3540lR.U(-1265066108);
                bVarB = C6562a.f52458a.c(interfaceC3540lR, C6562a.f52459b).a();
            } else {
                interfaceC3540lR.U(-1265064796);
                bVarB = C6562a.f52458a.c(interfaceC3540lR, C6562a.f52459b).b();
            }
            U uB = bVarB.b();
            interfaceC3540lR.J();
            C6562a c6562a2 = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            long jA = c6562a2.a(interfaceC3540lR, i14).f().a();
            t.a aVar3 = t.f23567a;
            a1.c(c3174dA, null, jA, 0L, null, null, null, 0L, null, null, 0L, aVar3.b(), false, 1, 0, null, null, uB, interfaceC3540lR, 0, 3120, 120826);
            C3174d c3174dA2 = AbstractC7930a.a(subtitle, interfaceC3540lR, (i13 >> 6) & 14);
            if (z10) {
                interfaceC3540lR.U(-1265055965);
                i12 = i14;
                c6562a = c6562a2;
                bVarB2 = c6562a.c(interfaceC3540lR, i12).a();
            } else {
                i12 = i14;
                c6562a = c6562a2;
                interfaceC3540lR.U(-1265054685);
                bVarB2 = c6562a.c(interfaceC3540lR, i12).b();
            }
            U uF = bVarB2.f();
            interfaceC3540lR.J();
            int i15 = i12;
            C6562a c6562a3 = c6562a;
            a1.c(c3174dA2, null, c6562a.a(interfaceC3540lR, i12).f().c(), 0L, null, null, null, 0L, null, null, 0L, aVar3.b(), false, 1, 0, null, null, uF, interfaceC3540lR, 0, 3120, 120826);
            interfaceC3540lR.R();
            interfaceC3540l2 = interfaceC3540lR;
            interfaceC3540l2.U(-1791769786);
            if (z11) {
                AbstractC8049c.c(N9.b.f16117a.p(), null, C6733v0.g(c6562a3.a(interfaceC3540l2, i15).a().b().f()), null, interfaceC3540l2, 0, 5);
            }
            interfaceC3540l2.J();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: mf.c
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6821d.f(modifier, title, subtitle, z10, z11, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(e eVar, AbstractC6818a.C1959a c1959a, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        c(eVar, c1959a, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(e eVar, s9.d dVar, s9.d dVar2, boolean z10, boolean z11, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        d(eVar, dVar, dVar2, z10, z11, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
