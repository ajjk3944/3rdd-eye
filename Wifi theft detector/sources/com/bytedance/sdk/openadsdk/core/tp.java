package com.bytedance.sdk.openadsdk.core;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class tp {
    public static void emc(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
            }
            webView.removeAllViews();
            webView.destroy();
        } catch (Exception unused) {
        }
    }
}
