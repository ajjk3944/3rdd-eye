package He;

import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Yg.J;
import androidx.compose.ui.e;
import com.ui.wifiman.ui.component.network.AbstractC5209g;
import com.ui.wifiman.ui.component.network.C5205c;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import of.C7125a;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes4.dex */
public abstract class C {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5205c.b f7832a;

        a(C5205c.b bVar) {
            this.f7832a = bVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1278202401, i10, -1, "com.ui.wifiman.ui.component.toolbar.WifimanNetworkConnectionToolbar.<anonymous> (WifimanToolbarNetwork.kt:29)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarF = androidx.compose.foundation.layout.r.f(aVar, 0.0f, 1, null);
            f0.c cVarE = f0.c.f46573a.e();
            C5205c.b bVar = this.f7832a;
            C0.C cH = androidx.compose.foundation.layout.d.h(cVarE, false);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarF);
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
            E1.c(interfaceC3540lA, cH, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            AbstractC5209g.e(androidx.compose.foundation.layout.r.d(aVar, 0.0f, 1, null), bVar, interfaceC3540l, 6, 0);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public static final void b(androidx.compose.ui.e eVar, final C7125a.c accountVM, final C5205c.b networkConnectionVM, mh.q qVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        AbstractC6492s.i(accountVM, "accountVM");
        AbstractC6492s.i(networkConnectionVM, "networkConnectionVM");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1097108363);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(accountVM) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.T(networkConnectionVM) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i14 = i11 & 8;
        if (i14 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC3540lR.l(qVar) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (i14 != 0) {
                qVar = d.f7844a.a();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1097108363, i12, -1, "com.ui.wifiman.ui.component.toolbar.WifimanNetworkConnectionToolbar (WifimanToolbarNetwork.kt:24)");
            }
            m.b(eVar, accountVM, b0.c.e(1278202401, true, new a(networkConnectionVM), interfaceC3540lR, 54), qVar, interfaceC3540lR, (i12 & 14) | 384 | (i12 & 112) | (i12 & 7168), 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        final androidx.compose.ui.e eVar2 = eVar;
        final mh.q qVar2 = qVar;
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: He.B
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return C.c(eVar2, accountVM, networkConnectionVM, qVar2, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, C7125a.c cVar, C5205c.b bVar, mh.q qVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, cVar, bVar, qVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
