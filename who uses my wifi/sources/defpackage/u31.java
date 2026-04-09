package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u31 extends tn0 {
    public int k;
    public int l;
    public byte[] m;

    @Override // defpackage.tn0
    public final void k(cm cmVar) {
        this.k = cmVar.f();
        this.l = cmVar.f();
        this.m = cmVar.b();
    }

    @Override // defpackage.tn0
    public final String l() {
        return this.k + " " + this.l + " " + tn0.a(this.m, true);
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.m(this.k);
        t3Var.m(this.l);
        t3Var.j(this.m);
    }
}
