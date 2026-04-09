package defpackage;

import java.net.InetAddress;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a extends tn0 {
    public int k;
    public InetAddress l;
    public gg0 m;

    @Override // defpackage.tn0
    public final void k(cm cmVar) throws t91 {
        int i = cmVar.i();
        this.k = i;
        int i2 = (135 - i) / 8;
        if (i < 128) {
            byte[] bArr = new byte[16];
            cmVar.j(i2);
            ((ByteBuffer) cmVar.j).get(bArr, 16 - i2, i2);
            this.l = InetAddress.getByAddress(bArr);
        }
        if (this.k > 0) {
            this.m = new gg0(cmVar);
        }
    }

    @Override // defpackage.tn0
    public final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.k);
        if (this.l != null) {
            sb.append(" ");
            sb.append(this.l.getHostAddress());
        }
        if (this.m != null) {
            sb.append(" ");
            sb.append(this.m);
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.q(this.k);
        InetAddress inetAddress = this.l;
        if (inetAddress != null) {
            int i = (135 - this.k) / 8;
            t3Var.k(inetAddress.getAddress(), 16 - i, i);
        }
        gg0 gg0Var = this.m;
        if (gg0Var != null) {
            gg0Var.r(t3Var, null, z);
        }
    }
}
