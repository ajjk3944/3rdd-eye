package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d8.l f6532a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6533b;

    /* renamed from: c, reason: collision with root package name */
    public HttpURLConnection f6534c;

    /* renamed from: d, reason: collision with root package name */
    public InputStream f6535d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f6536e;

    public k(d8.l lVar, int i4) {
        this.f6532a = lVar;
        this.f6533b = i4;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e2) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e2);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() throws IOException {
        InputStream inputStream = this.f6535d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f6534c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f6534c = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f6536e = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return 2;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.i iVar, c cVar) {
        d8.l lVar = this.f6532a;
        int i4 = t8.h.f34512b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                cVar.f(f(lVar.d(), 0, null, lVar.f22028b.a()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + t8.h.a(jElapsedRealtimeNanos));
                }
            } catch (IOException e2) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e2);
                }
                cVar.c(e2);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + t8.h.a(jElapsedRealtimeNanos));
                }
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + t8.h.a(jElapsedRealtimeNanos));
            }
            throw th2;
        }
    }

    public final InputStream f(URL url, int i4, URL url2, Map map) throws IOException {
        if (i4 >= 5) {
            throw new androidx.datastore.preferences.protobuf.l(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new androidx.datastore.preferences.protobuf.l(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i10 = this.f6533b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i10);
            httpURLConnection.setReadTimeout(i10);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f6534c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f6535d = this.f6534c.getInputStream();
                if (this.f6536e) {
                    return null;
                }
                int iC = c(this.f6534c);
                int i11 = iC / 100;
                if (i11 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f6534c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f6535d = new t8.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f6535d = httpURLConnection2.getInputStream();
                        }
                        return this.f6535d;
                    } catch (IOException e2) {
                        throw new androidx.datastore.preferences.protobuf.l(c(httpURLConnection2), e2, "Failed to obtain InputStream");
                    }
                }
                if (i11 != 3) {
                    if (iC == -1) {
                        throw new androidx.datastore.preferences.protobuf.l(iC, null, "Http request failed");
                    }
                    try {
                        throw new androidx.datastore.preferences.protobuf.l(iC, null, this.f6534c.getResponseMessage());
                    } catch (IOException e10) {
                        throw new androidx.datastore.preferences.protobuf.l(iC, e10, "Failed to get a response message");
                    }
                }
                String headerField = this.f6534c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new androidx.datastore.preferences.protobuf.l(iC, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return f(url3, i4 + 1, url, map);
                } catch (MalformedURLException e11) {
                    throw new androidx.datastore.preferences.protobuf.l(iC, e11, u.t("Bad redirect url: ", headerField));
                }
            } catch (IOException e12) {
                throw new androidx.datastore.preferences.protobuf.l(c(this.f6534c), e12, "Failed to connect or obtain data");
            }
        } catch (IOException e13) {
            throw new androidx.datastore.preferences.protobuf.l(0, e13, "URL.openConnection threw");
        }
    }
}
