package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class f91 {
    public final o91 a;
    public y20[] b;

    public f91() {
        this(new o91());
    }

    public final void a() {
        y20[] y20VarArr = this.b;
        if (y20VarArr != null) {
            y20 y20VarF = y20VarArr[0];
            y20 y20VarF2 = y20VarArr[1];
            o91 o91Var = this.a;
            if (y20VarF2 == null) {
                y20VarF2 = o91Var.a.f(2);
            }
            if (y20VarF == null) {
                y20VarF = o91Var.a.f(1);
            }
            g(y20.a(y20VarF, y20VarF2));
            y20 y20Var = this.b[g82.j(16)];
            if (y20Var != null) {
                f(y20Var);
            }
            y20 y20Var2 = this.b[g82.j(32)];
            if (y20Var2 != null) {
                d(y20Var2);
            }
            y20 y20Var3 = this.b[g82.j(64)];
            if (y20Var3 != null) {
                h(y20Var3);
            }
        }
    }

    public abstract o91 b();

    public void c(int i, y20 y20Var) {
        if (this.b == null) {
            this.b = new y20[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[g82.j(i2)] = y20Var;
            }
        }
    }

    public abstract void e(y20 y20Var);

    public abstract void g(y20 y20Var);

    public f91(o91 o91Var) {
        this.a = o91Var;
    }

    public void d(y20 y20Var) {
    }

    public void f(y20 y20Var) {
    }

    public void h(y20 y20Var) {
    }
}
