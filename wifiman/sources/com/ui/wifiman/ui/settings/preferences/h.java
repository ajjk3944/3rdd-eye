package com.ui.wifiman.ui.settings.preferences;

import L9.L;
import L9.z;
import Li.P;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import com.ui.wifiman.ui.settings.preferences.h;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.kodein.di.DI;
import s9.d;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import z.InterfaceC8687j;
import z.Y;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f44668a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static mh.q f44669b = b0.c.c(2088863498, false, a.f44672a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6839p f44670c = b0.c.c(-1584444044, false, b.f44675a);

    /* renamed from: d, reason: collision with root package name */
    public static InterfaceC6839p f44671d = b0.c.c(-344869152, false, c.f44677a);

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f44672a = new a();

        /* renamed from: com.ui.wifiman.ui.settings.preferences.h$a$a, reason: collision with other inner class name */
        static final class C1584a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC8511f.b f44673a;

            /* renamed from: com.ui.wifiman.ui.settings.preferences.h$a$a$a, reason: collision with other inner class name */
            static final class C1585a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC8511f.b f44674a;

                C1585a(InterfaceC8511f.b bVar) {
                    this.f44674a = bVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J c(InterfaceC8511f.b bVar) {
                    bVar.a();
                    return J.f24997a;
                }

                public final void b(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1415498344, i10, -1, "com.ui.wifiman.ui.settings.preferences.ComposableSingletons$DirectConsoleConnectionExplanationUiKt.lambda-1.<anonymous>.<anonymous>.<anonymous> (DirectConsoleConnectionExplanationUi.kt:51)");
                    }
                    s9.b bVarG = N9.b.f16117a.s().g(new d.b(AbstractC6780c.f53557p4));
                    interfaceC3540l.U(-559139174);
                    boolean zT = interfaceC3540l.T(this.f44674a);
                    final InterfaceC8511f.b bVar = this.f44674a;
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.settings.preferences.g
                            @Override // mh.InterfaceC6824a
                            public final Object invoke() {
                                return h.a.C1584a.C1585a.c(bVar);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    z.c(bVarG, null, 0L, false, (InterfaceC6824a) objF, interfaceC3540l, 0, 14);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    b((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            C1584a(InterfaceC8511f.b bVar) {
                this.f44673a = bVar;
            }

            public final void a(Y ModalToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(ModalToolbar, "$this$ModalToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1972038191, i10, -1, "com.ui.wifiman.ui.settings.preferences.ComposableSingletons$DirectConsoleConnectionExplanationUiKt.lambda-1.<anonymous>.<anonymous> (DirectConsoleConnectionExplanationUi.kt:50)");
                }
                L.b(null, b0.c.e(-1415498344, true, new C1585a(this.f44673a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
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

        a() {
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2088863498, i10, -1, "com.ui.wifiman.ui.settings.preferences.ComposableSingletons$DirectConsoleConnectionExplanationUiKt.lambda-1.<anonymous> (DirectConsoleConnectionExplanationUi.kt:44)");
            }
            Fe.j.c(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), new d.b(AbstractC6780c.f53409U), null, null, b0.c.e(-1972038191, true, new C1584a((InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K())), interfaceC3540l, 54), 0L, interfaceC3540l, 24582, 44);
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

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f44675a = new b();

        public static final class a extends l {

            /* renamed from: g, reason: collision with root package name */
            private final Li.z f44676g = P.a("192.168.1.1");

            a() {
            }

            @Override // org.kodein.di.c
            public DI d() {
                throw new IllegalStateException();
            }

            @Override // com.ui.wifiman.ui.settings.preferences.l
            /* renamed from: o0, reason: merged with bridge method [inline-methods] */
            public Li.z n0() {
                return this.f44676g;
            }
        }

        b() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1584444044, i10, -1, "com.ui.wifiman.ui.settings.preferences.ComposableSingletons$DirectConsoleConnectionExplanationUiKt.lambda-2.<anonymous> (DirectConsoleConnectionExplanationUi.kt:101)");
            }
            n.b(new a(), interfaceC3540l, 0, 0);
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

    static final class c implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f44677a = new c();

        public static final class a extends l {

            /* renamed from: g, reason: collision with root package name */
            private final Li.z f44678g = P.a(null);

            a() {
            }

            @Override // org.kodein.di.c
            public DI d() {
                throw new IllegalStateException();
            }

            @Override // com.ui.wifiman.ui.settings.preferences.l
            /* renamed from: o0, reason: merged with bridge method [inline-methods] */
            public Li.z n0() {
                return this.f44678g;
            }
        }

        c() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-344869152, i10, -1, "com.ui.wifiman.ui.settings.preferences.ComposableSingletons$DirectConsoleConnectionExplanationUiKt.lambda-3.<anonymous> (DirectConsoleConnectionExplanationUi.kt:112)");
            }
            n.b(new a(), interfaceC3540l, 0, 0);
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
        return f44669b;
    }
}
