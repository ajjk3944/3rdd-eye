package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.ResponseBody;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class d4 implements g2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f3930a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f3931b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f3932c = new AtomicReference();

    public d4(com.applovin.impl.sdk.k kVar) {
        this.f3930a = kVar;
        this.f3931b = kVar.O();
    }

    private OkHttpClient a() {
        Object objBuild = this.f3932c.get();
        if (objBuild == null) {
            synchronized (this.f3932c) {
                try {
                    objBuild = this.f3932c.get();
                    if (objBuild == null) {
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        long jIntValue = ((Integer) this.f3930a.a(x4.T2)).intValue();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        objBuild = builder.connectTimeout(jIntValue, timeUnit).readTimeout(((Integer) this.f3930a.a(x4.U2)).intValue(), timeUnit).followRedirects(true).followSslRedirects(true).build();
                        if (objBuild == null) {
                            objBuild = this.f3932c;
                        }
                        this.f3932c.set(objBuild);
                    }
                } finally {
                }
            }
        }
        if (objBuild == this.f3932c) {
            objBuild = null;
        }
        return (OkHttpClient) objBuild;
    }

    @Override // com.applovin.impl.g2
    public InputStream a(String str, Map map) throws IOException {
        Response responseExecute = a().newCall(new Request.Builder().url(str).get().build()).execute();
        int iCode = responseExecute.code();
        this.f3930a.D().a("loadResource", str, iCode, responseExecute.message());
        if (r0.a(iCode)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            a0.g.x("Opened stream to resource ", str, this.f3931b, "OkHttpLoader");
        }
        ResponseBody responseBodyBody = responseExecute.body();
        if (responseBodyBody == null) {
            return null;
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "OkHttpLoader", mapHashMap);
        CollectionUtils.putStringIfValid("details", responseExecute.protocol().name(), mapHashMap);
        this.f3930a.g().d(d2.Q, mapHashMap);
        return responseBodyBody.byteStream();
    }
}
