package com.bytedance.sdk.openadsdk.core.gbl.xq;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.ypw.gbl;
import com.bytedance.sdk.component.adexpress.ypw.qh;
import com.bytedance.sdk.component.zz.ycc;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.core.widget.emc.bw;
import com.bytedance.sdk.openadsdk.core.zz.cf;
import com.bytedance.sdk.openadsdk.utils.ra;
import com.bytedance.sdk.openadsdk.utils.yzg;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg implements gbl, xq<ycc> {
    private String bw;
    private rtt dg;
    private Context emc;
    private final boolean msw;
    private emc ru;
    private int uym;
    private ycc xq;
    private com.bytedance.sdk.openadsdk.core.gbl.xq.emc ycc;
    private rie ypw;
    private boolean zz = false;

    public interface emc {
        void uym();
    }

    public dg(Context context, rie rieVar, boolean z6) {
        this.uym = 1;
        this.emc = context;
        this.ypw = rieVar;
        this.uym = rieVar.ono();
        this.msw = z6;
        if (z6) {
            this.bw = aa.ypw(this.ypw).emc(this.uym == 1);
        } else {
            this.bw = aa.xq(this.ypw).emc(this.uym == 1);
        }
    }

    private void msw() {
        rtt rttVar = new rtt(this.emc);
        this.dg = rttVar;
        rttVar.ypw(this.xq).emc(this.ypw).xq(this.ypw.ye()).dg(this.ypw.wdp()).bw(this.ypw.drx()).emc(com.bytedance.sdk.openadsdk.core.zz.emc.ypw.emc(0.0f, 0.0f, false, this.ypw, null, null)).emc(this).emc(this.xq);
    }

    private void uym() {
        dg dgVar;
        this.xq.setBackgroundColor(0);
        this.xq.setBackgroundResource(R.color.transparent);
        this.xq.setVisibility(8);
        emc(this.xq);
        if (this.ypw != null) {
            dgVar = this;
            this.xq.setWebViewClient(new bw(this.emc, this.dg, this.ypw.ye(), null, false) { // from class: com.bytedance.sdk.openadsdk.core.gbl.xq.dg.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    if (dg.this.ru != null) {
                        dg.this.ru.uym();
                    }
                }
            });
        } else {
            dgVar = this;
        }
        com.bytedance.sdk.component.adexpress.bw.bw.emc().emc(dgVar.xq, dgVar.dg);
        dgVar.xq.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.emc.dg(dgVar.dg));
    }

    public rtt bw() {
        return this.dg;
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.gbl
    public void emc(qh qhVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.xq.xq
    public void xq() {
        rtt rttVar = this.dg;
        if (rttVar != null) {
            rttVar.xq();
        }
        this.dg = null;
        try {
            ycc yccVar = this.xq;
            if (yccVar != null) {
                ViewGroup viewGroup = (ViewGroup) yccVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.xq);
                }
                this.xq.vk();
            }
        } catch (Throwable unused) {
        }
        if (this.ru != null) {
            this.ru = null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.xq.xq
    /* renamed from: ycc, reason: merged with bridge method [inline-methods] */
    public ycc dg() {
        return this.xq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.xq.xq
    public void ypw() {
        if (TextUtils.isEmpty(this.bw)) {
            this.xq.setVisibility(8);
        } else {
            this.xq.a_(this.bw);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.xq.xq
    public void emc() {
        this.xq = new ycc(this.emc, ycc.xq.EASY_PLAYABLE);
        uym();
        msw();
        if (this.msw) {
            return;
        }
        ra.emc(this.xq, false, this.ypw.blf(), false, new ra.ypw() { // from class: com.bytedance.sdk.openadsdk.core.gbl.xq.dg.1
            @Override // com.bytedance.sdk.openadsdk.utils.ra.ypw
            public void emc(View view, boolean z6) {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ra.ypw
            public void ypw() {
                dg.this.emc(false);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ra.ypw
            public void emc(boolean z6) {
                dg.this.emc(z6);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ra.ypw
            public void emc() {
                dg.this.emc(true);
            }
        }, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.xq.xq
    public void emc(com.bytedance.sdk.openadsdk.core.gbl.xq.emc emcVar) {
        this.ycc = emcVar;
    }

    private void emc(ycc yccVar) {
        if (yccVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.emc.xq.emc(this.emc).emc(false).emc(yccVar.getWebView());
            yccVar.setVerticalScrollBarEnabled(false);
            yccVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.emc.xq.emc(yccVar);
            yccVar.qh();
            yccVar.setUserAgentString(yzg.emc(yccVar.getWebView(), BuildConfig.VERSION_CODE));
            yccVar.setMixedContentMode(0);
            yccVar.setJavaScriptEnabled(true);
            yccVar.setJavaScriptCanOpenWindowsAutomatically(true);
            yccVar.setDomStorageEnabled(true);
            yccVar.setDatabaseEnabled(true);
            yccVar.setAllowFileAccess(false);
            yccVar.setSupportZoom(true);
            yccVar.setBuiltInZoomControls(true);
            yccVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            yccVar.setUseWideViewPort(true);
            yccVar.setCacheMode(-1);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.xq.xq
    public void emc(cf cfVar) {
        rtt rttVar = this.dg;
        if (rttVar != null) {
            rttVar.emc(cfVar);
        }
    }

    public void emc(boolean z6) {
        if (z6 == this.zz) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("visibleState", !z6 ? 1 : 0);
        } catch (Exception e6) {
            e6.getMessage();
        }
        this.dg.emc("visibleStateChange", jSONObject);
        this.zz = z6;
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.gbl
    public void emc(View view, int i, com.bytedance.sdk.component.adexpress.xq xqVar) {
        com.bytedance.sdk.openadsdk.core.gbl.xq.emc emcVar = this.ycc;
        if (emcVar != null) {
            emcVar.emc(view, i, xqVar);
        }
    }

    public void emc(emc emcVar) {
        this.ru = emcVar;
    }
}
