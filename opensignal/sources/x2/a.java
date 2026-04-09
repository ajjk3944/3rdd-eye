package x2;

import java.util.Arrays;
import w.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public final b f24979b;

    /* renamed from: c, reason: collision with root package name */
    public final qm.c f24980c;

    /* renamed from: a, reason: collision with root package name */
    public int f24978a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f24981d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f24982e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f24983f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f24984g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f24985h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f24986i = -1;
    public boolean j = false;

    public a(b bVar, qm.c cVar) {
        this.f24979b = bVar;
        this.f24980c = cVar;
    }

    public final void a(f fVar, float f10, boolean z10) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i10 = this.f24985h;
            b bVar = this.f24979b;
            if (i10 == -1) {
                this.f24985h = 0;
                this.f24984g[0] = f10;
                this.f24982e[0] = fVar.f25012d;
                this.f24983f[0] = -1;
                fVar.H++;
                fVar.a(bVar);
                this.f24978a++;
                if (this.j) {
                    return;
                }
                int i11 = this.f24986i + 1;
                this.f24986i = i11;
                int[] iArr = this.f24982e;
                if (i11 >= iArr.length) {
                    this.j = true;
                    this.f24986i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f24978a; i13++) {
                int i14 = this.f24982e[i10];
                int i15 = fVar.f25012d;
                if (i14 == i15) {
                    float[] fArr = this.f24984g;
                    float f11 = fArr[i10] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 == 0.0f) {
                        if (i10 == this.f24985h) {
                            this.f24985h = this.f24983f[i10];
                        } else {
                            int[] iArr2 = this.f24983f;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            fVar.b(bVar);
                        }
                        if (this.j) {
                            this.f24986i = i10;
                        }
                        fVar.H--;
                        this.f24978a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f24983f[i10];
            }
            int length = this.f24986i;
            int i16 = length + 1;
            if (this.j) {
                int[] iArr3 = this.f24982e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f24982e;
            if (length >= iArr4.length && this.f24978a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f24982e;
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
            int[] iArr6 = this.f24982e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f24981d * 2;
                this.f24981d = i18;
                this.j = false;
                this.f24986i = length - 1;
                this.f24984g = Arrays.copyOf(this.f24984g, i18);
                this.f24982e = Arrays.copyOf(this.f24982e, this.f24981d);
                this.f24983f = Arrays.copyOf(this.f24983f, this.f24981d);
            }
            this.f24982e[length] = fVar.f25012d;
            this.f24984g[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f24983f;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f24983f[length] = this.f24985h;
                this.f24985h = length;
            }
            fVar.H++;
            fVar.a(bVar);
            this.f24978a++;
            if (!this.j) {
                this.f24986i++;
            }
            int i19 = this.f24986i;
            int[] iArr8 = this.f24982e;
            if (i19 >= iArr8.length) {
                this.j = true;
                this.f24986i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i10 = this.f24985h;
        for (int i11 = 0; i10 != -1 && i11 < this.f24978a; i11++) {
            f fVar = ((f[]) this.f24980c.f20920r)[this.f24982e[i10]];
            if (fVar != null) {
                fVar.b(this.f24979b);
            }
            i10 = this.f24983f[i10];
        }
        this.f24985h = -1;
        this.f24986i = -1;
        this.j = false;
        this.f24978a = 0;
    }

    public final float c(f fVar) {
        int i10 = this.f24985h;
        for (int i11 = 0; i10 != -1 && i11 < this.f24978a; i11++) {
            if (this.f24982e[i10] == fVar.f25012d) {
                return this.f24984g[i10];
            }
            i10 = this.f24983f[i10];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f24978a;
    }

    public final f e(int i10) {
        int i11 = this.f24985h;
        for (int i12 = 0; i11 != -1 && i12 < this.f24978a; i12++) {
            if (i12 == i10) {
                return ((f[]) this.f24980c.f20920r)[this.f24982e[i11]];
            }
            i11 = this.f24983f[i11];
        }
        return null;
    }

    public final float f(int i10) {
        int i11 = this.f24985h;
        for (int i12 = 0; i11 != -1 && i12 < this.f24978a; i12++) {
            if (i12 == i10) {
                return this.f24984g[i11];
            }
            i11 = this.f24983f[i11];
        }
        return 0.0f;
    }

    public final void g(f fVar, float f10) {
        if (f10 == 0.0f) {
            h(fVar, true);
            return;
        }
        int i10 = this.f24985h;
        b bVar = this.f24979b;
        if (i10 == -1) {
            this.f24985h = 0;
            this.f24984g[0] = f10;
            this.f24982e[0] = fVar.f25012d;
            this.f24983f[0] = -1;
            fVar.H++;
            fVar.a(bVar);
            this.f24978a++;
            if (this.j) {
                return;
            }
            int i11 = this.f24986i + 1;
            this.f24986i = i11;
            int[] iArr = this.f24982e;
            if (i11 >= iArr.length) {
                this.j = true;
                this.f24986i = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f24978a; i13++) {
            int i14 = this.f24982e[i10];
            int i15 = fVar.f25012d;
            if (i14 == i15) {
                this.f24984g[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f24983f[i10];
        }
        int length = this.f24986i;
        int i16 = length + 1;
        if (this.j) {
            int[] iArr2 = this.f24982e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f24982e;
        if (length >= iArr3.length && this.f24978a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f24982e;
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
        int[] iArr5 = this.f24982e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f24981d * 2;
            this.f24981d = i18;
            this.j = false;
            this.f24986i = length - 1;
            this.f24984g = Arrays.copyOf(this.f24984g, i18);
            this.f24982e = Arrays.copyOf(this.f24982e, this.f24981d);
            this.f24983f = Arrays.copyOf(this.f24983f, this.f24981d);
        }
        this.f24982e[length] = fVar.f25012d;
        this.f24984g[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f24983f;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f24983f[length] = this.f24985h;
            this.f24985h = length;
        }
        fVar.H++;
        fVar.a(bVar);
        int i19 = this.f24978a + 1;
        this.f24978a = i19;
        if (!this.j) {
            this.f24986i++;
        }
        int[] iArr7 = this.f24982e;
        if (i19 >= iArr7.length) {
            this.j = true;
        }
        if (this.f24986i >= iArr7.length) {
            this.j = true;
            this.f24986i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z10) {
        int i10 = this.f24985h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f24978a) {
            if (this.f24982e[i10] == fVar.f25012d) {
                if (i10 == this.f24985h) {
                    this.f24985h = this.f24983f[i10];
                } else {
                    int[] iArr = this.f24983f;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    fVar.b(this.f24979b);
                }
                fVar.H--;
                this.f24978a--;
                this.f24982e[i10] = -1;
                if (this.j) {
                    this.f24986i = i10;
                }
                return this.f24984g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f24983f[i10];
        }
        return 0.0f;
    }

    public final String toString() {
        int i10 = this.f24985h;
        String string = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f24978a; i11++) {
            StringBuilder sbT = c7.a.t(g.f(string, " -> "));
            sbT.append(this.f24984g[i10]);
            sbT.append(" : ");
            StringBuilder sbT2 = c7.a.t(sbT.toString());
            sbT2.append(((f[]) this.f24980c.f20920r)[this.f24982e[i10]]);
            string = sbT2.toString();
            i10 = this.f24983f[i10];
        }
        return string;
    }
}
