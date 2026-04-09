package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vj3 implements uj3 {
    public final z94 a;
    public final gk3 b;
    public final long c;

    public vj3(z94 z94Var, gk3 gk3Var, long j) {
        this.a = z94Var;
        this.b = gk3Var;
        this.c = j;
    }

    @Override // defpackage.uj3
    public final boolean a(jh3 jh3Var) {
        gk3 gk3Var = this.b;
        if (jh3Var == null || jh3Var.equals(jh3.E())) {
            gk3Var.b(15102);
            return false;
        }
        if (jh3Var.C() == this.a.d()) {
            return true;
        }
        gk3Var.b(15103);
        return false;
    }

    @Override // defpackage.uj3
    public final boolean b(jh3 jh3Var) {
        gk3 gk3Var = this.b;
        if (jh3Var == null || jh3Var.equals(jh3.E())) {
            gk3Var.b(15104);
            return true;
        }
        if (jh3Var.C() != this.a.d()) {
            gk3Var.b(15105);
            return true;
        }
        boolean z = (jh3Var.A().C() * 1000) - System.currentTimeMillis() <= this.c;
        if (z) {
            gk3Var.b(15106);
        }
        return z;
    }
}
