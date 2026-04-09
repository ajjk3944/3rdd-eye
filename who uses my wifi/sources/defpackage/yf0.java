package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yf0 extends tn0 {
    public int k;
    public int l;
    public int m;
    public byte[] n;

    @Override // defpackage.tn0
    public final void k(cm cmVar) throws t91 {
        this.k = cmVar.i();
        this.l = cmVar.i();
        this.m = cmVar.f();
        int i = cmVar.i();
        if (i > 0) {
            this.n = cmVar.c(i);
        } else {
            this.n = null;
        }
    }

    @Override // defpackage.tn0
    public final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.k);
        sb.append(' ');
        sb.append(this.l);
        sb.append(' ');
        sb.append(this.m);
        sb.append(' ');
        byte[] bArr = this.n;
        if (bArr == null) {
            sb.append('-');
        } else {
            sb.append(yb.s(bArr));
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.q(this.k);
        t3Var.q(this.l);
        t3Var.m(this.m);
        byte[] bArr = this.n;
        if (bArr == null) {
            t3Var.q(0);
        } else {
            t3Var.q(bArr.length);
            t3Var.j(this.n);
        }
    }
}
