package c1;

import c1.C4186b;
import java.util.Arrays;

/* renamed from: c1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4194j implements C4186b.a {

    /* renamed from: n, reason: collision with root package name */
    private static float f33719n = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    private final int f33720a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f33721b = 16;

    /* renamed from: c, reason: collision with root package name */
    private int f33722c = 16;

    /* renamed from: d, reason: collision with root package name */
    int[] f33723d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    int[] f33724e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f33725f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    float[] f33726g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    int[] f33727h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f33728i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int f33729j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f33730k = -1;

    /* renamed from: l, reason: collision with root package name */
    private final C4186b f33731l;

    /* renamed from: m, reason: collision with root package name */
    protected final C4187c f33732m;

    C4194j(C4186b c4186b, C4187c c4187c) {
        this.f33731l = c4186b;
        this.f33732m = c4187c;
        clear();
    }

    private void l(C4193i c4193i, int i10) {
        int[] iArr;
        int i11 = c4193i.f33704c % this.f33722c;
        int[] iArr2 = this.f33723d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f33724e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f33724e[i10] = -1;
    }

    private void m(int i10, C4193i c4193i, float f10) {
        this.f33725f[i10] = c4193i.f33704c;
        this.f33726g[i10] = f10;
        this.f33727h[i10] = -1;
        this.f33728i[i10] = -1;
        c4193i.a(this.f33731l);
        c4193i.f33714m++;
        this.f33729j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f33721b; i10++) {
            if (this.f33725f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f33721b * 2;
        this.f33725f = Arrays.copyOf(this.f33725f, i10);
        this.f33726g = Arrays.copyOf(this.f33726g, i10);
        this.f33727h = Arrays.copyOf(this.f33727h, i10);
        this.f33728i = Arrays.copyOf(this.f33728i, i10);
        this.f33724e = Arrays.copyOf(this.f33724e, i10);
        for (int i11 = this.f33721b; i11 < i10; i11++) {
            this.f33725f[i11] = -1;
            this.f33724e[i11] = -1;
        }
        this.f33721b = i10;
    }

    private void q(int i10, C4193i c4193i, float f10) {
        int iN = n();
        m(iN, c4193i, f10);
        if (i10 != -1) {
            this.f33727h[iN] = i10;
            int[] iArr = this.f33728i;
            iArr[iN] = iArr[i10];
            iArr[i10] = iN;
        } else {
            this.f33727h[iN] = -1;
            if (this.f33729j > 0) {
                this.f33728i[iN] = this.f33730k;
                this.f33730k = iN;
            } else {
                this.f33728i[iN] = -1;
            }
        }
        int i11 = this.f33728i[iN];
        if (i11 != -1) {
            this.f33727h[i11] = iN;
        }
        l(c4193i, iN);
    }

    private void r(C4193i c4193i) {
        int[] iArr;
        int i10;
        int i11 = c4193i.f33704c;
        int i12 = i11 % this.f33722c;
        int[] iArr2 = this.f33723d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f33725f[i13] == i11) {
            int[] iArr3 = this.f33724e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f33724e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f33725f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f33725f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    @Override // c1.C4186b.a
    public int a() {
        return this.f33729j;
    }

    @Override // c1.C4186b.a
    public C4193i b(int i10) {
        int i11 = this.f33729j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f33730k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f33732m.f33663d[this.f33725f[i12]];
            }
            i12 = this.f33728i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // c1.C4186b.a
    public void c() {
        int i10 = this.f33729j;
        int i11 = this.f33730k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f33726g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f33728i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // c1.C4186b.a
    public void clear() {
        int i10 = this.f33729j;
        for (int i11 = 0; i11 < i10; i11++) {
            C4193i c4193iB = b(i11);
            if (c4193iB != null) {
                c4193iB.d(this.f33731l);
            }
        }
        for (int i12 = 0; i12 < this.f33721b; i12++) {
            this.f33725f[i12] = -1;
            this.f33724e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f33722c; i13++) {
            this.f33723d[i13] = -1;
        }
        this.f33729j = 0;
        this.f33730k = -1;
    }

    @Override // c1.C4186b.a
    public float d(int i10) {
        int i11 = this.f33729j;
        int i12 = this.f33730k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f33726g[i12];
            }
            i12 = this.f33728i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // c1.C4186b.a
    public void e(float f10) {
        int i10 = this.f33729j;
        int i11 = this.f33730k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f33726g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f33728i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // c1.C4186b.a
    public float f(C4193i c4193i, boolean z10) {
        int iP = p(c4193i);
        if (iP == -1) {
            return 0.0f;
        }
        r(c4193i);
        float f10 = this.f33726g[iP];
        if (this.f33730k == iP) {
            this.f33730k = this.f33728i[iP];
        }
        this.f33725f[iP] = -1;
        int[] iArr = this.f33727h;
        int i10 = iArr[iP];
        if (i10 != -1) {
            int[] iArr2 = this.f33728i;
            iArr2[i10] = iArr2[iP];
        }
        int i11 = this.f33728i[iP];
        if (i11 != -1) {
            iArr[i11] = iArr[iP];
        }
        this.f33729j--;
        c4193i.f33714m--;
        if (z10) {
            c4193i.d(this.f33731l);
        }
        return f10;
    }

    @Override // c1.C4186b.a
    public void g(C4193i c4193i, float f10, boolean z10) {
        float f11 = f33719n;
        if (f10 <= (-f11) || f10 >= f11) {
            int iP = p(c4193i);
            if (iP == -1) {
                i(c4193i, f10);
                return;
            }
            float[] fArr = this.f33726g;
            float f12 = fArr[iP] + f10;
            fArr[iP] = f12;
            float f13 = f33719n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iP] = 0.0f;
            f(c4193i, z10);
        }
    }

    @Override // c1.C4186b.a
    public boolean h(C4193i c4193i) {
        return p(c4193i) != -1;
    }

    @Override // c1.C4186b.a
    public void i(C4193i c4193i, float f10) {
        float f11 = f33719n;
        if (f10 > (-f11) && f10 < f11) {
            f(c4193i, true);
            return;
        }
        if (this.f33729j == 0) {
            m(0, c4193i, f10);
            l(c4193i, 0);
            this.f33730k = 0;
            return;
        }
        int iP = p(c4193i);
        if (iP != -1) {
            this.f33726g[iP] = f10;
            return;
        }
        if (this.f33729j + 1 >= this.f33721b) {
            o();
        }
        int i10 = this.f33729j;
        int i11 = this.f33730k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f33725f[i11];
            int i15 = c4193i.f33704c;
            if (i14 == i15) {
                this.f33726g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f33728i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, c4193i, f10);
    }

    @Override // c1.C4186b.a
    public float j(C4193i c4193i) {
        int iP = p(c4193i);
        if (iP != -1) {
            return this.f33726g[iP];
        }
        return 0.0f;
    }

    @Override // c1.C4186b.a
    public float k(C4186b c4186b, boolean z10) {
        float fJ = j(c4186b.f33654a);
        f(c4186b.f33654a, z10);
        C4194j c4194j = (C4194j) c4186b.f33658e;
        int iA = c4194j.a();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iA) {
            int i12 = c4194j.f33725f[i11];
            if (i12 != -1) {
                g(this.f33732m.f33663d[i12], c4194j.f33726g[i11] * fJ, z10);
                i10++;
            }
            i11++;
        }
        return fJ;
    }

    public int p(C4193i c4193i) {
        if (this.f33729j != 0 && c4193i != null) {
            int i10 = c4193i.f33704c;
            int i11 = this.f33723d[i10 % this.f33722c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f33725f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f33724e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f33725f[i11] != i10);
            if (i11 != -1 && this.f33725f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f33729j;
        for (int i11 = 0; i11 < i10; i11++) {
            C4193i c4193iB = b(i11);
            if (c4193iB != null) {
                String str2 = str + c4193iB + " = " + d(i11) + " ";
                int iP = p(c4193iB);
                String str3 = str2 + "[p: ";
                String str4 = (this.f33727h[iP] != -1 ? str3 + this.f33732m.f33663d[this.f33725f[this.f33727h[iP]]] : str3 + "none") + ", n: ";
                str = (this.f33728i[iP] != -1 ? str4 + this.f33732m.f33663d[this.f33725f[this.f33728i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
