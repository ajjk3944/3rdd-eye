package b2;

import com.google.android.gms.internal.consent_sdk.a0;
import i1.m;
import i2.e0;
import i2.w1;
import i2.z1;
import nk.u;
import xk.v;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends m implements z1, a {

    /* renamed from: o, reason: collision with root package name */
    public a f1655o;

    /* renamed from: p, reason: collision with root package name */
    public e f1656p;

    /* renamed from: q, reason: collision with root package name */
    public j f1657q;

    /* renamed from: r, reason: collision with root package name */
    public final String f1658r = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public j(a aVar, e eVar) {
        this.f1655o = aVar;
        this.f1656p = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r3v12, types: [i2.z1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [w0.e] */
    @Override // b2.a
    public final long U(long j, long j8, int i4) {
        a0 a0Var;
        long jU = this.f1655o.U(j, j8, i4);
        boolean z3 = this.f25565n;
        j jVar = null;
        if (z3 && z3) {
            if (!this.f25554a.f25565n) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            m mVar = this.f25554a.f25558e;
            e0 e0VarS = i2.k.s(this);
            loop0: while (true) {
                if (e0VarS == null) {
                    break;
                }
                if ((((m) e0VarS.G.g).f25557d & 262144) != 0) {
                    while (mVar != null) {
                        if ((mVar.f25556c & 262144) != 0) {
                            i2.j jVarE = mVar;
                            ?? eVar = 0;
                            while (jVarE != 0) {
                                if (jVarE instanceof z1) {
                                    ?? r32 = (z1) jVarE;
                                    if (nk.k.a(this.f1658r, r32.e()) && j.class == r32.getClass()) {
                                        jVar = r32;
                                        break loop0;
                                    }
                                } else if ((jVarE.f25556c & 262144) != 0 && (jVarE instanceof i2.j)) {
                                    m mVar2 = jVarE.f25691p;
                                    int i10 = 0;
                                    jVarE = jVarE;
                                    eVar = eVar;
                                    while (mVar2 != null) {
                                        if ((mVar2.f25556c & 262144) != 0) {
                                            i10++;
                                            eVar = eVar;
                                            if (i10 == 1) {
                                                jVarE = mVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new w0.e(new m[16]);
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
                                    if (i10 == 1) {
                                    }
                                }
                                jVarE = i2.k.e(eVar);
                            }
                        }
                        mVar = mVar.f25558e;
                    }
                }
                e0VarS = e0VarS.v();
                mVar = (e0VarS == null || (a0Var = e0VarS.G) == null) ? null : (w1) a0Var.f19259f;
            }
            jVar = jVar;
        }
        j jVar2 = jVar;
        return o1.b.h(jU, jVar2 != null ? jVar2.U(o1.b.h(j, jU), o1.b.g(j8, jU), i4) : 0L);
    }

    @Override // i2.z1
    public final Object e() {
        return this.f1658r;
    }

    @Override // i1.m
    public final void f0() {
        e eVar = this.f1656p;
        eVar.f1641a = this;
        eVar.f1642b = null;
        this.f1657q = null;
        eVar.f1643c = new b(1, this);
        eVar.f1644d = b0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // i1.m
    public final void h0() {
        a0 a0Var;
        u uVar = new u();
        k kVar = new k(uVar, 0);
        j jVar = this;
        if (!jVar.f25554a.f25565n) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        m mVar = jVar.f25554a.f25558e;
        e0 e0VarS = i2.k.s(this);
        loop0: while (e0VarS != null) {
            if ((((m) e0VarS.G.g).f25557d & 262144) != 0) {
                while (mVar != null) {
                    if ((mVar.f25556c & 262144) != 0) {
                        i2.j jVarE = mVar;
                        ?? eVar = 0;
                        while (jVarE != 0) {
                            boolean zBooleanValue = true;
                            if (jVarE instanceof z1) {
                                z1 z1Var = (z1) jVarE;
                                if (nk.k.a(e(), z1Var.e()) && getClass() == z1Var.getClass()) {
                                    zBooleanValue = ((Boolean) kVar.invoke(z1Var)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    break loop0;
                                }
                            } else {
                                if (((jVarE.f25556c & 262144) != 0) && (jVarE instanceof i2.j)) {
                                    m mVar2 = jVarE.f25691p;
                                    int i4 = 0;
                                    jVarE = jVarE;
                                    eVar = eVar;
                                    while (mVar2 != null) {
                                        if ((mVar2.f25556c & 262144) != 0) {
                                            i4++;
                                            eVar = eVar;
                                            if (i4 == 1) {
                                                jVarE = mVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new w0.e(new m[16]);
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
                            }
                            jVarE = i2.k.e(eVar);
                        }
                    }
                    mVar = mVar.f25558e;
                }
            }
            e0VarS = e0VarS.v();
            mVar = (e0VarS == null || (a0Var = e0VarS.G) == null) ? null : (w1) a0Var.f19259f;
        }
        j jVar2 = (j) ((z1) uVar.f29986a);
        this.f1657q = jVar2;
        e eVar2 = this.f1656p;
        eVar2.f1642b = jVar2;
        if (eVar2.f1641a == this) {
            eVar2.f1641a = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r14v16, types: [i2.z1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [i1.m] */
    @Override // b2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(long r18, long r20, ck.c r22) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.j.j(long, long, ck.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
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
    public final v p0() {
        j jVar;
        z1 z1Var;
        a0 a0Var;
        if (this.f25565n) {
            if (!this.f25554a.f25565n) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            m mVar = this.f25554a.f25558e;
            e0 e0VarS = i2.k.s(this);
            loop0: while (true) {
                if (e0VarS == null) {
                    z1Var = null;
                    break;
                }
                if ((((m) e0VarS.G.g).f25557d & 262144) != 0) {
                    while (mVar != null) {
                        if ((mVar.f25556c & 262144) != 0) {
                            i2.j jVarE = mVar;
                            ?? eVar = 0;
                            while (jVarE != 0) {
                                if (jVarE instanceof z1) {
                                    z1Var = (z1) jVarE;
                                    if (nk.k.a(this.f1658r, z1Var.e()) && j.class == z1Var.getClass()) {
                                        break loop0;
                                    }
                                } else if ((jVarE.f25556c & 262144) != 0 && (jVarE instanceof i2.j)) {
                                    m mVar2 = jVarE.f25691p;
                                    int i4 = 0;
                                    jVarE = jVarE;
                                    eVar = eVar;
                                    while (mVar2 != null) {
                                        if ((mVar2.f25556c & 262144) != 0) {
                                            i4++;
                                            eVar = eVar;
                                            if (i4 == 1) {
                                                jVarE = mVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new w0.e(new m[16]);
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
                        mVar = mVar.f25558e;
                    }
                }
                e0VarS = e0VarS.v();
                mVar = (e0VarS == null || (a0Var = e0VarS.G) == null) ? null : (w1) a0Var.f19259f;
            }
            jVar = (j) z1Var;
        } else {
            jVar = null;
        }
        v vVarP0 = jVar != null ? jVar.p0() : null;
        if (vVarP0 != null && x.t(vVarP0)) {
            return vVarP0;
        }
        v vVar = this.f1656p.f1644d;
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f4, code lost:
    
        if (r3 == r8) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r10v9, types: [i2.z1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // b2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(long r17, ck.c r19) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.j.q(long, ck.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r3v9, types: [i2.z1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // b2.a
    public final long y(int i4, long j) {
        a0 a0Var;
        boolean z3 = this.f25565n;
        j jVar = null;
        if (z3 && z3) {
            if (!this.f25554a.f25565n) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            m mVar = this.f25554a.f25558e;
            e0 e0VarS = i2.k.s(this);
            loop0: while (true) {
                if (e0VarS == null) {
                    break;
                }
                if ((((m) e0VarS.G.g).f25557d & 262144) != 0) {
                    while (mVar != null) {
                        if ((mVar.f25556c & 262144) != 0) {
                            i2.j jVarE = mVar;
                            ?? eVar = 0;
                            while (jVarE != 0) {
                                if (jVarE instanceof z1) {
                                    ?? r32 = (z1) jVarE;
                                    if (nk.k.a(this.f1658r, r32.e()) && j.class == r32.getClass()) {
                                        jVar = r32;
                                        break loop0;
                                    }
                                } else if ((jVarE.f25556c & 262144) != 0 && (jVarE instanceof i2.j)) {
                                    m mVar2 = jVarE.f25691p;
                                    int i10 = 0;
                                    jVarE = jVarE;
                                    eVar = eVar;
                                    while (mVar2 != null) {
                                        if ((mVar2.f25556c & 262144) != 0) {
                                            i10++;
                                            eVar = eVar;
                                            if (i10 == 1) {
                                                jVarE = mVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new w0.e(new m[16]);
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
                                    if (i10 == 1) {
                                    }
                                }
                                jVarE = i2.k.e(eVar);
                            }
                        }
                        mVar = mVar.f25558e;
                    }
                }
                e0VarS = e0VarS.v();
                mVar = (e0VarS == null || (a0Var = e0VarS.G) == null) ? null : (w1) a0Var.f19259f;
            }
            jVar = jVar;
        }
        long jY = jVar != null ? jVar.y(i4, j) : 0L;
        return o1.b.h(jY, this.f1655o.y(i4, o1.b.g(j, jY)));
    }
}
