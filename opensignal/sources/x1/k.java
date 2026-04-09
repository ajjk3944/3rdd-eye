package x1;

import androidx.compose.ui.node.Owner;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final j1 f24870a = new j1(1);

    /* renamed from: b, reason: collision with root package name */
    public static final t2.d f24871b = new t2.d(1.0f, 1.0f);

    public static final long a(float f10, boolean z10, boolean z11) {
        return (((z10 ? 1L : 0L) | (z11 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final void b(p0.e eVar, z0.l lVar) {
        p0.e eVarI = r(lVar).I();
        int i10 = eVarI.f20232g - 1;
        Object[] objArr = eVarI.f20230a;
        if (i10 < objArr.length) {
            while (i10 >= 0) {
                eVar.b((z0.l) ((f0) objArr[i10]).D.f825g);
                i10--;
            }
        }
    }

    public static final int c(m0 m0Var, v1.h hVar) {
        m0 m0VarW = m0Var.W();
        if (m0VarW == null) {
            u1.a.b("Child of " + m0Var + " cannot be null when calculating alignment line");
        }
        if (m0Var.a0().a().containsKey(hVar)) {
            Integer num = (Integer) m0Var.a0().a().get(hVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iV = m0VarW.V(hVar);
            if (iV != Integer.MIN_VALUE) {
                m0VarW.j = true;
                m0Var.k = true;
                m0Var.j0();
                m0VarW.j = false;
                m0Var.k = false;
                return iV + ((int) (hVar instanceof v1.h ? m0VarW.c0() & 4294967295L : m0VarW.c0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final z0.l d(i iVar, int i10) {
        z0.l lVar = ((z0.l) iVar).f26495b.f26500g;
        if (lVar == null || (lVar.f26498e & i10) == 0) {
            return null;
        }
        while (lVar != null) {
            int i11 = lVar.f26497d;
            if ((i11 & 2) != 0) {
                return null;
            }
            if ((i11 & i10) != 0) {
                return lVar;
            }
            lVar = lVar.f26500g;
        }
        return null;
    }

    public static final z0.l e(p0.e eVar) {
        int i10;
        if (eVar == null || (i10 = eVar.f20232g) == 0) {
            return null;
        }
        return (z0.l) eVar.k(i10 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final v f(z0.l lVar) {
        if ((lVar.f26497d & 2) != 0) {
            if (lVar instanceof v) {
                return (v) lVar;
            }
            if (lVar instanceof j) {
                z0.l lVar2 = ((j) lVar).f24863q;
                while (lVar2 != 0) {
                    if (lVar2 instanceof v) {
                        return (v) lVar2;
                    }
                    lVar2 = (!(lVar2 instanceof j) || (lVar2.f26497d & 2) == 0) ? lVar2.f26500g : ((j) lVar2).f24863q;
                }
            }
        }
        return null;
    }

    public static final int g(long j, long j7) {
        boolean zN = n(j);
        if (zN != n(j7)) {
            return zN ? -1 : 1;
        }
        return (Math.min(i(j), i(j7)) >= 0.0f && m(j) != m(j7)) ? m(j) ? -1 : 1 : (int) Math.signum(i(j) - i(j7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object h(h hVar, androidx.compose.runtime.d dVar) {
        if (!((z0.l) hVar).f26495b.f26506o) {
            u1.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        v0.h hVar2 = (v0.h) r(hVar).f24820z;
        hVar2.getClass();
        return n0.w.j(hVar2, dVar);
    }

    public static final float i(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(m mVar) {
        if (((z0.l) mVar).f26495b.f26506o) {
            q(mVar, 1).C0();
        }
    }

    public static final void k(v vVar) {
        r(vVar).N();
    }

    public static final void l(t1 t1Var) {
        r(t1Var).Q();
    }

    public static final boolean m(long j) {
        return (j & 2) != 0;
    }

    public static final boolean n(long j) {
        return (j & 1) != 0;
    }

    public static final boolean o(f0 f0Var) {
        if (f0Var.f24804h == null) {
            return false;
        }
        f0 f0VarC = f0Var.C();
        return (f0VarC != null ? f0VarC.f24804h : null) == null || f0Var.r().f24847b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(z0.l lVar, ar.a aVar) {
        i1 i1Var = lVar.f26501h;
        if (i1Var == null) {
            i1Var = new i1((h1) lVar);
            lVar.f26501h = i1Var;
        }
        s(lVar).getSnapshotObserver().a(i1Var, d.B, aVar);
    }

    public static final f1 q(i iVar, int i10) {
        f1 f1Var = ((z0.l) iVar).f26495b.f26502i;
        br.l.b(f1Var);
        if (f1Var.v0() != iVar || !g1.g(i10)) {
            return f1Var;
        }
        f1 f1Var2 = f1Var.f24822p;
        br.l.b(f1Var2);
        return f1Var2;
    }

    public static final f0 r(i iVar) {
        f1 f1Var = ((z0.l) iVar).f26495b.f26502i;
        if (f1Var != null) {
            return f1Var.f24821o;
        }
        throw c7.a.h("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final Owner s(i iVar) {
        Owner owner = r(iVar).f24808n;
        if (owner != null) {
            return owner;
        }
        throw c7.a.h("This node does not have an owner.");
    }

    public static final Owner t(f0 f0Var) {
        Owner owner = f0Var.f24808n;
        if (owner != null) {
            return owner;
        }
        throw c7.a.h("LayoutNode should be attached to an owner");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, x1.y1] */
    /* JADX WARN: Type inference failed for: r13v0, types: [ar.k] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void u(y1 y1Var, ar.k kVar) {
        z0.l lVar = (z0.l) y1Var;
        if (!lVar.f26495b.f26506o) {
            u1.a.b("visitSubtreeIf called on an unattached node");
        }
        p0.e eVar = new p0.e(new z0.l[16]);
        z0.l lVar2 = lVar.f26495b;
        z0.l lVar3 = lVar2.f26500g;
        if (lVar3 == null) {
            b(eVar, lVar2);
        } else {
            eVar.b(lVar3);
        }
        while (true) {
            int i10 = eVar.f20232g;
            if (i10 == 0) {
                return;
            }
            z0.l lVar4 = (z0.l) eVar.k(i10 - 1);
            if ((lVar4.f26498e & 262144) != 0) {
                for (z0.l lVar5 = lVar4; lVar5 != null; lVar5 = lVar5.f26500g) {
                    if ((lVar5.f26497d & 262144) != 0) {
                        j jVarE = lVar5;
                        ?? eVar2 = 0;
                        while (jVarE != 0) {
                            if (jVarE instanceof y1) {
                                y1 y1Var2 = (y1) jVarE;
                                x1 x1Var = (br.l.a(y1Var.f(), y1Var2.f()) && y1Var.getClass() == y1Var2.getClass()) ? (x1) kVar.a(y1Var2) : x1.ContinueTraversal;
                                if (x1Var == x1.CancelTraversal) {
                                    return;
                                }
                                if (x1Var == x1.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((jVarE.f26497d & 262144) != 0 && (jVarE instanceof j)) {
                                z0.l lVar6 = jVarE.f24863q;
                                int i11 = 0;
                                jVarE = jVarE;
                                eVar2 = eVar2;
                                while (lVar6 != null) {
                                    if ((lVar6.f26497d & 262144) != 0) {
                                        i11++;
                                        eVar2 = eVar2;
                                        if (i11 == 1) {
                                            jVarE = lVar6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new p0.e(new z0.l[16]);
                                            }
                                            if (jVarE != 0) {
                                                eVar2.b(jVarE);
                                                jVarE = 0;
                                            }
                                            eVar2.b(lVar6);
                                        }
                                    }
                                    lVar6 = lVar6.f26500g;
                                    jVarE = jVarE;
                                    eVar2 = eVar2;
                                }
                                if (i11 == 1) {
                                }
                            }
                            jVarE = e(eVar2);
                        }
                    }
                }
            }
            b(eVar, lVar4);
        }
    }
}
