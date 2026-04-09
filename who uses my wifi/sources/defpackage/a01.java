package defpackage;

import java.time.Duration;
import java.time.Instant;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a01 extends tn0 {
    public gg0 k;
    public Instant l;
    public Duration m;
    public byte[] n;
    public int o;
    public int p;
    public byte[] q;

    @Override // defpackage.tn0
    public final void k(cm cmVar) throws t91 {
        this.k = new gg0(cmVar);
        this.l = Instant.ofEpochSecond((cmVar.f() << 32) + cmVar.g());
        this.m = Duration.ofSeconds(cmVar.f());
        this.n = cmVar.c(cmVar.f());
        this.o = cmVar.f();
        this.p = cmVar.f();
        int iF = cmVar.f();
        if (iF > 0) {
            this.q = cmVar.c(iF);
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
        sb.append(this.l.getEpochSecond());
        sb.append(" ");
        sb.append((int) this.m.getSeconds());
        sb.append(" ");
        sb.append(this.n.length);
        if (tj0.a()) {
            sb.append("\n");
            sb.append(um.i(this.n, false));
        } else {
            sb.append(" ");
            sb.append(um.y(this.n));
        }
        sb.append(" ");
        int i = this.p;
        if (i == 16) {
            ue0 ue0Var = pn0.a;
            strE = "BADSIG";
        } else {
            strE = pn0.a.e(i);
        }
        sb.append(strE);
        sb.append(" ");
        byte[] bArr = this.q;
        if (bArr == null) {
            sb.append(0);
        } else {
            sb.append(bArr.length);
            if (tj0.a()) {
                sb.append("\n\n\n\t");
            } else {
                sb.append(" ");
            }
            if (this.p == 18) {
                if (this.q.length != 6) {
                    sb.append("<invalid BADTIME other data>");
                } else {
                    sb.append("<server time: ");
                    sb.append(Instant.ofEpochSecond(((r1[0] & 255) << 40) + ((r1[1] & 255) << 32) + ((r1[2] & 255) << 24) + ((r1[3] & 255) << 16) + ((r1[4] & 255) << 8) + (r1[5] & 255)));
                    sb.append(">");
                }
            } else {
                sb.append("<");
                sb.append(um.y(this.q));
                sb.append(">");
            }
        }
        if (tj0.a()) {
            sb.append(" )");
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        this.k.r(t3Var, null, z);
        long epochSecond = this.l.getEpochSecond();
        t3Var.m((int) (epochSecond >> 32));
        t3Var.o(epochSecond & 4294967295L);
        t3Var.m((int) this.m.getSeconds());
        t3Var.m(this.n.length);
        t3Var.j(this.n);
        t3Var.m(this.o);
        t3Var.m(this.p);
        byte[] bArr = this.q;
        if (bArr == null) {
            t3Var.m(0);
        } else {
            t3Var.m(bArr.length);
            t3Var.j(this.q);
        }
    }
}
