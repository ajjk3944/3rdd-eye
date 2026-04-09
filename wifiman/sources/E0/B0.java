package E0;

import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class B0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final A0 a(InterfaceC2632j interfaceC2632j, Object obj) {
        C2620a0 c2620a0K0;
        int iA = e0.a(262144);
        if (!interfaceC2632j.h1().k2()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c cVarH2 = interfaceC2632j.h1().h2();
        G gM = AbstractC2633k.m(interfaceC2632j);
        while (gM != null) {
            if ((gM.k0().k().a2() & iA) != 0) {
                while (cVarH2 != null) {
                    if ((cVarH2.f2() & iA) != 0) {
                        AbstractC2635m abstractC2635mG = cVarH2;
                        ?? bVar = 0;
                        while (abstractC2635mG != 0) {
                            if (abstractC2635mG instanceof A0) {
                                A0 a02 = (A0) abstractC2635mG;
                                if (AbstractC6492s.d(obj, a02.W())) {
                                    return a02;
                                }
                            } else if ((abstractC2635mG.f2() & iA) != 0 && (abstractC2635mG instanceof AbstractC2635m)) {
                                e.c cVarE2 = abstractC2635mG.E2();
                                int i10 = 0;
                                abstractC2635mG = abstractC2635mG;
                                bVar = bVar;
                                while (cVarE2 != null) {
                                    if ((cVarE2.f2() & iA) != 0) {
                                        i10++;
                                        bVar = bVar;
                                        if (i10 == 1) {
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
                                if (i10 == 1) {
                                }
                            }
                            abstractC2635mG = AbstractC2633k.g(bVar);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final A0 b(A0 a02) {
        C2620a0 c2620a0K0;
        int iA = e0.a(262144);
        if (!a02.h1().k2()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c cVarH2 = a02.h1().h2();
        G gM = AbstractC2633k.m(a02);
        while (gM != null) {
            if ((gM.k0().k().a2() & iA) != 0) {
                while (cVarH2 != null) {
                    if ((cVarH2.f2() & iA) != 0) {
                        AbstractC2635m abstractC2635mG = cVarH2;
                        ?? bVar = 0;
                        while (abstractC2635mG != 0) {
                            if (abstractC2635mG instanceof A0) {
                                A0 a03 = (A0) abstractC2635mG;
                                if (AbstractC6492s.d(a02.W(), a03.W()) && f0.b.a(a02, a03)) {
                                    return a03;
                                }
                            } else if ((abstractC2635mG.f2() & iA) != 0 && (abstractC2635mG instanceof AbstractC2635m)) {
                                e.c cVarE2 = abstractC2635mG.E2();
                                int i10 = 0;
                                abstractC2635mG = abstractC2635mG;
                                bVar = bVar;
                                while (cVarE2 != null) {
                                    if ((cVarE2.f2() & iA) != 0) {
                                        i10++;
                                        bVar = bVar;
                                        if (i10 == 1) {
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
                                if (i10 == 1) {
                                }
                            }
                            abstractC2635mG = AbstractC2633k.g(bVar);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [mh.l] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void c(InterfaceC2632j interfaceC2632j, Object obj, InterfaceC6835l interfaceC6835l) {
        C2620a0 c2620a0K0;
        int iA = e0.a(262144);
        if (!interfaceC2632j.h1().k2()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c cVarH2 = interfaceC2632j.h1().h2();
        G gM = AbstractC2633k.m(interfaceC2632j);
        while (gM != null) {
            if ((gM.k0().k().a2() & iA) != 0) {
                while (cVarH2 != null) {
                    if ((cVarH2.f2() & iA) != 0) {
                        AbstractC2635m abstractC2635mG = cVarH2;
                        ?? bVar = 0;
                        while (abstractC2635mG != 0) {
                            if (abstractC2635mG instanceof A0) {
                                A0 a02 = (A0) abstractC2635mG;
                                if (!(AbstractC6492s.d(obj, a02.W()) ? ((Boolean) interfaceC6835l.invoke(a02)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((abstractC2635mG.f2() & iA) != 0) && (abstractC2635mG instanceof AbstractC2635m)) {
                                    e.c cVarE2 = abstractC2635mG.E2();
                                    int i10 = 0;
                                    abstractC2635mG = abstractC2635mG;
                                    bVar = bVar;
                                    while (cVarE2 != null) {
                                        if ((cVarE2.f2() & iA) != 0) {
                                            i10++;
                                            bVar = bVar;
                                            if (i10 == 1) {
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
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            abstractC2635mG = AbstractC2633k.g(bVar);
                        }
                    }
                    cVarH2 = cVarH2.h2();
                }
            }
            gM = gM.o0();
            cVarH2 = (gM == null || (c2620a0K0 = gM.k0()) == null) ? null : c2620a0K0.o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [mh.l] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void d(A0 a02, InterfaceC6835l interfaceC6835l) {
        C2620a0 c2620a0K0;
        int iA = e0.a(262144);
        if (!a02.h1().k2()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c cVarH2 = a02.h1().h2();
        G gM = AbstractC2633k.m(a02);
        while (gM != null) {
            if ((gM.k0().k().a2() & iA) != 0) {
                while (cVarH2 != null) {
                    if ((cVarH2.f2() & iA) != 0) {
                        AbstractC2635m abstractC2635mG = cVarH2;
                        ?? bVar = 0;
                        while (abstractC2635mG != 0) {
                            boolean zBooleanValue = true;
                            if (abstractC2635mG instanceof A0) {
                                A0 a03 = (A0) abstractC2635mG;
                                if (AbstractC6492s.d(a02.W(), a03.W()) && f0.b.a(a02, a03)) {
                                    zBooleanValue = ((Boolean) interfaceC6835l.invoke(a03)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((abstractC2635mG.f2() & iA) != 0) && (abstractC2635mG instanceof AbstractC2635m)) {
                                    e.c cVarE2 = abstractC2635mG.E2();
                                    int i10 = 0;
                                    abstractC2635mG = abstractC2635mG;
                                    bVar = bVar;
                                    while (cVarE2 != null) {
                                        if ((cVarE2.f2() & iA) != 0) {
                                            i10++;
                                            bVar = bVar;
                                            if (i10 == 1) {
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
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            abstractC2635mG = AbstractC2633k.g(bVar);
                        }
                    }
                    cVarH2 = cVarH2.h2();
                }
            }
            gM = gM.o0();
            cVarH2 = (gM == null || (c2620a0K0 = gM.k0()) == null) ? null : c2620a0K0.o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [mh.l] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void e(InterfaceC2632j interfaceC2632j, Object obj, InterfaceC6835l interfaceC6835l) {
        int iA = e0.a(262144);
        if (!interfaceC2632j.h1().k2()) {
            B0.a.b("visitSubtreeIf called on an unattached node");
        }
        V.b bVar = new V.b(new e.c[16], 0);
        e.c cVarB2 = interfaceC2632j.h1().b2();
        if (cVarB2 == null) {
            AbstractC2633k.c(bVar, interfaceC2632j.h1());
        } else {
            bVar.b(cVarB2);
        }
        while (bVar.u()) {
            e.c cVar = (e.c) bVar.z(bVar.o() - 1);
            if ((cVar.a2() & iA) != 0) {
                for (e.c cVarB22 = cVar; cVarB22 != null; cVarB22 = cVarB22.b2()) {
                    if ((cVarB22.f2() & iA) != 0) {
                        AbstractC2635m abstractC2635mG = cVarB22;
                        ?? bVar2 = 0;
                        while (abstractC2635mG != 0) {
                            if (abstractC2635mG instanceof A0) {
                                A0 a02 = (A0) abstractC2635mG;
                                z0 z0Var = AbstractC6492s.d(obj, a02.W()) ? (z0) interfaceC6835l.invoke(a02) : z0.ContinueTraversal;
                                if (z0Var == z0.CancelTraversal) {
                                    return;
                                }
                                if (z0Var == z0.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((abstractC2635mG.f2() & iA) != 0 && (abstractC2635mG instanceof AbstractC2635m)) {
                                e.c cVarE2 = abstractC2635mG.E2();
                                int i10 = 0;
                                abstractC2635mG = abstractC2635mG;
                                bVar2 = bVar2;
                                while (cVarE2 != null) {
                                    if ((cVarE2.f2() & iA) != 0) {
                                        i10++;
                                        bVar2 = bVar2;
                                        if (i10 == 1) {
                                            abstractC2635mG = cVarE2;
                                        } else {
                                            if (bVar2 == 0) {
                                                bVar2 = new V.b(new e.c[16], 0);
                                            }
                                            if (abstractC2635mG != 0) {
                                                bVar2.b(abstractC2635mG);
                                                abstractC2635mG = 0;
                                            }
                                            bVar2.b(cVarE2);
                                        }
                                    }
                                    cVarE2 = cVarE2.b2();
                                    abstractC2635mG = abstractC2635mG;
                                    bVar2 = bVar2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC2635mG = AbstractC2633k.g(bVar2);
                        }
                    }
                }
            }
            AbstractC2633k.c(bVar, cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [mh.l] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void f(A0 a02, InterfaceC6835l interfaceC6835l) {
        int iA = e0.a(262144);
        if (!a02.h1().k2()) {
            B0.a.b("visitSubtreeIf called on an unattached node");
        }
        V.b bVar = new V.b(new e.c[16], 0);
        e.c cVarB2 = a02.h1().b2();
        if (cVarB2 == null) {
            AbstractC2633k.c(bVar, a02.h1());
        } else {
            bVar.b(cVarB2);
        }
        while (bVar.u()) {
            e.c cVar = (e.c) bVar.z(bVar.o() - 1);
            if ((cVar.a2() & iA) != 0) {
                for (e.c cVarB22 = cVar; cVarB22 != null; cVarB22 = cVarB22.b2()) {
                    if ((cVarB22.f2() & iA) != 0) {
                        AbstractC2635m abstractC2635mG = cVarB22;
                        ?? bVar2 = 0;
                        while (abstractC2635mG != 0) {
                            if (abstractC2635mG instanceof A0) {
                                A0 a03 = (A0) abstractC2635mG;
                                z0 z0Var = (AbstractC6492s.d(a02.W(), a03.W()) && f0.b.a(a02, a03)) ? (z0) interfaceC6835l.invoke(a03) : z0.ContinueTraversal;
                                if (z0Var == z0.CancelTraversal) {
                                    return;
                                }
                                if (z0Var == z0.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((abstractC2635mG.f2() & iA) != 0 && (abstractC2635mG instanceof AbstractC2635m)) {
                                e.c cVarE2 = abstractC2635mG.E2();
                                int i10 = 0;
                                abstractC2635mG = abstractC2635mG;
                                bVar2 = bVar2;
                                while (cVarE2 != null) {
                                    if ((cVarE2.f2() & iA) != 0) {
                                        i10++;
                                        bVar2 = bVar2;
                                        if (i10 == 1) {
                                            abstractC2635mG = cVarE2;
                                        } else {
                                            if (bVar2 == 0) {
                                                bVar2 = new V.b(new e.c[16], 0);
                                            }
                                            if (abstractC2635mG != 0) {
                                                bVar2.b(abstractC2635mG);
                                                abstractC2635mG = 0;
                                            }
                                            bVar2.b(cVarE2);
                                        }
                                    }
                                    cVarE2 = cVarE2.b2();
                                    abstractC2635mG = abstractC2635mG;
                                    bVar2 = bVar2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC2635mG = AbstractC2633k.g(bVar2);
                        }
                    }
                }
            }
            AbstractC2633k.c(bVar, cVar);
        }
    }
}
