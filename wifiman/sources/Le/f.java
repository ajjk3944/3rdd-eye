package Le;

import Be.AbstractC2480o;
import C0.C;
import E0.InterfaceC2629g;
import Le.a;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Yg.J;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s9.d;

/* loaded from: classes4.dex */
public abstract class f {

    /* synthetic */ class a extends C6490p implements InterfaceC6824a {
        a(Object obj) {
            super(0, obj, d.class, "onEmptyPrimaryActionClicked", "onEmptyPrimaryActionClicked()V", 0);
        }

        public final void a() {
            ((d) this.receiver).v0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    /* synthetic */ class b extends C6490p implements InterfaceC6824a {
        b(Object obj) {
            super(0, obj, d.class, "onEmptySecondaryActionClicked", "onEmptySecondaryActionClicked()V", 0);
        }

        public final void a() {
            ((d) this.receiver).w0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public static final void b(final androidx.compose.ui.e modifier, final a.AbstractC0459a contentType, final d vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(contentType, "contentType");
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1167193277);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(contentType) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(vm) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1167193277, i11, -1, "com.ui.wifiman.ui.discovery.DiscoveryHomeEmpty (DiscoveryHomeEmpty.kt:23)");
            }
            C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.e(), false);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, modifier);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, cH, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(eVarH, c6562a.d(interfaceC3540lR, i12).a().a().a(Y0.h.j(32)), c6562a.d(interfaceC3540lR, i12).a().b().d());
            int i13 = (i11 >> 3) & 14;
            s9.b bVarF = f(contentType, interfaceC3540lR, i13);
            s9.d dVarH = h(contentType, interfaceC3540lR, i13);
            s9.d dVarG = g(contentType, interfaceC3540lR, i13);
            s9.d dVarD = d(contentType, interfaceC3540lR, i13);
            interfaceC3540lR.U(873495678);
            int i14 = i11 & 896;
            boolean z10 = i14 == 256;
            Object objF = interfaceC3540lR.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(vm);
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            InterfaceC6824a interfaceC6824a = (InterfaceC6824a) ((th.g) objF);
            s9.d dVarE = e(contentType, interfaceC3540lR, i13);
            interfaceC3540lR.U(873500512);
            boolean z11 = i14 == 256;
            Object objF2 = interfaceC3540lR.f();
            if (z11 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new b(vm);
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC2480o.f(eVarJ, bVarF, dVarH, dVarG, null, dVarD, interfaceC6824a, dVarE, (InterfaceC6824a) ((th.g) objF2), interfaceC3540lR, 0, 16);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Le.e
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return f.c(modifier, contentType, vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, a.AbstractC0459a abstractC0459a, d dVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, abstractC0459a, dVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    private static final s9.d d(a.AbstractC0459a abstractC0459a, InterfaceC3540l interfaceC3540l, int i10) {
        d.b bVar;
        interfaceC3540l.U(432854931);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(432854931, i10, -1, "com.ui.wifiman.ui.discovery.buttonActionPrimary (DiscoveryHomeEmpty.kt:72)");
        }
        if (abstractC0459a instanceof a.AbstractC0459a.f) {
            bVar = new d.b(AbstractC6780c.f53553p0);
        } else if ((abstractC0459a instanceof a.AbstractC0459a.g) || (abstractC0459a instanceof a.AbstractC0459a.e)) {
            bVar = null;
        } else if (abstractC0459a instanceof a.AbstractC0459a.C0460a) {
            bVar = new d.b(AbstractC6780c.f53455b0);
        } else if (abstractC0459a instanceof a.AbstractC0459a.c) {
            bVar = new d.b(AbstractC6780c.f53483f0);
        } else if (abstractC0459a instanceof a.AbstractC0459a.b) {
            bVar = new d.b(AbstractC6780c.f53476e0);
        } else {
            if (!(abstractC0459a instanceof a.AbstractC0459a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new d.b(AbstractC6780c.f53518k0);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return bVar;
    }

    private static final s9.d e(a.AbstractC0459a abstractC0459a, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-2123101535);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-2123101535, i10, -1, "com.ui.wifiman.ui.discovery.buttonActionSecondary (DiscoveryHomeEmpty.kt:83)");
        }
        if (!(abstractC0459a instanceof a.AbstractC0459a.f) && !(abstractC0459a instanceof a.AbstractC0459a.g) && !(abstractC0459a instanceof a.AbstractC0459a.e) && !(abstractC0459a instanceof a.AbstractC0459a.C0460a) && !(abstractC0459a instanceof a.AbstractC0459a.c) && !(abstractC0459a instanceof a.AbstractC0459a.d) && !(abstractC0459a instanceof a.AbstractC0459a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return null;
    }

    private static final s9.b f(a.AbstractC0459a abstractC0459a, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-617890834);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-617890834, i10, -1, "com.ui.wifiman.ui.discovery.icon (DiscoveryHomeEmpty.kt:47)");
        }
        s9.b bVarQ = N9.b.f16117a.q();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return bVarQ;
    }

    private static final s9.d g(a.AbstractC0459a abstractC0459a, InterfaceC3540l interfaceC3540l, int i10) {
        d.b bVar;
        interfaceC3540l.U(-128247529);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-128247529, i10, -1, "com.ui.wifiman.ui.discovery.subtitle (DiscoveryHomeEmpty.kt:61)");
        }
        if (abstractC0459a instanceof a.AbstractC0459a.f) {
            bVar = new d.b(AbstractC6780c.f53560q0);
        } else if (abstractC0459a instanceof a.AbstractC0459a.g) {
            bVar = new d.b(AbstractC6780c.f53539n0);
        } else if (abstractC0459a instanceof a.AbstractC0459a.e) {
            bVar = new d.b(AbstractC6780c.f53574s0);
        } else if (abstractC0459a instanceof a.AbstractC0459a.C0460a) {
            bVar = new d.b(AbstractC6780c.f53462c0);
        } else if (abstractC0459a instanceof a.AbstractC0459a.c) {
            bVar = new d.b(AbstractC6780c.f53490g0);
        } else if (abstractC0459a instanceof a.AbstractC0459a.b) {
            bVar = new d.b(AbstractC6780c.f53504i0);
        } else {
            if (!(abstractC0459a instanceof a.AbstractC0459a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new d.b(AbstractC6780c.f53525l0);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return bVar;
    }

    private static final s9.d h(a.AbstractC0459a abstractC0459a, InterfaceC3540l interfaceC3540l, int i10) {
        d.b bVar;
        interfaceC3540l.U(-278951403);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-278951403, i10, -1, "com.ui.wifiman.ui.discovery.title (DiscoveryHomeEmpty.kt:50)");
        }
        if (abstractC0459a instanceof a.AbstractC0459a.f) {
            bVar = new d.b(AbstractC6780c.f53567r0);
        } else if (abstractC0459a instanceof a.AbstractC0459a.g) {
            bVar = new d.b(AbstractC6780c.f53546o0);
        } else if (abstractC0459a instanceof a.AbstractC0459a.e) {
            bVar = new d.b(AbstractC6780c.f53581t0);
        } else if (abstractC0459a instanceof a.AbstractC0459a.C0460a) {
            bVar = new d.b(AbstractC6780c.f53469d0);
        } else if (abstractC0459a instanceof a.AbstractC0459a.c) {
            bVar = new d.b(AbstractC6780c.f53497h0);
        } else if (abstractC0459a instanceof a.AbstractC0459a.b) {
            bVar = new d.b(AbstractC6780c.f53511j0);
        } else {
            if (!(abstractC0459a instanceof a.AbstractC0459a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new d.b(AbstractC6780c.f53532m0);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return bVar;
    }
}
