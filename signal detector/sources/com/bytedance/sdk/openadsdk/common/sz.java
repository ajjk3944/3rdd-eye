package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.zz.ycc;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.widget.emc.ycc;

/* loaded from: classes.dex */
public class sz {
    private ImageView bw;
    private com.bytedance.sdk.component.zz.ycc dg;
    private final rie emc;
    private boolean msw;
    private ylm uym;
    private final Context xq;
    private final String ycc;
    private RelativeLayout ypw;

    public sz(Context context, rie rieVar, String str, boolean z6) {
        this.xq = context;
        this.emc = rieVar;
        this.ycc = str;
        this.msw = z6;
        bw();
    }

    private void bw() {
        RelativeLayout relativeLayoutEmc = emc(this.xq, this.msw);
        this.ypw = relativeLayoutEmc;
        this.dg = (com.bytedance.sdk.component.zz.ycc) relativeLayoutEmc.findViewById(com.bytedance.sdk.openadsdk.utils.vk.pxa);
        ylm ylmVar = new ylm(this.xq, (RelativeLayout) this.ypw.findViewById(com.bytedance.sdk.openadsdk.utils.vk.jp), this.emc, this.dg, this.ycc, this.msw);
        this.uym = ylmVar;
        this.bw = ylmVar.xq();
    }

    private static RelativeLayout emc(Context context, boolean z6) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new zz(context));
        ycc.xq xqVar = ycc.xq.LANDING_PAGE;
        new com.bytedance.sdk.component.zz.ycc(context, xqVar);
        com.bytedance.sdk.component.zz.ycc yccVar = z6 ? new com.bytedance.sdk.component.zz.ycc(context, ycc.xq.PRIVACY) : new com.bytedance.sdk.component.zz.ycc(context, xqVar);
        yccVar.setId(com.bytedance.sdk.openadsdk.utils.vk.pxa);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        layoutParams.addRule(3, com.bytedance.sdk.openadsdk.utils.vk.jp);
        if (z6) {
            relativeLayout.addView(yccVar, layoutParams);
        }
        return relativeLayout;
    }

    public View dg() {
        return this.ypw;
    }

    public com.bytedance.sdk.component.zz.ycc xq() {
        return this.dg;
    }

    public void ypw() {
        ylm ylmVar = this.uym;
        if (ylmVar != null) {
            ylmVar.ypw();
        }
    }

    public void ypw(String str) {
        this.uym.ypw(str);
    }

    public void emc() {
        ylm ylmVar = this.uym;
        if (ylmVar != null) {
            ylmVar.emc();
        }
    }

    public void emc(WebView webView, ycc.emc emcVar) {
        ylm ylmVar = this.uym;
        if (ylmVar != null) {
            ylmVar.emc(webView, emcVar);
        }
    }

    public void emc(String str) {
        this.uym.emc(str);
    }

    public void emc(boolean z6) {
        this.uym.emc(z6);
    }
}
