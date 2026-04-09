package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wj3 implements uj3 {
    public final gk3 a;
    public final long b;

    public wj3(gk3 gk3Var, long j) {
        this.a = gk3Var;
        this.b = j;
    }

    @Override // defpackage.uj3
    public final boolean a(jh3 jh3Var) {
        if (jh3Var != null && !jh3Var.equals(jh3.E())) {
            return true;
        }
        this.a.b(20204);
        return false;
    }

    @Override // defpackage.uj3
    public final boolean b(jh3 jh3Var) {
        gk3 gk3Var = this.a;
        if (jh3Var == null || jh3Var.equals(jh3.E())) {
            gk3Var.b(20202);
            return true;
        }
        boolean z = jh3Var.B().B() - System.currentTimeMillis() <= this.b;
        if (z) {
            gk3Var.b(20203);
        }
        return z;
    }
}
