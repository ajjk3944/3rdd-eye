package yu;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final g f26468a = new g();

    @Override // yu.m
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // yu.m
    public final boolean b() {
        boolean z10 = xu.e.f25545d;
        return xu.e.f25545d;
    }

    @Override // yu.m
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // yu.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        br.l.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            xu.n nVar = xu.n.f25563a;
            parameters.setApplicationProtocols((String[]) io.sentry.hints.i.H(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
