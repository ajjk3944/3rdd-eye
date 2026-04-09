package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rr0 extends tn0 {
    public gg0 k;
    public gg0 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    @Override // defpackage.tn0
    public final void k(cm cmVar) {
        this.k = new gg0(cmVar);
        this.l = new gg0(cmVar);
        this.m = cmVar.g();
        this.n = cmVar.g();
        this.o = cmVar.g();
        this.p = cmVar.g();
        this.q = cmVar.g();
    }

    @Override // defpackage.tn0
    public final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.k);
        sb.append(" ");
        sb.append(this.l);
        if (tj0.a()) {
            sb.append(" (\n\t\t\t\t\t");
            sb.append(this.m);
            sb.append("\t; serial\n\t\t\t\t\t");
            sb.append(this.n);
            sb.append("\t; refresh\n\t\t\t\t\t");
            sb.append(this.o);
            sb.append("\t; retry\n\t\t\t\t\t");
            sb.append(this.p);
            sb.append("\t; expire\n\t\t\t\t\t");
            sb.append(this.q);
            sb.append(" )\t; minimum");
        } else {
            sb.append(" ");
            sb.append(this.m);
            sb.append(" ");
            sb.append(this.n);
            sb.append(" ");
            sb.append(this.o);
            sb.append(" ");
            sb.append(this.p);
            sb.append(" ");
            sb.append(this.q);
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        this.k.r(t3Var, jhVar, z);
        this.l.r(t3Var, jhVar, z);
        t3Var.o(this.m);
        t3Var.o(this.n);
        t3Var.o(this.o);
        t3Var.o(this.p);
        t3Var.o(this.q);
    }
}
