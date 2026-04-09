package uf;

import Be.v0;
import C0.C;
import E0.InterfaceC2629g;
import Fe.j;
import H0.f;
import L9.L;
import L9.z;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.o1;
import Y0.h;
import Yg.J;
import android.content.res.Resources;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m0.C6733v0;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import s9.d;
import ta.AbstractC8049c;
import th.g;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.Y;
import z.a0;

/* loaded from: classes4.dex */
public abstract class e {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC8163a f62942a;

        /* renamed from: uf.e$a$a, reason: collision with other inner class name */
        static final class C2228a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC8163a f62943a;

            /* renamed from: uf.e$a$a$a, reason: collision with other inner class name */
            static final class C2229a implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AbstractC8163a f62944a;

                /* renamed from: uf.e$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C2230a extends C6490p implements InterfaceC6824a {
                    C2230a(Object obj) {
                        super(0, obj, AbstractC8163a.class, "onSkipClicked", "onSkipClicked()V", 0);
                    }

                    public final void a() {
                        ((AbstractC8163a) this.receiver).p0();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return J.f24997a;
                    }
                }

                C2229a(AbstractC8163a abstractC8163a) {
                    this.f62944a = abstractC8163a;
                }

                public final void a(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-2051261954, i10, -1, "com.ui.wifiman.ui.ubiquiti.console.DirectConsoleConnectionPopupUi.<anonymous>.<anonymous>.<anonymous> (DirectConsoleConnectionPopupUi.kt:74)");
                    }
                    s9.b bVarG = N9.b.f16117a.s().g(new d.b(AbstractC6780c.f53557p4));
                    AbstractC8163a abstractC8163a = this.f62944a;
                    interfaceC3540l.U(1643908869);
                    boolean zT = interfaceC3540l.T(abstractC8163a);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C2230a(abstractC8163a);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    z.c(bVarG, null, 0L, false, (InterfaceC6824a) ((g) objF), interfaceC3540l, 0, 14);
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

            C2228a(AbstractC8163a abstractC8163a) {
                this.f62943a = abstractC8163a;
            }

            public final void a(Y ModalToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(ModalToolbar, "$this$ModalToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1277055945, i10, -1, "com.ui.wifiman.ui.ubiquiti.console.DirectConsoleConnectionPopupUi.<anonymous>.<anonymous> (DirectConsoleConnectionPopupUi.kt:73)");
                }
                L.b(null, b0.c.e(-2051261954, true, new C2229a(this.f62943a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
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

        a(AbstractC8163a abstractC8163a) {
            this.f62942a = abstractC8163a;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-226381968, i10, -1, "com.ui.wifiman.ui.ubiquiti.console.DirectConsoleConnectionPopupUi.<anonymous> (DirectConsoleConnectionPopupUi.kt:68)");
            }
            j.c(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), new d.b(AbstractC6780c.f53409U), null, null, b0.c.e(-1277055945, true, new C2228a(this.f62942a), interfaceC3540l, 54), 0L, interfaceC3540l, 24582, 44);
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

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC8163a f62945a;

        /* synthetic */ class a extends C6490p implements InterfaceC6824a {
            a(Object obj) {
                super(0, obj, AbstractC8163a.class, "onProceedWithDirectConnectionClicked", "onProceedWithDirectConnectionClicked()V", 0);
            }

            public final void a() {
                ((AbstractC8163a) this.receiver).o0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        /* renamed from: uf.e$b$b, reason: collision with other inner class name */
        /* synthetic */ class C2231b extends C6490p implements InterfaceC6824a {
            C2231b(Object obj) {
                super(0, obj, AbstractC8163a.class, "onSkipClicked", "onSkipClicked()V", 0);
            }

            public final void a() {
                ((AbstractC8163a) this.receiver).p0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        b(AbstractC8163a abstractC8163a) {
            this.f62945a = abstractC8163a;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-460352781, i10, -1, "com.ui.wifiman.ui.ubiquiti.console.DirectConsoleConnectionPopupUi.<anonymous> (DirectConsoleConnectionPopupUi.kt:83)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = r.h(aVar, 0.0f, 1, null);
            c.b bVarG = f0.c.f46573a.g();
            AbstractC8163a abstractC8163a = this.f62945a;
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
            a0.a(r.i(aVar, h.j(8)), interfaceC3540l, 6);
            s9.b bVarI = Pe.a.f18599a.i();
            androidx.compose.ui.e eVarV = r.v(aVar, h.j(80));
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            AbstractC8049c.c(bVarI, eVarV, C6733v0.g(c6562a.a(interfaceC3540l, i11).a().b().b()), null, interfaceC3540l, 54, 4);
            float f10 = 16;
            a0.a(r.i(aVar, h.j(f10)), interfaceC3540l, 6);
            String str = (String) o1.b(abstractC8163a.n0(), null, interfaceC3540l, 0, 1).getValue();
            androidx.compose.ui.e eVarK = o.k(r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null);
            a1.c(uf.b.f62937a.a(str, AbstractC6780c.f53402T, interfaceC3540l, 384), eVarK, c6562a.a(interfaceC3540l, i11).f().b(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.d()), 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 0, 0, 130552);
            a0.a(r.i(aVar, h.j(f10)), interfaceC3540l, 6);
            androidx.compose.ui.e eVarK2 = o.k(r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null);
            String strA = f.a(AbstractC6780c.f53388R, interfaceC3540l, 0);
            interfaceC3540l.U(-1411982595);
            boolean zT = interfaceC3540l.T(abstractC8163a);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(abstractC8163a);
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            w9.r.b(eVarK2, (InterfaceC6824a) ((g) objF), false, false, null, null, strA, null, interfaceC3540l, 0, 188);
            androidx.compose.ui.e eVarK3 = o.k(r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null);
            String strA2 = f.a(AbstractC6780c.f53395S, interfaceC3540l, 0);
            interfaceC3540l.U(-1411971578);
            boolean zT2 = interfaceC3540l.T(abstractC8163a);
            Object objF2 = interfaceC3540l.f();
            if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new C2231b(abstractC8163a);
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            w9.o.c(eVarK3, (InterfaceC6824a) ((g) objF2), false, false, null, strA2, interfaceC3540l, 0, 28);
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

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(uf.AbstractC8163a r19, T.InterfaceC3540l r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.e.c(uf.a, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(AbstractC8163a abstractC8163a) {
        abstractC8163a.p0();
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(AbstractC8163a abstractC8163a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(abstractC8163a, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
