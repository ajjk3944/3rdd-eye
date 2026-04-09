package p0;

import N7.G8;
import java.util.Arrays;
import p0.b;

/* compiled from: ArrayLinkedVariables.java */
/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5439a implements b.a {

    /* renamed from: b, reason: collision with root package name */
    public final b f44967b;

    /* renamed from: c, reason: collision with root package name */
    public final N5.c f44968c;

    /* renamed from: a, reason: collision with root package name */
    public int f44966a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f44969d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f44970e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f44971f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f44972g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f44973h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f44974j = false;

    public C5439a(b bVar, N5.c cVar) {
        this.f44967b = bVar;
        this.f44968c = cVar;
    }

    @Override // p0.b.a
    public final boolean a(e eVar) {
        int i = this.f44973h;
        if (i != -1) {
            for (int i10 = 0; i != -1 && i10 < this.f44966a; i10++) {
                if (this.f44970e[i] == eVar.f45002c) {
                    return true;
                }
                i = this.f44971f[i];
            }
        }
        return false;
    }

    @Override // p0.b.a
    public final void b(e eVar, float f10, boolean z10) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i = this.f44973h;
            b bVar = this.f44967b;
            if (i == -1) {
                this.f44973h = 0;
                this.f44972g[0] = f10;
                this.f44970e[0] = eVar.f45002c;
                this.f44971f[0] = -1;
                eVar.f45011m++;
                eVar.a(bVar);
                this.f44966a++;
                if (this.f44974j) {
                    return;
                }
                int i10 = this.i + 1;
                this.i = i10;
                int[] iArr = this.f44970e;
                if (i10 >= iArr.length) {
                    this.f44974j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i11 = -1;
            for (int i12 = 0; i != -1 && i12 < this.f44966a; i12++) {
                int i13 = this.f44970e[i];
                int i14 = eVar.f45002c;
                if (i13 == i14) {
                    float[] fArr = this.f44972g;
                    float f11 = fArr[i] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i] = f11;
                    if (f11 == 0.0f) {
                        if (i == this.f44973h) {
                            this.f44973h = this.f44971f[i];
                        } else {
                            int[] iArr2 = this.f44971f;
                            iArr2[i11] = iArr2[i];
                        }
                        if (z10) {
                            eVar.b(bVar);
                        }
                        if (this.f44974j) {
                            this.i = i;
                        }
                        eVar.f45011m--;
                        this.f44966a--;
                        return;
                    }
                    return;
                }
                if (i13 < i14) {
                    i11 = i;
                }
                i = this.f44971f[i];
            }
            int length = this.i;
            int i15 = length + 1;
            if (this.f44974j) {
                int[] iArr3 = this.f44970e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i15;
            }
            int[] iArr4 = this.f44970e;
            if (length >= iArr4.length && this.f44966a < iArr4.length) {
                int i16 = 0;
                while (true) {
                    int[] iArr5 = this.f44970e;
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
            int[] iArr6 = this.f44970e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i17 = this.f44969d * 2;
                this.f44969d = i17;
                this.f44974j = false;
                this.i = length - 1;
                this.f44972g = Arrays.copyOf(this.f44972g, i17);
                this.f44970e = Arrays.copyOf(this.f44970e, this.f44969d);
                this.f44971f = Arrays.copyOf(this.f44971f, this.f44969d);
            }
            this.f44970e[length] = eVar.f45002c;
            this.f44972g[length] = f10;
            if (i11 != -1) {
                int[] iArr7 = this.f44971f;
                iArr7[length] = iArr7[i11];
                iArr7[i11] = length;
            } else {
                this.f44971f[length] = this.f44973h;
                this.f44973h = length;
            }
            eVar.f45011m++;
            eVar.a(bVar);
            this.f44966a++;
            if (!this.f44974j) {
                this.i++;
            }
            int i18 = this.i;
            int[] iArr8 = this.f44970e;
            if (i18 >= iArr8.length) {
                this.f44974j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    @Override // p0.b.a
    public final void c(e eVar, float f10) {
        if (f10 == 0.0f) {
            i(eVar, true);
            return;
        }
        int i = this.f44973h;
        b bVar = this.f44967b;
        if (i == -1) {
            this.f44973h = 0;
            this.f44972g[0] = f10;
            this.f44970e[0] = eVar.f45002c;
            this.f44971f[0] = -1;
            eVar.f45011m++;
            eVar.a(bVar);
            this.f44966a++;
            if (this.f44974j) {
                return;
            }
            int i10 = this.i + 1;
            this.i = i10;
            int[] iArr = this.f44970e;
            if (i10 >= iArr.length) {
                this.f44974j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i != -1 && i12 < this.f44966a; i12++) {
            int i13 = this.f44970e[i];
            int i14 = eVar.f45002c;
            if (i13 == i14) {
                this.f44972g[i] = f10;
                return;
            }
            if (i13 < i14) {
                i11 = i;
            }
            i = this.f44971f[i];
        }
        int length = this.i;
        int i15 = length + 1;
        if (this.f44974j) {
            int[] iArr2 = this.f44970e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i15;
        }
        int[] iArr3 = this.f44970e;
        if (length >= iArr3.length && this.f44966a < iArr3.length) {
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f44970e;
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
        int[] iArr5 = this.f44970e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i17 = this.f44969d * 2;
            this.f44969d = i17;
            this.f44974j = false;
            this.i = length - 1;
            this.f44972g = Arrays.copyOf(this.f44972g, i17);
            this.f44970e = Arrays.copyOf(this.f44970e, this.f44969d);
            this.f44971f = Arrays.copyOf(this.f44971f, this.f44969d);
        }
        this.f44970e[length] = eVar.f45002c;
        this.f44972g[length] = f10;
        if (i11 != -1) {
            int[] iArr6 = this.f44971f;
            iArr6[length] = iArr6[i11];
            iArr6[i11] = length;
        } else {
            this.f44971f[length] = this.f44973h;
            this.f44973h = length;
        }
        eVar.f45011m++;
        eVar.a(bVar);
        int i18 = this.f44966a + 1;
        this.f44966a = i18;
        if (!this.f44974j) {
            this.i++;
        }
        int[] iArr7 = this.f44970e;
        if (i18 >= iArr7.length) {
            this.f44974j = true;
        }
        if (this.i >= iArr7.length) {
            this.f44974j = true;
            this.i = iArr7.length - 1;
        }
    }

    @Override // p0.b.a
    public final void clear() {
        int i = this.f44973h;
        for (int i10 = 0; i != -1 && i10 < this.f44966a; i10++) {
            e eVar = ((e[]) this.f44968c.f4676d)[this.f44970e[i]];
            if (eVar != null) {
                eVar.b(this.f44967b);
            }
            i = this.f44971f[i];
        }
        this.f44973h = -1;
        this.i = -1;
        this.f44974j = false;
        this.f44966a = 0;
    }

    @Override // p0.b.a
    public final int d() {
        return this.f44966a;
    }

    @Override // p0.b.a
    public final float e(e eVar) {
        int i = this.f44973h;
        for (int i10 = 0; i != -1 && i10 < this.f44966a; i10++) {
            if (this.f44970e[i] == eVar.f45002c) {
                return this.f44972g[i];
            }
            i = this.f44971f[i];
        }
        return 0.0f;
    }

    @Override // p0.b.a
    public final e f(int i) {
        int i10 = this.f44973h;
        for (int i11 = 0; i10 != -1 && i11 < this.f44966a; i11++) {
            if (i11 == i) {
                return ((e[]) this.f44968c.f4676d)[this.f44970e[i10]];
            }
            i10 = this.f44971f[i10];
        }
        return null;
    }

    @Override // p0.b.a
    public final void g() {
        int i = this.f44973h;
        for (int i10 = 0; i != -1 && i10 < this.f44966a; i10++) {
            float[] fArr = this.f44972g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f44971f[i];
        }
    }

    @Override // p0.b.a
    public final float h(int i) {
        int i10 = this.f44973h;
        for (int i11 = 0; i10 != -1 && i11 < this.f44966a; i11++) {
            if (i11 == i) {
                return this.f44972g[i10];
            }
            i10 = this.f44971f[i10];
        }
        return 0.0f;
    }

    @Override // p0.b.a
    public final float i(e eVar, boolean z10) {
        int i = this.f44973h;
        if (i == -1) {
            return 0.0f;
        }
        int i10 = 0;
        int i11 = -1;
        while (i != -1 && i10 < this.f44966a) {
            if (this.f44970e[i] == eVar.f45002c) {
                if (i == this.f44973h) {
                    this.f44973h = this.f44971f[i];
                } else {
                    int[] iArr = this.f44971f;
                    iArr[i11] = iArr[i];
                }
                if (z10) {
                    eVar.b(this.f44967b);
                }
                eVar.f45011m--;
                this.f44966a--;
                this.f44970e[i] = -1;
                if (this.f44974j) {
                    this.i = i;
                }
                return this.f44972g[i];
            }
            i10++;
            i11 = i;
            i = this.f44971f[i];
        }
        return 0.0f;
    }

    @Override // p0.b.a
    public final float j(b bVar, boolean z10) {
        float fE = e(bVar.f44975a);
        i(bVar.f44975a, z10);
        b.a aVar = bVar.f44978d;
        int iD = aVar.d();
        for (int i = 0; i < iD; i++) {
            e eVarF = aVar.f(i);
            b(eVarF, aVar.e(eVarF) * fE, z10);
        }
        return fE;
    }

    @Override // p0.b.a
    public final void k(float f10) {
        int i = this.f44973h;
        for (int i10 = 0; i != -1 && i10 < this.f44966a; i10++) {
            float[] fArr = this.f44972g;
            fArr[i] = fArr[i] / f10;
            i = this.f44971f[i];
        }
    }

    public final String toString() {
        int i = this.f44973h;
        String string = "";
        for (int i10 = 0; i != -1 && i10 < this.f44966a; i10++) {
            StringBuilder sbU = G8.u(G8.s(string, " -> "));
            sbU.append(this.f44972g[i]);
            sbU.append(" : ");
            StringBuilder sbU2 = G8.u(sbU.toString());
            sbU2.append(((e[]) this.f44968c.f4676d)[this.f44970e[i]]);
            string = sbU2.toString();
            i = this.f44971f[i];
        }
        return string;
    }
}
