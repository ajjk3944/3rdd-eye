package com.bytedance.sdk.openadsdk.core.bly;

import a0.g;
import android.R;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.ko;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.fvf;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ex extends com.bytedance.sdk.component.adexpress.fkw.ouw {

    /* renamed from: cf, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.model.vpp f8053cf;
    private final com.bytedance.sdk.component.pno.pno ex;

    /* renamed from: jg, reason: collision with root package name */
    public bs f8054jg;
    private volatile int jqy;
    tlj ko;
    com.bytedance.sdk.openadsdk.yu.yu.fkw mwh;
    private final Map<String, com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh> qbp;
    com.bytedance.sdk.openadsdk.utils.ouw rn;
    JSONObject ryl;
    private final Runnable tc;

    /* renamed from: th, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.yu.mwh f8055th;
    String tlj;
    private String vm;
    private vpp.ouw vpp;
    private Context zih;
    private com.bytedance.sdk.component.adexpress.vt.ra zin;

    public ex(Context context, com.bytedance.sdk.component.adexpress.vt.mwh mwhVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        super(context, mwhVar, themeStatusBroadcastReceiver);
        this.qbp = g.r();
        this.jqy = 0;
        this.ex = new com.bytedance.sdk.component.pno.pno("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.bly.ex.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ex.this.bly.get()) {
                    return;
                }
                ex exVar = ex.this;
                exVar.ryl = exVar.fkw.ouw();
                ex exVar2 = ex.this;
                exVar2.ouw(exVar2.ryl);
                if (ex.this.jqy == 0) {
                    ex.this.bly();
                }
                com.bytedance.sdk.openadsdk.core.jg.lh().post(ex.this.tc);
            }
        };
        this.tc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.ex.2
            @Override // java.lang.Runnable
            public final void run() {
                bs bsVar;
                if (ex.this.bly.get() || ex.this.zin == null) {
                    return;
                }
                ex exVar = ex.this;
                com.bytedance.sdk.component.bly.le leVar = exVar.f7318le;
                if (leVar != null && leVar.getWebView() != null && (bsVar = exVar.f8054jg) != null) {
                    bs bsVarOuw = bsVar.vt(exVar.f7318le).ouw(exVar.f8053cf);
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = exVar.f8053cf;
                    bsVarOuw.f8108lh = vppVar2.pv;
                    bsVarOuw.fkw = vppVar2.yhj;
                    bsVarOuw.f8107le = uoy.ouw(exVar.tlj);
                    bsVarOuw.ra = exVar.f8053cf.hun();
                    bsVarOuw.tlj = exVar;
                    bsVarOuw.ryl = exVar.ryl;
                    bsVarOuw.ouw(exVar.f7318le).zin = exVar.mwh;
                }
                ex exVar2 = ex.this;
                ex.super.ouw(exVar2.zin);
            }
        };
        if (this.f7318le == null) {
            return;
        }
        this.zih = context;
        this.tlj = mwhVar.ouw;
        this.f8053cf = vppVar;
        this.mwh = fkwVar;
        themeStatusBroadcastReceiver.ouw(this);
        bly();
    }

    private void cf() {
        vpp.ouw ouwVar;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f8053cf;
        if (vppVar == null || (ouwVar = vppVar.xn) == null) {
            return;
        }
        this.vpp = ouwVar;
    }

    private void ryl() {
        com.bytedance.sdk.component.bly.le leVar = this.f7318le;
        if (leVar == null || leVar.getWebView() == null) {
            return;
        }
        this.f7318le.setBackgroundColor(0);
        this.f7318le.setBackgroundResource(R.color.transparent);
        ouw(this.f7318le);
        com.bytedance.sdk.component.bly.le leVar2 = this.f7318le;
        if (leVar2 != null) {
            com.bytedance.sdk.openadsdk.yu.mwh mwhVar = new com.bytedance.sdk.openadsdk.yu.mwh(this.f8053cf, leVar2.getWebView());
            mwhVar.jae = false;
            this.f8055th = mwhVar;
        }
        this.f8055th.f8815od = this.mwh;
        tlj tljVar = new tlj(this.zih, this.f8054jg, this.f8053cf, this.f8055th, this.fkw);
        this.ko = tljVar;
        this.f7318le.setWebViewClient(tljVar);
        this.f7318le.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(this.f8054jg, this.f8055th));
        com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().ouw(this.f7318le, this.f8054jg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tlj() {
        com.bytedance.sdk.component.bly.le leVar = this.f7318le;
        if (leVar == null || leVar.getWebView() == null || this.jqy == 2) {
            return;
        }
        this.vm = ouw(this.f8053cf);
        this.f7318le.setDisplayZoomControls(false);
        ouw(fvf.ouw(this.vm));
        cf();
        bs bsVar = new bs(this.zih);
        this.f8054jg = bsVar;
        bsVar.f8109od = true;
        ryl();
        this.jqy = 2;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.ouw
    public final void onThemeChanged(int i4) throws JSONException {
        if (this.f8054jg == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i4);
        } catch (JSONException unused) {
        }
        this.f8054jg.ouw("themeChange", jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bly() {
        if (this.f7318le.getWebView() == null || !com.bytedance.sdk.openadsdk.utils.bs.le()) {
            this.jqy = 1;
            com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.ex.3
                @Override // java.lang.Runnable
                public final void run() {
                    ex.this.tlj();
                }
            });
        } else {
            tlj();
        }
        if (!jg.vt(this.f8053cf) || this.vt) {
            return;
        }
        jg.ouw(this.f8053cf);
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    public final void fkw() {
        bs bsVar = this.f8054jg;
        if (bsVar == null) {
            return;
        }
        bsVar.ouw("expressWebviewRecycle", (JSONObject) null);
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    public final void le() {
        super.le();
        if (this.f8054jg == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.f8054jg.ouw("expressShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    public final void pno() {
        super.pno();
        com.bytedance.sdk.openadsdk.utils.ouw ouwVar = this.rn;
        if (ouwVar != null) {
            ouwVar.fkw.remove(new WeakReference(this));
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    public final void ra() {
        super.ra();
        com.bytedance.sdk.openadsdk.utils.ouw ouwVar = ko.ouw.ouw.ouw;
        this.rn = ouwVar;
        ouwVar.ouw(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw, com.bytedance.sdk.component.adexpress.vt.yu
    public final int vt() {
        return this.f8053cf.kfa;
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    public final void yu() {
        if (this.bly.get()) {
            return;
        }
        super.yu();
        bs bsVar = this.f8054jg;
        if (bsVar != null) {
            bsVar.ouw();
            this.f8054jg.lh();
            this.f8054jg = null;
        }
        com.bytedance.sdk.openadsdk.yu.mwh mwhVar = this.f8055th;
        if (mwhVar != null) {
            mwhVar.ouw(false);
        }
        com.bytedance.sdk.openadsdk.core.jg.lh().removeCallbacks(this.tc);
        this.qbp.clear();
    }

    private static String ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        return com.bytedance.sdk.component.adexpress.ouw.vt.vt.yu((vppVar == null || !vppVar.th()) ? null : "v3");
    }

    public static boolean vt(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw, com.bytedance.sdk.component.adexpress.vt.yu
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.ra raVar) {
        this.zin = raVar;
        com.bytedance.sdk.openadsdk.utils.bs.vt(this.ex);
    }

    private void ouw(com.bytedance.sdk.component.bly.le leVar) {
        if (leVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(this.zih);
            lhVarOuw.vt = false;
            lhVarOuw.ouw(leVar.getWebView());
            leVar.setVerticalScrollBarEnabled(false);
            leVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(leVar);
            leVar.ra();
            leVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.th.ouw(leVar.getWebView()));
            leVar.setMixedContentMode(0);
            leVar.setJavaScriptEnabled(true);
            leVar.setJavaScriptCanOpenWindowsAutomatically(true);
            leVar.setDomStorageEnabled(true);
            leVar.setDatabaseEnabled(true);
            leVar.setAllowFileAccess(false);
            leVar.setSupportZoom(true);
            leVar.setBuiltInZoomControls(true);
            leVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            leVar.setUseWideViewPort(true);
            leVar.setCacheMode(-1);
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.WebViewRender", e2.toString());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    /* renamed from: ouw */
    public final com.bytedance.sdk.component.bly.le lh() {
        return this.f7318le;
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    public final void ouw(int i4) {
        if (i4 == this.pno) {
            return;
        }
        this.pno = i4;
        boolean z3 = i4 == 0;
        if (this.f8054jg == null || this.f7318le == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adVisible", z3);
            this.f8054jg.ouw("expressAdShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw, com.bytedance.sdk.component.adexpress.vt.cf
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
        super.ouw(jgVar);
        if (this.f7319lh) {
            com.bytedance.sdk.component.utils.bly.vt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.ex.4
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.component.utils.ko.vt("TTAD.WebViewRender", "resumeTimers..........");
                    WebView webView = ex.this.f7318le.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, 2000L);
        }
    }
}
