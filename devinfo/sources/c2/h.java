package c2;

import com.google.android.gms.internal.ads.lg0;
import com.google.android.gms.internal.measurement.i4;
import i2.d1;
import i2.r1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: c, reason: collision with root package name */
    public final i1.m f2613c;

    /* renamed from: d, reason: collision with root package name */
    public final lg0 f2614d;

    /* renamed from: e, reason: collision with root package name */
    public final x.o f2615e;

    /* renamed from: f, reason: collision with root package name */
    public d1 f2616f;
    public j g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2617h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2618i;
    public boolean j;

    public h(i1.m mVar) {
        this.f2613c = mVar;
        lg0 lg0Var = new lg0();
        lg0Var.f13488b = new long[2];
        this.f2614d = lg0Var;
        this.f2615e = new x.o(2);
        this.f2618i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02da  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r5v1, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [i1.m] */
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
    /* JADX WARN: Type inference failed for: r8v15, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    @Override // c2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(x.o r52, g2.v r53, com.google.android.gms.internal.measurement.i4 r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.h.a(x.o, g2.v, com.google.android.gms.internal.measurement.i4, boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // c2.i
    public final void b(i4 i4Var) {
        super.b(i4Var);
        j jVar = this.g;
        if (jVar == null) {
            return;
        }
        this.f2617h = this.f2618i;
        ?? r12 = jVar.f2626a;
        int size = r12.size();
        for (int i4 = 0; i4 < size; i4++) {
            p pVar = (p) r12.get(i4);
            boolean z3 = pVar.f2661d;
            long j = pVar.f2658a;
            boolean zA = i4Var.a(j);
            boolean z10 = this.f2618i;
            if ((!z3 && !zA) || (!z3 && !z10)) {
                this.f2614d.c(j);
            }
        }
        this.f2618i = false;
        this.j = jVar.f2629d == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [i1.m] */
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
    /* JADX WARN: Type inference failed for: r3v5, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [w0.e] */
    public final void c() {
        w0.e eVar = this.f2620a;
        Object[] objArr = eVar.f36397a;
        int i4 = eVar.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            ((h) objArr[i10]).c();
        }
        i2.j jVarE = this.f2613c;
        ?? eVar2 = 0;
        while (jVarE != 0) {
            if (jVarE instanceof r1) {
                ((r1) jVarE).u();
            } else if ((jVarE.f25556c & 16) != 0 && (jVarE instanceof i2.j)) {
                i1.m mVar = jVarE.f25691p;
                int i11 = 0;
                jVarE = jVarE;
                eVar2 = eVar2;
                while (mVar != null) {
                    if ((mVar.f25556c & 16) != 0) {
                        i11++;
                        eVar2 = eVar2;
                        if (i11 == 1) {
                            jVarE = mVar;
                        } else {
                            if (eVar2 == 0) {
                                eVar2 = new w0.e(new i1.m[16]);
                            }
                            if (jVarE != 0) {
                                eVar2.b(jVarE);
                                jVarE = 0;
                            }
                            eVar2.b(mVar);
                        }
                    }
                    mVar = mVar.f25559f;
                    jVarE = jVarE;
                    eVar2 = eVar2;
                }
                if (i11 == 1) {
                }
            }
            jVarE = i2.k.e(eVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [i1.m] */
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
    /* JADX WARN: Type inference failed for: r8v3, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(i4 i4Var) {
        x.o oVar = this.f2615e;
        boolean z3 = false;
        z3 = false;
        if (oVar.k() != 0) {
            i1.m mVar = this.f2613c;
            if (mVar.f25565n) {
                j jVar = this.g;
                nk.k.b(jVar);
                d1 d1Var = this.f2616f;
                nk.k.b(d1Var);
                long j = d1Var.f24410c;
                i2.j jVarE = mVar;
                ?? eVar = 0;
                while (jVarE != 0) {
                    if (jVarE instanceof r1) {
                        ((r1) jVarE).d(jVar, k.f2636c, j);
                    } else if ((jVarE.f25556c & 16) != 0 && (jVarE instanceof i2.j)) {
                        i1.m mVar2 = jVarE.f25691p;
                        int i4 = 0;
                        jVarE = jVarE;
                        eVar = eVar;
                        while (mVar2 != null) {
                            if ((mVar2.f25556c & 16) != 0) {
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
                if (mVar.f25565n) {
                    w0.e eVar2 = this.f2620a;
                    Object[] objArr = eVar2.f36397a;
                    int i10 = eVar2.f36399c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((h) objArr[i11]).d(i4Var);
                    }
                }
                z3 = true;
            }
        }
        b(i4Var);
        oVar.b();
        this.f2616f = null;
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r0v3, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [i1.m] */
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
    /* JADX WARN: Type inference failed for: r14v5, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(i4 i4Var, boolean z3) {
        if (this.f2615e.k() == 0) {
            return false;
        }
        i2.j jVarE = this.f2613c;
        if (!jVarE.f25565n) {
            return false;
        }
        j jVar = this.g;
        nk.k.b(jVar);
        d1 d1Var = this.f2616f;
        nk.k.b(d1Var);
        long j = d1Var.f24410c;
        i2.j jVarE2 = jVarE;
        ?? eVar = 0;
        while (jVarE2 != 0) {
            if (jVarE2 instanceof r1) {
                ((r1) jVarE2).d(jVar, k.f2634a, j);
            } else if ((jVarE2.f25556c & 16) != 0 && (jVarE2 instanceof i2.j)) {
                i1.m mVar = jVarE2.f25691p;
                int i4 = 0;
                jVarE2 = jVarE2;
                eVar = eVar;
                while (mVar != null) {
                    if ((mVar.f25556c & 16) != 0) {
                        i4++;
                        eVar = eVar;
                        if (i4 == 1) {
                            jVarE2 = mVar;
                        } else {
                            if (eVar == 0) {
                                eVar = new w0.e(new i1.m[16]);
                            }
                            if (jVarE2 != 0) {
                                eVar.b(jVarE2);
                                jVarE2 = 0;
                            }
                            eVar.b(mVar);
                        }
                    }
                    mVar = mVar.f25559f;
                    jVarE2 = jVarE2;
                    eVar = eVar;
                }
                if (i4 == 1) {
                }
            }
            jVarE2 = i2.k.e(eVar);
        }
        if (jVarE.f25565n) {
            w0.e eVar2 = this.f2620a;
            Object[] objArr = eVar2.f36397a;
            int i10 = eVar2.f36399c;
            for (int i11 = 0; i11 < i10; i11++) {
                h hVar = (h) objArr[i11];
                nk.k.b(this.f2616f);
                hVar.e(i4Var, z3);
            }
        }
        if (jVarE.f25565n) {
            ?? eVar3 = 0;
            while (jVarE != 0) {
                if (jVarE instanceof r1) {
                    ((r1) jVarE).d(jVar, k.f2635b, j);
                } else if ((jVarE.f25556c & 16) != 0 && (jVarE instanceof i2.j)) {
                    i1.m mVar2 = jVarE.f25691p;
                    int i12 = 0;
                    jVarE = jVarE;
                    eVar3 = eVar3;
                    while (mVar2 != null) {
                        if ((mVar2.f25556c & 16) != 0) {
                            i12++;
                            eVar3 = eVar3;
                            if (i12 == 1) {
                                jVarE = mVar2;
                            } else {
                                if (eVar3 == 0) {
                                    eVar3 = new w0.e(new i1.m[16]);
                                }
                                if (jVarE != 0) {
                                    eVar3.b(jVarE);
                                    jVarE = 0;
                                }
                                eVar3.b(mVar2);
                            }
                        }
                        mVar2 = mVar2.f25559f;
                        jVarE = jVarE;
                        eVar3 = eVar3;
                    }
                    if (i12 == 1) {
                    }
                }
                jVarE = i2.k.e(eVar3);
            }
        }
        return true;
    }

    public final void f(long j, x.a0 a0Var) {
        lg0 lg0Var = this.f2614d;
        if (lg0Var.b(j) && a0Var.g(this) < 0) {
            lg0Var.c(j);
            this.f2615e.j(j);
        }
        w0.e eVar = this.f2620a;
        Object[] objArr = eVar.f36397a;
        int i4 = eVar.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            ((h) objArr[i10]).f(j, a0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f2613c + ", children=" + this.f2620a + ", pointerIds=" + this.f2614d + ')';
    }
}
