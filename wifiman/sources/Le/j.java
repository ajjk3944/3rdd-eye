package Le;

import A.AbstractC2395b;
import A.InterfaceC2396c;
import A.y;
import C0.C;
import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Yg.J;
import Zg.AbstractC3689v;
import Zg.Q;
import androidx.compose.ui.e;
import j0.AbstractC6234e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import sh.AbstractC7978m;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.a0;

/* loaded from: classes4.dex */
public abstract class j {

    public static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11605a = new a();

        public a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    public static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f11606a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f11607b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC6835l interfaceC6835l, List list) {
            super(1);
            this.f11606a = interfaceC6835l;
            this.f11607b = list;
        }

        public final Object a(int i10) {
            return this.f11606a.invoke(this.f11607b.get(i10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f11608a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f11609b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC6835l interfaceC6835l, List list) {
            super(1);
            this.f11608a = interfaceC6835l;
            this.f11609b = list;
        }

        public final Object a(int i10) {
            return this.f11608a.invoke(this.f11609b.get(i10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class d extends AbstractC6494u implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f11610a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list) {
            super(4);
            this.f11610a = list;
        }

        public final void a(InterfaceC2396c interfaceC2396c, int i10, InterfaceC3540l interfaceC3540l, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = i11 | (interfaceC3540l.T(interfaceC2396c) ? 4 : 2);
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
            ((Number) this.f11610a.get(i10)).intValue();
            interfaceC3540l.U(147632006);
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(H9.a.a(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), interfaceC3540l, 6), 0.0f, Y0.h.j(16), 1, null);
            C cA = AbstractC8685h.a(C8680c.f66832a.n(Y0.h.j(10)), f0.c.f46573a.k(), interfaceC3540l, 6);
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
            androidx.compose.ui.e eVarI = androidx.compose.foundation.layout.r.i(androidx.compose.foundation.layout.r.g(aVar, 0.3f), Y0.h.j(20));
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            a0.a(AbstractC6234e.a(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.o.k(eVarI, c6562a.d(interfaceC3540l, i13).a().a().c(), 0.0f, 2, null), c6562a.a(interfaceC3540l, i13).e().b(), null, 2, null), c6562a.b(interfaceC3540l, i13).a()), interfaceC3540l, 0);
            interfaceC3540l.U(617080080);
            Iterator it = AbstractC7978m.s(0, 5).iterator();
            while (it.hasNext()) {
                ((Q) it).d();
                androidx.compose.ui.e eVarI2 = androidx.compose.foundation.layout.r.i(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), Y0.h.j(48));
                C6562a c6562a2 = C6562a.f52458a;
                int i14 = C6562a.f52459b;
                a0.a(AbstractC6234e.a(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.o.k(eVarI2, c6562a2.d(interfaceC3540l, i14).a().a().c(), 0.0f, 2, null), c6562a2.a(interfaceC3540l, i14).e().b(), null, 2, null), c6562a2.b(interfaceC3540l, i14).a()), interfaceC3540l, 0);
            }
            interfaceC3540l.J();
            interfaceC3540l.R();
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

    public static final void d(final androidx.compose.ui.e modifier, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1547905827);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1547905827, i11, -1, "com.ui.wifiman.ui.discovery.DiscoveryHomeLoading (DiscoveryHomeLoading.kt:26)");
            }
            interfaceC3540lR.U(-1697325214);
            Object objF = interfaceC3540lR.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: Le.g
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return j.e((y) obj);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            AbstractC2395b.a(modifier, null, null, false, null, null, null, false, (InterfaceC6835l) objF, interfaceC3540lR, (i11 & 14) | 113246208, 126);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Le.h
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return j.g(modifier, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(y LazyColumn) {
        AbstractC6492s.i(LazyColumn, "$this$LazyColumn");
        List listI1 = AbstractC3689v.i1(AbstractC7978m.s(0, 2));
        LazyColumn.a(listI1.size(), new b(new InterfaceC6835l() { // from class: Le.i
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return j.f(((Integer) obj).intValue());
            }
        }, listI1), new c(a.f11605a, listI1), b0.c.c(-632812321, true, new d(listI1)));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(int i10) {
        return Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(androidx.compose.ui.e eVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        d(eVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
