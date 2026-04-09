package com.vungle.ads.internal.ui;

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
import androidx.annotation.VisibleForTesting;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.EvaluateJsError;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.ui.view.e;
import com.vungle.ads.internal.util.BlackScreenDetector;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.t;
import com.vungle.ads.y;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.p;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s9.q;
import s9.r;
import s9.u;
import y8.s;
import z8.z;

/* loaded from: classes3.dex */
public final class VungleWebClient extends WebViewClient implements com.vungle.ads.internal.ui.view.e {

    @NotNull
    private static final String COMMAND_COMPLETE = "window.vungle.mraidBridge.notifyCommandComplete()";

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final String TAG = "VungleWebClient";

    @NotNull
    private final q7.a advertisement;

    @NotNull
    private final y8.h blackScreenDetector$delegate;
    private boolean collectConsent;

    @Nullable
    private final com.vungle.ads.internal.presenter.k delegate;

    @Nullable
    private e.b errorHandler;

    @Nullable
    private String gdprAccept;

    @Nullable
    private String gdprBody;

    @Nullable
    private String gdprDeny;

    @Nullable
    private String gdprTitle;

    @NotNull
    private final Handler handler;

    @Nullable
    private Boolean isViewable;

    @Nullable
    private final Long loadDuration;

    @Nullable
    private WebView loadedWebView;

    @Nullable
    private e.a mraidDelegate;

    @NotNull
    private final ExecutorService offloadExecutor;

    @NotNull
    private final t partialDownloadErrorMetric;

    @NotNull
    private final t partialDownloadMetric;

    @NotNull
    private final q7.h placement;

    @Nullable
    private final com.vungle.ads.internal.platform.d platform;
    private boolean ready;

    @NotNull
    private final y skippedUrlMetric;

    @Nullable
    private s7.d webViewObserver;

    public static final class VungleWebViewRenderProcessClient extends WebViewRenderProcessClient {

        @Nullable
        private e.b errorHandler;

        public VungleWebViewRenderProcessClient(@Nullable e.b bVar) {
            this.errorHandler = bVar;
        }

        public void onRenderProcessResponsive(@NotNull WebView webView, @Nullable WebViewRenderProcess webViewRenderProcess) {
            p.e(webView, "webView");
        }

        public void onRenderProcessUnresponsive(@NotNull final WebView webView, @Nullable final WebViewRenderProcess webViewRenderProcess) {
            p.e(webView, "webView");
            com.vungle.ads.internal.util.p.Companion.w(VungleWebClient.TAG, new l9.a() { // from class: com.vungle.ads.internal.ui.VungleWebClient$VungleWebViewRenderProcessClient$onRenderProcessUnresponsive$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // l9.a
                @NotNull
                public final String invoke() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onRenderProcessUnresponsive(Title = ");
                    sb.append(webView.getTitle());
                    sb.append(", URL = ");
                    sb.append(webView.getOriginalUrl());
                    sb.append(", (webViewRenderProcess != null) = ");
                    sb.append(webViewRenderProcess != null);
                    return sb.toString();
                }
            });
            e.b bVar = this.errorHandler;
            if (bVar != null) {
                bVar.onRenderProcessUnresponsive(webView, webViewRenderProcess);
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ VungleWebClient(q7.a aVar, q7.h hVar, ExecutorService executorService, com.vungle.ads.internal.platform.d dVar, com.vungle.ads.internal.presenter.k kVar, Long l10, int i10, kotlin.jvm.internal.i iVar) {
        this(aVar, hVar, executorService, (i10 & 8) != 0 ? null : dVar, (i10 & 16) != 0 ? null : kVar, (i10 & 32) != 0 ? null : l10);
    }

    private final BlackScreenDetector getBlackScreenDetector() {
        return (BlackScreenDetector) this.blackScreenDetector$delegate.getValue();
    }

    @VisibleForTesting
    public static /* synthetic */ void getCollectConsent$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getErrorHandler$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprAccept$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprBody$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprDeny$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprTitle$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLoadedWebView$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMraidDelegate$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getReady$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWebViewObserver$vungle_ads_release$annotations() {
    }

    private final void handleWebViewError(String str, String str2, boolean z10) {
        String str3 = str2 + ' ' + str;
        e.b bVar = this.errorHandler;
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

    @VisibleForTesting
    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void notifyBlackScreenResult$default(VungleWebClient vungleWebClient, int i10, String str, int i11, Object obj) throws Throwable {
        if ((i11 & 2) != 0) {
            str = "";
        }
        vungleWebClient.notifyBlackScreenResult(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyPropertiesChange$lambda-25, reason: not valid java name */
    public static final void m360notifyPropertiesChange$lambda25(boolean z10, final VungleWebClient this$0) {
        p.e(this$0, "this$0");
        z9.o oVar = new z9.o();
        z9.f.c(oVar, "placementType", this$0.advertisement.templateType());
        Boolean bool = this$0.isViewable;
        if (bool != null) {
            z9.f.a(oVar, "isViewable", bool);
        }
        z9.f.c(oVar, "os", "android");
        z9.f.c(oVar, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
        z9.f.a(oVar, "incentivized", Boolean.valueOf(this$0.placement.isRewardedVideo()));
        com.vungle.ads.internal.platform.d dVar = this$0.platform;
        if (dVar != null) {
            z9.f.a(oVar, "isSilent", Boolean.valueOf(dVar.isSilentModeEnabled()));
        }
        if (this$0.loadDuration != null) {
            z9.f.b(oVar, "timeLoaded", this$0.loadDuration);
        }
        if (this$0.collectConsent) {
            z9.f.a(oVar, "consentRequired", Boolean.TRUE);
            z9.f.c(oVar, "consentTitleText", this$0.gdprTitle);
            z9.f.c(oVar, "consentBodyText", this$0.gdprBody);
            z9.f.c(oVar, "consentAcceptButtonText", this$0.gdprAccept);
            z9.f.c(oVar, "consentDenyButtonText", this$0.gdprDeny);
        } else {
            z9.f.a(oVar, "consentRequired", Boolean.FALSE);
        }
        z9.f.c(oVar, "sdkVersion", "7.6.3");
        final String str = "window.vungle.mraidBridge.notifyPropertiesChange(" + oVar.a() + ',' + z10 + ')';
        this$0.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.h
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m361notifyPropertiesChange$lambda25$lambda24(this.f20218a, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyPropertiesChange$lambda-25$lambda-24, reason: not valid java name */
    public static final void m361notifyPropertiesChange$lambda25$lambda24(VungleWebClient this$0, String injectJs) {
        p.e(this$0, "this$0");
        p.e(injectJs, "$injectJs");
        WebView webView = this$0.loadedWebView;
        if (webView != null) {
            this$0.runJavascriptOnWebView(webView, injectJs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runJavascriptOnWebView(WebView webView, final String str) {
        try {
            com.vungle.ads.internal.util.p.Companion.w(TAG, new l9.a() { // from class: com.vungle.ads.internal.ui.VungleWebClient.runJavascriptOnWebView.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // l9.a
                @NotNull
                public final String invoke() {
                    return "mraid Injecting JS " + str;
                }
            });
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        } catch (Throwable th) {
            new EvaluateJsError("Evaluate js failed " + th.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.advertisement.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-16$lambda-10, reason: not valid java name */
    public static final void m362shouldOverrideUrlLoading$lambda16$lambda10(final VungleWebClient this$0, final WebView webView) {
        p.e(this$0, "this$0");
        com.vungle.ads.internal.presenter.k kVar = this$0.delegate;
        if (kVar != null) {
            kVar.onAdFailedToPlay();
        }
        this$0.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.g
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m363shouldOverrideUrlLoading$lambda16$lambda10$lambda9(this.f20216a, webView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-16$lambda-10$lambda-9, reason: not valid java name */
    public static final void m363shouldOverrideUrlLoading$lambda16$lambda10$lambda9(VungleWebClient this$0, WebView webView) {
        p.e(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-16$lambda-11, reason: not valid java name */
    public static final void m364shouldOverrideUrlLoading$lambda16$lambda11(VungleWebClient this$0, WebView webView) {
        p.e(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-16$lambda-15$lambda-14, reason: not valid java name */
    public static final void m365shouldOverrideUrlLoading$lambda16$lambda15$lambda14(e.a it, String command, JsonObject args, final VungleWebClient this$0, final WebView webView) {
        p.e(it, "$it");
        p.e(command, "$command");
        p.e(args, "$args");
        p.e(this$0, "this$0");
        if (it.processCommand(command, args)) {
            this$0.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.k
                @Override // java.lang.Runnable
                public final void run() {
                    VungleWebClient.m366shouldOverrideUrlLoading$lambda16$lambda15$lambda14$lambda13(this.f20225a, webView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-16$lambda-15$lambda-14$lambda-13, reason: not valid java name */
    public static final void m366shouldOverrideUrlLoading$lambda16$lambda15$lambda14$lambda13(VungleWebClient this$0, WebView webView) {
        p.e(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-16$lambda-6, reason: not valid java name */
    public static final void m367shouldOverrideUrlLoading$lambda16$lambda6(final VungleWebClient this$0, final WebView webView) {
        p.e(this$0, "this$0");
        final String str = "window.vungle.mraidBridge.notifyReadyEvent(" + this$0.advertisement.createMRAIDArgs() + ')';
        this$0.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.i
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m368shouldOverrideUrlLoading$lambda16$lambda6$lambda5(this.f20220a, webView, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-16$lambda-6$lambda-5, reason: not valid java name */
    public static final void m368shouldOverrideUrlLoading$lambda16$lambda6$lambda5(VungleWebClient this$0, WebView webView, String injectJs) {
        p.e(this$0, "this$0");
        p.e(injectJs, "$injectJs");
        this$0.runJavascriptOnWebView(webView, injectJs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-16$lambda-8, reason: not valid java name */
    public static final void m369shouldOverrideUrlLoading$lambda16$lambda8(final VungleWebClient this$0, final WebView webView) {
        p.e(this$0, "this$0");
        com.vungle.ads.internal.presenter.k kVar = this$0.delegate;
        if (kVar != null) {
            kVar.onAdReadyToPlay();
        }
        this$0.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.f
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m370shouldOverrideUrlLoading$lambda16$lambda8$lambda7(this.f20214a, webView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-16$lambda-8$lambda-7, reason: not valid java name */
    public static final void m370shouldOverrideUrlLoading$lambda16$lambda8$lambda7(VungleWebClient this$0, WebView webView) {
        p.e(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    public final boolean getCollectConsent$vungle_ads_release() {
        return this.collectConsent;
    }

    @Nullable
    public final e.b getErrorHandler$vungle_ads_release() {
        return this.errorHandler;
    }

    @Nullable
    public final String getGdprAccept$vungle_ads_release() {
        return this.gdprAccept;
    }

    @Nullable
    public final String getGdprBody$vungle_ads_release() {
        return this.gdprBody;
    }

    @Nullable
    public final String getGdprDeny$vungle_ads_release() {
        return this.gdprDeny;
    }

    @Nullable
    public final String getGdprTitle$vungle_ads_release() {
        return this.gdprTitle;
    }

    @NotNull
    public final Handler getHandler$vungle_ads_release() {
        return this.handler;
    }

    @Nullable
    public final WebView getLoadedWebView$vungle_ads_release() {
        return this.loadedWebView;
    }

    @Nullable
    public final e.a getMraidDelegate$vungle_ads_release() {
        return this.mraidDelegate;
    }

    public final boolean getReady$vungle_ads_release() {
        return this.ready;
    }

    @Nullable
    public final s7.d getWebViewObserver$vungle_ads_release() {
        return this.webViewObserver;
    }

    public final void handleBlackScreenDetection(int i10) {
        getBlackScreenDetector().start(this.loadedWebView, i10, new l9.p() { // from class: com.vungle.ads.internal.ui.VungleWebClient.handleBlackScreenDetection.1
            {
                super(2);
            }

            @Override // l9.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                invoke(((Number) obj).intValue(), (String) obj2);
                return s.f25199a;
            }

            public final void invoke(int i11, @NotNull String errorMessage) throws Throwable {
                p.e(errorMessage, "errorMessage");
                VungleWebClient.this.notifyBlackScreenResult(i11, errorMessage);
            }
        });
    }

    @Nullable
    public final Boolean isViewable$vungle_ads_release() {
        return this.isViewable;
    }

    public final void notifyBlackScreenResult(final int i10, @NotNull String errorMessage) throws Throwable {
        p.e(errorMessage, "errorMessage");
        v.INSTANCE.runOnUiThread(new l9.a() { // from class: com.vungle.ads.internal.ui.VungleWebClient.notifyBlackScreenResult.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m371invoke();
                return s.f25199a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m371invoke() {
                WebView loadedWebView$vungle_ads_release = VungleWebClient.this.getLoadedWebView$vungle_ads_release();
                if (loadedWebView$vungle_ads_release != null) {
                    int i11 = i10;
                    VungleWebClient.this.runJavascriptOnWebView(loadedWebView$vungle_ads_release, "window.vungle.mraidBridgeExt.notifyBlackScreenResult(" + i11 + ')');
                }
            }
        });
        com.vungle.ads.internal.util.p.Companion.d(TAG, "Returning black screen result: " + i10 + '%');
        if (i10 >= 0) {
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk$SDKMetric.SDKMetricType.BLACK_SCREEN_IS_DETECTED, i10, this.advertisement.getLogEntry$vungle_ads_release(), null, 8, null);
        } else {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(Sdk$SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR, errorMessage, this.advertisement.getLogEntry$vungle_ads_release());
        }
    }

    public final void notifyDiskAvailableSize(long j10, long j11) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + j10 + '-' + j11 + ')');
        }
    }

    public final void notifyPresentAppStoreFailed() {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyPresentAppStoreFailed(0)");
        }
    }

    @Override // com.vungle.ads.internal.ui.view.e
    public void notifyPropertiesChange(final boolean z10) {
        this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.ads.internal.ui.j
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m360notifyPropertiesChange$lambda25(z10, this);
            }
        });
    }

    public final void notifySilentModeChange(boolean z10) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            z9.o oVar = new z9.o();
            z9.f.a(oVar, "isSilent", Boolean.valueOf(z10));
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + oVar.a() + ')');
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
        super.onPageFinished(webView, str);
        com.vungle.ads.internal.util.p.Companion.w(TAG, new l9.a() { // from class: com.vungle.ads.internal.ui.VungleWebClient.onPageFinished.1
            @Override // l9.a
            @NotNull
            public final String invoke() {
                return "onPageFinished.";
            }
        });
        if (webView == null) {
            return;
        }
        this.loadedWebView = webView;
        webView.setVisibility(0);
        notifyPropertiesChange(true);
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(c.a(new VungleWebViewRenderProcessClient(this.errorHandler)));
        }
        s7.d dVar = this.webViewObserver;
        if (dVar != null) {
            dVar.onPageFinished(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Deprecated in Java")
    public void onReceivedError(@Nullable WebView webView, int i10, @NotNull String description, @NotNull String failingUrl) {
        p.e(description, "description");
        p.e(failingUrl, "failingUrl");
        super.onReceivedError(webView, i10, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String strValueOf = String.valueOf(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
        String strValueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z10 = false;
        boolean z11 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        com.vungle.ads.internal.util.p.Companion.e(TAG, "Http Error desc " + strValueOf + ' ' + z11 + " for URL " + strValueOf2);
        if (isCriticalAsset(strValueOf2) && z11) {
            z10 = true;
        }
        handleWebViewError(strValueOf, strValueOf2, z10);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@Nullable final WebView webView, @Nullable final RenderProcessGoneDetail renderProcessGoneDetail) {
        this.loadedWebView = null;
        if (Build.VERSION.SDK_INT < 26) {
            com.vungle.ads.internal.util.p.Companion.w(TAG, new l9.a() { // from class: com.vungle.ads.internal.ui.VungleWebClient.onRenderProcessGone.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // l9.a
                @NotNull
                public final String invoke() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onRenderProcessGone url: ");
                    WebView webView2 = webView;
                    sb.append(webView2 != null ? webView2.getUrl() : null);
                    return sb.toString();
                }
            });
            e.b bVar = this.errorHandler;
            if (bVar != null) {
                return bVar.onWebRenderingProcessGone(webView, Boolean.TRUE);
            }
            return true;
        }
        com.vungle.ads.internal.util.p.Companion.w(TAG, new l9.a() { // from class: com.vungle.ads.internal.ui.VungleWebClient.onRenderProcessGone.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final String invoke() {
                StringBuilder sb = new StringBuilder();
                sb.append("onRenderProcessGone url: ");
                WebView webView2 = webView;
                sb.append(webView2 != null ? webView2.getUrl() : null);
                sb.append(", did crash: ");
                RenderProcessGoneDetail renderProcessGoneDetail2 = renderProcessGoneDetail;
                sb.append(renderProcessGoneDetail2 != null ? Boolean.valueOf(renderProcessGoneDetail2.didCrash()) : null);
                return sb.toString();
            }
        });
        e.b bVar2 = this.errorHandler;
        if (bVar2 != null) {
            return bVar2.onWebRenderingProcessGone(webView, renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @NotNull
    public final Pair<Long, Long> parseRange$vungle_ads_release(@Nullable String str, long j10) {
        Object objB;
        Pair pair;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (str == null || !r.J(str, "bytes=", false, 2, null)) {
                pair = new Pair(0L, null);
            } else {
                List listD0 = u.D0(u.u0(str, "bytes="), new String[]{"-"}, false, 0, 6, null);
                String str2 = (String) z.J(listD0, 0);
                Long lQ = str2 != null ? q.q(str2) : null;
                String str3 = (String) z.J(listD0, 1);
                Long lQ2 = str3 != null ? q.q(str3) : null;
                if (lQ == null) {
                    if (lQ2 == null) {
                        lQ = 0L;
                    } else {
                        lQ = Long.valueOf(j10 - lQ2.longValue());
                        lQ2 = null;
                    }
                }
                pair = new Pair(lQ, lQ2);
            }
            objB = Result.b(pair);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        if (Result.e(objB) != null) {
            objB = new Pair(0L, null);
        }
        return (Pair) objB;
    }

    @Override // com.vungle.ads.internal.ui.view.e
    public void setAdVisibility(boolean z10) {
        this.isViewable = Boolean.valueOf(z10);
        notifyPropertiesChange(false);
    }

    public final void setCollectConsent$vungle_ads_release(boolean z10) {
        this.collectConsent = z10;
    }

    @Override // com.vungle.ads.internal.ui.view.e
    public void setConsentStatus(boolean z10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.collectConsent = z10;
        this.gdprTitle = str;
        this.gdprBody = str2;
        this.gdprAccept = str3;
        this.gdprDeny = str4;
    }

    @Override // com.vungle.ads.internal.ui.view.e
    public void setErrorHandler(@NotNull e.b errorHandler) {
        p.e(errorHandler, "errorHandler");
        this.errorHandler = errorHandler;
    }

    public final void setErrorHandler$vungle_ads_release(@Nullable e.b bVar) {
        this.errorHandler = bVar;
    }

    public final void setGdprAccept$vungle_ads_release(@Nullable String str) {
        this.gdprAccept = str;
    }

    public final void setGdprBody$vungle_ads_release(@Nullable String str) {
        this.gdprBody = str;
    }

    public final void setGdprDeny$vungle_ads_release(@Nullable String str) {
        this.gdprDeny = str;
    }

    public final void setGdprTitle$vungle_ads_release(@Nullable String str) {
        this.gdprTitle = str;
    }

    public final void setLoadedWebView$vungle_ads_release(@Nullable WebView webView) {
        this.loadedWebView = webView;
    }

    @Override // com.vungle.ads.internal.ui.view.e
    public void setMraidDelegate(@Nullable e.a aVar) {
        this.mraidDelegate = aVar;
    }

    public final void setMraidDelegate$vungle_ads_release(@Nullable e.a aVar) {
        this.mraidDelegate = aVar;
    }

    public final void setReady$vungle_ads_release(boolean z10) {
        this.ready = z10;
    }

    public final void setViewable$vungle_ads_release(@Nullable Boolean bool) {
        this.isViewable = bool;
    }

    @Override // com.vungle.ads.internal.ui.view.e
    public void setWebViewObserver(@Nullable s7.d dVar) {
        this.webViewObserver = dVar;
    }

    public final void setWebViewObserver$vungle_ads_release(@Nullable s7.d dVar) {
        this.webViewObserver = dVar;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url == null) {
            return null;
        }
        String scheme = url.getScheme();
        if (scheme != null) {
            Locale ROOT = Locale.ROOT;
            p.d(ROOT, "ROOT");
            String lowerCase = scheme.toLowerCase(ROOT);
            p.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase != null) {
                if (!p.a(lowerCase, "http") && !p.a(lowerCase, HttpRequest.DEFAULT_SCHEME)) {
                    return null;
                }
                if (!this.advertisement.isPartialDownloadEnabled()) {
                    com.vungle.ads.internal.util.p.Companion.w(TAG, new l9.a() { // from class: com.vungle.ads.internal.ui.VungleWebClient.shouldInterceptRequest.1
                        @Override // l9.a
                        @NotNull
                        public final String invoke() {
                            return "shouldInterceptRequest called but partial download is disabled.";
                        }
                    });
                    return null;
                }
                String string = url.toString();
                p.d(string, "uri.toString()");
                AdAsset localPartialDownloadAssets = this.advertisement.getLocalPartialDownloadAssets(string);
                String localPath = localPartialDownloadAssets != null ? localPartialDownloadAssets.getLocalPath() : null;
                if (localPath == null || localPath.length() == 0) {
                    return null;
                }
                File file = new File(localPath);
                if (!file.exists()) {
                    return null;
                }
                long contentLength = localPartialDownloadAssets.getContentLength();
                if (contentLength <= 0) {
                    return null;
                }
                long length = file.length();
                final String str = webResourceRequest.getRequestHeaders().get(Command.HTTP_HEADER_RANGE);
                this.partialDownloadMetric.setMeta(str + " cached:" + length + ' ' + string);
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadMetric, this.advertisement.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                Pair<Long, Long> range$vungle_ads_release = parseRange$vungle_ads_release(str, contentLength);
                localPartialDownloadAssets.setRangeStart(((Number) range$vungle_ads_release.h()).longValue());
                localPartialDownloadAssets.setRangeEnd((Long) range$vungle_ads_release.i());
                long jLongValue = ((Number) range$vungle_ads_release.getFirst()).longValue();
                Long l10 = (Long) range$vungle_ads_release.getSecond();
                long j10 = length - jLongValue;
                p.a aVar = com.vungle.ads.internal.util.p.Companion;
                aVar.i(TAG, ">>request: " + url + " rangeStart=" + jLongValue + " rangeEnd=" + l10 + " cachedFileLength=" + length + " availableBytes=" + j10 + " contentLength=" + contentLength + ' ');
                if (j10 <= 0) {
                    aVar.w(TAG, new l9.a() { // from class: com.vungle.ads.internal.ui.VungleWebClient.shouldInterceptRequest.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // l9.a
                        @NotNull
                        public final String invoke() {
                            return "Requested range exceeds cached file: " + str;
                        }
                    });
                    localPartialDownloadAssets.waitForDownload();
                    length = file.length();
                }
                long jLongValue2 = l10 != null ? l10.longValue() : length - 1;
                long j11 = (jLongValue2 - jLongValue) + 1;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    FileInputStream fileInputStream = new FileInputStream(file);
                    WebResourceResponse webResourceResponse = new WebResourceResponse(localPartialDownloadAssets.getMimeType(), C.UTF8_NAME, Sdk$SDKError.Reason.AD_ALREADY_FAILED_VALUE, "Partial Content", kotlin.collections.a.k(y8.i.a(CommonGatewayClient.HEADER_CONTENT_TYPE, localPartialDownloadAssets.getMimeType()), y8.i.a("Accept-Ranges", "bytes"), y8.i.a("Content-Length", String.valueOf(j11)), y8.i.a("Content-Range", "bytes " + jLongValue + '-' + jLongValue2 + '/' + contentLength)), new BufferedInputStream(fileInputStream, 1024));
                    StringBuilder sb = new StringBuilder();
                    sb.append("<<Return:");
                    sb.append(webResourceResponse.getResponseHeaders());
                    aVar.i(TAG, sb.toString());
                    return webResourceResponse;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Throwable thE = Result.e(Result.b(kotlin.c.a(th)));
                    if (thE == null) {
                        return null;
                    }
                    com.vungle.ads.internal.util.p.Companion.e(TAG, "Error serving local range video: " + thE.getMessage(), thE);
                    this.partialDownloadErrorMetric.setMeta(string + ' ' + thE.getMessage());
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadErrorMetric, this.advertisement.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab A[Catch: all -> 0x00f7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00f7, blocks: (B:3:0x0003, B:5:0x001b, B:8:0x0024, B:10:0x0033, B:13:0x003c, B:15:0x0049, B:17:0x004f, B:43:0x00ab, B:48:0x00bc, B:49:0x00c9, B:53:0x00e2, B:37:0x0092), top: B:81:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af A[Catch: all -> 0x0079, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0079, blocks: (B:25:0x0063, B:28:0x006c, B:45:0x00af, B:51:0x00cf, B:32:0x007e, B:35:0x0087, B:39:0x009a, B:41:0x009e), top: B:83:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0175  */
    @Override // android.webkit.WebViewClient
    @kotlin.Deprecated(message = "Deprecated in Java")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.Nullable final android.webkit.WebView r14, @org.jetbrains.annotations.Nullable final java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.ui.VungleWebClient.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    public VungleWebClient(@NotNull q7.a advertisement, @NotNull q7.h placement, @NotNull ExecutorService offloadExecutor, @Nullable com.vungle.ads.internal.platform.d dVar, @Nullable com.vungle.ads.internal.presenter.k kVar, @Nullable Long l10) {
        kotlin.jvm.internal.p.e(advertisement, "advertisement");
        kotlin.jvm.internal.p.e(placement, "placement");
        kotlin.jvm.internal.p.e(offloadExecutor, "offloadExecutor");
        this.advertisement = advertisement;
        this.placement = placement;
        this.offloadExecutor = offloadExecutor;
        this.platform = dVar;
        this.delegate = kVar;
        this.loadDuration = l10;
        this.blackScreenDetector$delegate = kotlin.b.b(new l9.a() { // from class: com.vungle.ads.internal.ui.VungleWebClient$blackScreenDetector$2
            @Override // l9.a
            @NotNull
            public final BlackScreenDetector invoke() {
                return new BlackScreenDetector();
            }
        });
        this.handler = new Handler(Looper.getMainLooper());
        Sdk$SDKMetric.SDKMetricType sDKMetricType = Sdk$SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET;
        this.partialDownloadMetric = new t(sDKMetricType);
        this.partialDownloadErrorMetric = new t(sDKMetricType);
        this.skippedUrlMetric = new y(Sdk$SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String strValueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
        String strValueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z10 = false;
        boolean z11 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        com.vungle.ads.internal.util.p.Companion.e(TAG, "Error desc " + strValueOf + ' ' + z11 + " for URL " + strValueOf2);
        if (isCriticalAsset(strValueOf2) && z11) {
            z10 = true;
        }
        handleWebViewError(strValueOf, strValueOf2, z10);
    }
}
