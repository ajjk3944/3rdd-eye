package da;

import U9.y;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.l;
import org.openjsse.net.ssl.OpenJSSE;

/* compiled from: OpenJSSEPlatform.kt */
/* loaded from: classes3.dex */
public final class g extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f37598d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f37599c = new OpenJSSE();

    /* compiled from: OpenJSSEPlatform.kt */
    public static final class a {
    }

    static {
        boolean z10 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, a.class.getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f37598d = z10;
    }

    @Override // da.h
    public final void d(SSLSocket sSLSocket, String str, List<y> protocols) {
        l.f(protocols, "protocols");
    }

    @Override // da.h
    public final String f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // da.h
    public final SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f37599c);
        l.e(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // da.h
    public final X509TrustManager n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f37599c);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        l.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                l.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        l.e(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }
}
