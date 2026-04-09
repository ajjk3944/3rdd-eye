package Af;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public abstract class E {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f650a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B f651b;

        a(Map map, B b10) {
            this.f650a = map;
            this.f651b = b10;
        }

        public final String a(String it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(471456907);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(471456907, i10, -1, "com.ui.wifiman.ui.wifi.component.WifiSpectrumPicker.<anonymous> (WifiSpectrumPicker.kt:46)");
            }
            S8.c cVar = (S8.c) this.f650a.get(it);
            Map mapA = this.f651b.a();
            Integer num = mapA != null ? (Integer) mapA.get(new C6556a(cVar)) : null;
            interfaceC3540l.U(-1330830509);
            String strB = num != null ? Ne.h.b(cVar, num.intValue(), interfaceC3540l, 0) : null;
            interfaceC3540l.J();
            if (strB == null) {
                strB = Ne.h.a(cVar, interfaceC3540l, 0);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return strB;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((String) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.e r9, final Af.B r10, final mh.InterfaceC6835l r11, T.InterfaceC3540l r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Af.E.c(androidx.compose.ui.e, Af.B, mh.l, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d(InterfaceC6835l interfaceC6835l, Map map, String it) {
        AbstractC6492s.i(it, "it");
        interfaceC6835l.invoke(map.get(it));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, B b10, InterfaceC6835l interfaceC6835l, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, b10, interfaceC6835l, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    private static final String f(S8.c cVar) {
        String strName;
        return (cVar == null || (strName = cVar.name()) == null) ? "all" : strName;
    }
}
