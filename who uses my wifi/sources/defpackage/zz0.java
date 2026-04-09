package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class zz0 extends tn0 {
    public int k;
    public int l;
    public int m;
    public byte[] n;

    @Override // defpackage.tn0
    public final void k(cm cmVar) throws t91 {
        this.k = cmVar.i();
        this.l = cmVar.i();
        this.m = cmVar.i();
        byte[] bArrB = cmVar.b();
        this.n = bArrB;
        if (bArrB.length == 0) {
            throw new t91("end of input");
        }
    }

    @Override // defpackage.tn0
    public final String l() {
        return this.k + " " + this.l + " " + this.m + " " + yb.s(this.n);
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.q(this.k);
        t3Var.q(this.l);
        t3Var.q(this.m);
        t3Var.j(this.n);
    }
}
