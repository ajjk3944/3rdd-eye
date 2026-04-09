package Je;

import Be.v0;
import C0.C;
import E0.InterfaceC2629g;
import F9.AbstractC2859x;
import F9.k0;
import Je.q;
import L9.AbstractC3198d;
import L9.L;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.InterfaceC3563x;
import T.L0;
import T.o1;
import T.t1;
import Yg.J;
import android.content.res.Resources;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import s9.d;
import sa.AbstractC7930a;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.Y;

/* loaded from: classes4.dex */
public abstract class q {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f10037a;

        /* renamed from: Je.q$a$a, reason: collision with other inner class name */
        static final class C0413a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f10038a;

            /* renamed from: Je.q$a$a$a, reason: collision with other inner class name */
            static final class C0414a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ n f10039a;

                /* renamed from: Je.q$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C0415a extends C6490p implements InterfaceC6824a {
                    C0415a(Object obj) {
                        super(0, obj, n.class, "onSaveClicked", "onSaveClicked()V", 0);
                    }

                    public final void a() {
                        ((n) this.receiver).r0();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return J.f24997a;
                    }
                }

                C0414a(n nVar) {
                    this.f10039a = nVar;
                }

                public final void a(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(1490334198, i10, -1, "com.ui.wifiman.ui.device.DeviceEditUi.<anonymous>.<anonymous>.<anonymous> (DeviceEditUi.kt:51)");
                    }
                    d.b bVar = new d.b(AbstractC6780c.f53496h);
                    n nVar = this.f10039a;
                    interfaceC3540l.U(1742068502);
                    boolean zT = interfaceC3540l.T(nVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C0415a(nVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    He.i.c(null, (InterfaceC6824a) ((th.g) objF), false, bVar, interfaceC3540l, 0, 5);
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

            C0413a(n nVar) {
                this.f10038a = nVar;
            }

            public final void a(Y ModalToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(ModalToolbar, "$this$ModalToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1048093667, i10, -1, "com.ui.wifiman.ui.device.DeviceEditUi.<anonymous>.<anonymous> (DeviceEditUi.kt:50)");
                }
                L.b(null, b0.c.e(1490334198, true, new C0414a(this.f10038a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
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

        a(n nVar) {
            this.f10037a = nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(InterfaceC8511f.b bVar) {
            bVar.a();
            return J.f24997a;
        }

        public final void b(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2136681148, i10, -1, "com.ui.wifiman.ui.device.DeviceEditUi.<anonymous> (DeviceEditUi.kt:42)");
            }
            final InterfaceC8511f.b bVar = (InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K());
            d.b bVar2 = new d.b(AbstractC6780c.f53435Y);
            AbstractC3198d.c.b bVar3 = new AbstractC3198d.c.b(new d.b(AbstractC6780c.f53447a), false, 2, null);
            interfaceC3540l.U(901169351);
            boolean zT = interfaceC3540l.T(bVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: Je.p
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return q.a.c(bVar);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            Fe.j.c(null, bVar2, bVar3, (InterfaceC6824a) objF, b0.c.e(-1048093667, true, new C0413a(this.f10037a), interfaceC3540l, 54), 0L, interfaceC3540l, 24576, 33);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f10040a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f10041b;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f10042a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f10043b;

            a(n nVar, InterfaceC3551q0 interfaceC3551q0) {
                this.f10042a = nVar;
                this.f10043b = interfaceC3551q0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J c(InterfaceC3551q0 interfaceC3551q0, n nVar, String it) {
                AbstractC6492s.i(it, "it");
                interfaceC3551q0.setValue(it);
                nVar.q0(it);
                return J.f24997a;
            }

            public final void b(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-226256461, i10, -1, "com.ui.wifiman.ui.device.DeviceEditUi.<anonymous>.<anonymous>.<anonymous> (DeviceEditUi.kt:72)");
                }
                String strA = H0.f.a(AbstractC6780c.f53582t1, interfaceC3540l, 0);
                String strB = AbstractC7930a.b((s9.d) o1.b(this.f10042a.o0(), null, interfaceC3540l, 0, 1).getValue(), interfaceC3540l, 0);
                String str = (String) this.f10043b.getValue();
                interfaceC3540l.U(1742095729);
                boolean zT = interfaceC3540l.T(this.f10043b) | interfaceC3540l.T(this.f10042a);
                final InterfaceC3551q0 interfaceC3551q0 = this.f10043b;
                final n nVar = this.f10042a;
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6835l() { // from class: Je.r
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return q.b.a.c(interfaceC3551q0, nVar, (String) obj);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                k0.d(null, strA, null, str, (InterfaceC6835l) objF, null, null, null, false, null, 0, strB, null, 0L, null, false, false, null, null, null, null, interfaceC3540l, 0, 0, 0, 2095077);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                b((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        b(androidx.compose.ui.e eVar, n nVar) {
            this.f10040a = eVar;
            this.f10041b = nVar;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-52740127, i10, -1, "com.ui.wifiman.ui.device.DeviceEditUi.<anonymous> (DeviceEditUi.kt:60)");
            }
            androidx.compose.ui.e eVar = this.f10040a;
            c.b bVarG = f0.c.f46573a.g();
            n nVar = this.f10041b;
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), bVarG, interfaceC3540l, 48);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVar);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
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
            E1.c(interfaceC3540lA, cA, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            C8688k c8688k = C8688k.f66923a;
            s9.d dVar = (s9.d) o1.b(nVar.n0(), null, interfaceC3540l, 0, 1).getValue();
            interfaceC3540l.U(-1270765133);
            String strB = dVar == null ? null : AbstractC7930a.b(dVar, interfaceC3540l, 0);
            interfaceC3540l.J();
            interfaceC3540l.U(-1270763909);
            boolean zT = interfaceC3540l.T(strB);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = t1.d(strB, null, 2, null);
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            AbstractC2859x.c(androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().a().c(), 0.0f, 2, null), null, null, null, null, null, null, null, b0.c.e(-226256461, true, new a(nVar, (InterfaceC3551q0) objF), interfaceC3540l, 54), interfaceC3540l, 100663296, 254);
            v0.b(null, interfaceC3540l, 0, 1);
            interfaceC3540l.R();
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

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.e r11, final Je.n r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Je.q.b(androidx.compose.ui.e, Je.n, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, n nVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, nVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
