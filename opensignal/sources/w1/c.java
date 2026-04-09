package w1;

import oh.p;
import p0.e;
import x1.f0;
import x1.i;
import x1.j;
import x1.k;
import x1.v1;
import z0.l;

/* loaded from: classes.dex */
public interface c extends i {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [w1.c, x1.i] */
    default Object B(p pVar) {
        al.c cVar;
        l lVar = (l) this;
        if (!lVar.f26495b.f26506o) {
            u1.a.a("ModifierLocal accessed from an unattached node");
        }
        if (!lVar.f26495b.f26506o) {
            u1.a.b("visitAncestors called on an unattached node");
        }
        l lVar2 = lVar.f26495b.f26499f;
        f0 f0VarR = k.r(this);
        while (f0VarR != null) {
            if ((((l) f0VarR.D.f825g).f26498e & 32) != 0) {
                while (lVar2 != null) {
                    if ((lVar2.f26497d & 32) != 0) {
                        j jVarE = lVar2;
                        ?? eVar = 0;
                        while (jVarE != 0) {
                            if (jVarE instanceof c) {
                                c cVar2 = (c) jVarE;
                                if (cVar2.w().a()) {
                                    cVar2.w().b();
                                    throw null;
                                }
                            } else if ((jVarE.f26497d & 32) != 0 && (jVarE instanceof j)) {
                                l lVar3 = jVarE.f24863q;
                                int i10 = 0;
                                jVarE = jVarE;
                                eVar = eVar;
                                while (lVar3 != null) {
                                    if ((lVar3.f26497d & 32) != 0) {
                                        i10++;
                                        eVar = eVar;
                                        if (i10 == 1) {
                                            jVarE = lVar3;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new e(new l[16]);
                                            }
                                            if (jVarE != 0) {
                                                eVar.b(jVarE);
                                                jVarE = 0;
                                            }
                                            eVar.b(lVar3);
                                        }
                                    }
                                    lVar3 = lVar3.f26500g;
                                    jVarE = jVarE;
                                    eVar = eVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            jVarE = k.e(eVar);
                        }
                    }
                    lVar2 = lVar2.f26499f;
                }
            }
            f0VarR = f0VarR.C();
            lVar2 = (f0VarR == null || (cVar = f0VarR.D) == null) ? null : (v1) cVar.f824f;
        }
        return ((ar.a) pVar.f19481d).c();
    }

    default a w() {
        return a.f24162a;
    }
}
