package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.hx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1289hx implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public ZA f14621a;

    /* renamed from: b, reason: collision with root package name */
    public AE f14622b;

    /* renamed from: c, reason: collision with root package name */
    public HttpURLConnection f14623c;

    public final HttpURLConnection a(AE ae) throws IOException {
        this.f14621a = new C1285ht(8, (byte) 0);
        this.f14622b = ae;
        ((Integer) this.f14621a.a()).getClass();
        AE ae2 = this.f14622b;
        ae2.getClass();
        Set set = C0471Dg.f7817f;
        W9 w9 = p2.j.f22785C.f22803q;
        int iIntValue = ((Integer) C2841s.f23267e.f23270c.a(H9.f8708a0)).intValue();
        URL url = new URL(ae2.f6968b);
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
            u2.h hVar = new u2.h();
            hVar.a(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            hVar.b(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                this.f14623c = httpURLConnection;
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
            u2.k.c("Redirecting to ".concat(headerField));
            httpURLConnection.disconnect();
            url = url2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f14623c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
