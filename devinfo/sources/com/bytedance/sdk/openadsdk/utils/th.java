package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class th {
    public static void ouw(Uri uri, com.bytedance.sdk.openadsdk.core.bs bsVar) {
        if (bsVar == null || !com.bytedance.sdk.openadsdk.core.bs.ouw(uri)) {
            return;
        }
        try {
            bsVar.vt(uri);
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.ko.yu("WebView", "TTAndroidObj handleUri exception: ".concat(String.valueOf(e2)));
        }
    }

    public static String ouw(WebView webView) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return u.t(userAgentString, " open_news open_news_u_s/7808");
    }
}
