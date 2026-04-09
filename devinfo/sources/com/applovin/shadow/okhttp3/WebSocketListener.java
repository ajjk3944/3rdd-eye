package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okio.ByteString;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i4, String str) {
        k.e(webSocket, "webSocket");
        k.e(str, "reason");
    }

    public void onClosing(WebSocket webSocket, int i4, String str) {
        k.e(webSocket, "webSocket");
        k.e(str, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable th2, Response response) {
        k.e(webSocket, "webSocket");
        k.e(th2, "t");
    }

    public void onMessage(WebSocket webSocket, ByteString byteString) {
        k.e(webSocket, "webSocket");
        k.e(byteString, "bytes");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        k.e(webSocket, "webSocket");
        k.e(response, "response");
    }

    public void onMessage(WebSocket webSocket, String str) {
        k.e(webSocket, "webSocket");
        k.e(str, "text");
    }
}
