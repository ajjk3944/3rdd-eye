package androidx.compose.ui.focus;

import E0.AbstractC2633k;
import E0.AbstractC2635m;
import E0.C2620a0;
import E0.G;
import E0.e0;
import E0.i0;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.o;
import k0.EnumC6353a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public abstract class s {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28860a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f28861b;

        static {
            int[] iArr = new int[EnumC6353a.values().length];
            try {
                iArr[EnumC6353a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6353a.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6353a.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6353a.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f28860a = iArr;
            int[] iArr2 = new int[k0.m.values().length];
            try {
                iArr2[k0.m.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[k0.m.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[k0.m.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[k0.m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f28861b = iArr2;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f28862a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode) {
            super(0);
            this.f28862a = focusTargetNode;
        }

        public final void a() {
            this.f28862a.I2();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f28863a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FocusTargetNode focusTargetNode) {
            super(0);
            this.f28863a = focusTargetNode;
        }

        public final void a() {
            if (this.f28863a.h1().k2()) {
                k0.c.c(this.f28863a);
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    private static final boolean a(FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        FocusTargetNode focusTargetNodeF = t.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return c(focusTargetNodeF, z10, z11);
        }
        return true;
    }

    static /* synthetic */ boolean b(FocusTargetNode focusTargetNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return a(focusTargetNode, z10, z11);
    }

    public static final boolean c(FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        int i10 = a.f28861b[focusTargetNode.K2().ordinal()];
        if (i10 == 1) {
            focusTargetNode.Q2(k0.m.Inactive);
            if (z11) {
                k0.c.c(focusTargetNode);
            }
        } else {
            if (i10 == 2) {
                if (!z10) {
                    return z10;
                }
                focusTargetNode.Q2(k0.m.Inactive);
                if (!z11) {
                    return z10;
                }
                k0.c.c(focusTargetNode);
                return z10;
            }
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (!a(focusTargetNode, z10, z11)) {
                    return false;
                }
                focusTargetNode.Q2(k0.m.Inactive);
                if (z11) {
                    k0.c.c(focusTargetNode);
                }
            }
        }
        return true;
    }

    private static final boolean d(FocusTargetNode focusTargetNode) {
        i0.a(focusTargetNode, new b(focusTargetNode));
        int i10 = a.f28861b[focusTargetNode.K2().ordinal()];
        if (i10 != 3 && i10 != 4) {
            return true;
        }
        focusTargetNode.Q2(k0.m.Active);
        return true;
    }

    public static final EnumC6353a e(FocusTargetNode focusTargetNode, int i10) {
        int i11 = a.f28861b[focusTargetNode.K2().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return EnumC6353a.Cancelled;
            }
            if (i11 == 3) {
                EnumC6353a enumC6353aE = e(n(focusTargetNode), i10);
                if (enumC6353aE == EnumC6353a.None) {
                    enumC6353aE = null;
                }
                return enumC6353aE == null ? g(focusTargetNode, i10) : enumC6353aE;
            }
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return EnumC6353a.None;
    }

    private static final EnumC6353a f(FocusTargetNode focusTargetNode, int i10) {
        if (!focusTargetNode.f28814o) {
            focusTargetNode.f28814o = true;
            try {
                o oVar = (o) focusTargetNode.I2().x().invoke(d.i(i10));
                o.a aVar = o.f28853b;
                if (oVar != aVar.b()) {
                    if (oVar == aVar.a()) {
                        return EnumC6353a.Cancelled;
                    }
                    return oVar.d() ? EnumC6353a.Redirected : EnumC6353a.RedirectCancelled;
                }
            } finally {
                focusTargetNode.f28814o = false;
            }
        }
        return EnumC6353a.None;
    }

    private static final EnumC6353a g(FocusTargetNode focusTargetNode, int i10) {
        if (!focusTargetNode.f28813n) {
            focusTargetNode.f28813n = true;
            try {
                o oVar = (o) focusTargetNode.I2().t().invoke(d.i(i10));
                o.a aVar = o.f28853b;
                if (oVar != aVar.b()) {
                    if (oVar == aVar.a()) {
                        return EnumC6353a.Cancelled;
                    }
                    return oVar.d() ? EnumC6353a.Redirected : EnumC6353a.RedirectCancelled;
                }
            } finally {
                focusTargetNode.f28813n = false;
            }
        }
        return EnumC6353a.None;
    }

    public static final EnumC6353a h(FocusTargetNode focusTargetNode, int i10) {
        e.c cVarG;
        C2620a0 c2620a0K0;
        int i11 = a.f28861b[focusTargetNode.K2().ordinal()];
        if (i11 == 1 || i11 == 2) {
            return EnumC6353a.None;
        }
        if (i11 == 3) {
            return e(n(focusTargetNode), i10);
        }
        if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int iA = e0.a(1024);
        if (!focusTargetNode.h1().k2()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c cVarH2 = focusTargetNode.h1().h2();
        G gM = AbstractC2633k.m(focusTargetNode);
        loop0: while (true) {
            if (gM == null) {
                cVarG = null;
                break;
            }
            if ((gM.k0().k().a2() & iA) != 0) {
                while (cVarH2 != null) {
                    if ((cVarH2.f2() & iA) != 0) {
                        cVarG = cVarH2;
                        V.b bVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVarG.f2() & iA) != 0 && (cVarG instanceof AbstractC2635m)) {
                                int i12 = 0;
                                for (e.c cVarE2 = ((AbstractC2635m) cVarG).E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
                                    if ((cVarE2.f2() & iA) != 0) {
                                        i12++;
                                        if (i12 == 1) {
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
                                if (i12 == 1) {
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
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
        if (focusTargetNode2 == null) {
            return EnumC6353a.None;
        }
        int i13 = a.f28861b[focusTargetNode2.K2().ordinal()];
        if (i13 == 1) {
            return f(focusTargetNode2, i10);
        }
        if (i13 == 2) {
            return EnumC6353a.Cancelled;
        }
        if (i13 == 3) {
            return h(focusTargetNode2, i10);
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        EnumC6353a enumC6353aH = h(focusTargetNode2, i10);
        EnumC6353a enumC6353a = enumC6353aH != EnumC6353a.None ? enumC6353aH : null;
        return enumC6353a == null ? f(focusTargetNode2, i10) : enumC6353a;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean i(androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.s.i(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    public static final boolean j(FocusTargetNode focusTargetNode) {
        Boolean boolK = k(focusTargetNode, d.f28823b.b());
        if (boolK != null) {
            return boolK.booleanValue();
        }
        return false;
    }

    public static final Boolean k(FocusTargetNode focusTargetNode, int i10) {
        Boolean boolValueOf;
        k0.q qVarD = k0.p.d(focusTargetNode);
        c cVar = new c(focusTargetNode);
        try {
            if (qVarD.f51016c) {
                qVarD.g();
            }
            qVarD.f();
            qVarD.f51015b.b(cVar);
            int i11 = a.f28860a[h(focusTargetNode, i10).ordinal()];
            if (i11 == 1) {
                boolValueOf = Boolean.valueOf(i(focusTargetNode));
            } else if (i11 != 2) {
                if (i11 != 3 && i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.TRUE;
            }
            return boolValueOf;
        } finally {
            qVarD.h();
        }
    }

    private static final boolean l(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        e.c cVar;
        e.c cVarG;
        C2620a0 c2620a0K0;
        C2620a0 c2620a0K02;
        int iA = e0.a(1024);
        if (!focusTargetNode2.h1().k2()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c cVarH2 = focusTargetNode2.h1().h2();
        G gM = AbstractC2633k.m(focusTargetNode2);
        loop0: while (true) {
            cVar = null;
            if (gM == null) {
                cVarG = null;
                break;
            }
            if ((gM.k0().k().a2() & iA) != 0) {
                while (cVarH2 != null) {
                    if ((cVarH2.f2() & iA) != 0) {
                        cVarG = cVarH2;
                        V.b bVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
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
            cVarH2 = (gM == null || (c2620a0K02 = gM.k0()) == null) ? null : c2620a0K02.o();
        }
        if (!AbstractC6492s.d(cVarG, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int i11 = a.f28861b[focusTargetNode.K2().ordinal()];
        if (i11 == 1) {
            boolean zD = d(focusTargetNode2);
            if (!zD) {
                return zD;
            }
            focusTargetNode.Q2(k0.m.ActiveParent);
            return zD;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                n(focusTargetNode);
                if (b(focusTargetNode, false, false, 3, null) && d(focusTargetNode2)) {
                    return true;
                }
            } else {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int iA2 = e0.a(1024);
                if (!focusTargetNode.h1().k2()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                e.c cVarH22 = focusTargetNode.h1().h2();
                G gM2 = AbstractC2633k.m(focusTargetNode);
                loop4: while (true) {
                    if (gM2 == null) {
                        break;
                    }
                    if ((gM2.k0().k().a2() & iA2) != 0) {
                        while (cVarH22 != null) {
                            if ((cVarH22.f2() & iA2) != 0) {
                                e.c cVarG2 = cVarH22;
                                V.b bVar2 = null;
                                while (cVarG2 != null) {
                                    if (cVarG2 instanceof FocusTargetNode) {
                                        cVar = cVarG2;
                                        break loop4;
                                    }
                                    if ((cVarG2.f2() & iA2) != 0 && (cVarG2 instanceof AbstractC2635m)) {
                                        int i12 = 0;
                                        for (e.c cVarE22 = ((AbstractC2635m) cVarG2).E2(); cVarE22 != null; cVarE22 = cVarE22.b2()) {
                                            if ((cVarE22.f2() & iA2) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    cVarG2 = cVarE22;
                                                } else {
                                                    if (bVar2 == null) {
                                                        bVar2 = new V.b(new e.c[16], 0);
                                                    }
                                                    if (cVarG2 != null) {
                                                        bVar2.b(cVarG2);
                                                        cVarG2 = null;
                                                    }
                                                    bVar2.b(cVarE22);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    cVarG2 = AbstractC2633k.g(bVar2);
                                }
                            }
                            cVarH22 = cVarH22.h2();
                        }
                    }
                    gM2 = gM2.o0();
                    cVarH22 = (gM2 == null || (c2620a0K0 = gM2.k0()) == null) ? null : c2620a0K0.o();
                }
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar;
                if (focusTargetNode3 == null && m(focusTargetNode)) {
                    boolean zD2 = d(focusTargetNode2);
                    if (!zD2) {
                        return zD2;
                    }
                    focusTargetNode.Q2(k0.m.ActiveParent);
                    return zD2;
                }
                if (focusTargetNode3 != null && l(focusTargetNode3, focusTargetNode)) {
                    boolean zL = l(focusTargetNode, focusTargetNode2);
                    if (focusTargetNode.K2() != k0.m.ActiveParent) {
                        throw new IllegalStateException("Deactivated node is focused");
                    }
                    if (!zL) {
                        return zL;
                    }
                    k0.c.c(focusTargetNode3);
                    return zL;
                }
            }
        }
        return false;
    }

    private static final boolean m(FocusTargetNode focusTargetNode) {
        return AbstractC2633k.n(focusTargetNode).getFocusOwner().q(null, null);
    }

    private static final FocusTargetNode n(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeF = t.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return focusTargetNodeF;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
