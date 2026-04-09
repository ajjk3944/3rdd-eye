package androidx.compose.ui.focus;

import C0.InterfaceC2525e;
import E0.AbstractC2633k;
import E0.AbstractC2635m;
import E0.C2620a0;
import E0.G;
import E0.e0;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import sh.C7974i;

/* loaded from: classes.dex */
public abstract class v {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28867a;

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
            f28867a = iArr;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f28868a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f28869b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28870c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f28871d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f28868a = focusTargetNode;
            this.f28869b = focusTargetNode2;
            this.f28870c = i10;
            this.f28871d = interfaceC6835l;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC2525e.a aVar) {
            boolean zI = v.i(this.f28868a, this.f28869b, this.f28870c, this.f28871d);
            Boolean boolValueOf = Boolean.valueOf(zI);
            if (zI || !aVar.a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final boolean b(FocusTargetNode focusTargetNode, InterfaceC6835l interfaceC6835l) {
        k0.m mVarK2 = focusTargetNode.K2();
        int[] iArr = a.f28867a;
        int i10 = iArr[mVarK2.ordinal()];
        if (i10 == 1) {
            FocusTargetNode focusTargetNodeF = t.f(focusTargetNode);
            if (focusTargetNodeF == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            int i11 = iArr[focusTargetNodeF.K2().ordinal()];
            if (i11 != 1) {
                if (i11 == 2 || i11 == 3) {
                    return d(focusTargetNode, focusTargetNodeF, d.f28823b.f(), interfaceC6835l);
                }
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (!b(focusTargetNodeF, interfaceC6835l) && !d(focusTargetNode, focusTargetNodeF, d.f28823b.f(), interfaceC6835l) && (!focusTargetNodeF.I2().o() || !((Boolean) interfaceC6835l.invoke(focusTargetNodeF)).booleanValue())) {
                return false;
            }
        } else {
            if (i10 == 2 || i10 == 3) {
                return g(focusTargetNode, interfaceC6835l);
            }
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!g(focusTargetNode, interfaceC6835l)) {
                if (!(focusTargetNode.I2().o() ? ((Boolean) interfaceC6835l.invoke(focusTargetNode)).booleanValue() : false)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final boolean c(FocusTargetNode focusTargetNode, InterfaceC6835l interfaceC6835l) {
        int i10 = a.f28867a[focusTargetNode.K2().ordinal()];
        if (i10 == 1) {
            FocusTargetNode focusTargetNodeF = t.f(focusTargetNode);
            if (focusTargetNodeF != null) {
                return c(focusTargetNodeF, interfaceC6835l) || d(focusTargetNode, focusTargetNodeF, d.f28823b.e(), interfaceC6835l);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (i10 == 2 || i10 == 3) {
            return h(focusTargetNode, interfaceC6835l);
        }
        if (i10 == 4) {
            return focusTargetNode.I2().o() ? ((Boolean) interfaceC6835l.invoke(focusTargetNode)).booleanValue() : h(focusTargetNode, interfaceC6835l);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean d(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, InterfaceC6835l interfaceC6835l) {
        if (i(focusTargetNode, focusTargetNode2, i10, interfaceC6835l)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i10, new b(focusTargetNode, focusTargetNode2, i10, interfaceC6835l));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean e(FocusTargetNode focusTargetNode) {
        e.c cVar;
        C2620a0 c2620a0K0;
        int iA = e0.a(1024);
        if (!focusTargetNode.h1().k2()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c cVarH2 = focusTargetNode.h1().h2();
        G gM = AbstractC2633k.m(focusTargetNode);
        loop0: while (true) {
            cVar = null;
            if (gM == null) {
                break;
            }
            if ((gM.k0().k().a2() & iA) != 0) {
                while (cVarH2 != null) {
                    if ((cVarH2.f2() & iA) != 0) {
                        e.c cVarG = cVarH2;
                        V.b bVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                cVar = cVarG;
                                break loop0;
                            }
                            if ((cVarG.f2() & iA) != 0 && (cVarG instanceof AbstractC2635m)) {
                                int i10 = 0;
                                for (e.c cVarE2 = ((AbstractC2635m) cVarG).E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
                                    if ((cVarE2.f2() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarG = cVarE2;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new V.b(new e.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar.b(cVarG);
                                                cVarG = null;
                                            }
                                            bVar.b(cVarE2);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarG = AbstractC2633k.g(bVar);
                        }
                    }
                    cVarH2 = cVarH2.h2();
                }
            }
            gM = gM.o0();
            cVarH2 = (gM == null || (c2620a0K0 = gM.k0()) == null) ? null : c2620a0K0.o();
        }
        return cVar == null;
    }

    public static final boolean f(FocusTargetNode focusTargetNode, int i10, InterfaceC6835l interfaceC6835l) {
        d.a aVar = d.f28823b;
        if (d.l(i10, aVar.e())) {
            return c(focusTargetNode, interfaceC6835l);
        }
        if (d.l(i10, aVar.f())) {
            return b(focusTargetNode, interfaceC6835l);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    private static final boolean g(FocusTargetNode focusTargetNode, InterfaceC6835l interfaceC6835l) {
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
                                bVar.b((FocusTargetNode) cVarG);
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
        bVar.F(u.f28866a);
        int iO = bVar.o();
        if (iO > 0) {
            int i11 = iO - 1;
            Object[] objArrM = bVar.m();
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArrM[i11];
                if (t.g(focusTargetNode2) && b(focusTargetNode2, interfaceC6835l)) {
                    return true;
                }
                i11--;
            } while (i11 >= 0);
        }
        return false;
    }

    private static final boolean h(FocusTargetNode focusTargetNode, InterfaceC6835l interfaceC6835l) {
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
                                bVar.b((FocusTargetNode) cVarG);
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
        bVar.F(u.f28866a);
        int iO = bVar.o();
        if (iO <= 0) {
            return false;
        }
        Object[] objArrM = bVar.m();
        int i11 = 0;
        do {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArrM[i11];
            if (t.g(focusTargetNode2) && c(focusTargetNode2, interfaceC6835l)) {
                return true;
            }
            i11++;
        } while (i11 < iO);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, InterfaceC6835l interfaceC6835l) {
        if (focusTargetNode.K2() != k0.m.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
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
                                bVar.b((FocusTargetNode) cVarG);
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
        bVar.F(u.f28866a);
        d.a aVar = d.f28823b;
        if (d.l(i10, aVar.e())) {
            C7974i c7974i = new C7974i(0, bVar.o() - 1);
            int i12 = c7974i.i();
            int iJ = c7974i.j();
            if (i12 <= iJ) {
                boolean z10 = false;
                while (true) {
                    if (z10) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) bVar.m()[i12];
                        if (t.g(focusTargetNode3) && c(focusTargetNode3, interfaceC6835l)) {
                            return true;
                        }
                    }
                    if (AbstractC6492s.d(bVar.m()[i12], focusTargetNode2)) {
                        z10 = true;
                    }
                    if (i12 == iJ) {
                        break;
                    }
                    i12++;
                }
            }
        } else {
            if (!d.l(i10, aVar.f())) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            C7974i c7974i2 = new C7974i(0, bVar.o() - 1);
            int i13 = c7974i2.i();
            int iJ2 = c7974i2.j();
            if (i13 <= iJ2) {
                boolean z11 = false;
                while (true) {
                    if (z11) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) bVar.m()[iJ2];
                        if (t.g(focusTargetNode4) && b(focusTargetNode4, interfaceC6835l)) {
                            return true;
                        }
                    }
                    if (AbstractC6492s.d(bVar.m()[iJ2], focusTargetNode2)) {
                        z11 = true;
                    }
                    if (iJ2 == i13) {
                        break;
                    }
                    iJ2--;
                }
            }
        }
        if (d.l(i10, d.f28823b.e()) || !focusTargetNode.I2().o() || e(focusTargetNode)) {
            return false;
        }
        return ((Boolean) interfaceC6835l.invoke(focusTargetNode)).booleanValue();
    }
}
