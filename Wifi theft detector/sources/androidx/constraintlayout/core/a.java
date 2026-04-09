package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l, reason: collision with root package name */
    public static float f1537l = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    public final b f1539b;

    /* renamed from: c, reason: collision with root package name */
    public final u.a f1540c;

    /* renamed from: a, reason: collision with root package name */
    public int f1538a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f1541d = 8;

    /* renamed from: e, reason: collision with root package name */
    public SolverVariable f1542e = null;

    /* renamed from: f, reason: collision with root package name */
    public int[] f1543f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public int[] f1544g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    public float[] f1545h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    public int f1546i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f1547j = -1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1548k = false;

    public a(b bVar, u.a aVar) {
        this.f1539b = bVar;
        this.f1540c = aVar;
    }

    @Override // androidx.constraintlayout.core.b.a
    public boolean a(SolverVariable solverVariable) {
        int i10 = this.f1546i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f1538a; i11++) {
            if (this.f1543f[i10] == solverVariable.f1516c) {
                return true;
            }
            i10 = this.f1544g[i10];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.b.a
    public SolverVariable b(int i10) {
        int i11 = this.f1546i;
        for (int i12 = 0; i11 != -1 && i12 < this.f1538a; i12++) {
            if (i12 == i10) {
                return this.f1540c.f24482d[this.f1543f[i11]];
            }
            i11 = this.f1544g[i11];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void c(SolverVariable solverVariable, float f10, boolean z10) {
        float f11 = f1537l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f1546i;
            if (i10 == -1) {
                this.f1546i = 0;
                this.f1545h[0] = f10;
                this.f1543f[0] = solverVariable.f1516c;
                this.f1544g[0] = -1;
                solverVariable.f1526m++;
                solverVariable.a(this.f1539b);
                this.f1538a++;
                if (this.f1548k) {
                    return;
                }
                int i11 = this.f1547j + 1;
                this.f1547j = i11;
                int[] iArr = this.f1543f;
                if (i11 >= iArr.length) {
                    this.f1548k = true;
                    this.f1547j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f1538a; i13++) {
                int i14 = this.f1543f[i10];
                int i15 = solverVariable.f1516c;
                if (i14 == i15) {
                    float[] fArr = this.f1545h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f1537l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f1546i) {
                            this.f1546i = this.f1544g[i10];
                        } else {
                            int[] iArr2 = this.f1544g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            solverVariable.d(this.f1539b);
                        }
                        if (this.f1548k) {
                            this.f1547j = i10;
                        }
                        solverVariable.f1526m--;
                        this.f1538a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f1544g[i10];
            }
            int length = this.f1547j;
            int i16 = length + 1;
            if (this.f1548k) {
                int[] iArr3 = this.f1543f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f1543f;
            if (length >= iArr4.length && this.f1538a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f1543f;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f1543f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f1541d * 2;
                this.f1541d = i18;
                this.f1548k = false;
                this.f1547j = length - 1;
                this.f1545h = Arrays.copyOf(this.f1545h, i18);
                this.f1543f = Arrays.copyOf(this.f1543f, this.f1541d);
                this.f1544g = Arrays.copyOf(this.f1544g, this.f1541d);
            }
            this.f1543f[length] = solverVariable.f1516c;
            this.f1545h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f1544g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f1544g[length] = this.f1546i;
                this.f1546i = length;
            }
            solverVariable.f1526m++;
            solverVariable.a(this.f1539b);
            this.f1538a++;
            if (!this.f1548k) {
                this.f1547j++;
            }
            int i19 = this.f1547j;
            int[] iArr8 = this.f1543f;
            if (i19 >= iArr8.length) {
                this.f1548k = true;
                this.f1547j = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void clear() {
        int i10 = this.f1546i;
        for (int i11 = 0; i10 != -1 && i11 < this.f1538a; i11++) {
            SolverVariable solverVariable = this.f1540c.f24482d[this.f1543f[i10]];
            if (solverVariable != null) {
                solverVariable.d(this.f1539b);
            }
            i10 = this.f1544g[i10];
        }
        this.f1546i = -1;
        this.f1547j = -1;
        this.f1548k = false;
        this.f1538a = 0;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void d() {
        int i10 = this.f1546i;
        for (int i11 = 0; i10 != -1 && i11 < this.f1538a; i11++) {
            float[] fArr = this.f1545h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f1544g[i10];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float e(SolverVariable solverVariable, boolean z10) {
        if (this.f1542e == solverVariable) {
            this.f1542e = null;
        }
        int i10 = this.f1546i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f1538a) {
            if (this.f1543f[i10] == solverVariable.f1516c) {
                if (i10 == this.f1546i) {
                    this.f1546i = this.f1544g[i10];
                } else {
                    int[] iArr = this.f1544g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    solverVariable.d(this.f1539b);
                }
                solverVariable.f1526m--;
                this.f1538a--;
                this.f1543f[i10] = -1;
                if (this.f1548k) {
                    this.f1547j = i10;
                }
                return this.f1545h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f1544g[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int f() {
        return this.f1538a;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float g(b bVar, boolean z10) {
        float fJ = j(bVar.f1549a);
        e(bVar.f1549a, z10);
        b.a aVar = bVar.f1553e;
        int iF = aVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            SolverVariable solverVariableB = aVar.b(i10);
            c(solverVariableB, aVar.j(solverVariableB) * fJ, z10);
        }
        return fJ;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void h(SolverVariable solverVariable, float f10) {
        if (f10 == 0.0f) {
            e(solverVariable, true);
            return;
        }
        int i10 = this.f1546i;
        if (i10 == -1) {
            this.f1546i = 0;
            this.f1545h[0] = f10;
            this.f1543f[0] = solverVariable.f1516c;
            this.f1544g[0] = -1;
            solverVariable.f1526m++;
            solverVariable.a(this.f1539b);
            this.f1538a++;
            if (this.f1548k) {
                return;
            }
            int i11 = this.f1547j + 1;
            this.f1547j = i11;
            int[] iArr = this.f1543f;
            if (i11 >= iArr.length) {
                this.f1548k = true;
                this.f1547j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f1538a; i13++) {
            int i14 = this.f1543f[i10];
            int i15 = solverVariable.f1516c;
            if (i14 == i15) {
                this.f1545h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f1544g[i10];
        }
        int length = this.f1547j;
        int i16 = length + 1;
        if (this.f1548k) {
            int[] iArr2 = this.f1543f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f1543f;
        if (length >= iArr3.length && this.f1538a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f1543f;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f1543f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f1541d * 2;
            this.f1541d = i18;
            this.f1548k = false;
            this.f1547j = length - 1;
            this.f1545h = Arrays.copyOf(this.f1545h, i18);
            this.f1543f = Arrays.copyOf(this.f1543f, this.f1541d);
            this.f1544g = Arrays.copyOf(this.f1544g, this.f1541d);
        }
        this.f1543f[length] = solverVariable.f1516c;
        this.f1545h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f1544g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f1544g[length] = this.f1546i;
            this.f1546i = length;
        }
        solverVariable.f1526m++;
        solverVariable.a(this.f1539b);
        int i19 = this.f1538a + 1;
        this.f1538a = i19;
        if (!this.f1548k) {
            this.f1547j++;
        }
        int[] iArr7 = this.f1543f;
        if (i19 >= iArr7.length) {
            this.f1548k = true;
        }
        if (this.f1547j >= iArr7.length) {
            this.f1548k = true;
            this.f1547j = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public float i(int i10) {
        int i11 = this.f1546i;
        for (int i12 = 0; i11 != -1 && i12 < this.f1538a; i12++) {
            if (i12 == i10) {
                return this.f1545h[i11];
            }
            i11 = this.f1544g[i11];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float j(SolverVariable solverVariable) {
        int i10 = this.f1546i;
        for (int i11 = 0; i10 != -1 && i11 < this.f1538a; i11++) {
            if (this.f1543f[i10] == solverVariable.f1516c) {
                return this.f1545h[i10];
            }
            i10 = this.f1544g[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void k(float f10) {
        int i10 = this.f1546i;
        for (int i11 = 0; i10 != -1 && i11 < this.f1538a; i11++) {
            float[] fArr = this.f1545h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f1544g[i10];
        }
    }

    public String toString() {
        int i10 = this.f1546i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f1538a; i11++) {
            str = ((str + " -> ") + this.f1545h[i10] + " : ") + this.f1540c.f24482d[this.f1543f[i10]];
            i10 = this.f1544g[i10];
        }
        return str;
    }
}
