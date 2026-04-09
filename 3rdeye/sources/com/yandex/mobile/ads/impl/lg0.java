package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes3.dex */
public class lg0 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private final mg0 f29995a;

    /* renamed from: b, reason: collision with root package name */
    private final kj2 f29996b;

    public /* synthetic */ lg0(mg0 mg0Var) {
        this(mg0Var, xs1.b());
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(url, "url");
        super.onPageFinished(view, url);
        this.f29995a.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i, String description, String failingUrl) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(description, "description");
        kotlin.jvm.internal.l.f(failingUrl, "failingUrl");
        this.f29995a.a(i);
    }

    @Override // android.webkit.WebViewClient
    @SuppressLint({"WebViewClientOnReceivedSslError"})
    public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(handler, "handler");
        kotlin.jvm.internal.l.f(error, "error");
        kj2 kj2Var = this.f29996b;
        Context context = view.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        if (kj2Var.a(context, error)) {
            handler.proceed();
        } else {
            this.f29995a.a(-11);
            super.onReceivedSslError(view, handler, error);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(url, "url");
        mg0 mg0Var = this.f29995a;
        Context context = view.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        mg0Var.a(context, url);
        return true;
    }

    public lg0(mg0 webViewClientListener, kj2 webViewSslErrorHandler) {
        kotlin.jvm.internal.l.f(webViewClientListener, "webViewClientListener");
        kotlin.jvm.internal.l.f(webViewSslErrorHandler, "webViewSslErrorHandler");
        this.f29995a = webViewClientListener;
        this.f29996b = webViewSslErrorHandler;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f29995a.a(error.getErrorCode());
    }
}
