package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.s;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: HttpUrlFetcher.java */
/* loaded from: classes.dex */
public final class j implements d<InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public final R2.i f22309b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22310c;

    /* renamed from: d, reason: collision with root package name */
    public HttpURLConnection f22311d;

    /* renamed from: e, reason: collision with root package name */
    public InputStream f22312e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f22313f;

    /* compiled from: HttpUrlFetcher.java */
    public static class a {
    }

    public j(R2.i iVar, int i) {
        this.f22309b = iVar;
        this.f22310c = i;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e4) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e4);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() throws IOException {
        InputStream inputStream = this.f22312e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f22311d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f22311d = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f22313f = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public final L2.a d() {
        return L2.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, d.a<? super InputStream> aVar) {
        R2.i iVar = this.f22309b;
        int i = h3.h.f38207b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                aVar.f(f(iVar.d(), 0, null, iVar.f11666b.b()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + h3.h.a(jElapsedRealtimeNanos));
                }
            } catch (IOException e4) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e4);
                }
                aVar.c(e4);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + h3.h.a(jElapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + h3.h.a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }

    public final InputStream f(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        if (i >= 5) {
            throw new L2.e("Too many (> 5) redirects!", null, -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new L2.e("In re-direct loop", null, -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            int i10 = this.f22310c;
            httpURLConnection.setConnectTimeout(i10);
            httpURLConnection.setReadTimeout(i10);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f22311d = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f22312e = this.f22311d.getInputStream();
                if (this.f22313f) {
                    return null;
                }
                int iC = c(this.f22311d);
                int i11 = iC / 100;
                if (i11 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f22311d;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f22312e = new h3.c(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f22312e = httpURLConnection2.getInputStream();
                        }
                        return this.f22312e;
                    } catch (IOException e4) {
                        throw new L2.e("Failed to obtain InputStream", e4, c(httpURLConnection2));
                    }
                }
                if (i11 != 3) {
                    if (iC == -1) {
                        throw new L2.e("Http request failed", null, iC);
                    }
                    try {
                        throw new L2.e(this.f22311d.getResponseMessage(), null, iC);
                    } catch (IOException e10) {
                        throw new L2.e("Failed to get a response message", e10, iC);
                    }
                }
                String headerField = this.f22311d.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new L2.e("Received empty or null redirect url", null, iC);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return f(url3, i + 1, url, map);
                } catch (MalformedURLException e11) {
                    throw new L2.e(s.d("Bad redirect url: ", headerField), e11, iC);
                }
            } catch (IOException e12) {
                throw new L2.e("Failed to connect or obtain data", e12, c(this.f22311d));
            }
        } catch (IOException e13) {
            throw new L2.e("URL.openConnection threw", e13, 0);
        }
    }
}
