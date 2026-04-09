package cm;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final f f2969a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f2970b;

    static {
        boolean z3 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, g.class.getClassLoader());
            z3 = true;
        } catch (ClassNotFoundException unused) {
        }
        f2970b = z3;
    }

    @Override // cm.n
    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List list) {
        nk.k.e(list, "protocols");
        if (matchesSocket(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            bm.e eVar = bm.e.f2349a;
            parameters.setApplicationProtocols((String[]) b7.h.a(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // cm.n
    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // cm.n
    public final boolean isSupported() {
        return f2970b;
    }

    @Override // cm.n
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return false;
    }
}
