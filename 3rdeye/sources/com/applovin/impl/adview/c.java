package com.applovin.impl.adview;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.a2;
import com.applovin.impl.a7;
import com.applovin.impl.b7;
import com.applovin.impl.e7;
import com.applovin.impl.h4;
import com.applovin.impl.l4;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.y1;
import com.applovin.sdk.AppLovinAdSize;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c extends h4 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f19032a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f19033b;

    /* renamed from: c, reason: collision with root package name */
    private final a f19034c;

    public c(a aVar, com.applovin.impl.sdk.k kVar) {
        this.f19032a = kVar;
        this.f19033b = kVar.O();
        this.f19034c = aVar;
    }

    private void b() {
        this.f19034c.z();
    }

    private void c() {
        this.f19034c.a();
    }

    @Override // com.applovin.impl.h4
    public Map a() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap(AppMeasurementSdk.ConditionalUserProperty.NAME, "AdWebViewClient");
        mapHashMap.putAll(a2.a((AppLovinAdImpl) this.f19034c.g()));
        return mapHashMap;
    }

    public a d() {
        return this.f19034c;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (com.applovin.impl.sdk.o.a()) {
            this.f19033b.d("AdWebView", "Loaded resource: " + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (com.applovin.impl.sdk.o.a()) {
            this.f19033b.d("AdWebView", "Loaded URL: " + str);
        }
        this.f19034c.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        com.applovin.impl.sdk.ad.b bVarG = this.f19034c.g();
        if (com.applovin.impl.sdk.o.a()) {
            this.f19033b.b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + bVarG);
        }
        if (a7.a(webResourceRequest.getUrl().toString(), this.f19032a)) {
            this.f19032a.E().a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.applovin.impl.sdk.ad.b bVarG = this.f19034c.g();
        String str = "Received SSL error: " + sslError;
        if (com.applovin.impl.sdk.o.a()) {
            this.f19033b.b("AdWebView", str + " for ad: " + bVarG);
        }
    }

    @Override // com.applovin.impl.h4, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        com.applovin.impl.sdk.ad.b bVarG = this.f19034c.g();
        com.applovin.impl.sdk.o.h("AdWebView", "Render process gone for ad: " + bVarG + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        boolean zOnRenderProcessGone = super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (((Boolean) this.f19032a.a(l4.f20008q5)).booleanValue()) {
            a(webView, renderProcessGoneDetail, bVarG);
        }
        return zOnRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString());
        }
        if (!com.applovin.impl.sdk.o.a()) {
            return false;
        }
        this.f19033b.b("AdWebView", "No url found for request");
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        com.applovin.impl.sdk.ad.b bVarG = this.f19034c.g();
        String str3 = "Received error with error code: " + i + " with description \\'" + str + "\\' for URL: " + str2;
        if (com.applovin.impl.sdk.o.a()) {
            this.f19033b.b("AdWebView", str3 + " for ad: " + bVarG);
        }
        if (a7.a(str2, this.f19032a)) {
            this.f19032a.E().a("adWebViewReceivedError", str2, i, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.webkit.WebView r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.c.a(android.webkit.WebView, java.lang.String):boolean");
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str);
    }

    private void a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, com.applovin.impl.sdk.ad.b bVar) {
        if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f19032a.a(l4.f20056w5)).booleanValue()) {
            throw new RuntimeException(androidx.work.s.d("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: ", bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null"));
        }
        if (webView == null || !webView.equals(this.f19034c.f())) {
            return;
        }
        this.f19034c.b();
        AppLovinAdSize appLovinAdSizeK = this.f19034c.k();
        if (a7.a(appLovinAdSizeK)) {
            this.f19034c.a(appLovinAdSizeK);
            this.f19034c.F();
        }
    }

    private boolean a(boolean z10, com.applovin.impl.sdk.ad.b bVar, Uri uri) {
        if (z10) {
            return false;
        }
        boolean zH1 = bVar.h1();
        a(uri, zH1, bVar, this.f19032a);
        return zH1;
    }

    private static void a(Uri uri, boolean z10, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        if (kVar.c(l4.f19985n6).contains(uri.getScheme())) {
            return;
        }
        kVar.E().d(y1.f21812p0, a(bVar, uri, z10));
    }

    private static Map a(com.applovin.impl.sdk.ad.b bVar, Uri uri, boolean z10) {
        Map mapA = a2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid(ImagesContract.URL, uri.toString(), mapA);
        CollectionUtils.putStringIfValid("is_blocked_auto_redirect", String.valueOf(z10), mapA);
        return mapA;
    }

    private void a(MotionEvent motionEvent) {
        this.f19034c.a(motionEvent);
    }

    private void a(b7 b7Var, b bVar) {
        a(b7Var, bVar, (Bundle) null);
    }

    private void a(b7 b7Var, b bVar, Bundle bundle) {
        e7 e7VarO1 = b7Var.o1();
        if (e7VarO1 != null) {
            n7.a(e7VarO1.b(), this.f19034c.j());
            a(bVar, e7VarO1.c(), bundle);
        }
    }

    private void a(b bVar, Uri uri) {
        a(bVar, uri, (Bundle) null);
    }

    private void a(b bVar, Uri uri, Bundle bundle) {
        com.applovin.impl.sdk.ad.b currentAd = bVar.getCurrentAd();
        AppLovinAdView appLovinAdViewI = this.f19034c.i();
        if (appLovinAdViewI != null && currentAd != null) {
            if (currentAd instanceof b7) {
                ((b7) currentAd).getAdEventTracker().v();
            }
            this.f19034c.a(currentAd, appLovinAdViewI, uri, bVar.getAndClearLastClickEvent(), bundle);
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f19033b.b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri) {
        String strD;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            strD = androidx.work.s.d("Tracked event: ", queryParameter);
        } else {
            strD = androidx.work.s.d("Failed to track event: ", queryParameter);
        }
        a7.a(strD, com.applovin.impl.sdk.k.o());
    }
}
