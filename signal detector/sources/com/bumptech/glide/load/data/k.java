package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.EK;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public final class k implements d {

    /* renamed from: a, reason: collision with root package name */
    public final r1.h f6554a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6555b;

    /* renamed from: c, reason: collision with root package name */
    public HttpURLConnection f6556c;

    /* renamed from: d, reason: collision with root package name */
    public InputStream f6557d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f6558e;

    public k(r1.h hVar, int i) {
        this.f6554a = hVar;
        this.f6555b = i;
    }

    public static int d(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e6) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e6);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() throws IOException {
        InputStream inputStream = this.f6557d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f6556c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f6556c = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int c() {
        return 2;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f6558e = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, c cVar) {
        r1.h hVar2 = this.f6554a;
        int i = H1.j.f1768b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                cVar.f(f(hVar2.d(), 0, null, hVar2.f23348b.a()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + H1.j.a(jElapsedRealtimeNanos));
                }
            } catch (IOException e6) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e6);
                }
                cVar.d(e6);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + H1.j.a(jElapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + H1.j.a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }

    public final InputStream f(URL url, int i, URL url2, Map map) throws IOException {
        if (i >= 5) {
            throw new EK(-1, (IOException) null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new EK(-1, (IOException) null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i3 = this.f6555b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i3);
            httpURLConnection.setReadTimeout(i3);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f6556c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f6557d = this.f6556c.getInputStream();
                if (this.f6558e) {
                    return null;
                }
                int iD = d(this.f6556c);
                int i6 = iD / 100;
                if (i6 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f6556c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f6557d = new H1.d(httpURLConnection2.getContentLength(), httpURLConnection2.getInputStream());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f6557d = httpURLConnection2.getInputStream();
                        }
                        return this.f6557d;
                    } catch (IOException e6) {
                        throw new EK(d(httpURLConnection2), e6, "Failed to obtain InputStream");
                    }
                }
                if (i6 != 3) {
                    if (iD == -1) {
                        throw new EK(iD, (IOException) null, "Http request failed");
                    }
                    try {
                        throw new EK(iD, (IOException) null, this.f6556c.getResponseMessage());
                    } catch (IOException e7) {
                        throw new EK(iD, e7, "Failed to get a response message");
                    }
                }
                String headerField = this.f6556c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new EK(iD, (IOException) null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return f(url3, i + 1, url, map);
                } catch (MalformedURLException e8) {
                    throw new EK(iD, e8, A.f.l("Bad redirect url: ", headerField));
                }
            } catch (IOException e9) {
                throw new EK(d(this.f6556c), e9, "Failed to connect or obtain data");
            }
        } catch (IOException e10) {
            throw new EK(0, e10, "URL.openConnection threw");
        }
    }
}
