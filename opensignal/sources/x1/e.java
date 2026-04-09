package x1;

import n0.h2;

/* loaded from: classes.dex */
public final class e extends br.n implements ar.n {

    /* renamed from: g, reason: collision with root package name */
    public static final e f24784g;

    /* renamed from: r, reason: collision with root package name */
    public static final e f24785r;

    /* renamed from: x, reason: collision with root package name */
    public static final e f24786x;

    /* renamed from: y, reason: collision with root package name */
    public static final e f24787y;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24788d;

    static {
        int i10 = 2;
        f24784g = new e(i10, 0);
        f24785r = new e(i10, 1);
        f24786x = new e(i10, 2);
        f24787y = new e(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11) {
        super(i10);
        this.f24788d = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f24788d) {
            case 0:
                ((Number) obj2).intValue();
                ((g) obj).getClass();
                break;
            case 1:
                v1.r rVar = (v1.r) obj2;
                f0 f0Var = (f0) ((g) obj);
                if (!br.l.a(f0Var.f24816v, rVar)) {
                    f0Var.f24816v = rVar;
                    f0Var.N();
                }
                break;
            case 2:
                ((f0) ((g) obj)).u0((z0.m) obj2);
                break;
            default:
                n0.z zVar = (n0.z) obj2;
                f0 f0Var2 = (f0) ((g) obj);
                f0Var2.f24820z = zVar;
                al.c cVar = f0Var2.D;
                h2 h2Var = y1.c1.f25646h;
                v0.h hVar = (v0.h) zVar;
                hVar.getClass();
                f0Var2.r0((t2.c) n0.w.j(hVar, h2Var));
                t2.i iVar = (t2.i) n0.w.j(hVar, y1.c1.f25650n);
                if (f0Var2.f24818x != iVar) {
                    f0Var2.f24818x = iVar;
                    f0Var2.N();
                    f0 f0VarC = f0Var2.C();
                    if (f0VarC != null) {
                        f0VarC.L();
                    }
                    f0Var2.M();
                    for (z0.l lVar = (z0.l) cVar.f825g; lVar != null; lVar = lVar.f26500g) {
                        lVar.getClass();
                    }
                }
                f0Var2.v0((y1.x1) n0.w.j(hVar, y1.c1.f25655s));
                z0.l lVar2 = (z0.l) cVar.f825g;
                if ((lVar2.f26498e & 32768) != 0) {
                    while (lVar2 != null) {
                        if ((lVar2.f26497d & 32768) != 0) {
                            j jVarE = lVar2;
                            ?? eVar = 0;
                            while (jVarE != 0) {
                                if (jVarE instanceof h) {
                                    z0.l lVar3 = ((z0.l) ((h) jVarE)).f26495b;
                                    if (lVar3.f26506o) {
                                        g1.c(lVar3);
                                    } else {
                                        lVar3.k = true;
                                    }
                                } else if ((jVarE.f26497d & 32768) != 0 && (jVarE instanceof j)) {
                                    z0.l lVar4 = jVarE.f24863q;
                                    int i10 = 0;
                                    jVarE = jVarE;
                                    eVar = eVar;
                                    while (lVar4 != null) {
                                        if ((lVar4.f26497d & 32768) != 0) {
                                            i10++;
                                            eVar = eVar;
                                            if (i10 == 1) {
                                                jVarE = lVar4;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new p0.e(new z0.l[16]);
                                                }
                                                if (jVarE != 0) {
                                                    eVar.b(jVarE);
                                                    jVarE = 0;
                                                }
                                                eVar.b(lVar4);
                                            }
                                        }
                                        lVar4 = lVar4.f26500g;
                                        jVarE = jVarE;
                                        eVar = eVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                jVarE = k.e(eVar);
                            }
                        }
                        if ((lVar2.f26498e & 32768) != 0) {
                            lVar2 = lVar2.f26500g;
                        }
                    }
                }
                break;
        }
        return lq.b0.f15562a;
    }
}
