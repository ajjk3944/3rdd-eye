package n1;

import java.util.Arrays;
import n1.b;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6866a implements b.a {

    /* renamed from: l, reason: collision with root package name */
    private static float f54206l = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final b f54208b;

    /* renamed from: c, reason: collision with root package name */
    protected final c f54209c;

    /* renamed from: a, reason: collision with root package name */
    int f54207a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f54210d = 8;

    /* renamed from: e, reason: collision with root package name */
    private i f54211e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f54212f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f54213g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f54214h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f54215i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f54216j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f54217k = false;

    C6866a(b bVar, c cVar) {
        this.f54208b = bVar;
        this.f54209c = cVar;
    }

    @Override // n1.b.a
    public int a() {
        return this.f54207a;
    }

    @Override // n1.b.a
    public i b(int i10) {
        int i11 = this.f54215i;
        for (int i12 = 0; i11 != -1 && i12 < this.f54207a; i12++) {
            if (i12 == i10) {
                return this.f54209c.f54227d[this.f54212f[i11]];
            }
            i11 = this.f54213g[i11];
        }
        return null;
    }

    @Override // n1.b.a
    public void c() {
        int i10 = this.f54215i;
        for (int i11 = 0; i10 != -1 && i11 < this.f54207a; i11++) {
            float[] fArr = this.f54214h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f54213g[i10];
        }
    }

    @Override // n1.b.a
    public final void clear() {
        int i10 = this.f54215i;
        for (int i11 = 0; i10 != -1 && i11 < this.f54207a; i11++) {
            i iVar = this.f54209c.f54227d[this.f54212f[i10]];
            if (iVar != null) {
                iVar.c(this.f54208b);
            }
            i10 = this.f54213g[i10];
        }
        this.f54215i = -1;
        this.f54216j = -1;
        this.f54217k = false;
        this.f54207a = 0;
    }

    @Override // n1.b.a
    public float d(int i10) {
        int i11 = this.f54215i;
        for (int i12 = 0; i11 != -1 && i12 < this.f54207a; i12++) {
            if (i12 == i10) {
                return this.f54214h[i11];
            }
            i11 = this.f54213g[i11];
        }
        return 0.0f;
    }

    @Override // n1.b.a
    public void e(float f10) {
        int i10 = this.f54215i;
        for (int i11 = 0; i10 != -1 && i11 < this.f54207a; i11++) {
            float[] fArr = this.f54214h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f54213g[i10];
        }
    }

    @Override // n1.b.a
    public final void f(i iVar, float f10) {
        if (f10 == 0.0f) {
            g(iVar, true);
            return;
        }
        int i10 = this.f54215i;
        if (i10 == -1) {
            this.f54215i = 0;
            this.f54214h[0] = f10;
            this.f54212f[0] = iVar.f54264c;
            this.f54213g[0] = -1;
            iVar.f54274m++;
            iVar.a(this.f54208b);
            this.f54207a++;
            if (this.f54217k) {
                return;
            }
            int i11 = this.f54216j + 1;
            this.f54216j = i11;
            int[] iArr = this.f54212f;
            if (i11 >= iArr.length) {
                this.f54217k = true;
                this.f54216j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f54207a; i13++) {
            int i14 = this.f54212f[i10];
            int i15 = iVar.f54264c;
            if (i14 == i15) {
                this.f54214h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f54213g[i10];
        }
        int length = this.f54216j;
        int i16 = length + 1;
        if (this.f54217k) {
            int[] iArr2 = this.f54212f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f54212f;
        if (length >= iArr3.length && this.f54207a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f54212f;
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
        int[] iArr5 = this.f54212f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f54210d * 2;
            this.f54210d = i18;
            this.f54217k = false;
            this.f54216j = length - 1;
            this.f54214h = Arrays.copyOf(this.f54214h, i18);
            this.f54212f = Arrays.copyOf(this.f54212f, this.f54210d);
            this.f54213g = Arrays.copyOf(this.f54213g, this.f54210d);
        }
        this.f54212f[length] = iVar.f54264c;
        this.f54214h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f54213g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f54213g[length] = this.f54215i;
            this.f54215i = length;
        }
        iVar.f54274m++;
        iVar.a(this.f54208b);
        int i19 = this.f54207a + 1;
        this.f54207a = i19;
        if (!this.f54217k) {
            this.f54216j++;
        }
        int[] iArr7 = this.f54212f;
        if (i19 >= iArr7.length) {
            this.f54217k = true;
        }
        if (this.f54216j >= iArr7.length) {
            this.f54217k = true;
            this.f54216j = iArr7.length - 1;
        }
    }

    @Override // n1.b.a
    public final float g(i iVar, boolean z10) {
        if (this.f54211e == iVar) {
            this.f54211e = null;
        }
        int i10 = this.f54215i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f54207a) {
            if (this.f54212f[i10] == iVar.f54264c) {
                if (i10 == this.f54215i) {
                    this.f54215i = this.f54213g[i10];
                } else {
                    int[] iArr = this.f54213g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.c(this.f54208b);
                }
                iVar.f54274m--;
                this.f54207a--;
                this.f54212f[i10] = -1;
                if (this.f54217k) {
                    this.f54216j = i10;
                }
                return this.f54214h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f54213g[i10];
        }
        return 0.0f;
    }

    @Override // n1.b.a
    public final float h(i iVar) {
        int i10 = this.f54215i;
        for (int i11 = 0; i10 != -1 && i11 < this.f54207a; i11++) {
            if (this.f54212f[i10] == iVar.f54264c) {
                return this.f54214h[i10];
            }
            i10 = this.f54213g[i10];
        }
        return 0.0f;
    }

    @Override // n1.b.a
    public float i(b bVar, boolean z10) {
        float fH = h(bVar.f54218a);
        g(bVar.f54218a, z10);
        b.a aVar = bVar.f54222e;
        int iA = aVar.a();
        for (int i10 = 0; i10 < iA; i10++) {
            i iVarB = aVar.b(i10);
            k(iVarB, aVar.h(iVarB) * fH, z10);
        }
        return fH;
    }

    @Override // n1.b.a
    public boolean j(i iVar) {
        int i10 = this.f54215i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f54207a; i11++) {
            if (this.f54212f[i10] == iVar.f54264c) {
                return true;
            }
            i10 = this.f54213g[i10];
        }
        return false;
    }

    @Override // n1.b.a
    public void k(i iVar, float f10, boolean z10) {
        float f11 = f54206l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f54215i;
            if (i10 == -1) {
                this.f54215i = 0;
                this.f54214h[0] = f10;
                this.f54212f[0] = iVar.f54264c;
                this.f54213g[0] = -1;
                iVar.f54274m++;
                iVar.a(this.f54208b);
                this.f54207a++;
                if (this.f54217k) {
                    return;
                }
                int i11 = this.f54216j + 1;
                this.f54216j = i11;
                int[] iArr = this.f54212f;
                if (i11 >= iArr.length) {
                    this.f54217k = true;
                    this.f54216j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f54207a; i13++) {
                int i14 = this.f54212f[i10];
                int i15 = iVar.f54264c;
                if (i14 == i15) {
                    float[] fArr = this.f54214h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f54206l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f54215i) {
                            this.f54215i = this.f54213g[i10];
                        } else {
                            int[] iArr2 = this.f54213g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.c(this.f54208b);
                        }
                        if (this.f54217k) {
                            this.f54216j = i10;
                        }
                        iVar.f54274m--;
                        this.f54207a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f54213g[i10];
            }
            int length = this.f54216j;
            int i16 = length + 1;
            if (this.f54217k) {
                int[] iArr3 = this.f54212f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f54212f;
            if (length >= iArr4.length && this.f54207a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f54212f;
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
            int[] iArr6 = this.f54212f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f54210d * 2;
                this.f54210d = i18;
                this.f54217k = false;
                this.f54216j = length - 1;
                this.f54214h = Arrays.copyOf(this.f54214h, i18);
                this.f54212f = Arrays.copyOf(this.f54212f, this.f54210d);
                this.f54213g = Arrays.copyOf(this.f54213g, this.f54210d);
            }
            this.f54212f[length] = iVar.f54264c;
            this.f54214h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f54213g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f54213g[length] = this.f54215i;
                this.f54215i = length;
            }
            iVar.f54274m++;
            iVar.a(this.f54208b);
            this.f54207a++;
            if (!this.f54217k) {
                this.f54216j++;
            }
            int i19 = this.f54216j;
            int[] iArr8 = this.f54212f;
            if (i19 >= iArr8.length) {
                this.f54217k = true;
                this.f54216j = iArr8.length - 1;
            }
        }
    }

    public String toString() {
        int i10 = this.f54215i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f54207a; i11++) {
            str = ((str + " -> ") + this.f54214h[i10] + " : ") + this.f54209c.f54227d[this.f54212f[i10]];
            i10 = this.f54213g[i10];
        }
        return str;
    }
}
