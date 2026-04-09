package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f5480a;

    /* renamed from: b, reason: collision with root package name */
    private final WebViewRenderProcessClient f5481b = new a();

    public class a extends WebViewRenderProcessClient {
        public a() {
        }

        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof b) {
                com.applovin.impl.sdk.ad.b currentAd = ((b) webView).getCurrentAd();
                d.this.f5480a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    d.this.f5480a.O().b("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    }

    public d(com.applovin.impl.sdk.k kVar) {
        this.f5480a = kVar;
    }

    public WebViewRenderProcessClient a() {
        return this.f5481b;
    }
}
