package com.squareup.picasso;

import android.net.Uri;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a0 implements q {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f5868a;

    public a0(File file, long j) {
        OkHttpClient okHttpClientA = a();
        this.f5868a = okHttpClientA;
        try {
            okHttpClientA.setCache(new Cache(file, j));
        } catch (IOException unused) {
        }
    }

    public static OkHttpClient a() {
        OkHttpClient okHttpClient = new OkHttpClient();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        okHttpClient.setConnectTimeout(15000L, timeUnit);
        okHttpClient.setReadTimeout(20000L, timeUnit);
        okHttpClient.setWriteTimeout(20000L, timeUnit);
        return okHttpClient;
    }

    @Override // com.squareup.picasso.q
    public final o t(Uri uri, int i10) throws p {
        CacheControl cacheControlBuild;
        if (i10 == 0) {
            cacheControlBuild = null;
        } else if (x.isOfflineOnly(i10)) {
            cacheControlBuild = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!x.shouldReadFromDiskCache(i10)) {
                builder.noCache();
            }
            if (!x.shouldWriteToDiskCache(i10)) {
                builder.noStore();
            }
            cacheControlBuild = builder.build();
        }
        Request.Builder builderUrl = new Request.Builder().url(uri.toString());
        if (cacheControlBuild != null) {
            builderUrl.cacheControl(cacheControlBuild);
        }
        Response responseExecute = this.f5868a.newCall(builderUrl.build()).execute();
        int iCode = responseExecute.code();
        if (iCode < 300) {
            boolean z10 = responseExecute.cacheResponse() != null;
            ResponseBody responseBodyBody = responseExecute.body();
            return new o(responseBodyBody.byteStream(), z10, responseBodyBody.contentLength());
        }
        responseExecute.body().close();
        throw new p(iCode + " " + responseExecute.message(), i10, iCode);
    }
}
