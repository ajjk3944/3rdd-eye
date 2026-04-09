package e1;

import android.os.Trace;
import br.w;
import n0.b2;
import x1.f0;
import x1.h1;
import x1.v1;
import y1.c1;

/* loaded from: classes.dex */
public final class p extends z0.l implements x1.h, h1, w1.c, x1.i {

    /* renamed from: p, reason: collision with root package name */
    public final ar.n f7667p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7668q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7669r;

    /* renamed from: s, reason: collision with root package name */
    public final int f7670s;

    public p(int i10, mu.i iVar, int i11) {
        this.f7667p = (i11 & 2) != 0 ? null : iVar;
        this.f7670s = i10;
    }

    @Override // x1.h1
    public final void E() {
        f0();
    }

    @Override // z0.l
    public final boolean R() {
        return false;
    }

    @Override // z0.l
    public final void V() {
        int i10 = o.f7666b[e0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            a8.f fVar = (a8.f) x1.k.s(this).getFocusOwner();
            fVar.h(8, true, false);
            ((e) fVar.f198d).a();
        } else if (i10 != 3 && i10 != 4) {
            throw new bf.n();
        }
    }

    @Override // z0.l
    public final void W() {
        if (e0().isFocused()) {
            ((a8.f) x1.k.s(this).getFocusOwner()).h(8, true, true);
        }
    }

    public final void c0(n nVar, n nVar2) {
        al.c cVar;
        ar.n nVar3;
        a8.f fVar = (a8.f) x1.k.s(this).getFocusOwner();
        p pVar = (p) fVar.f202h;
        if (!br.l.a(nVar, nVar2) && (nVar3 = this.f7667p) != null) {
            nVar3.w(nVar, nVar2);
        }
        z0.l lVar = this.f26495b;
        if (!lVar.f26506o) {
            u1.a.b("visitAncestors called on an unattached node");
        }
        z0.l lVar2 = this.f26495b;
        f0 f0VarR = x1.k.r(this);
        while (f0VarR != null) {
            if ((((z0.l) f0VarR.D.f825g).f26498e & 5120) != 0) {
                while (lVar2 != null) {
                    int i10 = lVar2.f26497d;
                    if ((i10 & 5120) != 0) {
                        if (lVar2 != lVar && (i10 & 1024) != 0) {
                            return;
                        }
                        if ((i10 & 4096) != 0) {
                            z0.l lVarE = lVar2;
                            p0.e eVar = null;
                            while (lVarE != null) {
                                if (lVarE instanceof x1.c) {
                                    x1.c cVar2 = (x1.c) lVarE;
                                    if (pVar == ((p) fVar.f202h)) {
                                        cVar2.d0();
                                        throw null;
                                    }
                                } else if ((lVarE.f26497d & 4096) != 0 && (lVarE instanceof x1.j)) {
                                    int i11 = 0;
                                    for (z0.l lVar3 = ((x1.j) lVarE).f24863q; lVar3 != null; lVar3 = lVar3.f26500g) {
                                        if ((lVar3.f26497d & 4096) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                lVarE = lVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new p0.e(new z0.l[16]);
                                                }
                                                if (lVarE != null) {
                                                    eVar.b(lVarE);
                                                    lVarE = null;
                                                }
                                                eVar.b(lVar3);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                lVarE = x1.k.e(eVar);
                            }
                        } else {
                            continue;
                        }
                    }
                    lVar2 = lVar2.f26499f;
                }
            }
            f0VarR = f0VarR.C();
            lVar2 = (f0VarR == null || (cVar = f0VarR.D) == null) ? null : (v1) cVar.f824f;
        }
    }

    public final j d0() {
        boolean z10;
        al.c cVar;
        j jVar = new j();
        jVar.f7651a = true;
        k kVar = k.f7660b;
        jVar.f7652b = kVar;
        jVar.f7653c = kVar;
        jVar.f7654d = kVar;
        jVar.f7655e = kVar;
        jVar.f7656f = kVar;
        jVar.f7657g = kVar;
        jVar.f7658h = kVar;
        jVar.f7659i = kVar;
        jVar.j = i.f7648g;
        jVar.k = i.f7649r;
        int i10 = this.f7670s;
        if (i10 == 1) {
            z10 = true;
        } else if (i10 == 0) {
            z10 = !(((p1.a) ((b2) ((p1.c) ((p1.b) x1.k.h(this, c1.f25649m))).f20239a).getValue()).f20238a == 1);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z10 = false;
        }
        jVar.f7651a = z10;
        z0.l lVar = this.f26495b;
        if (!lVar.f26506o) {
            u1.a.b("visitAncestors called on an unattached node");
        }
        z0.l lVar2 = this.f26495b;
        f0 f0VarR = x1.k.r(this);
        loop0: while (f0VarR != null) {
            if ((((z0.l) f0VarR.D.f825g).f26498e & 3072) != 0) {
                while (lVar2 != null) {
                    int i11 = lVar2.f26497d;
                    if ((i11 & 3072) != 0) {
                        if (lVar2 != lVar && (i11 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i11 & 2048) != 0) {
                            z0.l lVarE = lVar2;
                            p0.e eVar = null;
                            while (lVarE != null) {
                                if (lVarE instanceof x1.c) {
                                    z0.k kVar2 = ((x1.c) lVarE).f24776p;
                                    u1.a.b("applyFocusProperties called on wrong node");
                                    w.g.p(kVar2);
                                    throw null;
                                }
                                if ((lVarE.f26497d & 2048) != 0 && (lVarE instanceof x1.j)) {
                                    int i12 = 0;
                                    for (z0.l lVar3 = ((x1.j) lVarE).f24863q; lVar3 != null; lVar3 = lVar3.f26500g) {
                                        if ((lVar3.f26497d & 2048) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                lVarE = lVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new p0.e(new z0.l[16]);
                                                }
                                                if (lVarE != null) {
                                                    eVar.b(lVarE);
                                                    lVarE = null;
                                                }
                                                eVar.b(lVar3);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                lVarE = x1.k.e(eVar);
                            }
                        } else {
                            continue;
                        }
                    }
                    lVar2 = lVar2.f26499f;
                }
            }
            f0VarR = f0VarR.C();
            lVar2 = (f0VarR == null || (cVar = f0VarR.D) == null) ? null : (v1) cVar.f824f;
        }
        return jVar;
    }

    public final n e0() {
        al.c cVar;
        if (!this.f26506o) {
            return n.Inactive;
        }
        a8.f fVar = (a8.f) x1.k.s(this).getFocusOwner();
        p pVar = (p) fVar.f202h;
        if (pVar == null) {
            return n.Inactive;
        }
        if (this == pVar) {
            fVar.getClass();
            return n.Active;
        }
        if (pVar.f26506o) {
            if (!pVar.f26495b.f26506o) {
                u1.a.b("visitAncestors called on an unattached node");
            }
            z0.l lVar = pVar.f26495b.f26499f;
            f0 f0VarR = x1.k.r(pVar);
            while (f0VarR != null) {
                if ((((z0.l) f0VarR.D.f825g).f26498e & 1024) != 0) {
                    while (lVar != null) {
                        if ((lVar.f26497d & 1024) != 0) {
                            z0.l lVarE = lVar;
                            p0.e eVar = null;
                            while (lVarE != null) {
                                if (lVarE instanceof p) {
                                    if (this == ((p) lVarE)) {
                                        return n.ActiveParent;
                                    }
                                } else if ((lVarE.f26497d & 1024) != 0 && (lVarE instanceof x1.j)) {
                                    int i10 = 0;
                                    for (z0.l lVar2 = ((x1.j) lVarE).f24863q; lVar2 != null; lVar2 = lVar2.f26500g) {
                                        if ((lVar2.f26497d & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                lVarE = lVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new p0.e(new z0.l[16]);
                                                }
                                                if (lVarE != null) {
                                                    eVar.b(lVarE);
                                                    lVarE = null;
                                                }
                                                eVar.b(lVar2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                lVarE = x1.k.e(eVar);
                            }
                        }
                        lVar = lVar.f26499f;
                    }
                }
                f0VarR = f0VarR.C();
                lVar = (f0VarR == null || (cVar = f0VarR.D) == null) ? null : (v1) cVar.f824f;
            }
        }
        return n.Inactive;
    }

    public final void f0() {
        int i10 = o.f7666b[e0().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                throw new bf.n();
            }
            return;
        }
        w wVar = new w();
        x1.k.p(this, new ah.d(wVar, 12, this));
        Object obj = wVar.f2917a;
        if (obj == null) {
            br.l.l("focusProperties");
            throw null;
        }
        if (((j) obj).f7651a) {
            return;
        }
        ((a8.f) x1.k.s(this).getFocusOwner()).h(8, true, true);
    }

    public final boolean g0(int i10) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zV = false;
            if (!d0().f7651a) {
                Trace.endSection();
                return false;
            }
            int i11 = o.f7665a[d.u(this).ordinal()];
            if (i11 == 1) {
                zV = d.v(this);
            } else if (i11 == 2) {
                zV = true;
            } else if (i11 != 3 && i11 != 4) {
                throw new bf.n();
            }
            return zV;
        } finally {
            Trace.endSection();
        }
    }
}
