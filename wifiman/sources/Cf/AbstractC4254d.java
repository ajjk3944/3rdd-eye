package cf;

import Be.v0;
import C0.C;
import E0.InterfaceC2629g;
import F.D;
import F9.AbstractC2859x;
import F9.k0;
import Fe.j;
import He.i;
import L9.AbstractC3198d;
import L9.L;
import N.a1;
import R0.C3471y;
import R0.K;
import R0.r;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.InterfaceC3563x;
import T.L0;
import T.o1;
import T.t1;
import Y0.h;
import Yg.J;
import android.content.res.Resources;
import androidx.compose.foundation.layout.o;
import androidx.compose.ui.e;
import c0.AbstractC4174c;
import cf.AbstractC4254d;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import s9.d;
import sa.AbstractC7930a;
import th.g;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.Y;
import z.a0;

/* renamed from: cf.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4254d {

    /* renamed from: cf.d$a */
    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4251a f34010a;

        /* renamed from: cf.d$a$a, reason: collision with other inner class name */
        static final class C1188a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC4251a f34011a;

            /* renamed from: cf.d$a$a$a, reason: collision with other inner class name */
            static final class C1189a implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AbstractC4251a f34012a;

                /* renamed from: cf.d$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1190a extends C6490p implements InterfaceC6824a {
                    C1190a(Object obj) {
                        super(0, obj, AbstractC4251a.class, "onSaveClicked", "onSaveClicked()V", 0);
                    }

                    public final void a() {
                        ((AbstractC4251a) this.receiver).p0();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return J.f24997a;
                    }
                }

                C1189a(AbstractC4251a abstractC4251a) {
                    this.f34012a = abstractC4251a;
                }

                public final void a(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1894002741, i10, -1, "com.ui.wifiman.ui.speed.hosts.add.NetworkHostsAddUi.<anonymous>.<anonymous>.<anonymous> (NetworkHostsAddUi.kt:56)");
                    }
                    d.b bVar = new d.b(AbstractC6780c.f53496h);
                    boolean zBooleanValue = ((Boolean) o1.b(this.f34012a.n0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                    AbstractC4251a abstractC4251a = this.f34012a;
                    interfaceC3540l.U(-1195407637);
                    boolean zT = interfaceC3540l.T(abstractC4251a);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C1190a(abstractC4251a);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    i.c(null, (InterfaceC6824a) ((g) objF), zBooleanValue, bVar, interfaceC3540l, 0, 1);
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

            C1188a(AbstractC4251a abstractC4251a) {
                this.f34011a = abstractC4251a;
            }

            public final void a(Y ModalToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(ModalToolbar, "$this$ModalToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-148074940, i10, -1, "com.ui.wifiman.ui.speed.hosts.add.NetworkHostsAddUi.<anonymous>.<anonymous> (NetworkHostsAddUi.kt:55)");
                }
                L.b(null, b0.c.e(-1894002741, true, new C1189a(this.f34011a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
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

        a(AbstractC4251a abstractC4251a) {
            this.f34010a = abstractC4251a;
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
                AbstractC3546o.Q(-387310147, i10, -1, "com.ui.wifiman.ui.speed.hosts.add.NetworkHostsAddUi.<anonymous> (NetworkHostsAddUi.kt:49)");
            }
            final InterfaceC8511f.b bVar = (InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K());
            d.b bVar2 = new d.b(AbstractC6780c.f53603w1);
            AbstractC3198d.b bVar3 = AbstractC3198d.b.f11404b;
            interfaceC3540l.U(-1388400772);
            boolean zT = interfaceC3540l.T(bVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: cf.c
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return AbstractC4254d.a.c(bVar);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            j.c(null, bVar2, bVar3, (InterfaceC6824a) objF, b0.c.e(-148074940, true, new C1188a(this.f34010a), interfaceC3540l, 54), 0L, interfaceC3540l, (AbstractC3198d.b.f11405c << 6) | 24576, 33);
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

    /* renamed from: cf.d$b */
    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34013a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC4251a f34014b;

        /* renamed from: cf.d$b$a */
        static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f34015a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC4251a f34016b;

            a(InterfaceC3551q0 interfaceC3551q0, AbstractC4251a abstractC4251a) {
                this.f34015a = interfaceC3551q0;
                this.f34016b = abstractC4251a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J c(InterfaceC3551q0 interfaceC3551q0, AbstractC4251a abstractC4251a, String it) {
                AbstractC6492s.i(it, "it");
                interfaceC3551q0.setValue(it);
                abstractC4251a.o0(it);
                return J.f24997a;
            }

            public final void b(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(362335470, i10, -1, "com.ui.wifiman.ui.speed.hosts.add.NetworkHostsAddUi.<anonymous>.<anonymous>.<anonymous> (NetworkHostsAddUi.kt:89)");
                }
                String strA = H0.f.a(AbstractC6780c.f53589u1, interfaceC3540l, 0);
                String str = (String) this.f34015a.getValue();
                D d10 = new D(0, false, C3471y.f19528b.j(), r.f19498b.b(), (K) null, (Boolean) null, (S0.e) null, 113, (DefaultConstructorMarker) null);
                interfaceC3540l.U(-1195364180);
                boolean zT = interfaceC3540l.T(this.f34015a) | interfaceC3540l.T(this.f34016b);
                final InterfaceC3551q0 interfaceC3551q0 = this.f34015a;
                final AbstractC4251a abstractC4251a = this.f34016b;
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6835l() { // from class: cf.f
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return AbstractC4254d.b.a.c(interfaceC3551q0, abstractC4251a, (String) obj);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                k0.d(null, strA, null, str, (InterfaceC6835l) objF, null, null, null, false, null, 0, null, null, 0L, null, false, false, null, d10, null, null, interfaceC3540l, 0, 100663296, 0, 1834981);
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

        b(androidx.compose.ui.e eVar, AbstractC4251a abstractC4251a) {
            this.f34013a = eVar;
            this.f34014b = abstractC4251a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC3551q0 c() {
            return t1.d("", null, 2, null);
        }

        public final void b(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(905440256, i10, -1, "com.ui.wifiman.ui.speed.hosts.add.NetworkHostsAddUi.<anonymous> (NetworkHostsAddUi.kt:66)");
            }
            androidx.compose.ui.e eVar = this.f34013a;
            AbstractC4251a abstractC4251a = this.f34014b;
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540l, 0);
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
            Object[] objArr = new Object[0];
            interfaceC3540l.U(-1178414415);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: cf.e
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return AbstractC4254d.b.c();
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) AbstractC4174c.e(objArr, null, null, (InterfaceC6824a) objF, interfaceC3540l, 3072, 6);
            v0.b(null, interfaceC3540l, 0, 1);
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            a1.c(AbstractC7930a.a(new d.b(AbstractC6780c.f53596v1), interfaceC3540l, 0), o.k(aVar2, c6562a.d(interfaceC3540l, i11).a().a().a(h.j(32)), 0.0f, 2, null), c6562a.a(interfaceC3540l, i11).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l, i11).b().f(), interfaceC3540l, 0, 0, 131064);
            a0.a(androidx.compose.foundation.layout.r.i(aVar2, h.j(12)), interfaceC3540l, 6);
            AbstractC2859x.c(o.k(androidx.compose.foundation.layout.r.h(aVar2, 0.0f, 1, null), c6562a.d(interfaceC3540l, i11).a().a().c(), 0.0f, 2, null), null, null, null, null, null, null, null, b0.c.e(362335470, true, new a(interfaceC3551q0, abstractC4251a), interfaceC3540l, 54), interfaceC3540l, 100663296, 254);
            v0.b(null, interfaceC3540l, 0, 1);
            interfaceC3540l.R();
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

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.e r11, final cf.AbstractC4251a r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cf.AbstractC4254d.b(androidx.compose.ui.e, cf.a, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, AbstractC4251a abstractC4251a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, abstractC4251a, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
