package defpackage;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class or0 extends tn0 {
    public int k;
    public int l;
    public int m;
    public long n;
    public Instant o;
    public Instant p;
    public int q;
    public gg0 r;
    public byte[] s;

    @Override // defpackage.tn0
    public final int h() {
        return this.k;
    }

    @Override // defpackage.tn0
    public final void k(cm cmVar) {
        this.k = cmVar.f();
        this.l = cmVar.i();
        this.m = cmVar.i();
        this.n = cmVar.g();
        this.o = Instant.ofEpochSecond(cmVar.g());
        this.p = Instant.ofEpochSecond(cmVar.g());
        this.q = cmVar.f();
        this.r = new gg0(cmVar);
        this.s = cmVar.b();
    }

    @Override // defpackage.tn0
    public final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(k31.a.e(this.k));
        sb.append(" ");
        sb.append(this.l);
        sb.append(" ");
        sb.append(this.m);
        sb.append(" ");
        sb.append(this.n);
        sb.append(" ");
        if (tj0.a()) {
            sb.append("(\n\t");
        }
        Instant instant = this.o;
        DateTimeFormatter dateTimeFormatter = cw.a;
        sb.append(dateTimeFormatter.format(instant));
        sb.append(" ");
        sb.append(dateTimeFormatter.format(this.p));
        sb.append(" ");
        sb.append(this.q);
        sb.append(" ");
        sb.append(this.r);
        if (tj0.a()) {
            sb.append("\n");
            sb.append(um.i(this.s, true));
        } else {
            sb.append(" ");
            sb.append(um.y(this.s));
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.m(this.k);
        t3Var.q(this.l);
        t3Var.q(this.m);
        t3Var.o(this.n);
        t3Var.o(this.o.getEpochSecond());
        t3Var.o(this.p.getEpochSecond());
        t3Var.m(this.q);
        this.r.r(t3Var, null, z);
        t3Var.j(this.s);
    }
}
