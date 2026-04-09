package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d00 extends tn0 {
    public byte[] k;
    public byte[] l;

    @Override // defpackage.tn0
    public final void k(cm cmVar) {
        this.k = cmVar.e();
        this.l = cmVar.e();
    }

    @Override // defpackage.tn0
    public final String l() {
        return tn0.a(this.k, true) + " " + tn0.a(this.l, true);
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.l(this.k);
        t3Var.l(this.l);
    }
}
