package He;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import com.ui.wifiman.ui.component.network.AbstractC5209g;
import com.ui.wifiman.ui.component.network.C5205c;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import of.AbstractC7130f;
import of.C7125a;
import z.Y;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f7844a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static mh.q f7845b = b0.c.c(-322443548, false, a.f7847a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6839p f7846c = b0.c.c(2057958243, false, b.f7848a);

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7847a = new a();

        a() {
        }

        public final void a(Y y10, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(y10, "<this>");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-322443548, i10, -1, "com.ui.wifiman.ui.component.toolbar.ComposableSingletons$WifimanToolbarNetworkKt.lambda-1.<anonymous> (WifimanToolbarNetwork.kt:23)");
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7848a = new b();

        b() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2057958243, i10, -1, "com.ui.wifiman.ui.component.toolbar.ComposableSingletons$WifimanToolbarNetworkKt.lambda-2.<anonymous> (WifimanToolbarNetwork.kt:48)");
            }
            C.b(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), AbstractC7130f.l(C7125a.f55657a, null, null, null, null, 15, null), AbstractC5209g.i(C5205c.f44468a), null, interfaceC3540l, 6, 8);
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

    public final mh.q a() {
        return f7845b;
    }
}
