package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class t8 {
    public final m8 d;
    public fx0 a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public t8(xb4 xb4Var) {
        this.d = new m8(this, xb4Var);
    }

    public final void a(x60 x60Var, int i) {
        this.d.g(x60Var.j(i), 1.0f);
        this.d.g(x60Var.j(i), -1.0f);
    }

    public final void b(fx0 fx0Var, fx0 fx0Var2, fx0 fx0Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.g(fx0Var, 1.0f);
            this.d.g(fx0Var2, -1.0f);
            this.d.g(fx0Var3, -1.0f);
        } else {
            this.d.g(fx0Var, -1.0f);
            this.d.g(fx0Var2, 1.0f);
            this.d.g(fx0Var3, 1.0f);
        }
    }

    public final void c(fx0 fx0Var, fx0 fx0Var2, fx0 fx0Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.g(fx0Var, 1.0f);
            this.d.g(fx0Var2, -1.0f);
            this.d.g(fx0Var3, 1.0f);
        } else {
            this.d.g(fx0Var, -1.0f);
            this.d.g(fx0Var2, 1.0f);
            this.d.g(fx0Var3, -1.0f);
        }
    }

    public fx0 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final fx0 f(boolean[] zArr, fx0 fx0Var) {
        int i;
        int iD = this.d.d();
        fx0 fx0Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iD; i2++) {
            float f2 = this.d.f(i2);
            if (f2 < 0.0f) {
                fx0 fx0VarE = this.d.e(i2);
                if ((zArr == null || !zArr[fx0VarE.g]) && fx0VarE != fx0Var && (((i = fx0VarE.q) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    fx0Var2 = fx0VarE;
                }
            }
        }
        return fx0Var2;
    }

    public final void g(fx0 fx0Var) {
        fx0 fx0Var2 = this.a;
        if (fx0Var2 != null) {
            this.d.g(fx0Var2, -1.0f);
            this.a.h = -1;
            this.a = null;
        }
        float fH = this.d.h(fx0Var, true) * (-1.0f);
        this.a = fx0Var;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        m8 m8Var = this.d;
        int i = m8Var.h;
        for (int i2 = 0; i != -1 && i2 < m8Var.a; i2++) {
            float[] fArr = m8Var.g;
            fArr[i] = fArr[i] / fH;
            i = m8Var.f[i];
        }
    }

    public final void h(x60 x60Var, fx0 fx0Var, boolean z) {
        if (fx0Var.k) {
            float fC = this.d.c(fx0Var);
            this.b = (fx0Var.j * fC) + this.b;
            this.d.h(fx0Var, z);
            if (z) {
                fx0Var.b(this);
            }
            if (this.d.d() == 0) {
                this.e = true;
                x60Var.b = true;
            }
        }
    }

    public void i(x60 x60Var, t8 t8Var, boolean z) {
        m8 m8Var = this.d;
        m8Var.getClass();
        float fC = m8Var.c(t8Var.a);
        m8Var.h(t8Var.a, z);
        m8 m8Var2 = t8Var.d;
        int iD = m8Var2.d();
        for (int i = 0; i < iD; i++) {
            fx0 fx0VarE = m8Var2.e(i);
            m8Var.a(fx0VarE, m8Var2.c(fx0VarE) * fC, z);
        }
        this.b = (t8Var.b * fC) + this.b;
        if (z) {
            t8Var.a.b(this);
        }
        if (this.a == null || this.d.d() != 0) {
            return;
        }
        this.e = true;
        x60Var.b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            fx0 r0 = r10.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            fx0 r1 = r10.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = defpackage.ex0.g(r0, r1)
            float r1 = r10.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L3a
        L39:
            r1 = r3
        L3a:
            m8 r5 = r10.d
            int r5 = r5.d()
        L40:
            if (r3 >= r5) goto La0
            m8 r6 = r10.d
            fx0 r6 = r6.e(r3)
            if (r6 != 0) goto L4b
            goto L9d
        L4b:
            m8 r7 = r10.d
            float r7 = r7.f(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto L9d
        L56:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L6a
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7a
            java.lang.String r1 = "- "
            java.lang.String r0 = defpackage.ex0.g(r0, r1)
        L68:
            float r7 = r7 * r9
            goto L7a
        L6a:
            if (r8 <= 0) goto L73
            java.lang.String r1 = " + "
            java.lang.String r0 = defpackage.ex0.g(r0, r1)
            goto L7a
        L73:
            java.lang.String r1 = " - "
            java.lang.String r0 = defpackage.ex0.g(r0, r1)
            goto L68
        L7a:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L85
            java.lang.String r0 = defpackage.ex0.g(r0, r6)
            goto L9c
        L85:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L9c:
            r1 = r4
        L9d:
            int r3 = r3 + 1
            goto L40
        La0:
            if (r1 != 0) goto La8
            java.lang.String r1 = "0.0"
            java.lang.String r0 = defpackage.ex0.g(r0, r1)
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t8.toString():java.lang.String");
    }
}
