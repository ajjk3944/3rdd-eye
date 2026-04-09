package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b extends tn0 {
    public byte[] k;

    @Override // defpackage.tn0
    public final void k(cm cmVar) {
        this.k = cmVar.c(16);
    }

    @Override // defpackage.tn0
    public final String l() throws UnknownHostException {
        try {
            InetAddress byAddress = InetAddress.getByAddress(null, this.k);
            if (byAddress.getAddress().length != 4) {
                return byAddress.getHostAddress();
            }
            return "::ffff:" + byAddress.getHostAddress();
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.j(this.k);
    }
}
