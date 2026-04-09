package z2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends m {
    public int A0;
    public a3.b B0;
    public c3.g C0;
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
    public g[] X0;
    public g[] Y0;
    public int[] Z0;

    /* renamed from: a1, reason: collision with root package name */
    public g[] f26602a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f26603b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f26604s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f26605t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f26606u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f26607v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f26608w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f26609x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f26610y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f26611z0;

    @Override // z2.m
    public final void S() {
        for (int i10 = 0; i10 < this.f26620r0; i10++) {
            g gVar = this.f26619q0[i10];
            if (gVar != null) {
                gVar.F = true;
            }
        }
    }

    public final int T(g gVar, int i10) {
        g gVar2;
        if (gVar == null) {
            return 0;
        }
        f[] fVarArr = gVar.T;
        if (fVarArr[1] == f.MATCH_CONSTRAINT) {
            int i11 = gVar.f26568s;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (gVar.f26575z * i10);
                if (i12 != gVar.k()) {
                    gVar.f26548g = true;
                    V(gVar, fVarArr[0], gVar.q(), f.FIXED, i12);
                }
                return i12;
            }
            gVar2 = gVar;
            if (i11 == 1) {
                return gVar2.k();
            }
            if (i11 == 3) {
                return (int) ((gVar2.q() * gVar2.X) + 0.5f);
            }
        } else {
            gVar2 = gVar;
        }
        return gVar2.k();
    }

    public final int U(g gVar, int i10) {
        g gVar2;
        if (gVar == null) {
            return 0;
        }
        f[] fVarArr = gVar.T;
        if (fVarArr[0] == f.MATCH_CONSTRAINT) {
            int i11 = gVar.f26567r;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (gVar.f26572w * i10);
                if (i12 != gVar.q()) {
                    gVar.f26548g = true;
                    V(gVar, f.FIXED, i12, fVarArr[1], gVar.k());
                }
                return i12;
            }
            gVar2 = gVar;
            if (i11 == 1) {
                return gVar2.q();
            }
            if (i11 == 3) {
                return (int) ((gVar2.k() * gVar2.X) + 0.5f);
            }
        } else {
            gVar2 = gVar;
        }
        return gVar2.q();
    }

    public final void V(g gVar, f fVar, int i10, f fVar2, int i11) {
        c3.g gVar2;
        g gVar3;
        a3.b bVar = this.B0;
        while (true) {
            gVar2 = this.C0;
            if (gVar2 != null || (gVar3 = this.U) == null) {
                break;
            } else {
                this.C0 = ((h) gVar3).f26580u0;
            }
        }
        bVar.f32a = fVar;
        bVar.f33b = fVar2;
        bVar.f34c = i10;
        bVar.f35d = i11;
        gVar2.b(gVar, bVar);
        gVar.O(bVar.f36e);
        gVar.L(bVar.f37f);
        gVar.E = bVar.f39h;
        gVar.I(bVar.f38g);
    }

    @Override // z2.g
    public final void b(x2.c cVar, boolean z10) {
        g gVar;
        float f10;
        int i10;
        ArrayList arrayList = this.W0;
        super.b(cVar, z10);
        g gVar2 = this.U;
        boolean z11 = gVar2 != null && ((h) gVar2).f26581v0;
        int i11 = this.T0;
        if (i11 != 0) {
            if (i11 == 1) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    ((i) arrayList.get(i12)).b(i12, z11, i12 == size + (-1));
                    i12++;
                }
            } else if (i11 != 2) {
                if (i11 == 3) {
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        ((i) arrayList.get(i13)).b(i13, z11, i13 == size2 + (-1));
                        i13++;
                    }
                }
            } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                for (int i14 = 0; i14 < this.f26603b1; i14++) {
                    this.f26602a1[i14].D();
                }
                int[] iArr = this.Z0;
                int i15 = iArr[0];
                int i16 = iArr[1];
                float f11 = this.J0;
                g gVar3 = null;
                int i17 = 0;
                while (i17 < i15) {
                    if (z11) {
                        i10 = (i15 - i17) - 1;
                        f10 = 1.0f - this.J0;
                    } else {
                        f10 = f11;
                        i10 = i17;
                    }
                    g gVar4 = this.Y0[i10];
                    if (gVar4 != null) {
                        d dVar = gVar4.I;
                        if (gVar4.f26551h0 != 8) {
                            if (i17 == 0) {
                                gVar4.f(dVar, this.I, this.f26608w0);
                                gVar4.f26554j0 = this.D0;
                                gVar4.f26545e0 = f10;
                            }
                            if (i17 == i15 - 1) {
                                gVar4.f(gVar4.K, this.K, this.f26609x0);
                            }
                            if (i17 > 0 && gVar3 != null) {
                                d dVar2 = gVar3.K;
                                gVar4.f(dVar, dVar2, this.P0);
                                gVar3.f(dVar2, dVar, 0);
                            }
                            gVar3 = gVar4;
                        }
                    }
                    i17++;
                    f11 = f10;
                }
                for (int i18 = 0; i18 < i16; i18++) {
                    g gVar5 = this.X0[i18];
                    if (gVar5 != null) {
                        d dVar3 = gVar5.J;
                        if (gVar5.f26551h0 != 8) {
                            if (i18 == 0) {
                                gVar5.f(dVar3, this.J, this.f26604s0);
                                gVar5.f26555k0 = this.E0;
                                gVar5.f26547f0 = this.K0;
                            }
                            if (i18 == i16 - 1) {
                                gVar5.f(gVar5.L, this.L, this.f26605t0);
                            }
                            if (i18 > 0 && gVar3 != null) {
                                d dVar4 = gVar3.L;
                                gVar5.f(dVar3, dVar4, this.Q0);
                                gVar3.f(dVar4, dVar3, 0);
                            }
                            gVar3 = gVar5;
                        }
                    }
                }
                for (int i19 = 0; i19 < i15; i19++) {
                    for (int i20 = 0; i20 < i16; i20++) {
                        int i21 = (i20 * i15) + i19;
                        if (this.V0 == 1) {
                            i21 = (i19 * i16) + i20;
                        }
                        g[] gVarArr = this.f26602a1;
                        if (i21 < gVarArr.length && (gVar = gVarArr[i21]) != null && gVar.f26551h0 != 8) {
                            g gVar6 = this.Y0[i19];
                            g gVar7 = this.X0[i20];
                            if (gVar != gVar6) {
                                gVar.f(gVar.I, gVar6.I, 0);
                                gVar.f(gVar.K, gVar6.K, 0);
                            }
                            if (gVar != gVar7) {
                                gVar.f(gVar.J, gVar7.J, 0);
                                gVar.f(gVar.L, gVar7.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((i) arrayList.get(0)).b(0, z11, true);
        }
        this.f26610y0 = false;
    }
}
