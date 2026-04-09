package defpackage;

import java.io.Serializable;
import java.net.InetAddress;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w10 extends tn0 {
    public int k;
    public int l;
    public int m;
    public Serializable n;
    public byte[] o;

    @Override // defpackage.tn0
    public final void k(cm cmVar) throws t91 {
        this.k = cmVar.i();
        this.l = cmVar.i();
        this.m = cmVar.i();
        int i = this.l;
        if (i == 0) {
            this.n = null;
        } else if (i == 1) {
            this.n = InetAddress.getByAddress(cmVar.c(4));
        } else if (i == 2) {
            this.n = InetAddress.getByAddress(cmVar.c(16));
        } else {
            if (i != 3) {
                throw new t91("invalid gateway type");
            }
            this.n = new gg0(cmVar);
        }
        if (((ByteBuffer) cmVar.j).remaining() > 0) {
            this.o = cmVar.b();
        }
    }

    @Override // defpackage.tn0
    public final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.k);
        sb.append(" ");
        sb.append(this.l);
        sb.append(" ");
        sb.append(this.m);
        sb.append(" ");
        int i = this.l;
        if (i == 0) {
            sb.append(".");
        } else if (i == 1 || i == 2) {
            sb.append(((InetAddress) this.n).getHostAddress());
        } else if (i == 3) {
            sb.append(this.n);
        }
        if (this.o != null) {
            sb.append(" ");
            sb.append(um.y(this.o));
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.q(this.k);
        t3Var.q(this.l);
        t3Var.q(this.m);
        int i = this.l;
        if (i == 1 || i == 2) {
            t3Var.j(((InetAddress) this.n).getAddress());
        } else if (i == 3) {
            ((gg0) this.n).r(t3Var, null, z);
        }
        byte[] bArr = this.o;
        if (bArr != null) {
            t3Var.k(bArr, 0, bArr.length);
        }
    }
}
