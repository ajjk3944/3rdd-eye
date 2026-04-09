package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b implements c.a {

    /* renamed from: e, reason: collision with root package name */
    public a f1553e;

    /* renamed from: a, reason: collision with root package name */
    public SolverVariable f1549a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f1550b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1551c = false;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1552d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1554f = false;

    public interface a {
        boolean a(SolverVariable solverVariable);

        SolverVariable b(int i10);

        void c(SolverVariable solverVariable, float f10, boolean z10);

        void clear();

        void d();

        float e(SolverVariable solverVariable, boolean z10);

        int f();

        float g(b bVar, boolean z10);

        void h(SolverVariable solverVariable, float f10);

        float i(int i10);

        float j(SolverVariable solverVariable);

        void k(float f10);
    }

    public b() {
    }

    public void A(c cVar, SolverVariable solverVariable, boolean z10) {
        if (solverVariable == null || !solverVariable.f1520g) {
            return;
        }
        this.f1550b += solverVariable.f1519f * this.f1553e.j(solverVariable);
        this.f1553e.e(solverVariable, z10);
        if (z10) {
            solverVariable.d(this);
        }
        if (c.f1557t && this.f1553e.f() == 0) {
            this.f1554f = true;
            cVar.f1563a = true;
        }
    }

    public void B(c cVar, b bVar, boolean z10) {
        this.f1550b += bVar.f1550b * this.f1553e.g(bVar, z10);
        if (z10) {
            bVar.f1549a.d(this);
        }
        if (c.f1557t && this.f1549a != null && this.f1553e.f() == 0) {
            this.f1554f = true;
            cVar.f1563a = true;
        }
    }

    public void C(c cVar, SolverVariable solverVariable, boolean z10) {
        if (solverVariable == null || !solverVariable.f1527n) {
            return;
        }
        float fJ = this.f1553e.j(solverVariable);
        this.f1550b += solverVariable.f1529p * fJ;
        this.f1553e.e(solverVariable, z10);
        if (z10) {
            solverVariable.d(this);
        }
        this.f1553e.c(cVar.f1576n.f24482d[solverVariable.f1528o], fJ, z10);
        if (c.f1557t && this.f1553e.f() == 0) {
            this.f1554f = true;
            cVar.f1563a = true;
        }
    }

    public void D(c cVar) {
        if (cVar.f1569g.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iF = this.f1553e.f();
            for (int i10 = 0; i10 < iF; i10++) {
                SolverVariable solverVariableB = this.f1553e.b(i10);
                if (solverVariableB.f1517d != -1 || solverVariableB.f1520g || solverVariableB.f1527n) {
                    this.f1552d.add(solverVariableB);
                }
            }
            int size = this.f1552d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    SolverVariable solverVariable = (SolverVariable) this.f1552d.get(i11);
                    if (solverVariable.f1520g) {
                        A(cVar, solverVariable, true);
                    } else if (solverVariable.f1527n) {
                        C(cVar, solverVariable, true);
                    } else {
                        B(cVar, cVar.f1569g[solverVariable.f1517d], true);
                    }
                }
                this.f1552d.clear();
            } else {
                z10 = true;
            }
        }
        if (c.f1557t && this.f1549a != null && this.f1553e.f() == 0) {
            this.f1554f = true;
            cVar.f1563a = true;
        }
    }

    @Override // androidx.constraintlayout.core.c.a
    public void a(c.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f1549a = null;
            this.f1553e.clear();
            for (int i10 = 0; i10 < bVar.f1553e.f(); i10++) {
                this.f1553e.c(bVar.f1553e.b(i10), bVar.f1553e.i(i10), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.c.a
    public SolverVariable b(c cVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // androidx.constraintlayout.core.c.a
    public void c(SolverVariable solverVariable) {
        int i10 = solverVariable.f1518e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f1553e.h(solverVariable, f10);
    }

    @Override // androidx.constraintlayout.core.c.a
    public void clear() {
        this.f1553e.clear();
        this.f1549a = null;
        this.f1550b = 0.0f;
    }

    public b d(c cVar, int i10) {
        this.f1553e.h(cVar.o(i10, "ep"), 1.0f);
        this.f1553e.h(cVar.o(i10, "em"), -1.0f);
        return this;
    }

    public b e(SolverVariable solverVariable, int i10) {
        this.f1553e.h(solverVariable, i10);
        return this;
    }

    public boolean f(c cVar) {
        boolean z10;
        SolverVariable solverVariableG = g(cVar);
        if (solverVariableG == null) {
            z10 = true;
        } else {
            x(solverVariableG);
            z10 = false;
        }
        if (this.f1553e.f() == 0) {
            this.f1554f = true;
        }
        return z10;
    }

    public SolverVariable g(c cVar) {
        int iF = this.f1553e.f();
        SolverVariable solverVariable = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        SolverVariable solverVariable2 = null;
        for (int i10 = 0; i10 < iF; i10++) {
            float fI = this.f1553e.i(i10);
            SolverVariable solverVariableB = this.f1553e.b(i10);
            if (solverVariableB.f1523j == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null || f10 > fI) {
                    boolean zU = u(solverVariableB, cVar);
                    z10 = zU;
                    f10 = fI;
                    solverVariable = solverVariableB;
                } else if (!z10 && u(solverVariableB, cVar)) {
                    f10 = fI;
                    solverVariable = solverVariableB;
                    z10 = true;
                }
            } else if (solverVariable == null && fI < 0.0f) {
                if (solverVariable2 == null || f11 > fI) {
                    boolean zU2 = u(solverVariableB, cVar);
                    z11 = zU2;
                    f11 = fI;
                    solverVariable2 = solverVariableB;
                } else if (!z11 && u(solverVariableB, cVar)) {
                    f11 = fI;
                    solverVariable2 = solverVariableB;
                    z11 = true;
                }
            }
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    @Override // androidx.constraintlayout.core.c.a
    public SolverVariable getKey() {
        return this.f1549a;
    }

    public b h(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, float f10, SolverVariable solverVariable3, SolverVariable solverVariable4, int i11) {
        if (solverVariable2 == solverVariable3) {
            this.f1553e.h(solverVariable, 1.0f);
            this.f1553e.h(solverVariable4, 1.0f);
            this.f1553e.h(solverVariable2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f1553e.h(solverVariable, 1.0f);
            this.f1553e.h(solverVariable2, -1.0f);
            this.f1553e.h(solverVariable3, -1.0f);
            this.f1553e.h(solverVariable4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f1550b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.f1553e.h(solverVariable, -1.0f);
                this.f1553e.h(solverVariable2, 1.0f);
                this.f1550b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f1553e.h(solverVariable4, -1.0f);
                this.f1553e.h(solverVariable3, 1.0f);
                this.f1550b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f1553e.h(solverVariable, f11 * 1.0f);
            this.f1553e.h(solverVariable2, f11 * (-1.0f));
            this.f1553e.h(solverVariable3, (-1.0f) * f10);
            this.f1553e.h(solverVariable4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f1550b = ((-i10) * f11) + (i11 * f10);
                return this;
            }
        }
        return this;
    }

    public b i(SolverVariable solverVariable, int i10) {
        this.f1549a = solverVariable;
        float f10 = i10;
        solverVariable.f1519f = f10;
        this.f1550b = f10;
        this.f1554f = true;
        return this;
    }

    @Override // androidx.constraintlayout.core.c.a
    public boolean isEmpty() {
        return this.f1549a == null && this.f1550b == 0.0f && this.f1553e.f() == 0;
    }

    public b j(SolverVariable solverVariable, SolverVariable solverVariable2, float f10) {
        this.f1553e.h(solverVariable, -1.0f);
        this.f1553e.h(solverVariable2, f10);
        return this;
    }

    public b k(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f10) {
        this.f1553e.h(solverVariable, -1.0f);
        this.f1553e.h(solverVariable2, 1.0f);
        this.f1553e.h(solverVariable3, f10);
        this.f1553e.h(solverVariable4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.f1550b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f1553e.h(solverVariable, 1.0f);
            this.f1553e.h(solverVariable2, -1.0f);
            this.f1553e.h(solverVariable4, 1.0f);
            this.f1553e.h(solverVariable3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f1553e.h(solverVariable, 1.0f);
            this.f1553e.h(solverVariable2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f1553e.h(solverVariable3, 1.0f);
            this.f1553e.h(solverVariable4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f1553e.h(solverVariable, 1.0f);
        this.f1553e.h(solverVariable2, -1.0f);
        this.f1553e.h(solverVariable4, f13);
        this.f1553e.h(solverVariable3, -f13);
        return this;
    }

    public b m(SolverVariable solverVariable, int i10) {
        if (i10 < 0) {
            this.f1550b = i10 * (-1);
            this.f1553e.h(solverVariable, 1.0f);
            return this;
        }
        this.f1550b = i10;
        this.f1553e.h(solverVariable, -1.0f);
        return this;
    }

    public b n(SolverVariable solverVariable, SolverVariable solverVariable2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f1550b = i10;
        }
        if (z10) {
            this.f1553e.h(solverVariable, 1.0f);
            this.f1553e.h(solverVariable2, -1.0f);
            return this;
        }
        this.f1553e.h(solverVariable, -1.0f);
        this.f1553e.h(solverVariable2, 1.0f);
        return this;
    }

    public b o(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f1550b = i10;
        }
        if (z10) {
            this.f1553e.h(solverVariable, 1.0f);
            this.f1553e.h(solverVariable2, -1.0f);
            this.f1553e.h(solverVariable3, -1.0f);
            return this;
        }
        this.f1553e.h(solverVariable, -1.0f);
        this.f1553e.h(solverVariable2, 1.0f);
        this.f1553e.h(solverVariable3, 1.0f);
        return this;
    }

    public b p(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f1550b = i10;
        }
        if (z10) {
            this.f1553e.h(solverVariable, 1.0f);
            this.f1553e.h(solverVariable2, -1.0f);
            this.f1553e.h(solverVariable3, 1.0f);
            return this;
        }
        this.f1553e.h(solverVariable, -1.0f);
        this.f1553e.h(solverVariable2, 1.0f);
        this.f1553e.h(solverVariable3, -1.0f);
        return this;
    }

    public b q(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f10) {
        this.f1553e.h(solverVariable3, 0.5f);
        this.f1553e.h(solverVariable4, 0.5f);
        this.f1553e.h(solverVariable, -0.5f);
        this.f1553e.h(solverVariable2, -0.5f);
        this.f1550b = -f10;
        return this;
    }

    public void r() {
        float f10 = this.f1550b;
        if (f10 < 0.0f) {
            this.f1550b = f10 * (-1.0f);
            this.f1553e.d();
        }
    }

    public boolean s() {
        SolverVariable solverVariable = this.f1549a;
        if (solverVariable != null) {
            return solverVariable.f1523j == SolverVariable.Type.UNRESTRICTED || this.f1550b >= 0.0f;
        }
        return false;
    }

    public boolean t(SolverVariable solverVariable) {
        return this.f1553e.a(solverVariable);
    }

    public String toString() {
        return z();
    }

    public final boolean u(SolverVariable solverVariable, c cVar) {
        return solverVariable.f1526m <= 1;
    }

    public SolverVariable v(SolverVariable solverVariable) {
        return w(null, solverVariable);
    }

    public final SolverVariable w(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int iF = this.f1553e.f();
        SolverVariable solverVariable2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iF; i10++) {
            float fI = this.f1553e.i(i10);
            if (fI < 0.0f) {
                SolverVariable solverVariableB = this.f1553e.b(i10);
                if ((zArr == null || !zArr[solverVariableB.f1516c]) && solverVariableB != solverVariable && (((type = solverVariableB.f1523j) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && fI < f10)) {
                    f10 = fI;
                    solverVariable2 = solverVariableB;
                }
            }
        }
        return solverVariable2;
    }

    public void x(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f1549a;
        if (solverVariable2 != null) {
            this.f1553e.h(solverVariable2, -1.0f);
            this.f1549a.f1517d = -1;
            this.f1549a = null;
        }
        float fE = this.f1553e.e(solverVariable, true) * (-1.0f);
        this.f1549a = solverVariable;
        if (fE == 1.0f) {
            return;
        }
        this.f1550b /= fE;
        this.f1553e.k(fE);
    }

    public void y() {
        this.f1549a = null;
        this.f1553e.clear();
        this.f1550b = 0.0f;
        this.f1554f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String z() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.b.z():java.lang.String");
    }

    public b(u.a aVar) {
        this.f1553e = new androidx.constraintlayout.core.a(this, aVar);
    }
}
