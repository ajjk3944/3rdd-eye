package com.bytedance.sdk.openadsdk.core.zz;

import android.R;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.mkp;
import com.bytedance.sdk.openadsdk.utils.tp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class hxp extends com.bytedance.sdk.component.adexpress.bw.emc {

    /* renamed from: aa, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.ypw.uym f9308aa;
    private final Map<String, com.bytedance.sdk.openadsdk.ul.emc.emc.xq> cf;
    private JSONObject gbl;
    private Context msw;
    private com.bytedance.sdk.openadsdk.dg.sz qh;
    private com.bytedance.sdk.openadsdk.core.model.rie ru;
    private rie.emc sba;
    private final Runnable sra;
    private com.bytedance.sdk.openadsdk.dg.dg.bw sup;
    private String sz;
    private ru ul;
    com.bytedance.sdk.openadsdk.utils.emc uym;
    private rtt vk;
    private final com.bytedance.sdk.component.msw.msw ylm;
    private volatile int yzg;
    private String zz;

    public hxp(Context context, com.bytedance.sdk.component.adexpress.ypw.sz szVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.openadsdk.dg.dg.bw bwVar, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        super(context, szVar, themeStatusBroadcastReceiver);
        this.cf = Collections.synchronizedMap(new HashMap());
        this.yzg = 0;
        this.ylm = new com.bytedance.sdk.component.msw.msw("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.zz.hxp.1
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.bw.emc) hxp.this).ycc.get()) {
                    return;
                }
                hxp hxpVar = hxp.this;
                hxpVar.gbl = hxpVar.gbl().xq();
                hxp hxpVar2 = hxp.this;
                hxpVar2.emc(hxpVar2.gbl);
                if (hxp.this.yzg == 0) {
                    hxp.this.aa();
                }
                com.bytedance.sdk.openadsdk.core.qh.xq().post(hxp.this.sra);
            }
        };
        this.sra = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.hxp.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.bw.emc) hxp.this).ycc.get() || hxp.this.f9308aa == null) {
                    return;
                }
                hxp.this.sup();
                hxp hxpVar = hxp.this;
                hxp.super.emc(hxpVar.f9308aa);
            }
        };
        if (this.dg == null) {
            return;
        }
        this.msw = context;
        this.zz = szVar.dg();
        this.ru = rieVar;
        this.sup = bwVar;
        themeStatusBroadcastReceiver.emc(this);
        aa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() {
        if (this.dg.getWebView() == null || !iyl.ycc()) {
            this.yzg = 1;
            iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.hxp.3
                @Override // java.lang.Runnable
                public void run() {
                    hxp.this.sba();
                }
            });
        } else {
            sba();
        }
        if (!qh.ypw(this.ru) || this.ypw) {
            return;
        }
        qh.emc(this.ru);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sba() {
        com.bytedance.sdk.component.zz.ycc yccVar = this.dg;
        if (yccVar == null || yccVar.getWebView() == null || this.yzg == 2) {
            return;
        }
        this.sz = emc(this.ru);
        this.dg.setDisplayZoomControls(false);
        emc(mkp.emc(this.sz));
        sz();
        rtt rttVar = new rtt(this.msw);
        this.vk = rttVar;
        rttVar.xq(true);
        qh();
        this.yzg = 2;
    }

    public ru cf() {
        return this.ul;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.emc
    public void onThemeChanged(int i10) throws JSONException {
        if (this.vk == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, i10);
        } catch (JSONException unused) {
        }
        this.vk.emc("themeChange", jSONObject);
    }

    public void qh() {
        com.bytedance.sdk.component.zz.ycc yccVar = this.dg;
        if (yccVar == null || yccVar.getWebView() == null) {
            return;
        }
        this.dg.setBackgroundColor(0);
        this.dg.setBackgroundResource(R.color.transparent);
        emc(this.dg);
        if (emc() != null) {
            this.qh = new com.bytedance.sdk.openadsdk.dg.sz(this.ru, emc().getWebView()).ypw(false);
        }
        this.qh.emc(this.sup);
        ru ruVar = new ru(this.msw, this.vk, this.ru, this.qh, gbl());
        this.ul = ruVar;
        this.dg.setWebViewClient(ruVar);
        this.dg.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.emc.dg(this.vk, this.qh));
        com.bytedance.sdk.component.adexpress.bw.bw.emc().emc(this.dg, this.vk);
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.emc
    public void ru() {
        super.ru();
        com.bytedance.sdk.openadsdk.utils.emc emcVar = this.uym;
        if (emcVar != null) {
            emcVar.ypw(this);
        }
    }

    public void sup() {
        rtt rttVar;
        com.bytedance.sdk.component.zz.ycc yccVar = this.dg;
        if (yccVar == null || yccVar.getWebView() == null || (rttVar = this.vk) == null) {
            return;
        }
        rttVar.ypw(this.dg).emc(this.ru).xq(this.ru.ye()).dg(this.ru.wdp()).ypw(tp.emc(this.zz)).bw(this.ru.drx()).emc(this).emc(this.gbl).emc(this.dg).emc(this.sup);
    }

    public void sz() {
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.ru;
        if (rieVar == null || rieVar.zhk() == null) {
            return;
        }
        this.sba = this.ru.zhk();
    }

    public rtt vk() {
        return this.vk;
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.emc
    public void dg() {
        if (this.ycc.get()) {
            return;
        }
        super.dg();
        rtt rttVar = this.vk;
        if (rttVar != null) {
            rttVar.xq();
            this.vk.sup();
            this.vk = null;
        }
        com.bytedance.sdk.openadsdk.dg.sz szVar = this.qh;
        if (szVar != null) {
            szVar.dg(false);
        }
        com.bytedance.sdk.openadsdk.core.qh.xq().removeCallbacks(this.sra);
        this.cf.clear();
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.emc
    public void msw() throws JSONException {
        super.msw();
        if (this.vk == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.vk.emc("expressShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.emc
    public void uym() {
        rtt rttVar = this.vk;
        if (rttVar == null) {
            return;
        }
        rttVar.emc("expressWebviewRecycle", (JSONObject) null);
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.emc, com.bytedance.sdk.component.adexpress.ypw.dg
    public int xq() {
        return this.ru.ej();
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.emc
    public void ycc() {
        if (emc() == null) {
            return;
        }
        try {
            emc().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    public void ypw(int i10) {
        if (this.vk == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("zoom_type", i10);
            this.vk.emc("expressAdViewWillZoom", jSONObject);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.WebViewRender", e10.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.emc
    public void zz() {
        super.zz();
        com.bytedance.sdk.openadsdk.utils.emc emcVarBw = com.bytedance.sdk.openadsdk.core.cf.emc().bw();
        this.uym = emcVarBw;
        emcVarBw.emc(this);
    }

    public static String emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        return com.bytedance.sdk.component.adexpress.emc.ypw.ypw.dg((rieVar == null || !rieVar.dor()) ? null : "v3");
    }

    private void ypw(boolean z10) throws JSONException {
        if (this.vk == null || this.dg == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adVisible", z10);
            this.vk.emc("expressAdShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.emc, com.bytedance.sdk.component.adexpress.ypw.dg
    public void emc(com.bytedance.sdk.component.adexpress.ypw.uym uymVar) {
        this.f9308aa = uymVar;
        iyl.ypw(this.ylm);
    }

    private void emc(com.bytedance.sdk.component.zz.ycc yccVar) {
        if (yccVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.emc.xq.emc(this.msw).emc(false).emc(yccVar.getWebView());
            yccVar.setVerticalScrollBarEnabled(false);
            yccVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.emc.xq.emc(yccVar);
            yccVar.qh();
            yccVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.yzg.emc(yccVar.getWebView(), BuildConfig.VERSION_CODE));
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
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.WebViewRender", e10.toString());
        }
    }

    public static boolean ypw(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.emc
    public com.bytedance.sdk.component.zz.ycc emc() {
        return this.dg;
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.emc
    public void emc(int i10) {
        if (i10 == this.bw) {
            return;
        }
        this.bw = i10;
        ypw(i10 == 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.emc, com.bytedance.sdk.component.adexpress.ypw.gbl
    public void emc(com.bytedance.sdk.component.adexpress.ypw.qh qhVar) {
        super.emc(qhVar);
        if (this.xq) {
            com.bytedance.sdk.component.utils.zz.ypw().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.hxp.4
                @Override // java.lang.Runnable
                public void run() {
                    WebView webView = ((com.bytedance.sdk.component.adexpress.bw.emc) hxp.this).dg.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, 2000L);
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar) {
        rtt rttVar = this.vk;
        if (rttVar != null) {
            rttVar.emc(ypwVar);
        }
    }
}
