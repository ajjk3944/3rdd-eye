package m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m.e;
import m.f;

/* loaded from: classes.dex */
public class g extends q {
    int A0;
    int B0;
    int C0;
    private p y0;
    int z0;
    private boolean w0 = false;
    protected l.e x0 = new l.e();
    int D0 = 0;
    int E0 = 0;
    d[] F0 = new d[4];
    d[] G0 = new d[4];
    public List<h> H0 = new ArrayList();
    public boolean I0 = false;
    public boolean J0 = false;
    public boolean K0 = false;
    public int L0 = 0;
    public int M0 = 0;
    private int N0 = 7;
    public boolean O0 = false;
    private boolean P0 = false;
    private boolean Q0 = false;
    int R0 = 0;

    private void P0(f fVar) {
        int i2 = this.D0 + 1;
        d[] dVarArr = this.G0;
        if (i2 >= dVarArr.length) {
            this.G0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.G0[this.D0] = new d(fVar, 0, U0());
        this.D0++;
    }

    private void Q0(f fVar) {
        int i2 = this.E0 + 1;
        d[] dVarArr = this.F0;
        if (i2 >= dVarArr.length) {
            this.F0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.F0[this.E0] = new d(fVar, 1, U0());
        this.E0++;
    }

    private void b1() {
        this.D0 = 0;
        this.E0 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02be A[PHI: r0 r9
  0x02be: PHI (r0v31 boolean) = (r0v30 boolean), (r0v33 boolean), (r0v33 boolean), (r0v33 boolean) binds: [B:114:0x0281, B:122:0x02a6, B:123:0x02a8, B:125:0x02ae] A[DONT_GENERATE, DONT_INLINE]
  0x02be: PHI (r9v7 boolean) = (r9v6 boolean), (r9v9 boolean), (r9v9 boolean), (r9v9 boolean) binds: [B:114:0x0281, B:122:0x02a6, B:123:0x02a8, B:125:0x02ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d9  */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // m.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K0() {
        /*
            Method dump skipped, instructions count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.g.K0():void");
    }

    void N0(f fVar, int i2) {
        if (i2 == 0) {
            P0(fVar);
        } else if (i2 == 1) {
            Q0(fVar);
        }
    }

    public boolean O0(l.e eVar) {
        b(eVar);
        int size = this.v0.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = this.v0.get(i2);
            if (fVar instanceof g) {
                f.b[] bVarArr = fVar.E;
                f.b bVar = bVarArr[0];
                f.b bVar2 = bVarArr[1];
                f.b bVar3 = f.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    fVar.g0(f.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    fVar.u0(f.b.FIXED);
                }
                fVar.b(eVar);
                if (bVar == bVar3) {
                    fVar.g0(bVar);
                }
                if (bVar2 == bVar3) {
                    fVar.u0(bVar2);
                }
            } else {
                k.c(this, eVar, fVar);
                fVar.b(eVar);
            }
        }
        if (this.D0 > 0) {
            c.a(this, eVar, 0);
        }
        if (this.E0 > 0) {
            c.a(this, eVar, 1);
        }
        return true;
    }

    @Override // m.q, m.f
    public void Q() {
        this.x0.E();
        this.z0 = 0;
        this.B0 = 0;
        this.A0 = 0;
        this.C0 = 0;
        this.H0.clear();
        this.O0 = false;
        super.Q();
    }

    public int R0() {
        return this.N0;
    }

    public boolean S0() {
        return false;
    }

    public boolean T0() {
        return this.Q0;
    }

    public boolean U0() {
        return this.w0;
    }

    public boolean V0() {
        return this.P0;
    }

    public void W0() {
        if (!X0(8)) {
            d(this.N0);
        }
        e1();
    }

    public boolean X0(int i2) {
        return (this.N0 & i2) == i2;
    }

    public void Y0(int i2, int i3) {
        n nVar;
        n nVar2;
        f.b bVar = this.E[0];
        f.b bVar2 = f.b.WRAP_CONTENT;
        if (bVar != bVar2 && (nVar2 = this.f2882c) != null) {
            nVar2.h(i2);
        }
        if (this.E[1] == bVar2 || (nVar = this.f2884d) == null) {
            return;
        }
        nVar.h(i3);
    }

    public void Z0() {
        int size = this.v0.size();
        S();
        for (int i2 = 0; i2 < size; i2++) {
            this.v0.get(i2).S();
        }
    }

    public void a1() {
        Z0();
        d(this.N0);
    }

    public void c1(int i2) {
        this.N0 = i2;
    }

    @Override // m.f
    public void d(int i2) {
        super.d(i2);
        int size = this.v0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.v0.get(i3).d(i2);
        }
    }

    public void d1(boolean z2) {
        this.w0 = z2;
    }

    public void e1() {
        m mVarF = h(e.d.LEFT).f();
        m mVarF2 = h(e.d.TOP).f();
        mVarF.l(null, 0.0f);
        mVarF2.l(null, 0.0f);
    }

    public void f1(l.e eVar, boolean[] zArr) {
        zArr[2] = false;
        G0(eVar);
        int size = this.v0.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = this.v0.get(i2);
            fVar.G0(eVar);
            f.b bVar = fVar.E[0];
            f.b bVar2 = f.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && fVar.D() < fVar.F()) {
                zArr[2] = true;
            }
            if (fVar.E[1] == bVar2 && fVar.r() < fVar.E()) {
                zArr[2] = true;
            }
        }
    }
}
