package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b00 extends pi {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public wh t0 = this.J;
    public int u0 = 0;
    public boolean v0;

    public b00() {
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    @Override // defpackage.pi
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.pi
    public final boolean B() {
        return this.v0;
    }

    @Override // defpackage.pi
    public final void Q(x60 x60Var, boolean z) {
        if (this.T == null) {
            return;
        }
        wh whVar = this.t0;
        x60Var.getClass();
        int iN = x60.n(whVar);
        if (this.u0 == 1) {
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

    public final void R(int i) {
        this.t0.l(i);
        this.v0 = true;
    }

    public final void S(int i) {
        if (this.u0 == i) {
            return;
        }
        this.u0 = i;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.u0 == 1) {
            this.t0 = this.I;
        } else {
            this.t0 = this.J;
        }
        arrayList.add(this.t0);
        wh[] whVarArr = this.Q;
        int length = whVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            whVarArr[i2] = this.t0;
        }
    }

    @Override // defpackage.pi
    public final void b(x60 x60Var, boolean z) {
        qi qiVar = (qi) this.T;
        if (qiVar == null) {
            return;
        }
        Object objI = qiVar.i(2);
        Object objI2 = qiVar.i(4);
        pi piVar = this.T;
        boolean z2 = piVar != null && piVar.p0[0] == 2;
        if (this.u0 == 0) {
            objI = qiVar.i(3);
            objI2 = qiVar.i(5);
            pi piVar2 = this.T;
            z2 = piVar2 != null && piVar2.p0[1] == 2;
        }
        if (this.v0) {
            wh whVar = this.t0;
            if (whVar.c) {
                fx0 fx0VarK = x60Var.k(whVar);
                x60Var.d(fx0VarK, this.t0.d());
                if (this.r0 != -1) {
                    if (z2) {
                        x60Var.f(x60Var.k(objI2), fx0VarK, 0, 5);
                    }
                } else if (this.s0 != -1 && z2) {
                    fx0 fx0VarK2 = x60Var.k(objI2);
                    x60Var.f(fx0VarK, x60Var.k(objI), 0, 5);
                    x60Var.f(fx0VarK2, fx0VarK, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            fx0 fx0VarK3 = x60Var.k(this.t0);
            x60Var.e(fx0VarK3, x60Var.k(objI), this.r0, 8);
            if (z2) {
                x60Var.f(x60Var.k(objI2), fx0VarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            fx0 fx0VarK4 = x60Var.k(this.t0);
            fx0 fx0VarK5 = x60Var.k(objI2);
            x60Var.e(fx0VarK4, fx0VarK5, -this.s0, 8);
            if (z2) {
                x60Var.f(fx0VarK4, x60Var.k(objI), 0, 5);
                x60Var.f(fx0VarK5, fx0VarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.q0 != -1.0f) {
            fx0 fx0VarK6 = x60Var.k(this.t0);
            fx0 fx0VarK7 = x60Var.k(objI2);
            float f = this.q0;
            t8 t8VarL = x60Var.l();
            t8VarL.d.g(fx0VarK6, -1.0f);
            t8VarL.d.g(fx0VarK7, f);
            x60Var.c(t8VarL);
        }
    }

    @Override // defpackage.pi
    public final boolean c() {
        return true;
    }

    @Override // defpackage.pi
    public final wh i(int i) {
        int iS = ex0.s(i);
        if (iS != 1) {
            if (iS != 2) {
                if (iS != 3) {
                    if (iS != 4) {
                        return null;
                    }
                }
            }
            if (this.u0 == 0) {
                return this.t0;
            }
            return null;
        }
        if (this.u0 == 1) {
            return this.t0;
        }
        return null;
    }
}
