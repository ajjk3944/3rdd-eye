package cm;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public interface n {
    void configureTlsExtensions(SSLSocket sSLSocket, String str, List list);

    String getSelectedProtocol(SSLSocket sSLSocket);

    boolean isSupported();

    boolean matchesSocket(SSLSocket sSLSocket);
}
