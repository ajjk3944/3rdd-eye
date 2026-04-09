package defpackage;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yz0 extends tn0 {
    public gg0 k;
    public Instant l;
    public Instant m;
    public int n;
    public int o;
    public byte[] p;
    public byte[] q;

    @Override // defpackage.tn0
    public final void k(cm cmVar) throws t91 {
        this.k = new gg0(cmVar);
        this.l = Instant.ofEpochSecond(cmVar.g());
        this.m = Instant.ofEpochSecond(cmVar.g());
        this.n = cmVar.f();
        this.o = cmVar.f();
        int iF = cmVar.f();
        if (iF > 0) {
            this.p = cmVar.c(iF);
        } else {
            this.p = null;
        }
        int iF2 = cmVar.f();
        if (iF2 > 0) {
            this.q = cmVar.c(iF2);
        } else {
            this.q = null;
        }
    }

    @Override // defpackage.tn0
    public final String l() {
        String strE;
        StringBuilder sb = new StringBuilder();
        sb.append(this.k);
        sb.append(" ");
        if (tj0.a()) {
            sb.append("(\n\t");
        }
        Instant instant = this.l;
        DateTimeFormatter dateTimeFormatter = cw.a;
        sb.append(dateTimeFormatter.format(instant));
        sb.append(" ");
        sb.append(dateTimeFormatter.format(this.m));
        sb.append(" ");
        int i = this.n;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Integer.toString(i) : "DELETE" : "RESOLVERASSIGNED" : "GSSAPI" : "DIFFIEHELLMAN" : "SERVERASSIGNED");
        sb.append(" ");
        int i2 = this.o;
        if (i2 == 16) {
            ue0 ue0Var = pn0.a;
            strE = "BADSIG";
        } else {
            strE = pn0.a.e(i2);
        }
        sb.append(strE);
        if (tj0.a()) {
            sb.append("\n");
            byte[] bArr = this.p;
            if (bArr != null) {
                sb.append(um.i(bArr, false));
                sb.append("\n");
            }
            byte[] bArr2 = this.q;
            if (bArr2 != null) {
                sb.append(um.i(bArr2, false));
            }
            sb.append(" )");
        } else {
            sb.append(" ");
            byte[] bArr3 = this.p;
            if (bArr3 != null) {
                sb.append(um.y(bArr3));
                sb.append(" ");
            }
            byte[] bArr4 = this.q;
            if (bArr4 != null) {
                sb.append(um.y(bArr4));
            }
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        this.k.r(t3Var, null, z);
        t3Var.o(this.l.getEpochSecond());
        t3Var.o(this.m.getEpochSecond());
        t3Var.m(this.n);
        t3Var.m(this.o);
        byte[] bArr = this.p;
        if (bArr != null) {
            t3Var.m(bArr.length);
            t3Var.j(this.p);
        } else {
            t3Var.m(0);
        }
        byte[] bArr2 = this.q;
        if (bArr2 == null) {
            t3Var.m(0);
        } else {
            t3Var.m(bArr2.length);
            t3Var.j(this.q);
        }
    }
}
