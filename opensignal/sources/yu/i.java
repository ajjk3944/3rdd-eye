package yu;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class i implements k {
    @Override // yu.k
    public final boolean a(SSLSocket sSLSocket) {
        return xu.h.f25548d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // yu.k
    public final m b(SSLSocket sSLSocket) {
        return new j();
    }
}
