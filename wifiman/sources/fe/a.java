package Fe;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import androidx.compose.foundation.layout.r;
import kotlin.jvm.internal.AbstractC6492s;
import mh.q;
import z.InterfaceC8687j;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6482a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static q f6483b = b0.c.c(1265235473, false, C0255a.f6484a);

    /* renamed from: Fe.a$a, reason: collision with other inner class name */
    static final class C0255a implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final C0255a f6484a = new C0255a();

        C0255a() {
        }

        public final void a(InterfaceC8687j interfaceC8687j, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(interfaceC8687j, "<this>");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1265235473, i10, -1, "com.ui.wifiman.ui.component.modal.ComposableSingletons$ModalScaffoldKt.lambda-1.<anonymous> (ModalScaffold.kt:23)");
            }
            j.c(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), null, null, null, null, 0L, interfaceC3540l, 6, 62);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public final q a() {
        return f6483b;
    }
}
