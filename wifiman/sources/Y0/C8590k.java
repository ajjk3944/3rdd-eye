package y0;

import E0.AbstractC2633k;
import E0.AbstractC2635m;
import E0.e0;
import E0.s0;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6531g;
import o.C7007F;
import o.C7028t;
import z0.C8704b;

/* renamed from: y0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8590k extends C8591l {

    /* renamed from: c, reason: collision with root package name */
    private final e.c f66292c;

    /* renamed from: f, reason: collision with root package name */
    private C0.r f66295f;

    /* renamed from: g, reason: collision with root package name */
    private C8593n f66296g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f66297h;

    /* renamed from: d, reason: collision with root package name */
    private final C8704b f66293d = new C8704b();

    /* renamed from: e, reason: collision with root package name */
    private final C7028t f66294e = new C7028t(2);

    /* renamed from: i, reason: collision with root package name */
    private boolean f66298i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f66299j = true;

    public C8590k(e.c cVar) {
        this.f66292c = cVar;
    }

    private final void j() {
        this.f66294e.b();
        this.f66295f = null;
    }

    private final boolean m(C8593n c8593n, C8593n c8593n2) {
        if (c8593n == null || c8593n.c().size() != c8593n2.c().size()) {
            return true;
        }
        int size = c8593n2.c().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!C6531g.j(((C8604y) c8593n.c().get(i10)).h(), ((C8604y) c8593n2.c().get(i10)).h())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0238  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    @Override // y0.C8591l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(o.C7028t r37, C0.r r38, y0.C8585f r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.C8590k.a(o.t, C0.r, y0.f, boolean):boolean");
    }

    @Override // y0.C8591l
    public void b(C8585f c8585f) {
        super.b(c8585f);
        C8593n c8593n = this.f66296g;
        if (c8593n == null) {
            return;
        }
        this.f66297h = this.f66298i;
        List listC = c8593n.c();
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            C8604y c8604y = (C8604y) listC.get(i10);
            boolean zI = c8604y.i();
            boolean zA = c8585f.a(c8604y.f());
            boolean z10 = this.f66298i;
            if ((!zI && !zA) || (!zI && !z10)) {
                this.f66293d.i(c8604y.f());
            }
        }
        this.f66298i = false;
        this.f66299j = AbstractC8596q.i(c8593n.f(), AbstractC8596q.f66307a.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // y0.C8591l
    public void d() {
        V.b bVarG = g();
        int iO = bVarG.o();
        if (iO > 0) {
            Object[] objArrM = bVarG.m();
            int i10 = 0;
            do {
                ((C8590k) objArrM[i10]).d();
                i10++;
            } while (i10 < iO);
        }
        AbstractC2635m abstractC2635mG = this.f66292c;
        int iA = e0.a(16);
        ?? bVar = 0;
        while (abstractC2635mG != 0) {
            if (abstractC2635mG instanceof s0) {
                ((s0) abstractC2635mG).C0();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    @Override // y0.C8591l
    public boolean e(C8585f c8585f) {
        V.b bVarG;
        int iO;
        boolean z10 = false;
        int i10 = 0;
        z10 = false;
        if (!this.f66294e.h() && this.f66292c.k2()) {
            C8593n c8593n = this.f66296g;
            AbstractC6492s.f(c8593n);
            C0.r rVar = this.f66295f;
            AbstractC6492s.f(rVar);
            long jH = rVar.h();
            AbstractC2635m abstractC2635mG = this.f66292c;
            int iA = e0.a(16);
            ?? bVar = 0;
            while (abstractC2635mG != 0) {
                if (abstractC2635mG instanceof s0) {
                    ((s0) abstractC2635mG).s0(c8593n, EnumC8595p.Final, jH);
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
            if (this.f66292c.k2() && (iO = (bVarG = g()).o()) > 0) {
                Object[] objArrM = bVarG.m();
                do {
                    ((C8590k) objArrM[i10]).e(c8585f);
                    i10++;
                } while (i10 < iO);
            }
            z10 = true;
        }
        b(c8585f);
        j();
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v10, types: [V.b] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [V.b] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [V.b] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [V.b] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // y0.C8591l
    public boolean f(C7028t c7028t, C0.r rVar, C8585f c8585f, boolean z10) {
        V.b bVarG;
        int iO;
        if (this.f66294e.h() || !this.f66292c.k2()) {
            return false;
        }
        C8593n c8593n = this.f66296g;
        AbstractC6492s.f(c8593n);
        C0.r rVar2 = this.f66295f;
        AbstractC6492s.f(rVar2);
        long jH = rVar2.h();
        AbstractC2635m abstractC2635mG = this.f66292c;
        int iA = e0.a(16);
        ?? bVar = 0;
        while (abstractC2635mG != 0) {
            if (abstractC2635mG instanceof s0) {
                ((s0) abstractC2635mG).s0(c8593n, EnumC8595p.Initial, jH);
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
        if (this.f66292c.k2() && (iO = (bVarG = g()).o()) > 0) {
            Object[] objArrM = bVarG.m();
            int i11 = 0;
            do {
                C8590k c8590k = (C8590k) objArrM[i11];
                C7028t c7028t2 = this.f66294e;
                C0.r rVar3 = this.f66295f;
                AbstractC6492s.f(rVar3);
                c8590k.f(c7028t2, rVar3, c8585f, z10);
                i11++;
            } while (i11 < iO);
        }
        if (this.f66292c.k2()) {
            AbstractC2635m abstractC2635mG2 = this.f66292c;
            int iA2 = e0.a(16);
            ?? bVar2 = 0;
            while (abstractC2635mG2 != 0) {
                if (abstractC2635mG2 instanceof s0) {
                    ((s0) abstractC2635mG2).s0(c8593n, EnumC8595p.Main, jH);
                } else if ((abstractC2635mG2.f2() & iA2) != 0 && (abstractC2635mG2 instanceof AbstractC2635m)) {
                    e.c cVarE22 = abstractC2635mG2.E2();
                    int i12 = 0;
                    bVar2 = bVar2;
                    abstractC2635mG2 = abstractC2635mG2;
                    while (cVarE22 != null) {
                        if ((cVarE22.f2() & iA2) != 0) {
                            i12++;
                            bVar2 = bVar2;
                            if (i12 == 1) {
                                abstractC2635mG2 = cVarE22;
                            } else {
                                if (bVar2 == 0) {
                                    bVar2 = new V.b(new e.c[16], 0);
                                }
                                if (abstractC2635mG2 != 0) {
                                    bVar2.b(abstractC2635mG2);
                                    abstractC2635mG2 = 0;
                                }
                                bVar2.b(cVarE22);
                            }
                        }
                        cVarE22 = cVarE22.b2();
                        bVar2 = bVar2;
                        abstractC2635mG2 = abstractC2635mG2;
                    }
                    if (i12 == 1) {
                    }
                }
                abstractC2635mG2 = AbstractC2633k.g(bVar2);
            }
        }
        return true;
    }

    @Override // y0.C8591l
    public void i(long j10, C7007F c7007f) {
        if (this.f66293d.d(j10) && !c7007f.a(this)) {
            this.f66293d.h(j10);
            this.f66294e.m(j10);
        }
        V.b bVarG = g();
        int iO = bVarG.o();
        if (iO > 0) {
            Object[] objArrM = bVarG.m();
            int i10 = 0;
            do {
                ((C8590k) objArrM[i10]).i(j10, c7007f);
                i10++;
            } while (i10 < iO);
        }
    }

    public final e.c k() {
        return this.f66292c;
    }

    public final C8704b l() {
        return this.f66293d;
    }

    public final void n() {
        this.f66298i = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.f66292c + ", children=" + g() + ", pointerIds=" + this.f66293d + ')';
    }
}
