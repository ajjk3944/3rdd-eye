package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class am extends tn0 {
    public int k;
    public int l;
    public int m;
    public byte[] n;

    @Override // defpackage.tn0
    public final void k(cm cmVar) {
        this.k = cmVar.f();
        this.l = cmVar.i();
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
            sb.append(" ");
            sb.append(yb.s(this.n));
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.m(this.k);
        t3Var.q(this.l);
        t3Var.q(this.m);
        byte[] bArr = this.n;
        if (bArr != null) {
            t3Var.k(bArr, 0, bArr.length);
        }
    }
}
