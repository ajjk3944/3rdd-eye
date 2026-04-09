package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hu2 implements l42 {
    public final gn2 f;
    public final ta2 g;
    public final String h;
    public final String i;

    public hu2(gn2 gn2Var, a83 a83Var) {
        this.f = gn2Var;
        this.g = a83Var.l;
        this.h = a83Var.j;
        this.i = a83Var.k;
    }

    @Override // defpackage.l42
    public final void T(ta2 ta2Var) {
        int i;
        String str;
        ta2 ta2Var2 = this.g;
        if (ta2Var2 != null) {
            ta2Var = ta2Var2;
        }
        if (ta2Var != null) {
            str = ta2Var.f;
            i = ta2Var.g;
        } else {
            i = 1;
            str = "";
        }
        ka2 ka2Var = new ka2(str, i);
        gn2 gn2Var = this.f;
        gn2Var.getClass();
        gn2Var.P1(new xb4(ka2Var, this.h, this.i, 21));
    }

    @Override // defpackage.l42
    public final void a() {
        this.f.P1(sd2.k);
    }

    @Override // defpackage.l42
    public final void r() {
        this.f.P1(qd2.k);
    }
}
