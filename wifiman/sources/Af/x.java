package Af;

import De.a;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;

/* loaded from: classes4.dex */
public final class x implements De.a {

    /* renamed from: a, reason: collision with root package name */
    private final S8.j f743a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f744b;

    public x(S8.j security) {
        AbstractC6492s.i(security, "security");
        this.f743a = security;
        this.f744b = y.c(security);
    }

    @Override // De.a
    public s9.d a() {
        return this.f744b;
    }

    @Override // De.a
    public long b(InterfaceC3540l interfaceC3540l, int i10) {
        long jF;
        interfaceC3540l.U(1368155398);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1368155398, i10, -1, "com.ui.wifiman.ui.wifi.component.WifiSecurityBadge.color (WifiSecurityTypeBadge.kt:17)");
        }
        if (this.f743a.b()) {
            interfaceC3540l.U(811871184);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().k().f();
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(811929650);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f();
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jF;
    }

    @Override // De.a, De.g
    public void c(InterfaceC3540l interfaceC3540l, int i10) {
        a.C0158a.a(this, interfaceC3540l, i10);
    }

    @Override // De.a
    public boolean d() {
        return a.C0158a.b(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && AbstractC6492s.d(this.f743a, ((x) obj).f743a);
    }

    public int hashCode() {
        return this.f743a.hashCode();
    }

    public String toString() {
        return "WifiSecurityBadge(security=" + this.f743a + ")";
    }
}
