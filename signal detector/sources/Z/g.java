package z;

import java.util.ArrayList;
import x.C2982c;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f24395A0;

    /* renamed from: B0, reason: collision with root package name */
    public A.b f24396B0;

    /* renamed from: C0, reason: collision with root package name */
    public C.f f24397C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f24398D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f24399E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f24400F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f24401G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f24402H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f24403I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f24404J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f24405K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f24406L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f24407M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f24408N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f24409O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f24410P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f24411Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f24412R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f24413S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f24414T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f24415U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f24416V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f24417W0;

    /* renamed from: X0, reason: collision with root package name */
    public d[] f24418X0;

    /* renamed from: Y0, reason: collision with root package name */
    public d[] f24419Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f24420Z0;

    /* renamed from: a1, reason: collision with root package name */
    public d[] f24421a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f24422b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f24423s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f24424t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f24425u0;
    public int v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f24426w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f24427x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f24428y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f24429z0;

    @Override // z.i
    public final void S() {
        for (int i = 0; i < this.f24436r0; i++) {
            d dVar = this.f24435q0[i];
            if (dVar != null) {
                dVar.f24297F = true;
            }
        }
    }

    public final int T(d dVar, int i) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f24346p0;
            if (iArr[1] == 3) {
                int i3 = dVar.f24349s;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int i6 = (int) (dVar.f24356z * i);
                        if (i6 != dVar.k()) {
                            dVar.f24328g = true;
                            V(iArr[0], dVar.q(), 1, i6, dVar);
                        }
                        return i6;
                    }
                    dVar2 = dVar;
                    if (i3 == 1) {
                        return dVar2.k();
                    }
                    if (i3 == 3) {
                        return (int) ((dVar2.q() * dVar2.f24313W) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.k();
        }
        return 0;
    }

    public final int U(d dVar, int i) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f24346p0;
            if (iArr[0] == 3) {
                int i3 = dVar.f24348r;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int i6 = (int) (dVar.f24353w * i);
                        if (i6 != dVar.q()) {
                            dVar.f24328g = true;
                            V(1, i6, iArr[1], dVar.k(), dVar);
                        }
                        return i6;
                    }
                    dVar2 = dVar;
                    if (i3 == 1) {
                        return dVar2.q();
                    }
                    if (i3 == 3) {
                        return (int) ((dVar2.k() * dVar2.f24313W) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.q();
        }
        return 0;
    }

    public final void V(int i, int i3, int i6, int i7, d dVar) {
        C.f fVar;
        d dVar2;
        A.b bVar = this.f24396B0;
        while (true) {
            fVar = this.f24397C0;
            if (fVar != null || (dVar2 = this.f24310T) == null) {
                break;
            } else {
                this.f24397C0 = ((e) dVar2).f24373u0;
            }
        }
        bVar.f0a = i;
        bVar.f1b = i6;
        bVar.f2c = i3;
        bVar.f3d = i7;
        fVar.b(dVar, bVar);
        dVar.O(bVar.f4e);
        dVar.L(bVar.f5f);
        dVar.f24296E = bVar.f7h;
        dVar.I(bVar.f6g);
    }

    @Override // z.d
    public final void b(C2982c c2982c, boolean z6) {
        d dVar;
        float f2;
        int i;
        ArrayList arrayList = this.f24417W0;
        super.b(c2982c, z6);
        d dVar2 = this.f24310T;
        boolean z7 = dVar2 != null && ((e) dVar2).v0;
        int i3 = this.f24414T0;
        if (i3 != 0) {
            if (i3 == 1) {
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    ((f) arrayList.get(i6)).b(i6, z7, i6 == size + (-1));
                    i6++;
                }
            } else if (i3 != 2) {
                if (i3 == 3) {
                    int size2 = arrayList.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        ((f) arrayList.get(i7)).b(i7, z7, i7 == size2 + (-1));
                        i7++;
                    }
                }
            } else if (this.f24420Z0 != null && this.f24419Y0 != null && this.f24418X0 != null) {
                for (int i8 = 0; i8 < this.f24422b1; i8++) {
                    this.f24421a1[i8].D();
                }
                int[] iArr = this.f24420Z0;
                int i9 = iArr[0];
                int i10 = iArr[1];
                float f5 = this.f24404J0;
                d dVar3 = null;
                int i11 = 0;
                while (i11 < i9) {
                    if (z7) {
                        i = (i9 - i11) - 1;
                        f2 = 1.0f - this.f24404J0;
                    } else {
                        f2 = f5;
                        i = i11;
                    }
                    d dVar4 = this.f24419Y0[i];
                    if (dVar4 != null) {
                        c cVar = dVar4.f24300I;
                        if (dVar4.f24329g0 != 8) {
                            if (i11 == 0) {
                                dVar4.f(cVar, this.f24300I, this.f24426w0);
                                dVar4.f24332i0 = this.f24398D0;
                                dVar4.f24323d0 = f2;
                            }
                            if (i11 == i9 - 1) {
                                dVar4.f(dVar4.f24302K, this.f24302K, this.f24427x0);
                            }
                            if (i11 > 0 && dVar3 != null) {
                                c cVar2 = dVar3.f24302K;
                                dVar4.f(cVar, cVar2, this.f24410P0);
                                dVar3.f(cVar2, cVar, 0);
                            }
                            dVar3 = dVar4;
                        }
                    }
                    i11++;
                    f5 = f2;
                }
                for (int i12 = 0; i12 < i10; i12++) {
                    d dVar5 = this.f24418X0[i12];
                    if (dVar5 != null) {
                        c cVar3 = dVar5.f24301J;
                        if (dVar5.f24329g0 != 8) {
                            if (i12 == 0) {
                                dVar5.f(cVar3, this.f24301J, this.f24423s0);
                                dVar5.f24334j0 = this.f24399E0;
                                dVar5.f24325e0 = this.f24405K0;
                            }
                            if (i12 == i10 - 1) {
                                dVar5.f(dVar5.f24303L, this.f24303L, this.f24424t0);
                            }
                            if (i12 > 0 && dVar3 != null) {
                                c cVar4 = dVar3.f24303L;
                                dVar5.f(cVar3, cVar4, this.f24411Q0);
                                dVar3.f(cVar4, cVar3, 0);
                            }
                            dVar3 = dVar5;
                        }
                    }
                }
                for (int i13 = 0; i13 < i9; i13++) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        int i15 = (i14 * i9) + i13;
                        if (this.f24416V0 == 1) {
                            i15 = (i13 * i10) + i14;
                        }
                        d[] dVarArr = this.f24421a1;
                        if (i15 < dVarArr.length && (dVar = dVarArr[i15]) != null && dVar.f24329g0 != 8) {
                            d dVar6 = this.f24419Y0[i13];
                            d dVar7 = this.f24418X0[i14];
                            if (dVar != dVar6) {
                                dVar.f(dVar.f24300I, dVar6.f24300I, 0);
                                dVar.f(dVar.f24302K, dVar6.f24302K, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.f(dVar.f24301J, dVar7.f24301J, 0);
                                dVar.f(dVar.f24303L, dVar7.f24303L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z7, true);
        }
        this.f24428y0 = false;
    }
}
