package De;

import T.AbstractC3546o;
import T.InterfaceC3540l;

/* loaded from: classes4.dex */
public interface a extends g {

    /* renamed from: De.a$a, reason: collision with other inner class name */
    public static final class C0158a {
        public static void a(a aVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(-544481747);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-544481747, i10, -1, "com.ui.wifiman.ui.component.label.Badge.Compose (Badge.kt:28)");
            }
            s9.d dVarA = aVar.a();
            c.b(aVar.b(interfaceC3540l, i10 & 14), aVar.d(), dVarA, interfaceC3540l, 0, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
        }

        public static boolean b(a aVar) {
            return false;
        }
    }

    s9.d a();

    long b(InterfaceC3540l interfaceC3540l, int i10);

    @Override // De.g
    void c(InterfaceC3540l interfaceC3540l, int i10);

    boolean d();
}
