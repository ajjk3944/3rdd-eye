package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class me3 implements Closeable {
    public ll3 f;
    public ls3 g;
    public HttpURLConnection h;

    public final HttpURLConnection a(ls3 ls3Var) throws IOException {
        this.f = new su2(11);
        this.g = ls3Var;
        ((Integer) this.f.a()).getClass();
        ls3 ls3Var2 = this.g;
        ls3Var2.getClass();
        Set set = gf2.k;
        qd2 qd2Var = hg4.C.q;
        int iIntValue = ((Integer) tw1.e.c.a(mz1.L)).intValue();
        URL url = new URL(ls3Var2.b);
        int i = 0;
        while (true) {
            i++;
            if (i > 20) {
                throw new IOException("Too many redirects (20)");
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
            uRLConnectionOpenConnection.setReadTimeout(iIntValue);
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Invalid protocol.");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            wb4 wb4Var = new wb4();
            wb4Var.a(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            wb4Var.b(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                this.h = httpURLConnection;
                return httpURLConnection;
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                throw new IOException("Missing Location header in redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (protocol == null) {
                throw new IOException("Protocol is null");
            }
            if (!protocol.equals("http") && !protocol.equals("https")) {
                throw new IOException("Unsupported scheme: ".concat(protocol));
            }
            gi2.U("Redirecting to ".concat(headerField));
            httpURLConnection.disconnect();
            url = url2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
