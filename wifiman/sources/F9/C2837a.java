package F9;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import mh.InterfaceC6839p;

/* renamed from: F9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2837a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2837a f6152a = new C2837a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f6153b = b0.c.c(-903176250, false, C0243a.f6154a);

    /* renamed from: F9.a$a, reason: collision with other inner class name */
    static final class C0243a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C0243a f6154a = new C0243a();

        C0243a() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-903176250, i10, -1, "com.ui.core.ui.component.settings.ComposableSingletons$UiSettingsCardKt.lambda-1.<anonymous> (UiSettingsCard.kt:40)");
            }
            AbstractC2859x.e(interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public final InterfaceC6839p a() {
        return f6153b;
    }
}
