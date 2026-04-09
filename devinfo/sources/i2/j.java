package i2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class j extends i1.m {

    /* renamed from: o, reason: collision with root package name */
    public final int f25690o = e1.e(this);

    /* renamed from: p, reason: collision with root package name */
    public i1.m f25691p;

    @Override // i1.m
    public final void d0() {
        super.d0();
        for (i1.m mVar = this.f25691p; mVar != null; mVar = mVar.f25559f) {
            mVar.o0(this.f25560h);
            if (!mVar.f25565n) {
                mVar.d0();
            }
        }
    }

    @Override // i1.m
    public final void e0() {
        for (i1.m mVar = this.f25691p; mVar != null; mVar = mVar.f25559f) {
            mVar.e0();
        }
        super.e0();
    }

    @Override // i1.m
    public final void k0() {
        super.k0();
        for (i1.m mVar = this.f25691p; mVar != null; mVar = mVar.f25559f) {
            mVar.k0();
        }
    }

    @Override // i1.m
    public final void l0() {
        for (i1.m mVar = this.f25691p; mVar != null; mVar = mVar.f25559f) {
            mVar.l0();
        }
        super.l0();
    }

    @Override // i1.m
    public final void m0() {
        super.m0();
        for (i1.m mVar = this.f25691p; mVar != null; mVar = mVar.f25559f) {
            mVar.m0();
        }
    }

    @Override // i1.m
    public final void n0(i1.m mVar) {
        this.f25554a = mVar;
        for (i1.m mVar2 = this.f25691p; mVar2 != null; mVar2 = mVar2.f25559f) {
            mVar2.n0(mVar);
        }
    }

    @Override // i1.m
    public final void o0(d1 d1Var) {
        this.f25560h = d1Var;
        for (i1.m mVar = this.f25691p; mVar != null; mVar = mVar.f25559f) {
            mVar.o0(d1Var);
        }
    }

    public final i p0(i iVar) {
        i1.m mVar = ((i1.m) iVar).f25554a;
        if (mVar != iVar) {
            i1.m mVar2 = iVar instanceof i1.m ? (i1.m) iVar : null;
            i1.m mVar3 = mVar2 != null ? mVar2.f25558e : null;
            if (mVar != this.f25554a || !nk.k.a(mVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (mVar.f25565n) {
                f2.a.b("Cannot delegate to an already attached node");
            }
            mVar.n0(this.f25554a);
            int i4 = this.f25556c;
            int iF = e1.f(mVar);
            mVar.f25556c = iF;
            int i10 = this.f25556c;
            int i11 = iF & 2;
            if (i11 != 0 && (i10 & 2) != 0 && !(this instanceof u)) {
                f2.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + mVar);
            }
            mVar.f25559f = this.f25691p;
            this.f25691p = mVar;
            mVar.f25558e = this;
            r0(iF | this.f25556c, false);
            if (this.f25565n) {
                if (i11 == 0 || (i4 & 2) != 0) {
                    o0(this.f25560h);
                } else {
                    com.google.android.gms.internal.consent_sdk.a0 a0Var = k.s(this).G;
                    this.f25554a.o0(null);
                    a0Var.i();
                }
                mVar.d0();
                mVar.l0();
                if (!mVar.f25565n) {
                    f2.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                e1.a(mVar, -1, 1);
            }
        }
        return iVar;
    }

    public final void q0(i iVar) {
        i1.m mVar = null;
        for (i1.m mVar2 = this.f25691p; mVar2 != null; mVar2 = mVar2.f25559f) {
            if (mVar2 == iVar) {
                boolean z3 = mVar2.f25565n;
                if (z3) {
                    x.z zVar = e1.f25651a;
                    if (!z3) {
                        f2.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    e1.a(mVar2, -1, 2);
                    mVar2.m0();
                    mVar2.e0();
                }
                mVar2.n0(mVar2);
                mVar2.f25557d = 0;
                if (mVar == null) {
                    this.f25691p = mVar2.f25559f;
                } else {
                    mVar.f25559f = mVar2.f25559f;
                }
                mVar2.f25559f = null;
                mVar2.f25558e = null;
                int i4 = this.f25556c;
                int iF = e1.f(this);
                r0(iF, true);
                if (this.f25565n && (i4 & 2) != 0 && (iF & 2) == 0) {
                    com.google.android.gms.internal.consent_sdk.a0 a0Var = k.s(this).G;
                    this.f25554a.o0(null);
                    a0Var.i();
                    return;
                }
                return;
            }
            mVar = mVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + iVar).toString());
    }

    public final void r0(int i4, boolean z3) {
        i1.m mVar;
        int i10 = this.f25556c;
        this.f25556c = i4;
        if (i10 != i4) {
            i1.m mVar2 = this.f25554a;
            if (mVar2 == this) {
                this.f25557d = i4;
            }
            if (this.f25565n) {
                i1.m mVar3 = this;
                while (mVar3 != null) {
                    i4 |= mVar3.f25556c;
                    mVar3.f25556c = i4;
                    if (mVar3 == mVar2) {
                        break;
                    } else {
                        mVar3 = mVar3.f25558e;
                    }
                }
                if (z3 && mVar3 == mVar2) {
                    i4 = e1.f(mVar2);
                    mVar2.f25556c = i4;
                }
                int i11 = i4 | ((mVar3 == null || (mVar = mVar3.f25559f) == null) ? 0 : mVar.f25557d);
                while (mVar3 != null) {
                    i11 |= mVar3.f25556c;
                    mVar3.f25557d = i11;
                    mVar3 = mVar3.f25558e;
                }
            }
        }
    }
}
