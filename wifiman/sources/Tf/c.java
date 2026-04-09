package tf;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import la.g;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import ra.d;
import s.AbstractC7852m;

/* loaded from: classes4.dex */
public abstract class c {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f62110a;

        a(InterfaceC6839p interfaceC6839p) {
            this.f62110a = interfaceC6839p;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(21861343, i10, -1, "com.ui.wifiman.ui.theme.WifimanTheme.<anonymous> (WifimanTheme.kt:17)");
            }
            this.f62110a.invoke(interfaceC3540l, 0);
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

    public static final void b(boolean z10, d dVar, final InterfaceC6839p content, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        AbstractC6492s.i(content, "content");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-762003833);
        if ((i10 & 6) == 0) {
            i12 = (((i11 & 1) == 0 && interfaceC3540lR.c(z10)) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(dVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.l(content) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            interfaceC3540lR.q();
            if ((i10 & 1) == 0 || interfaceC3540lR.H()) {
                if ((i11 & 1) != 0) {
                    z10 = AbstractC7852m.a(interfaceC3540lR, 0);
                    i12 &= -15;
                }
                if (i13 != 0) {
                    dVar = d.COMPACT;
                }
            } else {
                interfaceC3540lR.C();
                if ((i11 & 1) != 0) {
                    i12 &= -15;
                }
            }
            interfaceC3540lR.S();
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-762003833, i12, -1, "com.ui.wifiman.ui.theme.WifimanTheme (WifimanTheme.kt:12)");
            }
            g.j(z10, dVar, b0.c.e(21861343, true, new a(content), interfaceC3540lR, 54), interfaceC3540lR, (i12 & 14) | 384 | (i12 & 112), 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        final boolean z11 = z10;
        final d dVar2 = dVar;
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: tf.b
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return c.c(z11, dVar2, content, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(boolean z10, d dVar, InterfaceC6839p interfaceC6839p, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(z10, dVar, interfaceC6839p, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
