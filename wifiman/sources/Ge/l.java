package Ge;

import A.AbstractC2395b;
import A.InterfaceC2396c;
import A.y;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import androidx.compose.foundation.layout.r;
import f0.c;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import z.j0;

/* loaded from: classes4.dex */
public abstract class l {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f7346a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f7347b;

        /* renamed from: Ge.l$a$a, reason: collision with other inner class name */
        static final class C0298a implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f7348a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f7349b;

            C0298a(InterfaceC6835l interfaceC6835l, g gVar) {
                this.f7348a = interfaceC6835l;
                this.f7349b = gVar;
            }

            public final void a() {
                this.f7348a.invoke(((Ge.a) this.f7349b).getId());
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        a(g gVar, InterfaceC6835l interfaceC6835l) {
            this.f7346a = gVar;
            this.f7347b = interfaceC6835l;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1498678267, i10, -1, "com.ui.wifiman.ui.component.notification.InAppNotificationContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InAppNotificationContainer.kt:35)");
            }
            g gVar = this.f7346a;
            if (gVar instanceof Ge.a) {
                if (((Ge.a) gVar) == null) {
                    throw new IllegalStateException("Unsupported notification type " + this.f7346a.getClass().getName());
                }
                androidx.compose.ui.e eVarH = r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                Ge.a aVar = (Ge.a) this.f7346a;
                interfaceC3540l.U(742709843);
                boolean zT = interfaceC3540l.T(this.f7347b) | interfaceC3540l.l(this.f7346a);
                InterfaceC6835l interfaceC6835l = this.f7347b;
                g gVar2 = this.f7346a;
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new C0298a(interfaceC6835l, gVar2);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                Ge.c.b(eVarH, aVar, (InterfaceC6824a) objF, interfaceC3540l, 6);
            }
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

    public static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f7350a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f7351b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC6835l interfaceC6835l, List list) {
            super(1);
            this.f7350a = interfaceC6835l;
            this.f7351b = list;
        }

        public final Object a(int i10) {
            return this.f7350a.invoke(this.f7351b.get(i10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f7352a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f7353b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC6835l interfaceC6835l, List list) {
            super(1);
            this.f7352a = interfaceC6835l;
            this.f7353b = list;
        }

        public final Object a(int i10) {
            return this.f7352a.invoke(this.f7353b.get(i10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class d extends AbstractC6494u implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f7354a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f7355b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, InterfaceC6835l interfaceC6835l) {
            super(4);
            this.f7354a = list;
            this.f7355b = interfaceC6835l;
        }

        public final void a(InterfaceC2396c interfaceC2396c, int i10, InterfaceC3540l interfaceC3540l, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (interfaceC3540l.T(interfaceC2396c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= interfaceC3540l.i(i10) ? 32 : 16;
            }
            if ((i12 & 147) == 146 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
            }
            g gVar = (g) this.f7354a.get(i10);
            interfaceC3540l.U(-854558168);
            n.b(InterfaceC2396c.b(interfaceC2396c, r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), null, 1, null), b0.c.e(1498678267, true, new a(gVar, this.f7355b), interfaceC3540l, 54), interfaceC3540l, 48);
            interfaceC3540l.J();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a((InterfaceC2396c) obj, ((Number) obj2).intValue(), (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return J.f24997a;
        }
    }

    public static final void e(final Ci.c notification, final InterfaceC6835l onNotificationCloseClicked, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(notification, "notification");
        AbstractC6492s.i(onNotificationCloseClicked, "onNotificationCloseClicked");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(914421771);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? interfaceC3540lR.T(notification) : interfaceC3540lR.l(notification) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(onNotificationCloseClicked) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(914421771, i11, -1, "com.ui.wifiman.ui.component.notification.InAppNotificationContainer (InAppNotificationContainer.kt:17)");
            }
            androidx.compose.ui.e eVarC = j0.c(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null));
            c.b bVarG = f0.c.f46573a.g();
            interfaceC3540lR.U(-8598611);
            boolean z10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && interfaceC3540lR.l(notification))) | ((i11 & 112) == 32);
            Object objF = interfaceC3540lR.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: Ge.h
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return l.f(notification, onNotificationCloseClicked, (y) obj);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC2395b.a(eVarC, null, null, false, null, bVarG, null, false, (InterfaceC6835l) objF, interfaceC3540lR, 12779520, 94);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ge.i
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return l.i(notification, onNotificationCloseClicked, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(Ci.c cVar, InterfaceC6835l interfaceC6835l, y LazyColumn) {
        AbstractC6492s.i(LazyColumn, "$this$LazyColumn");
        LazyColumn.a(cVar.size(), new b(new InterfaceC6835l() { // from class: Ge.j
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return l.g((g) obj);
            }
        }, cVar), new c(new InterfaceC6835l() { // from class: Ge.k
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return l.h((g) obj);
            }
        }, cVar), b0.c.c(-632812321, true, new d(cVar, interfaceC6835l)));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(g it) {
        AbstractC6492s.i(it, "it");
        return it.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h(g it) {
        AbstractC6492s.i(it, "it");
        return it.getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i(Ci.c cVar, InterfaceC6835l interfaceC6835l, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        e(cVar, interfaceC6835l, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
