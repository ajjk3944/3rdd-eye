package com.bytedance.sdk.openadsdk.ryl;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.fkw.fkw;
import com.bytedance.sdk.component.adexpress.fkw.yu;
import com.bytedance.sdk.component.ouw.qbp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends qbp {
    @Override // com.bytedance.sdk.component.ouw.qbp
    public final void lh() {
        if (this.bly != null) {
            fkw fkwVarOuw = fkw.ouw();
            WebView webView = this.bly;
            String str = ((qbp) this).pno;
            if (webView == null || TextUtils.isEmpty(str)) {
                return;
            }
            yu yuVar = fkwVarOuw.ouw.get(Integer.valueOf(webView.hashCode()));
            if (yuVar != null) {
                yuVar.ouw(this);
            } else {
                yuVar = new yu(this);
                fkwVarOuw.ouw.put(Integer.valueOf(webView.hashCode()), yuVar);
            }
            webView.addJavascriptInterface(yuVar, str);
        }
    }

    @Override // com.bytedance.sdk.component.ouw.qbp
    public final void yu() {
        fkw fkwVarOuw = fkw.ouw();
        WebView webView = this.bly;
        String str = ((qbp) this).pno;
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        yu yuVar = fkwVarOuw.ouw.get(Integer.valueOf(webView.hashCode()));
        if (yuVar != null) {
            yuVar.ouw(null);
        }
        webView.removeJavascriptInterface(str);
    }
}
