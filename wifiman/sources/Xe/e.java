package Xe;

import A9.i;
import Be.v0;
import C0.C;
import E0.InterfaceC2629g;
import F9.AbstractC2859x;
import F9.k0;
import Fe.j;
import L9.L;
import L9.z;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.InterfaceC3563x;
import T.L0;
import T.o1;
import T.t1;
import Xe.e;
import Yg.J;
import android.content.res.Resources;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import dh.InterfaceC5380e;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import s9.d;
import sa.AbstractC7930a;
import xe.InterfaceC8511f;
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
        final /* synthetic */ InterfaceC8511f.b f24318a;

        /* renamed from: Xe.e$a$a, reason: collision with other inner class name */
        static final class C0922a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC8511f.b f24319a;

            /* renamed from: Xe.e$a$a$a, reason: collision with other inner class name */
            static final class C0923a implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC8511f.b f24320a;

                C0923a(InterfaceC8511f.b bVar) {
                    this.f24320a = bVar;
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
                        AbstractC3546o.Q(433675572, i10, -1, "com.ui.wifiman.ui.signal.floorplan.save.FloorplanSaveUi.<anonymous>.<anonymous>.<anonymous> (FloorplanSaveUi.kt:59)");
                    }
                    s9.b bVarS = N9.b.f16117a.s();
                    interfaceC3540l.U(1044178029);
                    boolean zT = interfaceC3540l.T(this.f24320a);
                    final InterfaceC8511f.b bVar = this.f24320a;
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6824a() { // from class: Xe.d
                            @Override // mh.InterfaceC6824a
                            public final Object invoke() {
                                return e.a.C0922a.C0923a.c(bVar);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    z.c(bVarS, null, 0L, false, (InterfaceC6824a) objF, interfaceC3540l, 0, 14);
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

            C0922a(InterfaceC8511f.b bVar) {
                this.f24319a = bVar;
            }

            public final void a(Y ModalToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(ModalToolbar, "$this$ModalToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1061920403, i10, -1, "com.ui.wifiman.ui.signal.floorplan.save.FloorplanSaveUi.<anonymous>.<anonymous> (FloorplanSaveUi.kt:58)");
                }
                L.b(null, b0.c.e(433675572, true, new C0923a(this.f24319a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
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
            this.f24318a = bVar;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(961279654, i10, -1, "com.ui.wifiman.ui.signal.floorplan.save.FloorplanSaveUi.<anonymous> (FloorplanSaveUi.kt:55)");
            }
            j.c(null, new d.b(AbstractC6780c.f53470d1), null, null, b0.c.e(-1061920403, true, new C0922a(this.f24318a), interfaceC3540l, 54), 0L, interfaceC3540l, 24576, 45);
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
        final /* synthetic */ Xe.b f24321a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8511f.b f24322b;

        static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ s9.d f24323a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Xe.b f24324b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f24325c;

            a(s9.d dVar, Xe.b bVar, InterfaceC3551q0 interfaceC3551q0) {
                this.f24323a = dVar;
                this.f24324b = bVar;
                this.f24325c = interfaceC3551q0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J c(Xe.b bVar, InterfaceC3551q0 interfaceC3551q0, String it) {
                AbstractC6492s.i(it, "it");
                b.i(interfaceC3551q0, it);
                bVar.r0(it);
                return J.f24997a;
            }

            public final void b(i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-183788137, i10, -1, "com.ui.wifiman.ui.signal.floorplan.save.FloorplanSaveUi.<anonymous>.<anonymous>.<anonymous> (FloorplanSaveUi.kt:82)");
                }
                androidx.compose.ui.e eVarH = r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                String strA = H0.f.a(AbstractC6780c.f53582t1, interfaceC3540l, 0);
                String strH = b.h(this.f24325c);
                s9.d dVar = this.f24323a;
                interfaceC3540l.U(1044204218);
                String strB = dVar == null ? null : AbstractC7930a.b(dVar, interfaceC3540l, 0);
                interfaceC3540l.J();
                interfaceC3540l.U(1044205939);
                boolean zT = interfaceC3540l.T(this.f24324b);
                final Xe.b bVar = this.f24324b;
                final InterfaceC3551q0 interfaceC3551q0 = this.f24325c;
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6835l() { // from class: Xe.h
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return e.b.a.c(bVar, interfaceC3551q0, (String) obj);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                k0.d(eVarH, strA, null, strH, (InterfaceC6835l) objF, null, null, null, false, null, 0, strB, null, 0L, null, false, false, null, null, null, null, interfaceC3540l, 6, 0, 0, 2095076);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                b((i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        /* renamed from: Xe.e$b$b, reason: collision with other inner class name */
        /* synthetic */ class C0924b extends C6490p implements InterfaceC6839p {
            C0924b(Object obj) {
                super(2, obj, Xe.b.class, "loadFloorplanController", "loadFloorplanController(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final Object a(long j10, InterfaceC5380e interfaceC5380e) {
                return ((Xe.b) this.receiver).q0(j10, interfaceC5380e);
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Number) obj).longValue(), (InterfaceC5380e) obj2);
            }
        }

        /* synthetic */ class c extends C6490p implements InterfaceC6824a {
            c(Object obj) {
                super(0, obj, Xe.b.class, "onSaveClicked", "onSaveClicked()V", 0);
            }

            public final void a() {
                ((Xe.b) this.receiver).s0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        /* synthetic */ class d extends C6490p implements InterfaceC6824a {
            d(Object obj) {
                super(0, obj, Xe.b.class, "onShareClicked", "onShareClicked()V", 0);
            }

            public final void a() {
                ((Xe.b) this.receiver).t0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        b(Xe.b bVar, InterfaceC8511f.b bVar2) {
            this.f24321a = bVar;
            this.f24322b = bVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String h(InterfaceC3551q0 interfaceC3551q0) {
            return (String) interfaceC3551q0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(InterfaceC3551q0 interfaceC3551q0, String str) {
            interfaceC3551q0.setValue(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC6839p j(Xe.b bVar) {
            return new C0924b(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J k(InterfaceC8511f.b bVar) {
            bVar.a();
            return J.f24997a;
        }

        public final void f(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2048868393, i10, -1, "com.ui.wifiman.ui.signal.floorplan.save.FloorplanSaveUi.<anonymous> (FloorplanSaveUi.kt:68)");
            }
            v0.b(null, interfaceC3540l, 0, 1);
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarK = o.k(r.h(aVar, 0.0f, 1, null), C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().a().c(), 0.0f, 2, null);
            c.b bVarG = f0.c.f46573a.g();
            final Xe.b bVar = this.f24321a;
            final InterfaceC8511f.b bVar2 = this.f24322b;
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), bVarG, interfaceC3540l, 48);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarK);
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
            interfaceC3540l.U(-408863923);
            Object objF = interfaceC3540l.f();
            InterfaceC3540l.a aVar3 = InterfaceC3540l.f21100a;
            if (objF == aVar3.a()) {
                objF = t1.d("", null, 2, null);
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            AbstractC2859x.c(r.h(aVar, 0.0f, 1, null), null, null, null, null, null, null, null, b0.c.e(-183788137, true, new a((s9.d) o1.b(bVar.o0(), null, interfaceC3540l, 0, 1).getValue(), bVar, (InterfaceC3551q0) objF), interfaceC3540l, 54), interfaceC3540l, 100663302, 254);
            a0.a(r.i(aVar, Y0.h.j(16)), interfaceC3540l, 6);
            androidx.compose.ui.e eVarH = r.h(r.i(aVar, Y0.h.j(190)), 0.0f, 1, null);
            Long l10 = (Long) o1.b(bVar.n0(), null, interfaceC3540l, 0, 1).getValue();
            interfaceC3540l.U(-408833907);
            boolean zT = interfaceC3540l.T(bVar);
            Object objF2 = interfaceC3540l.f();
            if (zT || objF2 == aVar3.a()) {
                objF2 = new InterfaceC6824a() { // from class: Xe.f
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return e.b.j(bVar);
                    }
                };
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            Ue.f.e(eVarH, l10, (InterfaceC6824a) objF2, interfaceC3540l, 6);
            a0.a(r.i(aVar, Y0.h.j(24)), interfaceC3540l, 6);
            androidx.compose.ui.e eVarH2 = r.h(aVar, 0.0f, 1, null);
            String strA = H0.f.a(AbstractC6780c.f53456b1, interfaceC3540l, 0);
            interfaceC3540l.U(-408824897);
            boolean zT2 = interfaceC3540l.T(bVar);
            Object objF3 = interfaceC3540l.f();
            if (zT2 || objF3 == aVar3.a()) {
                objF3 = new c(bVar);
                interfaceC3540l.K(objF3);
            }
            interfaceC3540l.J();
            w9.r.b(eVarH2, (InterfaceC6824a) ((th.g) objF3), false, false, null, null, strA, null, interfaceC3540l, 6, 188);
            androidx.compose.ui.e eVarH3 = r.h(aVar, 0.0f, 1, null);
            String strA2 = H0.f.a(AbstractC6780c.f53463c1, interfaceC3540l, 0);
            interfaceC3540l.U(-408818112);
            boolean zT3 = interfaceC3540l.T(bVar);
            Object objF4 = interfaceC3540l.f();
            if (zT3 || objF4 == aVar3.a()) {
                objF4 = new d(bVar);
                interfaceC3540l.K(objF4);
            }
            interfaceC3540l.J();
            w9.o.c(eVarH3, (InterfaceC6824a) ((th.g) objF4), false, false, null, strA2, interfaceC3540l, 6, 28);
            androidx.compose.ui.e eVarH4 = r.h(aVar, 0.0f, 1, null);
            String strA3 = H0.f.a(AbstractC6780c.f53447a, interfaceC3540l, 0);
            interfaceC3540l.U(-408811598);
            boolean zT4 = interfaceC3540l.T(bVar2);
            Object objF5 = interfaceC3540l.f();
            if (zT4 || objF5 == aVar3.a()) {
                objF5 = new InterfaceC6824a() { // from class: Xe.g
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return e.b.k(bVar2);
                    }
                };
                interfaceC3540l.K(objF5);
            }
            interfaceC3540l.J();
            w9.o.c(eVarH4, (InterfaceC6824a) objF5, false, false, null, strA3, interfaceC3540l, 6, 28);
            interfaceC3540l.R();
            v0.b(null, interfaceC3540l, 0, 1);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
            f((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.e r11, final Xe.b r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Xe.e.b(androidx.compose.ui.e, Xe.b, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, Xe.b bVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, bVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
