package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uf0 extends tn0 {
    public int k;
    public int l;
    public byte[] m;
    public byte[] n;
    public byte[] o;
    public gg0 p;

    @Override // defpackage.tn0
    public final gg0 f() {
        return this.p;
    }

    @Override // defpackage.tn0
    public final void k(cm cmVar) {
        this.k = cmVar.f();
        this.l = cmVar.f();
        this.m = cmVar.e();
        this.n = cmVar.e();
        this.o = cmVar.e();
        this.p = new gg0(cmVar);
    }

    @Override // defpackage.tn0
    public final String l() {
        return this.k + " " + this.l + " " + tn0.a(this.m, true) + " " + tn0.a(this.n, true) + " " + tn0.a(this.o, true) + " " + this.p;
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.m(this.k);
        t3Var.m(this.l);
        t3Var.l(this.m);
        t3Var.l(this.n);
        t3Var.l(this.o);
        this.p.r(t3Var, null, z);
    }
}
