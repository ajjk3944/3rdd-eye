package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nc extends tn0 {
    public int k;
    public int l;
    public int m;
    public byte[] n;

    @Override // defpackage.tn0
    public final void k(cm cmVar) {
        this.k = cmVar.f();
        this.l = cmVar.f();
        this.m = cmVar.i();
        this.n = cmVar.b();
    }

    @Override // defpackage.tn0
    public final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.k);
        sb.append(" ");
        sb.append(this.l);
        sb.append(" ");
        sb.append(this.m);
        if (this.n != null) {
            if (tj0.a()) {
                sb.append(" (\n");
                sb.append(um.i(this.n, true));
            } else {
                sb.append(" ");
                sb.append(um.y(this.n));
            }
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.m(this.k);
        t3Var.m(this.l);
        t3Var.q(this.m);
        t3Var.j(this.n);
    }
}
