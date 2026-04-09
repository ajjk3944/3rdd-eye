package Te;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import mh.InterfaceC6835l;
import s9.d;
import sa.AbstractC7930a;

/* loaded from: classes4.dex */
public abstract class A0 {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f21593a;

        a(Map map) {
            this.f21593a = map;
        }

        public final String a(String it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(-2142909989);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2142909989, i10, -1, "com.ui.wifiman.ui.signal.components.SignalTabSignalTypePicker.<anonymous> (SignalTabSignalTypePicker.kt:46)");
            }
            gc.c cVar = (gc.c) this.f21593a.get(it);
            s9.d dVarH = cVar != null ? A0.h(cVar) : null;
            String strB = dVarH != null ? AbstractC7930a.b(dVarH, interfaceC3540l, 0) : null;
            if (strB == null) {
                strB = "";
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

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21594a;

        static {
            int[] iArr = new int[gc.c.values().length];
            try {
                iArr[gc.c.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gc.c.CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21594a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.e r9, final Te.x0 r10, final mh.InterfaceC6835l r11, T.InterfaceC3540l r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Te.A0.c(androidx.compose.ui.e, Te.x0, mh.l, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d(Map map, InterfaceC6835l interfaceC6835l, String it) {
        AbstractC6492s.i(it, "it");
        gc.c cVar = (gc.c) map.get(it);
        if (cVar != null) {
            interfaceC6835l.invoke(cVar);
        }
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, x0 x0Var, InterfaceC6835l interfaceC6835l, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, x0Var, interfaceC6835l, interfaceC3540l, T.L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    private static final String g(gc.c cVar) {
        String strName;
        return (cVar == null || (strName = cVar.name()) == null) ? "all" : strName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s9.d h(gc.c cVar) {
        int i10 = b.f21594a[cVar.ordinal()];
        if (i10 == 1) {
            return new d.b(AbstractC6780c.f53524l);
        }
        if (i10 == 2) {
            return new d.b(AbstractC6780c.f53510j);
        }
        throw new NoWhenBranchMatchedException();
    }
}
