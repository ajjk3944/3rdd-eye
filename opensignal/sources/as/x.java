package as;

import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class x extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2257d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2258g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i10, Object obj) {
        super(0);
        this.f2257d = i10;
        this.f2258g = obj;
    }

    private final Object e() {
        fj.n nVar = (fj.n) this.f2258g;
        synchronized (nVar.V) {
            try {
                if (nVar.I == null) {
                    df.c cVar = nVar.f8937d;
                    TelephonyManager telephonyManager = nVar.f8938g;
                    ch.f fVar = nVar.f8939r;
                    ag.b bVar = nVar.f8940x;
                    xj.j jVar = nVar.f8941y;
                    ch.i iVar = nVar.B;
                    Executor executor = nVar.E;
                    boolean z10 = ((ak.g) nVar.F.f20680g).f529f.f449a.j;
                    cVar.getClass();
                    fj.t tVarE = df.c.e(telephonyManager, fVar, bVar, jVar, iVar, executor, z10);
                    nVar.I = tVarE;
                    synchronized (tVarE.f8954b) {
                        if (!tVarE.f8954b.contains(nVar)) {
                            tVarE.f8954b.add(nVar);
                        }
                    }
                    fj.t tVar = nVar.I;
                    if (tVar != null) {
                        synchronized (tVar.f8958f) {
                            if (!tVar.f8958f.contains(nVar)) {
                                tVar.f8958f.add(nVar);
                            }
                        }
                    }
                    fj.t tVar2 = nVar.I;
                    if (tVar2 != null) {
                        synchronized (tVar2.f8959g) {
                            if (!tVar2.f8959g.contains(nVar)) {
                                tVar2.f8959g.add(nVar);
                            }
                        }
                    }
                    fj.t tVar3 = nVar.I;
                    if (tVar3 != null) {
                        tVar3.c(nVar);
                    }
                    fj.t tVar4 = nVar.I;
                    if (tVar4 != null) {
                        tVar4.a(nVar);
                    }
                    fj.t tVar5 = nVar.I;
                    if (tVar5 != null) {
                        tVar5.b(nVar);
                    }
                    fj.t tVar6 = nVar.I;
                    if (tVar6 != null) {
                        tVar6.h();
                    }
                } else {
                    ch.n.b("TelephonyPhoneStateRepo", "Already Initialised");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lq.b0.f15562a;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0505 A[Catch: all -> 0x049f, TRY_LEAVE, TryCatch #16 {all -> 0x049f, blocks: (B:104:0x035a, B:106:0x0368, B:107:0x0371, B:115:0x03ce, B:117:0x03d9, B:165:0x049e, B:161:0x0495, B:168:0x04a3, B:197:0x0505, B:203:0x0522, B:194:0x04ff, B:209:0x052c, B:212:0x053b, B:213:0x0542, B:214:0x0543, B:215:0x0546, B:216:0x0547, B:217:0x055c, B:118:0x03e1, B:120:0x03ea, B:123:0x03fb, B:149:0x047f, B:145:0x0478, B:152:0x0483, B:153:0x0488, B:124:0x0403, B:126:0x040c, B:130:0x0429, B:135:0x0442, B:136:0x0447, B:138:0x044a, B:139:0x0470, B:142:0x0473, B:108:0x0379, B:110:0x0384, B:114:0x03aa, B:206:0x0525, B:207:0x052a, B:158:0x0490, B:191:0x04fa), top: B:381:0x035a, inners: #0, #2, #8, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0522 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v1, types: [rr.u] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r5v23, types: [ts.n] */
    /* JADX WARN: Type inference failed for: r8v2, types: [mq.w] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, java.util.ArrayList] */
    @Override // ar.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: as.x.c():java.lang.Object");
    }
}
