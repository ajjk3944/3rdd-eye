package kh;

import ch.n;
import java.net.HttpURLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public final class f extends e {
    @Override // kh.e, ih.i
    public final HttpURLConnection x() {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) super.x();
        try {
            httpsURLConnection.setSSLSocketFactory(new wh.f());
            return httpsURLConnection;
        } catch (KeyManagementException | NoSuchAlgorithmException e4) {
            n.e("CloudfrontUploadHttps", e4);
            return httpsURLConnection;
        }
    }
}
