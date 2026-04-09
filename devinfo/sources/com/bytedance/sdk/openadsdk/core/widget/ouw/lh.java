package com.bytedance.sdk.openadsdk.core.widget.ouw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.qbp;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {

    /* renamed from: lh, reason: collision with root package name */
    private final WeakReference<Context> f8496lh;
    public boolean ouw = true;
    private final boolean yu = true;
    private final boolean fkw = true;

    /* renamed from: le, reason: collision with root package name */
    private final boolean f8495le = false;
    private final boolean ra = true;
    public boolean vt = true;

    private lh(Context context) {
        this.f8496lh = new WeakReference<>(context);
    }

    public static lh ouw(Context context) {
        return new lh(context);
    }

    public static void vt(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th2) {
            qbp.yu(th2.toString(), new Object[0]);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void ouw(WebView webView) {
        if (webView == null || this.f8496lh.get() == null) {
            return;
        }
        vt(webView);
        WebSettings settings = webView.getSettings();
        ouw(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception e2) {
            qbp.lh("SSWebSettings", e2.getMessage());
        }
        try {
            if (this.ouw) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th2) {
            qbp.lh("SSWebSettings", th2.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.vt) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th3) {
            qbp.lh("SSWebSettings", th3.getMessage());
        }
    }

    private static void ouw(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th2) {
            qbp.yu(th2.toString(), new Object[0]);
        }
    }

    public static void ouw(com.bytedance.sdk.component.bly.le leVar) {
        if (leVar == null) {
            return;
        }
        int iOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("clear_web_cache_new", 0);
        if (iOuw == 0) {
            leVar.ouw(true);
        } else if (iOuw == 1) {
            leVar.ouw(false);
        }
    }
}
