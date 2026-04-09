package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lw0 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public l31 f13649a;

    /* renamed from: b, reason: collision with root package name */
    public ka1 f13650b;

    /* renamed from: c, reason: collision with root package name */
    public HttpURLConnection f13651c;

    public final HttpURLConnection c(ka1 ka1Var) throws IOException {
        this.f13649a = new tk0((byte) 0, 15);
        this.f13650b = ka1Var;
        ((Integer) this.f13649a.b()).getClass();
        ka1 ka1Var2 = this.f13650b;
        ka1Var2.getClass();
        Set set = vy.f17757f;
        hl hlVar = ua.j.C.f35273q;
        int iIntValue = ((Integer) va.s.f36163e.f36166c.a(sk.f16034a0)).intValue();
        URL url = new URL(ka1Var2.f13113b);
        int i4 = 0;
        while (true) {
            i4++;
            if (i4 > 20) {
                throw new IOException("Too many redirects (20)");
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
            uRLConnectionOpenConnection.setReadTimeout(iIntValue);
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Invalid protocol.");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            za.f fVar = new za.f();
            fVar.a(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            fVar.b(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                this.f13651c = httpURLConnection;
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
            za.i.c("Redirecting to ".concat(headerField));
            httpURLConnection.disconnect();
            url = url2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f13651c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
