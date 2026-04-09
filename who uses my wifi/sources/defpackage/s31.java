package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class s31 extends tn0 {
    public int k;
    public gg0 l;

    @Override // defpackage.tn0
    public final void k(cm cmVar) {
        this.k = cmVar.f();
        this.l = new gg0(cmVar);
    }

    @Override // defpackage.tn0
    public final String l() {
        return this.k + " " + this.l;
    }

    @Override // defpackage.tn0
    public void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.m(this.k);
        this.l.r(t3Var, null, z);
    }
}
