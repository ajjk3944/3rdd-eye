package com.yandex.mobile.ads.impl;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class uu1 extends tz {

    /* renamed from: s, reason: collision with root package name */
    private final SSLSocketFactory f34225s;

    public uu1(String str, fh0 fh0Var, SSLSocketFactory sSLSocketFactory) {
        super(str, 8000, 8000, fh0Var);
        this.f34225s = sSLSocketFactory;
    }

    @Override // com.yandex.mobile.ads.impl.tz
    public final HttpURLConnection a(URL url) {
        kotlin.jvm.internal.l.f(url, "url");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        SSLSocketFactory sSLSocketFactory = this.f34225s;
        if (sSLSocketFactory != null && (httpURLConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        kotlin.jvm.internal.l.c(httpURLConnection);
        return httpURLConnection;
    }
}
