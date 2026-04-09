package id;

import Yg.s;
import Zg.AbstractC3682n;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.OkHttpClient;

/* renamed from: id.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6143b {

    /* renamed from: a, reason: collision with root package name */
    public static final C6143b f49144a = new C6143b();

    /* renamed from: id.b$a */
    public static final class a implements X509TrustManager {
        a() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] chain, String authType) {
            AbstractC6492s.i(chain, "chain");
            AbstractC6492s.i(authType, "authType");
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] chain, String authType) {
            AbstractC6492s.i(chain, "chain");
            AbstractC6492s.i(authType, "authType");
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    private C6143b() {
    }

    public final void a(OkHttpClient.Builder builder) throws NoSuchAlgorithmException, KeyManagementException {
        AbstractC6492s.i(builder, "builder");
        s sVarB = b();
        builder.P((SSLSocketFactory) sVarB.a(), (X509TrustManager) sVarB.c());
        builder.L(new C6142a());
    }

    public final s b() throws NoSuchAlgorithmException, KeyManagementException {
        TrustManager[] trustManagerArr = {new a()};
        SSLContext sSLContext = SSLContext.getInstance("SSL");
        sSLContext.init(null, trustManagerArr, new SecureRandom());
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        Object objZ = AbstractC3682n.Z(trustManagerArr);
        AbstractC6492s.g(objZ, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        return new s(socketFactory, (X509TrustManager) objZ);
    }
}
