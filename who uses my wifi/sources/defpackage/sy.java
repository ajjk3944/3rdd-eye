package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sy extends tn0 {
    public byte[] k;
    public byte[] l;
    public byte[] m;

    public static void q(double d, double d2) {
        if (d < -90.0d || d > 90.0d) {
            throw new IllegalArgumentException("illegal longitude " + d);
        }
        if (d2 < -180.0d || d2 > 180.0d) {
            throw new IllegalArgumentException("illegal latitude " + d2);
        }
    }

    @Override // defpackage.tn0
    public final void k(cm cmVar) throws t91 {
        this.l = cmVar.e();
        this.k = cmVar.e();
        this.m = cmVar.e();
        try {
            q(Double.parseDouble(tn0.a(this.l, false)), Double.parseDouble(tn0.a(this.k, false)));
        } catch (IllegalArgumentException e) {
            throw new t91(e.getMessage());
        }
    }

    @Override // defpackage.tn0
    public final String l() {
        return tn0.a(this.l, true) + " " + tn0.a(this.k, true) + " " + tn0.a(this.m, true);
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.l(this.l);
        t3Var.l(this.k);
        t3Var.l(this.m);
    }
}
