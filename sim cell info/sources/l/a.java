package l;

import java.util.Arrays;
import l.i;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private final b f2778b;

    /* renamed from: c, reason: collision with root package name */
    private final c f2779c;

    /* renamed from: a, reason: collision with root package name */
    int f2777a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f2780d = 8;

    /* renamed from: e, reason: collision with root package name */
    private i f2781e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f2782f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f2783g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f2784h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f2785i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f2786j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f2787k = false;

    a(b bVar, c cVar) {
        this.f2778b = bVar;
        this.f2779c = cVar;
    }

    private boolean k(i iVar, e eVar) {
        return iVar.f2826j <= 1;
    }

    final void a(i iVar, float f2, boolean z2) {
        if (f2 == 0.0f) {
            return;
        }
        int i2 = this.f2785i;
        if (i2 == -1) {
            this.f2785i = 0;
            this.f2784h[0] = f2;
            this.f2782f[0] = iVar.f2818b;
            this.f2783g[0] = -1;
            iVar.f2826j++;
            iVar.a(this.f2778b);
            this.f2777a++;
            if (this.f2787k) {
                return;
            }
            int i3 = this.f2786j + 1;
            this.f2786j = i3;
            int[] iArr = this.f2782f;
            if (i3 >= iArr.length) {
                this.f2787k = true;
                this.f2786j = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f2777a; i5++) {
            int[] iArr2 = this.f2782f;
            int i6 = iArr2[i2];
            int i7 = iVar.f2818b;
            if (i6 == i7) {
                float[] fArr = this.f2784h;
                fArr[i2] = fArr[i2] + f2;
                if (fArr[i2] == 0.0f) {
                    if (i2 == this.f2785i) {
                        this.f2785i = this.f2783g[i2];
                    } else {
                        int[] iArr3 = this.f2783g;
                        iArr3[i4] = iArr3[i2];
                    }
                    if (z2) {
                        iVar.c(this.f2778b);
                    }
                    if (this.f2787k) {
                        this.f2786j = i2;
                    }
                    iVar.f2826j--;
                    this.f2777a--;
                    return;
                }
                return;
            }
            if (iArr2[i2] < i7) {
                i4 = i2;
            }
            i2 = this.f2783g[i2];
        }
        int length = this.f2786j;
        int i8 = length + 1;
        if (this.f2787k) {
            int[] iArr4 = this.f2782f;
            if (iArr4[length] != -1) {
                length = iArr4.length;
            }
        } else {
            length = i8;
        }
        int[] iArr5 = this.f2782f;
        if (length >= iArr5.length && this.f2777a < iArr5.length) {
            int i9 = 0;
            while (true) {
                int[] iArr6 = this.f2782f;
                if (i9 >= iArr6.length) {
                    break;
                }
                if (iArr6[i9] == -1) {
                    length = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr7 = this.f2782f;
        if (length >= iArr7.length) {
            length = iArr7.length;
            int i10 = this.f2780d * 2;
            this.f2780d = i10;
            this.f2787k = false;
            this.f2786j = length - 1;
            this.f2784h = Arrays.copyOf(this.f2784h, i10);
            this.f2782f = Arrays.copyOf(this.f2782f, this.f2780d);
            this.f2783g = Arrays.copyOf(this.f2783g, this.f2780d);
        }
        this.f2782f[length] = iVar.f2818b;
        this.f2784h[length] = f2;
        int[] iArr8 = this.f2783g;
        if (i4 != -1) {
            iArr8[length] = iArr8[i4];
            iArr8[i4] = length;
        } else {
            iArr8[length] = this.f2785i;
            this.f2785i = length;
        }
        iVar.f2826j++;
        iVar.a(this.f2778b);
        this.f2777a++;
        if (!this.f2787k) {
            this.f2786j++;
        }
        int i11 = this.f2786j;
        int[] iArr9 = this.f2782f;
        if (i11 >= iArr9.length) {
            this.f2787k = true;
            this.f2786j = iArr9.length - 1;
        }
    }

    i b(e eVar) {
        int i2 = this.f2785i;
        i iVar = null;
        i iVar2 = null;
        boolean zK = false;
        boolean zK2 = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i3 = 0; i2 != -1 && i3 < this.f2777a; i3++) {
            float[] fArr = this.f2784h;
            float f4 = fArr[i2];
            i iVar3 = this.f2779c.f2795c[this.f2782f[i2]];
            if (f4 < 0.0f) {
                if (f4 > -0.001f) {
                    fArr[i2] = 0.0f;
                    iVar3.c(this.f2778b);
                    f4 = 0.0f;
                }
            } else if (f4 < 0.001f) {
                fArr[i2] = 0.0f;
                iVar3.c(this.f2778b);
                f4 = 0.0f;
            }
            if (f4 != 0.0f) {
                if (iVar3.f2823g == i.a.UNRESTRICTED) {
                    if (iVar2 == null || f2 > f4) {
                        zK = k(iVar3, eVar);
                        f2 = f4;
                        iVar2 = iVar3;
                    } else if (!zK && k(iVar3, eVar)) {
                        f2 = f4;
                        iVar2 = iVar3;
                        zK = true;
                    }
                } else if (iVar2 == null && f4 < 0.0f) {
                    if (iVar == null || f3 > f4) {
                        zK2 = k(iVar3, eVar);
                        f3 = f4;
                        iVar = iVar3;
                    } else if (!zK2 && k(iVar3, eVar)) {
                        f3 = f4;
                        iVar = iVar3;
                        zK2 = true;
                    }
                }
            }
            i2 = this.f2783g[i2];
        }
        return iVar2 != null ? iVar2 : iVar;
    }

    public final void c() {
        int i2 = this.f2785i;
        for (int i3 = 0; i2 != -1 && i3 < this.f2777a; i3++) {
            i iVar = this.f2779c.f2795c[this.f2782f[i2]];
            if (iVar != null) {
                iVar.c(this.f2778b);
            }
            i2 = this.f2783g[i2];
        }
        this.f2785i = -1;
        this.f2786j = -1;
        this.f2787k = false;
        this.f2777a = 0;
    }

    final boolean d(i iVar) {
        int i2 = this.f2785i;
        if (i2 == -1) {
            return false;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.f2777a; i3++) {
            if (this.f2782f[i2] == iVar.f2818b) {
                return true;
            }
            i2 = this.f2783g[i2];
        }
        return false;
    }

    void e(float f2) {
        int i2 = this.f2785i;
        for (int i3 = 0; i2 != -1 && i3 < this.f2777a; i3++) {
            float[] fArr = this.f2784h;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f2783g[i2];
        }
    }

    public final float f(i iVar) {
        int i2 = this.f2785i;
        for (int i3 = 0; i2 != -1 && i3 < this.f2777a; i3++) {
            if (this.f2782f[i2] == iVar.f2818b) {
                return this.f2784h[i2];
            }
            i2 = this.f2783g[i2];
        }
        return 0.0f;
    }

    i g(boolean[] zArr, i iVar) {
        i.a aVar;
        int i2 = this.f2785i;
        i iVar2 = null;
        float f2 = 0.0f;
        for (int i3 = 0; i2 != -1 && i3 < this.f2777a; i3++) {
            float[] fArr = this.f2784h;
            if (fArr[i2] < 0.0f) {
                i iVar3 = this.f2779c.f2795c[this.f2782f[i2]];
                if ((zArr == null || !zArr[iVar3.f2818b]) && iVar3 != iVar && ((aVar = iVar3.f2823g) == i.a.SLACK || aVar == i.a.ERROR)) {
                    float f3 = fArr[i2];
                    if (f3 < f2) {
                        f2 = f3;
                        iVar2 = iVar3;
                    }
                }
            }
            i2 = this.f2783g[i2];
        }
        return iVar2;
    }

    final i h(int i2) {
        int i3 = this.f2785i;
        for (int i4 = 0; i3 != -1 && i4 < this.f2777a; i4++) {
            if (i4 == i2) {
                return this.f2779c.f2795c[this.f2782f[i3]];
            }
            i3 = this.f2783g[i3];
        }
        return null;
    }

    final float i(int i2) {
        int i3 = this.f2785i;
        for (int i4 = 0; i3 != -1 && i4 < this.f2777a; i4++) {
            if (i4 == i2) {
                return this.f2784h[i3];
            }
            i3 = this.f2783g[i3];
        }
        return 0.0f;
    }

    void j() {
        int i2 = this.f2785i;
        for (int i3 = 0; i2 != -1 && i3 < this.f2777a; i3++) {
            float[] fArr = this.f2784h;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f2783g[i2];
        }
    }

    public final void l(i iVar, float f2) {
        if (f2 == 0.0f) {
            m(iVar, true);
            return;
        }
        int i2 = this.f2785i;
        if (i2 == -1) {
            this.f2785i = 0;
            this.f2784h[0] = f2;
            this.f2782f[0] = iVar.f2818b;
            this.f2783g[0] = -1;
            iVar.f2826j++;
            iVar.a(this.f2778b);
            this.f2777a++;
            if (this.f2787k) {
                return;
            }
            int i3 = this.f2786j + 1;
            this.f2786j = i3;
            int[] iArr = this.f2782f;
            if (i3 >= iArr.length) {
                this.f2787k = true;
                this.f2786j = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f2777a; i5++) {
            int[] iArr2 = this.f2782f;
            int i6 = iArr2[i2];
            int i7 = iVar.f2818b;
            if (i6 == i7) {
                this.f2784h[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i4 = i2;
            }
            i2 = this.f2783g[i2];
        }
        int length = this.f2786j;
        int i8 = length + 1;
        if (this.f2787k) {
            int[] iArr3 = this.f2782f;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i8;
        }
        int[] iArr4 = this.f2782f;
        if (length >= iArr4.length && this.f2777a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f2782f;
                if (i9 >= iArr5.length) {
                    break;
                }
                if (iArr5[i9] == -1) {
                    length = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr6 = this.f2782f;
        if (length >= iArr6.length) {
            length = iArr6.length;
            int i10 = this.f2780d * 2;
            this.f2780d = i10;
            this.f2787k = false;
            this.f2786j = length - 1;
            this.f2784h = Arrays.copyOf(this.f2784h, i10);
            this.f2782f = Arrays.copyOf(this.f2782f, this.f2780d);
            this.f2783g = Arrays.copyOf(this.f2783g, this.f2780d);
        }
        this.f2782f[length] = iVar.f2818b;
        this.f2784h[length] = f2;
        int[] iArr7 = this.f2783g;
        if (i4 != -1) {
            iArr7[length] = iArr7[i4];
            iArr7[i4] = length;
        } else {
            iArr7[length] = this.f2785i;
            this.f2785i = length;
        }
        iVar.f2826j++;
        iVar.a(this.f2778b);
        int i11 = this.f2777a + 1;
        this.f2777a = i11;
        if (!this.f2787k) {
            this.f2786j++;
        }
        int[] iArr8 = this.f2782f;
        if (i11 >= iArr8.length) {
            this.f2787k = true;
        }
        if (this.f2786j >= iArr8.length) {
            this.f2787k = true;
            this.f2786j = iArr8.length - 1;
        }
    }

    public final float m(i iVar, boolean z2) {
        if (this.f2781e == iVar) {
            this.f2781e = null;
        }
        int i2 = this.f2785i;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f2777a) {
            if (this.f2782f[i2] == iVar.f2818b) {
                if (i2 == this.f2785i) {
                    this.f2785i = this.f2783g[i2];
                } else {
                    int[] iArr = this.f2783g;
                    iArr[i4] = iArr[i2];
                }
                if (z2) {
                    iVar.c(this.f2778b);
                }
                iVar.f2826j--;
                this.f2777a--;
                this.f2782f[i2] = -1;
                if (this.f2787k) {
                    this.f2786j = i2;
                }
                return this.f2784h[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f2783g[i2];
        }
        return 0.0f;
    }

    final void n(b bVar, b bVar2, boolean z2) {
        int i2 = this.f2785i;
        while (true) {
            for (int i3 = 0; i2 != -1 && i3 < this.f2777a; i3++) {
                int i4 = this.f2782f[i2];
                i iVar = bVar2.f2788a;
                if (i4 == iVar.f2818b) {
                    float f2 = this.f2784h[i2];
                    m(iVar, z2);
                    a aVar = bVar2.f2791d;
                    int i5 = aVar.f2785i;
                    for (int i6 = 0; i5 != -1 && i6 < aVar.f2777a; i6++) {
                        a(this.f2779c.f2795c[aVar.f2782f[i5]], aVar.f2784h[i5] * f2, z2);
                        i5 = aVar.f2783g[i5];
                    }
                    bVar.f2789b += bVar2.f2789b * f2;
                    if (z2) {
                        bVar2.f2788a.c(bVar);
                    }
                    i2 = this.f2785i;
                } else {
                    i2 = this.f2783g[i2];
                }
            }
            return;
        }
    }

    void o(b bVar, b[] bVarArr) {
        int i2 = this.f2785i;
        while (true) {
            for (int i3 = 0; i2 != -1 && i3 < this.f2777a; i3++) {
                i iVar = this.f2779c.f2795c[this.f2782f[i2]];
                if (iVar.f2819c != -1) {
                    float f2 = this.f2784h[i2];
                    m(iVar, true);
                    b bVar2 = bVarArr[iVar.f2819c];
                    if (!bVar2.f2792e) {
                        a aVar = bVar2.f2791d;
                        int i4 = aVar.f2785i;
                        for (int i5 = 0; i4 != -1 && i5 < aVar.f2777a; i5++) {
                            a(this.f2779c.f2795c[aVar.f2782f[i4]], aVar.f2784h[i4] * f2, true);
                            i4 = aVar.f2783g[i4];
                        }
                    }
                    bVar.f2789b += bVar2.f2789b * f2;
                    bVar2.f2788a.c(bVar);
                    i2 = this.f2785i;
                } else {
                    i2 = this.f2783g[i2];
                }
            }
            return;
        }
    }

    public String toString() {
        int i2 = this.f2785i;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.f2777a; i3++) {
            str = ((str + " -> ") + this.f2784h[i2] + " : ") + this.f2779c.f2795c[this.f2782f[i2]];
            i2 = this.f2783g[i2];
        }
        return str;
    }
}
