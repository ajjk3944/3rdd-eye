package com.applovin.shadow.okhttp3.internal;

import com.applovin.shadow.okhttp3.Cache;
import com.applovin.shadow.okhttp3.ConnectionSpec;
import com.applovin.shadow.okhttp3.Cookie;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import javax.net.ssl.SSLSocket;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str) {
        k.e(builder, "builder");
        k.e(str, "line");
        return builder.addLenient$okhttp(str);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z3) {
        k.e(connectionSpec, "connectionSpec");
        k.e(sSLSocket, "sslSocket");
        connectionSpec.apply$okhttp(sSLSocket, z3);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        k.e(cache, "cache");
        k.e(request, "request");
        return cache.get$okhttp(request);
    }

    public static final String cookieToString(Cookie cookie, boolean z3) {
        k.e(cookie, "cookie");
        return cookie.toString$okhttp(z3);
    }

    public static final Cookie parseCookie(long j, HttpUrl httpUrl, String str) {
        k.e(httpUrl, "url");
        k.e(str, "setCookie");
        return Cookie.Companion.parse$okhttp(j, httpUrl, str);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str, String str2) {
        k.e(builder, "builder");
        k.e(str, "name");
        k.e(str2, "value");
        return builder.addLenient$okhttp(str, str2);
    }
}
