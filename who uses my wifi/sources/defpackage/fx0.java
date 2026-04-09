package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fx0 implements Comparable {
    public boolean f;
    public float j;
    public int q;
    public int g = -1;
    public int h = -1;
    public int i = 0;
    public boolean k = false;
    public final float[] l = new float[9];
    public final float[] m = new float[9];
    public t8[] n = new t8[16];
    public int o = 0;
    public int p = 0;

    public fx0(int i) {
        this.q = i;
    }

    public final void a(t8 t8Var) {
        int i = 0;
        while (true) {
            int i2 = this.o;
            if (i >= i2) {
                t8[] t8VarArr = this.n;
                if (i2 >= t8VarArr.length) {
                    this.n = (t8[]) Arrays.copyOf(t8VarArr, t8VarArr.length * 2);
                }
                t8[] t8VarArr2 = this.n;
                int i3 = this.o;
                t8VarArr2[i3] = t8Var;
                this.o = i3 + 1;
                return;
            }
            if (this.n[i] == t8Var) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(t8 t8Var) {
        int i = this.o;
        int i2 = 0;
        while (i2 < i) {
            if (this.n[i2] == t8Var) {
                while (i2 < i - 1) {
                    t8[] t8VarArr = this.n;
                    int i3 = i2 + 1;
                    t8VarArr[i2] = t8VarArr[i3];
                    i2 = i3;
                }
                this.o--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.q = 5;
        this.i = 0;
        this.g = -1;
        this.h = -1;
        this.j = 0.0f;
        this.k = false;
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2] = null;
        }
        this.o = 0;
        this.p = 0;
        this.f = false;
        Arrays.fill(this.m, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.g - ((fx0) obj).g;
    }

    public final void d(x60 x60Var, float f) {
        this.j = f;
        this.k = true;
        int i = this.o;
        this.h = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2].h(x60Var, this, false);
        }
        this.o = 0;
    }

    public final void e(x60 x60Var, t8 t8Var) {
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2].i(x60Var, t8Var, false);
        }
        this.o = 0;
    }

    public final String toString() {
        return "" + this.g;
    }
}
