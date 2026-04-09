package com.bytedance.sdk.openadsdk.core.cf.lh;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.vt.cf;
import com.bytedance.sdk.component.adexpress.vt.jg;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.rn;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.ouw.fkw;
import com.bytedance.sdk.openadsdk.utils.ey;
import com.bytedance.sdk.openadsdk.utils.th;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu implements cf, lh<le> {
    private final boolean bly;
    private le fkw;

    /* renamed from: le, reason: collision with root package name */
    private String f8142le;

    /* renamed from: lh, reason: collision with root package name */
    private Context f8143lh;
    public bs ouw;
    private int pno;
    private com.bytedance.sdk.openadsdk.core.cf.lh.ouw ra;
    private boolean tlj = false;
    public ouw vt;
    private vpp yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void pno();
    }

    public yu(Context context, vpp vppVar, boolean z3) {
        rn rnVar;
        rn rnVar2;
        this.pno = 1;
        this.f8143lh = context;
        this.yu = vppVar;
        int iJqy = vppVar.jqy();
        this.pno = iJqy;
        this.bly = z3;
        rn.ouw ouwVar = null;
        if (z3) {
            vpp vppVar2 = this.yu;
            if (vppVar2 != null && (rnVar2 = vppVar2.f8289ak) != null) {
                ouwVar = rnVar2.vt;
            }
            this.f8142le = ouwVar.ouw(iJqy == 1);
            return;
        }
        vpp vppVar3 = this.yu;
        if (vppVar3 != null && (rnVar = vppVar3.f8289ak) != null) {
            ouwVar = rnVar.ouw;
        }
        this.f8142le = ouwVar.ouw(iJqy == 1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.lh.lh
    public final void lh() {
        bs bsVar = this.ouw;
        if (bsVar != null) {
            bsVar.ouw();
        }
        this.ouw = null;
        try {
            le leVar = this.fkw;
            if (leVar != null) {
                ViewGroup viewGroup = (ViewGroup) leVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.fkw);
                }
                this.fkw.bly();
            }
        } catch (Throwable unused) {
        }
        if (this.vt != null) {
            this.vt = null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.cf
    public final void ouw(jg jgVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.lh.lh
    public final void vt() {
        if (TextUtils.isEmpty(this.f8142le)) {
            this.fkw.setVisibility(8);
        } else {
            this.fkw.a_(this.f8142le);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.lh.lh
    public final /* bridge */ /* synthetic */ View yu() {
        return this.fkw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.lh.lh
    public final void ouw() {
        yu yuVar;
        le leVar = new le(this.f8143lh, le.lh.EASY_PLAYABLE);
        this.fkw = leVar;
        leVar.setBackgroundColor(0);
        this.fkw.setBackgroundResource(R.color.transparent);
        this.fkw.setVisibility(8);
        le leVar2 = this.fkw;
        if (leVar2 != null) {
            try {
                com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(this.f8143lh);
                lhVarOuw.vt = false;
                lhVarOuw.ouw(leVar2.getWebView());
                leVar2.setVerticalScrollBarEnabled(false);
                leVar2.setHorizontalScrollBarEnabled(false);
                com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(leVar2);
                leVar2.ra();
                leVar2.setUserAgentString(th.ouw(leVar2.getWebView()));
                leVar2.setMixedContentMode(0);
                leVar2.setJavaScriptEnabled(true);
                leVar2.setJavaScriptCanOpenWindowsAutomatically(true);
                leVar2.setDomStorageEnabled(true);
                leVar2.setDatabaseEnabled(true);
                leVar2.setAllowFileAccess(false);
                leVar2.setSupportZoom(true);
                leVar2.setBuiltInZoomControls(true);
                leVar2.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
                leVar2.setUseWideViewPort(true);
                leVar2.setCacheMode(-1);
            } catch (Exception e2) {
                ko.fkw("EasyPlayableRender", e2.toString());
            }
        }
        if (this.yu != null) {
            yuVar = this;
            this.fkw.setWebViewClient(new fkw(this.f8143lh, this.ouw, this.yu.pv, null) { // from class: com.bytedance.sdk.openadsdk.core.cf.lh.yu.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    if (yu.this.vt != null) {
                        yu.this.vt.pno();
                    }
                }
            });
        } else {
            yuVar = this;
        }
        com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().ouw(yuVar.fkw, yuVar.ouw);
        yuVar.fkw.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(yuVar.ouw));
        bs bsVar = new bs(yuVar.f8143lh);
        yuVar.ouw = bsVar;
        bs bsVarOuw = bsVar.vt(yuVar.fkw).ouw(yuVar.yu);
        vpp vppVar = yuVar.yu;
        bsVarOuw.f8108lh = vppVar.pv;
        bsVarOuw.fkw = vppVar.yhj;
        bsVarOuw.ra = vppVar.hun();
        bsVarOuw.ryl = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(0.0f, 0.0f, false, yuVar.yu, null, null);
        bsVarOuw.tlj = yuVar;
        bsVarOuw.ouw(yuVar.fkw);
        if (yuVar.bly) {
            return;
        }
        ey.ouw(yuVar.fkw, false, yuVar.yu.lna, false, new ey.vt() { // from class: com.bytedance.sdk.openadsdk.core.cf.lh.yu.1
            @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
            public final void ouw(View view, boolean z3) {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
            public final void vt() throws JSONException {
                yu.this.ouw(false);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
            public final void ouw(boolean z3) throws JSONException {
                yu.this.ouw(z3);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
            public final void ouw() throws JSONException {
                yu.this.ouw(true);
            }
        }, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.lh.lh
    public final void ouw(com.bytedance.sdk.openadsdk.core.cf.lh.ouw ouwVar) {
        this.ra = ouwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.lh.lh
    public final void ouw(com.bytedance.sdk.openadsdk.core.bly.ko koVar) {
        bs bsVar = this.ouw;
        if (bsVar != null) {
            bsVar.f8104cf = koVar;
        }
    }

    public final void ouw(boolean z3) throws JSONException {
        if (z3 == this.tlj) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("visibleState", !z3 ? 1 : 0);
        } catch (Exception e2) {
            ko.fkw("EasyPlayableRender", e2.getMessage());
        }
        this.ouw.ouw("visibleStateChange", jSONObject);
        this.tlj = z3;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.cf
    public final void ouw(View view, int i4, com.bytedance.sdk.component.adexpress.lh lhVar) {
        com.bytedance.sdk.openadsdk.core.cf.lh.ouw ouwVar = this.ra;
        if (ouwVar != null) {
            ouwVar.ouw(view, i4, lhVar);
        }
    }
}
