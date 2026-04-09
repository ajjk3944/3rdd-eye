package n1;

import java.util.Arrays;
import n1.b;

/* loaded from: classes.dex */
public class j implements b.a {

    /* renamed from: n, reason: collision with root package name */
    private static float f54276n = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    private final int f54277a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f54278b = 16;

    /* renamed from: c, reason: collision with root package name */
    private int f54279c = 16;

    /* renamed from: d, reason: collision with root package name */
    int[] f54280d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    int[] f54281e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f54282f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    float[] f54283g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    int[] f54284h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f54285i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int f54286j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f54287k = -1;

    /* renamed from: l, reason: collision with root package name */
    private final b f54288l;

    /* renamed from: m, reason: collision with root package name */
    protected final c f54289m;

    j(b bVar, c cVar) {
        this.f54288l = bVar;
        this.f54289m = cVar;
        clear();
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f54264c % this.f54279c;
        int[] iArr2 = this.f54280d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f54281e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f54281e[i10] = -1;
    }

    private void m(int i10, i iVar, float f10) {
        this.f54282f[i10] = iVar.f54264c;
        this.f54283g[i10] = f10;
        this.f54284h[i10] = -1;
        this.f54285i[i10] = -1;
        iVar.a(this.f54288l);
        iVar.f54274m++;
        this.f54286j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f54278b; i10++) {
            if (this.f54282f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f54278b * 2;
        this.f54282f = Arrays.copyOf(this.f54282f, i10);
        this.f54283g = Arrays.copyOf(this.f54283g, i10);
        this.f54284h = Arrays.copyOf(this.f54284h, i10);
        this.f54285i = Arrays.copyOf(this.f54285i, i10);
        this.f54281e = Arrays.copyOf(this.f54281e, i10);
        for (int i11 = this.f54278b; i11 < i10; i11++) {
            this.f54282f[i11] = -1;
            this.f54281e[i11] = -1;
        }
        this.f54278b = i10;
    }

    private void q(int i10, i iVar, float f10) {
        int iN = n();
        m(iN, iVar, f10);
        if (i10 != -1) {
            this.f54284h[iN] = i10;
            int[] iArr = this.f54285i;
            iArr[iN] = iArr[i10];
            iArr[i10] = iN;
        } else {
            this.f54284h[iN] = -1;
            if (this.f54286j > 0) {
                this.f54285i[iN] = this.f54287k;
                this.f54287k = iN;
            } else {
                this.f54285i[iN] = -1;
            }
        }
        int i11 = this.f54285i[iN];
        if (i11 != -1) {
            this.f54284h[i11] = iN;
        }
        l(iVar, iN);
    }

    private void r(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f54264c;
        int i12 = i11 % this.f54279c;
        int[] iArr2 = this.f54280d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f54282f[i13] == i11) {
            int[] iArr3 = this.f54281e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f54281e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f54282f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f54282f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    @Override // n1.b.a
    public int a() {
        return this.f54286j;
    }

    @Override // n1.b.a
    public i b(int i10) {
        int i11 = this.f54286j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f54287k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f54289m.f54227d[this.f54282f[i12]];
            }
            i12 = this.f54285i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // n1.b.a
    public void c() {
        int i10 = this.f54286j;
        int i11 = this.f54287k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f54283g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f54285i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // n1.b.a
    public void clear() {
        int i10 = this.f54286j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarB = b(i11);
            if (iVarB != null) {
                iVarB.c(this.f54288l);
            }
        }
        for (int i12 = 0; i12 < this.f54278b; i12++) {
            this.f54282f[i12] = -1;
            this.f54281e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f54279c; i13++) {
            this.f54280d[i13] = -1;
        }
        this.f54286j = 0;
        this.f54287k = -1;
    }

    @Override // n1.b.a
    public float d(int i10) {
        int i11 = this.f54286j;
        int i12 = this.f54287k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f54283g[i12];
            }
            i12 = this.f54285i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // n1.b.a
    public void e(float f10) {
        int i10 = this.f54286j;
        int i11 = this.f54287k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f54283g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f54285i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // n1.b.a
    public void f(i iVar, float f10) {
        float f11 = f54276n;
        if (f10 > (-f11) && f10 < f11) {
            g(iVar, true);
            return;
        }
        if (this.f54286j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f54287k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f54283g[iP] = f10;
            return;
        }
        if (this.f54286j + 1 >= this.f54278b) {
            o();
        }
        int i10 = this.f54286j;
        int i11 = this.f54287k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f54282f[i11];
            int i15 = iVar.f54264c;
            if (i14 == i15) {
                this.f54283g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f54285i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // n1.b.a
    public float g(i iVar, boolean z10) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f54283g[iP];
        if (this.f54287k == iP) {
            this.f54287k = this.f54285i[iP];
        }
        this.f54282f[iP] = -1;
        int[] iArr = this.f54284h;
        int i10 = iArr[iP];
        if (i10 != -1) {
            int[] iArr2 = this.f54285i;
            iArr2[i10] = iArr2[iP];
        }
        int i11 = this.f54285i[iP];
        if (i11 != -1) {
            iArr[i11] = iArr[iP];
        }
        this.f54286j--;
        iVar.f54274m--;
        if (z10) {
            iVar.c(this.f54288l);
        }
        return f10;
    }

    @Override // n1.b.a
    public float h(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f54283g[iP];
        }
        return 0.0f;
    }

    @Override // n1.b.a
    public float i(b bVar, boolean z10) {
        float fH = h(bVar.f54218a);
        g(bVar.f54218a, z10);
        j jVar = (j) bVar.f54222e;
        int iA = jVar.a();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iA) {
            int i12 = jVar.f54282f[i11];
            if (i12 != -1) {
                k(this.f54289m.f54227d[i12], jVar.f54283g[i11] * fH, z10);
                i10++;
            }
            i11++;
        }
        return fH;
    }

    @Override // n1.b.a
    public boolean j(i iVar) {
        return p(iVar) != -1;
    }

    @Override // n1.b.a
    public void k(i iVar, float f10, boolean z10) {
        float f11 = f54276n;
        if (f10 <= (-f11) || f10 >= f11) {
            int iP = p(iVar);
            if (iP == -1) {
                f(iVar, f10);
                return;
            }
            float[] fArr = this.f54283g;
            float f12 = fArr[iP] + f10;
            fArr[iP] = f12;
            float f13 = f54276n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iP] = 0.0f;
            g(iVar, z10);
        }
    }

    public int p(i iVar) {
        if (this.f54286j == 0) {
            return -1;
        }
        int i10 = iVar.f54264c;
        int i11 = this.f54280d[i10 % this.f54279c];
        if (i11 == -1) {
            return -1;
        }
        if (this.f54282f[i11] == i10) {
            return i11;
        }
        do {
            i11 = this.f54281e[i11];
            if (i11 == -1) {
                break;
            }
        } while (this.f54282f[i11] != i10);
        if (i11 != -1 && this.f54282f[i11] == i10) {
            return i11;
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f54286j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarB = b(i11);
            if (iVarB != null) {
                String str2 = str + iVarB + " = " + d(i11) + " ";
                int iP = p(iVarB);
                String str3 = str2 + "[p: ";
                String str4 = (this.f54284h[iP] != -1 ? str3 + this.f54289m.f54227d[this.f54282f[this.f54284h[iP]]] : str3 + "none") + ", n: ";
                str = (this.f54285i[iP] != -1 ? str4 + this.f54289m.f54227d[this.f54282f[this.f54285i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
