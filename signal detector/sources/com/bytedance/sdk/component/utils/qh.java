package com.bytedance.sdk.component.utils;

import android.annotation.TargetApi;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class qh {
    private static final emc emc = new ypw();

    public static class emc {
        private emc() {
        }

        public void emc(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    @TargetApi(19)
    public static class ypw extends emc {
        private ypw() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.qh.emc
        public void emc(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    return;
                } catch (Throwable th) {
                    boolean z6 = th instanceof IllegalStateException;
                }
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void emc(WebView webView, String str) {
        emc.emc(webView, str);
    }
}
