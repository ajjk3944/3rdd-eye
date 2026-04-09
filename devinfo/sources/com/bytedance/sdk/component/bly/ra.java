package com.bytedance.sdk.component.bly;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.bly.ouw;
import com.bytedance.sdk.component.utils.ko;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra extends WebViewClient {

    /* renamed from: lh, reason: collision with root package name */
    private final List<String> f7438lh;
    private final WebViewClient ouw;
    private final ouw.InterfaceC0049ouw vt;

    public ra(ouw.InterfaceC0049ouw interfaceC0049ouw, WebViewClient webViewClient, List<String> list) {
        this.vt = interfaceC0049ouw;
        this.ouw = webViewClient;
        this.f7438lh = list;
    }

    private static int ouw(WebView webView) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                return webBackForwardListCopyBackForwardList.getCurrentIndex() + 1;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        ouw.InterfaceC0049ouw interfaceC0049ouw = this.vt;
        if (interfaceC0049ouw != null) {
            interfaceC0049ouw.vt();
        }
        this.ouw.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ouw.InterfaceC0049ouw interfaceC0049ouw = this.vt;
        if (interfaceC0049ouw != null) {
            interfaceC0049ouw.ouw(ouw(webView));
        }
        this.ouw.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.ouw.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.ouw.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.ouw.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return Build.VERSION.SDK_INT >= 26 ? this.ouw.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.ouw.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        ko.vt("arbitrage_click", "trigger shouldOverrideUrlLoading()");
        ouw.InterfaceC0049ouw interfaceC0049ouw = this.vt;
        if (interfaceC0049ouw != null) {
            interfaceC0049ouw.ouw();
        }
        return this.ouw.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i4, String str, String str2) {
        this.ouw.onReceivedError(webView, i4, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (vt.ouw(this.f7438lh, webResourceRequest.getUrl().toString())) {
            ko.vt("arbitrage_intercept", "trigger shouldInterceptRequest()");
            ouw.InterfaceC0049ouw interfaceC0049ouw = this.vt;
            if (interfaceC0049ouw != null) {
                interfaceC0049ouw.ouw();
            }
        }
        return this.ouw.shouldInterceptRequest(webView, webResourceRequest);
    }
}
