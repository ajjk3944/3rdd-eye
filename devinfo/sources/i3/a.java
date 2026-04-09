package i3;

import d.h;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public final b f25822b;

    /* renamed from: c, reason: collision with root package name */
    public final i0.f f25823c;

    /* renamed from: a, reason: collision with root package name */
    public int f25821a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f25824d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f25825e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f25826f = new int[8];
    public float[] g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f25827h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f25828i = -1;
    public boolean j = false;

    public a(b bVar, i0.f fVar) {
        this.f25822b = bVar;
        this.f25823c = fVar;
    }

    public final void a(f fVar, float f10, boolean z3) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i4 = this.f25827h;
            b bVar = this.f25822b;
            if (i4 == -1) {
                this.f25827h = 0;
                this.g[0] = f10;
                this.f25825e[0] = fVar.f25854b;
                this.f25826f[0] = -1;
                fVar.f25861k++;
                fVar.a(bVar);
                this.f25821a++;
                if (this.j) {
                    return;
                }
                int i10 = this.f25828i + 1;
                this.f25828i = i10;
                int[] iArr = this.f25825e;
                if (i10 >= iArr.length) {
                    this.j = true;
                    this.f25828i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i11 = -1;
            for (int i12 = 0; i4 != -1 && i12 < this.f25821a; i12++) {
                int i13 = this.f25825e[i4];
                int i14 = fVar.f25854b;
                if (i13 == i14) {
                    float[] fArr = this.g;
                    float f11 = fArr[i4] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i4] = f11;
                    if (f11 == 0.0f) {
                        if (i4 == this.f25827h) {
                            this.f25827h = this.f25826f[i4];
                        } else {
                            int[] iArr2 = this.f25826f;
                            iArr2[i11] = iArr2[i4];
                        }
                        if (z3) {
                            fVar.b(bVar);
                        }
                        if (this.j) {
                            this.f25828i = i4;
                        }
                        fVar.f25861k--;
                        this.f25821a--;
                        return;
                    }
                    return;
                }
                if (i13 < i14) {
                    i11 = i4;
                }
                i4 = this.f25826f[i4];
            }
            int length = this.f25828i;
            int i15 = length + 1;
            if (this.j) {
                int[] iArr3 = this.f25825e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i15;
            }
            int[] iArr4 = this.f25825e;
            if (length >= iArr4.length && this.f25821a < iArr4.length) {
                int i16 = 0;
                while (true) {
                    int[] iArr5 = this.f25825e;
                    if (i16 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i16] == -1) {
                        length = i16;
                        break;
                    }
                    i16++;
                }
            }
            int[] iArr6 = this.f25825e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i17 = this.f25824d * 2;
                this.f25824d = i17;
                this.j = false;
                this.f25828i = length - 1;
                this.g = Arrays.copyOf(this.g, i17);
                this.f25825e = Arrays.copyOf(this.f25825e, this.f25824d);
                this.f25826f = Arrays.copyOf(this.f25826f, this.f25824d);
            }
            this.f25825e[length] = fVar.f25854b;
            this.g[length] = f10;
            if (i11 != -1) {
                int[] iArr7 = this.f25826f;
                iArr7[length] = iArr7[i11];
                iArr7[i11] = length;
            } else {
                this.f25826f[length] = this.f25827h;
                this.f25827h = length;
            }
            fVar.f25861k++;
            fVar.a(bVar);
            this.f25821a++;
            if (!this.j) {
                this.f25828i++;
            }
            int i18 = this.f25828i;
            int[] iArr8 = this.f25825e;
            if (i18 >= iArr8.length) {
                this.j = true;
                this.f25828i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i4 = this.f25827h;
        for (int i10 = 0; i4 != -1 && i10 < this.f25821a; i10++) {
            f fVar = ((f[]) this.f25823c.f25418d)[this.f25825e[i4]];
            if (fVar != null) {
                fVar.b(this.f25822b);
            }
            i4 = this.f25826f[i4];
        }
        this.f25827h = -1;
        this.f25828i = -1;
        this.j = false;
        this.f25821a = 0;
    }

    public final float c(f fVar) {
        int i4 = this.f25827h;
        for (int i10 = 0; i4 != -1 && i10 < this.f25821a; i10++) {
            if (this.f25825e[i4] == fVar.f25854b) {
                return this.g[i4];
            }
            i4 = this.f25826f[i4];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f25821a;
    }

    public final f e(int i4) {
        int i10 = this.f25827h;
        for (int i11 = 0; i10 != -1 && i11 < this.f25821a; i11++) {
            if (i11 == i4) {
                return ((f[]) this.f25823c.f25418d)[this.f25825e[i10]];
            }
            i10 = this.f25826f[i10];
        }
        return null;
    }

    public final float f(int i4) {
        int i10 = this.f25827h;
        for (int i11 = 0; i10 != -1 && i11 < this.f25821a; i11++) {
            if (i11 == i4) {
                return this.g[i10];
            }
            i10 = this.f25826f[i10];
        }
        return 0.0f;
    }

    public final void g(f fVar, float f10) {
        if (f10 == 0.0f) {
            h(fVar, true);
            return;
        }
        int i4 = this.f25827h;
        b bVar = this.f25822b;
        if (i4 == -1) {
            this.f25827h = 0;
            this.g[0] = f10;
            this.f25825e[0] = fVar.f25854b;
            this.f25826f[0] = -1;
            fVar.f25861k++;
            fVar.a(bVar);
            this.f25821a++;
            if (this.j) {
                return;
            }
            int i10 = this.f25828i + 1;
            this.f25828i = i10;
            int[] iArr = this.f25825e;
            if (i10 >= iArr.length) {
                this.j = true;
                this.f25828i = iArr.length - 1;
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i4 != -1 && i12 < this.f25821a; i12++) {
            int i13 = this.f25825e[i4];
            int i14 = fVar.f25854b;
            if (i13 == i14) {
                this.g[i4] = f10;
                return;
            }
            if (i13 < i14) {
                i11 = i4;
            }
            i4 = this.f25826f[i4];
        }
        int length = this.f25828i;
        int i15 = length + 1;
        if (this.j) {
            int[] iArr2 = this.f25825e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i15;
        }
        int[] iArr3 = this.f25825e;
        if (length >= iArr3.length && this.f25821a < iArr3.length) {
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f25825e;
                if (i16 >= iArr4.length) {
                    break;
                }
                if (iArr4[i16] == -1) {
                    length = i16;
                    break;
                }
                i16++;
            }
        }
        int[] iArr5 = this.f25825e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i17 = this.f25824d * 2;
            this.f25824d = i17;
            this.j = false;
            this.f25828i = length - 1;
            this.g = Arrays.copyOf(this.g, i17);
            this.f25825e = Arrays.copyOf(this.f25825e, this.f25824d);
            this.f25826f = Arrays.copyOf(this.f25826f, this.f25824d);
        }
        this.f25825e[length] = fVar.f25854b;
        this.g[length] = f10;
        if (i11 != -1) {
            int[] iArr6 = this.f25826f;
            iArr6[length] = iArr6[i11];
            iArr6[i11] = length;
        } else {
            this.f25826f[length] = this.f25827h;
            this.f25827h = length;
        }
        fVar.f25861k++;
        fVar.a(bVar);
        int i18 = this.f25821a + 1;
        this.f25821a = i18;
        if (!this.j) {
            this.f25828i++;
        }
        int[] iArr7 = this.f25825e;
        if (i18 >= iArr7.length) {
            this.j = true;
        }
        if (this.f25828i >= iArr7.length) {
            this.j = true;
            this.f25828i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z3) {
        int i4 = this.f25827h;
        if (i4 == -1) {
            return 0.0f;
        }
        int i10 = 0;
        int i11 = -1;
        while (i4 != -1 && i10 < this.f25821a) {
            if (this.f25825e[i4] == fVar.f25854b) {
                if (i4 == this.f25827h) {
                    this.f25827h = this.f25826f[i4];
                } else {
                    int[] iArr = this.f25826f;
                    iArr[i11] = iArr[i4];
                }
                if (z3) {
                    fVar.b(this.f25822b);
                }
                fVar.f25861k--;
                this.f25821a--;
                this.f25825e[i4] = -1;
                if (this.j) {
                    this.f25828i = i4;
                }
                return this.g[i4];
            }
            i10++;
            i11 = i4;
            i4 = this.f25826f[i4];
        }
        return 0.0f;
    }

    public final String toString() {
        int i4 = this.f25827h;
        String string = "";
        for (int i10 = 0; i4 != -1 && i10 < this.f25821a; i10++) {
            StringBuilder sbZ = h.z(h.s(string, " -> "));
            sbZ.append(this.g[i4]);
            sbZ.append(" : ");
            StringBuilder sbZ2 = h.z(sbZ.toString());
            sbZ2.append(((f[]) this.f25823c.f25418d)[this.f25825e[i4]]);
            string = sbZ2.toString();
            i4 = this.f25826f[i4];
        }
        return string;
    }
}
