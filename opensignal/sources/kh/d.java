package kh;

import ch.n;
import java.net.HttpURLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public final class d extends c {
    @Override // kh.c, ih.i
    public final HttpURLConnection x() {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) super.x();
        if (httpsURLConnection != null) {
            try {
                httpsURLConnection.setSSLSocketFactory(new wh.f());
                n.b("CloudflareUploadProviderHttps", "TLS set.");
                return httpsURLConnection;
            } catch (KeyManagementException e4) {
                n.e("CloudflareUploadProviderHttps", e4);
            } catch (NoSuchAlgorithmException e10) {
                n.e("CloudflareUploadProviderHttps", e10);
            }
        }
        return httpsURLConnection;
    }
}
