package ea;

import U9.y;
import da.h;
import ea.i;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.l;
import org.conscrypt.Conscrypt;

/* compiled from: ConscryptSocketAdapter.kt */
/* loaded from: classes3.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public static final a f37789a = new a();

    /* compiled from: ConscryptSocketAdapter.kt */
    public static final class a implements i.a {
        @Override // ea.i.a
        public final boolean b(SSLSocket sSLSocket) {
            return da.d.f37586d && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // ea.i.a
        public final j c(SSLSocket sSLSocket) {
            return new h();
        }
    }

    @Override // ea.j
    public final boolean a() {
        boolean z10 = da.d.f37586d;
        return da.d.f37586d;
    }

    @Override // ea.j
    public final boolean b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // ea.j
    public final String c(SSLSocket sSLSocket) {
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // ea.j
    public final void d(SSLSocket sSLSocket, String str, List<? extends y> protocols) {
        l.f(protocols, "protocols");
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            da.h hVar = da.h.f37600a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) h.a.a(protocols).toArray(new String[0]));
        }
    }
}
