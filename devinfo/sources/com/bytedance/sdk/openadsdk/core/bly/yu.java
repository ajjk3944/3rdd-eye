package com.bytedance.sdk.openadsdk.core.bly;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class yu {

    /* renamed from: lh, reason: collision with root package name */
    private static volatile yu f8099lh;
    private static int vt;
    final List<fkw> ouw = new ArrayList();

    private void lh(fkw fkwVar) {
        if (fkwVar != null) {
            if (this.ouw.size() >= vt) {
                fkwVar.bly();
            } else {
                if (this.ouw.contains(fkwVar)) {
                    return;
                }
                vt(fkwVar);
                this.ouw.add(fkwVar);
            }
        }
    }

    public static yu ouw() {
        if (f8099lh == null) {
            synchronized (yu.class) {
                try {
                    if (f8099lh == null) {
                        f8099lh = new yu();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f8099lh;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static void vt(fkw fkwVar) {
        if (fkwVar == null || fkwVar.getWebView() == null) {
            return;
        }
        if (fkwVar.getParent() != null) {
            ((ViewGroup) fkwVar.getParent()).removeView(fkwVar);
        }
        try {
            fkwVar.removeAllViews();
            fkwVar.vt();
            fkwVar.setWebChromeClient(null);
            fkwVar.setWebViewClient(null);
            fkwVar.setDownloadListener(null);
            fkwVar.setDefaultTextEncodingName("UTF-8");
            fkwVar.setAllowFileAccess(false);
            fkwVar.setJavaScriptEnabled(true);
            fkwVar.setCacheMode(-1);
            fkwVar.setDatabaseEnabled(true);
            fkwVar.setSupportZoom(false);
            fkwVar.getWebView().setLayerType(0, null);
            fkwVar.setBackgroundColor(0);
            fkwVar.getWebView().setHorizontalScrollBarEnabled(false);
            fkwVar.getWebView().setHorizontalScrollbarOverlay(false);
            fkwVar.getWebView().setVerticalScrollBarEnabled(false);
            fkwVar.getWebView().setVerticalScrollbarOverlay(false);
            com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(fkwVar);
            fkwVar.ra();
            fkwVar.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }

    public final void ouw(fkw fkwVar) {
        if (fkwVar != null) {
            lh(fkwVar);
        }
    }
}
