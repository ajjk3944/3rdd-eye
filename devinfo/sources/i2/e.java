package i2;

import u0.o2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends nk.l implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f25622b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f25623c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f25624d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f25625e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25626a;

    static {
        int i4 = 2;
        f25622b = new e(i4, 0);
        f25623c = new e(i4, 1);
        f25624d = new e(i4, 2);
        f25625e = new e(i4, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i4, int i10) {
        super(i4);
        this.f25626a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25626a) {
            case 0:
                ((Number) obj2).intValue();
                ((g) obj).getClass();
                break;
            case 1:
                ((e0) ((g) obj)).c0((g2.j0) obj2);
                break;
            case 2:
                ((e0) ((g) obj)).d0((i1.n) obj2);
                break;
            default:
                u0.y yVar = (u0.y) obj2;
                e0 e0Var = (e0) ((g) obj);
                e0Var.C = yVar;
                com.google.android.gms.internal.consent_sdk.a0 a0Var = e0Var.G;
                o2 o2Var = j2.a1.f27074h;
                c1.l lVar = (c1.l) yVar;
                lVar.getClass();
                e0Var.Z((d3.c) u0.q.s(lVar, o2Var));
                d3.l lVar2 = (d3.l) u0.q.s(lVar, j2.a1.f27079n);
                if (e0Var.A != lVar2) {
                    e0Var.A = lVar2;
                    e0Var.E();
                    e0 e0VarV = e0Var.v();
                    if (e0VarV != null) {
                        e0VarV.C();
                    }
                    e0Var.D();
                    for (i1.m mVar = (i1.m) a0Var.g; mVar != null; mVar = mVar.f25559f) {
                        mVar.i0();
                    }
                }
                e0Var.e0((j2.y1) u0.q.s(lVar, j2.a1.f27084s));
                i1.m mVar2 = (i1.m) a0Var.g;
                if ((mVar2.f25557d & 32768) != 0) {
                    while (mVar2 != null) {
                        if ((mVar2.f25556c & 32768) != 0) {
                            j jVarE = mVar2;
                            ?? eVar = 0;
                            while (jVarE != 0) {
                                if (jVarE instanceof h) {
                                    i1.m mVar3 = ((i1.m) ((h) jVarE)).f25554a;
                                    if (mVar3.f25565n) {
                                        e1.c(mVar3);
                                    } else {
                                        mVar3.j = true;
                                    }
                                } else if ((jVarE.f25556c & 32768) != 0 && (jVarE instanceof j)) {
                                    i1.m mVar4 = jVarE.f25691p;
                                    int i4 = 0;
                                    jVarE = jVarE;
                                    eVar = eVar;
                                    while (mVar4 != null) {
                                        if ((mVar4.f25556c & 32768) != 0) {
                                            i4++;
                                            eVar = eVar;
                                            if (i4 == 1) {
                                                jVarE = mVar4;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new w0.e(new i1.m[16]);
                                                }
                                                if (jVarE != 0) {
                                                    eVar.b(jVarE);
                                                    jVarE = 0;
                                                }
                                                eVar.b(mVar4);
                                            }
                                        }
                                        mVar4 = mVar4.f25559f;
                                        jVarE = jVarE;
                                        eVar = eVar;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                jVarE = k.e(eVar);
                            }
                        }
                        if ((mVar2.f25557d & 32768) != 0) {
                            mVar2 = mVar2.f25559f;
                        }
                    }
                }
                break;
        }
        return yj.u.f37649a;
    }
}
