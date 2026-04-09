package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class yzg {
    public static void emc(Uri uri, com.bytedance.sdk.openadsdk.core.rtt rttVar) {
        if (rttVar == null || !rttVar.emc(uri)) {
            return;
        }
        try {
            rttVar.ypw(uri);
        } catch (Exception e10) {
            e10.toString();
        }
    }

    public static String emc(WebView webView, int i10) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return userAgentString + " open_news open_news_u_s/" + i10;
    }
}
