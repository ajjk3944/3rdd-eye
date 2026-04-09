package cm;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i implements l {
    @Override // cm.l
    public final n create(SSLSocket sSLSocket) {
        return new k();
    }

    @Override // cm.l
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return k.f2972b && Conscrypt.isConscrypt(sSLSocket);
    }
}
