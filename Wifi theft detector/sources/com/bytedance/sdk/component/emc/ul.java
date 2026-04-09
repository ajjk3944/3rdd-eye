package com.bytedance.sdk.component.emc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class ul extends emc {
    static final /* synthetic */ boolean ru = true;
    protected String msw;
    protected WebView zz;

    public void dg() {
        this.zz.removeJavascriptInterface(this.msw);
    }

    @Override // com.bytedance.sdk.component.emc.emc
    public Context emc(zz zzVar) {
        Context context = zzVar.bw;
        if (context != null) {
            return context;
        }
        WebView webView = zzVar.emc;
        if (webView != null) {
            return webView.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // com.bytedance.sdk.component.emc.emc
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void xq() {
        if (!ru && this.zz == null) {
            throw new AssertionError();
        }
        this.zz.addJavascriptInterface(this, this.msw);
    }

    @Override // com.bytedance.sdk.component.emc.emc
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    public void ypw(zz zzVar) {
        this.zz = zzVar.emc;
        this.msw = zzVar.xq;
        if (zzVar.sz) {
            return;
        }
        xq();
    }

    @Override // com.bytedance.sdk.component.emc.emc
    public String emc() {
        return this.zz.getUrl();
    }

    @Override // com.bytedance.sdk.component.emc.emc
    public void ypw() {
        super.ypw();
        dg();
    }

    @Override // com.bytedance.sdk.component.emc.emc
    public void emc(String str, qh qhVar) {
        if (qhVar != null && !TextUtils.isEmpty(qhVar.msw)) {
            String str2 = qhVar.msw;
            emc(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)));
            return;
        }
        super.emc(str, qhVar);
    }

    @Override // com.bytedance.sdk.component.emc.emc
    public void emc(String str) {
        emc(str, "javascript:" + this.msw + "._handleMessageFromToutiao(" + str + ")");
    }

    private void emc(String str, final String str2) {
        if (this.ycc || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.emc.ul.1
            @Override // java.lang.Runnable
            public void run() {
                if (ul.this.ycc) {
                    return;
                }
                try {
                    ul.this.zz.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.dg.post(runnable);
        } else {
            runnable.run();
        }
    }
}
