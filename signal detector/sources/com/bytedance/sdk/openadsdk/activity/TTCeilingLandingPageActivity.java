package com.bytedance.sdk.openadsdk.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.dr;
import com.bytedance.sdk.component.zz.ycc;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.yzg;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.core.sf;
import com.bytedance.sdk.openadsdk.core.widget.emc.ycc;
import com.bytedance.sdk.openadsdk.dg.sz;
import com.bytedance.sdk.openadsdk.utils.sra;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class TTCeilingLandingPageActivity extends TTBaseLandingPageActivity {
    private String bw;
    private String dg;
    emc emc;
    private com.bytedance.sdk.openadsdk.common.bw gbl;
    private sz msw;
    private com.bytedance.sdk.component.zz.ycc sup;
    private String uym;
    private rtt xq;
    private int ycc;
    private rie ypw;

    public interface emc {
        void emc();
    }

    private void xq() {
        rtt rttVar = new rtt(this);
        this.xq = rttVar;
        rttVar.ypw(this.sup).xq(this.dg).dg(this.bw).emc(this.ypw).ypw(this.ycc).emc(this.ypw.nx()).bw(this.ypw.drx()).emc(this.sup).ypw("landingpage_split_ceiling");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!qh.bw()) {
            finish();
            return;
        }
        Intent intent = getIntent();
        this.ycc = intent.getIntExtra("source", -1);
        rie rieVarEmc = sf.emc().emc(sf.emc(intent));
        this.ypw = rieVarEmc;
        if (rieVarEmc == null) {
            finish();
            return;
        }
        this.uym = rieVarEmc.gbl();
        this.dg = this.ypw.ye();
        this.bw = this.ypw.wdp();
        this.ycc = this.ypw.vaf().getDurationSlotType() != 7 ? 5 : 7;
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = new com.bytedance.sdk.openadsdk.core.ycc.xq(this);
        emc(this, xqVar);
        setContentView(xqVar);
        xq();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.component.zz.ycc yccVar = this.sup;
        if (yccVar != null) {
            dr.emc(yccVar);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        sz szVar = this.msw;
        if (szVar != null) {
            szVar.msw();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void emc(Context context, FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar;
        this.sup = new com.bytedance.sdk.component.zz.ycc(context, ycc.xq.LANDING_PAGE);
        frameLayout.addView(this.sup, new FrameLayout.LayoutParams(-1, -1));
        View viewYpw = com.bytedance.sdk.openadsdk.core.widget.ycc.ypw(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = vw.ypw(context, 18.0f);
        layoutParams.rightMargin = vw.ypw(context, 18.0f);
        frameLayout.addView(viewYpw, layoutParams);
        final int iUym = this.ypw.db().uym();
        if (iUym != 3) {
            dgVar = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(vw.ypw(context, 28.0f), vw.ypw(context, 28.0f));
            layoutParams2.gravity = 8388659;
            layoutParams2.topMargin = vw.ypw(context, 18.0f);
            layoutParams2.leftMargin = vw.ypw(context, 18.0f);
            int iYpw = vw.ypw(context, 5.0f);
            dgVar.setPadding(iYpw, iYpw, iYpw, iYpw);
            dgVar.setScaleType(ImageView.ScaleType.FIT_XY);
            dgVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.dg.emc());
            dgVar.setImageDrawable(com.bytedance.sdk.component.utils.rie.xq(context, "tt_white_lefterbackicon_titlebar"));
            frameLayout.addView(dgVar, layoutParams2);
        } else {
            dgVar = null;
        }
        sra.emc(this.sup, this.uym);
        final WebView webView = this.sup.getWebView();
        viewYpw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTCeilingLandingPageActivity.this.finish();
            }
        });
        sz szVar = new sz(this.ypw, webView, true);
        this.msw = szVar;
        szVar.emc("landingpage_split_ceiling");
        final ycc.emc emcVar = this.msw.emc;
        if (dgVar != null) {
            dgVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int i = iUym;
                    if (i == 1) {
                        TTCeilingLandingPageActivity.this.finish();
                    } else if (i != 2) {
                        return;
                    }
                    WebView webView2 = webView;
                    if (webView2 == null || !webView2.canGoBack()) {
                        TTCeilingLandingPageActivity.this.finish();
                        return;
                    }
                    webView.goBack();
                    ycc.emc emcVar2 = emcVar;
                    if (emcVar2 != null) {
                        emcVar2.emc();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.common.bw bwVarEmc = tp.emc(this.ypw, this.sup, this, "landingpage_split_ceiling");
        this.gbl = bwVarEmc;
        if (bwVarEmc != null) {
            bwVarEmc.emc("landingpage_split_ceiling");
            this.gbl.emc();
        }
        tp.emc(this.ypw, this.sup, true);
        this.emc = new emc() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.emc
            public void emc() {
                if (TTCeilingLandingPageActivity.this.ypw.db().msw() == yzg.ypw) {
                    TTCeilingLandingPageActivity.this.finish();
                }
            }
        };
        com.bytedance.sdk.openadsdk.core.widget.emc.bw bwVar = new com.bytedance.sdk.openadsdk.core.widget.emc.bw(this, this.xq, this.dg, this.gbl, this.msw, true, true, this.emc) { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
            }
        };
        bwVar.emc(this.ypw);
        com.bytedance.sdk.openadsdk.core.widget.emc.dg dgVar2 = new com.bytedance.sdk.openadsdk.core.widget.emc.dg(this.xq, this.msw, this.gbl) { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.dg, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView2, int i) {
                super.onProgressChanged(webView2, i);
            }
        };
        com.bytedance.sdk.component.zz.ycc yccVar = this.sup;
        if (yccVar != null) {
            yccVar.setWebViewClient(bwVar);
            this.sup.setWebChromeClient(dgVar2);
        }
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.6
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (TTCeilingLandingPageActivity.this.msw == null) {
                        return false;
                    }
                    TTCeilingLandingPageActivity.this.msw.emc(motionEvent);
                    return false;
                }
            });
            webView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.7
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i3, int i6, int i7) {
                    if (TTCeilingLandingPageActivity.this.msw != null) {
                        TTCeilingLandingPageActivity.this.msw.ypw(i3);
                    }
                }
            });
        }
    }
}
