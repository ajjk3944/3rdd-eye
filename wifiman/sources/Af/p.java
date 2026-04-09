package Af;

import De.a;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import la.C6562a;
import m8.AbstractC6780c;
import s9.d;

/* loaded from: classes4.dex */
public interface p extends De.a {

    public static final class a implements p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f721a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final boolean f722b = true;

        private a() {
        }

        @Override // De.a
        public s9.d a() {
            return new d.b(AbstractC6780c.f53367O);
        }

        @Override // De.a
        public long b(InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(-261842033);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-261842033, i10, -1, "com.ui.wifiman.ui.wifi.component.WifiConnectionStateBadge.Connected.color (WifiConnectionStateBadge.kt:16)");
            }
            long jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().d().f();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return jF;
        }

        @Override // De.a, De.g
        public void c(InterfaceC3540l interfaceC3540l, int i10) {
            b.a(this, interfaceC3540l, i10);
        }

        @Override // De.a
        public boolean d() {
            return f722b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 876881638;
        }

        public String toString() {
            return "Connected";
        }
    }

    public static final class b {
        public static void a(p pVar, InterfaceC3540l interfaceC3540l, int i10) {
            a.C0158a.a(pVar, interfaceC3540l, i10);
        }
    }

    public static final class c implements p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f723a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final boolean f724b = true;

        private c() {
        }

        @Override // De.a
        public s9.d a() {
            return new d.b(AbstractC6780c.f53374P);
        }

        @Override // De.a
        public long b(InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(61853727);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(61853727, i10, -1, "com.ui.wifiman.ui.wifi.component.WifiConnectionStateBadge.Inactive.color (WifiConnectionStateBadge.kt:24)");
            }
            long jD = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().d().d();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return jD;
        }

        @Override // De.a, De.g
        public void c(InterfaceC3540l interfaceC3540l, int i10) {
            b.a(this, interfaceC3540l, i10);
        }

        @Override // De.a
        public boolean d() {
            return f724b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1457109230;
        }

        public String toString() {
            return "Inactive";
        }
    }
}
