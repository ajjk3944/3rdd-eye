package ea;

import U9.y;
import da.h;
import ea.i;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.l;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: BouncyCastleSocketAdapter.kt */
/* loaded from: classes3.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public static final a f37788a = new a();

    /* compiled from: BouncyCastleSocketAdapter.kt */
    public static final class a implements i.a {
        @Override // ea.i.a
        public final boolean b(SSLSocket sSLSocket) {
            boolean z10 = da.c.f37584d;
            return false;
        }

        @Override // ea.i.a
        public final j c(SSLSocket sSLSocket) {
            return new g();
        }
    }

    @Override // ea.j
    public final boolean a() {
        boolean z10 = da.c.f37584d;
        return da.c.f37584d;
    }

    @Override // ea.j
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // ea.j
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // ea.j
    public final void d(SSLSocket sSLSocket, String str, List<? extends y> protocols) {
        l.f(protocols, "protocols");
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            da.h hVar = da.h.f37600a;
            parameters.setApplicationProtocols((String[]) h.a.a(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
