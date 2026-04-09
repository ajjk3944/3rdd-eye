package Se;

import L9.AbstractC3198d;
import L9.E;
import Se.b;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import androidx.compose.foundation.layout.r;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import z.j0;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f20544a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f20545b = b0.c.c(-1020837522, false, a.f20546a);

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f20546a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(InterfaceC8511f.b bVar) {
            bVar.a();
            return J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1020837522, i10, -1, "com.ui.wifiman.ui.settings.dev.ComposableSingletons$DevPreferencesUiKt.lambda-1.<anonymous> (DevPreferencesUi.kt:38)");
            }
            final InterfaceC8511f.b bVar = (InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K());
            androidx.compose.ui.e eVarC = j0.c(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null));
            AbstractC3198d.a aVar = AbstractC3198d.a.f11402b;
            interfaceC3540l.U(1500103497);
            boolean zT = interfaceC3540l.T(bVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: Se.a
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return b.a.c(bVar);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            E.i(eVarC, "Dev Settings", aVar, (InterfaceC6824a) objF, null, 0L, 0L, 0L, 0.0f, null, 0.0f, interfaceC3540l, (AbstractC3198d.a.f11403c << 6) | 48, 0, 2032);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public final InterfaceC6839p a() {
        return f20545b;
    }
}
