package com.vungle.ads.internal.ui;

import C.RunnableC0615b;
import R9.A;
import R9.z;
import T1.B;
import a6.C1653b;
import a6.C1661j;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import c6.InterfaceC2072e;
import com.google.android.gms.common.internal.ImagesContract;
import com.vungle.ads.C4055m;
import com.vungle.ads.internal.util.k;
import g6.InterfaceC4395c;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: VungleWebClient.kt */
/* loaded from: classes2.dex */
public final class e extends WebViewClient implements InterfaceC4395c {
    public static final a Companion = new a(null);
    private static final String TAG = "VungleWebClient";
    private final C1653b advertisement;
    private boolean collectConsent;
    private InterfaceC4395c.b errorHandler;
    private String gdprAccept;
    private String gdprBody;
    private String gdprDeny;
    private String gdprTitle;
    private Boolean isViewable;
    private WebView loadedWebView;
    private InterfaceC4395c.a mraidDelegate;
    private final ExecutorService offloadExecutor;
    private final C1661j placement;
    private final com.vungle.ads.internal.platform.b platform;
    private boolean ready;
    private final com.vungle.ads.internal.signals.b signalManager;
    private InterfaceC2072e webViewObserver;

    /* compiled from: VungleWebClient.kt */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: VungleWebClient.kt */
    public static final class b extends WebViewRenderProcessClient {
        private InterfaceC4395c.b errorHandler;

        public b(InterfaceC4395c.b bVar) {
            this.errorHandler = bVar;
        }

        public final InterfaceC4395c.b getErrorHandler() {
            return this.errorHandler;
        }

        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            l.f(webView, "webView");
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            l.f(webView, "webView");
            k.a aVar = k.Companion;
            StringBuilder sb = new StringBuilder("onRenderProcessUnresponsive(Title = ");
            sb.append(webView.getTitle());
            sb.append(", URL = ");
            sb.append(webView.getOriginalUrl());
            sb.append(", (webViewRenderProcess != null) = ");
            sb.append(webViewRenderProcess != null);
            aVar.w(e.TAG, sb.toString());
            InterfaceC4395c.b bVar = this.errorHandler;
            if (bVar != null) {
                bVar.onRenderProcessUnresponsive(webView, webViewRenderProcess);
            }
        }

        public final void setErrorHandler(InterfaceC4395c.b bVar) {
            this.errorHandler = bVar;
        }
    }

    public /* synthetic */ e(C1653b c1653b, C1661j c1661j, ExecutorService executorService, com.vungle.ads.internal.signals.b bVar, com.vungle.ads.internal.platform.b bVar2, int i, g gVar) {
        this(c1653b, c1661j, executorService, (i & 8) != 0 ? null : bVar, (i & 16) != 0 ? null : bVar2);
    }

    private final void handleWebViewError(String str, String str2, boolean z10) {
        String str3 = str2 + ' ' + str;
        InterfaceC4395c.b bVar = this.errorHandler;
        if (bVar != null) {
            bVar.onReceivedError(str3, z10);
        }
    }

    private final boolean isCriticalAsset(String str) {
        if (str.length() > 0) {
            return this.advertisement.isCriticalAsset(str);
        }
        return false;
    }

    private final void runJavascriptOnWebView(WebView webView, String str) {
        if (webView != null) {
            try {
                if (!webView.isAttachedToWindow()) {
                    return;
                }
            } catch (Throwable th) {
                C4055m.INSTANCE.logError$vungle_ads_release(313, "Evaluate js failed " + th.getLocalizedMessage(), this.placement.getReferenceId(), this.advertisement.getCreativeId(), this.advertisement.eventId());
                return;
            }
        }
        k.Companion.w(TAG, "mraid Injecting JS " + str);
        if (webView != null) {
            webView.evaluateJavascript(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-4$lambda-3$lambda-2, reason: not valid java name */
    public static final void m108shouldOverrideUrlLoading$lambda4$lambda3$lambda2(InterfaceC4395c.a it, String command, z args, Handler handler, e this$0, WebView webView) {
        l.f(it, "$it");
        l.f(command, "$command");
        l.f(args, "$args");
        l.f(handler, "$handler");
        l.f(this$0, "this$0");
        if (it.processCommand(command, args)) {
            handler.post(new RunnableC0615b(19, this$0, webView));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-4$lambda-3$lambda-2$lambda-1, reason: not valid java name */
    public static final void m109shouldOverrideUrlLoading$lambda4$lambda3$lambda2$lambda1(e this$0, WebView webView) {
        l.f(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
    }

    public final boolean getCollectConsent$vungle_ads_release() {
        return this.collectConsent;
    }

    public final InterfaceC4395c.b getErrorHandler$vungle_ads_release() {
        return this.errorHandler;
    }

    public final String getGdprAccept$vungle_ads_release() {
        return this.gdprAccept;
    }

    public final String getGdprBody$vungle_ads_release() {
        return this.gdprBody;
    }

    public final String getGdprDeny$vungle_ads_release() {
        return this.gdprDeny;
    }

    public final String getGdprTitle$vungle_ads_release() {
        return this.gdprTitle;
    }

    public final WebView getLoadedWebView$vungle_ads_release() {
        return this.loadedWebView;
    }

    public final InterfaceC4395c.a getMraidDelegate$vungle_ads_release() {
        return this.mraidDelegate;
    }

    public final boolean getReady$vungle_ads_release() {
        return this.ready;
    }

    public final InterfaceC2072e getWebViewObserver$vungle_ads_release() {
        return this.webViewObserver;
    }

    public final Boolean isViewable$vungle_ads_release() {
        return this.isViewable;
    }

    public final void notifyDiskAvailableSize(long j4) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + j4 + ')');
        }
    }

    @Override // g6.InterfaceC4395c
    public void notifyPropertiesChange(boolean z10) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            A a10 = new A();
            A a11 = new A();
            B.t(a11, "width", Integer.valueOf(webView.getWidth()));
            B.t(a11, "height", Integer.valueOf(webView.getHeight()));
            z zVarA = a11.a();
            A a12 = new A();
            B.t(a12, "x", 0);
            B.t(a12, "y", 0);
            B.t(a12, "width", Integer.valueOf(webView.getWidth()));
            B.t(a12, "height", Integer.valueOf(webView.getHeight()));
            z zVarA2 = a12.a();
            A a13 = new A();
            Boolean bool = Boolean.FALSE;
            B.s(a13, "sms", bool);
            B.s(a13, "tel", bool);
            B.s(a13, "calendar", bool);
            B.s(a13, "storePicture", bool);
            B.s(a13, "inlineVideo", bool);
            z zVarA3 = a13.a();
            a10.b(zVarA, "maxSize");
            a10.b(zVarA, "screenSize");
            a10.b(zVarA2, "defaultPosition");
            a10.b(zVarA2, "currentPosition");
            a10.b(zVarA3, "supports");
            B.u(a10, "placementType", this.advertisement.templateType());
            Boolean bool2 = this.isViewable;
            if (bool2 != null) {
                B.s(a10, "isViewable", bool2);
            }
            B.u(a10, "os", ConstantDeviceInfo.APP_PLATFORM);
            B.u(a10, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
            B.s(a10, "incentivized", Boolean.valueOf(this.placement.isRewardedVideo()));
            B.u(a10, "version", "1.0");
            com.vungle.ads.internal.platform.b bVar = this.platform;
            if (bVar != null) {
                B.s(a10, "isSilent", Boolean.valueOf(bVar.isSilentModeEnabled()));
            }
            if (this.collectConsent) {
                B.s(a10, "consentRequired", Boolean.TRUE);
                B.u(a10, "consentTitleText", this.gdprTitle);
                B.u(a10, "consentBodyText", this.gdprBody);
                B.u(a10, "consentAcceptButtonText", this.gdprAccept);
                B.u(a10, "consentDenyButtonText", this.gdprDeny);
            } else {
                B.s(a10, "consentRequired", bool);
            }
            if (!com.vungle.ads.internal.f.INSTANCE.signalsDisabled()) {
                com.vungle.ads.internal.signals.b bVar2 = this.signalManager;
                String uuid = bVar2 != null ? bVar2.getUuid() : null;
                if (uuid != null && uuid.length() != 0) {
                    com.vungle.ads.internal.signals.b bVar3 = this.signalManager;
                    B.u(a10, "sessionId", bVar3 != null ? bVar3.getUuid() : null);
                }
            }
            B.u(a10, "sdkVersion", "7.4.1");
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + a10.a() + ',' + z10 + ')');
        }
    }

    public final void notifySilentModeChange(boolean z10) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            A a10 = new A();
            B.s(a10, "isSilent", Boolean.valueOf(z10));
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + a10.a() + ')');
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (webView == null) {
            return;
        }
        this.loadedWebView = webView;
        webView.setVisibility(0);
        notifyPropertiesChange(true);
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(new b(this.errorHandler));
        }
        InterfaceC2072e interfaceC2072e = this.webViewObserver;
        if (interfaceC2072e != null) {
            interfaceC2072e.onPageFinished(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String description, String failingUrl) {
        l.f(description, "description");
        l.f(failingUrl, "failingUrl");
        super.onReceivedError(webView, i, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String strValueOf = String.valueOf(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
        String strValueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z10 = false;
        boolean z11 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        k.Companion.e(TAG, "Http Error desc " + strValueOf + ' ' + z11 + " for URL " + strValueOf2);
        if (isCriticalAsset(strValueOf2) && z11) {
            z10 = true;
        }
        handleWebViewError(strValueOf, strValueOf2, z10);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.loadedWebView = null;
        if (Build.VERSION.SDK_INT < 26) {
            k.a aVar = k.Companion;
            StringBuilder sb = new StringBuilder("onRenderProcessGone url: ");
            sb.append(webView != null ? webView.getUrl() : null);
            aVar.w(TAG, sb.toString());
            return true;
        }
        k.a aVar2 = k.Companion;
        StringBuilder sb2 = new StringBuilder("onRenderProcessGone url: ");
        sb2.append(webView != null ? webView.getUrl() : null);
        sb2.append(", did crash: ");
        sb2.append(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
        aVar2.w(TAG, sb2.toString());
        InterfaceC4395c.b bVar = this.errorHandler;
        if (bVar != null) {
            return bVar.onWebRenderingProcessGone(webView, renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // g6.InterfaceC4395c
    public void setAdVisibility(boolean z10) {
        this.isViewable = Boolean.valueOf(z10);
        notifyPropertiesChange(false);
    }

    public final void setCollectConsent$vungle_ads_release(boolean z10) {
        this.collectConsent = z10;
    }

    @Override // g6.InterfaceC4395c
    public void setConsentStatus(boolean z10, String str, String str2, String str3, String str4) {
        this.collectConsent = z10;
        this.gdprTitle = str;
        this.gdprBody = str2;
        this.gdprAccept = str3;
        this.gdprDeny = str4;
    }

    @Override // g6.InterfaceC4395c
    public void setErrorHandler(InterfaceC4395c.b errorHandler) {
        l.f(errorHandler, "errorHandler");
        this.errorHandler = errorHandler;
    }

    public final void setErrorHandler$vungle_ads_release(InterfaceC4395c.b bVar) {
        this.errorHandler = bVar;
    }

    public final void setGdprAccept$vungle_ads_release(String str) {
        this.gdprAccept = str;
    }

    public final void setGdprBody$vungle_ads_release(String str) {
        this.gdprBody = str;
    }

    public final void setGdprDeny$vungle_ads_release(String str) {
        this.gdprDeny = str;
    }

    public final void setGdprTitle$vungle_ads_release(String str) {
        this.gdprTitle = str;
    }

    public final void setLoadedWebView$vungle_ads_release(WebView webView) {
        this.loadedWebView = webView;
    }

    @Override // g6.InterfaceC4395c
    public void setMraidDelegate(InterfaceC4395c.a aVar) {
        this.mraidDelegate = aVar;
    }

    public final void setMraidDelegate$vungle_ads_release(InterfaceC4395c.a aVar) {
        this.mraidDelegate = aVar;
    }

    public final void setReady$vungle_ads_release(boolean z10) {
        this.ready = z10;
    }

    public final void setViewable$vungle_ads_release(Boolean bool) {
        this.isViewable = bool;
    }

    @Override // g6.InterfaceC4395c
    public void setWebViewObserver(InterfaceC2072e interfaceC2072e) {
        this.webViewObserver = interfaceC2072e;
    }

    public final void setWebViewObserver$vungle_ads_release(InterfaceC2072e interfaceC2072e) {
        this.webViewObserver = interfaceC2072e;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(final WebView webView, String str) {
        k.a aVar = k.Companion;
        aVar.d(TAG, "MRAID Command " + str);
        if (str == null || str.length() == 0) {
            aVar.e(TAG, "Invalid URL ");
            return false;
        }
        Uri uri = Uri.parse(str);
        if (uri == null || uri.getScheme() == null) {
            return false;
        }
        String scheme = uri.getScheme();
        if (l.b(scheme, "mraid")) {
            final String host = uri.getHost();
            if (host == null) {
                return false;
            }
            if (!"propertiesChangeCompleted".equals(host)) {
                final InterfaceC4395c.a aVar2 = this.mraidDelegate;
                if (aVar2 != null) {
                    A a10 = new A();
                    for (String param : uri.getQueryParameterNames()) {
                        l.e(param, "param");
                        B.u(a10, param, uri.getQueryParameter(param));
                    }
                    final z zVarA = a10.a();
                    final Handler handler = new Handler(Looper.getMainLooper());
                    this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.ads.internal.ui.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            e eVar = this;
                            e.m108shouldOverrideUrlLoading$lambda4$lambda3$lambda2(aVar2, host, zVarA, handler, eVar, webView);
                        }
                    });
                    return true;
                }
            } else if (!this.ready) {
                runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyReadyEvent(" + this.advertisement.createMRAIDArgs() + ')');
                this.ready = true;
                return true;
            }
        } else {
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                return false;
            }
            aVar.d(TAG, "Open URL".concat(str));
            InterfaceC4395c.a aVar3 = this.mraidDelegate;
            if (aVar3 != null) {
                A a11 = new A();
                B.u(a11, ImagesContract.URL, str);
                aVar3.processCommand("openNonMraid", a11.a());
            }
        }
        return true;
    }

    public e(C1653b advertisement, C1661j placement, ExecutorService offloadExecutor, com.vungle.ads.internal.signals.b bVar, com.vungle.ads.internal.platform.b bVar2) {
        l.f(advertisement, "advertisement");
        l.f(placement, "placement");
        l.f(offloadExecutor, "offloadExecutor");
        this.advertisement = advertisement;
        this.placement = placement;
        this.offloadExecutor = offloadExecutor;
        this.signalManager = bVar;
        this.platform = bVar2;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String strValueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
        String strValueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z10 = false;
        boolean z11 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        k.Companion.e(TAG, "Error desc " + strValueOf + ' ' + z11 + " for URL " + strValueOf2);
        if (isCriticalAsset(strValueOf2) && z11) {
            z10 = true;
        }
        handleWebViewError(strValueOf, strValueOf2, z10);
    }

    public static /* synthetic */ void getCollectConsent$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getErrorHandler$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprAccept$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprBody$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprDeny$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprTitle$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getLoadedWebView$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getReady$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getWebViewObserver$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }
}
