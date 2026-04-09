package cm;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final i f2971a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f2972b;

    static {
        boolean z3 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, j.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (j.a()) {
                    z3 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f2972b = z3;
    }

    @Override // cm.n
    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List list) {
        nk.k.e(list, "protocols");
        if (matchesSocket(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            bm.e eVar = bm.e.f2349a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) b7.h.a(list).toArray(new String[0]));
        }
    }

    @Override // cm.n
    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        if (matchesSocket(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // cm.n
    public final boolean isSupported() {
        return f2972b;
    }

    @Override // cm.n
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }
}
