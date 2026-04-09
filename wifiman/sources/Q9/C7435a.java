package q9;

import Li.P;
import Li.z;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import dh.InterfaceC5380e;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import q9.C7435a;
import s9.d;
import ta.AbstractC8049c;

/* renamed from: q9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7435a {

    /* renamed from: a, reason: collision with root package name */
    public static final C7435a f58486a = new C7435a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f58487b = b0.c.c(-141464468, false, C2058a.f58490a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6839p f58488c = b0.c.c(-83593799, false, b.f58491a);

    /* renamed from: d, reason: collision with root package name */
    public static InterfaceC6839p f58489d = b0.c.c(1303904181, false, c.f58497a);

    /* renamed from: q9.a$a, reason: collision with other inner class name */
    static final class C2058a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C2058a f58490a = new C2058a();

        C2058a() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-141464468, i10, -1, "com.ui.core.ui.account.ComposableSingletons$UiAccountPickerScreenKt.lambda-1.<anonymous> (UiAccountPickerScreen.kt:145)");
            }
            AbstractC8049c.c(N9.b.f16117a.E(), androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(20)), C6733v0.g(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().l().f()), null, interfaceC3540l, 48, 4);
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

    /* renamed from: q9.a$b */
    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f58491a = new b();

        /* renamed from: q9.a$b$a, reason: collision with other inner class name */
        public static final class C2059a implements InterfaceC7443i {

            /* renamed from: a, reason: collision with root package name */
            private final z f58492a = P.a(new d.c("Your Accounts"));

            /* renamed from: b, reason: collision with root package name */
            private final z f58493b = P.a(o.m());

            /* renamed from: c, reason: collision with root package name */
            private final z f58494c = P.a(EnumC7442h.DEFAULT);

            /* renamed from: d, reason: collision with root package name */
            private final z f58495d = P.a(new d.c("Done"));

            /* renamed from: e, reason: collision with root package name */
            private final z f58496e = P.a(new d.c("Add Account"));

            C2059a() {
            }

            @Override // q9.InterfaceC7443i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public z a() {
                return this.f58493b;
            }

            @Override // q9.InterfaceC7443i
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public z w() {
                return this.f58495d;
            }

            @Override // q9.InterfaceC7443i
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public z x() {
                return this.f58496e;
            }

            @Override // q9.InterfaceC7443i
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public z C() {
                return this.f58494c;
            }

            @Override // q9.InterfaceC7443i
            public Object f(C7441g c7441g, InterfaceC5380e interfaceC5380e) {
                return J.f24997a;
            }

            @Override // q9.InterfaceC7443i
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public z getTitle() {
                return this.f58492a;
            }

            @Override // q9.InterfaceC7443i
            public Object o(InterfaceC5380e interfaceC5380e) {
                return J.f24997a;
            }

            @Override // q9.InterfaceC7443i
            public Object s(C7441g c7441g, InterfaceC5380e interfaceC5380e) {
                return J.f24997a;
            }

            @Override // q9.InterfaceC7443i
            public Object u(InterfaceC5380e interfaceC5380e) {
                return J.f24997a;
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
                AbstractC3546o.Q(-83593799, i10, -1, "com.ui.core.ui.account.ComposableSingletons$UiAccountPickerScreenKt.lambda-2.<anonymous> (UiAccountPickerScreen.kt:248)");
            }
            C2059a c2059a = new C2059a();
            interfaceC3540l.U(-1091696363);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: q9.b
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return C7435a.b.c();
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            o.f(c2059a, (InterfaceC6824a) objF, interfaceC3540l, 48);
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

    /* renamed from: q9.a$c */
    static final class c implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f58497a = new c();

        /* renamed from: q9.a$c$a, reason: collision with other inner class name */
        public static final class C2060a implements InterfaceC7443i {

            /* renamed from: a, reason: collision with root package name */
            private final z f58498a = P.a(new d.c("Your Accounts"));

            /* renamed from: b, reason: collision with root package name */
            private final z f58499b = P.a(o.m());

            /* renamed from: c, reason: collision with root package name */
            private final z f58500c = P.a(EnumC7442h.EDIT);

            /* renamed from: d, reason: collision with root package name */
            private final z f58501d = P.a(new d.c("Done"));

            /* renamed from: e, reason: collision with root package name */
            private final z f58502e = P.a(new d.c("Add Account"));

            C2060a() {
            }

            @Override // q9.InterfaceC7443i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public z a() {
                return this.f58499b;
            }

            @Override // q9.InterfaceC7443i
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public z w() {
                return this.f58501d;
            }

            @Override // q9.InterfaceC7443i
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public z x() {
                return this.f58502e;
            }

            @Override // q9.InterfaceC7443i
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public z C() {
                return this.f58500c;
            }

            @Override // q9.InterfaceC7443i
            public Object f(C7441g c7441g, InterfaceC5380e interfaceC5380e) {
                return J.f24997a;
            }

            @Override // q9.InterfaceC7443i
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public z getTitle() {
                return this.f58498a;
            }

            @Override // q9.InterfaceC7443i
            public Object o(InterfaceC5380e interfaceC5380e) {
                return J.f24997a;
            }

            @Override // q9.InterfaceC7443i
            public Object s(C7441g c7441g, InterfaceC5380e interfaceC5380e) {
                return J.f24997a;
            }

            @Override // q9.InterfaceC7443i
            public Object u(InterfaceC5380e interfaceC5380e) {
                return J.f24997a;
            }
        }

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
                AbstractC3546o.Q(1303904181, i10, -1, "com.ui.core.ui.account.ComposableSingletons$UiAccountPickerScreenKt.lambda-3.<anonymous> (UiAccountPickerScreen.kt:271)");
            }
            C2060a c2060a = new C2060a();
            interfaceC3540l.U(415889718);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: q9.c
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return C7435a.c.c();
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            o.f(c2060a, (InterfaceC6824a) objF, interfaceC3540l, 48);
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
        return f58487b;
    }
}
