package k3;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f27915q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f27916r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f27917s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f27918t0 = this.J;

    /* renamed from: u0, reason: collision with root package name */
    public int f27919u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f27920v0;

    public h() {
        this.R.clear();
        this.R.add(this.f27918t0);
        int length = this.Q.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.Q[i4] = this.f27918t0;
        }
    }

    @Override // k3.d
    public final boolean A() {
        return this.f27920v0;
    }

    @Override // k3.d
    public final boolean B() {
        return this.f27920v0;
    }

    @Override // k3.d
    public final void Q(i3.c cVar, boolean z3) {
        if (this.T == null) {
            return;
        }
        c cVar2 = this.f27918t0;
        cVar.getClass();
        int iN = i3.c.n(cVar2);
        if (this.f27919u0 == 1) {
            this.Y = iN;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = iN;
        O(this.T.q());
        L(0);
    }

    public final void R(int i4) {
        this.f27918t0.l(i4);
        this.f27920v0 = true;
    }

    public final void S(int i4) {
        if (this.f27919u0 == i4) {
            return;
        }
        this.f27919u0 = i4;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.f27919u0 == 1) {
            this.f27918t0 = this.I;
        } else {
            this.f27918t0 = this.J;
        }
        arrayList.add(this.f27918t0);
        c[] cVarArr = this.Q;
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            cVarArr[i10] = this.f27918t0;
        }
    }

    @Override // k3.d
    public final void b(i3.c cVar, boolean z3) {
        e eVar = (e) this.T;
        if (eVar == null) {
            return;
        }
        Object objI = eVar.i(2);
        Object objI2 = eVar.i(4);
        d dVar = this.T;
        boolean z10 = dVar != null && dVar.f27868p0[0] == 2;
        if (this.f27919u0 == 0) {
            objI = eVar.i(3);
            objI2 = eVar.i(5);
            d dVar2 = this.T;
            z10 = dVar2 != null && dVar2.f27868p0[1] == 2;
        }
        if (this.f27920v0) {
            c cVar2 = this.f27918t0;
            if (cVar2.f27833c) {
                i3.f fVarK = cVar.k(cVar2);
                cVar.d(fVarK, this.f27918t0.d());
                if (this.f27916r0 != -1) {
                    if (z10) {
                        cVar.f(cVar.k(objI2), fVarK, 0, 5);
                    }
                } else if (this.f27917s0 != -1 && z10) {
                    i3.f fVarK2 = cVar.k(objI2);
                    cVar.f(fVarK, cVar.k(objI), 0, 5);
                    cVar.f(fVarK2, fVarK, 0, 5);
                }
                this.f27920v0 = false;
                return;
            }
        }
        if (this.f27916r0 != -1) {
            i3.f fVarK3 = cVar.k(this.f27918t0);
            cVar.e(fVarK3, cVar.k(objI), this.f27916r0, 8);
            if (z10) {
                cVar.f(cVar.k(objI2), fVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f27917s0 != -1) {
            i3.f fVarK4 = cVar.k(this.f27918t0);
            i3.f fVarK5 = cVar.k(objI2);
            cVar.e(fVarK4, fVarK5, -this.f27917s0, 8);
            if (z10) {
                cVar.f(fVarK4, cVar.k(objI), 0, 5);
                cVar.f(fVarK5, fVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f27915q0 != -1.0f) {
            i3.f fVarK6 = cVar.k(this.f27918t0);
            i3.f fVarK7 = cVar.k(objI2);
            float f10 = this.f27915q0;
            i3.b bVarL = cVar.l();
            bVarL.f25832d.g(fVarK6, -1.0f);
            bVarL.f25832d.g(fVarK7, f10);
            cVar.c(bVarL);
        }
    }

    @Override // k3.d
    public final boolean c() {
        return true;
    }

    @Override // k3.d
    public final c i(int i4) {
        int iC = i3.e.c(i4);
        if (iC != 1) {
            if (iC != 2) {
                if (iC != 3) {
                    if (iC != 4) {
                        return null;
                    }
                }
            }
            if (this.f27919u0 == 0) {
                return this.f27918t0;
            }
            return null;
        }
        if (this.f27919u0 == 1) {
            return this.f27918t0;
        }
        return null;
    }
}
