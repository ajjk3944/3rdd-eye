package com.ui.wifiman.ui.settings.preferences;

import L9.L;
import L9.z;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s9.d;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import z.InterfaceC8687j;
import z.Y;

/* loaded from: classes4.dex */
public abstract class s {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8511f.b f44706a;

        /* renamed from: com.ui.wifiman.ui.settings.preferences.s$a$a, reason: collision with other inner class name */
        static final class C1592a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC8511f.b f44707a;

            /* renamed from: com.ui.wifiman.ui.settings.preferences.s$a$a$a, reason: collision with other inner class name */
            static final class C1593a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC8511f.b f44708a;

                /* renamed from: com.ui.wifiman.ui.settings.preferences.s$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1594a extends C6490p implements InterfaceC6824a {
                    C1594a(Object obj) {
                        super(0, obj, InterfaceC8511f.b.class, "navigateBack", "navigateBack()V", 0);
                    }

                    public final void a() {
                        ((InterfaceC8511f.b) this.receiver).a();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return J.f24997a;
                    }
                }

                C1593a(InterfaceC8511f.b bVar) {
                    this.f44708a = bVar;
                }

                public final void a(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(730658287, i10, -1, "com.ui.wifiman.ui.settings.preferences.TeleportQuickActionExplanationRemoveUi.<anonymous>.<anonymous>.<anonymous> (TeleportQuickActionExplanationRemoveUi.kt:41)");
                    }
                    s9.b bVarG = N9.b.f16117a.s().g(new d.b(AbstractC6780c.f53557p4));
                    InterfaceC8511f.b bVar = this.f44708a;
                    interfaceC3540l.U(-1642399250);
                    boolean zT = interfaceC3540l.T(bVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C1594a(bVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    z.c(bVarG, null, 0L, false, (InterfaceC6824a) ((th.g) objF), interfaceC3540l, 0, 14);
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

            C1592a(InterfaceC8511f.b bVar) {
                this.f44707a = bVar;
            }

            public final void a(Y ModalToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(ModalToolbar, "$this$ModalToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1528189976, i10, -1, "com.ui.wifiman.ui.settings.preferences.TeleportQuickActionExplanationRemoveUi.<anonymous>.<anonymous> (TeleportQuickActionExplanationRemoveUi.kt:40)");
                }
                L.b(null, b0.c.e(730658287, true, new C1593a(this.f44707a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
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

        a(InterfaceC8511f.b bVar) {
            this.f44706a = bVar;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1168028385, i10, -1, "com.ui.wifiman.ui.settings.preferences.TeleportQuickActionExplanationRemoveUi.<anonymous> (TeleportQuickActionExplanationRemoveUi.kt:35)");
            }
            Fe.j.c(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), new d.b(AbstractC6780c.f53427W3), null, null, b0.c.e(-1528189976, true, new C1592a(this.f44706a), interfaceC3540l, 54), 0L, interfaceC3540l, 24582, 44);
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

    public static final void b(InterfaceC3540l interfaceC3540l, final int i10) {
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-2046803609);
        if (i10 == 0 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2046803609, i10, -1, "com.ui.wifiman.ui.settings.preferences.TeleportQuickActionExplanationRemoveUi (TeleportQuickActionExplanationRemoveUi.kt:30)");
            }
            Fe.g.b(null, C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).e().b(), b0.c.e(1168028385, true, new a((InterfaceC8511f.b) interfaceC3540lR.t(AbstractC8460B.K())), interfaceC3540lR, 54), false, 0.0f, i.f44679a.a(), interfaceC3540lR, 196992, 25);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.settings.preferences.r
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return s.c(i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
