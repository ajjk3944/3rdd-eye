package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ji0 extends tn0 {
    public byte[] k;

    @Override // defpackage.tn0
    public final void k(cm cmVar) {
        this.k = cmVar.b();
    }

    @Override // defpackage.tn0
    public final String l() {
        StringBuilder sb = new StringBuilder();
        if (this.k != null) {
            if (tj0.a()) {
                sb.append("(\n");
                sb.append(um.i(this.k, true));
            } else {
                sb.append(um.y(this.k));
            }
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.j(this.k);
    }
}
