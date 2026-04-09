package r1;

import u.o;
import u.z;
import x1.f1;
import x1.q1;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: c, reason: collision with root package name */
    public final z0.l f21155c;

    /* renamed from: d, reason: collision with root package name */
    public final a5.n f21156d;

    /* renamed from: e, reason: collision with root package name */
    public final o f21157e;

    /* renamed from: f, reason: collision with root package name */
    public f1 f21158f;

    /* renamed from: g, reason: collision with root package name */
    public ag.b f21159g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21160h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21161i;
    public boolean j;

    public d(z0.l lVar) {
        this.f21155c = lVar;
        a5.n nVar = new a5.n(2);
        nVar.f143c = new long[2];
        this.f21156d = nVar;
        this.f21157e = new o(2);
        this.f21161i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02da  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r5v1, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    @Override // r1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(u.o r52, v1.m r53, q3.a r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.d.a(u.o, v1.m, q3.a, boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // r1.e
    public final void b(q3.a aVar) {
        super.b(aVar);
        ag.b bVar = this.f21159g;
        if (bVar == null) {
            return;
        }
        this.f21160h = this.f21161i;
        ?? r12 = bVar.f346g;
        int size = r12.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) r12.get(i10);
            boolean z10 = jVar.f21169d;
            long j = jVar.f21166a;
            boolean zQ0 = aVar.q0(j);
            boolean z11 = this.f21161i;
            if ((!z10 && !zQ0) || (!z10 && !z11)) {
                this.f21156d.d(j);
            }
        }
        this.f21161i = false;
        this.j = bVar.f345d == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [p0.e] */
    public final void c() {
        p0.e eVar = this.f21162a;
        Object[] objArr = eVar.f20230a;
        int i10 = eVar.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            ((d) objArr[i11]).c();
        }
        x1.j jVarE = this.f21155c;
        ?? eVar2 = 0;
        while (jVarE != 0) {
            if (jVarE instanceof q1) {
                ((q1) jVarE).q();
            } else if ((jVarE.f26497d & 16) != 0 && (jVarE instanceof x1.j)) {
                z0.l lVar = jVarE.f24863q;
                int i12 = 0;
                jVarE = jVarE;
                eVar2 = eVar2;
                while (lVar != null) {
                    if ((lVar.f26497d & 16) != 0) {
                        i12++;
                        eVar2 = eVar2;
                        if (i12 == 1) {
                            jVarE = lVar;
                        } else {
                            if (eVar2 == 0) {
                                eVar2 = new p0.e(new z0.l[16]);
                            }
                            if (jVarE != 0) {
                                eVar2.b(jVarE);
                                jVarE = 0;
                            }
                            eVar2.b(lVar);
                        }
                    }
                    lVar = lVar.f26500g;
                    jVarE = jVarE;
                    eVar2 = eVar2;
                }
                if (i12 == 1) {
                }
            }
            jVarE = x1.k.e(eVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(q3.a aVar) {
        o oVar = this.f21157e;
        boolean z10 = false;
        z10 = false;
        if (oVar.g() != 0) {
            z0.l lVar = this.f21155c;
            if (lVar.f26506o) {
                ag.b bVar = this.f21159g;
                br.l.b(bVar);
                f1 f1Var = this.f21158f;
                br.l.b(f1Var);
                long j = f1Var.f23811d;
                x1.j jVarE = lVar;
                ?? eVar = 0;
                while (jVarE != 0) {
                    if (jVarE instanceof q1) {
                        ((q1) jVarE).n(bVar, f.Final, j);
                    } else if ((jVarE.f26497d & 16) != 0 && (jVarE instanceof x1.j)) {
                        z0.l lVar2 = jVarE.f24863q;
                        int i10 = 0;
                        jVarE = jVarE;
                        eVar = eVar;
                        while (lVar2 != null) {
                            if ((lVar2.f26497d & 16) != 0) {
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
                if (lVar.f26506o) {
                    p0.e eVar2 = this.f21162a;
                    Object[] objArr = eVar2.f20230a;
                    int i11 = eVar2.f20232g;
                    for (int i12 = 0; i12 < i11; i12++) {
                        ((d) objArr[i12]).d(aVar);
                    }
                }
                z10 = true;
            }
        }
        b(aVar);
        oVar.a();
        this.f21158f = null;
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r0v3, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(q3.a aVar, boolean z10) {
        if (this.f21157e.g() == 0) {
            return false;
        }
        x1.j jVarE = this.f21155c;
        if (!jVarE.f26506o) {
            return false;
        }
        ag.b bVar = this.f21159g;
        br.l.b(bVar);
        f1 f1Var = this.f21158f;
        br.l.b(f1Var);
        long j = f1Var.f23811d;
        x1.j jVarE2 = jVarE;
        ?? eVar = 0;
        while (jVarE2 != 0) {
            if (jVarE2 instanceof q1) {
                ((q1) jVarE2).n(bVar, f.Initial, j);
            } else if ((jVarE2.f26497d & 16) != 0 && (jVarE2 instanceof x1.j)) {
                z0.l lVar = jVarE2.f24863q;
                int i10 = 0;
                jVarE2 = jVarE2;
                eVar = eVar;
                while (lVar != null) {
                    if ((lVar.f26497d & 16) != 0) {
                        i10++;
                        eVar = eVar;
                        if (i10 == 1) {
                            jVarE2 = lVar;
                        } else {
                            if (eVar == 0) {
                                eVar = new p0.e(new z0.l[16]);
                            }
                            if (jVarE2 != 0) {
                                eVar.b(jVarE2);
                                jVarE2 = 0;
                            }
                            eVar.b(lVar);
                        }
                    }
                    lVar = lVar.f26500g;
                    jVarE2 = jVarE2;
                    eVar = eVar;
                }
                if (i10 == 1) {
                }
            }
            jVarE2 = x1.k.e(eVar);
        }
        if (jVarE.f26506o) {
            p0.e eVar2 = this.f21162a;
            Object[] objArr = eVar2.f20230a;
            int i11 = eVar2.f20232g;
            for (int i12 = 0; i12 < i11; i12++) {
                d dVar = (d) objArr[i12];
                br.l.b(this.f21158f);
                dVar.e(aVar, z10);
            }
        }
        if (jVarE.f26506o) {
            ?? eVar3 = 0;
            while (jVarE != 0) {
                if (jVarE instanceof q1) {
                    ((q1) jVarE).n(bVar, f.Main, j);
                } else if ((jVarE.f26497d & 16) != 0 && (jVarE instanceof x1.j)) {
                    z0.l lVar2 = jVarE.f24863q;
                    int i13 = 0;
                    jVarE = jVarE;
                    eVar3 = eVar3;
                    while (lVar2 != null) {
                        if ((lVar2.f26497d & 16) != 0) {
                            i13++;
                            eVar3 = eVar3;
                            if (i13 == 1) {
                                jVarE = lVar2;
                            } else {
                                if (eVar3 == 0) {
                                    eVar3 = new p0.e(new z0.l[16]);
                                }
                                if (jVarE != 0) {
                                    eVar3.b(jVarE);
                                    jVarE = 0;
                                }
                                eVar3.b(lVar2);
                            }
                        }
                        lVar2 = lVar2.f26500g;
                        jVarE = jVarE;
                        eVar3 = eVar3;
                    }
                    if (i13 == 1) {
                    }
                }
                jVarE = x1.k.e(eVar3);
            }
        }
        return true;
    }

    public final void f(long j, z zVar) {
        a5.n nVar = this.f21156d;
        if (nVar.b(j) && zVar.f(this) < 0) {
            nVar.d(j);
            this.f21157e.f(j);
        }
        p0.e eVar = this.f21162a;
        Object[] objArr = eVar.f20230a;
        int i10 = eVar.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            ((d) objArr[i11]).f(j, zVar);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f21155c + ", children=" + this.f21162a + ", pointerIds=" + this.f21156d + ')';
    }
}
