package Af;

import De.a;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import la.C6562a;
import m8.AbstractC6780c;
import s9.d;

/* loaded from: classes4.dex */
public final class w implements De.a {

    /* renamed from: a, reason: collision with root package name */
    public static final w f742a = new w();

    private w() {
    }

    @Override // De.a
    public s9.d a() {
        return new d.b(AbstractC6780c.f53575s1);
    }

    @Override // De.a
    public long b(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(1395757076);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1395757076, i10, -1, "com.ui.wifiman.ui.wifi.component.WifiMloBadge.color (WifiMloBadge.kt:15)");
        }
        long j10 = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().j();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return j10;
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
        return this == obj || (obj instanceof w);
    }

    public int hashCode() {
        return 1653900910;
    }

    public String toString() {
        return "WifiMloBadge";
    }
}
