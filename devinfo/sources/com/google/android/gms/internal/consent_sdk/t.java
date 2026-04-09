package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f19516a;

    public /* synthetic */ t(u uVar) {
        Objects.requireNonNull(uVar);
        this.f19516a = uVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        int i4 = u.f19526d;
        if (str == null || !str.startsWith("consent://")) {
            return;
        }
        this.f19516a.f19528b.a(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        u uVar = this.f19516a;
        if (uVar.f19529c) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        uVar.f19529c = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i4, String str, String str2) {
        x xVar = this.f19516a.f19528b;
        xVar.getClass();
        Locale locale = Locale.US;
        xVar.g.b(new r1(2, "WebResourceError(" + i4 + ", " + str2 + "): " + str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == null) {
            return true;
        }
        String str = true != renderProcessGoneDetail.didCrash() ? "was stopped by system" : "crashed";
        Log.w("UserMessagingPlatform", "WebView render process " + str + ". Renderer priority at exit: " + renderProcessGoneDetail.rendererPriorityAtExit());
        ViewGroup viewGroup = (ViewGroup) webView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        int i4 = u.f19526d;
        if (string == null || !string.startsWith("consent://")) {
            return false;
        }
        this.f19516a.f19528b.a(string);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i4 = u.f19526d;
        if (str == null || !str.startsWith("consent://")) {
            return false;
        }
        this.f19516a.f19528b.a(str);
        return true;
    }
}
