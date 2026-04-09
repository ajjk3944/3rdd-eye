package p2;

import c2.l0;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import g2.n0;
import i2.d1;
import i2.e0;
import i2.u1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final i1.m f31101a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31102b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f31103c;

    /* renamed from: d, reason: collision with root package name */
    public final l f31104d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31105e;

    /* renamed from: f, reason: collision with root package name */
    public p f31106f;
    public final int g;

    public p(i1.m mVar, boolean z3, e0 e0Var, l lVar) {
        this.f31101a = mVar;
        this.f31102b = z3;
        this.f31103c = e0Var;
        this.f31104d = lVar;
        this.g = e0Var.f25628b;
    }

    public static /* synthetic */ List j(int i4, p pVar) {
        return pVar.i((i4 & 1) != 0 ? !pVar.f31102b : false, (i4 & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [i1.m] */
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
    /* JADX WARN: Type inference failed for: r6v3, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final o1.c a(d1 d1Var) {
        i2.j jVarE;
        p pVarL = l();
        if (pVarL == null) {
            return o1.c.f30365e;
        }
        i1.m mVar = (i1.m) pVarL.f31103c.G.g;
        if ((mVar.f25557d & 8) != 0) {
            loop0: while (mVar != null) {
                if ((mVar.f25556c & 8) != 0) {
                    jVarE = mVar;
                    ?? eVar = 0;
                    while (jVarE != 0) {
                        if (jVarE instanceof u1) {
                            if (jVarE.b()) {
                                break loop0;
                            }
                        } else if ((jVarE.f25556c & 8) != 0 && (jVarE instanceof i2.j)) {
                            i1.m mVar2 = jVarE.f25691p;
                            int i4 = 0;
                            jVarE = jVarE;
                            eVar = eVar;
                            while (mVar2 != null) {
                                if ((mVar2.f25556c & 8) != 0) {
                                    i4++;
                                    eVar = eVar;
                                    if (i4 == 1) {
                                        jVarE = mVar2;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new w0.e(new i1.m[16]);
                                        }
                                        if (jVarE != 0) {
                                            eVar.b(jVarE);
                                            jVarE = 0;
                                        }
                                        eVar.b(mVar2);
                                    }
                                }
                                mVar2 = mVar2.f25559f;
                                jVarE = jVarE;
                                eVar = eVar;
                            }
                            if (i4 == 1) {
                            }
                        }
                        jVarE = i2.k.e(eVar);
                    }
                }
                if ((mVar.f25557d & 8) == 0) {
                    break;
                }
                mVar = mVar.f25559f;
            }
            jVarE = 0;
        } else {
            jVarE = 0;
        }
        u1 u1Var = (u1) jVarE;
        d1 d1VarQ = u1Var != null ? i2.k.q(u1Var, 8) : null;
        return d1VarQ == null ? pVarL.a(d1Var) : d1VarQ.r(d1Var, true);
    }

    public final p b(h hVar, mk.c cVar) {
        l lVar = new l();
        lVar.f31097c = false;
        lVar.f31098d = false;
        cVar.invoke(lVar);
        p pVar = new p(new o(cVar), false, new e0(this.g + (hVar != null ? Http2Connection.DEGRADED_PONG_TIMEOUT_NS : 2000000000), true), lVar);
        pVar.f31105e = true;
        pVar.f31106f = this;
        return pVar;
    }

    public final void c(e0 e0Var, ArrayList arrayList) {
        w0.e eVarY = e0Var.y();
        Object[] objArr = eVarY.f36397a;
        int i4 = eVarY.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            e0 e0Var2 = (e0) objArr[i10];
            if (e0Var2.H() && !e0Var2.R) {
                if (e0Var2.G.f(8)) {
                    arrayList.add(s.a(e0Var2, this.f31102b));
                } else {
                    c(e0Var2, arrayList);
                }
            }
        }
    }

    public final d1 d() {
        if (!this.f31105e) {
            u1 u1VarF = f();
            return u1VarF != null ? i2.k.q(u1VarF, 8) : (i2.q) this.f31103c.G.f19257d;
        }
        p pVarL = l();
        if (pVarL != null) {
            return pVarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            p pVar = (p) arrayList.get(size2);
            if (pVar.n()) {
                arrayList2.add(pVar);
            } else if (!pVar.f31104d.f31098d) {
                pVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r6v14, types: [i2.u1] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [i1.m] */
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
    /* JADX WARN: Type inference failed for: r7v15, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    public final u1 f() {
        i1.m mVarE;
        boolean z3 = this.f31104d.f31097c;
        e0 e0Var = this.f31103c;
        Object obj = null;
        if (z3) {
            i1.m mVar = (i1.m) e0Var.G.g;
            if ((mVar.f25557d & 8) != 0) {
                mVarE = null;
                while (mVar != null) {
                    if ((mVar.f25556c & 8) != 0) {
                        i2.j jVarE = mVar;
                        ?? eVar = 0;
                        while (jVarE != 0) {
                            if (jVarE instanceof u1) {
                                ?? r62 = (u1) jVarE;
                                if (r62.b()) {
                                    if (r62.Y()) {
                                        return r62;
                                    }
                                    if (mVarE == null) {
                                        mVarE = r62;
                                    }
                                }
                            } else if ((jVarE.f25556c & 8) != 0 && (jVarE instanceof i2.j)) {
                                i1.m mVar2 = jVarE.f25691p;
                                int i4 = 0;
                                jVarE = jVarE;
                                eVar = eVar;
                                while (mVar2 != null) {
                                    if ((mVar2.f25556c & 8) != 0) {
                                        i4++;
                                        eVar = eVar;
                                        if (i4 == 1) {
                                            jVarE = mVar2;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new w0.e(new i1.m[16]);
                                            }
                                            if (jVarE != 0) {
                                                eVar.b(jVarE);
                                                jVarE = 0;
                                            }
                                            eVar.b(mVar2);
                                        }
                                    }
                                    mVar2 = mVar2.f25559f;
                                    jVarE = jVarE;
                                    eVar = eVar;
                                }
                                if (i4 == 1) {
                                }
                            }
                            jVarE = i2.k.e(eVar);
                        }
                    }
                    if ((mVar.f25557d & 8) == 0) {
                        break;
                    }
                    mVar = mVar.f25559f;
                }
                obj = mVarE;
            }
        } else {
            i1.m mVar3 = (i1.m) e0Var.G.g;
            if ((mVar3.f25557d & 8) != 0) {
                loop3: while (mVar3 != null) {
                    if ((mVar3.f25556c & 8) != 0) {
                        mVarE = mVar3;
                        w0.e eVar2 = null;
                        while (mVarE != null) {
                            if (mVarE instanceof u1) {
                                if (((u1) mVarE).b()) {
                                    obj = mVarE;
                                }
                            } else if ((mVarE.f25556c & 8) != 0 && (mVarE instanceof i2.j)) {
                                int i10 = 0;
                                for (i1.m mVar4 = ((i2.j) mVarE).f25691p; mVar4 != null; mVar4 = mVar4.f25559f) {
                                    if ((mVar4.f25556c & 8) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            mVarE = mVar4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new w0.e(new i1.m[16]);
                                            }
                                            if (mVarE != null) {
                                                eVar2.b(mVarE);
                                                mVarE = null;
                                            }
                                            eVar2.b(mVar4);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            mVarE = i2.k.e(eVar2);
                        }
                    }
                    if ((mVar3.f25557d & 8) == 0) {
                        break;
                    }
                    mVar3 = mVar3.f25559f;
                }
            }
        }
        return (u1) obj;
    }

    public final o1.c g() {
        d1 d1VarD = d();
        if (d1VarD != null) {
            if (!d1VarD.z0().f25565n) {
                d1VarD = null;
            }
            if (d1VarD != null) {
                return n0.f(d1VarD).r(d1VarD, true);
            }
        }
        return o1.c.f30365e;
    }

    public final o1.c h() {
        d1 d1VarD = d();
        if (d1VarD != null) {
            if (!d1VarD.z0().f25565n) {
                d1VarD = null;
            }
            if (d1VarD != null) {
                return n0.d(d1VarD, true);
            }
        }
        return o1.c.f30365e;
    }

    public final List i(boolean z3, boolean z10) {
        if (!z3 && this.f31104d.f31098d) {
            return zj.s.f38317a;
        }
        ArrayList arrayList = new ArrayList();
        if (!n()) {
            return q(arrayList, z10);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final l k() {
        boolean zN = n();
        l lVar = this.f31104d;
        if (!zN) {
            return lVar;
        }
        l lVarC = lVar.c();
        p(new ArrayList(), lVarC);
        return lVarC;
    }

    public final p l() {
        e0 e0VarV;
        p pVar = this.f31106f;
        if (pVar != null) {
            return pVar;
        }
        e0 e0Var = this.f31103c;
        boolean z3 = this.f31102b;
        if (z3) {
            e0VarV = e0Var.v();
            while (e0VarV != null) {
                l lVarX = e0VarV.x();
                if (lVarX != null && lVarX.f31097c) {
                    break;
                }
                e0VarV = e0VarV.v();
            }
            e0VarV = null;
        } else {
            e0VarV = null;
        }
        if (e0VarV == null) {
            e0 e0VarV2 = e0Var.v();
            while (true) {
                if (e0VarV2 == null) {
                    e0VarV = null;
                    break;
                }
                if (e0VarV2.G.f(8)) {
                    e0VarV = e0VarV2;
                    break;
                }
                e0VarV2 = e0VarV2.v();
            }
        }
        if (e0VarV == null) {
            return null;
        }
        return s.a(e0VarV, z3);
    }

    public final l m() {
        return this.f31104d;
    }

    public final boolean n() {
        return this.f31102b && this.f31104d.f31097c;
    }

    public final boolean o() {
        if (this.f31105e || !j(4, this).isEmpty()) {
            return false;
        }
        e0 e0VarV = this.f31103c.v();
        while (true) {
            if (e0VarV == null) {
                e0VarV = null;
                break;
            }
            l lVarX = e0VarV.x();
            if (lVarX != null && lVarX.f31097c) {
                break;
            }
            e0VarV = e0VarV.v();
        }
        return e0VarV == null;
    }

    public final void p(ArrayList arrayList, l lVar) {
        if (this.f31104d.f31098d) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            p pVar = (p) arrayList.get(size2);
            if (!pVar.n()) {
                lVar.f(pVar.f31104d);
                pVar.p(arrayList, lVar);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z3) {
        if (this.f31105e) {
            return zj.s.f38317a;
        }
        c(this.f31103c, arrayList);
        if (z3) {
            l lVar = this.f31104d;
            x.e0 e0Var = lVar.f31095a;
            Object objG = e0Var.g(t.f31134w);
            if (objG == null) {
                objG = null;
            }
            h hVar = (h) objG;
            if (hVar != null && lVar.f31097c && !arrayList.isEmpty()) {
                arrayList.add(b(hVar, new l0(20, hVar)));
            }
            w wVar = t.f31114a;
            if (e0Var.c(wVar) && !arrayList.isEmpty() && lVar.f31097c) {
                Object objG2 = e0Var.g(wVar);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) zj.n.d0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new l0(21, str)));
                }
            }
        }
        return arrayList;
    }
}
