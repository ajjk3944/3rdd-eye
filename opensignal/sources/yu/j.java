package yu;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final i f26469a = new i();

    @Override // yu.m
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // yu.m
    public final boolean b() {
        boolean z10 = xu.h.f25548d;
        return xu.h.f25548d;
    }

    @Override // yu.m
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // yu.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        br.l.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            xu.n nVar = xu.n.f25563a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) io.sentry.hints.i.H(list).toArray(new String[0]));
        }
    }
}
