package androidx.compose.ui.focus;

import C0.InterfaceC2525e;
import E0.AbstractC2633k;
import E0.AbstractC2635m;
import E0.InterfaceC2632j;
import E0.e0;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6533i;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class w {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28872a;

        static {
            int[] iArr = new int[k0.m.values().length];
            try {
                iArr[k0.m.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k0.m.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k0.m.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k0.m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f28872a = iArr;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f28873a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6533i f28874b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28875c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f28876d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode, C6533i c6533i, int i10, InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f28873a = focusTargetNode;
            this.f28874b = c6533i;
            this.f28875c = i10;
            this.f28876d = interfaceC6835l;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC2525e.a aVar) {
            boolean zR = w.r(this.f28873a, this.f28874b, this.f28875c, this.f28876d);
            Boolean boolValueOf = Boolean.valueOf(zR);
            if (zR || !aVar.a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.K2() != k0.m.ActiveParent) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy");
        }
        FocusTargetNode focusTargetNodeB = t.b(focusTargetNode);
        if (focusTargetNodeB != null) {
            return focusTargetNodeB;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    private static final boolean c(C6533i c6533i, C6533i c6533i2, C6533i c6533i3, int i10) {
        if (d(c6533i3, i10, c6533i) || !d(c6533i2, i10, c6533i)) {
            return false;
        }
        if (e(c6533i3, i10, c6533i)) {
            d.a aVar = d.f28823b;
            if (!d.l(i10, aVar.d()) && !d.l(i10, aVar.g()) && f(c6533i2, i10, c6533i) >= g(c6533i3, i10, c6533i)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean d(C6533i c6533i, int i10, C6533i c6533i2) {
        d.a aVar = d.f28823b;
        if (!(d.l(i10, aVar.d()) ? true : d.l(i10, aVar.g()))) {
            if (!(d.l(i10, aVar.h()) ? true : d.l(i10, aVar.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (c6533i.l() > c6533i2.k() && c6533i.k() < c6533i2.l()) {
                return true;
            }
        } else if (c6533i.e() > c6533i2.n() && c6533i.n() < c6533i2.e()) {
            return true;
        }
        return false;
    }

    private static final boolean e(C6533i c6533i, int i10, C6533i c6533i2) {
        d.a aVar = d.f28823b;
        if (d.l(i10, aVar.d())) {
            if (c6533i2.k() < c6533i.l()) {
                return false;
            }
        } else if (d.l(i10, aVar.g())) {
            if (c6533i2.l() > c6533i.k()) {
                return false;
            }
        } else if (d.l(i10, aVar.h())) {
            if (c6533i2.n() < c6533i.e()) {
                return false;
            }
        } else {
            if (!d.l(i10, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (c6533i2.e() > c6533i.n()) {
                return false;
            }
        }
        return true;
    }

    private static final float f(C6533i c6533i, int i10, C6533i c6533i2) {
        float fN;
        float fE;
        float fN2;
        float fE2;
        float f10;
        d.a aVar = d.f28823b;
        if (!d.l(i10, aVar.d())) {
            if (d.l(i10, aVar.g())) {
                fN = c6533i.k();
                fE = c6533i2.l();
            } else if (d.l(i10, aVar.h())) {
                fN2 = c6533i2.n();
                fE2 = c6533i.e();
            } else {
                if (!d.l(i10, aVar.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                fN = c6533i.n();
                fE = c6533i2.e();
            }
            f10 = fN - fE;
            return Math.max(0.0f, f10);
        }
        fN2 = c6533i2.k();
        fE2 = c6533i.l();
        f10 = fN2 - fE2;
        return Math.max(0.0f, f10);
    }

    private static final float g(C6533i c6533i, int i10, C6533i c6533i2) {
        float fE;
        float fE2;
        float fN;
        float fN2;
        float f10;
        d.a aVar = d.f28823b;
        if (!d.l(i10, aVar.d())) {
            if (d.l(i10, aVar.g())) {
                fE = c6533i.l();
                fE2 = c6533i2.l();
            } else if (d.l(i10, aVar.h())) {
                fN = c6533i2.n();
                fN2 = c6533i.n();
            } else {
                if (!d.l(i10, aVar.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                fE = c6533i.e();
                fE2 = c6533i2.e();
            }
            f10 = fE - fE2;
            return Math.max(1.0f, f10);
        }
        fN = c6533i2.k();
        fN2 = c6533i.k();
        f10 = fN - fN2;
        return Math.max(1.0f, f10);
    }

    private static final C6533i h(C6533i c6533i) {
        return new C6533i(c6533i.l(), c6533i.e(), c6533i.l(), c6533i.e());
    }

    private static final void i(InterfaceC2632j interfaceC2632j, V.b bVar) {
        int iA = e0.a(1024);
        if (!interfaceC2632j.h1().k2()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        V.b bVar2 = new V.b(new e.c[16], 0);
        e.c cVarB2 = interfaceC2632j.h1().b2();
        if (cVarB2 == null) {
            AbstractC2633k.c(bVar2, interfaceC2632j.h1());
        } else {
            bVar2.b(cVarB2);
        }
        while (bVar2.u()) {
            e.c cVarG = (e.c) bVar2.z(bVar2.o() - 1);
            if ((cVarG.a2() & iA) == 0) {
                AbstractC2633k.c(bVar2, cVarG);
            } else {
                while (true) {
                    if (cVarG == null) {
                        break;
                    }
                    if ((cVarG.f2() & iA) != 0) {
                        V.b bVar3 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) cVarG;
                                if (focusTargetNode.k2() && !AbstractC2633k.m(focusTargetNode).L0()) {
                                    if (focusTargetNode.I2().o()) {
                                        bVar.b(focusTargetNode);
                                    } else {
                                        i(focusTargetNode, bVar);
                                    }
                                }
                            } else if ((cVarG.f2() & iA) != 0 && (cVarG instanceof AbstractC2635m)) {
                                int i10 = 0;
                                for (e.c cVarE2 = ((AbstractC2635m) cVarG).E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
                                    if ((cVarE2.f2() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarG = cVarE2;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new V.b(new e.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar3.b(cVarG);
                                                cVarG = null;
                                            }
                                            bVar3.b(cVarE2);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarG = AbstractC2633k.g(bVar3);
                        }
                    } else {
                        cVarG = cVarG.b2();
                    }
                }
            }
        }
    }

    private static final FocusTargetNode j(V.b bVar, C6533i c6533i, int i10) {
        C6533i c6533iW;
        d.a aVar = d.f28823b;
        if (d.l(i10, aVar.d())) {
            c6533iW = c6533i.w(c6533i.r() + 1, 0.0f);
        } else if (d.l(i10, aVar.g())) {
            c6533iW = c6533i.w(-(c6533i.r() + 1), 0.0f);
        } else if (d.l(i10, aVar.h())) {
            c6533iW = c6533i.w(0.0f, c6533i.j() + 1);
        } else {
            if (!d.l(i10, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            c6533iW = c6533i.w(0.0f, -(c6533i.j() + 1));
        }
        int iO = bVar.o();
        FocusTargetNode focusTargetNode = null;
        if (iO > 0) {
            Object[] objArrM = bVar.m();
            int i11 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArrM[i11];
                if (t.g(focusTargetNode2)) {
                    C6533i c6533iD = t.d(focusTargetNode2);
                    if (m(c6533iD, c6533iW, c6533i, i10)) {
                        focusTargetNode = focusTargetNode2;
                        c6533iW = c6533iD;
                    }
                }
                i11++;
            } while (i11 < iO);
        }
        return focusTargetNode;
    }

    public static final boolean k(FocusTargetNode focusTargetNode, int i10, InterfaceC6835l interfaceC6835l) {
        C6533i c6533iH;
        V.b bVar = new V.b(new FocusTargetNode[16], 0);
        i(focusTargetNode, bVar);
        if (bVar.o() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (bVar.s() ? null : bVar.m()[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) interfaceC6835l.invoke(focusTargetNode2)).booleanValue();
            }
            return false;
        }
        d.a aVar = d.f28823b;
        if (d.l(i10, aVar.b())) {
            i10 = aVar.g();
        }
        if (d.l(i10, aVar.g()) ? true : d.l(i10, aVar.a())) {
            c6533iH = s(t.d(focusTargetNode));
        } else {
            if (!(d.l(i10, aVar.d()) ? true : d.l(i10, aVar.h()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            c6533iH = h(t.d(focusTargetNode));
        }
        FocusTargetNode focusTargetNodeJ = j(bVar, c6533iH, i10);
        if (focusTargetNodeJ != null) {
            return ((Boolean) interfaceC6835l.invoke(focusTargetNodeJ)).booleanValue();
        }
        return false;
    }

    private static final boolean l(FocusTargetNode focusTargetNode, C6533i c6533i, int i10, InterfaceC6835l interfaceC6835l) {
        if (r(focusTargetNode, c6533i, i10, interfaceC6835l)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i10, new b(focusTargetNode, c6533i, i10, interfaceC6835l));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean m(C6533i c6533i, C6533i c6533i2, C6533i c6533i3, int i10) {
        if (n(c6533i, i10, c6533i3)) {
            return !n(c6533i2, i10, c6533i3) || c(c6533i3, c6533i, c6533i2, i10) || (!c(c6533i3, c6533i2, c6533i, i10) && q(i10, c6533i3, c6533i) < q(i10, c6533i3, c6533i2));
        }
        return false;
    }

    private static final boolean n(C6533i c6533i, int i10, C6533i c6533i2) {
        d.a aVar = d.f28823b;
        if (d.l(i10, aVar.d())) {
            if ((c6533i2.l() <= c6533i.l() && c6533i2.k() < c6533i.l()) || c6533i2.k() <= c6533i.k()) {
                return false;
            }
        } else if (d.l(i10, aVar.g())) {
            if ((c6533i2.k() >= c6533i.k() && c6533i2.l() > c6533i.k()) || c6533i2.l() >= c6533i.l()) {
                return false;
            }
        } else if (d.l(i10, aVar.h())) {
            if ((c6533i2.e() <= c6533i.e() && c6533i2.n() < c6533i.e()) || c6533i2.n() <= c6533i.n()) {
                return false;
            }
        } else {
            if (!d.l(i10, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if ((c6533i2.n() >= c6533i.n() && c6533i2.e() > c6533i.n()) || c6533i2.e() >= c6533i.e()) {
                return false;
            }
        }
        return true;
    }

    private static final float o(C6533i c6533i, int i10, C6533i c6533i2) {
        float fN;
        float fE;
        float fN2;
        float fE2;
        float f10;
        d.a aVar = d.f28823b;
        if (!d.l(i10, aVar.d())) {
            if (d.l(i10, aVar.g())) {
                fN = c6533i.k();
                fE = c6533i2.l();
            } else if (d.l(i10, aVar.h())) {
                fN2 = c6533i2.n();
                fE2 = c6533i.e();
            } else {
                if (!d.l(i10, aVar.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                fN = c6533i.n();
                fE = c6533i2.e();
            }
            f10 = fN - fE;
            return Math.max(0.0f, f10);
        }
        fN2 = c6533i2.k();
        fE2 = c6533i.l();
        f10 = fN2 - fE2;
        return Math.max(0.0f, f10);
    }

    private static final float p(C6533i c6533i, int i10, C6533i c6533i2) {
        float f10;
        float fK;
        float fK2;
        float fR;
        d.a aVar = d.f28823b;
        if (d.l(i10, aVar.d()) ? true : d.l(i10, aVar.g())) {
            f10 = 2;
            fK = c6533i2.n() + (c6533i2.j() / f10);
            fK2 = c6533i.n();
            fR = c6533i.j();
        } else {
            if (!(d.l(i10, aVar.h()) ? true : d.l(i10, aVar.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = 2;
            fK = c6533i2.k() + (c6533i2.r() / f10);
            fK2 = c6533i.k();
            fR = c6533i.r();
        }
        return fK - (fK2 + (fR / f10));
    }

    private static final long q(int i10, C6533i c6533i, C6533i c6533i2) {
        long jAbs = (long) Math.abs(o(c6533i2, i10, c6533i));
        long jAbs2 = (long) Math.abs(p(c6533i2, i10, c6533i));
        return (13 * jAbs * jAbs) + (jAbs2 * jAbs2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(FocusTargetNode focusTargetNode, C6533i c6533i, int i10, InterfaceC6835l interfaceC6835l) {
        FocusTargetNode focusTargetNodeJ;
        V.b bVar = new V.b(new FocusTargetNode[16], 0);
        int iA = e0.a(1024);
        if (!focusTargetNode.h1().k2()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        V.b bVar2 = new V.b(new e.c[16], 0);
        e.c cVarB2 = focusTargetNode.h1().b2();
        if (cVarB2 == null) {
            AbstractC2633k.c(bVar2, focusTargetNode.h1());
        } else {
            bVar2.b(cVarB2);
        }
        while (bVar2.u()) {
            e.c cVarG = (e.c) bVar2.z(bVar2.o() - 1);
            if ((cVarG.a2() & iA) == 0) {
                AbstractC2633k.c(bVar2, cVarG);
            } else {
                while (true) {
                    if (cVarG == null) {
                        break;
                    }
                    if ((cVarG.f2() & iA) != 0) {
                        V.b bVar3 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
                                if (focusTargetNode2.k2()) {
                                    bVar.b(focusTargetNode2);
                                }
                            } else if ((cVarG.f2() & iA) != 0 && (cVarG instanceof AbstractC2635m)) {
                                int i11 = 0;
                                for (e.c cVarE2 = ((AbstractC2635m) cVarG).E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
                                    if ((cVarE2.f2() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarG = cVarE2;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new V.b(new e.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar3.b(cVarG);
                                                cVarG = null;
                                            }
                                            bVar3.b(cVarE2);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarG = AbstractC2633k.g(bVar3);
                        }
                    } else {
                        cVarG = cVarG.b2();
                    }
                }
            }
        }
        while (bVar.u() && (focusTargetNodeJ = j(bVar, c6533i, i10)) != null) {
            if (focusTargetNodeJ.I2().o()) {
                return ((Boolean) interfaceC6835l.invoke(focusTargetNodeJ)).booleanValue();
            }
            if (l(focusTargetNodeJ, c6533i, i10, interfaceC6835l)) {
                return true;
            }
            bVar.x(focusTargetNodeJ);
        }
        return false;
    }

    private static final C6533i s(C6533i c6533i) {
        return new C6533i(c6533i.k(), c6533i.n(), c6533i.k(), c6533i.n());
    }

    public static final Boolean t(FocusTargetNode focusTargetNode, int i10, C6533i c6533i, InterfaceC6835l interfaceC6835l) {
        k0.m mVarK2 = focusTargetNode.K2();
        int[] iArr = a.f28872a;
        int i11 = iArr[mVarK2.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return Boolean.valueOf(k(focusTargetNode, i10, interfaceC6835l));
            }
            if (i11 == 4) {
                return focusTargetNode.I2().o() ? (Boolean) interfaceC6835l.invoke(focusTargetNode) : c6533i == null ? Boolean.valueOf(k(focusTargetNode, i10, interfaceC6835l)) : Boolean.valueOf(r(focusTargetNode, c6533i, i10, interfaceC6835l));
            }
            throw new NoWhenBranchMatchedException();
        }
        FocusTargetNode focusTargetNodeF = t.f(focusTargetNode);
        if (focusTargetNodeF == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i12 = iArr[focusTargetNodeF.K2().ordinal()];
        if (i12 == 1) {
            Boolean boolT = t(focusTargetNodeF, i10, c6533i, interfaceC6835l);
            if (!AbstractC6492s.d(boolT, Boolean.FALSE)) {
                return boolT;
            }
            if (c6533i == null) {
                c6533i = t.d(b(focusTargetNodeF));
            }
            return Boolean.valueOf(l(focusTargetNode, c6533i, i10, interfaceC6835l));
        }
        if (i12 == 2 || i12 == 3) {
            if (c6533i == null) {
                c6533i = t.d(focusTargetNodeF);
            }
            return Boolean.valueOf(l(focusTargetNode, c6533i, i10, interfaceC6835l));
        }
        if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }
}
