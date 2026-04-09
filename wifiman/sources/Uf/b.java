package uf;

import H0.f;
import L0.C3174d;
import L0.D;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import la.C6562a;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f62937a = new b();

    private b() {
    }

    public final C3174d a(String ip, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        AbstractC6492s.i(ip, "ip");
        interfaceC3540l.U(-1441664141);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1441664141, i11, -1, "com.ui.wifiman.ui.ubiquiti.console.DirectConsoleConnectionPopupUi.getTextWithIPHighlighted (DirectConsoleConnectionPopupUi.kt:46)");
        }
        C3174d.a aVar = new C3174d.a(0, 1, null);
        String str = String.format(f.a(i10, interfaceC3540l, (i11 >> 3) & 14), Arrays.copyOf(new Object[]{ip}, 1));
        AbstractC6492s.h(str, "format(...)");
        aVar.i(str);
        int iK0 = t.k0(str, ip, 0, false, 6, null);
        interfaceC3540l.U(248518177);
        if (iK0 != -1) {
            aVar.c(new D(0L, 0L, C6562a.f52458a.c(interfaceC3540l, C6562a.f52459b).a().a().o(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null), iK0, ip.length() + iK0);
        }
        interfaceC3540l.J();
        C3174d c3174dP = aVar.p();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return c3174dP;
    }
}
