package ea;

import U9.y;
import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import da.h;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.l;

/* compiled from: Android10SocketAdapter.kt */
@SuppressLint({"NewApi"})
/* loaded from: classes3.dex */
public final class a implements j {
    @Override // ea.j
    public final boolean a() {
        da.h hVar = da.h.f37600a;
        return h.a.c() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // ea.j
    public final boolean b(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // ea.j
    @SuppressLint({"NewApi"})
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // ea.j
    @SuppressLint({"NewApi"})
    public final void d(SSLSocket sSLSocket, String str, List<? extends y> protocols) throws IOException {
        l.f(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            da.h hVar = da.h.f37600a;
            sSLParameters.setApplicationProtocols((String[]) h.a.a(protocols).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e4) {
            throw new IOException("Android internal error", e4);
        }
    }
}
