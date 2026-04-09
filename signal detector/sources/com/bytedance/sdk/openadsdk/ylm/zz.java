package com.bytedance.sdk.openadsdk.ylm;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class zz {
    private static void emc(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            uym.emc("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th);
        }
    }

    private static void ypw(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            uym.emc("WebViewSettings", "removeJavascriptInterfacesSafe error", th);
        }
    }

    public static void emc(WebView webView) {
        if (webView == null) {
            return;
        }
        ypw(webView);
        WebSettings settings = webView.getSettings();
        emc(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Throwable th) {
            uym.emc("WebViewSettings", "setJavaScriptEnabled error", th);
        }
        try {
            settings.setSupportZoom(false);
        } catch (Throwable th2) {
            uym.emc("WebViewSettings", "setSupportZoom error", th2);
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setDisplayZoomControls(false);
        int i = Build.VERSION.SDK_INT;
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSavePassword(false);
        boolean z6 = i >= 28;
        try {
        } catch (Throwable th3) {
            uym.emc("WebViewSettings", "setLayerType error", th3);
        }
        if (!z6) {
            webView.setLayerType(0, null);
        } else {
            if (z6) {
                webView.setLayerType(2, null);
            }
            webView.getSettings().setMixedContentMode(0);
        }
        webView.getSettings().setMixedContentMode(0);
    }
}
