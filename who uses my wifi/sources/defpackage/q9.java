package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q9 extends s00 {
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    @Override // defpackage.pi
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.pi
    public final boolean B() {
        return this.v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.r0;
            if (i4 >= i) {
                break;
            }
            pi piVar = this.q0[i4];
            if ((this.t0 || piVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !piVar.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !piVar.B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.r0; i5++) {
            pi piVar2 = this.q0[i5];
            if (this.t0 || piVar2.c()) {
                if (!z2) {
                    int i6 = this.s0;
                    if (i6 == 0) {
                        iMax = piVar2.i(2).d();
                    } else if (i6 == 1) {
                        iMax = piVar2.i(4).d();
                    } else if (i6 == 2) {
                        iMax = piVar2.i(3).d();
                    } else if (i6 == 3) {
                        iMax = piVar2.i(5).d();
                    }
                    z2 = true;
                }
                int i7 = this.s0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, piVar2.i(2).d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, piVar2.i(4).d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, piVar2.i(3).d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, piVar2.i(5).d());
                }
            }
        }
        int i8 = iMax + this.u0;
        int i9 = this.s0;
        if (i9 == 0 || i9 == 1) {
            J(i8, i8);
        } else {
            K(i8, i8);
        }
        this.v0 = true;
        return true;
    }

    public final int U() {
        int i = this.s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.pi
    public final void b(x60 x60Var, boolean z) {
        boolean z2;
        int i;
        int i2;
        wh[] whVarArr = this.Q;
        wh whVar = this.I;
        whVarArr[0] = whVar;
        int i3 = 2;
        wh whVar2 = this.J;
        whVarArr[2] = whVar2;
        wh whVar3 = this.K;
        whVarArr[1] = whVar3;
        wh whVar4 = this.L;
        whVarArr[3] = whVar4;
        for (wh whVar5 : whVarArr) {
            whVar5.i = x60Var.k(whVar5);
        }
        int i4 = this.s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        wh whVar6 = whVarArr[i4];
        if (!this.v0) {
            T();
        }
        if (this.v0) {
            this.v0 = false;
            int i5 = this.s0;
            if (i5 == 0 || i5 == 1) {
                x60Var.d(whVar.i, this.Y);
                x60Var.d(whVar3.i, this.Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    x60Var.d(whVar2.i, this.Z);
                    x60Var.d(whVar4.i, this.Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.r0; i6++) {
            pi piVar = this.q0[i6];
            if ((this.t0 || piVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && piVar.p0[0] == 3 && piVar.I.f != null && piVar.K.f != null) || ((i2 == 2 || i2 == 3) && piVar.p0[1] == 3 && piVar.J.f != null && piVar.L.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = whVar.g() || whVar3.g();
        boolean z4 = whVar2.g() || whVar4.g();
        int i7 = !(!z2 && (((i = this.s0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.r0) {
            pi piVar2 = this.q0[i8];
            if (this.t0 || piVar2.c()) {
                fx0 fx0VarK = x60Var.k(piVar2.Q[this.s0]);
                wh[] whVarArr2 = piVar2.Q;
                int i9 = this.s0;
                wh whVar7 = whVarArr2[i9];
                whVar7.i = fx0VarK;
                wh whVar8 = whVar7.f;
                int i10 = (whVar8 == null || whVar8.d != this) ? 0 : whVar7.g;
                if (i9 == 0 || i9 == i3) {
                    fx0 fx0Var = whVar6.i;
                    int i11 = this.u0 - i10;
                    t8 t8VarL = x60Var.l();
                    fx0 fx0VarM = x60Var.m();
                    fx0VarM.i = 0;
                    t8VarL.c(fx0Var, fx0VarK, fx0VarM, i11);
                    x60Var.c(t8VarL);
                } else {
                    fx0 fx0Var2 = whVar6.i;
                    int i12 = this.u0 + i10;
                    t8 t8VarL2 = x60Var.l();
                    fx0 fx0VarM2 = x60Var.m();
                    fx0VarM2.i = 0;
                    t8VarL2.b(fx0Var2, fx0VarK, fx0VarM2, i12);
                    x60Var.c(t8VarL2);
                }
                x60Var.e(whVar6.i, fx0VarK, this.u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.s0;
        if (i13 == 0) {
            x60Var.e(whVar3.i, whVar.i, 0, 8);
            x60Var.e(whVar.i, this.T.K.i, 0, 4);
            x60Var.e(whVar.i, this.T.I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            x60Var.e(whVar.i, whVar3.i, 0, 8);
            x60Var.e(whVar.i, this.T.I.i, 0, 4);
            x60Var.e(whVar.i, this.T.K.i, 0, 0);
        } else if (i13 == 2) {
            x60Var.e(whVar4.i, whVar2.i, 0, 8);
            x60Var.e(whVar2.i, this.T.L.i, 0, 4);
            x60Var.e(whVar2.i, this.T.J.i, 0, 0);
        } else if (i13 == 3) {
            x60Var.e(whVar2.i, whVar4.i, 0, 8);
            x60Var.e(whVar2.i, this.T.J.i, 0, 4);
            x60Var.e(whVar2.i, this.T.L.i, 0, 0);
        }
    }

    @Override // defpackage.pi
    public final boolean c() {
        return true;
    }

    @Override // defpackage.pi
    public final String toString() {
        String strK = ex0.k(new StringBuilder("[Barrier] "), this.h0, " {");
        for (int i = 0; i < this.r0; i++) {
            pi piVar = this.q0[i];
            if (i > 0) {
                strK = ex0.g(strK, ", ");
            }
            strK = strK + piVar.h0;
        }
        return ex0.g(strK, "}");
    }
}
