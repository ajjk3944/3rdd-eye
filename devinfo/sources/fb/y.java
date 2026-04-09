package fb;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.w81;
import com.google.android.gms.internal.ads.yo;
import com.google.android.gms.internal.ads.zl;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y extends yo {

    /* renamed from: a, reason: collision with root package name */
    public final WebView f23991a;

    /* renamed from: b, reason: collision with root package name */
    public final v f23992b;

    /* renamed from: c, reason: collision with root package name */
    public final w81 f23993c;

    /* renamed from: d, reason: collision with root package name */
    public WebViewClient f23994d;

    public y(WebView webView, v vVar, w81 w81Var) {
        this.f23991a = webView;
        this.f23992b = vVar;
        this.f23993c = w81Var;
    }

    public static boolean c() {
        if (((Boolean) zl.f19110a.u()).booleanValue()) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            if (allStackTraces != null && allStackTraces.containsKey(Thread.currentThread())) {
                boolean z3 = false;
                boolean z10 = false;
                for (StackTraceElement stackTraceElement : allStackTraces.get(Thread.currentThread())) {
                    if (stackTraceElement.getClassName().contains(y.class.getName())) {
                        if (!z3 || !z10) {
                            z3 = true;
                        }
                    } else if (z3) {
                        z10 = true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void a() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        WebViewClient webViewClientE;
        try {
            ya.f0 f0Var = ua.j.C.f35261c;
            int i4 = Build.VERSION.SDK_INT;
            WebView webView = this.f23991a;
            if (i4 < 26) {
                if (ii.a.s("GET_WEB_VIEW_CLIENT")) {
                    try {
                        webViewClientE = o6.f.e(webView);
                    } catch (RuntimeException e2) {
                        ua.j.C.f35265h.f("AdUtil.getWebViewClient", e2);
                    }
                }
                throw new IllegalStateException("getWebViewClient not supported");
            }
            webViewClientE = webView.getWebViewClient();
            if (webViewClientE == this) {
                return;
            }
            if (webViewClientE != null) {
                this.f23994d = webViewClientE;
            }
            webView.setWebViewClient(this);
            b();
        } catch (IllegalStateException unused) {
        }
    }

    public final void b() {
        this.f23991a.evaluateJavascript(String.format(Locale.getDefault(), (String) va.s.f36163e.f36166c.a(sk.f16062bb), this.f23992b.b()), null);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z3) {
        if (c()) {
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z3);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (c()) {
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (c()) {
            return;
        }
        super.onLoadResource(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        if (c()) {
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (c()) {
            return;
        }
        b();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (c()) {
            return;
        }
        b();
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (c()) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i4, String str, String str2) {
        if (c()) {
            return;
        }
        super.onReceivedError(webView, i4, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (c()) {
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (c()) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        if (c()) {
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (c()) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (c()) {
            return false;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i4, SafeBrowsingResponse safeBrowsingResponse) {
        if (c()) {
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i4, safeBrowsingResponse);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f10, float f11) {
        if (c()) {
            return;
        }
        super.onScaleChanged(webView, f10, f11);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (c()) {
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (c()) {
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (c()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (c()) {
            return false;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (c()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (c()) {
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (c()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.yo, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (c()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
