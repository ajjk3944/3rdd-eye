package C9;

import C9.a;
import C9.i;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s9.d;
import ta.AbstractC8049c;
import z.Y;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2359a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static mh.q f2360b = b0.c.c(-1640057657, false, C0107a.f2366a);

    /* renamed from: c, reason: collision with root package name */
    public static mh.q f2361c = b0.c.c(-777066677, false, b.f2367a);

    /* renamed from: d, reason: collision with root package name */
    public static InterfaceC6839p f2362d = b0.c.c(925965292, false, c.f2368a);

    /* renamed from: e, reason: collision with root package name */
    public static InterfaceC6839p f2363e = b0.c.c(262194027, false, d.f2369a);

    /* renamed from: f, reason: collision with root package name */
    public static InterfaceC6839p f2364f = b0.c.c(-565915968, false, e.f2370a);

    /* renamed from: g, reason: collision with root package name */
    public static InterfaceC6839p f2365g = b0.c.c(980152448, false, f.f2371a);

    /* renamed from: C9.a$a, reason: collision with other inner class name */
    static final class C0107a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final C0107a f2366a = new C0107a();

        C0107a() {
        }

        public final void a(Y Button, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(Button, "$this$Button");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1640057657, i10, -1, "com.ui.core.ui.component.notifications.ComposableSingletons$UiNotificationsKt.lambda-1.<anonymous> (UiNotifications.kt:378)");
            }
            AbstractC8049c.c(N9.b.f16117a.u(), androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(20)), C6733v0.g(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().i()), null, interfaceC3540l, 48, 4);
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

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final b f2367a = new b();

        b() {
        }

        public final void a(Y UiNotificationBase, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiNotificationBase, "$this$UiNotificationBase");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-777066677, i10, -1, "com.ui.core.ui.component.notifications.ComposableSingletons$UiNotificationsKt.lambda-2.<anonymous> (UiNotifications.kt:504)");
            }
            AbstractC8049c.c(N9.b.f16117a.d(), androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(20)), C6733v0.g(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().i()), null, interfaceC3540l, 48, 4);
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

    static final class c implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f2368a = new c();

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
                AbstractC3546o.Q(925965292, i10, -1, "com.ui.core.ui.component.notifications.ComposableSingletons$UiNotificationsKt.lambda-3.<anonymous> (UiNotifications.kt:535)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            i iVar = new i("", N9.b.f16117a.A().f(AbstractC8049c.g(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f(), "blue")), new d.c("Update available and the message is too long"), new i.a.b(new d.c("Update")), null, 16, null);
            interfaceC3540l.U(1470737727);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: C9.b
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return a.c.c();
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            s.u(aVar, iVar, (InterfaceC6824a) objF, null, interfaceC3540l, 390, 8);
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

    static final class d implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final d f2369a = new d();

        d() {
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
                AbstractC3546o.Q(262194027, i10, -1, "com.ui.core.ui.component.notifications.ComposableSingletons$UiNotificationsKt.lambda-4.<anonymous> (UiNotifications.kt:552)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            d.c cVar = new d.c("Main Entrance Updated");
            N9.b bVar = N9.b.f16117a;
            s9.b bVarU = bVar.u();
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            i iVar = new i("", bVar.M().f(AbstractC8049c.g(c6562a.a(interfaceC3540l, i11).a().b().f(), "blue")), cVar, new i.a.C0108a(bVarU.f(AbstractC8049c.g(c6562a.a(interfaceC3540l, i11).a().g().i(), "grey"))), null, 16, null);
            interfaceC3540l.U(-1316652736);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: C9.c
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return a.d.c();
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            s.u(aVar, iVar, (InterfaceC6824a) objF, null, interfaceC3540l, 390, 8);
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

    static final class e implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final e f2370a = new e();

        e() {
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
                AbstractC3546o.Q(-565915968, i10, -1, "com.ui.core.ui.component.notifications.ComposableSingletons$UiNotificationsKt.lambda-5.<anonymous> (UiNotifications.kt:577)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            i iVar = new i("", N9.b.f16117a.M().f(AbstractC8049c.g(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f(), "blue")), new d.c("Main Entrance Updated"), null, null, 24, null);
            interfaceC3540l.U(190915041);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: C9.d
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return a.e.c();
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            s.u(aVar, iVar, (InterfaceC6824a) objF, null, interfaceC3540l, 390, 8);
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

    static final class f implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final f f2371a = new f();

        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J e() {
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J f() {
            return J.f24997a;
        }

        public final void c(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(980152448, i10, -1, "com.ui.core.ui.component.notifications.ComposableSingletons$UiNotificationsKt.lambda-6.<anonymous> (UiNotifications.kt:596)");
            }
            i iVar = new i("", N9.b.f16117a.A().f(AbstractC8049c.g(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f(), "blue")), new d.c("Expandable notification usually will contain longer message that takes at least two lines"), new i.a.b(new d.c("Notification Action Button")), null, 16, null);
            interfaceC3540l.U(1698490306);
            Object objF = interfaceC3540l.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = new InterfaceC6824a() { // from class: C9.e
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return a.f.e();
                    }
                };
                interfaceC3540l.K(objF);
            }
            InterfaceC6824a interfaceC6824a = (InterfaceC6824a) objF;
            interfaceC3540l.J();
            interfaceC3540l.U(1698491298);
            Object objF2 = interfaceC3540l.f();
            if (objF2 == aVar.a()) {
                objF2 = new InterfaceC6824a() { // from class: C9.f
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return a.f.f();
                    }
                };
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            s.i(null, iVar, interfaceC6824a, (InterfaceC6824a) objF2, false, false, null, interfaceC3540l, 28032, 97);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            c((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public final mh.q a() {
        return f2360b;
    }
}
