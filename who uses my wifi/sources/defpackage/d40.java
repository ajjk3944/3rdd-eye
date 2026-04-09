package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d40 extends b40 {
    public final g40 j;
    public final e40 k;
    public final te l;
    public final Object m;

    public d40(g40 g40Var, e40 e40Var, te teVar, Object obj) {
        this.j = g40Var;
        this.k = e40Var;
        this.l = teVar;
        this.m = obj;
    }

    @Override // defpackage.f30
    public final void d(Throwable th) {
        te teVarI = g40.I(this.l);
        g40 g40Var = this.j;
        e40 e40Var = this.k;
        Object obj = this.m;
        if (teVarI != null) {
            while (wl2.o(teVarI.j, false, new d40(g40Var, e40Var, teVarI, obj), 1) == ph0.f) {
                teVarI = g40.I(teVarI);
                if (teVarI == null) {
                }
            }
            return;
        }
        g40Var.m(g40Var.u(e40Var, obj));
    }
}
