package A9;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import androidx.compose.foundation.layout.r;
import la.C6562a;
import mh.InterfaceC6839p;
import z9.AbstractC8722b;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f549a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f550b = b0.c.c(-1386454479, false, C0014a.f551a);

    /* renamed from: A9.a$a, reason: collision with other inner class name */
    static final class C0014a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C0014a f551a = new C0014a();

        C0014a() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1386454479, i10, -1, "com.ui.core.ui.component.layout.ComposableSingletons$UiColumnWithDividersKt.lambda-1.<anonymous> (UiColumnWithDividers.kt:19)");
            }
            AbstractC8722b.b(r.D(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), null, false, 3, null), C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).b(), Y0.h.j(1), Y0.h.j(16), 0.0f, interfaceC3540l, 3462, 16);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public final InterfaceC6839p a() {
        return f550b;
    }
}
