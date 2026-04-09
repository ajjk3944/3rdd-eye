package o1;

import o1.C7049e;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7045a extends AbstractC7054j {

    /* renamed from: y0, reason: collision with root package name */
    private int f55048y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f55049z0 = true;

    /* renamed from: A0, reason: collision with root package name */
    private int f55047A0 = 0;

    public boolean K0() {
        return this.f55049z0;
    }

    public int L0() {
        return this.f55048y0;
    }

    public int M0() {
        return this.f55047A0;
    }

    protected void N0() {
        for (int i10 = 0; i10 < this.f55230x0; i10++) {
            C7049e c7049e = this.f55229w0[i10];
            int i11 = this.f55048y0;
            if (i11 == 0 || i11 == 1) {
                c7049e.o0(0, true);
            } else if (i11 == 2 || i11 == 3) {
                c7049e.o0(1, true);
            }
        }
    }

    public void O0(boolean z10) {
        this.f55049z0 = z10;
    }

    public void P0(int i10) {
        this.f55048y0 = i10;
    }

    public void Q0(int i10) {
        this.f55047A0 = i10;
    }

    @Override // o1.C7049e
    public void f(n1.d dVar) {
        C7048d[] c7048dArr;
        boolean z10;
        int i10;
        int i11;
        int i12;
        C7048d[] c7048dArr2 = this.f55090J;
        c7048dArr2[0] = this.f55082B;
        c7048dArr2[2] = this.f55083C;
        c7048dArr2[1] = this.f55084D;
        c7048dArr2[3] = this.f55085E;
        int i13 = 0;
        while (true) {
            c7048dArr = this.f55090J;
            if (i13 >= c7048dArr.length) {
                break;
            }
            C7048d c7048d = c7048dArr[i13];
            c7048d.f55078g = dVar.q(c7048d);
            i13++;
        }
        int i14 = this.f55048y0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        C7048d c7048d2 = c7048dArr[i14];
        for (int i15 = 0; i15 < this.f55230x0; i15++) {
            C7049e c7049e = this.f55229w0[i15];
            if ((this.f55049z0 || c7049e.g()) && ((((i11 = this.f55048y0) == 0 || i11 == 1) && c7049e.y() == C7049e.b.MATCH_CONSTRAINT && c7049e.f55082B.f55075d != null && c7049e.f55084D.f55075d != null) || (((i12 = this.f55048y0) == 2 || i12 == 3) && c7049e.M() == C7049e.b.MATCH_CONSTRAINT && c7049e.f55083C.f55075d != null && c7049e.f55085E.f55075d != null))) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        boolean z11 = this.f55082B.i() || this.f55084D.i();
        boolean z12 = this.f55083C.i() || this.f55085E.i();
        int i16 = !(!z10 && (((i10 = this.f55048y0) == 0 && z11) || ((i10 == 2 && z12) || ((i10 == 1 && z11) || (i10 == 3 && z12))))) ? 4 : 5;
        for (int i17 = 0; i17 < this.f55230x0; i17++) {
            C7049e c7049e2 = this.f55229w0[i17];
            if (this.f55049z0 || c7049e2.g()) {
                n1.i iVarQ = dVar.q(c7049e2.f55090J[this.f55048y0]);
                C7048d[] c7048dArr3 = c7049e2.f55090J;
                int i18 = this.f55048y0;
                C7048d c7048d3 = c7048dArr3[i18];
                c7048d3.f55078g = iVarQ;
                C7048d c7048d4 = c7048d3.f55075d;
                int i19 = (c7048d4 == null || c7048d4.f55073b != this) ? 0 : c7048d3.f55076e;
                if (i18 == 0 || i18 == 2) {
                    dVar.i(c7048d2.f55078g, iVarQ, this.f55047A0 - i19, z10);
                } else {
                    dVar.g(c7048d2.f55078g, iVarQ, this.f55047A0 + i19, z10);
                }
                dVar.e(c7048d2.f55078g, iVarQ, this.f55047A0 + i19, i16);
            }
        }
        int i20 = this.f55048y0;
        if (i20 == 0) {
            dVar.e(this.f55084D.f55078g, this.f55082B.f55078g, 0, 8);
            dVar.e(this.f55082B.f55078g, this.f55094N.f55084D.f55078g, 0, 4);
            dVar.e(this.f55082B.f55078g, this.f55094N.f55082B.f55078g, 0, 0);
            return;
        }
        if (i20 == 1) {
            dVar.e(this.f55082B.f55078g, this.f55084D.f55078g, 0, 8);
            dVar.e(this.f55082B.f55078g, this.f55094N.f55082B.f55078g, 0, 4);
            dVar.e(this.f55082B.f55078g, this.f55094N.f55084D.f55078g, 0, 0);
        } else if (i20 == 2) {
            dVar.e(this.f55085E.f55078g, this.f55083C.f55078g, 0, 8);
            dVar.e(this.f55083C.f55078g, this.f55094N.f55085E.f55078g, 0, 4);
            dVar.e(this.f55083C.f55078g, this.f55094N.f55083C.f55078g, 0, 0);
        } else if (i20 == 3) {
            dVar.e(this.f55083C.f55078g, this.f55085E.f55078g, 0, 8);
            dVar.e(this.f55083C.f55078g, this.f55094N.f55083C.f55078g, 0, 4);
            dVar.e(this.f55083C.f55078g, this.f55094N.f55085E.f55078g, 0, 0);
        }
    }

    @Override // o1.C7049e
    public boolean g() {
        return true;
    }

    @Override // o1.C7049e
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i10 = 0; i10 < this.f55230x0; i10++) {
            C7049e c7049e = this.f55229w0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + c7049e.r();
        }
        return str + "}";
    }
}
