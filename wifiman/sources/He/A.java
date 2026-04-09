package He;

import L9.T;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import of.C7125a;
import org.conscrypt.PSKKeyManager;
import sa.AbstractC7930a;

/* loaded from: classes4.dex */
public abstract class A {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s9.d f7825a;

        a(s9.d dVar) {
            this.f7825a = dVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1312144910, i10, -1, "com.ui.wifiman.ui.component.toolbar.WifimanToolbar.<anonymous> (WifimanToolbar.kt:22)");
            }
            s9.d dVar = this.f7825a;
            if (dVar != null) {
                T.b(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), 0, 0, 0L, AbstractC7930a.b(dVar, interfaceC3540l, 0), interfaceC3540l, 6, 14);
            }
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

    public static final void b(androidx.compose.ui.e eVar, final C7125a.c accountVM, s9.d dVar, mh.q qVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        AbstractC6492s.i(accountVM, "accountVM");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-958047012);
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
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.T(dVar) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i15 = i11 & 8;
        if (i15 != 0) {
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
                dVar = null;
            }
            if (i15 != 0) {
                qVar = C2919c.f7841a.a();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-958047012, i12, -1, "com.ui.wifiman.ui.component.toolbar.WifimanToolbar (WifimanToolbar.kt:17)");
            }
            m.b(eVar, accountVM, b0.c.e(-1312144910, true, new a(dVar), interfaceC3540lR, 54), qVar, interfaceC3540lR, (i12 & 14) | 384 | (i12 & 112) | (i12 & 7168), 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        final androidx.compose.ui.e eVar2 = eVar;
        final s9.d dVar2 = dVar;
        final mh.q qVar2 = qVar;
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: He.z
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return A.c(eVar2, accountVM, dVar2, qVar2, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, C7125a.c cVar, s9.d dVar, mh.q qVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, cVar, dVar, qVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
