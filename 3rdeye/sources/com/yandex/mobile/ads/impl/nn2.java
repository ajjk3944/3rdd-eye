package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class nn2 extends s8 {
    @SuppressLint({"SetJavaScriptEnabled"})
    public nn2(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
