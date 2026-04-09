package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kc extends tn0 {
    public int k;
    public byte[] l;
    public byte[] m;

    @Override // defpackage.tn0
    public final void k(cm cmVar) {
        this.k = cmVar.i();
        this.l = cmVar.e();
        this.m = cmVar.b();
    }

    @Override // defpackage.tn0
    public final String l() {
        return this.k + " " + tn0.a(this.l, false) + " " + tn0.a(this.m, true);
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.q(this.k);
        t3Var.l(this.l);
        t3Var.j(this.m);
    }
}
