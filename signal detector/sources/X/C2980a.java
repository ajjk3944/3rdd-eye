package x;

import java.util.Arrays;
import o.a1;
import o4.AbstractC2763b;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2980a {

    /* renamed from: b, reason: collision with root package name */
    public final C2981b f23987b;

    /* renamed from: c, reason: collision with root package name */
    public final a1 f23988c;

    /* renamed from: a, reason: collision with root package name */
    public int f23986a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f23989d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f23990e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f23991f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f23992g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f23993h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f23994j = false;

    public C2980a(C2981b c2981b, a1 a1Var) {
        this.f23987b = c2981b;
        this.f23988c = a1Var;
    }

    public final void a(C2985f c2985f, float f2, boolean z6) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.f23993h;
            C2981b c2981b = this.f23987b;
            if (i == -1) {
                this.f23993h = 0;
                this.f23992g[0] = f2;
                this.f23990e[0] = c2985f.f24021b;
                this.f23991f[0] = -1;
                c2985f.f24029k++;
                c2985f.a(c2981b);
                this.f23986a++;
                if (this.f23994j) {
                    return;
                }
                int i3 = this.i + 1;
                this.i = i3;
                int[] iArr = this.f23990e;
                if (i3 >= iArr.length) {
                    this.f23994j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i6 = -1;
            for (int i7 = 0; i != -1 && i7 < this.f23986a; i7++) {
                int i8 = this.f23990e[i];
                int i9 = c2985f.f24021b;
                if (i8 == i9) {
                    float[] fArr = this.f23992g;
                    float f5 = fArr[i] + f2;
                    if (f5 > -0.001f && f5 < 0.001f) {
                        f5 = 0.0f;
                    }
                    fArr[i] = f5;
                    if (f5 == 0.0f) {
                        if (i == this.f23993h) {
                            this.f23993h = this.f23991f[i];
                        } else {
                            int[] iArr2 = this.f23991f;
                            iArr2[i6] = iArr2[i];
                        }
                        if (z6) {
                            c2985f.b(c2981b);
                        }
                        if (this.f23994j) {
                            this.i = i;
                        }
                        c2985f.f24029k--;
                        this.f23986a--;
                        return;
                    }
                    return;
                }
                if (i8 < i9) {
                    i6 = i;
                }
                i = this.f23991f[i];
            }
            int length = this.i;
            int i10 = length + 1;
            if (this.f23994j) {
                int[] iArr3 = this.f23990e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i10;
            }
            int[] iArr4 = this.f23990e;
            if (length >= iArr4.length && this.f23986a < iArr4.length) {
                int i11 = 0;
                while (true) {
                    int[] iArr5 = this.f23990e;
                    if (i11 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i11] == -1) {
                        length = i11;
                        break;
                    }
                    i11++;
                }
            }
            int[] iArr6 = this.f23990e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i12 = this.f23989d * 2;
                this.f23989d = i12;
                this.f23994j = false;
                this.i = length - 1;
                this.f23992g = Arrays.copyOf(this.f23992g, i12);
                this.f23990e = Arrays.copyOf(this.f23990e, this.f23989d);
                this.f23991f = Arrays.copyOf(this.f23991f, this.f23989d);
            }
            this.f23990e[length] = c2985f.f24021b;
            this.f23992g[length] = f2;
            if (i6 != -1) {
                int[] iArr7 = this.f23991f;
                iArr7[length] = iArr7[i6];
                iArr7[i6] = length;
            } else {
                this.f23991f[length] = this.f23993h;
                this.f23993h = length;
            }
            c2985f.f24029k++;
            c2985f.a(c2981b);
            this.f23986a++;
            if (!this.f23994j) {
                this.i++;
            }
            int i13 = this.i;
            int[] iArr8 = this.f23990e;
            if (i13 >= iArr8.length) {
                this.f23994j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.f23993h;
        for (int i3 = 0; i != -1 && i3 < this.f23986a; i3++) {
            C2985f c2985f = ((C2985f[]) this.f23988c.f22481d)[this.f23990e[i]];
            if (c2985f != null) {
                c2985f.b(this.f23987b);
            }
            i = this.f23991f[i];
        }
        this.f23993h = -1;
        this.i = -1;
        this.f23994j = false;
        this.f23986a = 0;
    }

    public final float c(C2985f c2985f) {
        int i = this.f23993h;
        for (int i3 = 0; i != -1 && i3 < this.f23986a; i3++) {
            if (this.f23990e[i] == c2985f.f24021b) {
                return this.f23992g[i];
            }
            i = this.f23991f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f23986a;
    }

    public final C2985f e(int i) {
        int i3 = this.f23993h;
        for (int i6 = 0; i3 != -1 && i6 < this.f23986a; i6++) {
            if (i6 == i) {
                return ((C2985f[]) this.f23988c.f22481d)[this.f23990e[i3]];
            }
            i3 = this.f23991f[i3];
        }
        return null;
    }

    public final float f(int i) {
        int i3 = this.f23993h;
        for (int i6 = 0; i3 != -1 && i6 < this.f23986a; i6++) {
            if (i6 == i) {
                return this.f23992g[i3];
            }
            i3 = this.f23991f[i3];
        }
        return 0.0f;
    }

    public final void g(C2985f c2985f, float f2) {
        if (f2 == 0.0f) {
            h(c2985f, true);
            return;
        }
        int i = this.f23993h;
        C2981b c2981b = this.f23987b;
        if (i == -1) {
            this.f23993h = 0;
            this.f23992g[0] = f2;
            this.f23990e[0] = c2985f.f24021b;
            this.f23991f[0] = -1;
            c2985f.f24029k++;
            c2985f.a(c2981b);
            this.f23986a++;
            if (this.f23994j) {
                return;
            }
            int i3 = this.i + 1;
            this.i = i3;
            int[] iArr = this.f23990e;
            if (i3 >= iArr.length) {
                this.f23994j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i6 = -1;
        for (int i7 = 0; i != -1 && i7 < this.f23986a; i7++) {
            int i8 = this.f23990e[i];
            int i9 = c2985f.f24021b;
            if (i8 == i9) {
                this.f23992g[i] = f2;
                return;
            }
            if (i8 < i9) {
                i6 = i;
            }
            i = this.f23991f[i];
        }
        int length = this.i;
        int i10 = length + 1;
        if (this.f23994j) {
            int[] iArr2 = this.f23990e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i10;
        }
        int[] iArr3 = this.f23990e;
        if (length >= iArr3.length && this.f23986a < iArr3.length) {
            int i11 = 0;
            while (true) {
                int[] iArr4 = this.f23990e;
                if (i11 >= iArr4.length) {
                    break;
                }
                if (iArr4[i11] == -1) {
                    length = i11;
                    break;
                }
                i11++;
            }
        }
        int[] iArr5 = this.f23990e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i12 = this.f23989d * 2;
            this.f23989d = i12;
            this.f23994j = false;
            this.i = length - 1;
            this.f23992g = Arrays.copyOf(this.f23992g, i12);
            this.f23990e = Arrays.copyOf(this.f23990e, this.f23989d);
            this.f23991f = Arrays.copyOf(this.f23991f, this.f23989d);
        }
        this.f23990e[length] = c2985f.f24021b;
        this.f23992g[length] = f2;
        if (i6 != -1) {
            int[] iArr6 = this.f23991f;
            iArr6[length] = iArr6[i6];
            iArr6[i6] = length;
        } else {
            this.f23991f[length] = this.f23993h;
            this.f23993h = length;
        }
        c2985f.f24029k++;
        c2985f.a(c2981b);
        int i13 = this.f23986a + 1;
        this.f23986a = i13;
        if (!this.f23994j) {
            this.i++;
        }
        int[] iArr7 = this.f23990e;
        if (i13 >= iArr7.length) {
            this.f23994j = true;
        }
        if (this.i >= iArr7.length) {
            this.f23994j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(C2985f c2985f, boolean z6) {
        int i = this.f23993h;
        if (i == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i6 = -1;
        while (i != -1 && i3 < this.f23986a) {
            if (this.f23990e[i] == c2985f.f24021b) {
                if (i == this.f23993h) {
                    this.f23993h = this.f23991f[i];
                } else {
                    int[] iArr = this.f23991f;
                    iArr[i6] = iArr[i];
                }
                if (z6) {
                    c2985f.b(this.f23987b);
                }
                c2985f.f24029k--;
                this.f23986a--;
                this.f23990e[i] = -1;
                if (this.f23994j) {
                    this.i = i;
                }
                return this.f23992g[i];
            }
            i3++;
            i6 = i;
            i = this.f23991f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f23993h;
        String string = "";
        for (int i3 = 0; i != -1 && i3 < this.f23986a; i3++) {
            StringBuilder sbA = AbstractC2984e.a(AbstractC2763b.e(string, " -> "));
            sbA.append(this.f23992g[i]);
            sbA.append(" : ");
            StringBuilder sbA2 = AbstractC2984e.a(sbA.toString());
            sbA2.append(((C2985f[]) this.f23988c.f22481d)[this.f23990e[i]]);
            string = sbA2.toString();
            i = this.f23991f[i];
        }
        return string;
    }
}
