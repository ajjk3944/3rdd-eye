package k0;

import E0.AbstractC2633k;
import E0.AbstractC2635m;
import E0.C2620a0;
import E0.G;
import E0.e0;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;

/* loaded from: classes.dex */
public abstract class c {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51004a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f51004a = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0095, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final k0.l a(k0.InterfaceC6354b r12) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.c.a(k0.b):k0.l");
    }

    public static final void b(InterfaceC6354b interfaceC6354b) {
        AbstractC2633k.n(interfaceC6354b).getFocusOwner().j(interfaceC6354b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void c(FocusTargetNode focusTargetNode) {
        C2620a0 c2620a0K0;
        int iA = e0.a(4096);
        int iA2 = e0.a(1024);
        e.c cVarH1 = focusTargetNode.h1();
        int i10 = iA | iA2;
        if (!focusTargetNode.h1().k2()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c cVarH12 = focusTargetNode.h1();
        G gM = AbstractC2633k.m(focusTargetNode);
        while (gM != null) {
            if ((gM.k0().k().a2() & i10) != 0) {
                while (cVarH12 != null) {
                    if ((cVarH12.f2() & i10) != 0) {
                        if (cVarH12 != cVarH1 && (cVarH12.f2() & iA2) != 0) {
                            return;
                        }
                        if ((cVarH12.f2() & iA) != 0) {
                            AbstractC2635m abstractC2635mG = cVarH12;
                            ?? bVar = 0;
                            while (abstractC2635mG != 0) {
                                if (abstractC2635mG instanceof InterfaceC6354b) {
                                    InterfaceC6354b interfaceC6354b = (InterfaceC6354b) abstractC2635mG;
                                    interfaceC6354b.J1(a(interfaceC6354b));
                                } else if ((abstractC2635mG.f2() & iA) != 0 && (abstractC2635mG instanceof AbstractC2635m)) {
                                    e.c cVarE2 = abstractC2635mG.E2();
                                    int i11 = 0;
                                    abstractC2635mG = abstractC2635mG;
                                    bVar = bVar;
                                    while (cVarE2 != null) {
                                        if ((cVarE2.f2() & iA) != 0) {
                                            i11++;
                                            bVar = bVar;
                                            if (i11 == 1) {
                                                abstractC2635mG = cVarE2;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new V.b(new e.c[16], 0);
                                                }
                                                if (abstractC2635mG != 0) {
                                                    bVar.b(abstractC2635mG);
                                                    abstractC2635mG = 0;
                                                }
                                                bVar.b(cVarE2);
                                            }
                                        }
                                        cVarE2 = cVarE2.b2();
                                        abstractC2635mG = abstractC2635mG;
                                        bVar = bVar;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC2635mG = AbstractC2633k.g(bVar);
                            }
                        }
                    }
                    cVarH12 = cVarH12.h2();
                }
            }
            gM = gM.o0();
            cVarH12 = (gM == null || (c2620a0K0 = gM.k0()) == null) ? null : c2620a0K0.o();
        }
    }
}
