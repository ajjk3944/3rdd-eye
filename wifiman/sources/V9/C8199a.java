package v9;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import la.C6562a;

/* renamed from: v9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8199a {

    /* renamed from: a, reason: collision with root package name */
    public static final C8199a f63525a = new C8199a();

    private C8199a() {
    }

    public final long a(float f10, InterfaceC3540l interfaceC3540l, int i10) {
        long jF;
        interfaceC3540l.U(-2082581440);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-2082581440, i10, -1, "com.ui.core.ui.component.battery.UiBatteryStatus.levelColor (UiBatteryStatus.kt:31)");
        }
        if (f10 >= 0.3f) {
            interfaceC3540l.U(647804046);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().d().f();
            interfaceC3540l.J();
        } else if (f10 >= 0.15f) {
            interfaceC3540l.U(647805838);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().h().f();
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(647807214);
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
