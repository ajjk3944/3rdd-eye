package com.bytedance.sdk.openadsdk.core.widget.emc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.ul;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class xq {
    private final WeakReference<Context> emc;
    private boolean ypw = true;
    private final boolean xq = true;
    private final boolean dg = true;
    private final boolean bw = false;
    private final boolean ycc = true;
    private boolean uym = true;

    private xq(Context context) {
        this.emc = new WeakReference<>(context);
    }

    public static xq emc(Context context) {
        return new xq(context);
    }

    public xq ypw(boolean z6) {
        this.ypw = z6;
        return this;
    }

    public static void ypw(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            ul.xq(th.toString(), new Object[0]);
        }
    }

    public xq emc(boolean z6) {
        this.uym = z6;
        return this;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void emc(WebView webView) {
        if (webView == null || this.emc.get() == null) {
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
        } catch (Exception e6) {
            ul.xq("SSWebSettings", e6.getMessage());
        }
        try {
            if (this.ypw) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th) {
            ul.xq("SSWebSettings", th.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.uym) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th2) {
            ul.xq("SSWebSettings", th2.getMessage());
        }
    }

    private void emc(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            ul.xq(th.toString(), new Object[0]);
        }
    }

    public static void emc(com.bytedance.sdk.component.zz.ycc yccVar) {
        if (yccVar == null) {
            return;
        }
        int iEmc = com.bytedance.sdk.openadsdk.sra.emc.emc("clear_web_cache_new", 0);
        if (iEmc == 0) {
            yccVar.emc(true);
        } else if (iEmc == 1) {
            yccVar.emc(false);
        }
    }
}
