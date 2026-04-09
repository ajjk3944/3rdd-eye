package com.bytedance.sdk.openadsdk.core.widget.emc;

import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.component.zz.ycc;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.utils.yzg;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ypw implements emc {
    private final boolean bw;
    private final MessageQueue dg;
    rtt emc;
    private final AtomicInteger xq;
    private com.bytedance.sdk.component.zz.ycc ypw;

    public ypw(int i, boolean z6, MessageQueue messageQueue) {
        this.xq = new AtomicInteger(i);
        this.bw = z6;
        this.dg = messageQueue;
    }

    private void emc(com.bytedance.sdk.component.zz.ycc yccVar) {
        if (yccVar == null || yccVar.getWebView() == null) {
            return;
        }
        try {
            xq.emc(aa.emc()).emc(false).emc(yccVar.getWebView());
            yccVar.setVerticalScrollBarEnabled(false);
            yccVar.setHorizontalScrollBarEnabled(false);
            xq.emc(yccVar);
            yccVar.qh();
            yccVar.setUserAgentString(yzg.emc(yccVar.getWebView(), BuildConfig.VERSION_CODE));
            yccVar.setMixedContentMode(0);
            yccVar.setJavaScriptEnabled(true);
            yccVar.setJavaScriptCanOpenWindowsAutomatically(true);
            yccVar.setDomStorageEnabled(true);
            yccVar.setDatabaseEnabled(true);
            yccVar.setCacheMode(-1);
            yccVar.setAllowFileAccess(false);
            yccVar.setSupportZoom(true);
            yccVar.setBuiltInZoomControls(true);
            yccVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            yccVar.setUseWideViewPort(true);
        } catch (Throwable th) {
            ul.xq("WebViewPool", th.toString());
        }
    }

    public void ypw() {
        if (this.xq.get() <= 0) {
            return;
        }
        Objects.toString(this.xq);
        String strDg = com.bytedance.sdk.component.adexpress.emc.ypw.ypw.dg(null);
        if (this.bw) {
            String strDg2 = com.bytedance.sdk.component.adexpress.emc.ypw.ypw.dg("v3");
            if (strDg != null && strDg.equals(strDg2)) {
                return;
            } else {
                strDg = strDg2;
            }
        }
        if (TextUtils.isEmpty(strDg)) {
            return;
        }
        try {
            com.bytedance.sdk.component.zz.ycc yccVar = new com.bytedance.sdk.component.zz.ycc(new MutableContextWrapper(aa.emc()), this.bw ? ycc.xq.ADS_V3 : ycc.xq.ADS);
            this.ypw = yccVar;
            if (yccVar.getWebView() == null) {
                return;
            }
            this.ypw.setWebViewClient(new WebViewClient() { // from class: com.bytedance.sdk.openadsdk.core.widget.emc.ypw.1
                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    return true;
                }
            });
            emc(this.ypw);
            Uri uriBuild = Uri.parse(strDg).buildUpon().appendQueryParameter("isPreLoad", "1").build();
            rtt rttVar = new rtt(this.ypw.getContext());
            this.emc = rttVar;
            rttVar.ypw(this.ypw).emc(this).emc(this.ypw);
            com.bytedance.sdk.component.adexpress.bw.bw.emc().emc(this.ypw, this.emc);
            this.ypw.a_(uriBuild.toString());
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.emc.emc
    public void emc() {
        MessageQueue messageQueue;
        if (this.bw) {
            com.bytedance.sdk.component.adexpress.bw.bw.emc().ypw(this.ypw);
        } else {
            com.bytedance.sdk.component.adexpress.bw.bw.emc().xq(this.ypw);
        }
        try {
            this.xq.get();
            this.xq.decrementAndGet();
            if (this.xq.get() <= 0 || (messageQueue = this.dg) == null) {
                return;
            }
            messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.widget.emc.ypw.2
                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    new ypw(ypw.this.xq.get(), ypw.this.bw, ypw.this.dg).ypw();
                    return false;
                }
            });
        } catch (Exception e6) {
            e6.getMessage();
        }
    }
}
