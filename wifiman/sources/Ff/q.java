package Ff;

import Be.AbstractC2480o;
import C0.C;
import E0.InterfaceC2629g;
import Ff.d;
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
public abstract class q {

    /* synthetic */ class a extends C6490p implements InterfaceC6824a {
        a(Object obj) {
            super(0, obj, e.class, "onEmptyPrimaryActionClicked", "onEmptyPrimaryActionClicked()V", 0);
        }

        public final void a() {
            ((e) this.receiver).x0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    /* synthetic */ class b extends C6490p implements InterfaceC6824a {
        b(Object obj) {
            super(0, obj, e.class, "onEmptySecondaryActionClicked", "onEmptySecondaryActionClicked()V", 0);
        }

        public final void a() {
            ((e) this.receiver).y0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public static final void b(final androidx.compose.ui.e modifier, final d.a contentType, final e vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(contentType, "contentType");
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(680213189);
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
                AbstractC3546o.Q(680213189, i11, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanUiEmpty (WifiScanUiEmpty.kt:21)");
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
            interfaceC3540lR.U(-383851703);
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
            interfaceC3540lR.U(-383846869);
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
            x0Z.a(new InterfaceC6839p() { // from class: Ff.p
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return q.c(modifier, contentType, vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, d.a aVar, e eVar2, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, aVar, eVar2, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    private static final s9.d d(d.a aVar, InterfaceC3540l interfaceC3540l, int i10) {
        d.b bVar;
        interfaceC3540l.U(1925066588);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1925066588, i10, -1, "com.ui.wifiman.ui.wifi.scan.buttonActionPrimary (WifiScanUiEmpty.kt:66)");
        }
        if (aVar instanceof d.a.c) {
            bVar = new d.b(AbstractC6780c.f53474d5);
        } else if (aVar instanceof d.a.C0258a) {
            bVar = new d.b(AbstractC6780c.f53446Z4);
        } else {
            if (!(aVar instanceof d.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new d.b(AbstractC6780c.f53428W4);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return bVar;
    }

    private static final s9.d e(d.a aVar, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(1463060238);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1463060238, i10, -1, "com.ui.wifiman.ui.wifi.scan.buttonActionSecondary (WifiScanUiEmpty.kt:73)");
        }
        if (!(aVar instanceof d.a.c) && !(aVar instanceof d.a.C0258a) && !(aVar instanceof d.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return null;
    }

    private static final s9.b f(d.a aVar, InterfaceC3540l interfaceC3540l, int i10) {
        s9.b bVarD;
        interfaceC3540l.U(-817225503);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-817225503, i10, -1, "com.ui.wifiman.ui.wifi.scan.icon (WifiScanUiEmpty.kt:45)");
        }
        if (aVar instanceof d.a.c) {
            bVarD = Pe.a.f18599a.c0();
        } else {
            if (!(aVar instanceof d.a.C0258a) && !(aVar instanceof d.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            bVarD = Pe.a.f18599a.D();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return bVarD;
    }

    private static final s9.d g(d.a aVar, InterfaceC3540l interfaceC3540l, int i10) {
        d.b bVar;
        interfaceC3540l.U(1834941528);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1834941528, i10, -1, "com.ui.wifiman.ui.wifi.scan.subtitle (WifiScanUiEmpty.kt:59)");
        }
        if (aVar instanceof d.a.c) {
            bVar = new d.b(AbstractC6780c.f53481e5);
        } else if (aVar instanceof d.a.C0258a) {
            bVar = new d.b(AbstractC6780c.f53453a5);
        } else {
            if (!(aVar instanceof d.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new d.b(AbstractC6780c.f53434X4);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return bVar;
    }

    private static final s9.d h(d.a aVar, InterfaceC3540l interfaceC3540l, int i10) {
        d.b bVar;
        interfaceC3540l.U(-1694344166);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1694344166, i10, -1, "com.ui.wifiman.ui.wifi.scan.title (WifiScanUiEmpty.kt:52)");
        }
        if (aVar instanceof d.a.c) {
            bVar = new d.b(AbstractC6780c.f53467c5);
        } else if (aVar instanceof d.a.C0258a) {
            bVar = new d.b(AbstractC6780c.f53460b5);
        } else {
            if (!(aVar instanceof d.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new d.b(AbstractC6780c.f53440Y4);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return bVar;
    }
}
