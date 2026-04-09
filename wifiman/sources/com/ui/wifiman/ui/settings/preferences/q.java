package com.ui.wifiman.ui.settings.preferences;

import Be.v0;
import C0.C;
import E0.InterfaceC2629g;
import L9.L;
import L9.z;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import Yg.J;
import android.content.res.Resources;
import androidx.compose.ui.e;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s9.d;
import ta.AbstractC8049c;
import xe.InterfaceC8511f;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.Y;
import z.a0;

/* loaded from: classes4.dex */
public abstract class q {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8511f.b f44700a;

        /* renamed from: com.ui.wifiman.ui.settings.preferences.q$a$a, reason: collision with other inner class name */
        static final class C1588a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC8511f.b f44701a;

            /* renamed from: com.ui.wifiman.ui.settings.preferences.q$a$a$a, reason: collision with other inner class name */
            static final class C1589a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC8511f.b f44702a;

                /* renamed from: com.ui.wifiman.ui.settings.preferences.q$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1590a extends C6490p implements InterfaceC6824a {
                    C1590a(Object obj) {
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

                C1589a(InterfaceC8511f.b bVar) {
                    this.f44702a = bVar;
                }

                public final void a(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1205303654, i10, -1, "com.ui.wifiman.ui.settings.preferences.TeleportQuickActionExplanationAddUi.<anonymous>.<anonymous>.<anonymous> (TeleportQuickActionExplanationAddUi.kt:45)");
                    }
                    s9.b bVarG = N9.b.f16117a.s().g(new d.b(AbstractC6780c.f53557p4));
                    InterfaceC8511f.b bVar = this.f44702a;
                    interfaceC3540l.U(-314774033);
                    boolean zT = interfaceC3540l.T(bVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C1590a(bVar);
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

            C1588a(InterfaceC8511f.b bVar) {
                this.f44701a = bVar;
            }

            public final void a(Y ModalToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(ModalToolbar, "$this$ModalToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(2025398547, i10, -1, "com.ui.wifiman.ui.settings.preferences.TeleportQuickActionExplanationAddUi.<anonymous>.<anonymous> (TeleportQuickActionExplanationAddUi.kt:44)");
                }
                L.b(null, b0.c.e(-1205303654, true, new C1589a(this.f44701a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
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
            this.f44700a = bVar;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(863145100, i10, -1, "com.ui.wifiman.ui.settings.preferences.TeleportQuickActionExplanationAddUi.<anonymous> (TeleportQuickActionExplanationAddUi.kt:39)");
            }
            Fe.j.c(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), new d.b(AbstractC6780c.f53452a4), null, null, b0.c.e(2025398547, true, new C1588a(this.f44700a), interfaceC3540l, 54), 0L, interfaceC3540l, 24582, 44);
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

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f44703a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8511f.b f44704b;

        /* synthetic */ class a extends C6490p implements InterfaceC6824a {
            a(Object obj) {
                super(0, obj, o.class, "onAddTileClicked", "onAddTileClicked()V", 0);
            }

            public final void a() {
                ((o) this.receiver).n0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        /* renamed from: com.ui.wifiman.ui.settings.preferences.q$b$b, reason: collision with other inner class name */
        /* synthetic */ class C1591b extends C6490p implements InterfaceC6824a {
            C1591b(Object obj) {
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

        b(o oVar, InterfaceC8511f.b bVar) {
            this.f44703a = oVar;
            this.f44704b = bVar;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1791062321, i10, -1, "com.ui.wifiman.ui.settings.preferences.TeleportQuickActionExplanationAddUi.<anonymous> (TeleportQuickActionExplanationAddUi.kt:54)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            c.b bVarG = f0.c.f46573a.g();
            o oVar = this.f44703a;
            InterfaceC8511f.b bVar = this.f44704b;
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), bVarG, interfaceC3540l, 48);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA, cA, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(8)), interfaceC3540l, 6);
            AbstractC8049c.e(Pe.b.f18633a.f(), aVar, null, null, null, null, null, 0.0f, null, interfaceC3540l, 54, 254);
            a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(16)), interfaceC3540l, 6);
            androidx.compose.ui.e eVarH2 = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(eVarH2, c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null);
            a1.b(H0.f.a(AbstractC6780c.f53459b4, interfaceC3540l, 0), eVarK, c6562a.a(interfaceC3540l, i11).f().b(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.d()), 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 0, 0, 65016);
            M9.k.a(Y0.h.j(24), interfaceC3540l, 6);
            androidx.compose.ui.e eVarK2 = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null);
            String strA = H0.f.a(AbstractC6780c.f53439Y3, interfaceC3540l, 0);
            interfaceC3540l.U(-502784055);
            boolean zT = interfaceC3540l.T(oVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(oVar);
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            w9.r.b(eVarK2, (InterfaceC6824a) ((th.g) objF), false, false, null, null, strA, null, interfaceC3540l, 0, 188);
            androidx.compose.ui.e eVarK3 = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null);
            interfaceC3540l.U(-502776528);
            boolean zT2 = interfaceC3540l.T(bVar);
            Object objF2 = interfaceC3540l.f();
            if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new C1591b(bVar);
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            w9.o.c(eVarK3, (InterfaceC6824a) ((th.g) objF2), false, false, null, H0.f.a(AbstractC6780c.f53447a, interfaceC3540l, 0), interfaceC3540l, 0, 28);
            v0.b(null, interfaceC3540l, 0, 1);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
            a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final com.ui.wifiman.ui.settings.preferences.o r11, T.InterfaceC3540l r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.settings.preferences.q.b(com.ui.wifiman.ui.settings.preferences.o, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(o oVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(oVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
