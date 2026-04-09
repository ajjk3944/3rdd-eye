package com.bytedance.sdk.openadsdk.core.widget.emc;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.dg.sz;
import com.bytedance.sdk.openadsdk.utils.yzg;

/* loaded from: classes.dex */
public class dg extends WebChromeClient {
    private static final String emc = "WebChromeClient";
    private com.bytedance.sdk.openadsdk.common.bw dg;
    private sz xq;
    private final rtt ypw;

    public dg(rtt rttVar) {
        this.ypw = rttVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
        if (!TextUtils.isEmpty(str)) {
            emc(str);
        }
        super.onConsoleMessage(str, i, str2);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        sz szVar = this.xq;
        if (szVar != null) {
            szVar.emc(webView, i);
        }
        com.bytedance.sdk.openadsdk.common.bw bwVar = this.dg;
        if (bwVar != null) {
            bwVar.emc(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    private boolean emc(final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.regionMatches(true, 0, "bytedance:", 0, 10)) {
                qh.xq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.widget.emc.dg.1
                    @Override // java.lang.Runnable
                    public void run() {
                        yzg.emc(Uri.parse(str), dg.this.ypw);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public dg(rtt rttVar, sz szVar, com.bytedance.sdk.openadsdk.common.bw bwVar) {
        this(rttVar, szVar);
        this.dg = bwVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !emc(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    public dg(rtt rttVar, sz szVar) {
        this.ypw = rttVar;
        this.xq = szVar;
    }
}
