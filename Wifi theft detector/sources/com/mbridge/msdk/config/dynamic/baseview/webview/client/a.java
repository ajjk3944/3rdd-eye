package com.mbridge.msdk.config.dynamic.baseview.webview.client;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public class a extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private final String f13994a = "MBWebChromeClient";

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.webview.listener.a f13995b;

    public void a(com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar) {
        this.f13995b = aVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.f13995b;
        if (aVar != null) {
            aVar.onProgressChanged(webView, i10);
        }
    }
}
