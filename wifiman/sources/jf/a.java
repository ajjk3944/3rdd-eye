package Jf;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import la.C6562a;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10046a = new a();

    private a() {
    }

    public final long a(float f10, InterfaceC3540l interfaceC3540l, int i10) {
        long jF;
        interfaceC3540l.U(1671704818);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1671704818, i10, -1, "com.ui.wifiman.ui.wmw.common.WmwBatteryStatus.levelColor (WmwBatteryStatus.kt:49)");
        }
        if (f10 >= 0.3f) {
            interfaceC3540l.U(259174623);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().d().f();
            interfaceC3540l.J();
        } else if (f10 >= 0.15f) {
            interfaceC3540l.U(259176415);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().h().f();
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(259177791);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().l().f();
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jF;
    }
}
