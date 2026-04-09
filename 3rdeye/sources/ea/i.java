package ea;

import U9.y;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.l;

/* compiled from: DeferredSocketAdapter.kt */
/* loaded from: classes3.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final a f37790a;

    /* renamed from: b, reason: collision with root package name */
    public j f37791b;

    /* compiled from: DeferredSocketAdapter.kt */
    public interface a {
        boolean b(SSLSocket sSLSocket);

        j c(SSLSocket sSLSocket);
    }

    public i(a aVar) {
        this.f37790a = aVar;
    }

    @Override // ea.j
    public final boolean a() {
        return true;
    }

    @Override // ea.j
    public final boolean b(SSLSocket sSLSocket) {
        return this.f37790a.b(sSLSocket);
    }

    @Override // ea.j
    public final String c(SSLSocket sSLSocket) {
        j jVarE = e(sSLSocket);
        if (jVarE != null) {
            return jVarE.c(sSLSocket);
        }
        return null;
    }

    @Override // ea.j
    public final void d(SSLSocket sSLSocket, String str, List<? extends y> protocols) {
        l.f(protocols, "protocols");
        j jVarE = e(sSLSocket);
        if (jVarE != null) {
            jVarE.d(sSLSocket, str, protocols);
        }
    }

    public final synchronized j e(SSLSocket sSLSocket) {
        try {
            if (this.f37791b == null && this.f37790a.b(sSLSocket)) {
                this.f37791b = this.f37790a.c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f37791b;
    }
}
