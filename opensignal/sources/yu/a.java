package yu;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class a implements m {
    @Override // yu.m
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // yu.m
    public final boolean b() {
        xu.n nVar = xu.n.f25563a;
        return io.sentry.hints.i.P() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // yu.m
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // yu.m
    public final void d(SSLSocket sSLSocket, String str, List list) throws IOException {
        br.l.e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            xu.n nVar = xu.n.f25563a;
            sSLParameters.setApplicationProtocols((String[]) io.sentry.hints.i.H(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e4) {
            throw new IOException("Android internal error", e4);
        }
    }
}
