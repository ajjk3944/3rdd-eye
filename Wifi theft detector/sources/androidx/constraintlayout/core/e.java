package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class e implements b.a {

    /* renamed from: n, reason: collision with root package name */
    public static float f1591n = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    public final int f1592a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f1593b = 16;

    /* renamed from: c, reason: collision with root package name */
    public int f1594c = 16;

    /* renamed from: d, reason: collision with root package name */
    public int[] f1595d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public int[] f1596e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    public int[] f1597f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    public float[] f1598g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    public int[] f1599h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    public int[] f1600i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    public int f1601j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f1602k = -1;

    /* renamed from: l, reason: collision with root package name */
    public final b f1603l;

    /* renamed from: m, reason: collision with root package name */
    public final u.a f1604m;

    public e(b bVar, u.a aVar) {
        this.f1603l = bVar;
        this.f1604m = aVar;
        clear();
    }

    @Override // androidx.constraintlayout.core.b.a
    public boolean a(SolverVariable solverVariable) {
        return p(solverVariable) != -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public SolverVariable b(int i10) {
        int i11 = this.f1601j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f1602k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f1604m.f24482d[this.f1597f[i12]];
            }
            i12 = this.f1600i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void c(SolverVariable solverVariable, float f10, boolean z10) {
        float f11 = f1591n;
        if (f10 <= (-f11) || f10 >= f11) {
            int iP = p(solverVariable);
            if (iP == -1) {
                h(solverVariable, f10);
                return;
            }
            float[] fArr = this.f1598g;
            float f12 = fArr[iP] + f10;
            fArr[iP] = f12;
            float f13 = f1591n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iP] = 0.0f;
            e(solverVariable, z10);
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void clear() {
        int i10 = this.f1601j;
        for (int i11 = 0; i11 < i10; i11++) {
            SolverVariable solverVariableB = b(i11);
            if (solverVariableB != null) {
                solverVariableB.d(this.f1603l);
            }
        }
        for (int i12 = 0; i12 < this.f1593b; i12++) {
            this.f1597f[i12] = -1;
            this.f1596e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f1594c; i13++) {
            this.f1595d[i13] = -1;
        }
        this.f1601j = 0;
        this.f1602k = -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void d() {
        int i10 = this.f1601j;
        int i11 = this.f1602k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f1598g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f1600i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public float e(SolverVariable solverVariable, boolean z10) {
        int iP = p(solverVariable);
        if (iP == -1) {
            return 0.0f;
        }
        r(solverVariable);
        float f10 = this.f1598g[iP];
        if (this.f1602k == iP) {
            this.f1602k = this.f1600i[iP];
        }
        this.f1597f[iP] = -1;
        int[] iArr = this.f1599h;
        int i10 = iArr[iP];
        if (i10 != -1) {
            int[] iArr2 = this.f1600i;
            iArr2[i10] = iArr2[iP];
        }
        int i11 = this.f1600i[iP];
        if (i11 != -1) {
            iArr[i11] = iArr[iP];
        }
        this.f1601j--;
        solverVariable.f1526m--;
        if (z10) {
            solverVariable.d(this.f1603l);
        }
        return f10;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int f() {
        return this.f1601j;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float g(b bVar, boolean z10) {
        float fJ = j(bVar.f1549a);
        e(bVar.f1549a, z10);
        e eVar = (e) bVar.f1553e;
        int iF = eVar.f();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iF) {
            int i12 = eVar.f1597f[i11];
            if (i12 != -1) {
                c(this.f1604m.f24482d[i12], eVar.f1598g[i11] * fJ, z10);
                i10++;
            }
            i11++;
        }
        return fJ;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void h(SolverVariable solverVariable, float f10) {
        float f11 = f1591n;
        if (f10 > (-f11) && f10 < f11) {
            e(solverVariable, true);
            return;
        }
        if (this.f1601j == 0) {
            m(0, solverVariable, f10);
            l(solverVariable, 0);
            this.f1602k = 0;
            return;
        }
        int iP = p(solverVariable);
        if (iP != -1) {
            this.f1598g[iP] = f10;
            return;
        }
        if (this.f1601j + 1 >= this.f1593b) {
            o();
        }
        int i10 = this.f1601j;
        int i11 = this.f1602k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f1597f[i11];
            int i15 = solverVariable.f1516c;
            if (i14 == i15) {
                this.f1598g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f1600i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, solverVariable, f10);
    }

    @Override // androidx.constraintlayout.core.b.a
    public float i(int i10) {
        int i11 = this.f1601j;
        int i12 = this.f1602k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f1598g[i12];
            }
            i12 = this.f1600i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float j(SolverVariable solverVariable) {
        int iP = p(solverVariable);
        if (iP != -1) {
            return this.f1598g[iP];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void k(float f10) {
        int i10 = this.f1601j;
        int i11 = this.f1602k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f1598g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f1600i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public final void l(SolverVariable solverVariable, int i10) {
        int[] iArr;
        int i11 = solverVariable.f1516c % this.f1594c;
        int[] iArr2 = this.f1595d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f1596e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f1596e[i10] = -1;
    }

    public final void m(int i10, SolverVariable solverVariable, float f10) {
        this.f1597f[i10] = solverVariable.f1516c;
        this.f1598g[i10] = f10;
        this.f1599h[i10] = -1;
        this.f1600i[i10] = -1;
        solverVariable.a(this.f1603l);
        solverVariable.f1526m++;
        this.f1601j++;
    }

    public final int n() {
        for (int i10 = 0; i10 < this.f1593b; i10++) {
            if (this.f1597f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    public final void o() {
        int i10 = this.f1593b * 2;
        this.f1597f = Arrays.copyOf(this.f1597f, i10);
        this.f1598g = Arrays.copyOf(this.f1598g, i10);
        this.f1599h = Arrays.copyOf(this.f1599h, i10);
        this.f1600i = Arrays.copyOf(this.f1600i, i10);
        this.f1596e = Arrays.copyOf(this.f1596e, i10);
        for (int i11 = this.f1593b; i11 < i10; i11++) {
            this.f1597f[i11] = -1;
            this.f1596e[i11] = -1;
        }
        this.f1593b = i10;
    }

    public int p(SolverVariable solverVariable) {
        if (this.f1601j != 0 && solverVariable != null) {
            int i10 = solverVariable.f1516c;
            int i11 = this.f1595d[i10 % this.f1594c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f1597f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f1596e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f1597f[i11] != i10);
            if (i11 != -1 && this.f1597f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final void q(int i10, SolverVariable solverVariable, float f10) {
        int iN = n();
        m(iN, solverVariable, f10);
        if (i10 != -1) {
            this.f1599h[iN] = i10;
            int[] iArr = this.f1600i;
            iArr[iN] = iArr[i10];
            iArr[i10] = iN;
        } else {
            this.f1599h[iN] = -1;
            if (this.f1601j > 0) {
                this.f1600i[iN] = this.f1602k;
                this.f1602k = iN;
            } else {
                this.f1600i[iN] = -1;
            }
        }
        int i11 = this.f1600i[iN];
        if (i11 != -1) {
            this.f1599h[i11] = iN;
        }
        l(solverVariable, iN);
    }

    public final void r(SolverVariable solverVariable) {
        int[] iArr;
        int i10;
        int i11 = solverVariable.f1516c;
        int i12 = i11 % this.f1594c;
        int[] iArr2 = this.f1595d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f1597f[i13] == i11) {
            int[] iArr3 = this.f1596e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f1596e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f1597f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f1597f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f1601j;
        for (int i11 = 0; i11 < i10; i11++) {
            SolverVariable solverVariableB = b(i11);
            if (solverVariableB != null) {
                String str2 = str + solverVariableB + " = " + i(i11) + " ";
                int iP = p(solverVariableB);
                String str3 = str2 + "[p: ";
                String str4 = (this.f1599h[iP] != -1 ? str3 + this.f1604m.f24482d[this.f1597f[this.f1599h[iP]]] : str3 + "none") + ", n: ";
                str = (this.f1600i[iP] != -1 ? str4 + this.f1604m.f24482d[this.f1597f[this.f1600i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
