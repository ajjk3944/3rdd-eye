package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ur0 extends tn0 {
    public int k;
    public int l;
    public int m;
    public gg0 n;

    @Override // defpackage.tn0
    public final gg0 f() {
        return this.n;
    }

    @Override // defpackage.tn0
    public final void k(cm cmVar) {
        this.k = cmVar.f();
        this.l = cmVar.f();
        this.m = cmVar.f();
        this.n = new gg0(cmVar);
    }

    @Override // defpackage.tn0
    public final String l() {
        return this.k + " " + this.l + " " + this.m + " " + this.n;
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.m(this.k);
        t3Var.m(this.l);
        t3Var.m(this.m);
        this.n.r(t3Var, null, z);
    }
}
