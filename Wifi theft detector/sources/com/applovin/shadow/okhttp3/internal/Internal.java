package com.applovin.shadow.okhttp3.internal;

import com.applovin.shadow.okhttp3.Cache;
import com.applovin.shadow.okhttp3.ConnectionSpec;
import com.applovin.shadow.okhttp3.Cookie;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.vungle.ads.internal.ui.AdActivity;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0015\u001a\u001f\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\n¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"", "currentTimeMillis", "Lcom/applovin/shadow/okhttp3/HttpUrl;", "url", "", "setCookie", "Lcom/applovin/shadow/okhttp3/Cookie;", "parseCookie", "(JLcom/applovin/shadow/okhttp3/HttpUrl;Ljava/lang/String;)Lcom/applovin/shadow/okhttp3/Cookie;", "cookie", "", "forObsoleteRfc2965", "cookieToString", "(Lcom/applovin/shadow/okhttp3/Cookie;Z)Ljava/lang/String;", "Lcom/applovin/shadow/okhttp3/Headers$Builder;", "builder", "line", "addHeaderLenient", "(Lcom/applovin/shadow/okhttp3/Headers$Builder;Ljava/lang/String;)Lcom/applovin/shadow/okhttp3/Headers$Builder;", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Lcom/applovin/shadow/okhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)Lcom/applovin/shadow/okhttp3/Headers$Builder;", "Lcom/applovin/shadow/okhttp3/Cache;", "cache", "Lcom/applovin/shadow/okhttp3/Request;", AdActivity.REQUEST_KEY_EXTRA, "Lcom/applovin/shadow/okhttp3/Response;", "cacheGet", "(Lcom/applovin/shadow/okhttp3/Cache;Lcom/applovin/shadow/okhttp3/Request;)Lcom/applovin/shadow/okhttp3/Response;", "Lcom/applovin/shadow/okhttp3/ConnectionSpec;", "connectionSpec", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "Ly8/s;", "applyConnectionSpec", "(Lcom/applovin/shadow/okhttp3/ConnectionSpec;Ljavax/net/ssl/SSLSocket;Z)V", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "Internal")
/* loaded from: classes.dex */
public final class Internal {
    @NotNull
    public static final Headers.Builder addHeaderLenient(@NotNull Headers.Builder builder, @NotNull String line) {
        p.e(builder, "builder");
        p.e(line, "line");
        return builder.addLenient$okhttp(line);
    }

    public static final void applyConnectionSpec(@NotNull ConnectionSpec connectionSpec, @NotNull SSLSocket sslSocket, boolean z10) {
        p.e(connectionSpec, "connectionSpec");
        p.e(sslSocket, "sslSocket");
        connectionSpec.apply$okhttp(sslSocket, z10);
    }

    @Nullable
    public static final Response cacheGet(@NotNull Cache cache, @NotNull Request request) {
        p.e(cache, "cache");
        p.e(request, "request");
        return cache.get$okhttp(request);
    }

    @NotNull
    public static final String cookieToString(@NotNull Cookie cookie, boolean z10) {
        p.e(cookie, "cookie");
        return cookie.toString$okhttp(z10);
    }

    @Nullable
    public static final Cookie parseCookie(long j10, @NotNull HttpUrl url, @NotNull String setCookie) {
        p.e(url, "url");
        p.e(setCookie, "setCookie");
        return Cookie.INSTANCE.parse$okhttp(j10, url, setCookie);
    }

    @NotNull
    public static final Headers.Builder addHeaderLenient(@NotNull Headers.Builder builder, @NotNull String name, @NotNull String value) {
        p.e(builder, "builder");
        p.e(name, "name");
        p.e(value, "value");
        return builder.addLenient$okhttp(name, value);
    }
}
