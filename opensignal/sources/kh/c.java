package kh;

import br.l;
import ch.n;
import com.survicate.surveys.infrastructure.network.URLRequest;
import ih.i;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final dh.b f14438a;

    /* renamed from: d, reason: collision with root package name */
    public final URL f14439d;

    public c(dh.b bVar) {
        URL url;
        this.f14438a = bVar;
        try {
            url = new URL(bVar.f7344b);
        } catch (MalformedURLException e4) {
            n.e("CloudflareUploadProviderHttp", e4);
            url = null;
        }
        this.f14439d = url;
    }

    @Override // ih.i
    public final String r() {
        String str = this.f14438a.f7343a;
        l.d(str, "getName(...)");
        return str;
    }

    @Override // ih.i
    public final String s() {
        String str = this.f14438a.f7344b;
        l.d(str, "getUrl(...)");
        return str;
    }

    @Override // ih.i
    public HttpURLConnection x() throws ProtocolException {
        try {
            URL url = this.f14439d;
            URLConnection uRLConnectionOpenConnection = url != null ? url.openConnection() : null;
            l.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            n.b("CloudflareUploadProviderHttp", "Connection opened. Setting request properties...");
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setRequestMethod(URLRequest.METHOD_POST);
            httpURLConnection.setRequestProperty("Accept", "text/xml,application/xml,application/xhtml+xml,text/html;q=0.9,text/plain;q=0.8,image/png,*/*;q=0.5");
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestProperty("Accept-Charset", "ISO-8859-1,utf-8;q=0.7,*; q=0.7");
            httpURLConnection.setRequestProperty("Connection", "close");
            httpURLConnection.setRequestProperty("Keep-Alive", "300");
            return httpURLConnection;
        } catch (MalformedURLException e4) {
            n.d("CloudflareUploadProviderHttp", "URL incorrect!", e4);
            return null;
        } catch (ProtocolException e10) {
            n.d("CloudflareUploadProviderHttp", "Method not supported by this HTTP connection!", e10);
            return null;
        } catch (IOException e11) {
            n.e("CloudflareUploadProviderHttp", e11);
            return null;
        }
    }
}
