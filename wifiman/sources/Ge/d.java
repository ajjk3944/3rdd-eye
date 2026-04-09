package Ge;

import Ge.d;
import L0.C3174d;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import android.content.Context;
import androidx.compose.foundation.layout.r;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import s9.d;
import ta.AbstractC8049c;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f7333a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f7334b = b0.c.c(-830933815, false, a.f7337a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6839p f7335c = b0.c.c(-1352512350, false, b.f7338a);

    /* renamed from: d, reason: collision with root package name */
    public static InterfaceC6839p f7336d = b0.c.c(-1018609881, false, c.f7340a);

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7337a = new a();

        a() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-830933815, i10, -1, "com.ui.wifiman.ui.component.notification.ComposableSingletons$ApRoamingNotificationKt.lambda-1.<anonymous> (ApRoamingNotification.kt:90)");
            }
            AbstractC8049c.c(N9.b.f16117a.t(), null, C6733v0.g(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).c().a()), null, interfaceC3540l, 0, 5);
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

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7338a = new b();

        static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            public static final a f7339a = new a();

            a() {
            }

            public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(it, "it");
                interfaceC3540l.U(2024402878);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(2024402878, i10, -1, "com.ui.wifiman.ui.component.notification.ComposableSingletons$ApRoamingNotificationKt.lambda-2.<anonymous>.<anonymous> (ApRoamingNotification.kt:108)");
                }
                C3174d.a aVar = new C3174d.a(0, 1, null);
                aVar.append(Ne.f.h(S8.l.f20404f.a(-30), true, null, 2, null).a(it, interfaceC3540l, i10 & 14));
                aVar.i(" ");
                aVar.i("Channel 48");
                aVar.i(" ");
                aVar.i("5240 MHz");
                C3174d c3174dP = aVar.p();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return c3174dP;
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c() {
            return J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1352512350, i10, -1, "com.ui.wifiman.ui.component.notification.ComposableSingletons$ApRoamingNotificationKt.lambda-2.<anonymous> (ApRoamingNotification.kt:101)");
            }
            androidx.compose.ui.e eVarH = r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            Ge.a aVar = new Ge.a("", new d.c("Access Point Roaming"), new d.c("UDM → Cellular"), new d.a("", a.f7339a));
            interfaceC3540l.U(1303388542);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: Ge.e
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return d.b.c();
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            Ge.c.b(eVarH, aVar, (InterfaceC6824a) objF, interfaceC3540l, 390);
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

    static final class c implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7340a = new c();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c() {
            return J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1018609881, i10, -1, "com.ui.wifiman.ui.component.notification.ComposableSingletons$ApRoamingNotificationKt.lambda-3.<anonymous> (ApRoamingNotification.kt:128)");
            }
            androidx.compose.ui.e eVarH = r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            Ge.a aVar = new Ge.a("", new d.c("Access Point Disconnected"), new d.c("UDM → Disconnected"), null);
            interfaceC3540l.U(-1484011777);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: Ge.f
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return d.c.c();
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            Ge.c.b(eVarH, aVar, (InterfaceC6824a) objF, interfaceC3540l, 438);
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
        return f7334b;
    }
}
