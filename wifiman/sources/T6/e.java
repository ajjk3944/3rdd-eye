package T6;

import S6.k;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import Zg.AbstractC3689v;
import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import m0.J0;
import mh.InterfaceC6839p;
import mh.q;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes3.dex */
public abstract class e {
    public static final void d(final a aVar, final androidx.compose.ui.e modifier, final k imageOptions, final Throwable th2, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(aVar, "<this>");
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(imageOptions, "imageOptions");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(334390494);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(imageOptions) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.l(th2) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(334390494, i11, -1, "com.skydoves.landscapist.components.ComposeFailureStatePlugins (ImageComponentExtensions.kt:75)");
            }
            List listA = aVar instanceof f ? ((f) aVar).a() : AbstractC3689v.l();
            ArrayList arrayList = new ArrayList();
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                it.next();
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                AbstractC5487d.a(it2.next());
                throw null;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: T6.b
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return e.e(aVar, modifier, imageOptions, th2, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(a aVar, androidx.compose.ui.e eVar, k kVar, Throwable th2, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        d(aVar, eVar, kVar, th2, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    public static final void f(final a aVar, final androidx.compose.ui.e modifier, final k imageOptions, final q executor, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(aVar, "<this>");
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(imageOptions, "imageOptions");
        AbstractC6492s.i(executor, "executor");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1603288356);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(imageOptions) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.l(executor) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1603288356, i11, -1, "com.skydoves.landscapist.components.ComposeLoadingStatePlugins (ImageComponentExtensions.kt:43)");
            }
            List listA = aVar instanceof f ? ((f) aVar).a() : AbstractC3689v.l();
            ArrayList arrayList = new ArrayList();
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                it.next();
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                AbstractC5487d.a(it2.next());
                throw null;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: T6.d
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return e.g(aVar, modifier, imageOptions, executor, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(a aVar, androidx.compose.ui.e eVar, k kVar, q qVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        f(aVar, eVar, kVar, qVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    public static final void h(final a aVar, final androidx.compose.ui.e modifier, final Object obj, final k imageOptions, final J0 j02, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(aVar, "<this>");
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(imageOptions, "imageOptions");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1998038945);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(obj) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.T(imageOptions) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC3540lR.l(j02) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        if ((i11 & 9363) == 9362 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1998038945, i11, -1, "com.skydoves.landscapist.components.ComposeSuccessStatePlugins (ImageComponentExtensions.kt:57)");
            }
            List listA = aVar instanceof f ? ((f) aVar).a() : AbstractC3689v.l();
            ArrayList arrayList = new ArrayList();
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                it.next();
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                AbstractC5487d.a(it2.next());
                throw null;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: T6.c
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj2, Object obj3) {
                    return e.i(aVar, modifier, obj, imageOptions, j02, i10, (InterfaceC3540l) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i(a aVar, androidx.compose.ui.e eVar, Object obj, k kVar, J0 j02, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        h(aVar, eVar, obj, kVar, j02, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
