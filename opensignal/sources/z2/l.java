package z2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends g {

    /* renamed from: q0, reason: collision with root package name */
    public float f26613q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f26614r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f26615s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public d f26616t0 = this.J;

    /* renamed from: u0, reason: collision with root package name */
    public int f26617u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f26618v0;

    public l() {
        this.R.clear();
        this.R.add(this.f26616t0);
        int length = this.Q.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.Q[i10] = this.f26616t0;
        }
    }

    @Override // z2.g
    public final boolean A() {
        return this.f26618v0;
    }

    @Override // z2.g
    public final boolean B() {
        return this.f26618v0;
    }

    @Override // z2.g
    public final void Q(x2.c cVar, boolean z10) {
        if (this.U == null) {
            return;
        }
        d dVar = this.f26616t0;
        cVar.getClass();
        int iN = x2.c.n(dVar);
        if (this.f26617u0 == 1) {
            this.Z = iN;
            this.f26537a0 = 0;
            L(this.U.k());
            O(0);
            return;
        }
        this.Z = 0;
        this.f26537a0 = iN;
        O(this.U.q());
        L(0);
    }

    public final void R(int i10) {
        this.f26616t0.l(i10);
        this.f26618v0 = true;
    }

    public final void S(int i10) {
        if (this.f26617u0 == i10) {
            return;
        }
        this.f26617u0 = i10;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.f26617u0 == 1) {
            this.f26616t0 = this.I;
        } else {
            this.f26616t0 = this.J;
        }
        arrayList.add(this.f26616t0);
        d[] dVarArr = this.Q;
        int length = dVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            dVarArr[i11] = this.f26616t0;
        }
    }

    @Override // z2.g
    public final void b(x2.c cVar, boolean z10) {
        h hVar = (h) this.U;
        if (hVar == null) {
            return;
        }
        Object objI = hVar.i(c.LEFT);
        Object objI2 = hVar.i(c.RIGHT);
        g gVar = this.U;
        boolean z11 = gVar != null && gVar.T[0] == f.WRAP_CONTENT;
        if (this.f26617u0 == 0) {
            objI = hVar.i(c.TOP);
            objI2 = hVar.i(c.BOTTOM);
            g gVar2 = this.U;
            z11 = gVar2 != null && gVar2.T[1] == f.WRAP_CONTENT;
        }
        if (this.f26618v0) {
            d dVar = this.f26616t0;
            if (dVar.f26528c) {
                x2.f fVarK = cVar.k(dVar);
                cVar.d(fVarK, this.f26616t0.d());
                if (this.f26614r0 != -1) {
                    if (z11) {
                        cVar.f(cVar.k(objI2), fVarK, 0, 5);
                    }
                } else if (this.f26615s0 != -1 && z11) {
                    x2.f fVarK2 = cVar.k(objI2);
                    cVar.f(fVarK, cVar.k(objI), 0, 5);
                    cVar.f(fVarK2, fVarK, 0, 5);
                }
                this.f26618v0 = false;
                return;
            }
        }
        if (this.f26614r0 != -1) {
            x2.f fVarK3 = cVar.k(this.f26616t0);
            cVar.e(fVarK3, cVar.k(objI), this.f26614r0, 8);
            if (z11) {
                cVar.f(cVar.k(objI2), fVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f26615s0 != -1) {
            x2.f fVarK4 = cVar.k(this.f26616t0);
            x2.f fVarK5 = cVar.k(objI2);
            cVar.e(fVarK4, fVarK5, -this.f26615s0, 8);
            if (z11) {
                cVar.f(fVarK4, cVar.k(objI), 0, 5);
                cVar.f(fVarK5, fVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f26613q0 != -1.0f) {
            x2.f fVarK6 = cVar.k(this.f26616t0);
            x2.f fVarK7 = cVar.k(objI2);
            float f10 = this.f26613q0;
            x2.b bVarL = cVar.l();
            bVarL.f24990d.g(fVarK6, -1.0f);
            bVarL.f24990d.g(fVarK7, f10);
            cVar.c(bVarL);
        }
    }

    @Override // z2.g
    public final boolean c() {
        return true;
    }

    @Override // z2.g
    public final d i(c cVar) {
        int i10 = k.f26612a[cVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.f26617u0 == 1) {
                return this.f26616t0;
            }
            return null;
        }
        if ((i10 == 3 || i10 == 4) && this.f26617u0 == 0) {
            return this.f26616t0;
        }
        return null;
    }
}
