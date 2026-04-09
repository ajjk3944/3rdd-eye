package com.ui.wifiman.ui.settings.preferences;

import L9.L;
import Li.P;
import Li.z;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import com.ui.wifiman.ui.settings.preferences.k;
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
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f44685a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static mh.q f44686b = b0.c.c(-983390493, false, a.f44688a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6839p f44687c = b0.c.c(353627613, false, b.f44691a);

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f44688a = new a();

        /* renamed from: com.ui.wifiman.ui.settings.preferences.k$a$a, reason: collision with other inner class name */
        static final class C1586a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC8511f.b f44689a;

            /* renamed from: com.ui.wifiman.ui.settings.preferences.k$a$a$a, reason: collision with other inner class name */
            static final class C1587a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC8511f.b f44690a;

                C1587a(InterfaceC8511f.b bVar) {
                    this.f44690a = bVar;
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
                        AbstractC3546o.Q(898967829, i10, -1, "com.ui.wifiman.ui.settings.preferences.ComposableSingletons$UnitSystemConfigUiKt.lambda-1.<anonymous>.<anonymous>.<anonymous> (UnitSystemConfigUi.kt:41)");
                    }
                    d.b bVar = new d.b(AbstractC6780c.f53468d);
                    interfaceC3540l.U(1604113554);
                    boolean zT = interfaceC3540l.T(this.f44690a);
                    final InterfaceC8511f.b bVar2 = this.f44690a;
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.settings.preferences.j
                            @Override // mh.InterfaceC6824a
                            public final Object invoke() {
                                return k.a.C1586a.C1587a.c(bVar2);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    He.i.c(null, (InterfaceC6824a) objF, false, bVar, interfaceC3540l, 0, 5);
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

            C1586a(InterfaceC8511f.b bVar) {
                this.f44689a = bVar;
            }

            public final void a(Y ModalToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(ModalToolbar, "$this$ModalToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-733945732, i10, -1, "com.ui.wifiman.ui.settings.preferences.ComposableSingletons$UnitSystemConfigUiKt.lambda-1.<anonymous>.<anonymous> (UnitSystemConfigUi.kt:40)");
                }
                L.b(null, b0.c.e(898967829, true, new C1587a(this.f44689a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
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
                AbstractC3546o.Q(-983390493, i10, -1, "com.ui.wifiman.ui.settings.preferences.ComposableSingletons$UnitSystemConfigUiKt.lambda-1.<anonymous> (UnitSystemConfigUi.kt:36)");
            }
            Fe.j.c(null, new d.b(AbstractC6780c.f53573s), null, null, b0.c.e(-733945732, true, new C1586a((InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K())), interfaceC3540l, 54), 0L, interfaceC3540l, 24576, 45);
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
        public static final b f44691a = new b();

        public static final class a extends u {

            /* renamed from: g, reason: collision with root package name */
            private final z f44692g = P.a(T7.c.METRIC);

            a() {
            }

            @Override // org.kodein.di.c
            public DI d() {
                throw new IllegalStateException();
            }

            @Override // com.ui.wifiman.ui.settings.preferences.u
            public void o0(T7.c system) {
                AbstractC6492s.i(system, "system");
            }

            @Override // com.ui.wifiman.ui.settings.preferences.u
            /* renamed from: p0, reason: merged with bridge method [inline-methods] */
            public z n0() {
                return this.f44692g;
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
                AbstractC3546o.Q(353627613, i10, -1, "com.ui.wifiman.ui.settings.preferences.ComposableSingletons$UnitSystemConfigUiKt.lambda-2.<anonymous> (UnitSystemConfigUi.kt:101)");
            }
            x.b(null, new a(), interfaceC3540l, 0, 1);
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
        return f44686b;
    }
}
