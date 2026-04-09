package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yandex.mobile.ads.impl.j82;

/* renamed from: com.yandex.mobile.ads.impl.t2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4203t2 extends pk {

    /* renamed from: com.yandex.mobile.ads.impl.t2$a */
    public final class a extends WebChromeClient {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ w9.i<Object>[] f33372b = {fa.a(a.class, "context", "getContext()Landroid/content/Context;", 0)};

        /* renamed from: a, reason: collision with root package name */
        private final ao1 f33373a;

        public a(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            this.f33373a = bo1.a(context);
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView view, int i) {
            kotlin.jvm.internal.l.f(view, "view");
            Object obj = (Context) this.f33373a.getValue(this, f33372b[0]);
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar != null) {
                cVar.a(view, i);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.t2$b */
    public final class b extends WebViewClient {

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ w9.i<Object>[] f33374d = {fa.a(b.class, "context", "getContext()Landroid/content/Context;", 0)};

        /* renamed from: a, reason: collision with root package name */
        private final ao1 f33375a;

        /* renamed from: b, reason: collision with root package name */
        private final lj2 f33376b;

        /* renamed from: c, reason: collision with root package name */
        private final l82 f33377c;

        public b(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            this.f33375a = bo1.a(context);
            this.f33376b = xs1.b();
            this.f33377c = new l82();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView view, String str) {
            kotlin.jvm.internal.l.f(view, "view");
            super.onPageFinished(view, str);
            Object obj = (Context) this.f33375a.getValue(this, f33374d[0]);
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar != null) {
                cVar.b(view);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView view, String str, Bitmap bitmap) {
            kotlin.jvm.internal.l.f(view, "view");
            super.onPageStarted(view, str, bitmap);
            Object obj = (Context) this.f33375a.getValue(this, f33374d[0]);
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar != null) {
                cVar.a(view);
            }
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"WebViewClientOnReceivedSslError"})
        public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            kotlin.jvm.internal.l.f(view, "view");
            kotlin.jvm.internal.l.f(handler, "handler");
            kotlin.jvm.internal.l.f(error, "error");
            lj2 lj2Var = this.f33376b;
            Context context = view.getContext();
            kotlin.jvm.internal.l.e(context, "getContext(...)");
            if (lj2Var.a(context, error)) {
                handler.proceed();
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView view, String str) {
            kotlin.jvm.internal.l.f(view, "view");
            if (str == null || str.length() <= 0) {
                return false;
            }
            j82.f29019a.getClass();
            if (!j82.a.c(str) && URLUtil.isNetworkUrl(str)) {
                return false;
            }
            l82 l82Var = this.f33377c;
            Context context = view.getContext();
            kotlin.jvm.internal.l.e(context, "getContext(...)");
            return l82Var.a(context, str);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.t2$c */
    public interface c {
        void a(WebView webView);

        void a(WebView webView, int i);

        void b(WebView webView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4203t2(Context context) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        a(context);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        setBackgroundColor(-1);
        setInitialScale(1);
        WebSettings settings = getSettings();
        kotlin.jvm.internal.l.e(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        setDisplayZoomControls(false);
        setScrollbarFadingEnabled(true);
        setDrawingCacheEnabled(true);
        setWebChromeClient(new a(context));
        setWebViewClient(new b(context));
    }
}
