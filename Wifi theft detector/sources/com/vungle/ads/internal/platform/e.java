package com.vungle.ads.internal.platform;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import kotlin.Result;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q7.a;

/* loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final e INSTANCE = new e();

    @NotNull
    private static final String TAG = "WebViewUtil";

    private e() {
    }

    public final void applyWebSettings(@NotNull WebView webView, @Nullable a.k kVar) {
        Boolean allowUniversalAccessFromFileUrls;
        Boolean allowFileAccessFromFileUrls;
        p.e(webView, "webView");
        WebSettings settings = webView.getSettings();
        p.d(settings, "webView.settings");
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs((kVar == null || (allowFileAccessFromFileUrls = kVar.getAllowFileAccessFromFileUrls()) == null) ? false : allowFileAccessFromFileUrls.booleanValue());
        settings.setAllowUniversalAccessFromFileURLs((kVar == null || (allowUniversalAccessFromFileUrls = kVar.getAllowUniversalAccessFromFileUrls()) == null) ? false : allowUniversalAccessFromFileUrls.booleanValue());
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
    }

    public final void getUserAgent(@NotNull Context context, @NotNull r0.b consumer) {
        Object objB;
        p.e(context, "context");
        p.e(consumer, "consumer");
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(WebSettings.getDefaultUserAgent(context));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        if (Result.h(objB)) {
            consumer.accept((String) objB);
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Failed to get user agent", thE);
            consumer.accept(null);
        }
    }
}
