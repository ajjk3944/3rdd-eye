package x1;

/* loaded from: classes.dex */
public abstract class j extends z0.l {

    /* renamed from: p, reason: collision with root package name */
    public final int f24862p = g1.e(this);

    /* renamed from: q, reason: collision with root package name */
    public z0.l f24863q;

    @Override // z0.l
    public final void S() {
        super.S();
        for (z0.l lVar = this.f24863q; lVar != null; lVar = lVar.f26500g) {
            lVar.b0(this.f26502i);
            if (!lVar.f26506o) {
                lVar.S();
            }
        }
    }

    @Override // z0.l
    public final void T() {
        for (z0.l lVar = this.f24863q; lVar != null; lVar = lVar.f26500g) {
            lVar.T();
        }
        super.T();
    }

    @Override // z0.l
    public final void X() {
        super.X();
        for (z0.l lVar = this.f24863q; lVar != null; lVar = lVar.f26500g) {
            lVar.X();
        }
    }

    @Override // z0.l
    public final void Y() {
        for (z0.l lVar = this.f24863q; lVar != null; lVar = lVar.f26500g) {
            lVar.Y();
        }
        super.Y();
    }

    @Override // z0.l
    public final void Z() {
        super.Z();
        for (z0.l lVar = this.f24863q; lVar != null; lVar = lVar.f26500g) {
            lVar.Z();
        }
    }

    @Override // z0.l
    public final void a0(z0.l lVar) {
        this.f26495b = lVar;
        for (z0.l lVar2 = this.f24863q; lVar2 != null; lVar2 = lVar2.f26500g) {
            lVar2.a0(lVar);
        }
    }

    @Override // z0.l
    public final void b0(f1 f1Var) {
        this.f26502i = f1Var;
        for (z0.l lVar = this.f24863q; lVar != null; lVar = lVar.f26500g) {
            lVar.b0(f1Var);
        }
    }

    public final void c0(i iVar) {
        z0.l lVar = ((z0.l) iVar).f26495b;
        if (lVar != iVar) {
            z0.l lVar2 = iVar instanceof z0.l ? (z0.l) iVar : null;
            z0.l lVar3 = lVar2 != null ? lVar2.f26499f : null;
            if (lVar != this.f26495b || !br.l.a(lVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (lVar.f26506o) {
            u1.a.b("Cannot delegate to an already attached node");
        }
        lVar.a0(this.f26495b);
        int i10 = this.f26497d;
        int iF = g1.f(lVar);
        lVar.f26497d = iF;
        int i11 = this.f26497d;
        int i12 = iF & 2;
        if (i12 != 0 && (i11 & 2) != 0 && !(this instanceof v)) {
            u1.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + lVar);
        }
        lVar.f26500g = this.f24863q;
        this.f24863q = lVar;
        lVar.f26499f = this;
        e0(iF | this.f26497d, false);
        if (this.f26506o) {
            if (i12 == 0 || (i10 & 2) != 0) {
                b0(this.f26502i);
            } else {
                al.c cVar = k.r(this).D;
                this.f26495b.b0(null);
                cVar.r();
            }
            lVar.S();
            lVar.Y();
            if (!lVar.f26506o) {
                u1.a.b("autoInvalidateInsertedNode called on unattached node");
            }
            g1.a(lVar, -1, 1);
        }
    }

    public final void d0(i iVar) {
        z0.l lVar = null;
        for (z0.l lVar2 = this.f24863q; lVar2 != null; lVar2 = lVar2.f26500g) {
            if (lVar2 == iVar) {
                boolean z10 = lVar2.f26506o;
                if (z10) {
                    u.y yVar = g1.f24843a;
                    if (!z10) {
                        u1.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    g1.a(lVar2, -1, 2);
                    lVar2.Z();
                    lVar2.T();
                }
                lVar2.a0(lVar2);
                lVar2.f26498e = 0;
                if (lVar == null) {
                    this.f24863q = lVar2.f26500g;
                } else {
                    lVar.f26500g = lVar2.f26500g;
                }
                lVar2.f26500g = null;
                lVar2.f26499f = null;
                int i10 = this.f26497d;
                int iF = g1.f(this);
                e0(iF, true);
                if (this.f26506o && (i10 & 2) != 0 && (iF & 2) == 0) {
                    al.c cVar = k.r(this).D;
                    this.f26495b.b0(null);
                    cVar.r();
                    return;
                }
                return;
            }
            lVar = lVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + iVar).toString());
    }

    public final void e0(int i10, boolean z10) {
        z0.l lVar;
        int i11 = this.f26497d;
        this.f26497d = i10;
        if (i11 != i10) {
            z0.l lVar2 = this.f26495b;
            if (lVar2 == this) {
                this.f26498e = i10;
            }
            if (this.f26506o) {
                z0.l lVar3 = this;
                while (lVar3 != null) {
                    i10 |= lVar3.f26497d;
                    lVar3.f26497d = i10;
                    if (lVar3 == lVar2) {
                        break;
                    } else {
                        lVar3 = lVar3.f26499f;
                    }
                }
                if (z10 && lVar3 == lVar2) {
                    i10 = g1.f(lVar2);
                    lVar2.f26497d = i10;
                }
                int i12 = i10 | ((lVar3 == null || (lVar = lVar3.f26500g) == null) ? 0 : lVar.f26498e);
                while (lVar3 != null) {
                    i12 |= lVar3.f26497d;
                    lVar3.f26498e = i12;
                    lVar3 = lVar3.f26499f;
                }
            }
        }
    }
}
