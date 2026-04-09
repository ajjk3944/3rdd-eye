package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bg0 extends tn0 {
    public gg0 k;
    public l31 l;

    @Override // defpackage.tn0
    public final void k(cm cmVar) {
        this.k = new gg0(cmVar);
        this.l = new l31(cmVar);
    }

    @Override // defpackage.tn0
    public final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.k);
        if (!this.l.f.isEmpty()) {
            sb.append(' ');
            sb.append(this.l.toString());
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        this.k.q(t3Var, null);
        this.l.b(t3Var);
    }
}
