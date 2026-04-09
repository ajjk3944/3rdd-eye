package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.AbstractC2118f0;
import com.applovin.impl.z7;

/* loaded from: classes.dex */
public class l extends AbstractC2118f0 {

    /* renamed from: c, reason: collision with root package name */
    private final String f19064c;

    public l(String str, com.applovin.impl.sdk.ad.b bVar, z7 z7Var, Context context) {
        super(context);
        this.f19064c = str;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        if (bVar.U0()) {
            applySettings(bVar);
        } else {
            settings.setAllowFileAccess(true);
            if (bVar.R0()) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        }
        setWebViewClient(z7Var);
        setWebChromeClient(new WebChromeClient());
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
    }

    public void a(String str) {
        loadDataWithBaseURL(this.f19064c, str, "text/html", null, "");
    }
}
