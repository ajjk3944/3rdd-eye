package Je;

import Je.a;
import Je.j;
import L9.AbstractC3198d;
import L9.E;
import L9.L;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.o1;
import Yg.J;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import q.AbstractC7391j;
import s9.d;
import sa.AbstractC7930a;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import z.N;
import z.Y;
import z.j0;

/* loaded from: classes4.dex */
public abstract class j {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f10022a;

        /* renamed from: Je.j$a$a, reason: collision with other inner class name */
        static final class C0410a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f10023a;

            /* renamed from: Je.j$a$a$a, reason: collision with other inner class name */
            static final class C0411a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ c f10024a;

                /* renamed from: Je.j$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C0412a extends C6490p implements InterfaceC6824a {
                    C0412a(Object obj) {
                        super(0, obj, c.class, "onEditClicked", "onEditClicked()V", 0);
                    }

                    public final void a() {
                        ((c) this.receiver).s0();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return J.f24997a;
                    }
                }

                C0411a(c cVar) {
                    this.f10024a = cVar;
                }

                public final void a(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(331027978, i10, -1, "com.ui.wifiman.ui.device.DeviceDetail.<anonymous>.<anonymous>.<anonymous> (DeviceDetailUi.kt:51)");
                    }
                    d.b bVar = new d.b(AbstractC6780c.f53475e);
                    c cVar = this.f10024a;
                    interfaceC3540l.U(-1795508567);
                    boolean zT = interfaceC3540l.T(cVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C0412a(cVar);
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

            C0410a(c cVar) {
                this.f10023a = cVar;
            }

            public final void a(Y UiToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiToolbar, "$this$UiToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(816626302, i10, -1, "com.ui.wifiman.ui.device.DeviceDetail.<anonymous>.<anonymous> (DeviceDetailUi.kt:49)");
                }
                if (((Boolean) o1.b(this.f10023a.r0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue()) {
                    L.b(null, b0.c.e(331027978, true, new C0411a(this.f10023a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
                }
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

        a(c cVar) {
            this.f10022a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(InterfaceC8511f.b bVar) {
            bVar.a();
            return J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1866234222, i10, -1, "com.ui.wifiman.ui.device.DeviceDetail.<anonymous> (DeviceDetailUi.kt:40)");
            }
            final InterfaceC8511f.b bVar = (InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K());
            androidx.compose.ui.e eVarC = j0.c(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null));
            s9.d dVar = (s9.d) o1.b(this.f10022a.c(), null, interfaceC3540l, 0, 1).getValue();
            interfaceC3540l.U(1046482087);
            String strB = dVar == null ? null : AbstractC7930a.b(dVar, interfaceC3540l, 0);
            interfaceC3540l.J();
            AbstractC3198d.a aVar = AbstractC3198d.a.f11402b;
            interfaceC3540l.U(1046485594);
            boolean zT = interfaceC3540l.T(bVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: Je.i
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return j.a.c(bVar);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            E.i(eVarC, strB, aVar, (InterfaceC6824a) objF, b0.c.e(816626302, true, new C0410a(this.f10022a), interfaceC3540l, 54), 0L, 0L, 0L, 0.0f, null, 0.0f, interfaceC3540l, (AbstractC3198d.a.f11403c << 6) | 24576, 0, 2016);
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

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f10025a;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f10026a;

            a(c cVar) {
                this.f10026a = cVar;
            }

            public final void a(Je.a cnt, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(cnt, "cnt");
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.T(cnt) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1780072747, i10, -1, "com.ui.wifiman.ui.device.DeviceDetail.<anonymous>.<anonymous> (DeviceDetailUi.kt:69)");
                }
                if (cnt instanceof a.c) {
                    interfaceC3540l.U(-1279294348);
                    l.b(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), this.f10026a, interfaceC3540l, 6);
                    interfaceC3540l.J();
                } else if (cnt instanceof a.b) {
                    interfaceC3540l.U(-1279288715);
                    g.b(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), interfaceC3540l, 6);
                    interfaceC3540l.J();
                } else {
                    if (!(cnt instanceof a.C0407a)) {
                        interfaceC3540l.U(-1279296117);
                        interfaceC3540l.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540l.U(-1279283948);
                    e.b(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), this.f10026a, interfaceC3540l, 6);
                    interfaceC3540l.J();
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((Je.a) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        b(c cVar) {
            this.f10025a = cVar;
        }

        public final void a(N scaffoldPadding, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(scaffoldPadding, "scaffoldPadding");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.T(scaffoldPadding) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2111830485, i10, -1, "com.ui.wifiman.ui.device.DeviceDetail.<anonymous> (DeviceDetailUi.kt:61)");
            }
            AbstractC7391j.a((Je.a) o1.b(this.f10025a.o0(), null, interfaceC3540l, 0, 1).getValue(), androidx.compose.foundation.layout.o.h(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), scaffoldPadding), null, "DeviceDetail", b0.c.e(1780072747, true, new a(this.f10025a), interfaceC3540l, 54), interfaceC3540l, 27648, 4);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((N) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(Je.c r31, T.InterfaceC3540l r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Je.j.b(Je.c, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(c cVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(cVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
