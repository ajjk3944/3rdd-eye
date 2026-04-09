package He;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import Yg.J;
import mh.InterfaceC6839p;
import of.C7125a;

/* loaded from: classes4.dex */
public abstract class m {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7125a.c f7869a;

        a(C7125a.c cVar) {
            this.f7869a = cVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1863415624, i10, -1, "com.ui.wifiman.ui.component.toolbar.WifimanToolbarBase.<anonymous> (WifimanToolbarBase.kt:22)");
            }
            k.b(androidx.compose.ui.e.f28771b0, this.f7869a, interfaceC3540l, 6, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.e r21, final of.C7125a.c r22, mh.InterfaceC6839p r23, mh.q r24, T.InterfaceC3540l r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: He.m.b(androidx.compose.ui.e, of.a$c, mh.p, mh.q, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, C7125a.c cVar, InterfaceC6839p interfaceC6839p, mh.q qVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, cVar, interfaceC6839p, qVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
