package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zu extends s00 {
    public int A0;
    public ra B0;
    public di C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public pi[] X0;
    public pi[] Y0;
    public int[] Z0;
    public pi[] a1;
    public int b1;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    @Override // defpackage.s00
    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            pi piVar = this.q0[i];
            if (piVar != null) {
                piVar.F = true;
            }
        }
    }

    public final int T(pi piVar, int i) {
        pi piVar2;
        if (piVar != null) {
            int[] iArr = piVar.p0;
            if (iArr[1] == 3) {
                int i2 = piVar.s;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (piVar.z * i);
                        if (i3 != piVar.k()) {
                            piVar.g = true;
                            V(iArr[0], piVar.q(), 1, i3, piVar);
                        }
                        return i3;
                    }
                    piVar2 = piVar;
                    if (i2 == 1) {
                        return piVar2.k();
                    }
                    if (i2 == 3) {
                        return (int) ((piVar2.q() * piVar2.W) + 0.5f);
                    }
                }
            } else {
                piVar2 = piVar;
            }
            return piVar2.k();
        }
        return 0;
    }

    public final int U(pi piVar, int i) {
        pi piVar2;
        if (piVar != null) {
            int[] iArr = piVar.p0;
            if (iArr[0] == 3) {
                int i2 = piVar.r;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (piVar.w * i);
                        if (i3 != piVar.q()) {
                            piVar.g = true;
                            V(1, i3, iArr[1], piVar.k(), piVar);
                        }
                        return i3;
                    }
                    piVar2 = piVar;
                    if (i2 == 1) {
                        return piVar2.q();
                    }
                    if (i2 == 3) {
                        return (int) ((piVar2.k() * piVar2.W) + 0.5f);
                    }
                }
            } else {
                piVar2 = piVar;
            }
            return piVar2.q();
        }
        return 0;
    }

    public final void V(int i, int i2, int i3, int i4, pi piVar) {
        di diVar;
        pi piVar2;
        ra raVar = this.B0;
        while (true) {
            diVar = this.C0;
            if (diVar != null || (piVar2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((qi) piVar2).u0;
            }
        }
        raVar.a = i;
        raVar.b = i3;
        raVar.c = i2;
        raVar.d = i4;
        diVar.b(piVar, raVar);
        piVar.O(raVar.e);
        piVar.L(raVar.f);
        piVar.E = raVar.h;
        piVar.I(raVar.g);
    }

    @Override // defpackage.pi
    public final void b(x60 x60Var, boolean z) {
        pi piVar;
        float f;
        int i;
        ArrayList arrayList = this.W0;
        super.b(x60Var, z);
        pi piVar2 = this.T;
        boolean z2 = piVar2 != null && ((qi) piVar2).v0;
        int i2 = this.T0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((xu) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((xu) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                for (int i5 = 0; i5 < this.b1; i5++) {
                    this.a1[i5].D();
                }
                int[] iArr = this.Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.J0;
                pi piVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.J0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    pi piVar4 = this.Y0[i];
                    if (piVar4 != null) {
                        wh whVar = piVar4.I;
                        if (piVar4.g0 != 8) {
                            if (i8 == 0) {
                                piVar4.f(whVar, this.I, this.w0);
                                piVar4.i0 = this.D0;
                                piVar4.d0 = f;
                            }
                            if (i8 == i6 - 1) {
                                piVar4.f(piVar4.K, this.K, this.x0);
                            }
                            if (i8 > 0 && piVar3 != null) {
                                wh whVar2 = piVar3.K;
                                piVar4.f(whVar, whVar2, this.P0);
                                piVar3.f(whVar2, whVar, 0);
                            }
                            piVar3 = piVar4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    pi piVar5 = this.X0[i9];
                    if (piVar5 != null) {
                        wh whVar3 = piVar5.J;
                        if (piVar5.g0 != 8) {
                            if (i9 == 0) {
                                piVar5.f(whVar3, this.J, this.s0);
                                piVar5.j0 = this.E0;
                                piVar5.e0 = this.K0;
                            }
                            if (i9 == i7 - 1) {
                                piVar5.f(piVar5.L, this.L, this.t0);
                            }
                            if (i9 > 0 && piVar3 != null) {
                                wh whVar4 = piVar3.L;
                                piVar5.f(whVar3, whVar4, this.Q0);
                                piVar3.f(whVar4, whVar3, 0);
                            }
                            piVar3 = piVar5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.V0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        pi[] piVarArr = this.a1;
                        if (i12 < piVarArr.length && (piVar = piVarArr[i12]) != null && piVar.g0 != 8) {
                            pi piVar6 = this.Y0[i10];
                            pi piVar7 = this.X0[i11];
                            if (piVar != piVar6) {
                                piVar.f(piVar.I, piVar6.I, 0);
                                piVar.f(piVar.K, piVar6.K, 0);
                            }
                            if (piVar != piVar7) {
                                piVar.f(piVar.J, piVar7.J, 0);
                                piVar.f(piVar.L, piVar7.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((xu) arrayList.get(0)).b(0, z2, true);
        }
        this.y0 = false;
    }
}
