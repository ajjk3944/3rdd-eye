package i2;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final j1 f25698a = new j1(1);

    public static final long a(float f10, boolean z3, boolean z10) {
        return (((z3 ? 1L : 0L) | (z10 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final void b(w0.e eVar, i1.m mVar) {
        w0.e eVarZ = s(mVar).z();
        int i4 = eVarZ.f36399c - 1;
        Object[] objArr = eVarZ.f36397a;
        if (i4 < objArr.length) {
            while (i4 >= 0) {
                eVar.b((i1.m) ((e0) objArr[i4]).G.g);
                i4--;
            }
        }
    }

    public static final int c(m0 m0Var, g2.a aVar) {
        m0 m0VarD0 = m0Var.d0();
        if (m0VarD0 == null) {
            f2.a.b("Child of " + m0Var + " cannot be null when calculating alignment line");
        }
        if (m0Var.h0().b().containsKey(aVar)) {
            Integer num = (Integer) m0Var.h0().b().get(aVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iC0 = m0VarD0.c0(aVar);
            if (iC0 != Integer.MIN_VALUE) {
                m0VarD0.j = true;
                m0Var.f25712k = true;
                m0Var.n0();
                m0VarD0.j = false;
                m0Var.f25712k = false;
                return iC0 + ((int) (aVar instanceof g2.l ? m0VarD0.j0() & 4294967295L : m0VarD0.j0() >> 32));
            }
        }
        return LinearLayoutManager.INVALID_OFFSET;
    }

    public static final i1.m d(i iVar, int i4) {
        i1.m mVar = ((i1.m) iVar).f25554a.f25559f;
        if (mVar == null || (mVar.f25557d & i4) == 0) {
            return null;
        }
        while (mVar != null) {
            int i10 = mVar.f25556c;
            if ((i10 & 2) != 0) {
                return null;
            }
            if ((i10 & i4) != 0) {
                return mVar;
            }
            mVar = mVar.f25559f;
        }
        return null;
    }

    public static final i1.m e(w0.e eVar) {
        int i4;
        if (eVar == null || (i4 = eVar.f36399c) == 0) {
            return null;
        }
        return (i1.m) eVar.l(i4 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final u f(i1.m mVar) {
        if ((mVar.f25556c & 2) != 0) {
            if (mVar instanceof u) {
                return (u) mVar;
            }
            if (mVar instanceof j) {
                i1.m mVar2 = ((j) mVar).f25691p;
                while (mVar2 != 0) {
                    if (mVar2 instanceof u) {
                        return (u) mVar2;
                    }
                    mVar2 = (!(mVar2 instanceof j) || (mVar2.f25556c & 2) == 0) ? mVar2.f25559f : ((j) mVar2).f25691p;
                }
            }
        }
        return null;
    }

    public static final int g(long j, long j8) {
        boolean zN = n(j);
        if (zN != n(j8)) {
            return zN ? -1 : 1;
        }
        return (Math.min(i(j), i(j8)) >= 0.0f && m(j) != m(j8)) ? m(j) ? -1 : 1 : (int) Math.signum(i(j) - i(j8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object h(h hVar, u0.k1 k1Var) {
        if (!((i1.m) hVar).f25554a.f25565n) {
            f2.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        c1.l lVar = (c1.l) s(hVar).C;
        lVar.getClass();
        return u0.q.s(lVar, k1Var);
    }

    public static final float i(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(l lVar) {
        if (((i1.m) lVar).f25554a.f25565n) {
            q(lVar, 1).G0();
        }
    }

    public static final void k(u uVar) {
        s(uVar).E();
    }

    public static final void l(u1 u1Var) {
        s(u1Var).F();
    }

    public static final boolean m(long j) {
        return (j & 2) != 0;
    }

    public static final boolean n(long j) {
        return (j & 1) != 0;
    }

    public static final boolean o(e0 e0Var) {
        if (e0Var.f25634i == null) {
            return false;
        }
        e0 e0VarV = e0Var.v();
        return (e0VarV != null ? e0VarV.f25634i : null) == null || e0Var.H.f25675b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(i1.m mVar, mk.a aVar) {
        i1 i1Var = mVar.g;
        if (i1Var == null) {
            i1Var = new i1((h1) mVar);
            mVar.g = i1Var;
        }
        o1 snapshotObserver = ((j2.r) t(mVar)).getSnapshotObserver();
        snapshotObserver.f25732a.b(i1Var, d.f25602f, aVar);
    }

    public static final d1 q(i iVar, int i4) {
        d1 d1Var = ((i1.m) iVar).f25554a.f25560h;
        nk.k.b(d1Var);
        if (d1Var.z0() != iVar || !e1.g(i4)) {
            return d1Var;
        }
        d1 d1Var2 = d1Var.f25611p;
        nk.k.b(d1Var2);
        return d1Var2;
    }

    public static final d1 r(i iVar) {
        if (!((i1.m) iVar).f25554a.f25565n) {
            f2.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        d1 d1VarQ = q(iVar, 2);
        if (!d1VarQ.z0().f25565n) {
            f2.a.b("LayoutCoordinates is not attached.");
        }
        return d1VarQ;
    }

    public static final e0 s(i iVar) {
        d1 d1Var = ((i1.m) iVar).f25554a.f25560h;
        if (d1Var != null) {
            return d1Var.f25610o;
        }
        throw d.h.o("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final m1 t(i iVar) {
        m1 m1Var = s(iVar).f25639o;
        if (m1Var != null) {
            return m1Var;
        }
        throw d.h.o("This node does not have an owner.");
    }

    public static final View u(i iVar) {
        if (!((i1.m) iVar).f25554a.f25565n) {
            f2.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) h0.a(s(iVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [mk.c] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void v(i1.m mVar, Object obj, mk.c cVar) {
        com.google.android.gms.internal.consent_sdk.a0 a0Var;
        if (!mVar.f25554a.f25565n) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        i1.m mVar2 = mVar.f25554a.f25558e;
        e0 e0VarS = s(mVar);
        while (e0VarS != null) {
            if ((((i1.m) e0VarS.G.g).f25557d & 262144) != 0) {
                while (mVar2 != null) {
                    if ((mVar2.f25556c & 262144) != 0) {
                        j jVarE = mVar2;
                        ?? eVar = 0;
                        while (jVarE != 0) {
                            if (jVarE instanceof z1) {
                                z1 z1Var = (z1) jVarE;
                                if (!(obj.equals(z1Var.e()) ? ((Boolean) cVar.invoke(z1Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((jVarE.f25556c & 262144) != 0) && (jVarE instanceof j)) {
                                    i1.m mVar3 = jVarE.f25691p;
                                    int i4 = 0;
                                    jVarE = jVarE;
                                    eVar = eVar;
                                    while (mVar3 != null) {
                                        if ((mVar3.f25556c & 262144) != 0) {
                                            i4++;
                                            eVar = eVar;
                                            if (i4 == 1) {
                                                jVarE = mVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new w0.e(new i1.m[16]);
                                                }
                                                if (jVarE != 0) {
                                                    eVar.b(jVarE);
                                                    jVarE = 0;
                                                }
                                                eVar.b(mVar3);
                                            }
                                        }
                                        mVar3 = mVar3.f25559f;
                                        jVarE = jVarE;
                                        eVar = eVar;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                            }
                            jVarE = e(eVar);
                        }
                    }
                    mVar2 = mVar2.f25558e;
                }
            }
            e0VarS = e0VarS.v();
            mVar2 = (e0VarS == null || (a0Var = e0VarS.G) == null) ? null : (w1) a0Var.f19259f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [i2.z1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [mk.c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
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
    public static final void w(z1 z1Var, mk.c cVar) {
        i1.m mVar = (i1.m) z1Var;
        if (!mVar.f25554a.f25565n) {
            f2.a.b("visitSubtreeIf called on an unattached node");
        }
        w0.e eVar = new w0.e(new i1.m[16]);
        i1.m mVar2 = mVar.f25554a;
        i1.m mVar3 = mVar2.f25559f;
        if (mVar3 == null) {
            b(eVar, mVar2);
        } else {
            eVar.b(mVar3);
        }
        while (true) {
            int i4 = eVar.f36399c;
            if (i4 == 0) {
                return;
            }
            i1.m mVar4 = (i1.m) eVar.l(i4 - 1);
            if ((mVar4.f25557d & 262144) != 0) {
                for (i1.m mVar5 = mVar4; mVar5 != null && mVar5.f25565n; mVar5 = mVar5.f25559f) {
                    if ((mVar5.f25556c & 262144) != 0) {
                        j jVarE = mVar5;
                        ?? eVar2 = 0;
                        while (jVarE != 0) {
                            if (jVarE instanceof z1) {
                                z1 z1Var2 = (z1) jVarE;
                                y1 y1Var = (nk.k.a(z1Var.e(), z1Var2.e()) && z1Var.getClass() == z1Var2.getClass()) ? (y1) cVar.invoke(z1Var2) : y1.f25816a;
                                if (y1Var == y1.f25818c) {
                                    return;
                                }
                                if (y1Var == y1.f25817b) {
                                    break;
                                }
                            } else if ((jVarE.f25556c & 262144) != 0 && (jVarE instanceof j)) {
                                i1.m mVar6 = jVarE.f25691p;
                                int i10 = 0;
                                jVarE = jVarE;
                                eVar2 = eVar2;
                                while (mVar6 != null) {
                                    if ((mVar6.f25556c & 262144) != 0) {
                                        i10++;
                                        eVar2 = eVar2;
                                        if (i10 == 1) {
                                            jVarE = mVar6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new w0.e(new i1.m[16]);
                                            }
                                            if (jVarE != 0) {
                                                eVar2.b(jVarE);
                                                jVarE = 0;
                                            }
                                            eVar2.b(mVar6);
                                        }
                                    }
                                    mVar6 = mVar6.f25559f;
                                    jVarE = jVarE;
                                    eVar2 = eVar2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            jVarE = e(eVar2);
                        }
                    }
                }
            }
            b(eVar, mVar4);
        }
    }
}
