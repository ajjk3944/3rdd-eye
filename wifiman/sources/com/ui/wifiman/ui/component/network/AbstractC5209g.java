package com.ui.wifiman.ui.component.network;

import E0.InterfaceC2629g;
import L0.C3174d;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.o1;
import androidx.compose.ui.e;
import com.ui.wifiman.ui.component.network.C5205c;
import j0.AbstractC6234e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.kodein.di.DI;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.C8680c;

/* renamed from: com.ui.wifiman.ui.component.network.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5209g {

    /* renamed from: com.ui.wifiman.ui.component.network.g$a */
    public static final class a extends C5205c.b {

        /* renamed from: g, reason: collision with root package name */
        private final Li.z f44494g = Li.P.a(new C5205c.a.d("WiFiman SSID", S8.l.f20404f.a(-70)));

        a() {
        }

        @Override // org.kodein.di.c
        public DI d() {
            throw new IllegalStateException();
        }

        @Override // com.ui.wifiman.ui.component.network.C5205c.b
        public void o0() {
        }

        @Override // com.ui.wifiman.ui.component.network.C5205c.b
        /* renamed from: p0, reason: merged with bridge method [inline-methods] */
        public Li.z n0() {
            return this.f44494g;
        }
    }

    private static final void d(androidx.compose.ui.e eVar, final C5205c.a aVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1767771833);
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
            i12 |= interfaceC3540lR.T(aVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1767771833, i12, -1, "com.ui.wifiman.ui.component.network.NetworkConnectionInfo (NetworkConnectionInfo.kt:128)");
            }
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(eVar3, Y0.h.j(16), 0.0f, 2, null);
            C0.C cB = z.W.b(C8680c.f66832a.n(Y0.h.j(8)), f0.c.f46573a.i(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarK);
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
            z.Z z10 = z.Z.f66823a;
            s9.b bVarA = aVar.a();
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            AbstractC8049c.c(bVarA, androidx.compose.foundation.layout.r.v(aVar3, Y0.h.j(20)), C6733v0.g(aVar.c(interfaceC3540lR, (i12 >> 3) & 14)), null, interfaceC3540lR, 48, 4);
            C3174d c3174dA = AbstractC7930a.a(aVar.b(), interfaceC3540lR, 0);
            int iF = W0.j.f23523b.f();
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            long jA = c6562a.a(interfaceC3540lR, i14).f().a();
            androidx.compose.ui.e eVar4 = eVar3;
            int iB = W0.t.f23567a.b();
            L0.U uB = c6562a.c(interfaceC3540lR, i14).a().b();
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(c3174dA, aVar3, jA, 0L, null, null, null, 0L, null, W0.j.h(iF), 0L, iB, false, 1, 0, null, null, uB, interfaceC3540l2, 48, 3120, 120312);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar4;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.component.network.f
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC5209g.h(eVar2, aVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void e(androidx.compose.ui.e eVar, final C5205c.b networkInfoVm, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        final androidx.compose.ui.e eVar3;
        AbstractC6492s.i(networkInfoVm, "networkInfoVm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1585569947);
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
            i12 |= interfaceC3540lR.T(networkInfoVm) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
        } else {
            eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1585569947, i12, -1, "com.ui.wifiman.ui.component.network.NetworkConnectionInfo (NetworkConnectionInfo.kt:113)");
            }
            C5205c.a aVar = (C5205c.a) o1.b(networkInfoVm.n0(), null, interfaceC3540lR, 0, 1).getValue();
            if (aVar != null) {
                androidx.compose.ui.e eVarA = AbstractC6234e.a(eVar3, E.h.d(C6562a.f52458a.b(interfaceC3540lR, C6562a.f52459b).b().a()));
                interfaceC3540lR.U(-962923701);
                boolean z10 = (i12 & 112) == 32;
                Object objF = interfaceC3540lR.f();
                if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.component.network.d
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return AbstractC5209g.f(networkInfoVm);
                        }
                    };
                    interfaceC3540lR.K(objF);
                }
                interfaceC3540lR.J();
                d(androidx.compose.foundation.d.d(eVarA, false, null, null, (InterfaceC6824a) objF, 7, null), aVar, interfaceC3540lR, 0, 0);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.component.network.e
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC5209g.g(eVar3, networkInfoVm, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J f(C5205c.b bVar) {
        bVar.o0();
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J g(androidx.compose.ui.e eVar, C5205c.b bVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(eVar, bVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J h(androidx.compose.ui.e eVar, C5205c.a aVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        d(eVar, aVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    public static final C5205c.b i(C5205c c5205c) {
        AbstractC6492s.i(c5205c, "<this>");
        return new a();
    }
}
