package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class u41 extends t41 {
    public ok0[] a;
    public String b;
    public int c;

    public u41() {
        this.a = null;
        this.c = 0;
    }

    public ok0[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(ok0[] ok0VarArr) {
        if (!zt0.h(this.a, ok0VarArr)) {
            this.a = zt0.l(ok0VarArr);
            return;
        }
        ok0[] ok0VarArr2 = this.a;
        for (int i = 0; i < ok0VarArr.length; i++) {
            ok0VarArr2[i].a = ok0VarArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = ok0VarArr[i].b;
                if (i2 < fArr.length) {
                    ok0VarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public u41(u41 u41Var) {
        this.a = null;
        this.c = 0;
        this.b = u41Var.b;
        this.a = zt0.l(u41Var.a);
    }
}
