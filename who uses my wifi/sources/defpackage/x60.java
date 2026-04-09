package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class x60 {
    public static boolean q = false;
    public final jm0 d;
    public final xb4 m;
    public t8 p;
    public int a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public fx0[] n = new fx0[1000];
    public int o = 0;
    public t8[] g = new t8[32];

    public x60() {
        s();
        xb4 xb4Var = new xb4(3);
        xb4Var.g = new hl0();
        xb4Var.h = new hl0();
        xb4Var.i = new fx0[32];
        this.m = xb4Var;
        jm0 jm0Var = new jm0(xb4Var);
        jm0Var.f = new fx0[128];
        jm0Var.g = new fx0[128];
        jm0Var.h = 0;
        jm0Var.i = new gw3(jm0Var);
        this.d = jm0Var;
        this.p = new t8(xb4Var);
    }

    public static int n(Object obj) {
        fx0 fx0Var = ((wh) obj).i;
        if (fx0Var != null) {
            return (int) (fx0Var.j + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final fx0 a(int i) {
        hl0 hl0Var = (hl0) this.m.h;
        int i2 = hl0Var.b;
        fx0 fx0Var = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = hl0Var.a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            hl0Var.b = i3;
            fx0Var = r4;
        }
        fx0 fx0Var2 = fx0Var;
        if (fx0Var2 == null) {
            fx0Var2 = new fx0(i);
            fx0Var2.q = i;
        } else {
            fx0Var2.c();
            fx0Var2.q = i;
        }
        int i4 = this.o;
        int i5 = this.a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.a = i6;
            this.n = (fx0[]) Arrays.copyOf(this.n, i6);
        }
        fx0[] fx0VarArr = this.n;
        int i7 = this.o;
        this.o = i7 + 1;
        fx0VarArr[i7] = fx0Var2;
        return fx0Var2;
    }

    public final void b(fx0 fx0Var, fx0 fx0Var2, int i, float f, fx0 fx0Var3, fx0 fx0Var4, int i2, int i3) {
        t8 t8VarL = l();
        if (fx0Var2 == fx0Var3) {
            t8VarL.d.g(fx0Var, 1.0f);
            t8VarL.d.g(fx0Var4, 1.0f);
            t8VarL.d.g(fx0Var2, -2.0f);
        } else if (f == 0.5f) {
            t8VarL.d.g(fx0Var, 1.0f);
            t8VarL.d.g(fx0Var2, -1.0f);
            t8VarL.d.g(fx0Var3, -1.0f);
            t8VarL.d.g(fx0Var4, 1.0f);
            if (i > 0 || i2 > 0) {
                t8VarL.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            t8VarL.d.g(fx0Var, -1.0f);
            t8VarL.d.g(fx0Var2, 1.0f);
            t8VarL.b = i;
        } else if (f >= 1.0f) {
            t8VarL.d.g(fx0Var4, -1.0f);
            t8VarL.d.g(fx0Var3, 1.0f);
            t8VarL.b = -i2;
        } else {
            float f2 = 1.0f - f;
            t8VarL.d.g(fx0Var, f2 * 1.0f);
            t8VarL.d.g(fx0Var2, f2 * (-1.0f));
            t8VarL.d.g(fx0Var3, (-1.0f) * f);
            t8VarL.d.g(fx0Var4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                t8VarL.b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            t8VarL.a(this, i3);
        }
        c(t8VarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.t8 r18) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x60.c(t8):void");
    }

    public final void d(fx0 fx0Var, int i) {
        int i2 = fx0Var.h;
        if (i2 == -1) {
            fx0Var.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                fx0 fx0Var2 = ((fx0[]) this.m.i)[i3];
            }
            return;
        }
        if (i2 == -1) {
            t8 t8VarL = l();
            t8VarL.a = fx0Var;
            float f = i;
            fx0Var.j = f;
            t8VarL.b = f;
            t8VarL.e = true;
            c(t8VarL);
            return;
        }
        t8 t8Var = this.g[i2];
        if (t8Var.e) {
            t8Var.b = i;
            return;
        }
        if (t8Var.d.d() == 0) {
            t8Var.e = true;
            t8Var.b = i;
            return;
        }
        t8 t8VarL2 = l();
        if (i < 0) {
            t8VarL2.b = i * (-1);
            t8VarL2.d.g(fx0Var, 1.0f);
        } else {
            t8VarL2.b = i;
            t8VarL2.d.g(fx0Var, -1.0f);
        }
        c(t8VarL2);
    }

    public final void e(fx0 fx0Var, fx0 fx0Var2, int i, int i2) {
        if (i2 == 8 && fx0Var2.k && fx0Var.h == -1) {
            fx0Var.d(this, fx0Var2.j + i);
            return;
        }
        t8 t8VarL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            t8VarL.b = i;
        }
        if (z) {
            t8VarL.d.g(fx0Var, 1.0f);
            t8VarL.d.g(fx0Var2, -1.0f);
        } else {
            t8VarL.d.g(fx0Var, -1.0f);
            t8VarL.d.g(fx0Var2, 1.0f);
        }
        if (i2 != 8) {
            t8VarL.a(this, i2);
        }
        c(t8VarL);
    }

    public final void f(fx0 fx0Var, fx0 fx0Var2, int i, int i2) {
        t8 t8VarL = l();
        fx0 fx0VarM = m();
        fx0VarM.i = 0;
        t8VarL.b(fx0Var, fx0Var2, fx0VarM, i);
        if (i2 != 8) {
            t8VarL.d.g(j(i2), (int) (t8VarL.d.c(fx0VarM) * (-1.0f)));
        }
        c(t8VarL);
    }

    public final void g(fx0 fx0Var, fx0 fx0Var2, int i, int i2) {
        t8 t8VarL = l();
        fx0 fx0VarM = m();
        fx0VarM.i = 0;
        t8VarL.c(fx0Var, fx0Var2, fx0VarM, i);
        if (i2 != 8) {
            t8VarL.d.g(j(i2), (int) (t8VarL.d.c(fx0VarM) * (-1.0f)));
        }
        c(t8VarL);
    }

    public final void h(t8 t8Var) {
        int i;
        if (t8Var.e) {
            t8Var.a.d(this, t8Var.b);
        } else {
            t8[] t8VarArr = this.g;
            int i2 = this.k;
            t8VarArr[i2] = t8Var;
            fx0 fx0Var = t8Var.a;
            fx0Var.h = i2;
            this.k = i2 + 1;
            fx0Var.e(this, t8Var);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                t8 t8Var2 = this.g[i3];
                if (t8Var2 != null && t8Var2.e) {
                    t8Var2.a.d(this, t8Var2.b);
                    ((hl0) this.m.g).b(t8Var2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        t8[] t8VarArr2 = this.g;
                        int i6 = i4 - 1;
                        t8 t8Var3 = t8VarArr2[i4];
                        t8VarArr2[i6] = t8Var3;
                        fx0 fx0Var2 = t8Var3.a;
                        if (fx0Var2.h == i4) {
                            fx0Var2.h = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            t8 t8Var = this.g[i];
            t8Var.a.j = t8Var.b;
        }
    }

    public final fx0 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        fx0 fx0VarA = a(4);
        float[] fArr = fx0VarA.m;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        fx0VarA.g = i2;
        fx0VarA.i = i;
        ((fx0[]) this.m.i)[i2] = fx0VarA;
        jm0 jm0Var = this.d;
        jm0Var.i.g = fx0VarA;
        Arrays.fill(fArr, 0.0f);
        fArr[fx0VarA.i] = 1.0f;
        jm0Var.j(fx0VarA);
        return fx0VarA;
    }

    public final fx0 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof wh)) {
            return null;
        }
        wh whVar = (wh) obj;
        fx0 fx0Var = whVar.i;
        if (fx0Var == null) {
            whVar.k();
            fx0Var = whVar.i;
        }
        int i = fx0Var.g;
        xb4 xb4Var = this.m;
        if (i != -1 && i <= this.c && ((fx0[]) xb4Var.i)[i] != null) {
            return fx0Var;
        }
        if (i != -1) {
            fx0Var.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        fx0Var.g = i2;
        fx0Var.q = 1;
        ((fx0[]) xb4Var.i)[i2] = fx0Var;
        return fx0Var;
    }

    public final t8 l() {
        Object obj;
        xb4 xb4Var = this.m;
        hl0 hl0Var = (hl0) xb4Var.g;
        int i = hl0Var.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = hl0Var.a;
            obj = objArr[i2];
            objArr[i2] = null;
            hl0Var.b = i2;
        } else {
            obj = null;
        }
        t8 t8Var = (t8) obj;
        if (t8Var == null) {
            return new t8(xb4Var);
        }
        t8Var.a = null;
        t8Var.d.b();
        t8Var.b = 0.0f;
        t8Var.e = false;
        return t8Var;
    }

    public final fx0 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        fx0 fx0VarA = a(3);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        fx0VarA.g = i;
        ((fx0[]) this.m.i)[i] = fx0VarA;
        return fx0VarA;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (t8[]) Arrays.copyOf(this.g, i);
        xb4 xb4Var = this.m;
        xb4Var.i = (fx0[]) Arrays.copyOf((fx0[]) xb4Var.i, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        jm0 jm0Var = this.d;
        if (jm0Var.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(jm0Var);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(jm0Var);
                return;
            }
        }
        i();
    }

    public final void q(jm0 jm0Var) {
        int i = 0;
        while (true) {
            if (i >= this.k) {
                break;
            }
            t8 t8Var = this.g[i];
            int i2 = 1;
            if (t8Var.a.q != 1) {
                float f = 0.0f;
                if (t8Var.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.k) {
                            t8 t8Var2 = this.g[i6];
                            if (t8Var2.a.q != i2 && !t8Var2.e && t8Var2.b < f) {
                                int iD = t8Var2.d.d();
                                int i8 = 0;
                                while (i8 < iD) {
                                    fx0 fx0VarE = t8Var2.d.e(i8);
                                    float fC = t8Var2.d.c(fx0VarE);
                                    if (fC > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = fx0VarE.l[i9] / fC;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = fx0VarE.g;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            t8 t8Var3 = this.g[i4];
                            t8Var3.a.h = -1;
                            t8Var3.g(((fx0[]) this.m.i)[i5]);
                            fx0 fx0Var = t8Var3.a;
                            fx0Var.h = i4;
                            fx0Var.e(this, t8Var3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.j / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(jm0Var);
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(defpackage.t8 r17) {
        /*
            Method dump skipped, instructions count: 177
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x60.r(t8):void");
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            t8 t8Var = this.g[i];
            if (t8Var != null) {
                ((hl0) this.m.g).b(t8Var);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        xb4 xb4Var;
        int i = 0;
        while (true) {
            xb4Var = this.m;
            fx0[] fx0VarArr = (fx0[]) xb4Var.i;
            if (i >= fx0VarArr.length) {
                break;
            }
            fx0 fx0Var = fx0VarArr[i];
            if (fx0Var != null) {
                fx0Var.c();
            }
            i++;
        }
        hl0 hl0Var = (hl0) xb4Var.h;
        fx0[] fx0VarArr2 = this.n;
        int length = this.o;
        hl0Var.getClass();
        if (length > fx0VarArr2.length) {
            length = fx0VarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            fx0 fx0Var2 = fx0VarArr2[i2];
            int i3 = hl0Var.b;
            Object[] objArr = hl0Var.a;
            if (i3 < objArr.length) {
                objArr[i3] = fx0Var2;
                hl0Var.b = i3 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((fx0[]) xb4Var.i, (Object) null);
        this.c = 0;
        jm0 jm0Var = this.d;
        jm0Var.h = 0;
        jm0Var.b = 0.0f;
        this.j = 1;
        for (int i4 = 0; i4 < this.k; i4++) {
            t8 t8Var = this.g[i4];
        }
        s();
        this.k = 0;
        this.p = new t8(xb4Var);
    }
}
