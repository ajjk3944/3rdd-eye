package e2;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import java.util.List;
import mq.w;
import u.a0;
import x1.f0;
import x1.f1;
import x1.t1;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final z0.l f7714a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7715b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f7716c;

    /* renamed from: d, reason: collision with root package name */
    public final SemanticsConfiguration f7717d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7718e;

    /* renamed from: f, reason: collision with root package name */
    public k f7719f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7720g;

    public k(z0.l lVar, boolean z10, f0 f0Var, SemanticsConfiguration semanticsConfiguration) {
        this.f7714a = lVar;
        this.f7715b = z10;
        this.f7716c = f0Var;
        this.f7717d = semanticsConfiguration;
        this.f7720g = f0Var.f24799c;
    }

    public static /* synthetic */ List j(int i10, k kVar) {
        return kVar.i((i10 & 1) != 0 ? !kVar.f7715b : false, (i10 & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final f1.c a(f1 f1Var) {
        x1.j jVarE;
        k kVarL = l();
        if (kVarL == null) {
            return f1.c.f8403e;
        }
        z0.l lVar = (z0.l) kVarL.f7716c.D.f825g;
        if ((lVar.f26498e & 8) != 0) {
            loop0: while (lVar != null) {
                if ((lVar.f26497d & 8) != 0) {
                    jVarE = lVar;
                    ?? eVar = 0;
                    while (jVarE != 0) {
                        if (jVarE instanceof t1) {
                            if (jVarE.c()) {
                                break loop0;
                            }
                        } else if ((jVarE.f26497d & 8) != 0 && (jVarE instanceof x1.j)) {
                            z0.l lVar2 = jVarE.f24863q;
                            int i10 = 0;
                            jVarE = jVarE;
                            eVar = eVar;
                            while (lVar2 != null) {
                                if ((lVar2.f26497d & 8) != 0) {
                                    i10++;
                                    eVar = eVar;
                                    if (i10 == 1) {
                                        jVarE = lVar2;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new p0.e(new z0.l[16]);
                                        }
                                        if (jVarE != 0) {
                                            eVar.b(jVarE);
                                            jVarE = 0;
                                        }
                                        eVar.b(lVar2);
                                    }
                                }
                                lVar2 = lVar2.f26500g;
                                jVarE = jVarE;
                                eVar = eVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        jVarE = x1.k.e(eVar);
                    }
                }
                if ((lVar.f26498e & 8) == 0) {
                    break;
                }
                lVar = lVar.f26500g;
            }
            jVarE = 0;
        } else {
            jVarE = 0;
        }
        t1 t1Var = (t1) jVarE;
        f1 f1VarQ = t1Var != null ? x1.k.q(t1Var, 8) : null;
        return f1VarQ == null ? kVarL.a(f1Var) : f1VarQ.B(f1Var, true);
    }

    public final k b(f fVar, ar.k kVar) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.f1193g = false;
        semanticsConfiguration.f1194r = false;
        kVar.a(semanticsConfiguration);
        k kVar2 = new k(new j(kVar), false, new f0(this.f7720g + (fVar != null ? 1000000000 : 2000000000), true), semanticsConfiguration);
        kVar2.f7718e = true;
        kVar2.f7719f = this;
        return kVar2;
    }

    public final void c(f0 f0Var, ArrayList arrayList) {
        p0.e eVarH = f0Var.H();
        Object[] objArr = eVarH.f20230a;
        int i10 = eVarH.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var2 = (f0) objArr[i11];
            if (f0Var2.S() && !f0Var2.K) {
                if (f0Var2.D.i(8)) {
                    arrayList.add(n.a(f0Var2, this.f7715b));
                } else {
                    c(f0Var2, arrayList);
                }
            }
        }
    }

    public final f1 d() {
        if (!this.f7718e) {
            t1 t1VarF = f();
            return t1VarF != null ? x1.k.q(t1VarF, 8) : (x1.r) this.f7716c.D.f822d;
        }
        k kVarL = l();
        if (kVarL != null) {
            return kVarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            k kVar = (k) arrayList.get(size2);
            if (kVar.n()) {
                arrayList2.add(kVar);
            } else if (!kVar.f7717d.f1194r) {
                kVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r6v14, types: [x1.t1] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    public final t1 f() {
        z0.l lVarE;
        boolean z10 = this.f7717d.f1193g;
        f0 f0Var = this.f7716c;
        Object obj = null;
        if (z10) {
            z0.l lVar = (z0.l) f0Var.D.f825g;
            if ((lVar.f26498e & 8) != 0) {
                lVarE = null;
                while (lVar != null) {
                    if ((lVar.f26497d & 8) != 0) {
                        x1.j jVarE = lVar;
                        ?? eVar = 0;
                        while (jVarE != 0) {
                            if (jVarE instanceof t1) {
                                ?? r62 = (t1) jVarE;
                                if (r62.c()) {
                                    if (r62.M()) {
                                        return r62;
                                    }
                                    if (lVarE == null) {
                                        lVarE = r62;
                                    }
                                }
                            } else if ((jVarE.f26497d & 8) != 0 && (jVarE instanceof x1.j)) {
                                z0.l lVar2 = jVarE.f24863q;
                                int i10 = 0;
                                jVarE = jVarE;
                                eVar = eVar;
                                while (lVar2 != null) {
                                    if ((lVar2.f26497d & 8) != 0) {
                                        i10++;
                                        eVar = eVar;
                                        if (i10 == 1) {
                                            jVarE = lVar2;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new p0.e(new z0.l[16]);
                                            }
                                            if (jVarE != 0) {
                                                eVar.b(jVarE);
                                                jVarE = 0;
                                            }
                                            eVar.b(lVar2);
                                        }
                                    }
                                    lVar2 = lVar2.f26500g;
                                    jVarE = jVarE;
                                    eVar = eVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            jVarE = x1.k.e(eVar);
                        }
                    }
                    if ((lVar.f26498e & 8) == 0) {
                        break;
                    }
                    lVar = lVar.f26500g;
                }
                obj = lVarE;
            }
        } else {
            z0.l lVar3 = (z0.l) f0Var.D.f825g;
            if ((lVar3.f26498e & 8) != 0) {
                loop3: while (lVar3 != null) {
                    if ((lVar3.f26497d & 8) != 0) {
                        lVarE = lVar3;
                        p0.e eVar2 = null;
                        while (lVarE != null) {
                            if (lVarE instanceof t1) {
                                if (((t1) lVarE).c()) {
                                    obj = lVarE;
                                }
                            } else if ((lVarE.f26497d & 8) != 0 && (lVarE instanceof x1.j)) {
                                int i11 = 0;
                                for (z0.l lVar4 = ((x1.j) lVarE).f24863q; lVar4 != null; lVar4 = lVar4.f26500g) {
                                    if ((lVar4.f26497d & 8) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            lVarE = lVar4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new p0.e(new z0.l[16]);
                                            }
                                            if (lVarE != null) {
                                                eVar2.b(lVarE);
                                                lVarE = null;
                                            }
                                            eVar2.b(lVar4);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            lVarE = x1.k.e(eVar2);
                        }
                    }
                    if ((lVar3.f26498e & 8) == 0) {
                        break;
                    }
                    lVar3 = lVar3.f26500g;
                }
            }
        }
        return (t1) obj;
    }

    public final f1.c g() {
        f1 f1VarD = d();
        if (f1VarD != null) {
            if (!f1VarD.v0().f26506o) {
                f1VarD = null;
            }
            if (f1VarD != null) {
                return e5.s(f1VarD).B(f1VarD, true);
            }
        }
        return f1.c.f8403e;
    }

    public final f1.c h() {
        f1 f1VarD = d();
        if (f1VarD != null) {
            if (!f1VarD.v0().f26506o) {
                f1VarD = null;
            }
            if (f1VarD != null) {
                return e5.k(f1VarD);
            }
        }
        return f1.c.f8403e;
    }

    public final List i(boolean z10, boolean z11) {
        if (!z10 && this.f7717d.f1194r) {
            return w.f16945a;
        }
        ArrayList arrayList = new ArrayList();
        if (!n()) {
            return q(arrayList, z11);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final SemanticsConfiguration k() {
        boolean zN = n();
        SemanticsConfiguration semanticsConfiguration = this.f7717d;
        if (!zN) {
            return semanticsConfiguration;
        }
        SemanticsConfiguration semanticsConfigurationA = semanticsConfiguration.a();
        p(new ArrayList(), semanticsConfigurationA);
        return semanticsConfigurationA;
    }

    public final k l() {
        f0 f0VarC;
        k kVar = this.f7719f;
        if (kVar != null) {
            return kVar;
        }
        f0 f0Var = this.f7716c;
        boolean z10 = this.f7715b;
        if (z10) {
            f0VarC = f0Var.C();
            while (f0VarC != null) {
                SemanticsConfiguration semanticsConfigurationE = f0VarC.E();
                if (semanticsConfigurationE != null && semanticsConfigurationE.f1193g) {
                    break;
                }
                f0VarC = f0VarC.C();
            }
            f0VarC = null;
        } else {
            f0VarC = null;
        }
        if (f0VarC == null) {
            f0 f0VarC2 = f0Var.C();
            while (true) {
                if (f0VarC2 == null) {
                    f0VarC = null;
                    break;
                }
                if (f0VarC2.D.i(8)) {
                    f0VarC = f0VarC2;
                    break;
                }
                f0VarC2 = f0VarC2.C();
            }
        }
        if (f0VarC == null) {
            return null;
        }
        return n.a(f0VarC, z10);
    }

    public final SemanticsConfiguration m() {
        return this.f7717d;
    }

    public final boolean n() {
        return this.f7715b && this.f7717d.f1193g;
    }

    public final boolean o() {
        if (this.f7718e || !j(4, this).isEmpty()) {
            return false;
        }
        f0 f0VarC = this.f7716c.C();
        while (true) {
            if (f0VarC == null) {
                f0VarC = null;
                break;
            }
            SemanticsConfiguration semanticsConfigurationE = f0VarC.E();
            if (semanticsConfigurationE != null && semanticsConfigurationE.f1193g) {
                break;
            }
            f0VarC = f0VarC.C();
        }
        return f0VarC == null;
    }

    public final void p(ArrayList arrayList, SemanticsConfiguration semanticsConfiguration) {
        if (this.f7717d.f1194r) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            k kVar = (k) arrayList.get(size2);
            if (!kVar.n()) {
                semanticsConfiguration.c(kVar.f7717d);
                kVar.p(arrayList, semanticsConfiguration);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z10) {
        if (this.f7718e) {
            return w.f16945a;
        }
        c(this.f7716c, arrayList);
        if (z10) {
            SemanticsConfiguration semanticsConfiguration = this.f7717d;
            a0 a0Var = semanticsConfiguration.f1191a;
            Object objG = a0Var.g(p.f7751u);
            if (objG == null) {
                objG = null;
            }
            f fVar = (f) objG;
            if (fVar != null && semanticsConfiguration.f1193g && !arrayList.isEmpty()) {
                arrayList.add(b(fVar, new as.d(12, fVar)));
            }
            s sVar = p.f7733a;
            if (a0Var.c(sVar) && !arrayList.isEmpty() && semanticsConfiguration.f1193g) {
                Object objG2 = a0Var.g(sVar);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) mq.o.t0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new i(str, 0)));
                }
            }
        }
        return arrayList;
    }
}
