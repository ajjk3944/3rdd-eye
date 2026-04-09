package kh;

import ch.n;
import com.survicate.surveys.infrastructure.network.URLRequest;
import ih.i;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Random;

/* loaded from: classes.dex */
public class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f14440a;

    /* renamed from: d, reason: collision with root package name */
    public final String f14441d;

    /* renamed from: g, reason: collision with root package name */
    public final dh.b f14442g;

    /* renamed from: r, reason: collision with root package name */
    public final URL f14443r;

    public e(dh.b bVar) {
        this.f14442g = bVar;
        try {
            this.f14443r = new URL(bVar.f7344b);
        } catch (MalformedURLException e4) {
            n.e("CloudfrontUploadHttp", e4);
        }
        n.b("CloudfrontUploadHttp", "HTTP upload to: " + this.f14442g.f7343a);
        int iNextInt = new Random().nextInt(500000);
        String strM = h0.b.m("ul", iNextInt, ".jpg");
        HashMap map = new HashMap();
        map.put("Content-Type", "image/jpeg");
        map.put("Filename", strM);
        map.put("key", "images/" + iNextInt + ".jpg");
        map.put("x-amz-acl", "public-read");
        map.put("success_action_status", "201");
        StringBuilder sb2 = new StringBuilder();
        for (String str : map.keySet()) {
            w.g.q(sb2, "-------------------------******\r\nContent-Disposition: form-data; name=\"", str, "\"\r\n\r\n", (String) map.get(str));
            sb2.append("\r\n");
        }
        this.f14440a = h0.b.s(sb2, "-------------------------******\r\nContent-Disposition: form-data; name=\"file\"; filename=\"", strM, "\"\r\nContent-Type: image/jpeg\r\n\r\n");
        this.f14441d = "\r\n-------------------------******--\r\n";
    }

    @Override // ih.i
    public final String r() {
        return this.f14442g.f7343a;
    }

    @Override // ih.i
    public final String s() {
        return this.f14442g.f7344b;
    }

    @Override // ih.i
    public HttpURLConnection x() throws ProtocolException {
        HttpURLConnection httpURLConnection;
        IOException e4;
        ProtocolException e10;
        MalformedURLException e11;
        try {
            httpURLConnection = (HttpURLConnection) this.f14443r.openConnection();
        } catch (MalformedURLException e12) {
            httpURLConnection = null;
            e11 = e12;
        } catch (ProtocolException e13) {
            httpURLConnection = null;
            e10 = e13;
        } catch (IOException e14) {
            httpURLConnection = null;
            e4 = e14;
        }
        try {
            httpURLConnection.setConnectTimeout(2000);
            httpURLConnection.setReadTimeout(1000);
            httpURLConnection.setRequestMethod(URLRequest.METHOD_POST);
            httpURLConnection.setRequestProperty("Accept", "text/xml,application/xml,application/xhtml+xml,text/html;q=0.9,text/plain;q=0.8,image/png,*/*;q=0.5");
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestProperty("Accept-Charset", "ISO-8859-1,utf-8;q=0.7,*; q=0.7");
            httpURLConnection.setRequestProperty("Connection", "close");
            httpURLConnection.setRequestProperty("Keep-Alive", "300");
            httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=-----------------------******");
            return httpURLConnection;
        } catch (MalformedURLException e15) {
            e11 = e15;
            n.d("CloudfrontUploadHttp", "URL incorrect!", e11);
            return httpURLConnection;
        } catch (ProtocolException e16) {
            e10 = e16;
            n.d("CloudfrontUploadHttp", "Method not supported by this HTTP connection!", e10);
            return httpURLConnection;
        } catch (IOException e17) {
            e4 = e17;
            n.e("CloudfrontUploadHttp", e4);
            return httpURLConnection;
        }
    }
}
