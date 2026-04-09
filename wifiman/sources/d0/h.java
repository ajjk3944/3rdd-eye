package D0;

import E0.AbstractC2633k;
import E0.AbstractC2635m;
import E0.C2620a0;
import E0.G;
import E0.InterfaceC2632j;
import E0.e0;
import androidx.compose.ui.e;

/* loaded from: classes.dex */
public interface h extends k, InterfaceC2632j {
    default g S0() {
        return b.f2767a;
    }

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
    @Override // D0.k
    default Object z(c cVar) {
        C2620a0 c2620a0K0;
        if (!h1().k2()) {
            B0.a.a("ModifierLocal accessed from an unattached node");
        }
        int iA = e0.a(32);
        if (!h1().k2()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c cVarH2 = h1().h2();
        G gM = AbstractC2633k.m(this);
        while (gM != null) {
            if ((gM.k0().k().a2() & iA) != 0) {
                while (cVarH2 != null) {
                    if ((cVarH2.f2() & iA) != 0) {
                        AbstractC2635m abstractC2635mG = cVarH2;
                        ?? bVar = 0;
                        while (abstractC2635mG != 0) {
                            if (abstractC2635mG instanceof h) {
                                h hVar = (h) abstractC2635mG;
                                if (hVar.S0().a(cVar)) {
                                    return hVar.S0().b(cVar);
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
        return cVar.a().invoke();
    }
}
