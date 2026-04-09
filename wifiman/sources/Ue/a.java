package Ue;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22380a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f22381b = b0.c.c(-1388015349, false, C0829a.f22382a);

    /* renamed from: Ue.a$a, reason: collision with other inner class name */
    static final class C0829a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C0829a f22382a = new C0829a();

        C0829a() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1388015349, i10, -1, "com.ui.wifiman.ui.signal.floorplan.component.ComposableSingletons$ComposeFloorplanPreviewKt.lambda-1.<anonymous> (ComposeFloorplanPreview.kt:38)");
            }
            androidx.compose.foundation.layout.d.a(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), interfaceC3540l, 6);
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
        return f22381b;
    }
}
