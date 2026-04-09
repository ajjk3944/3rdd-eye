package j1;

import c1.C4188d;
import c1.C4193i;
import j1.d;
import j1.e;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6241a extends j {

    /* renamed from: M0, reason: collision with root package name */
    private int f49821M0 = 0;

    /* renamed from: N0, reason: collision with root package name */
    private boolean f49822N0 = true;

    /* renamed from: O0, reason: collision with root package name */
    private int f49823O0 = 0;

    /* renamed from: P0, reason: collision with root package name */
    boolean f49824P0 = false;

    @Override // j1.e
    public void d(C4188d c4188d, boolean z10) {
        d[] dVarArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        d[] dVarArr2 = this.f49887V;
        dVarArr2[0] = this.f49879N;
        dVarArr2[2] = this.f49880O;
        dVarArr2[1] = this.f49881P;
        dVarArr2[3] = this.f49882Q;
        int i13 = 0;
        while (true) {
            dVarArr = this.f49887V;
            if (i13 >= dVarArr.length) {
                break;
            }
            d dVar = dVarArr[i13];
            dVar.f49855i = c4188d.q(dVar);
            i13++;
        }
        int i14 = this.f49821M0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        d dVar2 = dVarArr[i14];
        if (!this.f49824P0) {
            d1();
        }
        if (this.f49824P0) {
            this.f49824P0 = false;
            int i15 = this.f49821M0;
            if (i15 == 0 || i15 == 1) {
                c4188d.f(this.f49879N.f49855i, this.f49901e0);
                c4188d.f(this.f49881P.f49855i, this.f49901e0);
                return;
            } else {
                if (i15 == 2 || i15 == 3) {
                    c4188d.f(this.f49880O.f49855i, this.f49903f0);
                    c4188d.f(this.f49882Q.f49855i, this.f49903f0);
                    return;
                }
                return;
            }
        }
        for (int i16 = 0; i16 < this.f50028L0; i16++) {
            e eVar = this.f50027K0[i16];
            if ((this.f49822N0 || eVar.e()) && ((((i11 = this.f49821M0) == 0 || i11 == 1) && eVar.x() == e.b.MATCH_CONSTRAINT && eVar.f49879N.f49852f != null && eVar.f49881P.f49852f != null) || (((i12 = this.f49821M0) == 2 || i12 == 3) && eVar.M() == e.b.MATCH_CONSTRAINT && eVar.f49880O.f49852f != null && eVar.f49882Q.f49852f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = this.f49879N.l() || this.f49881P.l();
        boolean z13 = this.f49880O.l() || this.f49882Q.l();
        int i17 = !(!z11 && (((i10 = this.f49821M0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
        for (int i18 = 0; i18 < this.f50028L0; i18++) {
            e eVar2 = this.f50027K0[i18];
            if (this.f49822N0 || eVar2.e()) {
                C4193i c4193iQ = c4188d.q(eVar2.f49887V[this.f49821M0]);
                d[] dVarArr3 = eVar2.f49887V;
                int i19 = this.f49821M0;
                d dVar3 = dVarArr3[i19];
                dVar3.f49855i = c4193iQ;
                d dVar4 = dVar3.f49852f;
                int i20 = (dVar4 == null || dVar4.f49850d != this) ? 0 : dVar3.f49853g;
                if (i19 == 0 || i19 == 2) {
                    c4188d.i(dVar2.f49855i, c4193iQ, this.f49823O0 - i20, z11);
                } else {
                    c4188d.g(dVar2.f49855i, c4193iQ, this.f49823O0 + i20, z11);
                }
                c4188d.e(dVar2.f49855i, c4193iQ, this.f49823O0 + i20, i17);
            }
        }
        int i21 = this.f49821M0;
        if (i21 == 0) {
            c4188d.e(this.f49881P.f49855i, this.f49879N.f49855i, 0, 8);
            c4188d.e(this.f49879N.f49855i, this.f49891Z.f49881P.f49855i, 0, 4);
            c4188d.e(this.f49879N.f49855i, this.f49891Z.f49879N.f49855i, 0, 0);
            return;
        }
        if (i21 == 1) {
            c4188d.e(this.f49879N.f49855i, this.f49881P.f49855i, 0, 8);
            c4188d.e(this.f49879N.f49855i, this.f49891Z.f49879N.f49855i, 0, 4);
            c4188d.e(this.f49879N.f49855i, this.f49891Z.f49881P.f49855i, 0, 0);
        } else if (i21 == 2) {
            c4188d.e(this.f49882Q.f49855i, this.f49880O.f49855i, 0, 8);
            c4188d.e(this.f49880O.f49855i, this.f49891Z.f49882Q.f49855i, 0, 4);
            c4188d.e(this.f49880O.f49855i, this.f49891Z.f49880O.f49855i, 0, 0);
        } else if (i21 == 3) {
            c4188d.e(this.f49880O.f49855i, this.f49882Q.f49855i, 0, 8);
            c4188d.e(this.f49880O.f49855i, this.f49891Z.f49880O.f49855i, 0, 4);
            c4188d.e(this.f49880O.f49855i, this.f49891Z.f49882Q.f49855i, 0, 0);
        }
    }

    public boolean d1() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f50028L0;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.f50027K0[i13];
            if ((this.f49822N0 || eVar.e()) && ((((i11 = this.f49821M0) == 0 || i11 == 1) && !eVar.e0()) || (((i12 = this.f49821M0) == 2 || i12 == 3) && !eVar.f0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.f50028L0; i14++) {
            e eVar2 = this.f50027K0[i14];
            if (this.f49822N0 || eVar2.e()) {
                if (!z11) {
                    int i15 = this.f49821M0;
                    if (i15 == 0) {
                        iMax = eVar2.l(d.a.LEFT).e();
                    } else if (i15 == 1) {
                        iMax = eVar2.l(d.a.RIGHT).e();
                    } else if (i15 == 2) {
                        iMax = eVar2.l(d.a.TOP).e();
                    } else if (i15 == 3) {
                        iMax = eVar2.l(d.a.BOTTOM).e();
                    }
                    z11 = true;
                }
                int i16 = this.f49821M0;
                if (i16 == 0) {
                    iMax = Math.min(iMax, eVar2.l(d.a.LEFT).e());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, eVar2.l(d.a.RIGHT).e());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, eVar2.l(d.a.TOP).e());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, eVar2.l(d.a.BOTTOM).e());
                }
            }
        }
        int i17 = iMax + this.f49823O0;
        int i18 = this.f49821M0;
        if (i18 == 0 || i18 == 1) {
            t0(i17, i17);
        } else {
            w0(i17, i17);
        }
        this.f49824P0 = true;
        return true;
    }

    @Override // j1.e
    public boolean e() {
        return true;
    }

    @Override // j1.e
    public boolean e0() {
        return this.f49824P0;
    }

    public boolean e1() {
        return this.f49822N0;
    }

    @Override // j1.e
    public boolean f0() {
        return this.f49824P0;
    }

    public int f1() {
        return this.f49821M0;
    }

    public int g1() {
        return this.f49823O0;
    }

    public int h1() {
        int i10 = this.f49821M0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    protected void i1() {
        for (int i10 = 0; i10 < this.f50028L0; i10++) {
            e eVar = this.f50027K0[i10];
            if (this.f49822N0 || eVar.e()) {
                int i11 = this.f49821M0;
                if (i11 == 0 || i11 == 1) {
                    eVar.G0(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    eVar.G0(1, true);
                }
            }
        }
    }

    public void j1(int i10) {
        this.f49821M0 = i10;
    }

    public void k1(int i10) {
        this.f49823O0 = i10;
    }

    @Override // j1.e
    public String toString() {
        String str = "[Barrier] " + q() + " {";
        for (int i10 = 0; i10 < this.f50028L0; i10++) {
            e eVar = this.f50027K0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.q();
        }
        return str + "}";
    }
}
