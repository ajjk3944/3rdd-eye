package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class r01 extends hk {

    /* renamed from: a, reason: collision with root package name */
    private final nn1 f32394a;

    /* renamed from: b, reason: collision with root package name */
    private final oc1 f32395b;

    /* renamed from: c, reason: collision with root package name */
    private final nh0 f32396c;

    /* renamed from: d, reason: collision with root package name */
    private final hk f32397d;

    public r01(Context context, SSLSocketFactory sSLSocketFactory, nn1 readyHttpResponseCreator, oc1 networkResponseCreator, nh0 httpResponseContentReader, vh0 hurlStackFactory) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(readyHttpResponseCreator, "readyHttpResponseCreator");
        kotlin.jvm.internal.l.f(networkResponseCreator, "networkResponseCreator");
        kotlin.jvm.internal.l.f(httpResponseContentReader, "httpResponseContentReader");
        kotlin.jvm.internal.l.f(hurlStackFactory, "hurlStackFactory");
        this.f32394a = readyHttpResponseCreator;
        this.f32395b = networkResponseCreator;
        this.f32396c = httpResponseContentReader;
        this.f32397d = vh0.a(context, sSLSocketFactory);
    }

    private final mh0 b(op1<?> op1Var, Map<String, String> map) throws IOException, th {
        nc1 nc1VarA = this.f32395b.a(op1Var);
        if (nc1VarA == null) {
            mh0 mh0VarA = this.f32397d.a(op1Var, map);
            kotlin.jvm.internal.l.c(mh0VarA);
            return mh0VarA;
        }
        this.f32394a.getClass();
        ArrayList arrayList = new ArrayList();
        Map<String, String> map2 = nc1VarA.f30837c;
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                arrayList.add(new ef0(entry.getKey(), entry.getValue()));
            }
        }
        return new mh0(nc1VarA.f30835a, arrayList, nc1VarA.f30836b);
    }

    @Override // com.yandex.mobile.ads.impl.hk
    public final mh0 a(op1<?> request, Map<String, String> additionalHeaders) throws IOException, th {
        byte[] bArrU;
        InputStream inputStreamA;
        kotlin.jvm.internal.l.f(request, "request");
        kotlin.jvm.internal.l.f(additionalHeaders, "additionalHeaders");
        if (!a11.f24364a.a()) {
            return b(request, additionalHeaders);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        mh0 response = b(request, additionalHeaders);
        this.f32396c.getClass();
        kotlin.jvm.internal.l.f(response, "response");
        try {
            inputStreamA = response.a();
        } catch (Exception unused) {
        }
        if (inputStreamA != null) {
            try {
                bArrU = com.google.gson.internal.c.u(inputStreamA);
                inputStreamA.close();
            } finally {
            }
        } else {
            bArrU = null;
        }
        mh0 mh0Var = new mh0(response.e(), response.d(), bArrU);
        zp1.a(System.currentTimeMillis(), request, new nc1(mh0Var.e(), mh0Var.b(), true, System.currentTimeMillis() - jCurrentTimeMillis, mh0Var.d()));
        return mh0Var;
    }
}
