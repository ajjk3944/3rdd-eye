package jh;

import ch.n;
import java.net.HttpURLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import wh.f;

/* loaded from: classes.dex */
public final class a extends i4.b {
    @Override // i4.b, ih.i
    public final HttpURLConnection x() {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) super.x();
        try {
            httpsURLConnection.setSSLSocketFactory(new f());
            return httpsURLConnection;
        } catch (NullPointerException | KeyManagementException | NoSuchAlgorithmException e4) {
            n.e("DownloadProviderHttps", e4);
            return httpsURLConnection;
        }
    }
}
