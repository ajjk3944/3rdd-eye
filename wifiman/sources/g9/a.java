package G9;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6839p;
import ta.AbstractC8049c;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7208a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f7209b = b0.c.c(-635864684, false, C0292a.f7210a);

    /* renamed from: G9.a$a, reason: collision with other inner class name */
    static final class C0292a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C0292a f7210a = new C0292a();

        C0292a() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-635864684, i10, -1, "com.ui.core.ui.component.settings.widget.ComposableSingletons$UiSettingsWidgetClearTextActionKt.lambda-1.<anonymous> (UiSettingsWidgetClearTextAction.kt:46)");
            }
            AbstractC8049c.c(N9.b.f16117a.t(), null, C6733v0.g(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().j()), null, interfaceC3540l, 0, 5);
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
        return f7209b;
    }
}
