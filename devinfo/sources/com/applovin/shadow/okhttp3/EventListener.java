package com.applovin.shadow.okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import nk.f;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener() { // from class: com.applovin.shadow.okhttp3.EventListener$Companion$NONE$1
    };

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response response) {
        k.e(call, "call");
        k.e(response, "cachedResponse");
    }

    public void cacheHit(Call call, Response response) {
        k.e(call, "call");
        k.e(response, "response");
    }

    public void cacheMiss(Call call) {
        k.e(call, "call");
    }

    public void callEnd(Call call) {
        k.e(call, "call");
    }

    public void callFailed(Call call, IOException iOException) {
        k.e(call, "call");
        k.e(iOException, "ioe");
    }

    public void callStart(Call call) {
        k.e(call, "call");
    }

    public void canceled(Call call) {
        k.e(call, "call");
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        k.e(call, "call");
        k.e(inetSocketAddress, "inetSocketAddress");
        k.e(proxy, "proxy");
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        k.e(call, "call");
        k.e(inetSocketAddress, "inetSocketAddress");
        k.e(proxy, "proxy");
        k.e(iOException, "ioe");
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        k.e(call, "call");
        k.e(inetSocketAddress, "inetSocketAddress");
        k.e(proxy, "proxy");
    }

    public void connectionAcquired(Call call, Connection connection) {
        k.e(call, "call");
        k.e(connection, "connection");
    }

    public void connectionReleased(Call call, Connection connection) {
        k.e(call, "call");
        k.e(connection, "connection");
    }

    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        k.e(call, "call");
        k.e(str, "domainName");
        k.e(list, "inetAddressList");
    }

    public void dnsStart(Call call, String str) {
        k.e(call, "call");
        k.e(str, "domainName");
    }

    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<Proxy> list) {
        k.e(call, "call");
        k.e(httpUrl, "url");
        k.e(list, "proxies");
    }

    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        k.e(call, "call");
        k.e(httpUrl, "url");
    }

    public void requestBodyEnd(Call call, long j) {
        k.e(call, "call");
    }

    public void requestBodyStart(Call call) {
        k.e(call, "call");
    }

    public void requestFailed(Call call, IOException iOException) {
        k.e(call, "call");
        k.e(iOException, "ioe");
    }

    public void requestHeadersEnd(Call call, Request request) {
        k.e(call, "call");
        k.e(request, "request");
    }

    public void requestHeadersStart(Call call) {
        k.e(call, "call");
    }

    public void responseBodyEnd(Call call, long j) {
        k.e(call, "call");
    }

    public void responseBodyStart(Call call) {
        k.e(call, "call");
    }

    public void responseFailed(Call call, IOException iOException) {
        k.e(call, "call");
        k.e(iOException, "ioe");
    }

    public void responseHeadersEnd(Call call, Response response) {
        k.e(call, "call");
        k.e(response, "response");
    }

    public void responseHeadersStart(Call call) {
        k.e(call, "call");
    }

    public void satisfactionFailure(Call call, Response response) {
        k.e(call, "call");
        k.e(response, "response");
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        k.e(call, "call");
    }

    public void secureConnectStart(Call call) {
        k.e(call, "call");
    }
}
