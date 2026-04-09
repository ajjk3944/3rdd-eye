package Ae;

import Ae.p;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.I0;
import T.InterfaceC3540l;
import Yg.J;
import Zg.AbstractC3689v;
import f2.C5512k;
import f2.u;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import mh.q;
import mh.r;
import q.InterfaceC7383b;
import ye.AbstractC8664j;
import ze.AbstractC8732a;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: Ae.a$a, reason: collision with other inner class name */
    static final class C0024a implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f630a;

        /* renamed from: Ae.a$a$a, reason: collision with other inner class name */
        static final class C0025a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f631a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5512k f632b;

            C0025a(q qVar, C5512k c5512k) {
                this.f631a = qVar;
                this.f632b = c5512k;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1279867093, i10, -1, "com.ui.wifiman.ui.arch.navigation.graphRoute.<anonymous>.<anonymous> (NavGraphBuilderExtensions.kt:32)");
                }
                this.f631a.s(this.f632b, interfaceC3540l, 0);
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

        C0024a(q qVar) {
            this.f630a = qVar;
        }

        public final void a(InterfaceC7383b composable, C5512k backStackEntry, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(composable, "$this$composable");
            AbstractC6492s.i(backStackEntry, "backStackEntry");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1206171029, i10, -1, "com.ui.wifiman.ui.arch.navigation.graphRoute.<anonymous> (NavGraphBuilderExtensions.kt:28)");
            }
            AbstractC3561w.a(AbstractC8664j.c().d(AbstractC8732a.c(backStackEntry, null, null, interfaceC3540l, (i10 >> 3) & 14, 3)), b0.c.e(1279867093, true, new C0025a(this.f630a, backStackEntry), interfaceC3540l, 54), interfaceC3540l, I0.f20869i | 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a((InterfaceC7383b) obj, (C5512k) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return J.f24997a;
        }
    }

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f633a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f634b;

        /* renamed from: Ae.a$b$a, reason: collision with other inner class name */
        static final class C0026a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f635a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f636b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C5512k f637c;

            /* renamed from: Ae.a$b$a$a, reason: collision with other inner class name */
            static final class C0027a implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ q f638a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C5512k f639b;

                C0027a(q qVar, C5512k c5512k) {
                    this.f638a = qVar;
                    this.f639b = c5512k;
                }

                public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-856615162, i10, -1, "com.ui.wifiman.ui.arch.navigation.graphRoute.<anonymous>.<anonymous>.<anonymous> (NavGraphBuilderExtensions.kt:57)");
                    }
                    this.f638a.s(this.f639b, interfaceC3540l, 0);
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

            C0026a(q qVar, q qVar2, C5512k c5512k) {
                this.f635a = qVar;
                this.f636b = qVar2;
                this.f637c = c5512k;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1534965178, i10, -1, "com.ui.wifiman.ui.arch.navigation.graphRoute.<anonymous>.<anonymous> (NavGraphBuilderExtensions.kt:55)");
                }
                if (this.f635a != null) {
                    interfaceC3540l.U(1596785813);
                    this.f635a.s(b0.c.e(-856615162, true, new C0027a(this.f636b, this.f637c), interfaceC3540l, 54), interfaceC3540l, 6);
                    interfaceC3540l.J();
                } else {
                    interfaceC3540l.U(1596899180);
                    this.f636b.s(this.f637c, interfaceC3540l, 0);
                    interfaceC3540l.J();
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

        b(q qVar, q qVar2) {
            this.f633a = qVar;
            this.f634b = qVar2;
        }

        public final void a(C5512k backStackEntry, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(backStackEntry, "backStackEntry");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1899837190, i10, -1, "com.ui.wifiman.ui.arch.navigation.graphRoute.<anonymous> (NavGraphBuilderExtensions.kt:51)");
            }
            AbstractC3561w.a(AbstractC8664j.c().d(AbstractC8732a.c(backStackEntry, null, null, interfaceC3540l, i10 & 14, 3)), b0.c.e(-1534965178, true, new C0026a(this.f633a, this.f634b, backStackEntry), interfaceC3540l, 54), interfaceC3540l, I0.f20869i | 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((C5512k) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public static final void a(u uVar, p destination, n nVar, q qVar, q content) {
        List listL;
        AbstractC6492s.i(uVar, "<this>");
        AbstractC6492s.i(destination, "destination");
        AbstractC6492s.i(content, "content");
        String strA = destination.a();
        if (destination instanceof p.a) {
            listL = ((p.a) destination).j();
        } else {
            if (!(destination instanceof p.b)) {
                throw new NoWhenBranchMatchedException();
            }
            listL = AbstractC3689v.l();
        }
        b(uVar, strA, listL, nVar, b0.c.c(1899837190, true, new b(qVar, content)));
    }

    public static final void b(u uVar, String route, List arguments, n nVar, q content) {
        AbstractC6492s.i(uVar, "<this>");
        AbstractC6492s.i(route, "route");
        AbstractC6492s.i(arguments, "arguments");
        AbstractC6492s.i(content, "content");
        g2.k.b(uVar, route, arguments, null, nVar != null ? nVar.getEnterTransition() : null, nVar != null ? nVar.getExitTransition() : null, nVar != null ? nVar.getPopEnterTransition() : null, nVar != null ? nVar.getPopExitTransition() : null, null, b0.c.c(1206171029, true, new C0024a(content)), 132, null);
    }

    public static /* synthetic */ void c(u uVar, String str, List list, n nVar, q qVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = AbstractC3689v.l();
        }
        if ((i10 & 4) != 0) {
            nVar = null;
        }
        b(uVar, str, list, nVar, qVar);
    }
}
