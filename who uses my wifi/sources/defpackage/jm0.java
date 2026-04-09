package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jm0 extends t8 {
    public fx0[] f;
    public fx0[] g;
    public int h;
    public gw3 i;

    @Override // defpackage.t8
    public final fx0 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            fx0[] fx0VarArr = this.f;
            fx0 fx0Var = fx0VarArr[i2];
            if (!zArr[fx0Var.g]) {
                gw3 gw3Var = this.i;
                gw3Var.g = fx0Var;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((fx0) gw3Var.g).m[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    fx0 fx0Var2 = fx0VarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = fx0Var2.m[i3];
                            float f3 = ((fx0) gw3Var.g).m[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.t8
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.t8
    public final void i(x60 x60Var, t8 t8Var, boolean z) {
        fx0 fx0Var = t8Var.a;
        if (fx0Var == null) {
            return;
        }
        float[] fArr = fx0Var.m;
        m8 m8Var = t8Var.d;
        int iD = m8Var.d();
        for (int i = 0; i < iD; i++) {
            fx0 fx0VarE = m8Var.e(i);
            float f = m8Var.f(i);
            gw3 gw3Var = this.i;
            gw3Var.g = fx0VarE;
            if (fx0VarE.f) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((fx0) gw3Var.g).m;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((fx0) gw3Var.g).m[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((jm0) gw3Var.h).k((fx0) gw3Var.g);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((fx0) gw3Var.g).m[i3] = f4;
                    } else {
                        ((fx0) gw3Var.g).m[i3] = 0.0f;
                    }
                }
                j(fx0VarE);
            }
            this.b = (t8Var.b * f) + this.b;
        }
        k(fx0Var);
    }

    public final void j(fx0 fx0Var) {
        int i;
        int i2 = this.h + 1;
        fx0[] fx0VarArr = this.f;
        if (i2 > fx0VarArr.length) {
            fx0[] fx0VarArr2 = (fx0[]) Arrays.copyOf(fx0VarArr, fx0VarArr.length * 2);
            this.f = fx0VarArr2;
            this.g = (fx0[]) Arrays.copyOf(fx0VarArr2, fx0VarArr2.length * 2);
        }
        fx0[] fx0VarArr3 = this.f;
        int i3 = this.h;
        fx0VarArr3[i3] = fx0Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && fx0VarArr3[i3].g > fx0Var.g) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.g[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(this.g, 0, i, new bk(6));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        fx0Var.f = true;
        fx0Var.a(this);
    }

    public final void k(fx0 fx0Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == fx0Var) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        fx0Var.f = false;
                        return;
                    } else {
                        fx0[] fx0VarArr = this.f;
                        int i3 = i + 1;
                        fx0VarArr[i] = fx0VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.t8
    public final String toString() {
        gw3 gw3Var = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            gw3Var.g = this.f[i];
            str = str + gw3Var + " ";
        }
        return str;
    }
}
