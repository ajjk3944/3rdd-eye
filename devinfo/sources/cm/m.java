package cm;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f2973a;

    /* renamed from: b, reason: collision with root package name */
    public n f2974b;

    public m(l lVar) {
        this.f2973a = lVar;
    }

    public final synchronized n a(SSLSocket sSLSocket) {
        try {
            if (this.f2974b == null && this.f2973a.matchesSocket(sSLSocket)) {
                this.f2974b = this.f2973a.create(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2974b;
    }

    @Override // cm.n
    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List list) {
        nk.k.e(list, "protocols");
        n nVarA = a(sSLSocket);
        if (nVarA != null) {
            nVarA.configureTlsExtensions(sSLSocket, str, list);
        }
    }

    @Override // cm.n
    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        n nVarA = a(sSLSocket);
        if (nVarA != null) {
            return nVarA.getSelectedProtocol(sSLSocket);
        }
        return null;
    }

    @Override // cm.n
    public final boolean isSupported() {
        return true;
    }

    @Override // cm.n
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return this.f2973a.matchesSocket(sSLSocket);
    }
}
