package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.singular.sdk.internal.Constants;
import java.io.ByteArrayInputStream;
import y9.C5819a;

/* loaded from: classes3.dex */
public final class p21 extends lg0 {

    /* renamed from: c, reason: collision with root package name */
    private String f31576c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p21(mg0 webViewClientListener) {
        super(webViewClientListener);
        kotlin.jvm.internal.l.f(webViewClientListener, "webViewClientListener");
    }

    public final void a(String str) {
        this.f31576c = str;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Uri url;
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(request, "request");
        String str = this.f31576c;
        if (str == null || str.length() <= 0 || (url = request.getUrl()) == null || !com.vungle.ads.internal.g.AD_MRAID_JS_FILE_NAME.equals(url.getLastPathSegment())) {
            return super.shouldInterceptRequest(view, request);
        }
        byte[] bytes = str.getBytes(C5819a.f48359b);
        kotlin.jvm.internal.l.e(bytes, "getBytes(...)");
        return new WebResourceResponse("text/javascript", Constants.ENCODING, new ByteArrayInputStream(bytes));
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(url, "url");
        return super.shouldInterceptRequest(view, url);
    }
}
