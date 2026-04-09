package androidx.compose.ui.focus;

import C0.AbstractC2538s;
import E0.AbstractC2624c0;
import E0.AbstractC2633k;
import E0.AbstractC2635m;
import E0.C2620a0;
import E0.G;
import E0.e0;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6533i;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class t {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28864a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f28865b;

        static {
            int[] iArr = new int[Y0.t.values().length];
            try {
                iArr[Y0.t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Y0.t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28864a = iArr;
            int[] iArr2 = new int[k0.m.values().length];
            try {
                iArr2[k0.m.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[k0.m.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[k0.m.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[k0.m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f28865b = iArr2;
        }
    }

    public static final o a(FocusTargetNode focusTargetNode, int i10, Y0.t tVar) {
        o oVarU;
        k kVarI2 = focusTargetNode.I2();
        d.a aVar = d.f28823b;
        if (d.l(i10, aVar.e())) {
            return kVarI2.f();
        }
        if (d.l(i10, aVar.f())) {
            return kVarI2.r();
        }
        if (d.l(i10, aVar.h())) {
            return kVarI2.s();
        }
        if (d.l(i10, aVar.a())) {
            return kVarI2.v();
        }
        if (d.l(i10, aVar.d())) {
            int i11 = a.f28864a[tVar.ordinal()];
            if (i11 == 1) {
                oVarU = kVarI2.e();
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                oVarU = kVarI2.u();
            }
            if (oVarU == o.f28853b.b()) {
                oVarU = null;
            }
            if (oVarU == null) {
                return kVarI2.c();
            }
        } else {
            if (!d.l(i10, aVar.g())) {
                if (d.l(i10, aVar.b())) {
                    return (o) kVarI2.x().invoke(d.i(i10));
                }
                if (d.l(i10, aVar.c())) {
                    return (o) kVarI2.t().invoke(d.i(i10));
                }
                throw new IllegalStateException("invalid FocusDirection");
            }
            int i12 = a.f28864a[tVar.ordinal()];
            if (i12 == 1) {
                oVarU = kVarI2.u();
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                oVarU = kVarI2.e();
            }
            if (oVarU == o.f28853b.b()) {
                oVarU = null;
            }
            if (oVarU == null) {
                return kVarI2.n();
            }
        }
        return oVarU;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x004f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetNode b(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            k0.m r0 = r10.K2()
            int[] r1 = androidx.compose.ui.focus.t.a.f28865b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto Ld3
            r2 = 2
            r3 = 0
            if (r0 == r2) goto L20
            r1 = 3
            if (r0 == r1) goto Ld3
            r10 = 4
            if (r0 != r10) goto L1a
            return r3
        L1a:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L20:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = E0.e0.a(r0)
            androidx.compose.ui.e$c r2 = r10.h1()
            boolean r2 = r2.k2()
            if (r2 == 0) goto Lcb
            V.b r2 = new V.b
            r4 = 16
            androidx.compose.ui.e$c[] r5 = new androidx.compose.ui.e.c[r4]
            r6 = 0
            r2.<init>(r5, r6)
            androidx.compose.ui.e$c r5 = r10.h1()
            androidx.compose.ui.e$c r5 = r5.b2()
            if (r5 != 0) goto L4c
            androidx.compose.ui.e$c r10 = r10.h1()
            E0.AbstractC2633k.a(r2, r10)
            goto L4f
        L4c:
            r2.b(r5)
        L4f:
            boolean r10 = r2.u()
            if (r10 == 0) goto Lca
            int r10 = r2.o()
            int r10 = r10 - r1
            java.lang.Object r10 = r2.z(r10)
            androidx.compose.ui.e$c r10 = (androidx.compose.ui.e.c) r10
            int r5 = r10.a2()
            r5 = r5 & r0
            if (r5 != 0) goto L6b
            E0.AbstractC2633k.a(r2, r10)
            goto L4f
        L6b:
            if (r10 == 0) goto L4f
            int r5 = r10.f2()
            r5 = r5 & r0
            if (r5 == 0) goto Lc5
            r5 = r3
        L75:
            if (r10 == 0) goto L4f
            boolean r7 = r10 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L84
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            androidx.compose.ui.focus.FocusTargetNode r10 = b(r10)
            if (r10 == 0) goto Lc0
            return r10
        L84:
            int r7 = r10.f2()
            r7 = r7 & r0
            if (r7 == 0) goto Lc0
            boolean r7 = r10 instanceof E0.AbstractC2635m
            if (r7 == 0) goto Lc0
            r7 = r10
            E0.m r7 = (E0.AbstractC2635m) r7
            androidx.compose.ui.e$c r7 = r7.E2()
            r8 = r6
        L97:
            if (r7 == 0) goto Lbd
            int r9 = r7.f2()
            r9 = r9 & r0
            if (r9 == 0) goto Lb8
            int r8 = r8 + 1
            if (r8 != r1) goto La6
            r10 = r7
            goto Lb8
        La6:
            if (r5 != 0) goto Laf
            V.b r5 = new V.b
            androidx.compose.ui.e$c[] r9 = new androidx.compose.ui.e.c[r4]
            r5.<init>(r9, r6)
        Laf:
            if (r10 == 0) goto Lb5
            r5.b(r10)
            r10 = r3
        Lb5:
            r5.b(r7)
        Lb8:
            androidx.compose.ui.e$c r7 = r7.b2()
            goto L97
        Lbd:
            if (r8 != r1) goto Lc0
            goto L75
        Lc0:
            androidx.compose.ui.e$c r10 = E0.AbstractC2633k.b(r5)
            goto L75
        Lc5:
            androidx.compose.ui.e$c r10 = r10.b2()
            goto L6b
        Lca:
            return r3
        Lcb:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            r10.<init>(r0)
            throw r10
        Ld3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.t.b(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    private static final FocusTargetNode c(FocusTargetNode focusTargetNode) {
        C2620a0 c2620a0K0;
        int iA = e0.a(1024);
        if (!focusTargetNode.h1().k2()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c cVarH2 = focusTargetNode.h1().h2();
        G gM = AbstractC2633k.m(focusTargetNode);
        while (gM != null) {
            if ((gM.k0().k().a2() & iA) != 0) {
                while (cVarH2 != null) {
                    if ((cVarH2.f2() & iA) != 0) {
                        e.c cVarG = cVarH2;
                        V.b bVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
                                if (focusTargetNode2.I2().o()) {
                                    return focusTargetNode2;
                                }
                            } else if ((cVarG.f2() & iA) != 0 && (cVarG instanceof AbstractC2635m)) {
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
        return null;
    }

    public static final C6533i d(FocusTargetNode focusTargetNode) {
        C6533i c6533iJ;
        AbstractC2624c0 abstractC2624c0C2 = focusTargetNode.c2();
        return (abstractC2624c0C2 == null || (c6533iJ = AbstractC2538s.d(abstractC2624c0C2).J(abstractC2624c0C2, false)) == null) ? C6533i.f52340e.a() : c6533iJ;
    }

    public static final Boolean e(FocusTargetNode focusTargetNode, int i10, Y0.t tVar, C6533i c6533i, InterfaceC6835l interfaceC6835l) {
        int iG;
        d.a aVar = d.f28823b;
        if (d.l(i10, aVar.e()) ? true : d.l(i10, aVar.f())) {
            return Boolean.valueOf(v.f(focusTargetNode, i10, interfaceC6835l));
        }
        if (d.l(i10, aVar.d()) ? true : d.l(i10, aVar.g()) ? true : d.l(i10, aVar.h()) ? true : d.l(i10, aVar.a())) {
            return w.t(focusTargetNode, i10, c6533i, interfaceC6835l);
        }
        if (!d.l(i10, aVar.b())) {
            if (d.l(i10, aVar.c())) {
                FocusTargetNode focusTargetNodeB = b(focusTargetNode);
                FocusTargetNode focusTargetNodeC = focusTargetNodeB != null ? c(focusTargetNodeB) : null;
                return Boolean.valueOf((focusTargetNodeC == null || AbstractC6492s.d(focusTargetNodeC, focusTargetNode)) ? false : ((Boolean) interfaceC6835l.invoke(focusTargetNodeC)).booleanValue());
            }
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) d.n(i10))).toString());
        }
        int i11 = a.f28864a[tVar.ordinal()];
        if (i11 == 1) {
            iG = aVar.g();
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iG = aVar.d();
        }
        FocusTargetNode focusTargetNodeB2 = b(focusTargetNode);
        if (focusTargetNodeB2 != null) {
            return w.t(focusTargetNodeB2, iG, c6533i, interfaceC6835l);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x003b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetNode f(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            androidx.compose.ui.e$c r0 = r10.h1()
            boolean r0 = r0.k2()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = E0.e0.a(r0)
            androidx.compose.ui.e$c r2 = r10.h1()
            boolean r2 = r2.k2()
            if (r2 == 0) goto Ld1
            V.b r2 = new V.b
            r3 = 16
            androidx.compose.ui.e$c[] r4 = new androidx.compose.ui.e.c[r3]
            r5 = 0
            r2.<init>(r4, r5)
            androidx.compose.ui.e$c r4 = r10.h1()
            androidx.compose.ui.e$c r4 = r4.b2()
            if (r4 != 0) goto L38
            androidx.compose.ui.e$c r10 = r10.h1()
            E0.AbstractC2633k.a(r2, r10)
            goto L3b
        L38:
            r2.b(r4)
        L3b:
            boolean r10 = r2.u()
            if (r10 == 0) goto Ld0
            int r10 = r2.o()
            r4 = 1
            int r10 = r10 - r4
            java.lang.Object r10 = r2.z(r10)
            androidx.compose.ui.e$c r10 = (androidx.compose.ui.e.c) r10
            int r6 = r10.a2()
            r6 = r6 & r0
            if (r6 != 0) goto L58
            E0.AbstractC2633k.a(r2, r10)
            goto L3b
        L58:
            if (r10 == 0) goto L3b
            int r6 = r10.f2()
            r6 = r6 & r0
            if (r6 == 0) goto Lcb
            r6 = r1
        L62:
            if (r10 == 0) goto L3b
            boolean r7 = r10 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L8a
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            androidx.compose.ui.e$c r7 = r10.h1()
            boolean r7 = r7.k2()
            if (r7 == 0) goto Lc6
            k0.m r7 = r10.K2()
            int[] r8 = androidx.compose.ui.focus.t.a.f28865b
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r4) goto L89
            r8 = 2
            if (r7 == r8) goto L89
            r8 = 3
            if (r7 == r8) goto L89
            goto Lc6
        L89:
            return r10
        L8a:
            int r7 = r10.f2()
            r7 = r7 & r0
            if (r7 == 0) goto Lc6
            boolean r7 = r10 instanceof E0.AbstractC2635m
            if (r7 == 0) goto Lc6
            r7 = r10
            E0.m r7 = (E0.AbstractC2635m) r7
            androidx.compose.ui.e$c r7 = r7.E2()
            r8 = r5
        L9d:
            if (r7 == 0) goto Lc3
            int r9 = r7.f2()
            r9 = r9 & r0
            if (r9 == 0) goto Lbe
            int r8 = r8 + 1
            if (r8 != r4) goto Lac
            r10 = r7
            goto Lbe
        Lac:
            if (r6 != 0) goto Lb5
            V.b r6 = new V.b
            androidx.compose.ui.e$c[] r9 = new androidx.compose.ui.e.c[r3]
            r6.<init>(r9, r5)
        Lb5:
            if (r10 == 0) goto Lbb
            r6.b(r10)
            r10 = r1
        Lbb:
            r6.b(r7)
        Lbe:
            androidx.compose.ui.e$c r7 = r7.b2()
            goto L9d
        Lc3:
            if (r8 != r4) goto Lc6
            goto L62
        Lc6:
            androidx.compose.ui.e$c r10 = E0.AbstractC2633k.b(r6)
            goto L62
        Lcb:
            androidx.compose.ui.e$c r10 = r10.b2()
            goto L58
        Ld0:
            return r1
        Ld1:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.t.f(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean g(FocusTargetNode focusTargetNode) {
        G gG1;
        AbstractC2624c0 abstractC2624c0C2;
        G gG12;
        AbstractC2624c0 abstractC2624c0C22 = focusTargetNode.c2();
        return (abstractC2624c0C22 == null || (gG1 = abstractC2624c0C22.G1()) == null || !gG1.q() || (abstractC2624c0C2 = focusTargetNode.c2()) == null || (gG12 = abstractC2624c0C2.G1()) == null || !gG12.K0()) ? false : true;
    }
}
