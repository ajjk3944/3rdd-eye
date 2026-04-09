package D0;

import E0.AbstractC2633k;
import E0.AbstractC2635m;
import E0.C2623c;
import E0.G;
import E0.e0;
import E0.m0;
import Yg.J;
import androidx.compose.ui.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final m0 f2769a;

    /* renamed from: b, reason: collision with root package name */
    private final V.b f2770b = new V.b(new C2623c[16], 0);

    /* renamed from: c, reason: collision with root package name */
    private final V.b f2771c = new V.b(new c[16], 0);

    /* renamed from: d, reason: collision with root package name */
    private final V.b f2772d = new V.b(new G[16], 0);

    /* renamed from: e, reason: collision with root package name */
    private final V.b f2773e = new V.b(new c[16], 0);

    /* renamed from: f, reason: collision with root package name */
    private boolean f2774f;

    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        public final void a() {
            f.this.e();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public f(m0 m0Var) {
        this.f2769a = m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
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
    private final void c(e.c cVar, c cVar2, Set set) {
        int iA = e0.a(32);
        if (!cVar.h1().k2()) {
            B0.a.b("visitSubtreeIf called on an unattached node");
        }
        V.b bVar = new V.b(new e.c[16], 0);
        e.c cVarB2 = cVar.h1().b2();
        if (cVarB2 == null) {
            AbstractC2633k.c(bVar, cVar.h1());
        } else {
            bVar.b(cVarB2);
        }
        while (bVar.u()) {
            e.c cVar3 = (e.c) bVar.z(bVar.o() - 1);
            if ((cVar3.a2() & iA) != 0) {
                for (e.c cVarB22 = cVar3; cVarB22 != null; cVarB22 = cVarB22.b2()) {
                    if ((cVarB22.f2() & iA) != 0) {
                        AbstractC2635m abstractC2635mG = cVarB22;
                        ?? bVar2 = 0;
                        while (abstractC2635mG != 0) {
                            if (abstractC2635mG instanceof h) {
                                h hVar = (h) abstractC2635mG;
                                if (hVar instanceof C2623c) {
                                    C2623c c2623c = (C2623c) hVar;
                                    if ((c2623c.D2() instanceof d) && c2623c.E2().contains(cVar2)) {
                                        set.add(hVar);
                                    }
                                }
                                if (hVar.S0().a(cVar2)) {
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
            AbstractC2633k.c(bVar, cVar3);
        }
    }

    public final void a(C2623c c2623c, c cVar) {
        this.f2770b.b(c2623c);
        this.f2771c.b(cVar);
        b();
    }

    public final void b() {
        if (this.f2774f) {
            return;
        }
        this.f2774f = true;
        this.f2769a.k(new a());
    }

    public final void d(C2623c c2623c, c cVar) {
        this.f2772d.b(AbstractC2633k.m(c2623c));
        this.f2773e.b(cVar);
        b();
    }

    public final void e() {
        int i10 = 0;
        this.f2774f = false;
        HashSet hashSet = new HashSet();
        V.b bVar = this.f2772d;
        int iO = bVar.o();
        if (iO > 0) {
            Object[] objArrM = bVar.m();
            int i11 = 0;
            do {
                G g10 = (G) objArrM[i11];
                c cVar = (c) this.f2773e.m()[i11];
                if (g10.k0().k().k2()) {
                    c(g10.k0().k(), cVar, hashSet);
                }
                i11++;
            } while (i11 < iO);
        }
        this.f2772d.h();
        this.f2773e.h();
        V.b bVar2 = this.f2770b;
        int iO2 = bVar2.o();
        if (iO2 > 0) {
            Object[] objArrM2 = bVar2.m();
            do {
                C2623c c2623c = (C2623c) objArrM2[i10];
                c cVar2 = (c) this.f2771c.m()[i10];
                if (c2623c.k2()) {
                    c(c2623c, cVar2, hashSet);
                }
                i10++;
            } while (i10 < iO2);
        }
        this.f2770b.h();
        this.f2771c.h();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C2623c) it.next()).J2();
        }
    }

    public final void f(C2623c c2623c, c cVar) {
        this.f2770b.b(c2623c);
        this.f2771c.b(cVar);
        b();
    }
}
