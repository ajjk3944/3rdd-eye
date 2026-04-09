package c1;

import c1.C4186b;
import java.util.Arrays;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4185a implements C4186b.a {

    /* renamed from: l, reason: collision with root package name */
    private static float f33642l = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final C4186b f33644b;

    /* renamed from: c, reason: collision with root package name */
    protected final C4187c f33645c;

    /* renamed from: a, reason: collision with root package name */
    int f33643a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f33646d = 8;

    /* renamed from: e, reason: collision with root package name */
    private C4193i f33647e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f33648f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f33649g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f33650h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f33651i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f33652j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f33653k = false;

    C4185a(C4186b c4186b, C4187c c4187c) {
        this.f33644b = c4186b;
        this.f33645c = c4187c;
    }

    @Override // c1.C4186b.a
    public int a() {
        return this.f33643a;
    }

    @Override // c1.C4186b.a
    public C4193i b(int i10) {
        int i11 = this.f33651i;
        for (int i12 = 0; i11 != -1 && i12 < this.f33643a; i12++) {
            if (i12 == i10) {
                return this.f33645c.f33663d[this.f33648f[i11]];
            }
            i11 = this.f33649g[i11];
        }
        return null;
    }

    @Override // c1.C4186b.a
    public void c() {
        int i10 = this.f33651i;
        for (int i11 = 0; i10 != -1 && i11 < this.f33643a; i11++) {
            float[] fArr = this.f33650h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f33649g[i10];
        }
    }

    @Override // c1.C4186b.a
    public final void clear() {
        int i10 = this.f33651i;
        for (int i11 = 0; i10 != -1 && i11 < this.f33643a; i11++) {
            C4193i c4193i = this.f33645c.f33663d[this.f33648f[i10]];
            if (c4193i != null) {
                c4193i.d(this.f33644b);
            }
            i10 = this.f33649g[i10];
        }
        this.f33651i = -1;
        this.f33652j = -1;
        this.f33653k = false;
        this.f33643a = 0;
    }

    @Override // c1.C4186b.a
    public float d(int i10) {
        int i11 = this.f33651i;
        for (int i12 = 0; i11 != -1 && i12 < this.f33643a; i12++) {
            if (i12 == i10) {
                return this.f33650h[i11];
            }
            i11 = this.f33649g[i11];
        }
        return 0.0f;
    }

    @Override // c1.C4186b.a
    public void e(float f10) {
        int i10 = this.f33651i;
        for (int i11 = 0; i10 != -1 && i11 < this.f33643a; i11++) {
            float[] fArr = this.f33650h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f33649g[i10];
        }
    }

    @Override // c1.C4186b.a
    public final float f(C4193i c4193i, boolean z10) {
        if (this.f33647e == c4193i) {
            this.f33647e = null;
        }
        int i10 = this.f33651i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f33643a) {
            if (this.f33648f[i10] == c4193i.f33704c) {
                if (i10 == this.f33651i) {
                    this.f33651i = this.f33649g[i10];
                } else {
                    int[] iArr = this.f33649g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    c4193i.d(this.f33644b);
                }
                c4193i.f33714m--;
                this.f33643a--;
                this.f33648f[i10] = -1;
                if (this.f33653k) {
                    this.f33652j = i10;
                }
                return this.f33650h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f33649g[i10];
        }
        return 0.0f;
    }

    @Override // c1.C4186b.a
    public void g(C4193i c4193i, float f10, boolean z10) {
        float f11 = f33642l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f33651i;
            if (i10 == -1) {
                this.f33651i = 0;
                this.f33650h[0] = f10;
                this.f33648f[0] = c4193i.f33704c;
                this.f33649g[0] = -1;
                c4193i.f33714m++;
                c4193i.a(this.f33644b);
                this.f33643a++;
                if (this.f33653k) {
                    return;
                }
                int i11 = this.f33652j + 1;
                this.f33652j = i11;
                int[] iArr = this.f33648f;
                if (i11 >= iArr.length) {
                    this.f33653k = true;
                    this.f33652j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f33643a; i13++) {
                int i14 = this.f33648f[i10];
                int i15 = c4193i.f33704c;
                if (i14 == i15) {
                    float[] fArr = this.f33650h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f33642l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f33651i) {
                            this.f33651i = this.f33649g[i10];
                        } else {
                            int[] iArr2 = this.f33649g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            c4193i.d(this.f33644b);
                        }
                        if (this.f33653k) {
                            this.f33652j = i10;
                        }
                        c4193i.f33714m--;
                        this.f33643a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f33649g[i10];
            }
            int length = this.f33652j;
            int i16 = length + 1;
            if (this.f33653k) {
                int[] iArr3 = this.f33648f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f33648f;
            if (length >= iArr4.length && this.f33643a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f33648f;
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
            int[] iArr6 = this.f33648f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f33646d * 2;
                this.f33646d = i18;
                this.f33653k = false;
                this.f33652j = length - 1;
                this.f33650h = Arrays.copyOf(this.f33650h, i18);
                this.f33648f = Arrays.copyOf(this.f33648f, this.f33646d);
                this.f33649g = Arrays.copyOf(this.f33649g, this.f33646d);
            }
            this.f33648f[length] = c4193i.f33704c;
            this.f33650h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f33649g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f33649g[length] = this.f33651i;
                this.f33651i = length;
            }
            c4193i.f33714m++;
            c4193i.a(this.f33644b);
            this.f33643a++;
            if (!this.f33653k) {
                this.f33652j++;
            }
            int i19 = this.f33652j;
            int[] iArr8 = this.f33648f;
            if (i19 >= iArr8.length) {
                this.f33653k = true;
                this.f33652j = iArr8.length - 1;
            }
        }
    }

    @Override // c1.C4186b.a
    public boolean h(C4193i c4193i) {
        int i10 = this.f33651i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f33643a; i11++) {
            if (this.f33648f[i10] == c4193i.f33704c) {
                return true;
            }
            i10 = this.f33649g[i10];
        }
        return false;
    }

    @Override // c1.C4186b.a
    public final void i(C4193i c4193i, float f10) {
        if (f10 == 0.0f) {
            f(c4193i, true);
            return;
        }
        int i10 = this.f33651i;
        if (i10 == -1) {
            this.f33651i = 0;
            this.f33650h[0] = f10;
            this.f33648f[0] = c4193i.f33704c;
            this.f33649g[0] = -1;
            c4193i.f33714m++;
            c4193i.a(this.f33644b);
            this.f33643a++;
            if (this.f33653k) {
                return;
            }
            int i11 = this.f33652j + 1;
            this.f33652j = i11;
            int[] iArr = this.f33648f;
            if (i11 >= iArr.length) {
                this.f33653k = true;
                this.f33652j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f33643a; i13++) {
            int i14 = this.f33648f[i10];
            int i15 = c4193i.f33704c;
            if (i14 == i15) {
                this.f33650h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f33649g[i10];
        }
        int length = this.f33652j;
        int i16 = length + 1;
        if (this.f33653k) {
            int[] iArr2 = this.f33648f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f33648f;
        if (length >= iArr3.length && this.f33643a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f33648f;
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
        int[] iArr5 = this.f33648f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f33646d * 2;
            this.f33646d = i18;
            this.f33653k = false;
            this.f33652j = length - 1;
            this.f33650h = Arrays.copyOf(this.f33650h, i18);
            this.f33648f = Arrays.copyOf(this.f33648f, this.f33646d);
            this.f33649g = Arrays.copyOf(this.f33649g, this.f33646d);
        }
        this.f33648f[length] = c4193i.f33704c;
        this.f33650h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f33649g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f33649g[length] = this.f33651i;
            this.f33651i = length;
        }
        c4193i.f33714m++;
        c4193i.a(this.f33644b);
        int i19 = this.f33643a + 1;
        this.f33643a = i19;
        if (!this.f33653k) {
            this.f33652j++;
        }
        int[] iArr7 = this.f33648f;
        if (i19 >= iArr7.length) {
            this.f33653k = true;
        }
        if (this.f33652j >= iArr7.length) {
            this.f33653k = true;
            this.f33652j = iArr7.length - 1;
        }
    }

    @Override // c1.C4186b.a
    public final float j(C4193i c4193i) {
        int i10 = this.f33651i;
        for (int i11 = 0; i10 != -1 && i11 < this.f33643a; i11++) {
            if (this.f33648f[i10] == c4193i.f33704c) {
                return this.f33650h[i10];
            }
            i10 = this.f33649g[i10];
        }
        return 0.0f;
    }

    @Override // c1.C4186b.a
    public float k(C4186b c4186b, boolean z10) {
        float fJ = j(c4186b.f33654a);
        f(c4186b.f33654a, z10);
        C4186b.a aVar = c4186b.f33658e;
        int iA = aVar.a();
        for (int i10 = 0; i10 < iA; i10++) {
            C4193i c4193iB = aVar.b(i10);
            g(c4193iB, aVar.j(c4193iB) * fJ, z10);
        }
        return fJ;
    }

    public String toString() {
        int i10 = this.f33651i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f33643a; i11++) {
            str = ((str + " -> ") + this.f33650h[i10] + " : ") + this.f33645c.f33663d[this.f33648f[i10]];
            i10 = this.f33649g[i10];
        }
        return str;
    }
}
