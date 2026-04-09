package z;

import o4.AbstractC2763b;
import x.AbstractC2984e;
import x.C2981b;
import x.C2982c;
import x.C2985f;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3013a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f24265s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f24266t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f24267u0;
    public boolean v0;

    @Override // z.d
    public final boolean A() {
        return this.v0;
    }

    @Override // z.d
    public final boolean B() {
        return this.v0;
    }

    public final boolean T() {
        int i;
        int i3;
        int i6;
        boolean z6 = true;
        int i7 = 0;
        while (true) {
            i = this.f24436r0;
            if (i7 >= i) {
                break;
            }
            d dVar = this.f24435q0[i7];
            if ((this.f24266t0 || dVar.c()) && ((((i3 = this.f24265s0) == 0 || i3 == 1) && !dVar.A()) || (((i6 = this.f24265s0) == 2 || i6 == 3) && !dVar.B()))) {
                z6 = false;
            }
            i7++;
        }
        if (!z6 || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z7 = false;
        for (int i8 = 0; i8 < this.f24436r0; i8++) {
            d dVar2 = this.f24435q0[i8];
            if (this.f24266t0 || dVar2.c()) {
                if (!z7) {
                    int i9 = this.f24265s0;
                    if (i9 == 0) {
                        iMax = dVar2.i(2).d();
                    } else if (i9 == 1) {
                        iMax = dVar2.i(4).d();
                    } else if (i9 == 2) {
                        iMax = dVar2.i(3).d();
                    } else if (i9 == 3) {
                        iMax = dVar2.i(5).d();
                    }
                    z7 = true;
                }
                int i10 = this.f24265s0;
                if (i10 == 0) {
                    iMax = Math.min(iMax, dVar2.i(2).d());
                } else if (i10 == 1) {
                    iMax = Math.max(iMax, dVar2.i(4).d());
                } else if (i10 == 2) {
                    iMax = Math.min(iMax, dVar2.i(3).d());
                } else if (i10 == 3) {
                    iMax = Math.max(iMax, dVar2.i(5).d());
                }
            }
        }
        int i11 = iMax + this.f24267u0;
        int i12 = this.f24265s0;
        if (i12 == 0 || i12 == 1) {
            J(i11, i11);
        } else {
            K(i11, i11);
        }
        this.v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f24265s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // z.d
    public final void b(C2982c c2982c, boolean z6) {
        boolean z7;
        int i;
        int i3;
        c[] cVarArr = this.f24307Q;
        c cVar = this.f24300I;
        cVarArr[0] = cVar;
        int i6 = 2;
        c cVar2 = this.f24301J;
        cVarArr[2] = cVar2;
        c cVar3 = this.f24302K;
        cVarArr[1] = cVar3;
        c cVar4 = this.f24303L;
        cVarArr[3] = cVar4;
        for (c cVar5 : cVarArr) {
            cVar5.i = c2982c.k(cVar5);
        }
        int i7 = this.f24265s0;
        if (i7 < 0 || i7 >= 4) {
            return;
        }
        c cVar6 = cVarArr[i7];
        if (!this.v0) {
            T();
        }
        if (this.v0) {
            this.v0 = false;
            int i8 = this.f24265s0;
            if (i8 == 0 || i8 == 1) {
                c2982c.d(cVar.i, this.f24315Y);
                c2982c.d(cVar3.i, this.f24315Y);
                return;
            } else {
                if (i8 == 2 || i8 == 3) {
                    c2982c.d(cVar2.i, this.f24316Z);
                    c2982c.d(cVar4.i, this.f24316Z);
                    return;
                }
                return;
            }
        }
        for (int i9 = 0; i9 < this.f24436r0; i9++) {
            d dVar = this.f24435q0[i9];
            if ((this.f24266t0 || dVar.c()) && ((((i3 = this.f24265s0) == 0 || i3 == 1) && dVar.f24346p0[0] == 3 && dVar.f24300I.f24289f != null && dVar.f24302K.f24289f != null) || ((i3 == 2 || i3 == 3) && dVar.f24346p0[1] == 3 && dVar.f24301J.f24289f != null && dVar.f24303L.f24289f != null))) {
                z7 = true;
                break;
            }
        }
        z7 = false;
        boolean z8 = cVar.g() || cVar3.g();
        boolean z9 = cVar2.g() || cVar4.g();
        int i10 = !(!z7 && (((i = this.f24265s0) == 0 && z8) || ((i == 2 && z9) || ((i == 1 && z8) || (i == 3 && z9))))) ? 4 : 5;
        int i11 = 0;
        while (i11 < this.f24436r0) {
            d dVar2 = this.f24435q0[i11];
            if (this.f24266t0 || dVar2.c()) {
                C2985f c2985fK = c2982c.k(dVar2.f24307Q[this.f24265s0]);
                c[] cVarArr2 = dVar2.f24307Q;
                int i12 = this.f24265s0;
                c cVar7 = cVarArr2[i12];
                cVar7.i = c2985fK;
                c cVar8 = cVar7.f24289f;
                int i13 = (cVar8 == null || cVar8.f24287d != this) ? 0 : cVar7.f24290g;
                if (i12 == 0 || i12 == i6) {
                    C2985f c2985f = cVar6.i;
                    int i14 = this.f24267u0 - i13;
                    C2981b c2981bL = c2982c.l();
                    C2985f c2985fM = c2982c.m();
                    c2985fM.f24023d = 0;
                    c2981bL.c(c2985f, c2985fK, c2985fM, i14);
                    c2982c.c(c2981bL);
                } else {
                    C2985f c2985f2 = cVar6.i;
                    int i15 = this.f24267u0 + i13;
                    C2981b c2981bL2 = c2982c.l();
                    C2985f c2985fM2 = c2982c.m();
                    c2985fM2.f24023d = 0;
                    c2981bL2.b(c2985f2, c2985fK, c2985fM2, i15);
                    c2982c.c(c2981bL2);
                }
                c2982c.e(cVar6.i, c2985fK, this.f24267u0 + i13, i10);
            }
            i11++;
            i6 = 2;
        }
        int i16 = this.f24265s0;
        if (i16 == 0) {
            c2982c.e(cVar3.i, cVar.i, 0, 8);
            c2982c.e(cVar.i, this.f24310T.f24302K.i, 0, 4);
            c2982c.e(cVar.i, this.f24310T.f24300I.i, 0, 0);
            return;
        }
        if (i16 == 1) {
            c2982c.e(cVar.i, cVar3.i, 0, 8);
            c2982c.e(cVar.i, this.f24310T.f24300I.i, 0, 4);
            c2982c.e(cVar.i, this.f24310T.f24302K.i, 0, 0);
        } else if (i16 == 2) {
            c2982c.e(cVar4.i, cVar2.i, 0, 8);
            c2982c.e(cVar2.i, this.f24310T.f24303L.i, 0, 4);
            c2982c.e(cVar2.i, this.f24310T.f24301J.i, 0, 0);
        } else if (i16 == 3) {
            c2982c.e(cVar2.i, cVar4.i, 0, 8);
            c2982c.e(cVar2.i, this.f24310T.f24301J.i, 0, 4);
            c2982c.e(cVar2.i, this.f24310T.f24303L.i, 0, 0);
        }
    }

    @Override // z.d
    public final boolean c() {
        return true;
    }

    @Override // z.d
    public final String toString() {
        String strP = A.f.p(new StringBuilder("[Barrier] "), this.f24331h0, " {");
        for (int i = 0; i < this.f24436r0; i++) {
            d dVar = this.f24435q0[i];
            if (i > 0) {
                strP = AbstractC2763b.e(strP, ", ");
            }
            StringBuilder sbA = AbstractC2984e.a(strP);
            sbA.append(dVar.f24331h0);
            strP = sbA.toString();
        }
        return AbstractC2763b.e(strP, "}");
    }
}
