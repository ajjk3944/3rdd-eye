package kh;

import ch.n;
import java.net.HttpURLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public final class b extends a {
    @Override // kh.a, ih.i
    public final HttpURLConnection x() {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) super.x();
        try {
            httpsURLConnection.setSSLSocketFactory(new wh.f());
            return httpsURLConnection;
        } catch (KeyManagementException e4) {
            n.e("AkamaiUploadProviderHttps", e4);
            return httpsURLConnection;
        } catch (NoSuchAlgorithmException e10) {
            n.e("AkamaiUploadProviderHttps", e10);
            return httpsURLConnection;
        }
    }
}
